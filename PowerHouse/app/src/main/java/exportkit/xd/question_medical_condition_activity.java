
	 
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

public class question_medical_condition_activity extends Activity {

	
	private View _bg__question_medical_condition_ek2;
	private ImageView notch_ek5;
	private ImageView rectangle_ek4;
	private ImageView combined_shape_ek2;
	private ImageView rectangle_ek5;
	private ImageView wifi_ek2;
	private ImageView mobile_signal_ek2;
	private View indicator_ek2;
	private ImageView _9_41_ek2;
	private View home_indicator_ek7;
	private TextView right_title_ek6;
	private ImageView icon_ek6;
	private ImageView vector_ek16;
	private View rectangle_66_ek16;
	private TextView male_ek3;
	private Button rectangle_66_ek17;
	private TextView yes;
	private Button rectangle_66_ek18;
	private TextView no;
	private TextView any_medical_condition_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_medical_condition);

		
		_bg__question_medical_condition_ek2 = (View) findViewById(R.id._bg__question_medical_condition_ek2);
		notch_ek5 = (ImageView) findViewById(R.id.notch_ek5);
		rectangle_ek4 = (ImageView) findViewById(R.id.rectangle_ek4);
		combined_shape_ek2 = (ImageView) findViewById(R.id.combined_shape_ek2);
		rectangle_ek5 = (ImageView) findViewById(R.id.rectangle_ek5);
		wifi_ek2 = (ImageView) findViewById(R.id.wifi_ek2);
		mobile_signal_ek2 = (ImageView) findViewById(R.id.mobile_signal_ek2);
		indicator_ek2 = (View) findViewById(R.id.indicator_ek2);
		_9_41_ek2 = (ImageView) findViewById(R.id._9_41_ek2);
		home_indicator_ek7 = (View) findViewById(R.id.home_indicator_ek7);
		right_title_ek6 = (TextView) findViewById(R.id.right_title_ek6);
		icon_ek6 = (ImageView) findViewById(R.id.icon_ek6);
		vector_ek16 = (ImageView) findViewById(R.id.vector_ek16);
		rectangle_66_ek16 = (View) findViewById(R.id.rectangle_66_ek16);
		male_ek3 = (TextView) findViewById(R.id.male_ek3);
		rectangle_66_ek17 = (Button) findViewById(R.id.rectangle_66_ek17);
		yes = (TextView) findViewById(R.id.yes);
		rectangle_66_ek18 = (Button) findViewById(R.id.rectangle_66_ek18);
		no = (TextView) findViewById(R.id.no);
		any_medical_condition_ = (TextView) findViewById(R.id.any_medical_condition_);
	
		
		//custom code goes here
		rectangle_66_ek17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

			}
		});

		rectangle_66_ek18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});
	}

	private void launchActivity() {

		Intent intent = new Intent(this, question_goals_activity.class);
		startActivity(intent);
	}
}
	
	