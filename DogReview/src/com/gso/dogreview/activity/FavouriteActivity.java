package com.gso.dogreview.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gso.dogreview.R;

public class FavouriteActivity extends FragmentActivity implements
		OnClickListener {

	private ImageButton imgBtnHome;
	private ImageButton imgBtnSetting;
	private RelativeLayout rlSettingMenu;
	private Context context;
	private Button btnEnter;
	private TextView tvHeaderTitle;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.index_screen);
		imgBtnHome = (ImageButton) findViewById(R.id.imgBtn_home);
		imgBtnSetting = (ImageButton) findViewById(R.id.imgBtn_setting);
		btnEnter = (Button) findViewById(R.id.btnEnter);
		rlSettingMenu = (RelativeLayout) findViewById(R.id.rlMenu_setting);
		imgBtnHome.setOnClickListener(this);
		imgBtnSetting.setOnClickListener(this);
		tvHeaderTitle = (TextView)findViewById(R.id.tvHeaderTitle);
		tvHeaderTitle.setText("Favourtes");
		
		context = this;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		if (id == R.id.imgBtn_home) {
			exeHomeClicked();
		} else if (id == R.id.imgBtn_setting) {
			exeMenuClicked();
		}
	}

	private void exeHomeClicked() {
		// TODO Auto-generated method stub

	}

	private void exeMenuClicked() {
		// TODO Auto-generated method stub
		if (rlSettingMenu.getVisibility() == View.VISIBLE) {
			setViewVisibility(false);
		} else {
			setViewVisibility(true);
		}
	}

	private void setViewVisibility(boolean b) {
		// TODO Auto-generated method stub
		rlSettingMenu.setVisibility(b ? View.VISIBLE : View.GONE);
	}

	public void onSettingClicked(View v) {
		Intent i = new Intent(context, SettingActivity.class);
		startActivity(i);
	}

	public void onFavouriteClicked(View v) {
		Intent i = new Intent(context, FavouriteActivity.class);
		startActivity(i);
	}
}
