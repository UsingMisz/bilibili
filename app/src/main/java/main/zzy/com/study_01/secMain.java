package main.zzy.com.study_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import main.zzy.com.study_01.Base.BaseMainActivity;

public class secMain  extends BaseMainActivity {

@BindView(R.id.textview)
    TextView text;

    /**
     * 初始化toolbar
     */
    @Override
    public void initToolBar() {

    }

    /**
     * 初始化views
     *
     * @param savedInstanceState
     */
    @Override
    public void initViews(Bundle savedInstanceState) {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        text.setText((String) bundle.get("e"));
    }

    /**
     * 设置布局layout
     *
     * @return
     */
    @Override
    public int getLayoutId() {
        return  R.layout.activity_sec_main;
    }




}
