package com.example.photo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity{

	private ImageView imv;
	private Button button;
	private TextView tv;
	private ImageButton t1;
	private ImageButton t2;
	public static int count = 0;
	public static final int[] photoList = new int[] {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6, R.drawable.b7};
	public static final String[] name = new String[] {"1", "2", "3", "4", "5", "6", "7"};
	public static final int length = name.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imv = (ImageView)findViewById(R.id.imv);
        tv = (TextView)findViewById(R.id.tv1);
        t1 = (ImageButton)findViewById(R.id.t1);
        t2 = (ImageButton)findViewById(R.id.t2);
        button = (Button)findViewById(R.id.bt1);
        t1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				count++;
				tv.setText(name[count%length]);
				imv.setImageResource(photoList[count%length]);
				count = count%length;
			}
		});
        t2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(count == 0)
					count = 6;
				else{
					count --;
					count = count%length;
				}
				tv.setText(name[count%length]);
				imv.setImageResource(photoList[count%length]);
			}
		});
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, second.class);
				/*
				Bundle bundle = new Bundle();
				bundle.putInt("picSrc",photoList[count%length]);
				intent.putExtras(bundle);
				*/
				intent.putExtra("picSrc", photoList[count%length]);
				startActivity(intent);
			}
		});
    }
}
