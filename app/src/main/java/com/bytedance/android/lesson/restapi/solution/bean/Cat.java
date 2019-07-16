package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    // TODO-C1 (1) Implement your Cat Bean here according to the response json

    @SerializedName("id")
    String mId;

    @SerializedName("url")
    String mUrl;

    public String getId() {
        return mId;
    }

    public String getUrl() {
        return mUrl;
    }



}
