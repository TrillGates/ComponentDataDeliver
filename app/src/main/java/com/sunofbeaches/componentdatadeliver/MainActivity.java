package com.sunofbeaches.componentdatadeliver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 虽然说我们这节课是组件之间的数据传递
 * 我们常说的组件有Activity,BroadcastReceiver,Service,ContentProvider
 * <p/>
 * 这里的话我们只学习Activity之间的数据传输，其实其他组件之间的数据传输也是一样的。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 第一个按钮被点击了
     *
     * @param view
     */
    public void firstClick(View view) {
        //这样子写也是可以的哦！
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("booleanKey", true);
        intent.putExtra("charKey", 'a');
        intent.putExtra("byteKey", (byte) 1);
        intent.putExtra("shortKey", (short) 2);
        intent.putExtra("intKey", 3);
        intent.putExtra("longKey", 4l);
        intent.putExtra("floatKey", 0.5f);
        intent.putExtra("doubleKey", 0.6d);
        startActivity(intent);
    }


    /**
     * 第二个按钮被点击了
     */
    public void secondClick(View view) {

    }


    private class User {
        private String name;
        private int age;

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){

        }
    }

}
