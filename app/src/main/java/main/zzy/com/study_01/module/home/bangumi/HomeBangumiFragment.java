package main.zzy.com.study_01.module.home.bangumi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;
import main.zzy.com.study_01.Base.BaseFragment;
import main.zzy.com.study_01.R;


/**
 * Created by Administrator on 2017/10/18.
 */

public class HomeBangumiFragment extends BaseFragment {
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_bangumi;
    }
   public static HomeBangumiFragment newInstance(){return new HomeBangumiFragment();}
    /**
     * 初始化views
     *
     * @param state
     */
    @Override
    public void finishCreateView(Bundle state) {

    }




}
