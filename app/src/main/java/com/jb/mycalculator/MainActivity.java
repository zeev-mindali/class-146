package com.jb.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView phoneNumber;
    private RelativeLayout num1;
    private boolean isDailing = false;
    private ImageView dialerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //our method for setting up some things....
        setPointer();
    }

    private void setPointer() {
        phoneNumber = findViewById(R.id.sum);
        dialerImage = findViewById(R.id.dialerImage);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.num1:
                phoneNumber.setText(phoneNumber.getText().toString().concat("1"));
                break;
            case R.id.num2:
                phoneNumber.setText(phoneNumber.getText().toString().concat("2"));
                break;
            case R.id.num3:
                phoneNumber.setText(phoneNumber.getText().toString().concat("3"));
                break;
            case R.id.num4:
                phoneNumber.setText(phoneNumber.getText().toString().concat("4"));
                break;
            case R.id.num5:
                phoneNumber.setText(phoneNumber.getText().toString().concat("5"));
                break;
            case R.id.num6:
                phoneNumber.setText(phoneNumber.getText().toString().concat("6"));
                break;
            case R.id.num7:
                phoneNumber.setText(phoneNumber.getText().toString().concat("7"));
                break;
            case R.id.num8:
                phoneNumber.setText(phoneNumber.getText().toString().concat("8"));
                break;
            case R.id.num9:
                phoneNumber.setText(phoneNumber.getText().toString().concat("9"));
                break;
            case R.id.num0:
                phoneNumber.setText(phoneNumber.getText().toString().concat("0"));
                break;
            case R.id.clr:
                phoneNumber.setText(
                        phoneNumber.getText().toString()
                                .substring(0, phoneNumber.getText().length() - 1)
                );
                break;
            case R.id.dial:
                isDailing = !isDailing;
                //we will change the image in few seconds (YOAV)
                if (isDailing) {
                    Toast.makeText(this, "Dialing: " + phoneNumber.getText().toString(), Toast.LENGTH_SHORT).show();
                    dialerImage.setImageResource(R.drawable.hangup);
                } else {
                    dialerImage.setImageResource(R.drawable.dial);
                    phoneNumber.setText("");
                }
        }
    }
}