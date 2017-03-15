package com.example.mobile.activity;

import com.example.mobile.R;
import com.example.mobile.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Window;

public class SplashActivity extends Activity {

	private final static String TAG = SplashActivity.class.getSimpleName();

	Handler handler = new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		handler.postDelayed(new Runnable() {
			/**
			 * 展示两秒钟后跳转到主页面中，执行在主线程中
			 * */
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Log.d(TAG, "当前线程名称==" + Thread.currentThread().getName());
				startMainActivity();
				// 关闭当前页面
				finish();
			}
		}, 2000);
	}

	/**
	 * 跳转到主页面
	 * */
	public void startMainActivity() {
		Intent intent = new Intent(SplashActivity.this, MainActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Log.d(TAG, "onTouchEvent == Action " + event.getAction());
		startMainActivity();
		return super.onTouchEvent(event);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
	    handler.removeCallbacksAndMessages(null);
		super.onDestroy();
	}
}
