package com.amar.android_mvp.domain.ui.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.amar.android_mvp.R;

/**
 * Created by Amar on 7/09/17.
 */

public class RepoListFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo_list_fragment);
    }

}
