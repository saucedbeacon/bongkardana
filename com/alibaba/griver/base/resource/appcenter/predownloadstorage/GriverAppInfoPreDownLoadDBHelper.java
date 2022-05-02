package com.alibaba.griver.base.resource.appcenter.predownloadstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.resource.appcenter.storage.GriverAbstractDBHelper;

public class GriverAppInfoPreDownLoadDBHelper extends GriverAbstractDBHelper {

    /* renamed from: a  reason: collision with root package name */
    private String f9166a = "tb_app_pre_down_info";

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public GriverAppInfoPreDownLoadDBHelper(@Nullable Context context) {
        super(context, "griver_pre_app_info", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_app_pre_down_info(id INTEGER PRIMARY KEY autoincrement, appId TEXT , appInfo TEXT, lastRefreshTimestamp INTEGER, version TEXT)");
    }

    public String getTableName() {
        return this.f9166a;
    }
}
