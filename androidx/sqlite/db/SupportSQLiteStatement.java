package androidx.sqlite.db;

import o.isTitleOptional;

public interface SupportSQLiteStatement extends isTitleOptional {
    long executeInsert();

    int executeUpdateDelete();
}
