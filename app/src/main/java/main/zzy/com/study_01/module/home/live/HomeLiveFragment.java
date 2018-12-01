package main.zzy.com.study_01.module.home.live;

import android.os.Bundle;

import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.R;

/**
 * Created by Administrator on 2017/10/18.
 */

public class HomeLiveFragment extends BaseFragment {
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_live;
    }

    public static HomeLiveFragment newInstance(){return new HomeLiveFragment();}
    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }
}
