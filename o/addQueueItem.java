package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class addQueueItem extends ContextWrapper {
    private static final Object getMax = new Object();
    private static ArrayList<WeakReference<addQueueItem>> setMin;
    private final Resources.Theme getMin;
    private final Resources setMax;

    public static Context getMax(@NonNull Context context) {
        if (!setMax(context)) {
            return context;
        }
        synchronized (getMax) {
            if (setMin == null) {
                setMin = new ArrayList<>();
            } else {
                for (int size = setMin.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = setMin.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        setMin.remove(size);
                    }
                }
                for (int size2 = setMin.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = setMin.get(size2);
                    addQueueItem addqueueitem = weakReference2 != null ? (addQueueItem) weakReference2.get() : null;
                    if (addqueueitem != null && addqueueitem.getBaseContext() == context) {
                        return addqueueitem;
                    }
                }
            }
            addQueueItem addqueueitem2 = new addQueueItem(context);
            setMin.add(new WeakReference(addqueueitem2));
            return addqueueitem2;
        }
    }

    private static boolean setMax(@NonNull Context context) {
        if ((context instanceof addQueueItem) || (context.getResources() instanceof isShuffleModeEnabledRemoved) || (context.getResources() instanceof playFromMediaId)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || playFromMediaId.getMin()) {
            return true;
        }
        return false;
    }

    private addQueueItem(@NonNull Context context) {
        super(context);
        if (playFromMediaId.getMin()) {
            playFromMediaId playfrommediaid = new playFromMediaId(this, context.getResources());
            this.setMax = playfrommediaid;
            Resources.Theme newTheme = playfrommediaid.newTheme();
            this.getMin = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.setMax = new isShuffleModeEnabledRemoved(this, context.getResources());
        this.getMin = null;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.getMin;
        return theme == null ? super.getTheme() : theme;
    }

    public final void setTheme(int i) {
        Resources.Theme theme = this.getMin;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        return this.setMax;
    }

    public final AssetManager getAssets() {
        return this.setMax.getAssets();
    }
}
