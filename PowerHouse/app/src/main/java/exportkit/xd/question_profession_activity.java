
	 
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

public class question_profession_activity extends Activity {

	
	private View _bg__question_profession_ek2;
	private ImageView notch_ek3;
	private ImageView rectangle_ek2;
	private ImageView combined_shape_ek1;
	private ImageView rectangle_ek3;
	private ImageView wifi_ek1;
	private ImageView mobile_signal_ek1;
	private View indicator_ek1;
	private ImageView _9_41_ek1;
	private View home_indicator_ek6;
	private TextView right_title_ek5;
	private ImageView icon_ek5;
	private ImageView vector_ek15;
	private View rectangle_66_ek12;
	private TextView male_ek2;
	private Button rectangle_66_ek13;
	private TextView student;
	private Button rectangle_66_ek14;
	private TextView working_professional;
	private Button rectangle_66_ek15;
	private TextView home_maker;
	private TextView what_do_you_do_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_profession);

		
		_bg__question_profession_ek2 = (View) findViewById(R.id._bg__question_profession_ek2);
		notch_ek3 = (ImageView) findViewById(R.id.notch_ek3);
		rectangle_ek2 = (ImageView) findViewById(R.id.rectangle_ek2);
		combined_shape_ek1 = (ImageView) findViewById(R.id.combined_shape_ek1);
		rectangle_ek3 = (ImageView) findViewById(R.id.rectangle_ek3);
		wifi_ek1 = (ImageView) findViewById(R.id.wifi_ek1);
		mobile_signal_ek1 = (ImageView) findViewById(R.id.mobile_signal_ek1);
		indicator_ek1 = (View) findViewById(R.id.indicator_ek1);
		_9_41_ek1 = (ImageView) findViewById(R.id._9_41_ek1);
		home_indicator_ek6 = (View) findViewById(R.id.home_indicator_ek6);
		right_title_ek5 = (TextView) findViewById(R.id.right_title_ek5);
		icon_ek5 = (ImageView) findViewById(R.id.icon_ek5);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		rectangle_66_ek12 = (View) findViewById(R.id.rectangle_66_ek12);
		male_ek2 = (TextView) findViewById(R.id.male_ek2);
		rectangle_66_ek13 = (Button) findViewById(R.id.rectangle_66_ek13);
		student = (TextView) findViewById(R.id.student);
		rectangle_66_ek14 = (Button) findViewById(R.id.rectangle_66_ek14);
		working_professional = (TextView) findViewById(R.id.working_professional);
		rectangle_66_ek15 = (Button) findViewById(R.id.rectangle_66_ek15);
		home_maker = (TextView) findViewById(R.id.home_maker);
		what_do_you_do_ = (TextView) findViewById(R.id.what_do_you_do_);
	
		
		//custom code goes here
		rectangle_66_ek13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});

		rectangle_66_ek14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});

		rectangle_66_ek15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});
	
	}

	private void launchActivity() {

		Intent intent = new Intent(this, question_medical_condition_activity.class);
		startActivity(intent);
	}
}
	
	