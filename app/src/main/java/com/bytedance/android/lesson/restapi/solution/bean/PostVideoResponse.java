package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    @SerializedName("success")
    private boolean mIsSuccess;
    @SerializedName("item")
    private Feed mItem;

    public boolean isSuccess() {
        return mIsSuccess;
    }

    public Feed setItem() {
        return mItem;
    }
}
