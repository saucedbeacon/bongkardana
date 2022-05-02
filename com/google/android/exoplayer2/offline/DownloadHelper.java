package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.List;
import o.getExitTransition;
import o.setReenterTransition;

public abstract class DownloadHelper {

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    public abstract DownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list);

    public abstract int getPeriodCount();

    public abstract DownloadAction getRemoveAction(@Nullable byte[] bArr);

    public abstract TrackGroupArray getTrackGroups(int i);

    /* access modifiers changed from: protected */
    public abstract void prepareInternal() throws IOException;

    public void prepare(final Callback callback) {
        final Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        new Thread() {
            public void run() {
                try {
                    DownloadHelper.this.prepareInternal();
                    handler.post(new setReenterTransition(this, callback));
                } catch (IOException e) {
                    handler.post(new getExitTransition(this, callback, e));
                }
            }

            public /* synthetic */ void lambda$run$0(Callback callback) {
                callback.onPrepared(DownloadHelper.this);
            }

            public /* synthetic */ void lambda$run$1(Callback callback, IOException iOException) {
                callback.onPrepareError(DownloadHelper.this, iOException);
            }
        }.start();
    }
}
