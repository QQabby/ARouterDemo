package app.commmonlibrary;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 基础组件和一些共用的东西
 * Created by xuqianqian on 2018/6/28.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化SDK
        ARouter.openLog();
        ARouter.openDebug();

        ARouter.init(this);
    }
}
