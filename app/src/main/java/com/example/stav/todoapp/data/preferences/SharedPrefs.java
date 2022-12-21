package com.example.stav.todoapp.data.preferences;



public interface SharedPrefs {

    void setCurrentUserId(String userId);

    String getCurrentUserId();

    void setToken(String token);

    String getToken();
// when logout
    void removeCredentials();
}
