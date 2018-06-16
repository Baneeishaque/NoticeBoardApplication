package uvais.project.noticeboardapplication;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

public class Launch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.launch);
		
		Pb = (ProgressBar) findViewById(R.id.progressBar1);
		Pb.setProgress(0);
		
		
		new Thread(new Runnable() 
		{ 
			private View v;

			public void run() 
			{ 
				try 
				{
		  
					for(i=0;i<5;i++) 
					{
		  
						Thread.sleep(500);
		  
						Pb.setProgress(a[i]); 
					}
					
					
					gotonext(v);
			
				} 
				catch(InterruptedException e) 
				{
					e.printStackTrace(); 
				} 
			}

		
		}).start();
	}

	ProgressBar Pb;
	int a[] = { 20, 40, 60, 80, 100 }, i;
	
	public void gotonext(View v)
    {
    	
			Intent target = new Intent(this,Category.class);
			
			startActivity(target);
			this.finish();
		
    }
	
}
