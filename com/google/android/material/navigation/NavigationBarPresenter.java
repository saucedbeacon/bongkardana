package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import o.RatingCompat;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onEvent;
import o.onExtrasChanged;
import o.onQueueTitleChanged;
import o.onSessionDestroyed;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements onQueueTitleChanged {

    /* renamed from: id  reason: collision with root package name */
    private int f10830id;
    private onEvent menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    public boolean collapseItemActionView(@Nullable onEvent onevent, @Nullable RatingCompat ratingCompat) {
        return false;
    }

    public boolean expandItemActionView(@Nullable onEvent onevent, @Nullable RatingCompat ratingCompat) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public void onCloseMenu(@Nullable onEvent onevent, boolean z) {
    }

    public boolean onSubMenuSelected(@Nullable onExtrasChanged onextraschanged) {
        return false;
    }

    public void setCallback(@Nullable onQueueTitleChanged.setMax setmax) {
    }

    public void setMenuView(@NonNull NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void initForMenu(@NonNull Context context, @NonNull onEvent onevent) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-1388860069, oncanceled);
            onCancelLoad.getMin(-1388860069, oncanceled);
        }
        this.menu = onevent;
        this.menuView.initialize(onevent);
    }

    @Nullable
    public onSessionDestroyed getMenuView(@Nullable ViewGroup viewGroup) {
        return this.menuView;
    }

    public void updateMenuView(boolean z) {
        if (!this.updateSuspended) {
            if (z) {
                this.menuView.buildMenuView();
            } else {
                this.menuView.updateMenuView();
            }
        }
    }

    public void setId(int i) {
        this.f10830id = i;
    }

    public int getId() {
        return this.f10830id;
    }

    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    public void onRestoreInstanceState(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.setBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @NonNull
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        @Nullable
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(@NonNull Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }
    }
}
