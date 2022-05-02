package com.alipay.imobile.network.sslpinning.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import o.setHeaderTitle;
import o.setSplitBackground;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f10722a;
    private final setHeaderTitle b;

    public b(RoomDatabase roomDatabase) {
        this.f10722a = roomDatabase;
        this.b = new setHeaderTitle<c>(roomDatabase) {
            /* renamed from: a */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, c cVar) {
                if (cVar.f9401a == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, cVar.f9401a);
                }
                byte[] a2 = d.a(cVar.b);
                if (a2 == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindBlob(2, a2);
                }
            }

            public String createQuery() {
                return "INSERT OR REPLACE INTO `certificate`(`certificateUrl`,`certificateData`) VALUES (?,?)";
            }
        };
    }

    public List<c> a() {
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM certificate", 0);
        Cursor query = this.f10722a.query(max);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("certificateUrl");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("certificateData");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new c(query.getString(columnIndexOrThrow), d.a(query.getBlob(columnIndexOrThrow2))));
            }
            return arrayList;
        } finally {
            query.close();
            max.getMin();
        }
    }

    public void a(List<c> list) {
        this.f10722a.beginTransaction();
        try {
            this.b.insert(list);
            this.f10722a.setTransactionSuccessful();
        } finally {
            this.f10722a.endTransaction();
        }
    }
}
