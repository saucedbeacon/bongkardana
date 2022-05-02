package o;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface onQueueTitleChanged {

    public interface setMax {
        void getMax(@NonNull onEvent onevent, boolean z);

        boolean setMax(@NonNull onEvent onevent);
    }

    boolean collapseItemActionView(onEvent onevent, RatingCompat ratingCompat);

    boolean expandItemActionView(onEvent onevent, RatingCompat ratingCompat);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, onEvent onevent);

    void onCloseMenu(onEvent onevent, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(onExtrasChanged onextraschanged);

    void setCallback(setMax setmax);

    void updateMenuView(boolean z);
}
