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


public class AttentionPeopleFragment extends BaseFragment {

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_attention_people;
    }

    public static AttentionPeopleFragment newInstance(){return new AttentionPeopleFragment();}

    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }
}
