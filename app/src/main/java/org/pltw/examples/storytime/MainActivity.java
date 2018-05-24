package org.pltw.examples.storytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.pltw.examples.storytime.stories.Story;
import org.pltw.examples.storytime.stories.Story1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mainText;
    private ListView storyList;
    private ArrayList<Story> Stories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = findViewById(R.id.mainText);
        Stories = new ArrayList<>();
        //ADD STORY CONSTRUCTORS HERE   vvvv
        Stories.add(Story1.getStory());



        storyList = findViewById(R.id.storyList);
        ArrayAdapter<Story> arrayAdapter = new ArrayAdapter<Story>(this, R.layout.list_view, Stories);
        storyList.setAdapter(arrayAdapter);
        storyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Intent intent = new Intent(view.getContext(), StoryRunner.class);
                intent.putExtra("story", Stories.get(pos));
                startActivity(intent);            }
        });
    }
}
