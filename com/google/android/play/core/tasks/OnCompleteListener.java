package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;

public interface OnCompleteListener<ResultT> {
    void onComplete(@NonNull Task<ResultT> task);
}
