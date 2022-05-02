package com.iap.ac.android.rpc.ssl.db;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {CertificateEntity.class}, exportSchema = false, version = 1)
@TypeConverters({Converters.class})
public abstract class CertificateDatabase extends RoomDatabase {
    @NonNull
    public abstract CertificateDao certificateDao();
}
