package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText editString;
	private RadioGroup rgCase;
	private TextView txtString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio);
	
	editString = (EditText) findViewById(R.id.editString);
	rgCase = (RadioGroup) findViewById(R.id.rgCase2);
	txtString = (TextView) findViewById(R.id.textString);
	
	
	Toast.makeText(getApplicationContext(), "CHECK", Toast.LENGTH_SHORT).show();
	
	OnCheckedChangeListener listener = new OnCheckedChangeListener() {
		
		
		
		@Override
		public void onCheckedChanged(RadioGroup group,int radioButtonId) {
			Toast.makeText(getApplicationContext(), "CHECK", Toast.LENGTH_SHORT).show();
			switch (radioButtonId) {
			case R.id.lcase:Toast.makeText(getApplicationContext(), "CHECK", Toast.LENGTH_SHORT).show();
				txtString.setText(editString.getText().toString().toLowerCase());
				break;

			case R.id.ucase:
				txtString.setText(editString.getText().toString().toUpperCase());
				
				break;
			}
			
	}

	};
rgCase.setOnCheckedChangeListener(listener);
}
}