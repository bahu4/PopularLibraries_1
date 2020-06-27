package com.example.popularlibraries_1.moxy.presenter;

import android.util.Log;

import com.example.popularlibraries_1.moxy.model.MoxyModel;
import com.example.popularlibraries_1.moxy.view.MoxyView;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyView> {

    private static final String TAG = "com.example.homework_1.moxy.presenter";

    MoxyModel model;

    public MoxyPresenter() {
        Log.d(TAG, "presenter: ");
        model = new MoxyModel();
    }

    public void onOkBtnClick(String text) {
        model.setMsg(text);
        getViewState().setText(text);
    }
}
