package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Case extends Activity {
	private Button upper;
	private Button lower;
	private EditText text;
	private TextView output;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio);
		upper = (Button) findViewById(R.id.upper);
		lower = (Button) findViewById(R.id.lower);
		text = (EditText) findViewById(R.id.text);
		output = (TextView) findViewById(R.id.output);
		
		View.OnClickListener listener = new View.OnClickListener() {
	
			public void onClick(View view) {
				text.getText().toString().toUpperCase();
				text.getText().toString().toLowerCase();
			}
		};
		//upper.setOnClickListener(listener);
		//lower.setOnClickListener((android.view.View.OnClickListener) listener);
		//text.setOnClickListener((android.view.View.OnClickListener) listener);
		//output.setOnClickListener((android.view.View.OnClickListener) listener);
	}
}
		