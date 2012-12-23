package jp.android.alarm;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	/*
	時間と比較して同じ時間になったら次は分を比べる？
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
		//String stringTime =  String.valueOf(time.hour) + "時" + String.valueOf(time.minute) + "分";
		//String stringTime =  time.hour + "時" + time.minute + "分";
		timeView.setText(time.hour + "時" + time.minute + "分");
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
