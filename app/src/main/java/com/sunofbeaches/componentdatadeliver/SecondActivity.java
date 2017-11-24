package com.sunofbeaches.componentdatadeliver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Create by TrillGates 2017/11/23
 * 这是第二个界面，我们就在这个界面获取一个内容吧：
 */
public class SecondActivity extends Activity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 拿到启动这个Activity的意图对象
         */
        Intent intent = getIntent();
        if (intent != null) {
            //前面的是key，后面的是默认值，假设获取不到的时候，就会返回默认值，也就是后面的那个值。
            //比如说我们把key写错了，这样子就获取不到值了。
            boolean booleanValue = intent.getBooleanExtra("booleanKey", false);
            //
            char charValue = intent.getCharExtra("charKey", '*');
            //
            byte byteValue = intent.getByteExtra("byteKey", (byte) 0);
            //
            short shortValue = intent.getShortExtra("shortKey", (short) 0);
            //
            int intValue = intent.getIntExtra("intKey", -1);
            //
            long longValue = intent.getLongExtra("longKey", 0l);
            //
            float floatValue = intent.getFloatExtra("floatKey", 0.0f);
            //
            double doubleValue = intent.getDoubleExtra("doubleKey", 0.0d);

            Log.d(TAG, "booleanValue = " + booleanValue);
            Log.d(TAG, "charValue = " + charValue);
            Log.d(TAG, "byteValue = " + byteValue);
            Log.d(TAG, "shortValue = " + shortValue);
            Log.d(TAG, "intValue = " + intValue);
            Log.d(TAG, "longValue = " + longValue);
            Log.d(TAG, "floatValue = " + floatValue);
            Log.d(TAG, "doubleValue = " + doubleValue);

        }
    }
}
