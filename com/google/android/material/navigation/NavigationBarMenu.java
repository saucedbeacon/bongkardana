package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.RatingCompat;
import o.onEvent;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends onEvent {
    private final int maxItemCount;
    @NonNull
    private final Class<?> viewClass;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    public final int getMaxItemCount() {
        return this.maxItemCount;
    }

    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.viewClass.getSimpleName());
        sb.append(" does not support submenus");
        throw new UnsupportedOperationException(sb.toString());
    }

    @NonNull
    public final MenuItem addInternal(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i, i2, i3, charSequence);
            if (addInternal instanceof RatingCompat) {
                RatingCompat ratingCompat = (RatingCompat) addInternal;
                ratingCompat.IsOverlapping = (ratingCompat.IsOverlapping & -5) | 4;
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(this.maxItemCount);
        sb.append(". Limit can be checked with ");
        sb.append(simpleName);
        sb.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sb.toString());
    }
}
