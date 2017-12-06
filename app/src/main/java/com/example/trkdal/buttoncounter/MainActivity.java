package com.example.trkdal.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int[] counter=new int[]{0, 0, 0, 0, 0, 0};

    public void Run(View v)
    {

       if(v.getId()==R.id.btn1)
       {
           counter[0]=counter[0]+1;
       }
        else if(v.getId()==R.id.btn2)
        {
            counter[1]=counter[1]+1;
        }
       else if(v.getId()==R.id.btn3)
       {
           counter[2]=counter[2]+1;
       }
       else if(v.getId()==R.id.btn4)
       {
           counter[3]=counter[3]+1;
       }
       else if(v.getId()==R.id.btn5)
       {
           counter[4]=counter[4]+1;
       }else if(v.getId()==R.id.btn6)
       {
           counter[5]=counter[5]+1;
       }


    }
    public void Show(View v)
    {
        TextView txt1=(TextView) findViewById(R.id.txt1);
        txt1.setText("");
        if(counter[0]!=0)
        {
            txt1.setText(txt1.getText()+"\n"+"Button 1"+"-"+counter[0]+" times clicked");
        }
        if(counter[1]!=0)
        {
            txt1.setText(txt1.getText()+"\n"+"Button 2"+"-"+counter[1]+" times clicked");
        }
        if(counter[2]!=0)
        {
            txt1.setText(txt1.getText()+"\n"+"Button 3"+"-"+counter[2]+" times clicked");
        }
        if(counter[3]!=0)
        {
            txt1.setText(txt1.getText()+"\n"+"Button 4"+"-"+counter[3]+" times clicked");
        }
        if(counter[4]!=0)
        {
            txt1.setText(txt1.getText()+"\n"+"Button 5"+"-"+counter[4]+" times clicked");
        }
        if(counter[5]!=0)
        {
            txt1.setText(txt1.getText()+"\n"+"Button 6"+"-"+counter[5]+" times clicked");
        }

    }
    public void Clear(View v)
    {
        TextView txt1=(TextView) findViewById(R.id.txt1);
        txt1.setText("");
       counter[0]=0;
        counter[1]=0;
        counter[2]=0;
        counter[3]=0;
        counter[4]=0;
        counter[5]=0;

    }
}
