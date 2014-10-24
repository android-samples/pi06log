package com.example.pi06log;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	int mCount = 0;
	
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
	
	// ボタン
	public void buttonMethodLog(View _button){
		Button button = (Button)_button;
		String s = button.getText().toString();
		if(s.equals("V")){
			Log.v("pi", "message" + mCount++);
		}
		else if(s.equals("D")){
			Log.d("pi", "message" + mCount++);
		}
		else if(s.equals("I")){
			Log.i("pi", "message" + mCount++);
		}
		else if(s.equals("W")){
			Log.w("pi", "message" + mCount++);
		}
		else if(s.equals("E")){
			Log.e("pi", "message" + mCount++);
		}
	}

}
