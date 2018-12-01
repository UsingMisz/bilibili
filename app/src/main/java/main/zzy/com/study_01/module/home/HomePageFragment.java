package main.zzy.com.study_01.module.home;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.flyco.tablayout.SlidingTabLayout;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import butterknife.BindView;
import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.MainActivity;
import main.zzy.com.study_01.R;
import main.zzy.com.study_01.adapter.HomePageAdapter;
import main.zzy.com.study_01.widget.CircleImageView;

/**
 * Created by Administrator on 2017/10/11.
 * fragment 用户的主页面
 */

public class HomePageFragment extends BaseFragment {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.toolbar_user_avatar)
    CircleImageView mCircleImageView;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;
    @BindView(R.id.sliding_tabs)
    SlidingTabLayout mSlidingTab;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_pager;
    }

    public static HomePageFragment newInstance(){return new HomePageFragment();}
   
    @Override
    public void finishCreateView(Bundle state) {
        setHasOptionsMenu(true);
        initToolBar();
        initSearchView();
        initViewPager();

    }






    private void initViewPager() {

      HomePageAdapter mHomePageAdapter=new HomePageAdapter(getChildFragmentManager(),getApplicationContext());
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setAdapter(mHomePageAdapter);
        mViewPager.setCurrentItem(1);
        mSlidingTab.setViewPager(mViewPager);
    }

    private void initSearchView() {

    }



    private void initToolBar() {
        mToolbar.setTitle("");
        ((MainActivity) getActivity()).setSupportActionBar(mToolbar);
        mCircleImageView.setImageResource(R.drawable.headimage);
    }


}
