package se.mah.k3lara.assigment2_starter.view;

import se.mah.k3lara.assigment2_starter.R;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class HelpFragment extends DialogFragment {
	private WebView webview;
	
	public HelpFragment() {}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_help, container);
		getDialog().setContentView(R.layout.fragment_help);
	//	webview = (WebView) findViewByID(R.id.webView);
		webview.loadUrl("http://antonnyman.se");
		getDialog().setTitle("Good website");
		return view;
	}
}
