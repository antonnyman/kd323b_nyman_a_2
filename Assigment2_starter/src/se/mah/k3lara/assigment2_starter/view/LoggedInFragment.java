package se.mah.k3lara.assigment2_starter.view;

import se.mah.k3lara.assigment2_starter.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoggedInFragment extends Fragment {
	public LoggedInFragment() {
		
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
		View view =  inflater.inflate(R.layout.logged_in_fragment, container);
		return view;
	}
}
