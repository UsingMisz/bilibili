package main.zzy.com.study_01.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import main.zzy.com.study_01.R;
import main.zzy.com.study_01.entity.RecommendInfo;

/**
 * @author zzy
 * @fileName ActivityCenterRecyclerAdapter
 * @date 2018/1/119:47
 * @email 747608835@qq.com
 * 横向的
 */

public class ActivityCenterRecyclerAdapter extends RecyclerView{
    private List<RecommendInfo.ResultBean.BodyBean> activitys;


    public ActivityCenterRecyclerAdapter(Context context) {
        super(context);
    }
}
