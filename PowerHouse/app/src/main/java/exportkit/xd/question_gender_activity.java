
	 
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

	public class question_gender_activity extends Activity {


		private View _bg__question_gender_ek2;
		private View home_indicator_ek3;
		private TextView right_title_ek2;
		private ImageView icon_ek2;
		private ImageView vector_ek12;
		private View rectangle_66_ek6;
		private TextView male;
		private Button rectangle_66_ek7;
		private TextView male_ek1;
		private Button rectangle_66_ek8;
		private TextView female;
		private Button rectangle_66_ek9;
		private TextView non_binary;
		private TextView your_gender_;

		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.question_gender);


			_bg__question_gender_ek2 = (View) findViewById(R.id._bg__question_gender_ek2);
			home_indicator_ek3 = (View) findViewById(R.id.home_indicator_ek3);
			right_title_ek2 = (TextView) findViewById(R.id.right_title_ek2);
			icon_ek2 = (ImageView) findViewById(R.id.icon_ek2);
			vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
			rectangle_66_ek6 = (View) findViewById(R.id.rectangle_66_ek6);
			male = (TextView) findViewById(R.id.male);
			rectangle_66_ek7 = (Button) findViewById(R.id.rectangle_66_ek7);
			male_ek1 = (TextView) findViewById(R.id.male_ek1);
			rectangle_66_ek8 = (Button) findViewById(R.id.rectangle_66_ek8);
			female = (TextView) findViewById(R.id.female);
			rectangle_66_ek9 = (Button) findViewById(R.id.rectangle_66_ek9);
			non_binary = (TextView) findViewById(R.id.non_binary);
			your_gender_ = (TextView) findViewById(R.id.your_gender_);


			//custom code goes here

			rectangle_66_ek7.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivity();
				}
			});

			rectangle_66_ek8.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivity();
				}
			});

			rectangle_66_ek8.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivity();
				}
			});
		}

		private void launchActivity() {

			Intent intent = new Intent(this, question_height_weight_activity.class);
			startActivity(intent);
		}
	}
	
	