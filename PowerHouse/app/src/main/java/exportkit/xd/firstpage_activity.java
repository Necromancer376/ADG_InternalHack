
	 
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
	import android.widget.TextView;
	import android.widget.ImageView;
	import java.util.concurrent.TimeUnit;

	public class firstpage_activity extends Activity {


		private View _bg__firstpage_ek2;
		private View home_indicator;
		private TextView powerhouse;
		private ImageView logo;

		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.firstpage);


			_bg__firstpage_ek2 = (View) findViewById(R.id._bg__firstpage_ek2);
			home_indicator = (View) findViewById(R.id.home_indicator);
			powerhouse = (TextView) findViewById(R.id.powerhouse);
			logo = (ImageView) findViewById(R.id.logo);

			//custom code goes here
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}

			launchActivity();

		}

		private void launchActivity() {

			Intent intent = new Intent(this, loginin_activity.class);
			startActivity(intent);
		}
	}
	
	