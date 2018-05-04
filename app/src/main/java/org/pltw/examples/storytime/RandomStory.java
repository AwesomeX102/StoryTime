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


    //@Override
    public void RandomEvent() {
        switch (n) {
            case 1:
                storyString = getString(R.string.story_about_wolf);
                break;
            case 2:
                storyString = getString(R.string.story_about_steve);
                break;
            case 3:
                storyString = getString(R.string.story_about_hunger);
                break;
            case 4:
                storyString = getString(R.string.story_about_villageFriend);
                break;
            case 5:
                storyString = getString(R.string.story_about_insanityLevels);
                break;
            case 6:
                storyString = getString(R.string.story_about_treeEvent);
                
                break;
            case 7:
                storyString = getString(R.string.story_about_intelligence);
                break;
            default:
                storyString = getString(R.string.invalid_story);
                break;
        }
        System.out.println(storyString);
    }
}





