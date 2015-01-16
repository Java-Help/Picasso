package ru.javahelp.picasso;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.squareup.picasso.*;
import android.content.*;
import android.net.*;

public class MainActivity extends Activity{
		
	ImageView image1, image2, image3;
		Context context = this;

		@Override
		public void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);

			image1 = (ImageView) findViewById(R.id.image1);
			image2 = (ImageView) findViewById(R.id.image2);
			
			Picasso.with(context).setIndicatorsEnabled(true);

			Picasso.with(context)
				.load("http://i.imgur.com/DvpvklR.png")
				.placeholder(R.drawable.placeholder)
				.error(R.drawable.error)
				.fit()
				.into(image1);
			
			Picasso.with(context)
				.load(R.drawable.image)
				.placeholder(R.drawable.placeholder)
				.error(R.drawable.error)
				.fit()
				.into(image2);
		}
	}
	
