package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.RatingCompat;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onEvent;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenu extends onEvent {
    public NavigationMenu(Context context) {
        super(context);
    }

    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-990319906, oncanceled);
            onCancelLoad.getMin(-990319906, oncanceled);
        }
        RatingCompat ratingCompat = (RatingCompat) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, ratingCompat);
        ratingCompat.setMax = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(ratingCompat.getTitle());
        return navigationSubMenu;
    }
}
