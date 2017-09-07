package com.amar.android_mvp.domain.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Amar on 7/09/17.
 */
public class Repo {
    public int id;
    public String name;
    public boolean fork;
    @SerializedName("stargazers_count")
    public int stars;
}
