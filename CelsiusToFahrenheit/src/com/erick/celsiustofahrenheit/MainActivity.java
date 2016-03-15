package com.erick.celsiustofahrenheit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText txtCelcius;

	TextView lblTemperatura;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtCelcius = (EditText) findViewById(R.id.txtCelcius);
		lblTemperatura = (TextView) findViewById(R.id.lblFahrenheit);
		
		
	}

	public void btnConverterClick(View v){
		
		Double celcius = Double.parseDouble(txtCelcius.getText().toString());

		Double temperatura =  celcius * 9/5 + 32;
		
		lblTemperatura.setText(temperatura + " �F");
		
		escondeTeclado();
	}
	
	public void escondeTeclado() {
		InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(lblTemperatura.getWindowToken(), 0);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	}
	
}
