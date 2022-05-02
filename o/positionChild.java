package o;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class positionChild implements SupportSQLiteStatement {
    private final String getMax;
    private final SupportSQLiteStatement getMin;
    private final RoomDatabase.getMin length;
    private final Executor setMax;
    private final List<Object> setMin = new ArrayList();

    static /* synthetic */ void length() {
    }

    static /* synthetic */ void setMin() {
    }

    positionChild(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull RoomDatabase.getMin getmin, String str, @NonNull Executor executor) {
        this.getMin = supportSQLiteStatement;
        this.length = getmin;
        this.getMax = str;
        this.setMax = executor;
    }

    public final int executeUpdateDelete() {
        this.setMax.execute(new ActionBarContainer(this));
        return this.getMin.executeUpdateDelete();
    }

    public final long executeInsert() {
        this.setMax.execute(new access$101(this));
        return this.getMin.executeInsert();
    }

    public final void bindNull(int i) {
        getMax(i, this.setMin.toArray());
        this.getMin.bindNull(i);
    }

    public final void bindLong(int i, long j) {
        getMax(i, Long.valueOf(j));
        this.getMin.bindLong(i, j);
    }

    public final void bindDouble(int i, double d) {
        getMax(i, Double.valueOf(d));
        this.getMin.bindDouble(i, d);
    }

    public final void bindString(int i, String str) {
        getMax(i, str);
        this.getMin.bindString(i, str);
    }

    public final void bindBlob(int i, byte[] bArr) {
        getMax(i, bArr);
        this.getMin.bindBlob(i, bArr);
    }

    public final void close() throws IOException {
        this.getMin.close();
    }

    private void getMax(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.setMin.size()) {
            for (int size = this.setMin.size(); size <= i2; size++) {
                this.setMin.add((Object) null);
            }
        }
        this.setMin.set(i2, obj);
    }
}
