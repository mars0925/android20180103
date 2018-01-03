package com.mars.android20180103;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb ,rb2,rb3;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RadioButton教學
        rb = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rg = (RadioGroup)findViewById(R.id.radiogroup);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,String.valueOf(rb.getId()),Toast.LENGTH_SHORT).show();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,String.valueOf(rb2.getId()),Toast.LENGTH_SHORT).show();
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,String.valueOf(rb3.getId()),Toast.LENGTH_SHORT).show();
            }
        });
        //直接用Radiogroup做
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rg.getCheckedRadioButtonId())
                {
                    case R.id.radioButton:
                        Toast.makeText(MainActivity.this,"fist button",Toast.LENGTH_SHORT).show();
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this,"SECOND button",Toast.LENGTH_SHORT).show();
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity.this,"third button",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
    /*老師寫的方式
    public void click1(View v)
    {
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        switch(rg.getCheckedRadioButtonId())
        {
            case R.id.radioButton:
                Toast.makeText(MainActivity.this, "第一個按鈕", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this, "第二個按鈕", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                Toast.makeText(MainActivity.this, "第三個按鈕", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    */
}
