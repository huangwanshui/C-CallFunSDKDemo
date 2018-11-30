package com.example.hws.netsdkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(funInit());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String funInit();
    public native void devLogin();
    public native void searchRecordFiles();
    public native void playBack();
    public native void stopPlayBack();
    public native void playMonitor();
    public native void stopMonitor();
    public native void getSystemInfo();
    public native void getDevChannelName();
    public native void getCameraInfo();
    public native void setPTZ();

    public void onDevLogin(View v) {
        devLogin();
    }

    public void onSearchRecordFiles(View v) {
        searchRecordFiles();
    }

    public void onPlayMonitor(View v) {
        playMonitor();
    }

    public void onStopMonitor(View v) {
        stopMonitor();
    }

    public void onPlayBack(View v) {
        playBack();
    }

    public void onStopPlayBack(View v) {
        stopPlayBack();
    }

    public void onGetSystemInfo(View v) {
        getSystemInfo();
    }

    public void onGetCameraInfo(View v) {
        getCameraInfo();
    }

    public void onSetPTZ(View v) {
        setPTZ();
    }
}
