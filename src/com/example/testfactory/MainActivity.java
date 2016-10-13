package com.example.testfactory;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		IHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
//		whiteHuman.cry();
//		whiteHuman.eat();
//		whiteHuman.sleep();
		
		for(int i=0;i<10;i++){
			IHuman human = HumanFactory.createHuman();
			human.cry();
			human.eat();
			human.sleep();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
