package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ContentFrameLayout implements AppCompatButton {
    static final String getMax = setSupportBackgroundTintList.length("WorkProgressUpdater");
    final getMinWidthMinor length;
    final WorkDatabase setMin;

    public ContentFrameLayout(@NonNull WorkDatabase workDatabase, @NonNull getMinWidthMinor getminwidthminor) {
        this.setMin = workDatabase;
        this.length = getminwidthminor;
    }

    @NonNull
    public final ListenableFuture<Void> getMax(@NonNull final UUID uuid, @NonNull final updateAppearance updateappearance) {
        final setAttachListener length2 = setAttachListener.length();
        this.length.length(new Runnable() {
            public final void run() {
                String obj = uuid.toString();
                setSupportBackgroundTintList.getMax();
                String str = ContentFrameLayout.getMax;
                ContentFrameLayout.this.setMin.beginTransaction();
                try {
                    getInternalPopup length2 = ContentFrameLayout.this.setMin.getMax().length(obj);
                    if (length2 != null) {
                        if (length2.getMin == WorkInfo.State.RUNNING) {
                            ContentFrameLayout.this.setMin.equals().setMin(new performClick(obj, updateappearance));
                        } else {
                            setSupportBackgroundTintList.getMax();
                            String str2 = ContentFrameLayout.getMax;
                        }
                        length2.getMax(null);
                        ContentFrameLayout.this.setMin.setTransactionSuccessful();
                        ContentFrameLayout.this.setMin.endTransaction();
                        return;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } catch (Throwable th) {
                    ContentFrameLayout.this.setMin.endTransaction();
                    throw th;
                }
            }
        });
        return length2;
    }
}
