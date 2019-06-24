package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateView( (String) mStoryTextView.getText(), true);
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateView( (String) mStoryTextView.getText(), false);
            }
        });

    }

    private void updateView(String story, Boolean topSelected) {
        if (story == getString(R.string.T1_Story)) {
            if (topSelected == true) {
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mBottomButton.setText(R.string.T3_Ans2);
            } else {
                mStoryTextView.setText(R.string.T2_Story);
                mTopButton.setText(R.string.T2_Ans1);
                mBottomButton.setText(R.string.T2_Ans2);
            }
        } else if (story == getString(R.string.T2_Story)) {
            if (topSelected == true) {
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mBottomButton.setText(R.string.T3_Ans2);
            } else {
                mStoryTextView.setText(R.string.T4_End);
                mTopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
            }
        } else {
            if (topSelected == true) {
                mStoryTextView.setText(R.string.T6_End);
                mTopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
            } else {
                mStoryTextView.setText(R.string.T5_End);
                mTopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
            }
        }
    }

}
