package com.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.togle_button);
        imageView=(ImageView)findViewById(R.id.image_view);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked())
                {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                }else
                {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                }
            }
        });
    }
}
