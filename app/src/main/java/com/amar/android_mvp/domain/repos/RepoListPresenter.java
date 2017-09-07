package com.amar.android_mvp.domain.repos;

import java.util.List;

import com.amar.android_mvp.domain.models.Repo;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Amar on 7/09/17.
 */
public class RepoListPresenter implements IRepoListPresenter, OnRepoInteractorFinishedListener {

    private IRepoListView view;
    private RepoListInteractor interactor;

    public RepoListPresenter(IRepoListView view) {
        this.view = view;
        this.interactor = new RepoListInteractor(this); // pass in the InteractorListener
    }

    @Override
    public void loadCommits(String username) {
        interactor.loadRecentCommits(username);
    }

    @Override
    public void onNetworkSuccess(List<Repo> list, Response response) {
        view.onReposLoadedSuccess(list, response);
    }

    @Override
    public void onNetworkFailure(RetrofitError error) {
        view.onReposLoadedFailure(error);
    }
}
