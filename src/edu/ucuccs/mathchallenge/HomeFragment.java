package edu.ucuccs.mathchallenge;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {
	
	TextView txtadd;
	TextView txtmin;
	TextView txtmul;
	TextView txtdiv;
	
	final CharSequence[] items = {" Easy "," Medium "," Hard "};
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		
		
        View rootView = inflater.inflate(R.layout.fragment_home , container, false);
        txtadd = (TextView) rootView.findViewById(R.id.txtadd );
        txtmin = (TextView) rootView.findViewById(R.id.txtmin );
        txtmul = (TextView) rootView.findViewById(R.id.txtmul );
        txtdiv = (TextView) rootView.findViewById(R.id.txtdiv );
        
        
        		txtadd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				
                // Creating and Building the Dialog 
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeFragment.this.getActivity());
                builder.setTitle("Select The Difficulty Level");
                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int item) {
                   
                    
                    switch(item)
                    {
                        case 0:
                                // Your code when first option seletced
                        	Intent intent = new Intent(HomeFragment.this.getActivity(),
            						Ac_Adding.class);//easy game
            				startActivity(intent);
                                 break;
                        case 1:
                                // Your code when 2nd  option seletced
                                
                                break;
                        case 2:
                               // Your code when 3rd option seletced
                                break;
                      
                        
                    }
                    Dialog levelDialog = null;
					levelDialog.dismiss();    
                    }
                });
                AlertDialog levelDialog = builder.create();
                levelDialog.show();

				
				//Intent intent = new Intent(HomeFragment.this.getActivity(),
					//	Ac_Adding.class);
			//	startActivity(intent);
			}
		});

        		txtmin.setOnClickListener(new View.OnClickListener() {
			
        			@Override
        			public void onClick(View v) {
        				 AlertDialog.Builder builder = new AlertDialog.Builder(HomeFragment.this.getActivity());
        	                builder.setTitle("Select The Difficulty Level");
        	                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
        	                public void onClick(DialogInterface dialog, int item) {
        	                   
        	                    
        	                    switch(item)
        	                    {
        	                        case 0:
        	                                // Your code when first option seletced
        	                        	Intent intent = new Intent(HomeFragment.this.getActivity(),
        	            						Ac_min.class);//easy game 
        	            				startActivity(intent);
        	                                 break;
        	                        case 1:
        	                                // Your code when 2nd  option seletced
        	                                
        	                                break;
        	                        case 2:
        	                               // Your code when 3rd option seletced
        	                                break;
        	                      
        	                        
        	                    }
        	                    Dialog levelDialog = null;
        						levelDialog.dismiss();    
        	                    }
        	                });
        	                AlertDialog levelDialog = builder.create();
        	                levelDialog.show();
        			}
        		});
        		

        		txtmul.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				 AlertDialog.Builder builder = new AlertDialog.Builder(HomeFragment.this.getActivity());
	                builder.setTitle("Select The Difficulty Level");
	                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int item) {
	                   
	                    
	                    switch(item)
	                    {
	                        case 0:
	                                // Your code when first option seletced
	                        	Intent intent = new Intent(HomeFragment.this.getActivity(),
	            						Ac_mul.class);//easy game
	            				startActivity(intent);
	                                 break;
	                        case 1:
	                                // Your code when 2nd  option seletced
	                                
	                                break;
	                        case 2:
	                               // Your code when 3rd option seletced
	                                break;
	                      
	                        
	                    }
	                    Dialog levelDialog = null;
						levelDialog.dismiss();    
	                    }
	                });
	                AlertDialog levelDialog = builder.create();
	                levelDialog.show();
			}
		});

        		txtdiv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				 AlertDialog.Builder builder = new AlertDialog.Builder(HomeFragment.this.getActivity());
	                builder.setTitle("Select The Difficulty Level");
	                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int item) {
	                   
	                    
	                    switch(item)
	                    {
	                        case 0:
	                                // Your code when first option seletced
	                        	Intent intent = new Intent(HomeFragment.this.getActivity(),
	            						Ac_div.class);//easy game
	            				startActivity(intent);
	                                 break;
	                        case 1:
	                                // Your code when 2nd  option seletced
	                                
	                                break;
	                        case 2:
	                               // Your code when 3rd option seletced
	                                break;
	                      
	                        
	                    }
	                    Dialog levelDialog = null;
						levelDialog.dismiss();    
	                    }
	                });
	                AlertDialog levelDialog = builder.create();
	                levelDialog.show();
			}
		});
        			
        		
        	
        return rootView;
        
        
        
    }
	
	
}
