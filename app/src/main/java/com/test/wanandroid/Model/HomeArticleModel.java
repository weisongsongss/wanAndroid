package com.test.wanandroid.Model;

import java.io.Serializable;
import java.util.List;

/**
 * 作者：weisongsong on 2022/5/11
 * <p>
 * 邮箱：15231167995@163.com
 */

public class HomeArticleModel implements Serializable {
    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * data : {"curPage":2,"datas":[{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24738,"isAdminAdd":false,"link":"https://juejin.cn/post/7155109977579847710","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:15","origin":"","prefix":"","projectLink":"","publishTime":1666612148000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666512911000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【Gradle-1】入门Gradle，前置必读","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24739,"isAdminAdd":false,"link":"https://juejin.cn/post/7156425159249756191","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:15","origin":"","prefix":"","projectLink":"","publishTime":1666612146000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666512940000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Jetpack Compose : 从改造你的登录页面开始","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24740,"isAdminAdd":false,"link":"https://juejin.cn/post/7156512023973462053","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:17","origin":"","prefix":"","projectLink":"","publishTime":1666612144000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666513045000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android的RV列表刷新？Payload 与 Diff 的方式有什么异同？","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24741,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s?__biz=MzAxMzc1NjE0Ng==&amp;mid=2247485888&amp;idx=1&amp;sn=31af7ff6791643d8708a516d21488ff0&amp;chksm=9b9cfa5daceb734b8e9865591f6bfa094c46287a63f481ff65f4a89a412faa17f284e776a17b&amp;token=558847115&amp;lang=zh_CN#rd","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:22","origin":"","prefix":"","projectLink":"","publishTime":1666612142000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666513329000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"KMM跨平台开发入门，看这一篇就够了~","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24745,"isAdminAdd":false,"link":"https://juejin.cn/post/7142297951023415332","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-23 16:52","origin":"","prefix":"","projectLink":"","publishTime":1666612139000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666515133000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android组件化开发，其实就这么简单","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24750,"isAdminAdd":false,"link":"https://juejin.cn/post/7157710923547803655","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-24 08:28","origin":"","prefix":"","projectLink":"","publishTime":1666612137000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666571320000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Binder 原理换个姿势就顿悟了(图文版)","type":0,"userId":20382,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24753,"isAdminAdd":false,"link":"https://juejin.cn/post/7157352645110759437","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-24 19:45","origin":"","prefix":"","projectLink":"","publishTime":1666612135000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666611950000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"探析Android中的四类性能优化","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24755,"isAdminAdd":false,"link":"https://juejin.cn/post/7156631649097089055","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-24 19:46","origin":"","prefix":"","projectLink":"","publishTime":1666612131000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666612007000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"PowerManagerService之亮屏流程分析","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24746,"isAdminAdd":false,"link":"https://juejin.cn/post/7019293070709489678","niceDate":"2022-10-23 22:23","niceShareDate":"2022-10-23 22:23","origin":"","prefix":"","projectLink":"","publishTime":1666535038000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666535038000,"shareUser":"抓猪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin+Flow+Retrofit+OKHttp+KAPT+ViewBanding+ViewModel的MVVM框架","type":0,"userId":6949,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24732,"isAdminAdd":false,"link":"https://juejin.cn/post/7157288161578745869/","niceDate":"2022-10-22 18:55","niceShareDate":"2022-10-22 18:55","origin":"","prefix":"","projectLink":"","publishTime":1666436157000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666436157000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"我把 CPU 三级缓存的秘密，藏在这 8 张图里","type":0,"userId":30587,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24729,"isAdminAdd":false,"link":"https://juejin.cn/post/7157033848344150053/","niceDate":"2022-10-22 03:14","niceShareDate":"2022-10-22 03:14","origin":"","prefix":"","projectLink":"","publishTime":1666379672000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666379672000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"计算机的存储器金字塔长什么样？","type":0,"userId":30587,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24722,"isAdminAdd":false,"link":"https://juejin.cn/post/7156821621557166087/","niceDate":"2022-10-21 14:21","niceShareDate":"2022-10-21 14:21","origin":"","prefix":"","projectLink":"","publishTime":1666333263000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666333263000,"shareUser":"345丶","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | Handler.runWithScissors 解析","type":0,"userId":70343,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24747,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/SBqYN3wJvZkboG5Gx2xOmA","niceDate":"2022-10-21 00:00","niceShareDate":"2022-10-23 23:38","origin":"","prefix":"","projectLink":"","publishTime":1666281600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666539539000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"谈一谈在两个商业项目中使用MVI架构后的感悟","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24748,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/li-zP15kqqILPiLDniC56A","niceDate":"2022-10-21 00:00","niceShareDate":"2022-10-23 23:39","origin":"","prefix":"","projectLink":"","publishTime":1666281600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666539554000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Flutter 3.3 之 SelectionArea 好不好用？用 &quot;Bug&quot; 带您全面了解它 | 开发者说&middot;DTalk","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24749,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/qxvZLirgU0fNAPhPHBMebA","niceDate":"2022-10-21 00:00","niceShareDate":"2022-10-23 23:39","origin":"","prefix":"","projectLink":"","publishTime":1666281600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666539579000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android View动画主流程全解析","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24700,"isAdminAdd":false,"link":"https://juejin.cn/post/7154949546882105374","niceDate":"2022-10-20 10:11","niceShareDate":"2022-10-20 10:11","origin":"","prefix":"","projectLink":"","publishTime":1666231890000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666231890000,"shareUser":"yangchong211","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"高性能图片优化方案","type":0,"userId":697,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24718,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/sqrGb8-8rwyUC5yIpAucpQ","niceDate":"2022-10-20 00:00","niceShareDate":"2022-10-20 23:17","origin":"","prefix":"","projectLink":"","publishTime":1666195200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666279029000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"JNI 从入门到实践，万字爆肝详解！","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24719,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/lyvlmmyhSUJef5_RNwVHIg","niceDate":"2022-10-20 00:00","niceShareDate":"2022-10-20 23:17","origin":"","prefix":"","projectLink":"","publishTime":1666195200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666279041000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"聊一聊Android资源加载的那些事","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":665,"size":20,"total":13300}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public static class DataBean implements Serializable {
        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        /**
         * curPage : 2
         * datas : [{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24738,"isAdminAdd":false,"link":"https://juejin.cn/post/7155109977579847710","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:15","origin":"","prefix":"","projectLink":"","publishTime":1666612148000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666512911000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【Gradle-1】入门Gradle，前置必读","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24739,"isAdminAdd":false,"link":"https://juejin.cn/post/7156425159249756191","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:15","origin":"","prefix":"","projectLink":"","publishTime":1666612146000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666512940000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Jetpack Compose : 从改造你的登录页面开始","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24740,"isAdminAdd":false,"link":"https://juejin.cn/post/7156512023973462053","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:17","origin":"","prefix":"","projectLink":"","publishTime":1666612144000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666513045000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android的RV列表刷新？Payload 与 Diff 的方式有什么异同？","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24741,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s?__biz=MzAxMzc1NjE0Ng==&amp;mid=2247485888&amp;idx=1&amp;sn=31af7ff6791643d8708a516d21488ff0&amp;chksm=9b9cfa5daceb734b8e9865591f6bfa094c46287a63f481ff65f4a89a412faa17f284e776a17b&amp;token=558847115&amp;lang=zh_CN#rd","niceDate":"2022-10-24 19:49","niceShareDate":"2022-10-23 16:22","origin":"","prefix":"","projectLink":"","publishTime":1666612142000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666513329000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"KMM跨平台开发入门，看这一篇就够了~","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24745,"isAdminAdd":false,"link":"https://juejin.cn/post/7142297951023415332","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-23 16:52","origin":"","prefix":"","projectLink":"","publishTime":1666612139000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666515133000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android组件化开发，其实就这么简单","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24750,"isAdminAdd":false,"link":"https://juejin.cn/post/7157710923547803655","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-24 08:28","origin":"","prefix":"","projectLink":"","publishTime":1666612137000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666571320000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Binder 原理换个姿势就顿悟了(图文版)","type":0,"userId":20382,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24753,"isAdminAdd":false,"link":"https://juejin.cn/post/7157352645110759437","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-24 19:45","origin":"","prefix":"","projectLink":"","publishTime":1666612135000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666611950000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"探析Android中的四类性能优化","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24755,"isAdminAdd":false,"link":"https://juejin.cn/post/7156631649097089055","niceDate":"2022-10-24 19:48","niceShareDate":"2022-10-24 19:46","origin":"","prefix":"","projectLink":"","publishTime":1666612131000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666612007000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"PowerManagerService之亮屏流程分析","type":0,"userId":2,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24746,"isAdminAdd":false,"link":"https://juejin.cn/post/7019293070709489678","niceDate":"2022-10-23 22:23","niceShareDate":"2022-10-23 22:23","origin":"","prefix":"","projectLink":"","publishTime":1666535038000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666535038000,"shareUser":"抓猪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin+Flow+Retrofit+OKHttp+KAPT+ViewBanding+ViewModel的MVVM框架","type":0,"userId":6949,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24732,"isAdminAdd":false,"link":"https://juejin.cn/post/7157288161578745869/","niceDate":"2022-10-22 18:55","niceShareDate":"2022-10-22 18:55","origin":"","prefix":"","projectLink":"","publishTime":1666436157000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666436157000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"我把 CPU 三级缓存的秘密，藏在这 8 张图里","type":0,"userId":30587,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24729,"isAdminAdd":false,"link":"https://juejin.cn/post/7157033848344150053/","niceDate":"2022-10-22 03:14","niceShareDate":"2022-10-22 03:14","origin":"","prefix":"","projectLink":"","publishTime":1666379672000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666379672000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"计算机的存储器金字塔长什么样？","type":0,"userId":30587,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24722,"isAdminAdd":false,"link":"https://juejin.cn/post/7156821621557166087/","niceDate":"2022-10-21 14:21","niceShareDate":"2022-10-21 14:21","origin":"","prefix":"","projectLink":"","publishTime":1666333263000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666333263000,"shareUser":"345丶","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | Handler.runWithScissors 解析","type":0,"userId":70343,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24747,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/SBqYN3wJvZkboG5Gx2xOmA","niceDate":"2022-10-21 00:00","niceShareDate":"2022-10-23 23:38","origin":"","prefix":"","projectLink":"","publishTime":1666281600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666539539000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"谈一谈在两个商业项目中使用MVI架构后的感悟","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24748,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/li-zP15kqqILPiLDniC56A","niceDate":"2022-10-21 00:00","niceShareDate":"2022-10-23 23:39","origin":"","prefix":"","projectLink":"","publishTime":1666281600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666539554000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Flutter 3.3 之 SelectionArea 好不好用？用 &quot;Bug&quot; 带您全面了解它 | 开发者说&middot;DTalk","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24749,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/qxvZLirgU0fNAPhPHBMebA","niceDate":"2022-10-21 00:00","niceShareDate":"2022-10-23 23:39","origin":"","prefix":"","projectLink":"","publishTime":1666281600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666539579000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android View动画主流程全解析","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24700,"isAdminAdd":false,"link":"https://juejin.cn/post/7154949546882105374","niceDate":"2022-10-20 10:11","niceShareDate":"2022-10-20 10:11","origin":"","prefix":"","projectLink":"","publishTime":1666231890000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1666231890000,"shareUser":"yangchong211","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"高性能图片优化方案","type":0,"userId":697,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24718,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/sqrGb8-8rwyUC5yIpAucpQ","niceDate":"2022-10-20 00:00","niceShareDate":"2022-10-20 23:17","origin":"","prefix":"","projectLink":"","publishTime":1666195200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666279029000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"JNI 从入门到实践，万字爆肝详解！","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":24719,"isAdminAdd":false,"link":"https://mp.weixin.qq.com/s/lyvlmmyhSUJef5_RNwVHIg","niceDate":"2022-10-20 00:00","niceShareDate":"2022-10-20 23:17","origin":"","prefix":"","projectLink":"","publishTime":1666195200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1666279041000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"聊一聊Android资源加载的那些事","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 665
         * size : 20
         * total : 13300
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public static class DatasBean implements Serializable {
            public boolean isAdminAdd() {
                return adminAdd;
            }

            public void setAdminAdd(boolean adminAdd) {
                this.adminAdd = adminAdd;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            /**
             * adminAdd : false
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * host :
             * id : 24738
             * isAdminAdd : false
             * link : https://juejin.cn/post/7155109977579847710
             * niceDate : 2022-10-24 19:49
             * niceShareDate : 2022-10-23 16:15
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1666612148000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1666512911000
             * shareUser : 鸿洋
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : 【Gradle-1】入门Gradle，前置必读
             * type : 0
             * userId : 2
             * visible : 1
             * zan : 0
             */

            private boolean adminAdd;
            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private boolean isAdminAdd;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;
        }
    }
}
