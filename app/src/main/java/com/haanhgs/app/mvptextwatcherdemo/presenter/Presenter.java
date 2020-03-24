package com.haanhgs.app.mvptextwatcherdemo.presenter;

import com.haanhgs.app.mvptextwatcherdemo.model.User;
import com.haanhgs.app.mvptextwatcherdemo.view.UpdateMainView;

public class Presenter {

    private User user;
    private UpdateMainView listener;

    public Presenter(UpdateMainView listener) {
        user = new User();
        this.listener = listener;
    }

    public void updateName(String string){
        user.setName(string);
        listener.updateText(user.toString());
    }

    public void updateEmail(String string){
        user.setEmail(string);
        listener.updateText(user.toString());
    }
}
