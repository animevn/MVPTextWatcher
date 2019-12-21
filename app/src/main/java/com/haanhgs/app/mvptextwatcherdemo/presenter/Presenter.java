package com.haanhgs.app.mvptextwatcherdemo.presenter;

import com.haanhgs.app.mvptextwatcherdemo.model.User;
import com.haanhgs.app.mvptextwatcherdemo.view.MainView;

public class Presenter {

    private final User user;
    private final MainView mainView;

    public Presenter(MainView mainView){
        this.mainView = mainView;
        user = new User();
    }

    public void onNameEditText(String string){
        user.setName(string);
        mainView.updateText(user.toString());
    }

    public void onEmailEditText(String string){
        user.setEmail(string);
        mainView.updateText(user.toString());
    }

}
