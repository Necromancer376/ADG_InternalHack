
	 
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
	import android.widget.EditText;
	import android.widget.TextView;
	import android.widget.ImageView;

	public class loginin_activity extends Activity {


		private View _bg__loginin_ek2;
		private View home_indicator_ek1;
		private TextView right_title;
		private ImageView icon;
		private TextView login;
		private TextView login_with;
		private TextView or;
		private EditText rectangle_66;
		//	private TextView e_mail_id_;
		private TextView abc_gmail_com;
		private EditText rectangle_66_ek1;
		private TextView password_;
		private Button new_to_the_app__or_sign_up;
		//	private TextView minimum_8_characters;
		private Button rectangle_66_ek2;
		//	private TextView login_ek1;
		private View rectangle_63;
		private ImageView vector;
		private ImageView vector_ek1;
		private ImageView vector_ek2;
		private ImageView vector_ek3;
		private View rectangle_64;
		private ImageView vector_ek4;
		private ImageView vector_ek5;

		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.loginin);


			_bg__loginin_ek2 = (View) findViewById(R.id._bg__loginin_ek2);
			home_indicator_ek1 = (View) findViewById(R.id.home_indicator_ek1);
			right_title = (TextView) findViewById(R.id.right_title);
			icon = (ImageView) findViewById(R.id.icon);
			login = (TextView) findViewById(R.id.login);
			login_with = (TextView) findViewById(R.id.login_with);
			or = (TextView) findViewById(R.id.or);
			rectangle_66 = (EditText) findViewById(R.id.rectangle_66);
//		e_mail_id_ = (TextView) findViewById(R.id.e_mail_id_);
			abc_gmail_com = (TextView) findViewById(R.id.abc_gmail_com);
			rectangle_66_ek1 = (EditText) findViewById(R.id.rectangle_66_ek1);
			password_ = (TextView) findViewById(R.id.password_);
			new_to_the_app__or_sign_up = (Button) findViewById(R.id.new_to_the_app__or_sign_up);
//		minimum_8_characters = (TextView) findViewById(R.id.minimum_8_characters);
			rectangle_66_ek2 = (Button) findViewById(R.id.rectangle_66_ek2);
			rectangle_66_ek2.setText("Login");
//		login_ek1 = (TextView) findViewById(R.id.login_ek1);
			rectangle_63 = (View) findViewById(R.id.rectangle_63);
			vector = (ImageView) findViewById(R.id.vector);
			vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
			vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
			vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
			rectangle_64 = (View) findViewById(R.id.rectangle_64);
			vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
			vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);


			//custom code goes here
			rectangle_66_ek2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivityQuestion();
				}
			});

			new_to_the_app__or_sign_up.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

					launchActivitySignUp();
				}
			});
		}

		private void launchActivityQuestion() {

			Intent intent = new Intent(this, question_preference_activity.class);
			startActivity(intent);
		}

		private void launchActivitySignUp() {

			Intent intent = new Intent(this, signup_activity.class);
			startActivity(intent);
		}
	}
	
	