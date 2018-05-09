package org.pltw.examples.storytime;

import java.util.ArrayList;

public class Stage {
    public static int count;
    private int id;
    private int storyLine;
    private String mainText;
    private String option1;
    private String option2;
    private String option3;
    private int stage1;
    private int stage2;
    private int stage3;
    private static Story story = Story.getStory();
    private static ArrayList<Stage> intelligent = story.getIntelligent();
    private static ArrayList<Stage> athletic = story.getAthletic();
    private static ArrayList<Stage> musical = story.getMusical();

    public Stage(int storyLine, String mainText, String option1, String option2, String option3, int id, int stage1, int stage2, int stage3) {
         this.storyLine = storyLine;
         this.mainText = mainText;
         this.option1 = option1;
         this.option2 = option2;
         this.option3 = option3;
         this.stage1 = stage1;
         this.stage2 = stage2;
         this.stage3 = stage3;
         count ++;
         this.id = id;
         if(storyLine == 0) {
             intelligent.add(id, this);
         }
        else if(storyLine == 1) {
            athletic.add(id, this);
        }
        else if(storyLine == 2) {
            musical.add(id, this);
        }
    }













    //GETTERS AND SETTERS


    public int getStoryLine() {
        return storyLine;
    }

    public int getId() {
        return id;
    }

    public String getMainText() {
        return mainText;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public int getStage1() {
        return stage1;
    }

    public int getStage2() {
        return stage2;
    }

    public int getStage3() {
        return stage3;
    }

    public void setStage1(int stage1) {
        this.stage1 = stage1;
    }

    public void setStage2(int stage2) {
        this.stage2 = stage2;
    }

    public void setStage3(int stage3) {
        this.stage3 = stage3;
    }
}
