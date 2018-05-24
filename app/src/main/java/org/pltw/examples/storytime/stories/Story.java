package org.pltw.examples.storytime.stories;

import android.util.Log;

import org.pltw.examples.storytime.R;
import org.pltw.examples.storytime.Stage;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Story implements Serializable{
    private static Story story;
    private String name;

    public Story() {

    }

    public abstract Stage getStage(int storyLine, int index);

    public abstract String getName();
}

