package jp.android.alarm;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	static TextView timeView;
	static Button daySetting,timeSetting;
	TestAct testAct = new TestAct(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		timeView= (TextView)findViewById(R.id.now_time);
		daySetting = (Button)findViewById(R.id.day_setting);
		timeSetting = (Button)findViewById(R.id.time_setting);
		daySetting.setOnClickListener(this);
		timeSetting.setOnClickListener(this);
		
		NowTime();
		Alarm();
	}
	
	public void onClick(View v){
			if(v == daySetting){
				testAct.ToastCall();
				//Toast.makeText(MainActivity.this, "日付設定を呼び出す予定", Toast.LENGTH_LONG).show();
			}else if(v == timeSetting){
				Toast.makeText(MainActivity.this, "時間設定を呼び出す予定", Toast.LENGTH_LONG).show();
				}
	}
	
	
	public static void NowTime(){
		Time time = new Time("Asia/Tokyo");
		time.setToNow();
		timeView.setText(time.hour + "時" + time.minute + "分" + time.second + "秒");
	}
	public void Alarm(){
		
		Intent i = new Intent(getApplicationContext(), ReceivedActivity.class); // ReceivedActivityを呼び出すインテントを作成
		PendingIntent sender = PendingIntent.getBroadcast(MainActivity.this, 0, i, 0); // ブロードキャストを投げるPendingIntentの作成
		
		Calendar calendar = Calendar.getInstance(); // Calendar取得
		calendar.setTimeInMillis(System.currentTimeMillis()); // 現在時刻を取得
		calendar.add(Calendar.SECOND, 10); // 現時刻よりx秒後を設定
		
		AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE); // AlramManager取得
		am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender); // AlramManagerにPendingIntentを登録
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
