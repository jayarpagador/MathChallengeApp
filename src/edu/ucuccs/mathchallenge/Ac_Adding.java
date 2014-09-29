package edu.ucuccs.mathchallenge;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Ac_Adding extends Activity {

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ac__adding);

		Intent myIntent = getIntent();
		if (myIntent.hasExtra("myExtra"))
		{                                
			TextView mTop = (TextView)findViewById(R.id.txttop);
		mTop.setText(myIntent.getStringExtra("myExtra"));

		TextView mBottom = (TextView)findViewById(R.id.txtbottom);
	mBottom.setText(myIntent.getStringExtra("myExtra1"));}
		

      

	}
}