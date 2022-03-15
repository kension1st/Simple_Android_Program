package com.latbutton;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class menuutuma extends Activity {
	TextView tfor,twhile,tdowhile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		tfor=(TextView) findViewById(R.id.tfor);
        twhile=(TextView) findViewById(R.id.twhile);
        tdowhile=(TextView) findViewById(R.id.tdowhile);
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.addSubMenu(0,1,1,"Tampil Form 2");
		menu.addSubMenu(1,2,2,"Keluar");
		menu.addSubMenu(1,3,0,"for");
		menu.addSubMenu(1,4,0,"while");
		menu.addSubMenu(1,5,0,"do while");
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case 1:
			
			break;
		case 2:
			finish();
			break;
		case 3:
			for (int i = 0; i < 11; i++)
				tfor.setText(tfor.getText()+"\n"+i +" X 2 ="+ i * 2);
			break;
		case 4:
			int c=1;
			while (c<=11) {
				twhile.setText(twhile.getText()+"\n"+c +" X 2 ="+ c * 2);
				c++;
			}
			
			break;
		case 5:
			int b=1;
			do {
				tdowhile.setText(tdowhile.getText()+"\n"+b +" X 2 ="+ b * 2);
			} while (b<=11);
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		
		// TODO Auto-generated method stub
		//super.onBackPressed();
	
	}

}
