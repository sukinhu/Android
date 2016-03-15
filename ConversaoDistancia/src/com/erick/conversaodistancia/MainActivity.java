package com.erick.conversaodistancia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText txtPes;
	TextView lblPolegadas;
	TextView lblJardas;
	TextView lblMilhas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txtPes = (EditText) findViewById(R.id.txtPes);
		lblPolegadas = (TextView) findViewById(R.id.lblPolegadas);
		lblJardas = (TextView) findViewById(R.id.lblJardas);
		lblMilhas = (TextView) findViewById(R.id.lblMilhas);

	}

	public void btnOkClick(View v) {

		Double pes = Double.parseDouble(txtPes.getText().toString());

		Double polegadas = pes * 12;
		Double jardas = pes / 3;
		Double milhas = jardas / 1760;

		lblPolegadas.setText(polegadas + " pol.");
		lblJardas.setText(jardas + " yd.");
		lblMilhas.setText(milhas + " mil.");

		escondeTeclado();
		
	}

	public void escondeTeclado() {
		InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(lblMilhas.getWindowToken(), 0);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	}

}
