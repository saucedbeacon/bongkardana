package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import o.createLoadingDialog;

public class SplitQueryDaoImpl implements SplitQueryDao {
    private final SplitRoomDatabase mDatabase;

    public SplitQueryDaoImpl(SplitRoomDatabase splitRoomDatabase) {
        this.mDatabase = splitRoomDatabase;
    }

    /* JADX INFO: finally extract failed */
    public List<SplitEntity> get(long j, int i) {
        Cursor query = this.mDatabase.query("SELECT rowid, name, body, updated_at FROM splits WHERE rowId > ? ORDER BY rowId LIMIT ?", new Object[]{Long.valueOf(j), Integer.valueOf(i)});
        try {
            int columnIndexOrThrow = getColumnIndexOrThrow(query, "rowid");
            int columnIndexOrThrow2 = getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = getColumnIndexOrThrow(query, TtmlNode.TAG_BODY);
            int columnIndexOrThrow4 = getColumnIndexOrThrow(query, "updated_at");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                SplitEntity splitEntity = new SplitEntity();
                splitEntity.setRowId(query.getLong(columnIndexOrThrow));
                splitEntity.setName(query.getString(columnIndexOrThrow2));
                splitEntity.setBody(query.getString(columnIndexOrThrow3));
                splitEntity.setUpdatedAt(query.getLong(columnIndexOrThrow4));
                arrayList.add(splitEntity);
            }
            query.close();
            return arrayList;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error executing splits query: ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
            query.close();
            return new ArrayList();
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public int getColumnIndexOrThrow(@NonNull Cursor cursor, @NonNull String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append("`");
        return cursor.getColumnIndexOrThrow(sb.toString());
    }
}
