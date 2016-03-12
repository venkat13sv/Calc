package com.example.calc;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity 
{
    Button nine,eig,sev,six,fiv,four,thr,two,one,zero,dot,plus,mins,div,mul,eq,cl;
    EditText et;
    String s = "0";
    int result = 0;
    char lO = ' ';
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      

    @Override
    public void onClick(View v) 
    {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            case R.id.b0:
            case R.id.b1:
            case R.id.b2:
            case R.id.b3:
            case R.id.b4:
            case R.id.b5:
            case R.id.b6:
            case R.id.b7:
            case R.id.b8:
            case R.id.b9:

            String inDigit = ((Button) v).getText().toString();
            if (s.equals("0"))
            {
                s= inDigit;
            }
            else
            {
                s+=inDigit;
            }
            et.setText(s);
            if(lO == '=')
            {
                result=0;
                lO =' ';
            }
            break;
            case R.id.bpl:
            compute();
            lO = '+';
            break;
            case R.id.bmin:
            compute();
            lO = '-';
            break;
            case R.id.bdiv:
            compute();
            lO = '/';
            break;
            case R.id.bmul:
            compute();
            lO = '*';
            break;
            case R.id.beq:
            compute();
            lO = '=';
            break;
            case R.id.bcl:
            result = 0;
            s = "0";
            lO = ' ';
            et.setText("0");
            break;
        }
    }

    private void compute() 
    {
        // TODO Auto-generated method stub
        int inNum = Integer.parseInt(s);
        s = "0";
        if (lO == ' ') 
        {
            result = inNum;
        } 
        else if (lO == '+') 
        {
            result += inNum;
        } 
        else if (lO == '-') 
        {
            result -= inNum;
        } 
        else if (lO == '*') 
        {
            result *= inNum;
        } 
        else if (lO == '/') 
        {
            result /= inNum;
        } 
        else if (lO == '=') 
        {
            // Keep the result for the next operation
        }
        et.setText(String.valueOf(result));
    }
}


