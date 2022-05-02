package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

public abstract class superDispatchKeyEvent {
    @Nullable
    private final superDispatchKeyEvent setMax;

    @NonNull
    public abstract superDispatchKeyEvent[] FastBitmap$CoordinateSystem();

    public abstract boolean IsOverlapping();

    public abstract boolean equals();

    @Nullable
    public abstract String getMax();

    @Nullable
    public abstract superDispatchKeyEvent getMax(@NonNull String str, @NonNull String str2);

    @Nullable
    public abstract String getMin();

    @Nullable
    public abstract superDispatchKeyEvent getMin(@NonNull String str);

    public abstract boolean isInside();

    public abstract boolean setMax();

    public abstract boolean setMax(@NonNull String str);

    @NonNull
    public abstract Uri setMin();

    public abstract boolean toFloatRange();

    public abstract boolean toIntRange();

    superDispatchKeyEvent(@Nullable superDispatchKeyEvent superdispatchkeyevent) {
        this.setMax = superdispatchkeyevent;
    }

    @NonNull
    public static superDispatchKeyEvent setMin(@NonNull File file) {
        return new createTextView((superDispatchKeyEvent) null, file);
    }

    @Nullable
    public static superDispatchKeyEvent getMin(@NonNull Context context, @NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new createView((superDispatchKeyEvent) null, context, uri);
        }
        return null;
    }

    @Nullable
    public static superDispatchKeyEvent setMax(@NonNull Context context, @NonNull Uri uri) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        return new createButton((superDispatchKeyEvent) null, context, DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId));
    }

    @Nullable
    public superDispatchKeyEvent length() {
        return this.setMax;
    }
}
