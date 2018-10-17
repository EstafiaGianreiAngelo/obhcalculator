package com.android.obhcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity {
	private Button button0;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button buttonA;
	private Button buttonB;
	private Button buttonC;
	private Button buttonD;
	private Button buttonE;
	private Button buttonF;
	private Button buttonAdd;
	private Button buttonSubtract;
	private Button buttonMultiply;
	private Button buttonDivide;
	private Button buttonEquals;
	private Button buttonClear;
	private Button buttonDel;
	
	protected boolean clearEditText;
	protected int numberSystem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);

		buttonA = (Button) findViewById(R.id.buttonA);
		buttonB = (Button) findViewById(R.id.buttonB);
		buttonC = (Button) findViewById(R.id.buttonC);
		buttonD = (Button) findViewById(R.id.buttonD);
		buttonE = (Button) findViewById(R.id.buttonE);
		buttonF = (Button) findViewById(R.id.buttonF);

		buttonAdd = (Button) findViewById(R.id.buttonAdd);
		buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
		buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
		buttonDivide = (Button) findViewById(R.id.buttonDivide);
		buttonEquals = (Button) findViewById(R.id.buttonEquals);
		buttonClear = (Button) findViewById(R.id.buttonClear);
		buttonDel = (Button) findViewById(R.id.buttonDel);

		final Spinner spinnerNumberSystem = (Spinner) findViewById(R.id.spinnerNumberSystem);

		Button[] insertButtons = {button0, button1, button2, button3,
				button4, button5, button6, button7, 
				button8, button9, buttonA, buttonB, 
				buttonC, buttonD, buttonE, buttonF,
				buttonAdd, buttonMultiply, buttonSubtract, buttonDivide};
		
		for (final Button button : insertButtons) {
			button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					/* TODO: 
					 * If clearEditText is true,
					 * clear the editText and
					 * set clearEditText to false;
					 */
					
					/* TODO: 
					 * Get the text of the button and
					 * insert it to the editText at the position of the cursor.
					 */
				}
			});
		}

		buttonDel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				/*
				 * TODO:
				 * Remove a character from the editText 
				 * at the position of the cursor.
				 */			
			}
		});

		buttonClear.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				/*
				 * TODO:
				 * Clear the editText.
				 */
			}
		});

		buttonEquals.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				/*
				 * TODO:
				 * Get the contents of the editText and
				 * call the evaluate method of the ArithmeticExpression class to 
				 * derive the result.
				 * 
				 * Convert the result according to the numberSystem
				 * and put it at the editText.
				 * 
				 * Set clearEditText to true.
				 */
			}
		});

		spinnerNumberSystem.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> spinner,
							View container, int position, long id) {
				switch (position) {
					case 0:
						numberSystem = 2;
						enableBinaryDigitsOnly();
						break;

					case 1:
						numberSystem = 8;
						enableOctalDigitsOnly();
						break;
						
					case 2:
						numberSystem = 16;
						enableHexaDigitsOnly();
						break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
	}

	private void enableBinaryDigitsOnly() {
		/* TODO: enable the buttons for the digits
		 * zero & one. 
		 */
	}

	private void enableOctalDigitsOnly() {
		/* TODO: enable the buttons for the digits
		 * 0 1, 2, 3, 4, 5, 6, 7. 
		 */
	}

	private void enableHexaDigitsOnly() {
		/* TODO: enable the buttons of all digits
		 * and all of the letters A, B, C, D, E, F.
		 */
	}
}
