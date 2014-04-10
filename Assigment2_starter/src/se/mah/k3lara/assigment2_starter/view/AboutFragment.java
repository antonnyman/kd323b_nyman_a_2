package se.mah.k3lara.assigment2_starter.view;

import se.mah.k3lara.assigment2_starter.R;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends DialogFragment {
	public AboutFragment() {
		//Empty constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_about, container);
		getDialog().setContentView(R.layout.fragment_about);
		getDialog().setTitle("Ples no more");
		return view;
	}
}
