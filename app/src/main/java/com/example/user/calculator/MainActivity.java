package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int textviewAll;
    private double result1;
    private static final String TAG = "Calculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate();");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart();");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop();");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause();");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume();");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart();");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy();");
    }

    String number="";
    String tempSum="";
    String operator="";
    Double result=0.0;
    Boolean resultflag=false;

    public void onNumberClick(View view) {
        number +=((Button)view).getText().toString();
    }

    public void onOperatorClick(View view) {
        if(result != 0){
            tempSum = String.valueOf(result);
            //number = "";
            Log.d(TAG, "tempSum =  "+tempSum);
        } else {
            operator = ((Button) view).getText().toString();
            tempSum = number;
            number = "";
        }
    }

    public void onEqualClick(View view) {
        if (resultflag == true){

        }
        switch(operator) {
            case "+":
                result = Double.parseDouble(tempSum) + Double.parseDouble(number);
                break;
            case "-":
                result = Double.parseDouble(tempSum) - Double.parseDouble(number);
                break;
            case "x":
                result = Double.parseDouble(tempSum) * Double.parseDouble(number);
                break;
            case "/":
                result = Double.parseDouble(tempSum) / Double.parseDouble(number);
                break;

        }
        resultflag = true;
        tempSum = String.valueOf(result);
//        tempSum = String.valueOf(result);
//        number = "";
        Toast.makeText(this,"結果="+result,Toast.LENGTH_SHORT).show();
    }
}
