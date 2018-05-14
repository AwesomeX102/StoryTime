package org.pltw.examples.storytime;

import java.util.ArrayList;

public class Story {
    private static Story story;


    private static int INT = 0;
    private static int ATH = 1;
    private static int MUS = 2;
    private static Stage initial;
    private static ArrayList<Stage> intelligent;
    private static ArrayList<Stage> athletic;
    private static ArrayList<Stage> musical;
    private android.content.Context context;

    private Story() {
        intelligent = new ArrayList<>();
        athletic = new ArrayList<>();
        musical = new ArrayList<>();
        initial = new Stage(-1, R.string.main_text,  R.string.option1,  R.string.option2,  R.string.option3, 0, 1, 2, 3);//MAKE THIS THE INTRO FOR ALL PATHS

        //vvvvvvvvvvvvvvvvvv PUT STORIES HERE vvvvvvvvvvvvvvvvvv
        Stage int0 = new Stage(INT, R.string.int0_main_text, R.string.int0_option1, R.string.int0_option2, R.string.int0_option3, 0, 1, 2, 3);
        Stage int1 = new Stage(INT, R.string.int1_main_text, R.string.int1_option1, R.string.int1_option2, R.string.int1_option3, 1, 4, 5, 6);










        //^^^^^^^^^^^^^^^^^^ PUT STORIES HERE ^^^^^^^^^^^^^^^^^^

        for (Stage s : Stage.allStages) {
            int storyLine = s.getStoryLine();
            int id = s.getId();
            if(storyLine == 0) {
                intelligent.add(id, s);
            }
            else if(storyLine == 1) {
                athletic.add(id, s);
            }
            else if(storyLine == 2) {
                musical.add(id, s);
            }
        }
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
