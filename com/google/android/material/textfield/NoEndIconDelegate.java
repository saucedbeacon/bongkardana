package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

class NoEndIconDelegate extends EndIconDelegate {
    NoEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: package-private */
    public void initialize() {
        this.textInputLayout.setEndIconOnClickListener((View.OnClickListener) null);
        this.textInputLayout.setEndIconDrawable((Drawable) null);
        this.textInputLayout.setEndIconContentDescription((CharSequence) null);
    }
}
