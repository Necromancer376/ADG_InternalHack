
	 
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class question_name_activity extends Activity {

	
	private View _bg__question_name_ek2;
	private ImageView notch_ek1;
	private ImageView rectangle;
	private ImageView combined_shape;
	private ImageView rectangle_ek1;
	private ImageView wifi;
	private ImageView mobile_signal;
	private View indicator;
	private ImageView _9_41;
	private View home_indicator_ek5;
	private TextView right_title_ek4;
	private ImageView icon_ek4;
	private ImageView vector_ek14;
	private TextView what_should_we_call_you_;
	private EditText your_name_here_ek1;
	private ImageView line_2_ek1;
	private Button rectangle_66_ek11;
	private TextView submit;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.question_name);

		
		_bg__question_name_ek2 = (View) findViewById(R.id._bg__question_name_ek2);
		notch_ek1 = (ImageView) findViewById(R.id.notch_ek1);
		rectangle = (ImageView) findViewById(R.id.rectangle);
		combined_shape = (ImageView) findViewById(R.id.combined_shape);
		rectangle_ek1 = (ImageView) findViewById(R.id.rectangle_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		mobile_signal = (ImageView) findViewById(R.id.mobile_signal);
		indicator = (View) findViewById(R.id.indicator);
		_9_41 = (ImageView) findViewById(R.id._9_41);
		home_indicator_ek5 = (View) findViewById(R.id.home_indicator_ek5);
		right_title_ek4 = (TextView) findViewById(R.id.right_title_ek4);
		icon_ek4 = (ImageView) findViewById(R.id.icon_ek4);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		what_should_we_call_you_ = (TextView) findViewById(R.id.what_should_we_call_you_);
		your_name_here_ek1 = (EditText) findViewById(R.id.your_name_here_ek1);
		line_2_ek1 = (ImageView) findViewById(R.id.line_2_ek1);
		rectangle_66_ek11 = (Button) findViewById(R.id.rectangle_66_ek11);
		submit = (TextView) findViewById(R.id.submit);
	
		
		//custom code goes here
		rectangle_66_ek11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				launchActivity();
			}
		});
	}

	private void launchActivity() {

		Intent intent = new Intent(this, question_gender_activity.class);
		startActivity(intent);
	}
}
	
	