package com.alipay.imobile.network.sslpinning.db;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface a {
    @NonNull
    @Query("SELECT * FROM certificate")
    List<c> a();

    @Insert(onConflict = 1)
    void a(List<c> list);
}
