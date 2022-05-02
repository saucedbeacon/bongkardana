package id.dana.notificationcenter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.notificationcenter.views.NotificationCenterViewHolder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.ContactActivityResultPoint;
import o.ContactPickerCallback;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.dispatchOnCancelled;
import o.getShortName;
import o.onCancelLoad;
import o.onCanceled;
import o.setResultAccount;

public final class NotificationAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<ContactActivityResultPoint>, ContactActivityResultPoint> {
    public boolean getMin;
    private final getShortName setMin;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        public static final int EMPTY = 0;
        public static final int FOOTER = 2;
        public static final int NORMAL = 1;
    }

    public NotificationAdapter(getShortName getshortname) {
        this.setMin = getshortname;
    }

    public final int getItemViewType(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-59074680, oncanceled);
            onCancelLoad.getMin(-59074680, oncanceled);
        }
        if (getMax() == null || getMax().isEmpty()) {
            return 0;
        }
        if (!this.getMin || i != getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    public final int getItemCount() {
        if (getMax() == null || getMax().isEmpty()) {
            return 1;
        }
        return super.getItemCount() + (this.getMin ? 1 : 0);
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new NotificationCenterViewHolder(viewGroup.getContext(), viewGroup, this.setMin);
        }
        if (i != 2) {
            return new setResultAccount(viewGroup.getContext(), viewGroup);
        }
        return new ContactPickerCallback(viewGroup.getContext(), viewGroup);
    }
}
