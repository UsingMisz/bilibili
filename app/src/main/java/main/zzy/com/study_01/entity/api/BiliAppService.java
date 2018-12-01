package main.zzy.com.study_01.entity.api;


import main.zzy.com.study_01.entity.RecommendBannerInfo;
import main.zzy.com.study_01.entity.RecommendInfo;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by zzy on  12:03
 * 747608835@qq.com
 */
public interface BiliAppService {

    /**
     * 首页推荐数据
     */
    @GET("x/show/old?platform=android&device=&build=412001")
    Observable<RecommendInfo> getRecommendedInfo();

    /**
     * 首页推荐banner
     */
    @GET("x/banner?plat=4&build=411007&channel=bilih5")
    Observable<RecommendBannerInfo> getRecommendedBannerInfo();


}

