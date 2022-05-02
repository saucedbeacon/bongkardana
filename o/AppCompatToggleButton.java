package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import o.ActivityChooserView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppCompatToggleButton implements setDropDownBackgroundResource {
    final hasOverlappingRendering length;
    final compatMeasureContentWidth setMax;
    private final getMinWidthMinor setMin;

    public AppCompatToggleButton(@NonNull WorkDatabase workDatabase, @NonNull hasOverlappingRendering hasoverlappingrendering, @NonNull getMinWidthMinor getminwidthminor) {
        this.length = hasoverlappingrendering;
        this.setMin = getminwidthminor;
        this.setMax = workDatabase.getMax();
    }

    @NonNull
    public final ListenableFuture<Void> length(@NonNull Context context, @NonNull UUID uuid, @NonNull ActivityChooserView.InnerLayout innerLayout) {
        setAttachListener length2 = setAttachListener.length();
        final setAttachListener setattachlistener = length2;
        final UUID uuid2 = uuid;
        final ActivityChooserView.InnerLayout innerLayout2 = innerLayout;
        final Context context2 = context;
        this.setMin.length(new Runnable() {
            public final void run() {
                try {
                    if (!setattachlistener.isCancelled()) {
                        String obj = uuid2.toString();
                        WorkInfo.State floatRange = AppCompatToggleButton.this.setMax.toFloatRange(obj);
                        if (floatRange == null || floatRange.isFinished()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        AppCompatToggleButton.this.length.getMax(obj, innerLayout2);
                        context2.startService(onDraw.getMin(context2, obj, innerLayout2));
                    }
                    setattachlistener.getMax(null);
                } catch (Throwable th) {
                    setattachlistener.getMin(th);
                }
            }
        });
        return length2;
    }
}
