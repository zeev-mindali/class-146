package com.jb.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView sum;
    private RelativeLayout num1;
    private char opr = ' ';
    private double totalSum = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //our method for setting up some things....
        setPointer();
    }

    private void setPointer() {
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

        switch (view.getId()) {
            case R.id.num1:
                myNum = myNum * 10 + 1;
                break;
            case R.id.num2:
                myNum = myNum * 10 + 2;
                break;
            case R.id.num3:
                myNum = myNum * 10 + 3;
                break;
            case R.id.num4:
                myNum = myNum * 10 + 4;
                break;
            case R.id.num5:
                myNum = myNum * 10 + 5;
                break;
            case R.id.num6:
                myNum = myNum * 10 + 6;
                break;
            case R.id.num7:
                myNum = myNum * 10 + 7;
                break;
            case R.id.num8:
                myNum = myNum * 10 + 8;
                break;
            case R.id.num9:
                myNum = myNum * 10 + 9;
                break;
            case R.id.num0:
                myNum = myNum * 10;
                break;

            //operations : /-div *-mul - min + plus
            case R.id.div:
                totalSum = myNum;
                opr = '/';
                myNum = 0;
                break;

            case R.id.mul:
                totalSum = myNum;
                opr = '*';
                myNum = 0;
                break;

            case R.id.min:
                totalSum = myNum;
                opr = '-';
                myNum = 0;
                break;
            case R.id.plus:
                totalSum = myNum;
                opr = '+';
                myNum = 0;
                break;
            case R.id.clr:
                myNum = 0;
                break;
            case R.id.ce:;
                myNum=0;
                totalSum=0;
                opr=' ';
                break;

            case R.id.eql:
                if (opr==' ') return;
                switch (opr) {
                    case '+':
                        myNum+=totalSum;
                        break;
                    case '-':
                        myNum=totalSum-myNum;
                        break;
                    case '*':
                        myNum*=totalSum;
                        break;

                    case '/':
                        if (myNum==0) {
                            Toast.makeText(this, "Can't divide by zero !!", Toast.LENGTH_LONG).show();
                            return;
                        }
                        myNum=totalSum/myNum;
                        break;
                    default:
                        sum.setText("WTF??");
                        return;
                }
                opr=' ';
        }

        sum.setText(String.valueOf(myNum));
    }
}