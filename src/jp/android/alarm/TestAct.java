package jp.android.alarm;

import android.content.Context;
import android.widget.Toast;

public class TestAct{

	private Context context;

    TestAct(Context c){
        context = c;
    }

	public void ToastCall(){
		Toast.makeText(context.getApplicationContext(), "���t�ݒ���Ăяo���\��", Toast.LENGTH_LONG).show();
	}
}
