package app.loginlibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 功能模块：例如登录
 * Created by xuqianqian on 2018/6/28.
 */
@Route(path = "/loging/register")
public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_a);

        String key2 = getIntent().getStringExtra("key2");
        Toast.makeText(this,key2,Toast.LENGTH_SHORT).show();
    }
}
