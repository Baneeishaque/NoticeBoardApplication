package uvais.project.noticeboardapplication;





import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Category extends Activity {

	final Context context = this;
	String[] ls = {"General","General","General"};
	static String cat;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Notice Board Application");
		setContentView(R.layout.category);
		
		ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.listview,ls);
		final ListView listview=(ListView) findViewById(R.id.listView1);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
					Object o=listview.getItemAtPosition(position);
					
					
					if(o.toString().equals("General"))
					{
						cat="General";
						Intent t=new Intent(view.getContext(),Notice_List.class);
					
						startActivity(t); 
					}
				
			}

			
			
		});

	}

	@Override
  	public void onBackPressed() {
      
    	/* Alert Dialog Code Start*/ 	
    	AlertDialog.Builder alert = new AlertDialog.Builder(context);
    	alert.setTitle("Close Confirmation"); //Set Alert dialog title here
    	alert.setMessage("Do you want to close the application?"); //Message here

    	alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
    	public void onClick(DialogInterface dialog, int whichButton) {
    	 
    		//Close the Activity when click OK.
    		Category.this.finish();

    	  }
    	});

    	alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
    	  public void onClick(DialogInterface dialog, int whichButton) {
    	    // Canceled.
    		  dialog.cancel();
    	  }
    	});
    	AlertDialog alertDialog = alert.create();
    	alertDialog.show();
   /* Alert Dialog Code End*/ 
      }
      
	
}
