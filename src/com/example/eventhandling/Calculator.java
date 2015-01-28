package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
	private EditText screen;
	private Button clear,n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,addition,subtract,multiply,divide,dot,equal;
	private double a=0,b=0,c=0;
	private int operation=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
	screen = (EditText) findViewById(R.id.screen);
	clear = (Button) findViewById(R.id.clear);
	n1 = (Button) findViewById(R.id.n1);
	n2 = (Button) findViewById(R.id.n2);
	n3 = (Button) findViewById(R.id.n3);
	n4 = (Button) findViewById(R.id.n4);
	n5 = (Button) findViewById(R.id.n5);
	n6 = (Button) findViewById(R.id.n6);
	n7 = (Button) findViewById(R.id.n7);
	n8 = (Button) findViewById(R.id.n8);
	n9 = (Button) findViewById(R.id.n9);
	n0 = (Button) findViewById(R.id.n0);
	addition = (Button) findViewById(R.id.addition);
	subtract = (Button) findViewById(R.id.subtract);
	multiply = (Button) findViewById(R.id.multiply);
	divide = (Button) findViewById(R.id.divide);
	dot = (Button) findViewById(R.id.dot);
	equal = (Button) findViewById(R.id.equal);
	
	View.OnClickListener operationlistener=new View.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(((Button)(arg0)).getText().toString().equals("/")){
				operation=0;
				a=Double.parseDouble(screen.getText().toString());
				screen.setText("");}
			
			else if(((Button)(arg0)).getText().toString().equals("*")){
				operation=1;
				a=Double.parseDouble(screen.getText().toString());
				screen.setText("");}
			
			else if(((Button)(arg0)).getText().toString().equals("+")){
				operation=2;
				a=Double.parseDouble(screen.getText().toString());
				screen.setText("");}
				
			else if(((Button)(arg0)).getText().toString().equals("-")){
			operation=3;
			a=Double.parseDouble(screen.getText().toString());
			screen.setText("");}
			
			else if(((Button)(arg0)).getText().toString().equals("=")){
			
				switch(operation){
			case 0:
				b=Double.parseDouble(screen.getText().toString());
				screen.setText(Double.toString(a/b));
				break;
			case 1:
				b=Double.parseDouble(screen.getText().toString());
				screen.setText(Double.toString(a*b));
				break;
			case 2:
				b=Double.parseDouble(screen.getText().toString());
				screen.setText(Double.toString(a+b));
				break;
			case 3:
				b=Double.parseDouble(screen.getText().toString());
				screen.setText(Double.toString(a-b));
				break;
			}
			}
			}
	};
	
	View.OnClickListener clearlistener = new View.OnClickListener(){
		public void onClick(View arg0){
			screen.setText("");
		}
	};
	clear.setOnClickListener(clearlistener);
View.OnClickListener listener = new View.OnClickListener()
{
	public void onClick(View v)
	{
		String digit = ((Button)v).getText().toString();
		String text = screen.getText().toString();
		screen.setText(text+digit);
		
	}
};
n1.setOnClickListener(listener);
n2.setOnClickListener(listener);
n3.setOnClickListener(listener);
n4.setOnClickListener(listener);
n5.setOnClickListener(listener);
n6.setOnClickListener(listener);
n7.setOnClickListener(listener);
n8.setOnClickListener(listener);
n9.setOnClickListener(listener);
n0.setOnClickListener(listener);
dot.setOnClickListener(listener);
divide.setOnClickListener(operationlistener);
multiply.setOnClickListener(operationlistener);
addition.setOnClickListener(operationlistener);
subtract.setOnClickListener(operationlistener);
equal.setOnClickListener(operationlistener);
	}
}
