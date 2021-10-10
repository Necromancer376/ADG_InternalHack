
	 
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

	public class signup_activity extends Activity {


		private View _bg__signup_ek2;
		private View home_indicator_ek2;
		private TextView right_title_ek1;
		private ImageView icon_ek1;
		private TextView sign_up;
		private TextView or_ek1;
		private View rectangle_66_ek3;
		private TextView password__ek1;
		private TextView minimum_8_characters_ek1;
		private View rectangle_66_ek4;
		private TextView password__ek2;
		private TextView minimum_8_characters_ek2;
		private View rectangle_63_ek1;
		private ImageView vector_ek6;
		private ImageView vector_ek7;
		private ImageView vector_ek8;
		private ImageView vector_ek9;
		private View rectangle_64_ek1;
		private ImageView vector_ek10;
		private ImageView vector_ek11;
		private Button rectangle_66_ek5;
		private TextView sign_up_ek1;

		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.signup);


			_bg__signup_ek2 = (View) findViewById(R.id._bg__signup_ek2);
			home_indicator_ek2 = (View) findViewById(R.id.home_indicator_ek2);
			right_title_ek1 = (TextView) findViewById(R.id.right_title_ek1);
			icon_ek1 = (ImageView) findViewById(R.id.icon_ek1);
			sign_up = (TextView) findViewById(R.id.sign_up);
			or_ek1 = (TextView) findViewById(R.id.or_ek1);
			rectangle_66_ek3 = (View) findViewById(R.id.rectangle_66_ek3);
			password__ek1 = (TextView) findViewById(R.id.password__ek1);
			minimum_8_characters_ek1 = (TextView) findViewById(R.id.minimum_8_characters_ek1);
			rectangle_66_ek4 = (View) findViewById(R.id.rectangle_66_ek4);
			password__ek2 = (TextView) findViewById(R.id.password__ek2);
			minimum_8_characters_ek2 = (TextView) findViewById(R.id.minimum_8_characters_ek2);
			rectangle_63_ek1 = (View) findViewById(R.id.rectangle_63_ek1);
			vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
			vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
			vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
			vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
			rectangle_64_ek1 = (View) findViewById(R.id.rectangle_64_ek1);
			vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
			vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
			rectangle_66_ek5 = (Button) findViewById(R.id.rectangle_66_ek5);
			sign_up_ek1 = (TextView) findViewById(R.id.sign_up_ek1);


			//custom code goes here
			rectangle_66_ek5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivity();
				}
			});
		}

		private void launchActivity() {

			Intent intent = new Intent(this, question_name_activity.class);
			startActivity(intent);
		}
	}
	
	