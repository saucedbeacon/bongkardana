package com.google.android.material.internal;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextWatcherAdapter implements TextWatcher {
    public void afterTextChanged(@NonNull Editable editable) {
    }

    public void beforeTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(568561831, oncanceled);
            onCancelLoad.getMin(568561831, oncanceled);
        }
    }

    public void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
    }
}
