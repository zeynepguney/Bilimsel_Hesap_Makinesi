package com.example.hesaplayici;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inputBox, symbolBox;
    String sign, value1, value2;
    Double  num1, num2, result;
    boolean nokta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputBox = (TextView) findViewById(R.id.input);
        symbolBox = (TextView) findViewById(R.id.output);

        nokta = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
            inputBox.setText(inputBox.getText()+ "0");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        inputBox.setText(inputBox.getText()+ "1");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        inputBox.setText(inputBox.getText()+ "2");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        inputBox.setText(inputBox.getText()+ "3");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        inputBox.setText(inputBox.getText()+ "4");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        inputBox.setText(inputBox.getText()+ "5");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        inputBox.setText(inputBox.getText()+ "6");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        inputBox.setText(inputBox.getText()+ "7");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        inputBox.setText(inputBox.getText()+ "8");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        inputBox.setText(inputBox.getText()+ "9");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_nokta(View view) {
        if (!nokta){
            if (inputBox.getText().equals("")){
                inputBox.setText("0.");
            }
            else{
                inputBox.setText(inputBox.getText()+ ".");
            }
            nokta = true;
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_arti(View view) {
        sign = "+";
        value1 = inputBox.getText().toString();
        inputBox.setText(null);
        symbolBox.setText("+");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_eksi(View view) {
        sign = "-";
        value1 = inputBox.getText().toString();
        inputBox.setText(null);
        symbolBox.setText("-");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_carpi(View view) {
        sign = "*";
        value1 = inputBox.getText().toString();
        inputBox.setText(null);
        symbolBox.setText("*");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_bolu(View view) {
        sign = "/";
        value1 = inputBox.getText().toString();
        inputBox.setText(null);
        symbolBox.setText("/");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        sign = "log";
        inputBox.setText(null);
        symbolBox.setText("log");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        sign = "ln";
        inputBox.setText(null);
        symbolBox.setText("ln");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_us(View view) {
        sign = "power";
        inputBox.setText(null);
        symbolBox.setText("xⁿ");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_karekok(View view) {
        sign = "root";
        inputBox.setText(null);
        symbolBox.setText("√");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_faktoriyel(View view) {
        sign = "factorial";
        inputBox.setText(null);
        symbolBox.setText("!");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        sign = "sin";
        inputBox.setText(null);
        symbolBox.setText("sin");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        sign = "cos";
        inputBox.setText(null);
        symbolBox.setText("cos");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        sign = "tan";
        inputBox.setText(null);
        symbolBox.setText("tan");
        nokta = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_esittir(View view) {
        if (sign == null){
            symbolBox.setText("Error");
        }
        else if (inputBox.getText().equals("")){
            symbolBox.setText("Error");
        }
        else if ((sign.equals("+")|| sign.equals("-")|| sign.equals("*")|| sign.equals("/"))&& value1.equals("")){
            symbolBox.setText("Error");
        }
        else {
            switch (sign){
                default:
                    break;
                case "log":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    inputBox.setText(Math.log10(num1)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "ln":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    inputBox.setText(Math.log(num1)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "power":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble((value1));
                    value2 = inputBox.getText().toString();
                    num2 = Double.parseDouble(value2);
                    inputBox.setText(Math.pow(num1, num2)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "root":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    inputBox.setText(Math.sqrt(num1)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "factorial":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1)-1;
                    while (i>0){
                        num1 = num1*i;
                        i--;
                    }
                    inputBox.setText(num1 + "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "sin":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    inputBox.setText(Math.sin(num1)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "cos":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    inputBox.setText(Math.cos(num1)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "tan":
                    value1 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    inputBox.setText(Math.tan(num1)+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "+":
                    value2 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    inputBox.setText(result+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "-":
                    value2 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    inputBox.setText(result+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "*":
                    value2 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    inputBox.setText(result+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
                case "/":
                    value2 = inputBox.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    inputBox.setText(result+ "");
                    sign = null;
                    symbolBox.setText(null);
                    break;
            }
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_backspace(View view) {
        if (inputBox.getText().equals("")){
            inputBox.setText(null);
        }
        else{
            int len = inputBox.getText().length();
            String s = inputBox.getText().toString();
            if (s.charAt(len-1) == '.'){
                nokta = false;
                inputBox.setText(inputBox.getText().subSequence(0,inputBox.getText().length()-1));
            }
            else{
                inputBox.setText(inputBox.getText().subSequence(0,inputBox.getText().length()-1));
            }
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_clear(View view) {
        inputBox.setText(null);
        symbolBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        nokta = false;
    }
}