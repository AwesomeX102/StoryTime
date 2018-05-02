package org.pltw.examples.storytime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Typewriter mainText;
    private TextView textOne;
    private TextView textTwo;
    private TextView textThree;
    private String TAG = this.getClass().getName();
    // This is Bailee's comment


    /*private void textEffect(TextView textBox, String string){
        for(int i = 0; i < string.length(); i++){
            String finalString = "";
            String x = string.substring(i);
            try {
                synchronized (this) {
                    wait(250);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                Log.d(TAG, "Waiting didnt work!!");
                e.printStackTrace();
            }
            finalString += x;
            textBox.setText(finalString);


        }
        textBox.

    }*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Typewriter writer = new Typewriter(this);
        setContentView(writer);

        //Add a character every 150ms
        writer.setCharacterDelay(150);
        writer.animateText("Sample String");


    }
}
