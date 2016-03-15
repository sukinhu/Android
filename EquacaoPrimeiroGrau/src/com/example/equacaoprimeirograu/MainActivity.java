package com.example.equacaoprimeirograu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView lblX;
	EditText txtA;
	EditText txtB;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lblX = (TextView) findViewById(R.id.lblX);
		txtA = (EditText) findViewById(R.id.txtA);
		txtB = (EditText) findViewById(R.id.txtB);

	}

	public void btnOk(View v) {

		Double a = Double.parseDouble(txtA.getText().toString());
		Double b = Double.parseDouble(txtB.getText().toString());

		Double x = (-b) / (-a);

		lblX.setText("X = " + x);

		escondeTeclado();

	}

	public void escondeTeclado() {
		InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(lblX.getWindowToken(), 0);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	}

}
