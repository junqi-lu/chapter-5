package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id")
    private String mStudentId;
    @SerializedName("user_name")
    private String mUserName;
    @SerializedName("image_url")
    private String mImageUrl;
    @SerializedName("video_url")
    private String mVideoUrl;

    public String getStudentId() {
        return mStudentId;
    }

    public String getUserName() {
        return mUserName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getVideoUrl() {
        return mVideoUrl;
    }
}
