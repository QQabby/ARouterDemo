package app.arouterdemo.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

import app.arouterdemo.R;

/**
 * Created by xuqianqian on 2018/6/28.
 */
@Route(path = "/login/activity")
public class A_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

//        String key2 = getIntent().getStringExtra("key2");
//        Toast.makeText(this,key2,Toast.LENGTH_SHORT).show();
    }
}
