package main.zzy.com.study_01.module.home.region;

import android.os.Bundle;

import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.R;

/**
 * Created by Administrator on 2017/10/18.
 */

public class HomeRegionFragment extends BaseFragment {
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_region;
    }

    public static HomeRegionFragment newInstance(){return new HomeRegionFragment();}
    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }
}
