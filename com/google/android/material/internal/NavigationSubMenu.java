package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import o.RatingCompat;
import o.onEvent;
import o.onExtrasChanged;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationSubMenu extends onExtrasChanged {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, RatingCompat ratingCompat) {
        super(context, navigationMenu, ratingCompat);
    }

    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((onEvent) getParentMenu()).onItemsChanged(z);
    }
}
