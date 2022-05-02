package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o.SolverVariable$Type;
import o.isUseOnHide;

@RequiresApi(29)
public final class getCrossfade<DataT> implements SolverVariable$Type<Uri, DataT> {
    private final Class<DataT> getMax;
    private final Context getMin;
    private final SolverVariable$Type<Uri, DataT> length;
    private final SolverVariable$Type<File, DataT> setMax;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return getMin((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri = (Uri) obj;
        return new SolverVariable$Type.setMax(new layoutChild(uri), new setMin(this.getMin, this.setMax, this.length, uri, i, i2, motionHelper, this.getMax));
    }

    getCrossfade(Context context, SolverVariable$Type<File, DataT> solverVariable$Type, SolverVariable$Type<Uri, DataT> solverVariable$Type2, Class<DataT> cls) {
        this.getMin = context.getApplicationContext();
        this.setMax = solverVariable$Type;
        this.length = solverVariable$Type2;
        this.getMax = cls;
    }

    private static boolean getMin(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && setTransitionState.getMin(uri);
    }

    static final class setMin<DataT> implements isUseOnHide<DataT> {
        private static final String[] getMax = {"_data"};
        private final Class<DataT> IsOverlapping;
        private final MotionHelper equals;
        private final Uri getMin;
        private final int isInside;
        private final SolverVariable$Type<File, DataT> length;
        private final Context setMax;
        private final SolverVariable$Type<Uri, DataT> setMin;
        @Nullable
        private volatile isUseOnHide<DataT> toDoubleRange;
        private volatile boolean toFloatRange;
        private final int toIntRange;

        setMin(Context context, SolverVariable$Type<File, DataT> solverVariable$Type, SolverVariable$Type<Uri, DataT> solverVariable$Type2, Uri uri, int i, int i2, MotionHelper motionHelper, Class<DataT> cls) {
            this.setMax = context.getApplicationContext();
            this.length = solverVariable$Type;
            this.setMin = solverVariable$Type2;
            this.getMin = uri;
            this.isInside = i;
            this.toIntRange = i2;
            this.equals = motionHelper;
            this.IsOverlapping = cls;
        }

        public final void getMin() {
            isUseOnHide<DataT> isuseonhide = this.toDoubleRange;
            if (isuseonhide != null) {
                isuseonhide.getMin();
            }
        }

        public final void getMax() {
            this.toFloatRange = true;
            isUseOnHide<DataT> isuseonhide = this.toDoubleRange;
            if (isuseonhide != null) {
                isuseonhide.getMax();
            }
        }

        @NonNull
        public final Class<DataT> setMax() {
            return this.IsOverlapping;
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }

        @NonNull
        private File setMax(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.setMax.getContentResolver().query(uri, getMax, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: ".concat(String.valueOf(uri)));
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
                throw new FileNotFoundException("File path was empty in media store for: ".concat(String.valueOf(uri)));
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        private boolean setMin() {
            return this.setMax.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super DataT> getmin) {
            SolverVariable$Type.setMax<DataT> setmax;
            isUseOnHide<Data> isuseonhide;
            try {
                if (Environment.isExternalStorageLegacy()) {
                    setmax = this.length.setMin(setMax(this.getMin), this.isInside, this.toIntRange, this.equals);
                } else {
                    setmax = this.setMin.setMin(setMin() ? MediaStore.setRequireOriginal(this.getMin) : this.getMin, this.isInside, this.toIntRange, this.equals);
                }
                if (setmax != null) {
                    isuseonhide = setmax.getMax;
                } else {
                    isuseonhide = null;
                }
                if (isuseonhide == null) {
                    StringBuilder sb = new StringBuilder("Failed to build fetcher for: ");
                    sb.append(this.getMin);
                    getmin.setMax(new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.toDoubleRange = isuseonhide;
                if (this.toFloatRange) {
                    getMax();
                } else {
                    isuseonhide.getMin(priority, getmin);
                }
            } catch (FileNotFoundException e) {
                getmin.setMax(e);
            }
        }
    }

    @RequiresApi(29)
    public static final class getMin extends length<InputStream> {
        public getMin(Context context) {
            super(context, InputStream.class);
        }
    }

    @RequiresApi(29)
    public static final class getMax extends length<ParcelFileDescriptor> {
        public getMax(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    static abstract class length<DataT> implements access$1900<Uri, DataT> {
        private final Class<DataT> length;
        private final Context setMin;

        length(Context context, Class<DataT> cls) {
            this.setMin = context;
            this.length = cls;
        }

        @NonNull
        public final SolverVariable$Type<Uri, DataT> getMax(@NonNull setSaturation setsaturation) {
            return new getCrossfade(this.setMin, setsaturation.length(File.class, this.length), setsaturation.length(Uri.class, this.length), this.length);
        }
    }
}
