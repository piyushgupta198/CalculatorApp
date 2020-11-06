package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button backButton;
    Button plusButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton;
    Button reminderButton;
    Button equalButton;
    Button helpButton;
    Button dotButton;
    Button clearButton;
    TextView numberTextView;
    TextView tempNumberTextView;
    float number1;
    String tempNumber;
    float number2;
    float finalNumber =0;
    boolean addition=false, reminder=false, division=false, minus=false, multiply=false;boolean checkFinalNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        button0 = (Button) findViewById(R.id.zeroButton);
        button1 = (Button) findViewById(R.id.oneButton);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        clearButton = (Button) findViewById(R.id.acButton);
        dotButton = (Button) findViewById(R.id.dotButton);
        helpButton = (Button) findViewById(R.id.helpButton);
        equalButton = (Button) findViewById(R.id.equalButton);
        reminderButton = (Button) findViewById(R.id.reminderButton);
        divideButton = (Button) findViewById(R.id.divideButton);
        multiplyButton  = (Button) findViewById(R.id.multiplyButton);
        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        backButton = (Button) findViewById(R.id.backButton);
        numberTextView = (TextView) findViewById(R.id.numberText);
        tempNumberTextView = (TextView) findViewById(R.id.tempNumberTextView);
        finalNumber =0;
        checkFinalNumber = false;
        tempNumber = null;
    }

    public void buttonClicked(View view){

        try {

            String stringTag = String.valueOf(view.getTag());

            if (stringTag.equals("0")) {
                clearButton.setText("C");
                numberTextView.append("0");
                tempNumberTextView.append("0");
            } else if (stringTag.equals("1")) {
                clearButton.setText("C");
                numberTextView.append("1");
                tempNumberTextView.append("1");
            } else if (stringTag.equals("2")) {
                clearButton.setText("C");
                numberTextView.append("2");
                tempNumberTextView.append("2");
            } else if (stringTag.equals("3")) {
                clearButton.setText("C");
                numberTextView.append("3");
                tempNumberTextView.append("3");
            } else if (stringTag.equals("4")) {
                numberTextView.append("4");
                clearButton.setText("C");
                tempNumberTextView.append("4");
            } else if (stringTag.equals("5")) {
                clearButton.setText("C");
                numberTextView.append("5");
                tempNumberTextView.append("5");
            } else if (stringTag.equals("6")) {
                clearButton.setText("C");
                numberTextView.append("6");
                tempNumberTextView.append("6");
            } else if (stringTag.equals("7")) {
                clearButton.setText("C");
                numberTextView.append("7");
                tempNumberTextView.append("7");
            } else if (stringTag.equals("8")) {
                clearButton.setText("C");
                numberTextView.append("8");
                tempNumberTextView.append("8");
            } else if (stringTag.equals("9")) {
                clearButton.setText("C");
                numberTextView.append("9");
                tempNumberTextView.append("9");
            } else if (stringTag.equals("plus")) {
                if(checkFinalNumber){
                    tempNumber = String.valueOf(finalNumber);
                    numberTextView.setText(tempNumber);
                    numberTextView.setAlpha(1);
                    button0.setClickable(true);button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button9.setClickable(true);button8.setClickable(true); backButton.setClickable(true);
                    backButton.setClickable(true); dotButton.setClickable(true); backButton.setClickable(true);
                    numberTextView.setTextSize(40);
                    tempNumberTextView.setTextSize(30);
                    tempNumberTextView.setText("=");
                }
                tempNumber = String.valueOf(numberTextView.getText());
                number1 = Float.parseFloat(tempNumber);
                tempNumberTextView.setText("=");
                numberTextView.append("+");
                clearButton.setText("C");
                addition = true;
            } else if (stringTag.equals("minus")) {
                if(checkFinalNumber){
                    tempNumber = String.valueOf(finalNumber);
                    numberTextView.setText(tempNumber);
                    numberTextView.setAlpha(1);
                    button0.setClickable(true);button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button9.setClickable(true);button8.setClickable(true); backButton.setClickable(true);
                    backButton.setClickable(true); dotButton.setClickable(true); backButton.setClickable(true);
                    numberTextView.setTextSize(40);
                    tempNumberTextView.setTextSize(30);
                    tempNumberTextView.setText("=");
                }
                tempNumber = String.valueOf(numberTextView.getText());
                number1 = Float.parseFloat(tempNumber);
                tempNumberTextView.setText("=");
                numberTextView.append("-");
                clearButton.setText("C");
                minus = true;
            } else if (stringTag.equals("multiply")) {
                if(checkFinalNumber){
                    tempNumber = String.valueOf(finalNumber);
                    numberTextView.setText(tempNumber);
                    numberTextView.setAlpha(1);
                    button0.setClickable(true);button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button9.setClickable(true);button8.setClickable(true); backButton.setClickable(true);
                    backButton.setClickable(true); dotButton.setClickable(true); backButton.setClickable(true);
                    numberTextView.setTextSize(40);
                    tempNumberTextView.setTextSize(30);
                    tempNumberTextView.setText("=");
                }
                tempNumber = String.valueOf(numberTextView.getText());
                number1 = Float.parseFloat(tempNumber);
                tempNumberTextView.setText("=");
                numberTextView.append("*");
                clearButton.setText("C");
                multiply = true;
            } else if (stringTag.equals("reminder")) {
                if(checkFinalNumber){
                    tempNumber = String.valueOf(finalNumber);
                    numberTextView.setText(tempNumber);
                    numberTextView.setAlpha(1);
                    button0.setClickable(true);button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button9.setClickable(true);button8.setClickable(true); backButton.setClickable(true);
                    backButton.setClickable(true); dotButton.setClickable(true); backButton.setClickable(true);
                    numberTextView.setTextSize(40);
                    tempNumberTextView.setTextSize(30);
                    tempNumberTextView.setText("=");
                }
                tempNumber = String.valueOf(numberTextView.getText());
                number1 = Float.parseFloat(tempNumber);
                tempNumberTextView.setText("=");
                numberTextView.append("%");
                clearButton.setText("C");
                reminder = true;
            } else if (stringTag.equals("clear")) {
                clearButton.setText("AC");
                numberTextView.setText("0");
                tempNumberTextView.setText("=");
                numberTextView.setAlpha(1);
                numberTextView.setTextSize(40);
                tempNumberTextView.setTextSize(30);
                button0.setClickable(true);
                button1.setClickable(true);
                button2.setClickable(true);
                button3.setClickable(true);
                button4.setClickable(true);
                button5.setClickable(true);
                button6.setClickable(true);
                button7.setClickable(true);
                button9.setClickable(true);
                button8.setClickable(true);
                backButton.setClickable(true);
                plusButton.setClickable(true);
                minusButton.setClickable(true);
                multiplyButton.setClickable(true);
                divideButton.setClickable(true);
                reminderButton.setClickable(true);
                dotButton.setClickable(true);
                addition = false;
                checkFinalNumber = false;
                reminder = false;
                division = false;
                minus = false;
                multiply = false;
            } else if (stringTag.equals("divide")) {
                if(checkFinalNumber){
                    tempNumber = String.valueOf(finalNumber);
                    numberTextView.setText(tempNumber);
                    numberTextView.setAlpha(1);
                    button0.setClickable(true);button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button9.setClickable(true);button8.setClickable(true); backButton.setClickable(true);
                    backButton.setClickable(true); dotButton.setClickable(true); backButton.setClickable(true);
                    numberTextView.setTextSize(40);
                    tempNumberTextView.setTextSize(30);
                    tempNumberTextView.setText("=");
                }
                tempNumber = String.valueOf(numberTextView.getText());
                number1 = Float.parseFloat(tempNumber);
                tempNumberTextView.setText("=");
                numberTextView.append("/");
                clearButton.setText("C");
                division = true;

            } else if (stringTag.equals("dot")) {
                clearButton.setText("C");
                numberTextView.append(".");


            } else if (stringTag.equals("equal")) {

                tempNumber = String.valueOf(tempNumberTextView.getText());
                tempNumber = tempNumber.substring(1, tempNumber.length());
                number2 = Float.parseFloat(tempNumber);

                if(checkFinalNumber){
                }
                finalNumber = number1;

                if (addition) {
                    finalNumber = (number1 + number2);
                    tempNumberTextView.setText("="+finalNumber);
                } else if (division) {
                    finalNumber = (number1 / number2);
                    tempNumberTextView.setText("="+ finalNumber);
                } else if (multiply) {
                    finalNumber = number1 * number2;
                    tempNumberTextView.setText("="+ finalNumber);
                } else if (minus) {
                    finalNumber = number1 - number2;
                    tempNumberTextView.setText("="+ finalNumber);
                } else if (reminder) {
                    finalNumber = number1 % number2;
                    tempNumberTextView.setText("="+ finalNumber);
                }
                addition = false;reminder = false;division = false;minus = false;multiply = false;checkFinalNumber = true;clearButton.setText("C");
                numberTextView.setAlpha((float) 0.7);
                numberTextView.setTextSize(25);
                tempNumberTextView.setTextSize(45);
                button0.setClickable(false);button1.setClickable(false);button2.setClickable(false);button3.setClickable(false);button4.setClickable(false);button5.setClickable(false);button6.setClickable(false);button7.setClickable(false);button9.setClickable(false);button8.setClickable(false);
                backButton.setClickable(false); dotButton.setClickable(false); backButton.setClickable(false);

            } else if (stringTag.equals("back")) {

                String temp = String.valueOf(numberTextView.getText());

                if (temp.length() == 0) {
                    numberTextView.setText("");
                    tempNumberTextView.setText("=");
                } else {
                    clearButton.setText("C");
                    temp = temp.substring(0, temp.length() - 1);
                    numberTextView.setText(temp);
                    tempNumberTextView.setText("=" + temp);
                }
            }
            else if(stringTag.equals("help")){

                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
            }
        }catch (Exception e) {

            e.printStackTrace();
            tempNumberTextView.setText("ERROR");
        }


    }


}
