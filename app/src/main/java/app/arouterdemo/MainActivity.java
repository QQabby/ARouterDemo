package app.arouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view){
        //1.应用内简单的跳转(通过url跳转在进阶用法中) 路径至少两级
//        ARouter.getInstance().build("/login/activity").navigation();

        //2.携带参数跳转
        ARouter.getInstance().build("/login/activity")
                .withLong("key1",666L)
                .withString("key2","888")//.withObject()
                .navigation();
    }
}
