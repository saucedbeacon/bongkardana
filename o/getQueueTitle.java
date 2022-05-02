package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import o.ITrustedWebActivityCallback;
import o.onEvent;

public final class getQueueTitle {
    public length getMax;
    public final onEvent getMin;
    public final onMetadataChanged length;
    private final View setMax;
    public final Context setMin;

    public interface length {
        boolean length(MenuItem menuItem);
    }

    public getQueueTitle(@NonNull Context context, @NonNull View view) {
        this(context, view, (byte) 0);
    }

    private getQueueTitle(@NonNull Context context, @NonNull View view, byte b) {
        this(context, view, ITrustedWebActivityCallback.Stub.getMin.asBinder);
    }

    private getQueueTitle(@NonNull Context context, @NonNull View view, @AttrRes int i) {
        this.setMin = context;
        this.setMax = view;
        onEvent onevent = new onEvent(context);
        this.getMin = onevent;
        onevent.setCallback(new onEvent.length() {
            public final void onMenuModeChange(@NonNull onEvent onevent) {
            }

            public final boolean onMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
                if (getQueueTitle.this.getMax != null) {
                    return getQueueTitle.this.getMax.length(menuItem);
                }
                return false;
            }
        });
        onMetadataChanged onmetadatachanged = new onMetadataChanged(context, this.getMin, view, false, i, 0);
        this.length = onmetadatachanged;
        onmetadatachanged.getMin = 0;
        this.length.getMax = new PopupWindow.OnDismissListener() {
            public final void onDismiss() {
            }
        };
    }
}
