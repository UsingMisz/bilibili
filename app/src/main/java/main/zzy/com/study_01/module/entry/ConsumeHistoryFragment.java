package main.zzy.com.study_01.module.entry;

import android.os.Bundle;


import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.R;


public class ConsumeHistoryFragment extends BaseFragment {

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_consume_history;
    }
public static ConsumeHistoryFragment newInstance(){return new ConsumeHistoryFragment();}
    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }
}
