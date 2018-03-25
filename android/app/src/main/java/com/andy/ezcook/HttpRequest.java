package com.andy.ezcook;

import com.andy.ezcook.network_models.CustomerID;
import com.andy.ezcook.network_models.CustomerOrder;
import com.andy.ezcook.network_models.Description;
import com.andy.ezcook.network_models.Detail;
import com.andy.ezcook.network_models.LoginModel;
import com.andy.ezcook.network_models.OrderType;
import com.andy.ezcook.network_models.PlaceOrderRequest;
import com.andy.ezcook.network_models.PlaceOrderResponse;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by Andy on 3/24/2018.
 */

public interface HttpRequest {
    @POST("epsilon/entity/auth/login/")
    Call<ResponseBody> login(@Body LoginModel body);

    @PUT("epsilon/entity/Default/17.200.001/SalesOrder/")
    Call<PlaceOrderResponse> placeOrder(@Body PlaceOrderRequest body);

}
