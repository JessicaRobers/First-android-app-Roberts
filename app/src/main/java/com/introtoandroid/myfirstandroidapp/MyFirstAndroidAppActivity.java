package com.introtoandroid.myfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MyFirstAndroidAppActivity extends AppCompatActivity {

    private static final String DEBUG_TAG= "MyFirstAppLogging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfirstandroidapp);
        Log.i(DEBUG_TAG,    "In the onCreate() method of the MyFirstAndroidAppActivity Class");
   //     forceError();
    }

    public void forceError(){
        if(true){
            throw new Error("Whoops");
        }
   }
}
