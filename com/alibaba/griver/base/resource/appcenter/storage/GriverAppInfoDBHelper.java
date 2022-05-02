package com.alibaba.griver.base.resource.appcenter.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

public class GriverAppInfoDBHelper extends GriverAbstractDBHelper {

    /* renamed from: a  reason: collision with root package name */
    private String f9168a = "tb_app_info";

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public GriverAppInfoDBHelper(@Nullable Context context) {
        super(context, "griver_app_info", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_app_info(id INTEGER PRIMARY KEY autoincrement, appId TEXT , appInfo TEXT, lastRefreshTimestamp INTEGER, version TEXT)");
    }

    public String getTableName() {
        return this.f9168a;
    }
}
