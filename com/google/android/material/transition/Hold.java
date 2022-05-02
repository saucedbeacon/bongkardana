package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Visibility;
import o.hasIcon;

public final class Hold extends Visibility {
    @NonNull
    public final Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }

    @NonNull
    public final Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }
}
