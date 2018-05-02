package org.pltw.examples.storytime;

import java.util.Random;

public class RandomStory extends ParentStory{
    public final String TAG = this.getClass().getName();

    Random rand = new Random();
    int n = rand.nextInt(8);
    //switch(randomEvent)


}
