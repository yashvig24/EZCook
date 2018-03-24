package com.andy.ezcook;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ViewRecipeActivity extends YouTubeBaseActivity {

    private String name;
    private String imageURL;
    private String youtubeURL;
    private String category;
    private String recipe;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    private TextView titleTextView;
    private TextView recipeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipe);

        Bundle extras = getIntent().getExtras();

        name = extras.getString("name");
        imageURL = extras.getString("imageURL");
        youtubeURL = extras.getString("youtubeURL");
        category = extras.getString("category");
        recipe = extras.getString("recipe");

        titleTextView = findViewById(R.id.titleTextView);
        recipeTextView = findViewById(R.id.recipeTextView);

        titleTextView.setText("Recipe for " + name);
        recipeTextView.setText(recipe);

        youTubePlayerView = findViewById(R.id.youtubeView);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                String[] pieces = youtubeURL.split("v=");
                youTubePlayer.loadVideo(pieces[1]);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youTubePlayerView.initialize("AIzaSyAMef8Y67MeCi0ZAV7ZNlQ7R4FH0bzegbQ", onInitializedListener);


    }
}
