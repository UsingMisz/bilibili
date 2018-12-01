package main.zzy.com.study_01.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import main.zzy.com.study_01.R;
import main.zzy.com.study_01.module.home.attention.HomeAttentionFragment;
import main.zzy.com.study_01.module.home.bangumi.HomeBangumiFragment;
import main.zzy.com.study_01.module.home.discover.HomeDiscoverFragment;
import main.zzy.com.study_01.module.home.live.HomeLiveFragment;
import main.zzy.com.study_01.module.home.recommend.HomeRecommendFragment;
import main.zzy.com.study_01.module.home.region.HomeRegionFragment;

/**
 * Created by Administrator on 2017/10/18.
 * 主页的adapter
 */

public class HomePageAdapter extends FragmentPagerAdapter {

    private final String[] TITLES;
    private  Fragment[]fragments;
    public HomePageAdapter(FragmentManager fm,Context context) {
        super(fm);
        TITLES=context.getResources().getStringArray(R.array.section);
        fragments=new Fragment[TITLES.length];
    }

    @Override
    public Fragment getItem(int position) {
        if (fragments[position]==null){
            switch (position){
                case 0:
                    fragments[position] = HomeLiveFragment.newInstance();
                    break;
                case 1:
                    fragments[position] = HomeRecommendFragment.newInstance();
                    break;
                case 2:
                    fragments[position] = HomeBangumiFragment.newInstance();
                    break;
                case 3:
                    fragments[position] = HomeRegionFragment.newInstance();
                    break;
                case 4:
                    fragments[position] = HomeAttentionFragment.newInstance();
                    break;
                case 5:
                    fragments[position] = HomeDiscoverFragment.newInstance();
                    break;
                default:
                    break;
            }
        }
        return fragments[position];
    }


    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {return TITLES[position];}



}
