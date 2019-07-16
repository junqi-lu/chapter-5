package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json

    @SerializedName("success")
    private boolean mIsSuccess;
    @SerializedName("feeds")
    private List<Feed> mFeeds;

    public boolean isSuccess() {
        return mIsSuccess;
    }

    public List<Feed> getFeeds() {
        return mFeeds;
    }
}
