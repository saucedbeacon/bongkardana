package o;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class dispatchRestoreInstanceState<D> {
    boolean mAbandoned = false;
    boolean mContentChanged = false;
    Context mContext;
    int mId;
    getMin<D> mListener;
    setMin<D> mOnLoadCanceledListener;
    boolean mProcessingChange = false;
    boolean mReset = true;
    boolean mStarted = false;

    public interface getMin<D> {
        void getMax(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate, @Nullable D d);
    }

    public interface setMin<D> {
        void getMin(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate);
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void onAbandon() {
    }

    /* access modifiers changed from: protected */
    @MainThread
    public boolean onCancelLoad() {
        return false;
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void onForceLoad() {
    }

    @MainThread
    public void onReset() {
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void onStartLoading() {
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void onStopLoading() {
    }

    public final class getMax extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public getMax() {
            super(new Handler());
        }

        public final void onChange(boolean z) {
            dispatchRestoreInstanceState.this.onContentChanged();
        }
    }

    public dispatchRestoreInstanceState(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @MainThread
    public void deliverResult(@Nullable D d) {
        getMin<D> getmin = this.mListener;
        if (getmin != null) {
            getmin.getMax(this, d);
        }
    }

    @MainThread
    public void deliverCancellation() {
        setMin<D> setmin = this.mOnLoadCanceledListener;
        if (setmin != null) {
            setmin.getMin(this);
        }
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    @MainThread
    public void registerListener(int i, @NonNull getMin<D> getmin) {
        if (this.mListener == null) {
            this.mListener = getmin;
            this.mId = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void unregisterListener(@NonNull getMin<D> getmin) {
        getMin<D> getmin2 = this.mListener;
        if (getmin2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (getmin2 == getmin) {
            this.mListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull setMin<D> setmin) {
        if (this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = setmin;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull setMin<D> setmin) {
        setMin<D> setmin2 = this.mOnLoadCanceledListener;
        if (setmin2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (setmin2 == setmin) {
            this.mOnLoadCanceledListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    @MainThread
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @MainThread
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    @MainThread
    public void forceLoad() {
        onForceLoad();
    }

    @MainThread
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    @MainThread
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @MainThread
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @MainThread
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @NonNull
    public String dataToString(@Nullable D d) {
        StringBuilder sb = new StringBuilder(64);
        setPositiveButton.setMax(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        setPositiveButton.setMax(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }
}
