package com.bvapp.directionalsnackbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mohsen on 12/31/2017.
 */

public class SnackbarUtil {

	public static final int RTL_DIRECTION = 0xA1;
	public static final int LTR_DIRECTION = 0xA2;

	public static void setSnackBarWithNoActionButton(View view, String title){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		setSnackBarWithNoActionButton(snackbar, 0, 0, null, 0, RTL_DIRECTION, false);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setSnackBarWithNoActionButton(View view, String title, int dir){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		setSnackBarWithNoActionButton(snackbar, 0, 0, null, 0, dir, false);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setSnackBarWithNoActionButton(View view, String title, Typeface tf,int dir){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		setSnackBarWithNoActionButton(snackbar, 0, 0, tf, 0, dir,false);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setSnackBarWithNoActionButton(View view, String title, int textColor, int backGroundColor, int dir){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		setSnackBarWithNoActionButton(snackbar, textColor, backGroundColor, null, 0, dir, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setSnackBarWithNoActionButton(View view, String title, int textColor, int backGroundColor, Typeface tf, int dir){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		setSnackBarWithNoActionButton(snackbar, textColor, backGroundColor, tf, 0, dir, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setSnackBarWithNoActionButton(View view, String title, int textColor, int backGroundColor, Typeface tf, float size, int dir){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		setSnackBarWithNoActionButton(snackbar, textColor, backGroundColor, tf, size, dir, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	private static void setSnackBarWithNoActionButton(Snackbar snackbar, int textColor, int backGroundColor,
	                                                  Typeface tf, float size, int dir, boolean isColorChange){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);
		// Changing action button text color
		View sbView = snackbar.getView();
		if(isColorChange){
			sbView.setBackgroundColor(backGroundColor);
		}

		TextView textTitle = (TextView)sbView.findViewById(android.support.design.R.id.snackbar_text);
		if(isColorChange){
			textTitle.setTextColor(textColor);
		}

		if(tf != null){
			textTitle.setTypeface(tf);
		}
		if(size > 0){
			textTitle.setTextSize(size);
		}
		if(dir == RTL_DIRECTION ){
			if (hasJellyBean()) {
				textTitle.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
				textTitle.setGravity(Gravity.RIGHT);
			}
		}
		snackbar.show();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle,
	                                                View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, 0, 0, 0, null, null, 0, 0 , LTR_DIRECTION, listener, false);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle, int dir,
	                                                 View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, 0, 0, 0, null, null, 0, 0 ,dir, listener, false);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle, Typeface tf, int dir,
	                                                View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, 0, 0, 0, tf, tf, 0, 0 ,dir, listener, false);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle,
	                                                int titleColor, int actionColor,
	                                                int backGroundColor, Typeface tf, int dir,
	                                                View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, titleColor, actionColor,
				backGroundColor, tf, tf, 0, 0 ,dir, listener, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle,
	                                                int titleColor, int actionColor,
	                                                int backGroundColor, int dir,
	                                                View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, titleColor, actionColor,
				backGroundColor, null, null, 0, 0 ,dir, listener, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle,
	                                                int titleColor, int actionColor,
	                                                int backGroundColor, Typeface tf, float textSize, int dir,
	                                                View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, titleColor, actionColor,
				backGroundColor, tf, tf, textSize, textSize ,dir, listener, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showSnackBarWithActionButton(Context context, View view, String title, String actionTitle,
	                                                int titleColor, int actionColor,
	                                                int backGroundColor, Typeface tf0 , Typeface tf1, float titleSize, float actionSize, int dir,
	                                                View.OnClickListener listener){
		// Changing message text color
		//snackbar.setActionTextColor(Color.RED);

		Snackbar snackbar = Snackbar
				.make(view, title, Snackbar.LENGTH_LONG);
		showSnackBarWithActionButton(context, snackbar, title, actionTitle, titleColor, actionColor,
				backGroundColor, tf0, tf1, titleSize, actionSize ,dir, listener, true);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	private static void showSnackBarWithActionButton(Context context, final Snackbar snackbar, String title, String actionTitle,
	                                                int titleColor, int actionColor,
													int backGroundColor, Typeface tf0, Typeface tf1, float size1, float size2, int dir,
	                                                final View.OnClickListener listener, boolean isColorChange){
		// Create the Snackbar
		if(dir == RTL_DIRECTION){
			if(isColorChange){
				snackbar.getView().setBackgroundColor(backGroundColor);
			}
			// Get the Snackbar's layout view
			Snackbar.SnackbarLayout layout = (Snackbar.SnackbarLayout) snackbar.getView();
			// Hide the text
			TextView textTitle = (TextView) layout.findViewById(android.support.design.R.id.snackbar_text);
			TextView textAction = (TextView)layout.findViewById(android.support.design.R.id.snackbar_action);
			textTitle.setVisibility(View.INVISIBLE);
			textAction.setVisibility(View.INVISIBLE);

			// Inflate our custom view
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View snackView = inflater.inflate(R.layout.layout_rtl_snackbar, null);
			// Configure the view

			Button btnSnackBar = (Button) snackView.findViewById(R.id.btnSnackBar);
			btnSnackBar.setText(actionTitle);
			if(isColorChange){
				btnSnackBar.setTextColor(actionColor);
			}
			if(tf1 != null){
				btnSnackBar.setTypeface(tf1);
			}
			if(size1 != 0){
				btnSnackBar.setTextSize(size1);
			}


			TextView textNewTitle = (TextView) snackView.findViewById(R.id.txtSnackBar);
			textNewTitle.setText(title);
			if(isColorChange){
				textNewTitle.setTextColor(titleColor);
			}
			if(tf0 != null){
				textNewTitle.setTypeface(tf0);
			}
			if(size2 != 0){
				textNewTitle.setTextSize(size2);
			}

			// Add the view to the Snackbar's layout
			layout.addView(snackView, 0);
			btnSnackBar.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					listener.onClick(view);
					snackbar.dismiss();
				}
			});
			snackbar.show();
		}else{
			snackbar.setAction(actionTitle, new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							listener.onClick(view);
						}
					});

			// Changing action button text color
			View sbView = snackbar.getView();
			if(isColorChange){
				sbView.setBackgroundColor(backGroundColor);
			}
			TextView textTitle = (TextView)sbView.findViewById(android.support.design.R.id.snackbar_text);
			if(isColorChange){
				textTitle.setTextColor(titleColor);
			}
			TextView textAction = (TextView)sbView.findViewById(android.support.design.R.id.snackbar_action);
			if(isColorChange){
				textAction.setTextColor(actionColor);
			}
			snackbar.show();
		}
	}

	private static boolean hasJellyBean(){
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
	}
}
