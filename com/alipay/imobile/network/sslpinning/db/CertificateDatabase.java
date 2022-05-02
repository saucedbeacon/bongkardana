package com.alipay.imobile.network.sslpinning.db;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {c.class}, exportSchema = false, version = 1)
@TypeConverters({d.class})
public abstract class CertificateDatabase extends RoomDatabase {
    @NonNull
    public abstract a a();
}
