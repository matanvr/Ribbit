package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class RibbitApplication extends Application{
	@Override
	public void onCreate() {
	  super.onCreate();
	  Parse.initialize(this, "6fA0fg4yHJMiPbr2V26rUv67M1b7iOzKc9ocv2SH", "tUBit6KFTmu7R5bX9yhumhJU5x1ahO7ZbeuEQodS");
	}


}
