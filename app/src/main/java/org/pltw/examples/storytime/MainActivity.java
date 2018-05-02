package org.pltw.examples.storytime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    //Private variables for Loren
    private TextView mainTextStory;
    private TextView textOne;
    private TextView textTwo;
    private TextView textThree;
    private String TAG = this.getClass().getName();















    //Private Variables for Bailey



















    //Private Functions for Loren

    private void  typeWriter(String string, TextView textBox){
        for(int i = 0; i < string.length(); i++){
            String x = "";
            x = string.substring(i);
            textBox.setText(x);

        }


    }
























    public void setStoryLine(String mainText, String optionOne, String optionTwo, String optionThree){
        textOne.setText(optionOne);
        textThree.setText(optionThree);
        textTwo.setText(optionTwo);
        typeWriter(mainText, mainTextStory);
    }


    //Private Functions for Bailey


    public TextView getMainTextStory() {
        return mainTextStory;
    }

    public void setMainTextStory(TextView mainTextStory) {
        this.mainTextStory = mainTextStory;
    }

    public TextView getTextOne() {
        return textOne;
    }

    public void setTextOne(TextView textOne) {
        this.textOne = textOne;
    }

    public TextView getTextTwo() {
        return textTwo;
    }

    public void setTextTwo(TextView textTwo) {
        this.textTwo = textTwo;
    }

    public TextView getTextThree() {
        return textThree;
    }

    public void setTextThree(TextView textThree) {
        this.textThree = textThree;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //Assign Variables Loren
            mainTextStory = findViewById(R.id.storyText);
            textOne = findViewById(R.id.optionOne);
            textTwo = findViewById(R.id.optionTwo);
            textThree = findViewById(R.id.optionThree);






























































    }
}
