package com.example.mobile.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		TextView textView = new TextView(this);
		textView.setText("������ҳ��");
		textView.setTextSize(30);
		textView.setGravity(Gravity.CENTER);
		textView.setTextColor(Color.RED);
		
		setContentView(textView);
	}
}
