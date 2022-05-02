package o;

import android.database.sqlite.SQLiteProgram;

class setHasNonEmbeddedTabs implements isTitleOptional {
    private final SQLiteProgram setMin;

    setHasNonEmbeddedTabs(SQLiteProgram sQLiteProgram) {
        this.setMin = sQLiteProgram;
    }

    public void bindNull(int i) {
        this.setMin.bindNull(i);
    }

    public void bindLong(int i, long j) {
        this.setMin.bindLong(i, j);
    }

    public void bindDouble(int i, double d) {
        this.setMin.bindDouble(i, d);
    }

    public void bindString(int i, String str) {
        this.setMin.bindString(i, str);
    }

    public void bindBlob(int i, byte[] bArr) {
        this.setMin.bindBlob(i, bArr);
    }

    public void close() {
        this.setMin.close();
    }
}
