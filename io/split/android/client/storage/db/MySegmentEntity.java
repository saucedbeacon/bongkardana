package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "my_segments")
public class MySegmentEntity {
    @ColumnInfo(name = "segment_list")
    @NonNull
    private String segmentList;
    @ColumnInfo(name = "updated_at")
    private long updatedAt;
    @ColumnInfo(name = "user_key")
    @NonNull
    @PrimaryKey
    private String userKey;

    @NonNull
    public String getUserKey() {
        return this.userKey;
    }

    public void setUserKey(String str) {
        this.userKey = str;
    }

    @NonNull
    public String getSegmentList() {
        return this.segmentList;
    }

    public void setSegmentList(@NonNull String str) {
        this.segmentList = str;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }
}
