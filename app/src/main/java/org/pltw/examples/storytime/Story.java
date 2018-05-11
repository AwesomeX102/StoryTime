package org.pltw.examples.storytime;

import java.util.ArrayList;

public class Story {
    private static Story story;


    private static int INT = 0;
    private static int ATH = 1;
    private static int MUS = 2;
    private Stage initial;
    private ArrayList<Stage> intelligent;
    private ArrayList<Stage> athletic;
    private ArrayList<Stage> musical;
    private android.content.Context context;

    private Story() {
        intelligent = new ArrayList<>();
        athletic = new ArrayList<>();
        musical = new ArrayList<>();
        initial = new Stage(-1, R.string.main_text,  R.string.option1,  R.string.option2,  R.string.option3, 0, 1, 2, 3);//MAKE THIS THE INTRO FOR ALL PATHS

        //vvvvvvvvvvvvvvvvvv PUT STORIES HERE vvvvvvvvvvvvvvvvvv
        Stage int0 = new Stage(INT, R.string.int1_main_text, R.string.int1_option1, R.string.int1_option2, R.string.int1_option3, 0, 1, 2, 3);










        //^^^^^^^^^^^^^^^^^^ PUT STORIES HERE ^^^^^^^^^^^^^^^^^^
    }

    public static Story getStory() {
        if(story == null) {
            story = new Story();
        }
        return story;
    }



    public ArrayList<Stage> getIntelligent() {
        return intelligent;
    }

    public ArrayList<Stage> getAthletic() {
        return athletic;
    }

    public ArrayList<Stage> getMusical() {
        return musical;
    }

    public Stage getStage(int storyLine, int index) {
        Stage stage;
        if(storyLine == -1) {
            stage = initial;
        }
        else if(storyLine == INT) {
            stage = intelligent.get(index);
        }
        else if (storyLine == ATH) {
            stage = athletic.get(index);
        }
        else {
            stage = musical.get(index);
        }
        return stage;
    }
}
