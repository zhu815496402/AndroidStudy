package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	private Button loginButton;
	protected void onCreate1(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		loginButton = (Button) findViewById(R.id.button1);
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				System.out.println("Button");
				
			}
		});
	}
	private ImageButton ImaButton;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImaButton = (ImageButton) findViewById(R.id.imageButton1);
		ImaButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				System.out.println("ImageButton");
				
			}
		});
	}
}
