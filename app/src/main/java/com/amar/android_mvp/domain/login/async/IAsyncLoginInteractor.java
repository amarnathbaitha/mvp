package com.amar.android_mvp.domain.login.async;

/**
 * Created by Amar on 7/09/17.
 */
public interface IAsyncLoginInteractor {
    void validateCredentialsAsync(OnLoginFinishedListener listener, String username, String password);
}
