package jp.android.alarm;

import android.content.Context;
import android.widget.Toast;

public class TestAct{

	private Context context;

    TestAct(Context c){
        context = c;
    }

	public void ToastCall(){
		Toast.makeText(context.getApplicationContext(), "日付設定を呼び出す予定", Toast.LENGTH_LONG).show();
	}
}
