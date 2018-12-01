package main.zzy.com.study_01;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import main.zzy.com.study_01.Base.BaseMainActivity;
import main.zzy.com.study_01.module.entry.AttentionPeopleFragment;
import main.zzy.com.study_01.module.entry.ConsumeHistoryFragment;
import main.zzy.com.study_01.module.entry.HistoryFragment;
import main.zzy.com.study_01.module.entry.IFavoritesFragment;
import main.zzy.com.study_01.module.entry.SettingFragment;
import main.zzy.com.study_01.module.entry.VipActivity;
import main.zzy.com.study_01.module.home.HomePageFragment;
import main.zzy.com.study_01.utils.ConstantUtil;
import main.zzy.com.study_01.utils.PreferenceUtil;
import main.zzy.com.study_01.widget.CircleImageView;

/**
 * 初始化drawerLayout
 */
public class MainActivity extends BaseMainActivity implements NavigationView.OnNavigationItemSelectedListener{

 private Fragment[]fragments;
 private HomePageFragment mHomePageFragment;
 private int currentTabIndex;
    private int index;
    private long exitTime;
   private ImageView mSwitchMode;
  @BindView(R.id.NavigationView)
   NavigationView mNavigationView;

    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @Override
    public void initViews(Bundle savedInstanceState) {
        //初始化fragment
        initFragment();
        initNavigationView();
    }

    private void initNavigationView() {
        mNavigationView.setNavigationItemSelectedListener(this);
        View headerView = mNavigationView.getHeaderView(0);
        CircleImageView mUserAvatarView = (CircleImageView) headerView.findViewById(R.id.user_avatar_view);
        TextView mUserName = (TextView) headerView.findViewById(R.id.user_name);
        TextView mUserSign = (TextView) headerView.findViewById(R.id.user_other_info);
         mSwitchMode = (ImageView) headerView.findViewById(R.id.iv_head_switch_mode);
        //设置头像
        mUserAvatarView.setImageResource(R.drawable.ic_hotbitmapgg_avatar);
        //设置用户名 签名
        mUserName.setText(getResources().getText(R.string.home_textName));
        mUserSign.setText(getResources().getText(R.string.app_name));
        boolean flag = PreferenceUtil.getBoolean(ConstantUtil.SWITCH_MODE_KEY, false);
        if (flag) {
            mSwitchMode.setImageResource(R.drawable.ic_switch_daily);
        } else {
            mSwitchMode.setImageResource(R.drawable.ic_switch_night);
        }
        mSwitchMode.setOnClickListener(v -> switchMode());
    }

    /**
     * 切换是否夜间模式
     */
    private void switchMode() {
      boolean isNight=PreferenceUtil.getBoolean(ConstantUtil.SWITCH_MODE_KEY,false);
        if (isNight){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            PreferenceUtil.putBoolean(ConstantUtil.SWITCH_MODE_KEY, false);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            PreferenceUtil.putBoolean(ConstantUtil.SWITCH_MODE_KEY, true);
        }
        /*recreate();*/
        startActivity(new Intent(this,MainActivity.class));
        overridePendingTransition(R.anim.start_anim,R.anim.out_anim);
        finish();
    }

    private void initFragment() {
        mHomePageFragment=HomePageFragment.newInstance();
        IFavoritesFragment mFavoritesFragment =IFavoritesFragment.newInstance();
        HistoryFragment mHistoryFragment=HistoryFragment.newInstance();
        AttentionPeopleFragment mAttentionPeopleFragment=AttentionPeopleFragment.newInstance();
        ConsumeHistoryFragment mConsumeHistoryFragment=ConsumeHistoryFragment.newInstance();
        SettingFragment mSettingFragment=SettingFragment.newInstance();
        fragments=new Fragment[]{
                mHomePageFragment,
                mFavoritesFragment,
                mHistoryFragment,
                mAttentionPeopleFragment,
                mConsumeHistoryFragment,
                mSettingFragment
        };

         //显示第一个fragment
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container,mHomePageFragment)
                .show(mHomePageFragment).commit();

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mDrawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()){
            case R.id.item_home:
                // 主页
                changeFragmentIndex(item, 0);
                return true;
            case R.id.item_download:
                // 离线缓存

                return true;
            case R.id.item_vip:
                //大会员
                startActivity(new Intent(MainActivity.this, VipActivity.class));
                return true;
            case R.id.item_favourite:
                // 我的收藏
                changeFragmentIndex(item, 1);
                return true;
            case R.id.item_history:
                // 历史记录
                changeFragmentIndex(item, 2);
                return true;
            case R.id.item_group:
                // 关注的人
                changeFragmentIndex(item, 3);
                return true;
            case R.id.item_tracker:
                // 我的钱包
                changeFragmentIndex(item, 4);
                return true;
            case R.id.item_theme:
                // 主题选择
                return true;
            case R.id.item_app:
                // 应用推荐
                return true;
            case R.id.item_settings:
                // 设置中心
                changeFragmentIndex(item, 5);
                return true;
        }
        return false;

    }

    private void changeFragmentIndex(MenuItem item, int currentIndex) {
           index=currentIndex;
            switchFragment();
           item.setChecked(true);
    }

    private void switchFragment() {
        FragmentTransaction trx=getSupportFragmentManager().beginTransaction();
        trx.hide(fragments[currentTabIndex]);
        if (!fragments[index].isAdded()){
            trx.add(R.id.container,fragments[index]);
        }
        trx.show(fragments[index]).commit();
        currentTabIndex=index;
    }
/**
 * DrawerLayout侧滑菜单开关
 */
    public void toggleDrawer(){
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            mDrawerLayout.openDrawer(GravityCompat.START);
        }
    }

    /**
     * 监听back键处理DrawerLayout和SearchView
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            if (mDrawerLayout.isDrawerOpen(mDrawerLayout.getChildAt(1))){
                mDrawerLayout.closeDrawers();
            }else{
                if (mHomePageFragment!=null){
                     exitApp();
                }else {
                    exitApp();
                }
            }
        }
        return true;
    }

    /**
     * 双击退出app
     */
    private void exitApp() {
        if (System.currentTimeMillis()-exitTime>2000){
            Toast.makeText(MainActivity.this,"请双击退出",Toast.LENGTH_SHORT).show();
            exitTime=System.currentTimeMillis();
        }else{
            finish();
        }

    }

    @Override
    public void initToolBar() {

    }



}
