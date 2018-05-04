package org.pltw.examples.storytime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    //Private variables for Loren
    private TypeWriter mainTextStory;
    private TextView textOne;
    private TextView textTwo;
    private TextView textThree;
    private String TAG = this.getClass().getName();
    //This is loren's comment















    //Private Variables for Bailey



















    //Private Functions for Loren

    private void  typeWriter(String string, TextView textBox){
        for(int i = 0; i < string.length(); i++){
            String x = "";
            x = string.substring(i);
            textBox.setText(x);

        }


    }










    public void setStage(String stage){
        switch(stage){
            case "Beginning":


                break;


        }


    }













    public void setStoryLine(String mainText, String optionOne, String optionTwo, String optionThree, final String stage){
        textOne.setText(optionOne);
        textThree.setText(optionThree);
        textTwo.setText(optionTwo);
        mainTextStory.setText("");
        mainTextStory.setCharacterDelay(150);
        mainTextStory.animateText(mainText);
        textOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setStage(stage);

            }
        });
        textTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setStage(stage);

            }
        });
        textThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setStage(stage);

            }
        });

    }


    //Private Functions for Bailey


    public TextView getMainTextStory() {
        return mainTextStory;
    }

    public void setMainTextStory(TypeWriter mainTextStory) {
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


            setStoryLine("Welcome to StoryTime!", "Be Cool", "Be Super Cool", "The awesome stuff", "cool");
            setStoryLine("What is your name?", "Be Cool", "Be Super Cool", "The awesome stuff", "Beginning");



























































    }
}
