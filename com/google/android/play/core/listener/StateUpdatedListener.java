package com.google.android.play.core.listener;

import androidx.annotation.NonNull;

public interface StateUpdatedListener<StateT> {
    void onStateUpdate(@NonNull StateT statet);
}
