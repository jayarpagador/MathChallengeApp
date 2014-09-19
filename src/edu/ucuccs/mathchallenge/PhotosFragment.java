package edu.ucuccs.mathchallenge;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class PhotosFragment extends Fragment {

	Button save;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
      
        final Intent myIntent = new Intent(PhotosFragment.this.getActivity(), Ac_Adding.class);
        
        
        save = (Button) rootView.findViewById(R.id.button1 );
        final EditText topditText= (EditText)rootView.findViewById(R.id.edittop);
        final EditText bottomditText= (EditText)rootView.findViewById(R.id.editbottom);
        
        save.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 String strtop = topditText.getText().toString();
			        String strbottom = bottomditText.getText().toString();
			        
			        myIntent.putExtra("myExtra", strtop);
			        startActivity(myIntent);
			        myIntent.putExtra("myExtra1", strbottom);
			        startActivity(myIntent);
				
			}
        	
        });
        
       


        
        return rootView;
    }
}
