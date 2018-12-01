package main.zzy.com.study_01.module.home.attention;

import android.os.Bundle;

import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.R;

/**
 * Created by Administrator on 2017/10/18.
 */

public class HomeAttentionFragment extends BaseFragment {
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_attention;
    }

    public static HomeAttentionFragment  newInstance(){return new HomeAttentionFragment();}
    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }
}
