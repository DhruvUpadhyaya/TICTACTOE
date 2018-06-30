package com.example.dhurvupadhyaya.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private  int myActivePlayer = 0;
    // 0 for circle and 1 for cross
    private int[] myPlayerState = {2,2,2,2,2,2,2,2,2};
    public void onTapped(View view){

        ImageView myTapped = (ImageView) view;
        //Log.d("tag is","my image no. is " + myTapped.getTag().toString() );
        int tappedState = Integer.parseInt(myTapped.getTag().toString());

        if(myPlayerState[tappedState] == 2){
            myPlayerState[tappedState] = myActivePlayer;

            if (myActivePlayer == 0)
            {
                myTapped.setImageResource(R.drawable.cross);
              //  myTapped.animate().rotation(360).setDuration(1000);
                myTapped.animate().rotation(myTapped.getRotation()+(180)).setDuration(1000);
                myActivePlayer = 1;

            }else
            {
                myTapped.setImageResource(R.drawable.circle);
                myTapped.animate().rotation(360).setDuration(1000);
                myActivePlayer = 0;
            }

        }

    }





    public void onPlayTapped(View view){


        //change game state to 2
        for (int i=0 ; i < myPlayerState.length ; i++){
            myPlayerState[i] = 2;
        }

        //make active player to 0
        myActivePlayer = 0;

        //make ic launcher

        LinearLayout linearLayoutOne = findViewById(R.id.lineOne);
        for (int i=0;i<linearLayoutOne.getChildCount();i++){

            ( (ImageView)linearLayoutOne.getChildAt(i)).setImageResource(R.drawable.redlight);

        }
        LinearLayout linearLayoutTwo = findViewById(R.id.lineTwo);
        for (int i=0;i<linearLayoutTwo.getChildCount();i++){

            ( (ImageView)linearLayoutTwo.getChildAt(i)).setImageResource(R.drawable.redlight);

        }
        LinearLayout linearLayoutThree = findViewById(R.id.lineThree);
        for (int i=0;i<linearLayoutThree.getChildCount();i++){

            ( (ImageView)linearLayoutThree.getChildAt(i)).setImageResource(R.drawable.redlight);

        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
