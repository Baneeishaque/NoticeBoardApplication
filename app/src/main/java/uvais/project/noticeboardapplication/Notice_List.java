package uvais.project.noticeboardapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Notice_List extends Activity {
	String[] ls = {"General1","General2","General3"};
	static String address,title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(Category.cat);
		setContentView(R.layout.notice_list);
		
		ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.listview,ls);
		final ListView listview=(ListView) findViewById(R.id.listView1);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
					Object o=listview.getItemAtPosition(position);
					
					
					if(o.toString().equals("General1"))
					{
						address="General";
						title="title";
						Intent t=new Intent(view.getContext(),Notice_View.class);
					
						startActivity(t); 
					}
				
			}

			
			
		});

	}

}
