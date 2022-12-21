package com.example.stav.todoapp.data.repositories.local;

import com.example.stav.todoapp.data.preferences.SharedPrefs;
import javax.inject.Inject;


public class TodoLocalData {

    private SharedPrefs mSharedPrefs;

    @Inject
    public TodoLocalData(SharedPrefs sharedPrefs) {
        mSharedPrefs = sharedPrefs;
    }
}
