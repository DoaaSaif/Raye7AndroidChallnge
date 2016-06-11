package com.raye7.reddit.Listener;

import android.os.Parcelable;

import java.util.ArrayList;

public interface AsyncTaskListener
{
	public void onSuccessRemoteCallComplete(int operation, String result);

	public void onFailRemoteCallComplete(int operation,String result);


}
