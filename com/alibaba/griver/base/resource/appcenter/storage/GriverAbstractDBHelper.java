package com.alibaba.griver.base.resource.appcenter.storage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class GriverAbstractDBHelper extends SQLiteOpenHelper {
    public abstract String getTableName();

    public GriverAbstractDBHelper(@Nullable Context context, @Nullable String str, @Nullable SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    public GriverAbstractDBHelper(@Nullable Context context, @Nullable String str, @Nullable SQLiteDatabase.CursorFactory cursorFactory, int i, @Nullable DatabaseErrorHandler databaseErrorHandler) {
        super(context, str, cursorFactory, i, databaseErrorHandler);
    }

    public GriverAbstractDBHelper(@Nullable Context context, @Nullable String str, int i, @NonNull SQLiteDatabase.OpenParams openParams) {
        super(context, str, i, openParams);
    }
}
