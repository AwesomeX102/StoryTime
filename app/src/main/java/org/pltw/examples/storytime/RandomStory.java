package org.pltw.examples.storytime;

import java.util.Random;

public class RandomStory extends MainActivity {
    public final String TAG = this.getClass().getName();

    Random rand = new Random();

    int n = rand.nextInt(8);

    public String getStoryString() {
        return storyString;
    }

    String storyString;


    @Override
    public void RandomEvent() {
        switch (n) {
            case 1:
                storyString = "Story about Wolf";
                break;
            case 2:
                storyString = "Story about Steve";
                break;
            case 3:
                storyString = "Story about Hunger";
                break;
            case 4:
                storyString = "Story about Village Friend";
                break;
            case 5:
                storyString = "Story about Insanity Levels";
                break;
            case 6:
                storyString = "Story about TreeEvent";
                break;
            case 7:
                storyString = "Story about Intelligence";
                break;
            default:
                storyString = "Invalid story";
                break;
        }
        System.out.println(storyString);
    }
}





