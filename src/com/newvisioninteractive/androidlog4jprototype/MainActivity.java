package com.newvisioninteractive.androidlog4jprototype;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ConfigureLog4J.configure();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	
    	SampleClass sampleClass = new SampleClass();
    	sampleClass.testLog();
    }
}
