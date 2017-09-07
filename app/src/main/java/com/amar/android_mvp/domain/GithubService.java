package com.amar.android_mvp.domain;

import java.util.List;

import com.amar.android_mvp.domain.models.Repo;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Amar on 7/09/17.
 */

public interface GithubService {
    @GET("/users/{user}/repos")
    void listRepos(@Path("user") String user, Callback<List<Repo>> callback);
}