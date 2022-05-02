package o;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

public abstract class onLayout {
    public final int length;
    public final int setMax;

    public abstract void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);

    public onLayout(int i, int i2) {
        this.setMax = i;
        this.length = i2;
    }
}
