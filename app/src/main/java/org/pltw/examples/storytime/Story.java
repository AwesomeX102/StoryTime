package org.pltw.examples.storytime;

import android.nfc.Tag;
import android.util.Log;

import java.util.ArrayList;

public class Story {
    private static Story story;


    private static int INT = 0;
    private static int ATH = 2;
    private static int MUS = 1;
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

        //vvvvvvvvvvvvvvvvvv PUT STAGES HERE vvvvvvvvvvvvvvvvvv
        Stage ath0 = new Stage(ATH, R.string.ath0_main_text, R.string.ath0_option1, R.string.ath0_option2, R.string.ath0_option3, 0, 1, 2, 3);
        Stage ath1 = new Stage(ATH, R.string.ath1_main_text, R.string.ath1_option1, R.string.ath1_option2, R.string.ath1_option3, 1, -1, -1, -1);
        Stage ath2 = new Stage(ATH, R.string.ath2_main_text, R.string.ath2_option1, R.string.ath2_option2, R.string.ath2_option3, 2, -1, -1, -1);
        Stage ath3 = new Stage(ATH, R.string.ath3_main_text, R.string.ath3_option1, R.string.ath3_option2, R.string.ath3_option3, 3, 4, 5, 2);
        Stage ath4 = new Stage(ATH, R.string.ath4_main_text, R.string.ath4_option1, R.string.ath4_option2, R.string.ath4_option3, 4, -1, -1, -1);
        Stage ath5 = new Stage(ATH, R.string.ath5_main_text, R.string.ath5_option1, R.string.ath5_option2, R.string.ath5_option3, 5, -1, -1, -1);







        Stage int0 = new Stage(INT, R.string.int0_main_text, R.string.int0_option1, R.string.int0_option2, R.string.int0_option3, 0, 1, 2, 3);
        Stage int1 = new Stage(INT, R.string.int1_main_text, R.string.int1_option1, R.string.int1_option2, R.string.int1_option3, 1, 4, 5, 6);






































































































































        //^^^^^^^^^^^^^^^^^^ PUT STAGES HERE ^^^^^^^^^^^^^^^^^^

        for (Stage s : Stage.allStages) {
            int storyLine = s.getStoryLine();
            int id = s.getId();
            if(storyLine == INT) {
                intelligent.add(id, s);
            }
            else if(storyLine == ATH) {
                athletic.add(id, s);
            }
            else if(storyLine == MUS) {
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
        Log.i("STORY CLASS", "Storyline: " + storyLine);
        Log.i("STORY CLASS", "Index: " + index);
        if(storyLine == -1 || index == -1) {
            stage = initial;
        }
        else if(storyLine == INT) {
            stage = intelligent.get(index);
        }
        else if (storyLine == ATH) {
            stage = athletic.get(index);
        }
        else if(storyLine == MUS) {
            stage = musical.get(index);
        }
        else {
            stage = initial;
        }
        return stage;
    }
}
