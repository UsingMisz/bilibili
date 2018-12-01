package main.zzy.com.study_01.module.entry;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;

import butterknife.BindView;
import main.zzy.com.study_01.Base.BaseMainActivity;
import main.zzy.com.study_01.R;
import main.zzy.com.study_01.utils.ConstantUtil;
import main.zzy.com.study_01.utils.SystemBarHelper;

public class VipActivity extends BaseMainActivity {
        @BindView(R.id.toolbar)
        Toolbar mToolbar;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout mCollapsingToolbarLayout;
    @BindView(R.id.webView)
    WebView mWebView;
    /**
     * 初始化toolbar
     */
    @Override
    public void initToolBar() {
    mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        ActionBar supportActionBar=getSupportActionBar();
        if (supportActionBar!=null){
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }//设置statusBar透明
        SystemBarHelper.immersiveStatusBar(this);
        SystemBarHelper.setHeightAndPadding(this,mToolbar);
    }

    /**
     * 初始化views
     *
     * @param savedInstanceState
     */
    @Override
    public void initViews(Bundle savedInstanceState) {
        mWebView.loadUrl(ConstantUtil.VIP_URL);
    }

    /**
     * 设置布局layout
     *
     * @return
     */
    @Override
    public int getLayoutId() {
        return R.layout.activity_vip;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
