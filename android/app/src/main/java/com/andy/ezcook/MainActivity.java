package com.andy.ezcook;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.karan.churi.PermissionManager.PermissionManager;
import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private FirebaseDatabase database;
    private SweetAlertDialog mProgress;
    private StorageReference mStorageRef;
    private DatabaseReference imagesRef;
    private PermissionManager permission;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private RecipeAdapter mAdapter;
    private String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button updateImageButton = findViewById(R.id.updateImageButton);
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);

        mStorageRef = FirebaseStorage.getInstance().getReference(); //where images are stored
        database = FirebaseDatabase.getInstance();

        imagesRef = database.getReference();

        permission=new PermissionManager() {
            @Override
            public void ifCancelledAndCanRequest(Activity activity) {
                // Do Customized operation if permission is cancelled without checking "Don't ask again"
                // Use super.ifCancelledAndCanRequest(activity); or Don't override this method if not in use
            }

            @Override
            public void ifCancelledAndCannotRequest(Activity activity) {
                // Do Customized operation if permission is cancelled with checking "Don't ask again"
                // Use super.ifCancelledAndCannotRequest(activity); or Don't override this method if not in use
            }

            @Override
            public List<String> setPermission() {
                // If You Don't want to check permission automatically and check your own custom permission
                // Use super.setPermission(); or Don't override this method if not in use
                List<String> customPermission=new ArrayList<>();
                customPermission.add(Manifest.permission.CAMERA);
                customPermission.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
                customPermission.add(Manifest.permission.INTERNET);
                customPermission.add(Manifest.permission.READ_EXTERNAL_STORAGE);
                return customPermission;
            }
        };
        permission.checkAndRequestPermissions(this);
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
                "vVvlgy37-cw","burger recipe"));

        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "6ajFGHWsDl0",
                 "salmon recipe"));
        recipes.add(new Recipe("hamburger",
                "http://2wk128489wjq47m3kwxwe9hh.wpengine.netdna-cdn.com/wp-content/uploads/2017/08/burgers_main-bacon-cheeseburger-hamburger-stand.jpg",
                "vVvlgy37-cw",
                "burger recipe"));

        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "6ajFGHWsDl0",
                "salmon recipe"));
        recipes.add(new Recipe("hamburger",
                "http://2wk128489wjq47m3kwxwe9hh.wpengine.netdna-cdn.com/wp-content/uploads/2017/08/burgers_main-bacon-cheeseburger-hamburger-stand.jpg",
                "vVvlgy37-cw",
                "burger recipe"));

        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "6ajFGHWsDl0",
                "salmon recipe"));
        recipes.add(new Recipe("hamburger",
                "http://2wk128489wjq47m3kwxwe9hh.wpengine.netdna-cdn.com/wp-content/uploads/2017/08/burgers_main-bacon-cheeseburger-hamburger-stand.jpg",
                "vVvlgy37-cw",
                "burger recipe"));

        recipes.add(new Recipe("salmon",
                "https://www.seriouseats.com/recipes/images/2016/08/20160826-sous-vide-salmon-46-1500x1125.jpg",
                "6ajFGHWsDl0",
                "salmon recipe"));
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

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(this, CameraActivity.class);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("returned", "returned to main");
    }

    private DatabaseReference setupDatabase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference imagesRef = database.getReference("images"); // ref for where we store images

        DatabaseReference recipesRef = database.getReference("recipes");

        recipesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        return imagesRef;
    }
}
