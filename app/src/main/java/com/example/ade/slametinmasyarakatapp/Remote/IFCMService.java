package com.example.ade.slametinmasyarakatapp.Remote;

import com.example.ade.slametinmasyarakatapp.Model.FCMResponse;
import com.example.ade.slametinmasyarakatapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Ade on 22/01/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAT5ThG0E:APA91bF4BYkDFAcv1arAQQuERI3xsZ89HblbfHnAhxTC2S1QfIqOWOdZ9SF0A20sY5242CTNxX9c22J8qXl6YpF46YEAqit19N1UB6F18aitQsiJ1ZdicjVoQ3P1liMePNgv796VLkkv"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
