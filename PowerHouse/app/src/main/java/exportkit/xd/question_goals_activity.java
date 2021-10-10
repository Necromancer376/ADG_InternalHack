
	 
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

public class question_goals_activity extends Activity {

	
	private View _bg__question_goals_ek2;
	private ImageView notch_ek7;
	private ImageView rectangle_ek6;
	private ImageView combined_shape_ek3;
	private ImageView rectangle_ek7;
	private ImageView wifi_ek3;
	private ImageView mobile_signal_ek3;
	private View indicator_ek3;
	private ImageView _9_41_ek3;
	private View home_indicator_ek8;
	private TextView right_title_ek7;
	private ImageView icon_ek7;
	private ImageView vector_ek17;
	private View rectangle_66_ek19;
	private TextView male_ek4;
	private Button rectangle_66_ek20;
	private TextView stay_lean;
	private Button rectangle_66_ek21;
	private TextView gain_muscle_mass;
	private Button rectangle_66_ek22;
	private TextView mental_health;
	private Button rectangle_66_ek23;
	private TextView saty_active;
	private Button rectangle_66_ek24;
	private TextView lose_fat;
	private TextView what_s_your_goal_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_goals);

		
		_bg__question_goals_ek2 = (View) findViewById(R.id._bg__question_goals_ek2);
		notch_ek7 = (ImageView) findViewById(R.id.notch_ek7);
		rectangle_ek6 = (ImageView) findViewById(R.id.rectangle_ek6);
		combined_shape_ek3 = (ImageView) findViewById(R.id.combined_shape_ek3);
		rectangle_ek7 = (ImageView) findViewById(R.id.rectangle_ek7);
		wifi_ek3 = (ImageView) findViewById(R.id.wifi_ek3);
		mobile_signal_ek3 = (ImageView) findViewById(R.id.mobile_signal_ek3);
		indicator_ek3 = (View) findViewById(R.id.indicator_ek3);
		_9_41_ek3 = (ImageView) findViewById(R.id._9_41_ek3);
		home_indicator_ek8 = (View) findViewById(R.id.home_indicator_ek8);
		right_title_ek7 = (TextView) findViewById(R.id.right_title_ek7);
		icon_ek7 = (ImageView) findViewById(R.id.icon_ek7);
		vector_ek17 = (ImageView) findViewById(R.id.vector_ek17);
		rectangle_66_ek19 = (View) findViewById(R.id.rectangle_66_ek19);
		male_ek4 = (TextView) findViewById(R.id.male_ek4);
		rectangle_66_ek20 = (Button) findViewById(R.id.rectangle_66_ek20);
		stay_lean = (TextView) findViewById(R.id.stay_lean);
		rectangle_66_ek21 = (Button) findViewById(R.id.rectangle_66_ek21);
		gain_muscle_mass = (TextView) findViewById(R.id.gain_muscle_mass);
		rectangle_66_ek22 = (Button) findViewById(R.id.rectangle_66_ek22);
		mental_health = (TextView) findViewById(R.id.mental_health);
		rectangle_66_ek23 = (Button) findViewById(R.id.rectangle_66_ek23);
		saty_active = (TextView) findViewById(R.id.saty_active);
		rectangle_66_ek24 = (Button) findViewById(R.id.rectangle_66_ek24);
		lose_fat = (TextView) findViewById(R.id.lose_fat);
		what_s_your_goal_ = (TextView) findViewById(R.id.what_s_your_goal_);
	
		
		//custom code goes here
		rectangle_66_ek20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivityQuestion();
			}
		});

		rectangle_66_ek21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivityQuestion();
			}
		});

		rectangle_66_ek22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivityQuestion();
			}
		});

		rectangle_66_ek23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivityQuestion();
			}
		});

		rectangle_66_ek24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivityQuestion();
			}
		});
	}

	private void launchActivityQuestion() {

		Intent intent = new Intent(this, question_preference_activity.class);
		startActivity(intent);
	}
}
	
	