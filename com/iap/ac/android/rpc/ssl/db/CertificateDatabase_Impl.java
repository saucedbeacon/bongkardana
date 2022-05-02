package com.iap.ac.android.rpc.ssl.db;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.HashMap;
import java.util.HashSet;
import o.generateDefaultLayoutParams;
import o.getAnimatedVisibility;
import o.jumpDrawablesToCurrentState;
import o.setOverrideVisibleItems;

public class CertificateDatabase_Impl extends CertificateDatabase {
    private volatile CertificateDao _certificateDao;

    public SupportSQLiteOpenHelper createOpenHelper(setOverrideVisibleItems setoverridevisibleitems) {
        jumpDrawablesToCurrentState jumpdrawablestocurrentstate = new jumpDrawablesToCurrentState(setoverridevisibleitems, new jumpDrawablesToCurrentState.getMin(1) {
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `certificate` (`certificateData` BLOB, `certificateUrl` TEXT NOT NULL, PRIMARY KEY(`certificateUrl`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"67d1572c5ffabc669d4b58d68e13a0c6\")");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `certificate`");
            }

            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (CertificateDatabase_Impl.this.mCallbacks != null) {
                    int size = CertificateDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        CertificateDatabase_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = CertificateDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                CertificateDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (CertificateDatabase_Impl.this.mCallbacks != null) {
                    int size = CertificateDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.length) CertificateDatabase_Impl.this.mCallbacks.get(i)).length(supportSQLiteDatabase);
                    }
                }
            }

            public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("certificateData", new generateDefaultLayoutParams.getMax("certificateData", "BLOB", false, 0));
                hashMap.put("certificateUrl", new generateDefaultLayoutParams.getMax("certificateUrl", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams = new generateDefaultLayoutParams("certificate", hashMap, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams2 = new generateDefaultLayoutParams("certificate", generateDefaultLayoutParams.length(supportSQLiteDatabase, "certificate"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase, "certificate"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase, "certificate"));
                if (!generatedefaultlayoutparams.equals(generatedefaultlayoutparams2)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle certificate(com.iap.ac.android.rpc.ssl.db.CertificateEntity).\n Expected:\n");
                    sb.append(generatedefaultlayoutparams);
                    sb.append("\n Found:\n");
                    sb.append(generatedefaultlayoutparams2);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "67d1572c5ffabc669d4b58d68e13a0c6", "028bbde6114c5ccfde3033904115bc7e");
        SupportSQLiteOpenHelper.Configuration.getMax min = SupportSQLiteOpenHelper.Configuration.setMin(setoverridevisibleitems.getMin);
        min.length = setoverridevisibleitems.length;
        min.getMax = jumpdrawablestocurrentstate;
        return setoverridevisibleitems.setMin.create(min.setMax());
    }

    public getAnimatedVisibility createInvalidationTracker() {
        return new getAnimatedVisibility(this, "certificate");
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `certificate`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public CertificateDao certificateDao() {
        CertificateDao certificateDao;
        if (this._certificateDao != null) {
            return this._certificateDao;
        }
        synchronized (this) {
            if (this._certificateDao == null) {
                this._certificateDao = new CertificateDao_Impl(this);
            }
            certificateDao = this._certificateDao;
        }
        return certificateDao;
    }
}
