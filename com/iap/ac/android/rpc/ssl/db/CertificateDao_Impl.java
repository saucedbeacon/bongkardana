package com.iap.ac.android.rpc.ssl.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import o.setHeaderTitle;
import o.setSplitBackground;

public class CertificateDao_Impl implements CertificateDao {
    private final RoomDatabase __db;
    private final setHeaderTitle __insertionAdapterOfCertificateEntity;

    public CertificateDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCertificateEntity = new setHeaderTitle<CertificateEntity>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `certificate`(`certificateData`,`certificateUrl`) VALUES (?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, CertificateEntity certificateEntity) {
                byte[] certificateToByteArray = Converters.certificateToByteArray(certificateEntity.certificateData);
                if (certificateToByteArray == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindBlob(1, certificateToByteArray);
                }
                if (certificateEntity.certificateUrl == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, certificateEntity.certificateUrl);
                }
            }
        };
    }

    public void insertCertificates(List<CertificateEntity> list) {
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCertificateEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<CertificateEntity> loadAllCertificates() {
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM certificate", 0);
        Cursor query = this.__db.query(max);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("certificateData");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("certificateUrl");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new CertificateEntity(query.getString(columnIndexOrThrow2), Converters.fromByteArray(query.getBlob(columnIndexOrThrow))));
            }
            return arrayList;
        } finally {
            query.close();
            max.getMin();
        }
    }
}
