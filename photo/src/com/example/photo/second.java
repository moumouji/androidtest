package com.example.photo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		ImageView imv = (ImageView )findViewById(R.id.imv);
		/*
		Bundle bundle = getIntent().getExtras();
		int pic = bundle.getInt("picSrc");
		*/
		int pic = getIntent().getIntExtra("picSrc", 0);
		imv.setImageResource(pic);
	}
}
