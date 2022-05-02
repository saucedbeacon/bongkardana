package com.iap.ac.android.rpc.ssl.db;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface CertificateDao {
    @Insert(onConflict = 1)
    void insertCertificates(List<CertificateEntity> list);

    @NonNull
    @Query("SELECT * FROM certificate")
    List<CertificateEntity> loadAllCertificates();
}
