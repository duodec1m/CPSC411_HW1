package com.example.cpsc411hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.hw1);

        HorizontalScrollView hsv = new HorizontalScrollView(this);
        HorizontalScrollView.LayoutParams scParams = new HorizontalScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        hsv.setLayoutParams(scParams);

        GridLayout gl = new GridLayout(this);
        gl.setRowCount(12);
        gl.setColumnCount(5);

        //Dummy Holder Variables
        TextView tv;
        GridLayout.LayoutParams tempParams;

        //Setting Row 1
        for(int i = 0; i < 11; i++){
            tv = new TextView(this);
            tv.setText((i+1) + "");
            tv.setGravity(Gravity.CENTER);
            tv.setBackgroundColor(Color.parseColor("#808080"));
            tempParams = new GridLayout.LayoutParams(GridLayout.spec(i),GridLayout.spec(0));
            tempParams.setGravity(Gravity.FILL_HORIZONTAL);
            tv.setLayoutParams(tempParams);
            gl.addView(tv);
        }
        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setBackgroundColor(Color.parseColor("#000000"));
        tv.setTextColor(Color.parseColor("#FFFFFF"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(0),GridLayout.spec(1,4));
        tempParams.setGravity(Gravity.FILL);
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        //Settings Row 2 and 3
        tv = new TextView(this);
        tv.setText("properties");
        tv.setPadding((int)(getResources().getDisplayMetrics().density * 16 + 0.5f),0,(int)(getResources().getDisplayMetrics().density * 16 + 0.5f),0);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(1,2),GridLayout.spec(1));
        tempParams.setGravity(Gravity.CENTER);
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(1),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.CENTER);
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(2),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.CENTER);
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(1),GridLayout.spec(4));
        tempParams.setGravity(Gravity.LEFT);
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(2),GridLayout.spec(4));
        tempParams.setGravity(Gravity.LEFT);
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        //Settings Row 4
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(1));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        //Setting Row 5
        tv = new TextView(this);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(1));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting + \", World!\")");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        //Setting Row 6
        tv = new TextView(this);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(1));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("int min");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(2));
        tv.setPadding((int)(getResources().getDisplayMetrics().density * 23 + 0.5f),0,(int)(getResources().getDisplayMetrics().density * 23 + 0.5f),0);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(3));
        tv.setPadding((int)(getResources().getDisplayMetrics().density * 23 + 0.5f),0,(int)(getResources().getDisplayMetrics().density * 23 + 0.5f),0);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#00FFFF"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        //Setting Row 7
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(1));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffc966"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        //Setting Bottom Content
        tv = new TextView(this);
        tv.setText("R10");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(1));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffc966"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("R20");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(1));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffc966"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("R30");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(1));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffc966"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("R40");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(1));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setGravity(Gravity.RIGHT);
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffff4d"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv.setBackgroundColor(Color.parseColor("#ffc966"));
        tv.setLayoutParams(tempParams);
        gl.addView(tv);

        hsv.addView(gl);
        setContentView(hsv);
    }
}
