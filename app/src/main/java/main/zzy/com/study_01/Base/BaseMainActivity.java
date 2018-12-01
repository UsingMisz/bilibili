package main.zzy.com.study_01.Base;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/9/27.
 */

public abstract class BaseMainActivity extends RxAppCompatActivity {
private Unbinder binder;
    public static final String TAG="zhaozeyu_Study01";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置布局内容
        setContentView(getLayoutId());
        //设置黄油
        binder= ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
        //初始化ToolBar
        initToolBar();
        Log.i(TAG,"oncreate");
    }

    /**
     * 初始化toolbar
     */
    public abstract void initToolBar();

    /**
     * 初始化views
     * @param savedInstanceState
     */
    public abstract void initViews(Bundle savedInstanceState);

    /**
     * 设置布局layout
     *
     * @return
     */
    public abstract int getLayoutId();



}
