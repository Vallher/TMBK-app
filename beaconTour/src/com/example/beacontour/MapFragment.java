package com.example.beacontour;

import com.example.beacontour.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup; 
import android.app.Activity;
import android.os.Bundle;
/**
 * Display map with location of beacons
 * @author Adam, Antek, Rafal
 *
 */
public class MapFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	
    	
    	View rootView = inflater.inflate(R.layout.fragment_map, container, false);
         
        return rootView;
        
        

    }
}