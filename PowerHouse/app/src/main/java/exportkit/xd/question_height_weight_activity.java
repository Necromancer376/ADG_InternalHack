
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc
	 *	@file 		workout_app
	 *	@date 		1633797277325
	 *	@title 		other
	 *	@author
	 *	@keywords
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


	package exportkit.xd;

	import android.app.Activity;
	import android.os.Bundle;
	import android.content.Intent;


	import android.view.View;
	import android.widget.Button;
	import android.widget.TextView;
	import android.widget.ImageView;

	public class question_height_weight_activity extends Activity {


		private View _bg__question_height_weight_ek2;
		private View home_indicator_ek4;
		private TextView right_title_ek3;
		private ImageView icon_ek3;
		private ImageView vector_ek13;
		private Button rectangle_66_ek10;
		private TextView done;
		private TextView what_do_we_call_you_;
		private TextView age;
		private TextView height;
		private TextView y_o;
		private TextView inches;
		private TextView fts;
		private TextView _19;
		private TextView your_name_here;
		private ImageView line_2;
		private View rectangle_374;
		private View rectangle_379;
		private View rectangle_375;
		private View rectangle_380;
		private View rectangle_376;
		private View rectangle_378;
		private View rectangle_377;
		private ImageView line_4;
		private View line_5;
		private TextView _2002;
		private TextView _10;
		private TextView _23;

		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.question_height_weight);


			_bg__question_height_weight_ek2 = (View) findViewById(R.id._bg__question_height_weight_ek2);
			home_indicator_ek4 = (View) findViewById(R.id.home_indicator_ek4);
			right_title_ek3 = (TextView) findViewById(R.id.right_title_ek3);
			icon_ek3 = (ImageView) findViewById(R.id.icon_ek3);
			vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
			rectangle_66_ek10 = (Button) findViewById(R.id.rectangle_66_ek10);
			done = (TextView) findViewById(R.id.done);
			what_do_we_call_you_ = (TextView) findViewById(R.id.what_do_we_call_you_);
			age = (TextView) findViewById(R.id.age);
			height = (TextView) findViewById(R.id.height);
			y_o = (TextView) findViewById(R.id.y_o);
			inches = (TextView) findViewById(R.id.inches);
			fts = (TextView) findViewById(R.id.fts);
			_19 = (TextView) findViewById(R.id._19);
			your_name_here = (TextView) findViewById(R.id.your_name_here);
			line_2 = (ImageView) findViewById(R.id.line_2);
			rectangle_374 = (View) findViewById(R.id.rectangle_374);
			rectangle_379 = (View) findViewById(R.id.rectangle_379);
			rectangle_375 = (View) findViewById(R.id.rectangle_375);
			rectangle_380 = (View) findViewById(R.id.rectangle_380);
			rectangle_376 = (View) findViewById(R.id.rectangle_376);
			rectangle_378 = (View) findViewById(R.id.rectangle_378);
			rectangle_377 = (View) findViewById(R.id.rectangle_377);
			line_4 = (ImageView) findViewById(R.id.line_4);
			line_5 = (View) findViewById(R.id.line_5);
			_2002 = (TextView) findViewById(R.id._2002);
			_10 = (TextView) findViewById(R.id._10);
			_23 = (TextView) findViewById(R.id._23);


			//custom code goes here
			rectangle_66_ek10.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivity();
				}
			});
		}

		private void launchActivity() {

			Intent intent = new Intent(this, question_profession_activity.class);
			startActivity(intent);
		}
	}
	
	