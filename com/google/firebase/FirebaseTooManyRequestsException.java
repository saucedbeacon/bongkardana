package com.google.firebase;

import androidx.annotation.NonNull;

public class FirebaseTooManyRequestsException extends FirebaseException {
    public FirebaseTooManyRequestsException(@NonNull String str) {
        super(str);
    }
}
