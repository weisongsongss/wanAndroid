package com.test.wanandroid.Activity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：weisongsong on 2022/3/28
 * <p>
 * 邮箱：15231167995@163.com
 */
public class ActivityController {

    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAllActivity(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
