package com.example.popularlibraries_1.moxy.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MoxyView extends MvpView {
    @StateStrategyType(AddToEndStrategy.class)
    void setText(String msg);
}
