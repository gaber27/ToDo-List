package com.example.stav.todoapp.presentation.splash;

import com.example.stav.todoapp.presentation.base.BaseView;


public interface SplashContract {

    interface View extends BaseView{

        void navigateToMainScreen();

        void navigateToAuthenticationScreen();
    }

    interface Presenter{

        void authenticate();
    }
}
