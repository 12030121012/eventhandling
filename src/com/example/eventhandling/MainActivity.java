package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button click;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	click = (Button) findViewById(R.id.btnClick);
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			click.setText("Button was clicked !");
		}
	};
	click.setOnClickListener(listener);
	
	}

}
