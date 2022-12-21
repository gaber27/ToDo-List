package com.example.stav.todoapp.presentation.authentication;

import com.example.stav.todoapp.presentation.base.BaseView;



public interface RegisterContract {

    interface View extends BaseView {

        void registerFailure(String error);

        void setErrorEmailField();

        void setErrorPasswordField();

        void setErrorConfirmPasswordField();

        void navigateToMainScreen();
    }

    interface Presenter {

        void register(String email, String password, String confirmPassword, String userName);
    }
}
