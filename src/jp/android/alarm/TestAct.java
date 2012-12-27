package jp.android.alarm;

import android.content.Context;
import android.widget.Toast;

public class TestAct{

	private Context context;

    TestAct(Context c){
        context = c;
    }

	public void ToastCall(){
		Toast.makeText(context.getApplicationContext(), "“ú•tİ’è‚ğŒÄ‚Ño‚·—\’è", Toast.LENGTH_LONG).show();
	}
}
