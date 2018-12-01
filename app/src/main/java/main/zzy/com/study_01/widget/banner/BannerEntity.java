package main.zzy.com.study_01.widget.banner;

/**
 * @author zzy
 * @fileName BannerEntity
 * @date 2018/1/116:25
 * @email 747608835@qq.com
 */
public class BannerEntity {
    public String title;
    public String img;
    public String link;

    public BannerEntity(String link, String title, String img) {
        this.link = link;
        this.title = title;
        this.img = img;
    }

}
