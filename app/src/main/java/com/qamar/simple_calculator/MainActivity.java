package com.qamar.simple_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    Button clear, bracket, percentage, divide, add, subtract, multiply, equal, minusValue;

    Button one, two, three, four, five, six, seven, eight, nine, point, zero ;

    boolean mAddition, mSubtract, mMultiplication, mDivision ;
    float Value1, Value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //code for hide title bar.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView1);

        clear = (Button)findViewById(R.id.buttonClearText);
        bracket = (Button)findViewById(R.id.buttonBracket);
        percentage = (Button)findViewById(R.id.buttonPercentage);
        divide = (Button)findViewById(R.id.buttonDivide);
        add = (Button)findViewById(R.id.buttonAdd);
        subtract = (Button)findViewById(R.id.buttonSubtraction);
        multiply = (Button)findViewById(R.id.buttonMultiply);
        equal = (Button)findViewById(R.id.buttonEqual);
        minusValue = (Button)findViewById(R.id.buttonMinusValue);

        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        point = (Button)findViewById(R.id.buttonPoint);
        zero = (Button)findViewById(R.id.buttonZero);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(null);
            }
        });


        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String S = textView.getText().toString();

            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "%");

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "/");

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "+");
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "-");

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "*");

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });


        minusValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "5");

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "6");

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "9");

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + ".");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "0");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView == null){
                    textView.setText("");
                }else {
                    Value1 = Float.parseFloat(textView.getText() + "");
                    mAddition = true;
                    textView.setText(null);
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value1 = Float.parseFloat(textView.getText() + "");
                mSubtract = true ;
                textView.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value1 = Float.parseFloat(textView.getText() + "");
                mMultiplication  = true ;
                textView.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value1 = Float.parseFloat(textView.getText() + "");
                mDivision  = true ;
                textView.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(textView.getText() + "");

                if (mAddition == true){

                    textView.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    textView.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    textView.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    textView.setText(Value1 / Value2+"");
                    mDivision=false;
                }
            }
        });

    }
}
