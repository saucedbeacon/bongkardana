package o;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class setOverrideVisibleItems {
    public final boolean FastBitmap$CoordinateSystem;
    @NonNull
    public final Executor IsOverlapping;
    private final Set<Integer> Mean$Arithmetic;
    @NonNull
    public final List<Object> equals;
    @NonNull
    public final RoomDatabase.setMin getMax;
    @NonNull
    public final Context getMin;
    @Nullable
    public final String hashCode;
    @Nullable
    public final File invokeSuspend;
    @Nullable
    public final RoomDatabase.getMax isInside;
    @Nullable
    public final String length;
    @Nullable
    public final List<RoomDatabase.length> setMax;
    @NonNull
    public final SupportSQLiteOpenHelper.length setMin;
    public final boolean toDoubleRange;
    public final RoomDatabase.JournalMode toFloatRange;
    public final boolean toIntRange;
    public final boolean toString;
    @Nullable
    public final Callable<InputStream> valueOf;
    @NonNull
    public final Executor values;

    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public setOverrideVisibleItems(@NonNull Context context, @Nullable String str, @NonNull SupportSQLiteOpenHelper.length length2, @NonNull RoomDatabase.setMin setmin, @Nullable List<RoomDatabase.length> list, boolean z, @NonNull RoomDatabase.JournalMode journalMode, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3, boolean z4, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.getMax getmax, @Nullable List<Object> list2) {
        this.setMin = length2;
        this.getMin = context;
        this.length = str;
        this.getMax = setmin;
        this.setMax = list;
        this.toIntRange = z;
        this.toFloatRange = journalMode;
        this.IsOverlapping = executor;
        this.values = executor2;
        this.toDoubleRange = z2;
        this.FastBitmap$CoordinateSystem = z3;
        this.toString = z4;
        this.Mean$Arithmetic = set;
        this.hashCode = str2;
        this.invokeSuspend = file;
        this.valueOf = callable;
        this.isInside = getmax;
        this.equals = list2 == null ? Collections.emptyList() : list2;
    }

    public final boolean getMax(int i, int i2) {
        Set<Integer> set;
        return (!(i > i2) || !this.toString) && this.FastBitmap$CoordinateSystem && ((set = this.Mean$Arithmetic) == null || !set.contains(Integer.valueOf(i)));
    }
}
