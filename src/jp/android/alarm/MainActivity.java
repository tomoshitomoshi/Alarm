package jp.android.alarm;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	/*
	���ԂƔ�r���ē������ԂɂȂ����玟�͕����ׂ�H
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Alarm();
	}
	public void Alarm(){
		TextView timeView = (TextView)findViewById(R.id.now_time);
		Time time = new Time("Asia/Tokyo");
		time.setToNow();
		//String stringTime =  String.valueOf(time.hour) + "��" + String.valueOf(time.minute) + "��";
		//String stringTime =  time.hour + "��" + time.minute + "��";
		timeView.setText(time.hour + "��" + time.minute + "��");
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
