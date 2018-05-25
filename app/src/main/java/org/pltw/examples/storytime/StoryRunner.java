package org.pltw.examples.storytime;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.pltw.examples.storytime.stories.Story;
import org.pltw.examples.storytime.stories.Story1;

import java.util.ArrayList;

public class StoryRunner extends AppCompatActivity{
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
        SharedPreferences sharedPref = this.getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int charDelay = sharedPref.getInt(getString(R.string.typing_delay), 50);
        Log.i("setStoryLine", "charDelay: " + charDelay);
        if(charDelay != 0) {
            mainTextStory.setCharacterDelay(charDelay);
            mainTextStory.animateText(mainTextStory.getText());
        }

        final int storyLine = stage.getStoryLine();
        final int Id = stage.getId();

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putInt(mStory.getName() + "_storyline", storyLine);
        editor.putInt(mStory.getName() + "_index", Id);
        editor.commit();

        textOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int story = storyLine;                int index = stage.getStage1();
                Log.i("SET_STORY", "StoryLine: " +storyLine);
                Log.i("SET_STORY", "Index: " +index);
                if(index == -1) {
                    story = -1;
                    index = -1;
                }
                else if(storyLine == -1) {
                    story = 0;
                    index = 0;
                }
                Stage newStage = mStory.getStage(story, index);
                setStoryLine(newStage);
            }
        });
        textTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = stage.getStage2();
                int story = storyLine;
                Log.i("SET_STORY", "StoryLine: " +storyLine);
                Log.i("SET_STORY", "Index: " +index);
                if(index == -1) {
                    story = -1;
                    index = -1;
                }
                else if(storyLine == -1) {
                    story = 1;
                    index = 0;
                }
                Stage newStage = mStory.getStage(story, index);
                setStoryLine(newStage);

            }
        });
        textThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = stage.getStage3();
                int story = storyLine;
                Log.i("SET_STORY", "StoryLine: " +storyLine);
                Log.i("SET_STORY", "Index: " +index);
                if(index == -1) {
                    story = -1;
                    index = -1;
                }
                else if(storyLine == -1) {
                    story = 2;
                    index = 0;
                }
                Stage newStage = mStory.getStage(story, index);
                setStoryLine(newStage);
            }
        });

    }




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
        setContentView(R.layout.runner_story);
        SharedPreferences sharedPref = this.getSharedPreferences("Settings", Context.MODE_PRIVATE);
        Intent intent = getIntent();
        mStory = (Story) intent.getSerializableExtra("story");
        //Assign Variables Loren
            mainTextStory = findViewById(R.id.storyText);
            textOne = findViewById(R.id.optionOne);
            textTwo = findViewById(R.id.optionTwo);
            textThree = findViewById(R.id.optionThree);
            int storyline = sharedPref.getInt(mStory.getName()+"_storyline", -1);
            int index = sharedPref.getInt(mStory.getName()+"_index", 0);
            setStoryLine(mStory.getStage(storyline, index));
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
