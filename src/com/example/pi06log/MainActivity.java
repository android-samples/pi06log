package com.example.pi06log;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// ログ出力ボタン
	int mLogCount = 0;
	public void buttonMethodLog(View _button){
		Button button = (Button)_button;
		String s = button.getText().toString();
		if(s.equals("V")){
			Log.v("pi", "message" + mLogCount++);
		}
		else if(s.equals("D")){
			Log.d("pi", "message" + mLogCount++);
		}
		else if(s.equals("I")){
			Log.i("pi", "message" + mLogCount++);
		}
		else if(s.equals("W")){
			Log.w("pi", "message" + mLogCount++);
		}
		else if(s.equals("E")){
			Log.e("pi", "message" + mLogCount++);
		}
	}
	
	// 何かしらの計算ボタン
	int mCalc = 0;
	int mCount = 0;
	public void buttonMethodCalc(View button){
		if(++mCount >= 5){
			mCalc -= 10;
		}
		mCalc = (mCalc + 1) * 2;
		TextView text = (TextView)findViewById(R.id.textViewCalc);
		text.setText(Integer.toString(mCalc));
	}
	
	// 異常終了するボタン
	TextView mText;
	public void buttonMethodError(View button){
		int n = 10;
		int m = 20;
		n *= m;
		mText.setText("Hello bad pi " + n);
		mCalc++;
		mCount = 0;
	}

}
