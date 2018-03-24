package com.andy.ezcook;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecipeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button updateImageButton = findViewById(R.id.updateImageButton);
        mRecyclerView = findViewById(R.id.recyclerView);

        mRecyclerView = findViewById(R.id.recyclerView);

        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        /**
         * DUMMY LIST
         */
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("hamburger",
                "http://2wk128489wjq47m3kwxwe9hh.wpengine.netdna-cdn.com/wp-content/uploads/2017/08/burgers_main-bacon-cheeseburger-hamburger-stand.jpg",
                "https://www.youtube.com/watch?v=vVvlgy37-cw",
                "L","burger recipe"));

        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "https://www.youtube.com/watch?v=6ajFGHWsDl0",
                "D", "salmon recipe"));
        /**
         * END DUMMY LIST
         */

        mAdapter = new RecipeAdapter(getApplicationContext(), recipes);

        mAdapter.setOnItemClickListener(new RecipeAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(View view, int position, Recipe data) {
                Intent i = new Intent(MainActivity.this, ViewRecipeActivity.class);
                Bundle mBundle = new Bundle();
                mBundle.putString("name", data.getName());
                mBundle.putString("imageURL", data.getImageUrl());
                mBundle.putString("youtubeURL", data.getYoutubeURL());
                mBundle.putString("category", data.getCategory());
                mBundle.putString("recipe", data.getRecipe());
                i.putExtras(mBundle);
                startActivity(i);
            }
        });
        mRecyclerView.setAdapter(mAdapter);

        updateImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent();
            }
        });
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
