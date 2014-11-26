package cn.edu.gdmec.s07131027.drawableanimationdemo;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;


public class MainActivity extends Activity {
	private ImageView imageView;
	private Button bt;
	private AnimationDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imageView = (ImageView) findViewById(R.id.imageView1);
        bt = (Button) findViewById(R.id.button1);
        
        imageView.setBackgroundResource(R.drawable.drawable);
        
        drawable = (AnimationDrawable) imageView.getBackground();
        
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				drawable.start();		
			}
		});
       
    }
    
}
