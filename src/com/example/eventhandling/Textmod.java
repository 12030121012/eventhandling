package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Textmod extends Activity {
	private EditText ed;
	private TextView tv;
	private RadioGroup rg;
	private TextView tv0;
	private RadioGroup rg0;
	private TextView tv1;
	private CheckBox c;
	private CheckBox c0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_textmod);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.textmod, menu);
		return true;
	}

}
