package uvais.project.noticeboardapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class Notice_View extends Activity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notice_view);
		
		
		
		

	}

	public void download(View v)
	{
		Toast.makeText(getApplicationContext(), "Not Implemented", Toast.LENGTH_LONG).show();
	}
	
}
