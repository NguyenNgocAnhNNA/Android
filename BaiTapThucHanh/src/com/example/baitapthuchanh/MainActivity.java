package com.example.baitapthuchanh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	EditText txta,txtb,txtkq;
	Button btnThucHien;
	RadioButton rdcong,rdtru,rdnhan,rdchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta=(EditText)findViewById(R.id.txta);
        txtb=(EditText)findViewById(R.id.txtb);
        txtkq=(EditText)findViewById(R.id.txtkq);
        rdcong=(RadioButton)findViewById(R.id.rdcong);
        rdtru=(RadioButton)findViewById(R.id.rdtru);
        rdnhan=(RadioButton)findViewById(R.id.rdnhan);
        rdchia=(RadioButton)findViewById(R.id.rdchia);
        btnThucHien=(Button)findViewById(R.id.btnThucHien);
        btnThucHien.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float a=Float.parseFloat(txta.getText().toString());
				float b=Float.parseFloat(txtb.getText().toString());
				if(rdcong.isChecked()){
					txtkq.setText((a+b)+"");}
			if(rdtru.isChecked()){
				txtkq.setText((a-b)+"");}
        if(rdnhan.isChecked()){
			txtkq.setText((a*b)+"");}
    if(rdchia.isChecked()){
		txtkq.setText((a/b)+"");}
    }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}