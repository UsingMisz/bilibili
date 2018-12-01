package main.zzy.com.study_01;

import android.app.Application;

import butterknife.BindView;
import butterknife.ButterKnife;


public class studyApplication extends Application {

    public static studyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        init();
    }

    private void init() {

    }

    public static studyApplication getInstance() {
        return mInstance;
    }

}
