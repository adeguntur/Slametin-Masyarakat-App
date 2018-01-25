package com.example.ade.slametinmasyarakatapp.Common;

import com.example.ade.slametinmasyarakatapp.Remote.FCMClient;
import com.example.ade.slametinmasyarakatapp.Remote.IFCMService;

/**
 * Created by Ade on 22/01/2018.
 */

public class Common {
    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "Users";
    public static final String user_rider_tbl = "Riders";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
