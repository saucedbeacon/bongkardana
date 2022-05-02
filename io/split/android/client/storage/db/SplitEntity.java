package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Entity(tableName = "splits")
public class SplitEntity {
    @NonNull
    private String body;
    @NonNull
    @PrimaryKey
    private String name;
    @Ignore
    private long rowId;
    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    public long getRowId() {
        return this.rowId;
    }

    public void setRowId(long j) {
        this.rowId = j;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public void setName(@NonNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1316294537, oncanceled);
            onCancelLoad.getMin(1316294537, oncanceled);
        }
        this.name = str;
    }

    @NonNull
    public String getBody() {
        return this.body;
    }

    public void setBody(@NonNull String str) {
        this.body = str;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }
}
