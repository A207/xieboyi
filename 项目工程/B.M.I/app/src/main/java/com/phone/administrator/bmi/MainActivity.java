package com.phone.administrator.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(calcBMI);


    }

    private OnClickListener calcBMI = new OnClickListener() {
        public void onClick(View view) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText fieldheight = (EditText) findViewById(R.id.shengao2);
            EditText fieldweight = (EditText) findViewById(R.id.tizhong2);

            double height = Double.parseDouble(fieldheight.getText().toString()) / 100;
            double weight = Double.parseDouble(fieldweight.getText().toString());
            double BMI = weight / (height * height);
            TextView result = (TextView) findViewById(R.id.result);
            result.setText(" BMI  :"+ nf.format(BMI));

            TextView fieldsuggest = (TextView) findViewById(R.id.suggest);
            if (BMI < 18.5) {
                fieldsuggest.setText(R.string.weight_thin1);

            } else if (BMI >= 18.5&&BMI<24) {

                    fieldsuggest.setText(R.string.weight_perfect);
            } else if (BMI >= 24&&BMI<28) {

                    fieldsuggest.setText(R.string.weight_fat1);

            } else {
                fieldsuggest.setText(R.string.weight_fat4);
            }

        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


