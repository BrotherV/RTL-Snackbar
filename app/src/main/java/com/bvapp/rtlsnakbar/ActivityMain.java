package com.bvapp.rtlsnakbar;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bvapp.directionalsnackbar.SnackbarUtil;

public class ActivityMain extends AppCompatActivity {

	private Activity cActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		cActivity = this;

		final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		final CoordinatorLayout coordinatorLayout = findViewById(R.id.layMain);
		View.OnClickListener clickListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch (v.getId()){
					case R.id.btnLtr:
						SnackbarUtil.setSnackBarWithNoActionButton(fab, "RTL Snakbar with no action button",
								Color.GREEN, Color.DKGRAY, SnackbarUtil.LTR_DIRECTION);
						break;
					case R.id.btnRtl:
						SnackbarUtil.setSnackBarWithNoActionButton(fab, "این یک پیام فارسی است",
								Color.GREEN, Color.DKGRAY, SnackbarUtil.RTL_DIRECTION);
						break;
					case R.id.btnLtrAB:
						SnackbarUtil.showSnackBarWithActionButton(cActivity, fab,
								"RTL Snakbar with no action button", "OK",
								Color.GREEN, Color.YELLOW, Color.DKGRAY, SnackbarUtil.LTR_DIRECTION, new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Toast.makeText(cActivity, "OK button pressed", Toast.LENGTH_LONG).show();
									}
								});
						break;
					case R.id.btnRtlAB:
						SnackbarUtil.showSnackBarWithActionButton(cActivity, fab,
								"مایل به تکرار برنامه هستید؟", "تایید",
								Color.GREEN, Color.YELLOW, Color.DKGRAY, SnackbarUtil.RTL_DIRECTION, new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Toast.makeText(cActivity, "کلید تایید فشرده شد", Toast.LENGTH_LONG).show();
									}
								});
						break;
				}
			}
		};

		findViewById(R.id.btnLtr).setOnClickListener(clickListener);
		findViewById(R.id.btnRtl).setOnClickListener(clickListener);
		findViewById(R.id.btnLtrAB).setOnClickListener(clickListener);
		findViewById(R.id.btnRtlAB).setOnClickListener(clickListener);
	}
}
