package com.example.popularlibraries_1.without_moxy.presenter;

import android.util.Log;

import com.example.popularlibraries_1.without_moxy.model.WithoutMoxyModel;
import com.example.popularlibraries_1.without_moxy.view.WithoutMoxyView;

public class WithoutMoxyPresenter {

    private static final String TAG = "com.example.homework_1.without_moxy.presenter";

    WithoutMoxyModel model;
    WithoutMoxyView view;

    public WithoutMoxyPresenter(WithoutMoxyView view) {
        Log.d(TAG, "presenter: ");
        this.view = view;
        model = new WithoutMoxyModel();
    }

    public void onOkBtnClick() {
        String newText = view.getText();
        model.setMsg(newText);
        view.setText(newText);
    }
}