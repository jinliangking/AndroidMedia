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
			 * չʾ�����Ӻ���ת����ҳ���У�ִ�������߳���
			 * */
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Log.d(TAG, "��ǰ�߳�����==" + Thread.currentThread().getName());
				startMainActivity();
				// �رյ�ǰҳ��
				finish();
			}
		}, 2000);
	}

	/**
	 * ��ת����ҳ��
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
