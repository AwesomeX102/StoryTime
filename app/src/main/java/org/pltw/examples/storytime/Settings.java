package org.pltw.examples.storytime;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Settings extends AppCompatActivity {
    private TextView settingsheader;
    private Button backButton;
    private TextView settings1_textView;
    private SeekBar settings1_SeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        settingsheader = findViewById(R.id.settingsHeader);
        backButton = findViewById(R.id.backToMenuButton);
        settings1_textView = findViewById(R.id.settings1_textView);
        settings1_SeekBar = findViewById(R.id.settings1_seekBar);

        final SharedPreferences sharedPref = this.getSharedPreferences("Settings", Context.MODE_PRIVATE);
        settings1_SeekBar.setProgress(sharedPref.getInt(getString(R.string.typing_delay), 50));

        settings1_textView.setText(getString(R.string.settings1)+ " " + settings1_SeekBar.getProgress()+ " ms");

        settings1_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                settings1_textView.setText(getString(R.string.settings1)+" " + i + " ms");
                //sharedPref.edit().putInt(getString(R.string.typing_delay), i);
                //sharedPref.edit().commit();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt(getString(R.string.typing_delay), seekBar.getProgress());
                editor.commit();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
