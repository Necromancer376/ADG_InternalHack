
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		workout_app
	 *	@date 		1633849538007
	 *	@title 		other
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class question_preference_activity extends Activity {

	
	private View _bg__question_preference_ek2;
	private ImageView notch_ek9;
	private ImageView rectangle_ek8;
	private ImageView combined_shape_ek4;
	private ImageView rectangle_ek9;
	private ImageView wifi_ek4;
	private ImageView mobile_signal_ek4;
	private View indicator_ek4;
	private ImageView _9_41_ek4;
	private View home_indicator_ek9;
	private TextView right_title_ek8;
	private ImageView icon_ek8;
	private ImageView vector_ek18;
	private View rectangle_66_ek25;
	private TextView male_ek5;
	private Button rectangle_66_ek26;
	private TextView yoga_and_meditation;
	private Button rectangle_66_ek27;
	private TextView home_workout;
	private Button rectangle_66_ek29;
	private TextView weight_training_and_cardio;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_preference);

		
		_bg__question_preference_ek2 = (View) findViewById(R.id._bg__question_preference_ek2);
		notch_ek9 = (ImageView) findViewById(R.id.notch_ek9);
		rectangle_ek8 = (ImageView) findViewById(R.id.rectangle_ek8);
		combined_shape_ek4 = (ImageView) findViewById(R.id.combined_shape_ek4);
		rectangle_ek9 = (ImageView) findViewById(R.id.rectangle_ek9);
		wifi_ek4 = (ImageView) findViewById(R.id.wifi_ek4);
		mobile_signal_ek4 = (ImageView) findViewById(R.id.mobile_signal_ek4);
		indicator_ek4 = (View) findViewById(R.id.indicator_ek4);
		_9_41_ek4 = (ImageView) findViewById(R.id._9_41_ek4);
		home_indicator_ek9 = (View) findViewById(R.id.home_indicator_ek9);
		right_title_ek8 = (TextView) findViewById(R.id.right_title_ek8);
		icon_ek8 = (ImageView) findViewById(R.id.icon_ek8);
		vector_ek18 = (ImageView) findViewById(R.id.vector_ek18);
		rectangle_66_ek25 = (View) findViewById(R.id.rectangle_66_ek25);
		male_ek5 = (TextView) findViewById(R.id.male_ek5);
		rectangle_66_ek26 = (Button) findViewById(R.id.rectangle_66_ek26);
		yoga_and_meditation = (TextView) findViewById(R.id.yoga_and_meditation);
		rectangle_66_ek27 = (Button) findViewById(R.id.rectangle_66_ek27);
		home_workout = (TextView) findViewById(R.id.home_workout);
		rectangle_66_ek29 = (Button) findViewById(R.id.rectangle_66_ek29);
		weight_training_and_cardio = (TextView) findViewById(R.id.weight_training_and_cardio);
	
		
		//custom code goes here
		rectangle_66_ek26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});

		rectangle_66_ek27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});

		rectangle_66_ek29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});
	}
	private void launchActivity() {

		Intent intent = new Intent(this, workout_app_activity.class);
		startActivity(intent);
	}
}
	
	