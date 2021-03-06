package com.amar.android_mvp.domain.repos;

import java.util.List;

import com.amar.android_mvp.domain.models.Repo;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Amar on 7/09/17.
 */
public interface IRepoListView {
    void onReposLoadedSuccess(List<Repo> list, Response response);
    void onReposLoadedFailure(RetrofitError error);
}
