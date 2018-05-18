package org.pltw.examples.storytime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    //Private variables for Loren
    private TypeWriter mainTextStory;
    private TextView textOne;
    private TextView textTwo;
    private TextView textThree;
    private String TAG = this.getClass().getName();
    private Story mStory;
    private ArrayList<Stage> intelligent;
    private ArrayList<Stage> athletic;
    private ArrayList<Stage> musical;


















    //Private Variables for Bailey



















    //Private Functions for Loren

    private void typeWriter(String string, TextView textBox){
        for(int i = 0; i < string.length(); i++){
            String x = "";
            x = string.substring(i);
            textBox.setText(x);

        }


    }
























    public void setStoryLine(final Stage stage){
        textOne.setText(getResources().getString(stage.getOption1()));
        textTwo.setText(getResources().getString(stage.getOption2()));
        textThree.setText(getResources().getString(stage.getOption3()));
        mainTextStory.setText(getResources().getString(stage.getMainText()));
        if(stage.getStoryLine() == -1) {
            mainTextStory.setCharacterDelay(150);
        }
        else {
            mainTextStory.setCharacterDelay(50);
        }
        mainTextStory.animateText(mainTextStory.getText());
        textOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int storyLine = stage.getStoryLine();
                int index = stage.getStage1();
                Log.i("SET_STORY", "StoryLine: " +storyLine);
                Log.i("SET_STORY", "Index: " +index);
                if(index == -1) {
                    storyLine = -1;
                    index = -1;
                }
                else if(storyLine == -1) {
                    storyLine = 0;
                    index = 0;
                }
                Stage newStage = mStory.getStage(storyLine, index);
                setStoryLine(newStage);
            }
        });
        textTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = stage.getStage2();
                int storyLine = stage.getStoryLine();
                Log.i("SET_STORY", "StoryLine: " +storyLine);
                Log.i("SET_STORY", "Index: " +index);
                if(index == -1) {
                    storyLine = -1;
                    index = -1;
                }
                else if(storyLine == -1) {
                    storyLine = 1;
                    index = 0;
                }
                Stage newStage = mStory.getStage(storyLine, index);
                setStoryLine(newStage);

            }
        });
        textThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = stage.getStage3();
                int storyLine = stage.getStoryLine();
                Log.i("SET_STORY", "StoryLine: " +storyLine);
                Log.i("SET_STORY", "Index: " +index);
                if(index == -1) {
                    storyLine = -1;
                    index = -1;
                }
                else if(storyLine == -1) {
                    storyLine = 2;
                    index = 0;
                }
                Stage newStage = mStory.getStage(storyLine, index);
                setStoryLine(newStage);
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

    public Story getStory() {
        return mStory;
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
            mStory = Story.getStory();
            intelligent = mStory.getIntelligent();
            athletic = mStory.getAthletic();
            musical = mStory.getMusical();

            setStoryLine(mStory.getStage(-1, 0));
    }
}
