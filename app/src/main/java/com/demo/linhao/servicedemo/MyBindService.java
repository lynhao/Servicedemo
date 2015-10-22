package com.demo.linhao.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyBindService extends Service{
	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		return new MyBinder();
	}
	public class MyBinder extends Binder{
		public MyBindService getService()
		{
			return MyBindService.this;
		}
	}
	@Override
	public void onCreate() {
		Log.i("info", "BindService--onCreate()");
		super.onCreate();
	}

	@Override
	public boolean onUnbind(Intent intent) {
		return super.onUnbind(intent);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	public void Play(){
		Log.i("info", "播放");
	}
	public void Pause(){
		Log.i("info", "暂停");
	}
	public void Pervious(){
		Log.i("info", "上一首");
	}
	public void next(){
		Log.i("info", "下一首");
	}
}
