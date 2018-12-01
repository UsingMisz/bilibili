package main.zzy.com.study_01.adapter.section;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import main.zzy.com.study_01.R;
import main.zzy.com.study_01.adapter.ActivityCenterRecyclerAdapter;
import main.zzy.com.study_01.entity.RecommendInfo;
import main.zzy.com.study_01.widget.sectioned.StatelessSection;

/**
 * @author zzy
 * @fileName HomeRecommendActivityCenterSection
 * @date 2018/1/119:26
 * @email 747608835@qq.com
 */

public class HomeRecommendActivityCenterSection extends StatelessSection {
    private Context mContext;
    private List<RecommendInfo.ResultBean.BodyBean> activitys;

    public HomeRecommendActivityCenterSection(Context context, List<RecommendInfo.ResultBean.BodyBean> activitys) {
        super(R.layout.layout_home_recommend_activitycenter, R.layout.layout_home_recommend_empty);
        this.mContext = context;
        this.activitys = activitys;
    }


    @Override
    public int getContentItemsTotal() {
        return 1;
    }


    @Override
    public RecyclerView.ViewHolder getItemViewHolder(View view) {
        return new EmptyViewHolder(view);
    }


    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
    }


    @Override
    public RecyclerView.ViewHolder getHeaderViewHolder(View view) {
        return new ActivityCenterViewHolder(view);
    }


    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder) {
        ActivityCenterViewHolder centerViewHolder = (ActivityCenterViewHolder) holder;
        centerViewHolder.mRecyclerView.setHasFixedSize(false);
        centerViewHolder.mRecyclerView.setNestedScrollingEnabled(false);
        centerViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext,
                LinearLayoutManager.HORIZONTAL, false));
     /*
     TODO 横向的-写不完。。
     --centerViewHolder.mRecyclerView.setAdapter(new ActivityCenterRecyclerAdapter();*/

    }


    static class ActivityCenterViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.recycle)
        RecyclerView mRecyclerView;

        ActivityCenterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private static class EmptyViewHolder extends RecyclerView.ViewHolder {
        EmptyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
