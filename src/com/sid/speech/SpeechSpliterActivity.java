package com.sid.speech;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpeechSpliterActivity extends Activity {
	Button btnClick;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnClick=(Button) findViewById(R.id.btnClick);
        
        btnClick.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "click me", Toast.LENGTH_SHORT).show();
				
			}
		});
    }
}