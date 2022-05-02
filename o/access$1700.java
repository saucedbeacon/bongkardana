package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import o.SolverVariable$Type;
import o.isUseOnHide;

public final class access$1700 implements SolverVariable$Type<Uri, File> {
    private final Context setMax;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return getMin((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri = (Uri) obj;
        return new SolverVariable$Type.setMax(new layoutChild(uri), new setMin(this.setMax, uri));
    }

    public access$1700(Context context) {
        this.setMax = context;
    }

    private static boolean getMin(@NonNull Uri uri) {
        return setTransitionState.getMin(uri);
    }

    static class setMin implements isUseOnHide<File> {
        private static final String[] getMax = {"_data"};
        private final Uri length;
        private final Context setMax;

        public final void getMax() {
        }

        public final void getMin() {
        }

        setMin(Context context, Uri uri) {
            this.setMax = context;
            this.length = uri;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super File> getmin) {
            Cursor query = this.setMax.getContentResolver().query(this.length, getMax, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder("Failed to find file path for: ");
                sb.append(this.length);
                getmin.setMax(new FileNotFoundException(sb.toString()));
                return;
            }
            getmin.getMax(new File(str));
        }

        @NonNull
        public final Class<File> setMax() {
            return File.class;
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }
    }

    public static final class length implements access$1900<Uri, File> {
        private final Context setMin;

        public length(Context context) {
            this.setMin = context;
        }

        @NonNull
        public final SolverVariable$Type<Uri, File> getMax(setSaturation setsaturation) {
            return new access$1700(this.setMin);
        }
    }
}
