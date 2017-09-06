package com.demoapplication.yinyu_tj.demoapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by yinyu-tiejiang on 17-8-15.
 */

public class ControlActivity extends Activity {


    public ControlView mControlView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new ControlView(this));
        setContentView(R.layout.activity_controlview);

        mControlView = (ControlView)findViewById(R.id.control_view);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //处理 黑屏重新点亮后surfaceview重新启动了线程
    }
}
