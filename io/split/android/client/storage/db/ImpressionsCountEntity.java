package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import io.split.android.client.dtos.Identifiable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Entity(tableName = "impressions_count")
public class ImpressionsCountEntity implements Identifiable {
    @NonNull
    private String body;
    @ColumnInfo(name = "created_at")
    private long createdAt;
    @PrimaryKey(autoGenerate = true)

    /* renamed from: id  reason: collision with root package name */
    private long f9906id;
    private int status;

    public long getId() {
        return this.f9906id;
    }

    public void setId(long j) {
        this.f9906id = j;
    }

    @NonNull
    public String getBody() {
        return this.body;
    }

    public void setBody(@NonNull String str) {
        this.body = str;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1834681544, oncanceled);
            onCancelLoad.getMin(1834681544, oncanceled);
        }
        this.status = i;
    }
}
