package org.pltw.examples.storytime;

import org.pltw.examples.storytime.stories.Story1;

import java.util.ArrayList;

public class Stage {
    public static int count;
    private int id;
    private int storyLine;
    private int mainText;
    private int option1;
    private int option2;
    private int option3;
    private int stage1;
    private int stage2;
    private int stage3;
    public static ArrayList<Stage> allStages = new ArrayList<>();
    private static Story1 story1 = Story1.getStory();
    private static ArrayList<Stage> intelligent = story1.getIntelligent();
    private static ArrayList<Stage> athletic = story1.getAthletic();
    private static ArrayList<Stage> musical = story1.getMusical();

    public Stage(int storyLine, int mainText, int option1, int option2, int option3, int id, int stage1, int stage2, int stage3) {
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
         allStages.add(this);
         /*
         if(storyLine == 0) {
             intelligent.add(id, this);
         }
        else if(storyLine == 1) {
            athletic.add(id, this);
        }
        else if(storyLine == 2) {
            musical.add(id, this);
        }*/
    }













    //GETTERS AND SETTERS


    public int getStoryLine() {
        return storyLine;
    }

    public int getId() {
        return id;
    }

    public int getMainText() {
        return mainText;
    }

    public int getOption1() {
        return option1;
    }

    public int getOption2() {
        return option2;
    }

    public int getOption3() {
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
