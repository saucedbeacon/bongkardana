package com.j256.ormlite.android.compat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import com.j256.ormlite.android.compat.ApiCompatibility;

public class JellyBeanApiCompatibility extends BasicApiCompatibility {
    public Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, ApiCompatibility.CancellationHook cancellationHook) {
        if (cancellationHook == null) {
            return sQLiteDatabase.rawQuery(str, strArr);
        }
        return sQLiteDatabase.rawQuery(str, strArr, ((JellyBeanCancellationHook) cancellationHook).cancellationSignal);
    }

    public ApiCompatibility.CancellationHook createCancellationHook() {
        return new JellyBeanCancellationHook();
    }

    protected static class JellyBeanCancellationHook implements ApiCompatibility.CancellationHook {
        /* access modifiers changed from: private */
        public final CancellationSignal cancellationSignal = new CancellationSignal();

        public void cancel() {
            this.cancellationSignal.cancel();
        }
    }
}
