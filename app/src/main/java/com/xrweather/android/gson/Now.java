package com.xrweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jk on 2017/3/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
