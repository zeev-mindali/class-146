package com.jb.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView sum;
    private RelativeLayout num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //our method for setting up some things....
        setPointer();
    }

    private void setPointer(){
        sum = findViewById(R.id.sum);
        //change the text inside the text view
        //sum.setText("Zeev Mindali");

        //not a good way if we have more then two onClick events....
//        num1 = findViewById(R.id.num1);
//        num1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                if (sum.getText().toString().equals("0")){
////                    sum.setText("1");
////                    return;
////                }
////                sum.setText(sum.getText().toString().concat("1"));
//                double myNum = Double.parseDouble(sum.getText().toString());
//                myNum=myNum*10+1;
//                sum.setText(String.valueOf(myNum));
//            }
//        });
    }


    @Override
    public void onClick(View view) {
        double myNum = Double.parseDouble(sum.getText().toString());

        switch (view.getId()){
            case R.id.num1:
                myNum=myNum*10+1;
                break;

            case R.id.clr:
                myNum=0;
        }

        sum.setText(String.valueOf(myNum));
    }
}