package com.test;

import android.app.Activity;
import android.os.Bundle;

import com.easy.facebook.android.facebook.FBLoginManager;
import com.easy.facebook.android.facebook.FBLoginWithOutApi;
import com.easy.facebook.android.facebook.Facebook;
import com.easy.facebook.android.facebook.LoginListener;

public class TestActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		FBLoginManager fbLoginManager = new FBLoginManager(this, 400, "",
				new String[] { "publish_stream" });
		FBLoginWithOutApi fbLoginOutApi = new FBLoginWithOutApi(this,
				"https://m.facebook.com/dialog/", new DiaLog(), fbLoginManager);
		
	}

	class DiaLog implements LoginListener {

		@Override
		public void loginSuccess(Facebook facebook) {

		}

		@Override
		public void logoutSuccess() {

		}

		@Override
		public void loginFail() {

		}

	}
}