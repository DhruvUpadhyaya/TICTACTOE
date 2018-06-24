package com.example.dhurvupadhyaya.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  int myActivePlayer = 0;
    public void onTapped(View view){

        ImageView myTapped = (ImageView) view;
        if (myActivePlayer == 0)
        {
            myTapped.setImageResource(R.drawable.cross);
            myTapped.animate().rotation(360).setDuration(1000);
            myActivePlayer = 1;

        }else
        {
            myTapped.setImageResource(R.drawable.circle);
            myTapped.animate().rotation(360).setDuration(1000);
            myActivePlayer = 0;
        }





    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
