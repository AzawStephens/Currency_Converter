package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void convert(View view)
{
    EditText input = (EditText)findViewById(R.id.amountEditText);
    TextView euro = (TextView)findViewById(R.id.euroTextView);
    double inputDouble =  Double.parseDouble( input.getText().toString())* 0.7579;
    String inputStr = String.valueOf(inputDouble);
    euro.setText(inputStr);
    Toast.makeText(this,inputStr,Toast.LENGTH_LONG).show();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
