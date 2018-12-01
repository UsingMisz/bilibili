package main.zzy.com.study_01.module.entry;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.R;


public class SettingFragment extends BaseFragment {

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_setting;
    }
public static SettingFragment newInstance(){return new SettingFragment();}
    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }
}
