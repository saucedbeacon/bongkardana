package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import o.dispatchRestoreInstanceState;

public final class saveActionViewStates extends dispatchSaveInstanceState<Cursor> {
    final dispatchRestoreInstanceState<Cursor>.getMax getMax = new dispatchRestoreInstanceState.getMax();
    String[] getMin;
    Cursor isInside;
    Uri length;
    String[] setMax;
    String setMin;
    StringRes toFloatRange;
    String toIntRange;

    public final /* synthetic */ void onCanceled(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: getMax */
    public final Cursor loadInBackground() {
        Cursor min;
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.toFloatRange = new StringRes();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            min = target.getMin(getContext().getContentResolver(), this.length, this.setMax, this.setMin, this.getMin, this.toIntRange, this.toFloatRange);
            if (min != null) {
                min.getCount();
                min.registerContentObserver(this.getMax);
            }
            synchronized (this) {
                this.toFloatRange = null;
            }
            return min;
        } catch (RuntimeException e) {
            min.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.toFloatRange = null;
                throw th;
            }
        }
    }

    public final void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            if (this.toFloatRange != null) {
                this.toFloatRange.setMax();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: getMin */
    public void deliverResult(Cursor cursor) {
        if (!isReset()) {
            Cursor cursor2 = this.isInside;
            this.isInside = cursor;
            if (isStarted()) {
                super.deliverResult(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public saveActionViewStates(@NonNull Context context, @NonNull Uri uri) {
        super(context);
        this.length = uri;
        this.setMax = null;
        this.setMin = null;
        this.getMin = null;
        this.toIntRange = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Cursor cursor = this.isInside;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.isInside == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.isInside;
        if (cursor != null && !cursor.isClosed()) {
            this.isInside.close();
        }
        this.isInside = null;
    }

    @Deprecated
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.length);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.setMax));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.setMin);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.getMin));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.toIntRange);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.isInside);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }
}
