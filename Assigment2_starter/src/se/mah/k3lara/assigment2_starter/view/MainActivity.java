package se.mah.k3lara.assigment2_starter.view;

import se.mah.k3lara.assigment2_starter.R;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {

	WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		webview = new WebView(this);
		webview.loadUrl("http://antonnyman.se");
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, new StartFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		} else if(id == R.id.action_about) {
			Dialog dialog = new Dialog(this);
			dialog.setTitle("About");
			dialog.setContentView(R.layout.fragment_about);
			dialog.show();
			
//			FragmentTransaction ft = getFragmentManager().beginTransaction();
//			AboutFragment aboutfragment = new AboutFragment();
//			aboutfragment.show(ft, "fragment_about");
		} else if(id == R.id.action_help) {
			Dialog dialog = new Dialog(this);
			dialog.setTitle("Help");
			dialog.setContentView(webview);
			dialog.show();
			
//			FragmentTransaction ft = getFragmentManager().beginTransaction();
//			HelpFragment helpfragment = new HelpFragment();
//			helpfragment.show(ft, "fragment_help");
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void buttonClick(View v){
		Log.i("k3lara","click");
	}
}