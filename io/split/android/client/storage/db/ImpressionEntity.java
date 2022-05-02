package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import io.split.android.client.dtos.Identifiable;

@Entity(tableName = "impressions")
public class ImpressionEntity implements Identifiable {
    @NonNull
    private String body;
    @ColumnInfo(name = "created_at")
    private long createdAt;
    @PrimaryKey(autoGenerate = true)

    /* renamed from: id  reason: collision with root package name */
    private long f9905id;
    private int status;
    @ColumnInfo(name = "test_name")
    @NonNull
    private String testName;

    public long getId() {
        return this.f9905id;
    }

    public void setId(long j) {
        this.f9905id = j;
    }

    @NonNull
    public String getTestName() {
        return this.testName;
    }

    public void setTestName(@NonNull String str) {
        this.testName = str;
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
        this.status = i;
    }
}
