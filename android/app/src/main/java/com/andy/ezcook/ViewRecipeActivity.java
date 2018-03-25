package com.andy.ezcook;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.andy.ezcook.network_models.Branch;
import com.andy.ezcook.network_models.CustomerID;
import com.andy.ezcook.network_models.CustomerOrder;
import com.andy.ezcook.network_models.Description;
import com.andy.ezcook.network_models.Detail;
import com.andy.ezcook.network_models.InventoryID;
import com.andy.ezcook.network_models.LoginModel;
import com.andy.ezcook.network_models.OrderQty;
import com.andy.ezcook.network_models.OrderType;
import com.andy.ezcook.network_models.PlaceOrderRequest;
import com.andy.ezcook.network_models.PlaceOrderResponse;
import com.andy.ezcook.network_models.UOM;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewRecipeActivity extends YouTubeBaseActivity {

    private String name;
    private String imageURL;
    private String youtubeURL;
    private String recipe;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    private Button orderMissingIngedientsButton;

    private TextView titleTextView;
    private TextView recipeTextView;

    private HttpRequest httpRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipe);

        Bundle extras = getIntent().getExtras();

        name = extras.getString("name");
        imageURL = extras.getString("imageURL");
        youtubeURL = extras.getString("youtubeURL");
        recipe = extras.getString("recipe");

        titleTextView = findViewById(R.id.titleTextView);
        recipeTextView = findViewById(R.id.recipeTextView);
        orderMissingIngedientsButton = findViewById(R.id.orderIngredientsButton);

        titleTextView.setText("Recipe for " + name);
        recipeTextView.setText(recipe);

        httpRequest = AcumaticaClient.getBbcService(getApplicationContext());

        orderMissingIngedientsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                httpRequest.login(new LoginModel("admin", "Goodbye", "")).enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        String CustomerID = "ARTCAGES";
                        String MISSINGINGREDIENTS = "LETTUCE";
                        int orderQty = 2;

                        OrderType orderType = new OrderType("SO");
                        CustomerID customerID = new CustomerID(CustomerID);
                        Description description = new Description("Ordering " + orderQty + " " + MISSINGINGREDIENTS + " FOR " + CustomerID);
                        CustomerOrder customerOrder = new CustomerOrder("SO180-009-28");
                        List<Detail> details = new ArrayList<>();

                        details.add(new Detail(new InventoryID("LETTUCE"), new OrderQty(orderQty), new UOM("EA")));

                        httpRequest.placeOrder(new PlaceOrderRequest(details, orderType, customerID, description, customerOrder)).enqueue(new Callback<PlaceOrderResponse>() {
                            @Override
                            public void onResponse(Call<PlaceOrderResponse> call, Response<PlaceOrderResponse> response) {
                                makeSnackbar("added order!", true);
                            }

                            @Override
                            public void onFailure(Call<PlaceOrderResponse> call, Throwable t) {

                            }
                        });
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        });

        youTubePlayerView = findViewById(R.id.youtubeView);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(youtubeURL);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youTubePlayerView.initialize("AIzaSyAMef8Y67MeCi0ZAV7ZNlQ7R4FH0bzegbQ", onInitializedListener);
    }

    @Override
    public void onBackPressed() {
        this.finish();
    }

    private void makeSnackbar(String text, boolean longer) {
        Snackbar.make(findViewById(android.R.id.content), text, longer ? Snackbar.LENGTH_LONG : Snackbar.LENGTH_SHORT).show();
    }


}
