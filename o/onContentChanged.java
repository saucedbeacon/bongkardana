package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class onContentChanged {
    private final setMin length;

    interface setMin {
        @Nullable
        Uri getMax();

        @Nullable
        Object getMin();

        @NonNull
        ClipDescription length();

        @NonNull
        Uri setMax();

        void setMin();
    }

    static final class setMax implements setMin {
        @NonNull
        private final ClipDescription getMax;
        @Nullable
        private final Uri setMax;
        @NonNull
        private final Uri setMin;

        @Nullable
        public final Object getMin() {
            return null;
        }

        public final void setMin() {
        }

        setMax(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.setMin = uri;
            this.getMax = clipDescription;
            this.setMax = uri2;
        }

        @NonNull
        public final Uri setMax() {
            return this.setMin;
        }

        @NonNull
        public final ClipDescription length() {
            return this.getMax;
        }

        @Nullable
        public final Uri getMax() {
            return this.setMax;
        }
    }

    @RequiresApi(25)
    static final class getMax implements setMin {
        @NonNull
        final InputContentInfo setMax;

        getMax(@NonNull Object obj) {
            this.setMax = (InputContentInfo) obj;
        }

        getMax(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.setMax = new InputContentInfo(uri, clipDescription, uri2);
        }

        @NonNull
        public final Uri setMax() {
            return this.setMax.getContentUri();
        }

        @NonNull
        public final ClipDescription length() {
            return this.setMax.getDescription();
        }

        @Nullable
        public final Uri getMax() {
            return this.setMax.getLinkUri();
        }

        @Nullable
        public final Object getMin() {
            return this.setMax;
        }

        public final void setMin() {
            this.setMax.requestPermission();
        }
    }

    public onContentChanged(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.length = new getMax(uri, clipDescription, uri2);
        } else {
            this.length = new setMax(uri, clipDescription, uri2);
        }
    }

    private onContentChanged(@NonNull setMin setmin) {
        this.length = setmin;
    }

    @NonNull
    public final Uri getMin() {
        return this.length.setMax();
    }

    @NonNull
    public final ClipDescription setMax() {
        return this.length.length();
    }

    @Nullable
    public final Uri length() {
        return this.length.getMax();
    }

    @Nullable
    public static onContentChanged length(@Nullable Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new onContentChanged(new getMax(obj));
        }
        return null;
    }

    @Nullable
    public final Object setMin() {
        return this.length.getMin();
    }

    public final void getMax() {
        this.length.setMin();
    }
}
