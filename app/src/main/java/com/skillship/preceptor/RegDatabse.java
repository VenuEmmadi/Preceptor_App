package com.skillship.preceptor;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegDatabase {

    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;

    public String email, pass;

    public RegDatabase() {

    }

    public RegDatabase(String email, String pass) {

        this.email = email;
        this.pass = pass;
    }
}

