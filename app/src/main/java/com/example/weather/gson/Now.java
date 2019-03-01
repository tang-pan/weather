package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2019/3/1.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}
