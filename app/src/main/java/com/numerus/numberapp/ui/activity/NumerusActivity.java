package com.numerus.numberapp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.numerus.numberapp.R;
import com.numerus.numberapp.ui.activity.base.SimpleActivity;
import com.numerus.numberapp.ui.fragment.NumerusFragment;

import dagger.android.AndroidInjection;

/**
 * Created by kiran.kumar on 11/17/17.
 */

public class NumerusActivity extends SimpleActivity {

    @NonNull
    @Override
    protected Fragment getFragment() {
        return NumerusFragment.newInstance();
    }

    @Override
    protected void readBundle(@NonNull Bundle args) {

    }
}
