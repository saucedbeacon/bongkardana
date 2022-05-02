package o;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class generateDefaultLayoutParams {
    public final String getMax;
    public final Set<getMin> getMin;
    public final Map<String, getMax> length;
    @Nullable
    public final Set<setMin> setMax;

    public generateDefaultLayoutParams(String str, Map<String, getMax> map, Set<getMin> set, Set<setMin> set2) {
        Set<setMin> set3;
        this.getMax = str;
        this.length = Collections.unmodifiableMap(map);
        this.getMin = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.setMax = set3;
    }

    public final boolean equals(Object obj) {
        Set<setMin> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof generateDefaultLayoutParams)) {
            return false;
        }
        generateDefaultLayoutParams generatedefaultlayoutparams = (generateDefaultLayoutParams) obj;
        String str = this.getMax;
        if (str == null ? generatedefaultlayoutparams.getMax != null : !str.equals(generatedefaultlayoutparams.getMax)) {
            return false;
        }
        Map<String, getMax> map = this.length;
        if (map == null ? generatedefaultlayoutparams.length != null : !map.equals(generatedefaultlayoutparams.length)) {
            return false;
        }
        Set<getMin> set2 = this.getMin;
        if (set2 == null ? generatedefaultlayoutparams.getMin != null : !set2.equals(generatedefaultlayoutparams.getMin)) {
            return false;
        }
        Set<setMin> set3 = this.setMax;
        if (set3 == null || (set = generatedefaultlayoutparams.setMax) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, getMax> map = this.length;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<getMin> set = this.getMin;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.getMax);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.length);
        sb.append(", foreignKeys=");
        sb.append(this.getMin);
        sb.append(", indices=");
        sb.append(this.setMax);
        sb.append('}');
        return sb.toString();
    }

    public static Set<getMin> setMax(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor query = supportSQLiteDatabase.query(sb.toString());
        try {
            int columnIndex = query.getColumnIndex("id");
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<setMax> min = getMin(query);
            int count = query.getCount();
            for (int i = 0; i < count; i++) {
                query.moveToPosition(i);
                if (query.getInt(columnIndex2) == 0) {
                    int i2 = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (setMax next : min) {
                        if (next.setMax == i2) {
                            arrayList.add(next.length);
                            arrayList2.add(next.getMax);
                        }
                    }
                    hashSet.add(new getMin(query.getString(columnIndex3), query.getString(columnIndex4), query.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            query.close();
        }
    }

    private static List<setMax> getMin(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new setMax(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Map<String, getMax> length(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor query = supportSQLiteDatabase.query(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (query.getColumnCount() > 0) {
                int columnIndex = query.getColumnIndex("name");
                int columnIndex2 = query.getColumnIndex("type");
                int columnIndex3 = query.getColumnIndex("notnull");
                int columnIndex4 = query.getColumnIndex("pk");
                int columnIndex5 = query.getColumnIndex("dflt_value");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    hashMap.put(string, new getMax(string, query.getString(columnIndex2), query.getInt(columnIndex3) != 0, query.getInt(columnIndex4), query.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    @Nullable
    public static Set<setMin> getMax(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor query = supportSQLiteDatabase.query(sb.toString());
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("origin");
            int columnIndex3 = query.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (query.moveToNext()) {
                        if ("c".equals(query.getString(columnIndex2))) {
                            String string = query.getString(columnIndex);
                            boolean z = true;
                            if (query.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            setMin max = setMax(supportSQLiteDatabase, string, z);
                            if (max == null) {
                                query.close();
                                return null;
                            }
                            hashSet.add(max);
                        }
                    }
                    query.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX INFO: finally extract failed */
    @Nullable
    private static setMin setMax(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor query = supportSQLiteDatabase.query(sb.toString());
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (query.moveToNext()) {
                        if (query.getInt(columnIndex2) >= 0) {
                            int i = query.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), query.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    setMin setmin = new setMin(str, z, arrayList);
                    query.close();
                    return setmin;
                }
            }
            query.close();
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public static final class getMax {
        private final int IsOverlapping;
        public final boolean getMax;
        public final int getMin;
        public final String length;
        public final String setMax;
        @ColumnInfo.SQLiteTypeAffinity
        public final int setMin;
        public final String toFloatRange;

        @Deprecated
        public getMax(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, (String) null, 0);
        }

        public getMax(String str, String str2, boolean z, int i, String str3, int i2) {
            this.setMax = str;
            this.length = str2;
            this.getMax = z;
            this.getMin = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(SecurityConstants.KEY_DISPLAY_TYPE_TEXT)) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.setMin = i3;
            this.toFloatRange = str3;
            this.IsOverlapping = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0069, code lost:
            r1 = r5.toFloatRange;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r6 instanceof o.generateDefaultLayoutParams.getMax
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                o.generateDefaultLayoutParams$getMax r6 = (o.generateDefaultLayoutParams.getMax) r6
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 20
                if (r1 < r3) goto L_0x0019
                int r1 = r5.getMin
                int r3 = r6.getMin
                if (r1 == r3) goto L_0x0024
                return r2
            L_0x0019:
                boolean r1 = r5.getMax()
                boolean r3 = r6.getMax()
                if (r1 == r3) goto L_0x0024
                return r2
            L_0x0024:
                java.lang.String r1 = r5.setMax
                java.lang.String r3 = r6.setMax
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x002f
                return r2
            L_0x002f:
                boolean r1 = r5.getMax
                boolean r3 = r6.getMax
                if (r1 == r3) goto L_0x0036
                return r2
            L_0x0036:
                int r1 = r5.IsOverlapping
                r3 = 2
                if (r1 != r0) goto L_0x004c
                int r1 = r6.IsOverlapping
                if (r1 != r3) goto L_0x004c
                java.lang.String r1 = r5.toFloatRange
                if (r1 == 0) goto L_0x004c
                java.lang.String r4 = r6.toFloatRange
                boolean r1 = r1.equals(r4)
                if (r1 != 0) goto L_0x004c
                return r2
            L_0x004c:
                int r1 = r5.IsOverlapping
                if (r1 != r3) goto L_0x0061
                int r1 = r6.IsOverlapping
                if (r1 != r0) goto L_0x0061
                java.lang.String r1 = r6.toFloatRange
                if (r1 == 0) goto L_0x0061
                java.lang.String r3 = r5.toFloatRange
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x0061
                return r2
            L_0x0061:
                int r1 = r5.IsOverlapping
                if (r1 == 0) goto L_0x007b
                int r3 = r6.IsOverlapping
                if (r1 != r3) goto L_0x007b
                java.lang.String r1 = r5.toFloatRange
                if (r1 == 0) goto L_0x0076
                java.lang.String r3 = r6.toFloatRange
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x007b
                goto L_0x007a
            L_0x0076:
                java.lang.String r1 = r6.toFloatRange
                if (r1 == 0) goto L_0x007b
            L_0x007a:
                return r2
            L_0x007b:
                int r1 = r5.setMin
                int r6 = r6.setMin
                if (r1 != r6) goto L_0x0082
                return r0
            L_0x0082:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.generateDefaultLayoutParams.getMax.equals(java.lang.Object):boolean");
        }

        private boolean getMax() {
            return this.getMin > 0;
        }

        public final int hashCode() {
            return (((((this.setMax.hashCode() * 31) + this.setMin) * 31) + (this.getMax ? 1231 : 1237)) * 31) + this.getMin;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.setMax);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.length);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.setMin);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.getMax);
            sb.append(", primaryKeyPosition=");
            sb.append(this.getMin);
            sb.append(", defaultValue='");
            sb.append(this.toFloatRange);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class getMin {
        @NonNull
        public final String getMax;
        @NonNull
        public final List<String> getMin;
        @NonNull
        public final String length;
        @NonNull
        public final List<String> setMax;
        @NonNull
        public final String setMin;

        public getMin(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, @NonNull List<String> list2) {
            this.getMax = str;
            this.length = str2;
            this.setMin = str3;
            this.setMax = Collections.unmodifiableList(list);
            this.getMin = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            if (this.getMax.equals(getmin.getMax) && this.length.equals(getmin.length) && this.setMin.equals(getmin.setMin) && this.setMax.equals(getmin.setMax)) {
                return this.getMin.equals(getmin.getMin);
            }
            return false;
        }

        public final int hashCode() {
            return (((((((this.getMax.hashCode() * 31) + this.length.hashCode()) * 31) + this.setMin.hashCode()) * 31) + this.setMax.hashCode()) * 31) + this.getMin.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.getMax);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.length);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.setMin);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.setMax);
            sb.append(", referenceColumnNames=");
            sb.append(this.getMin);
            sb.append('}');
            return sb.toString();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static class setMax implements Comparable<setMax> {
        final String getMax;
        final String length;
        final int setMax;
        final int setMin;

        public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
            setMax setmax = (setMax) obj;
            int i = this.setMax - setmax.setMax;
            return i == 0 ? this.setMin - setmax.setMin : i;
        }

        setMax(int i, int i2, String str, String str2) {
            this.setMax = i;
            this.setMin = i2;
            this.length = str;
            this.getMax = str2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class setMin {
        public final List<String> length;
        public final boolean setMax;
        public final String setMin;

        public setMin(String str, boolean z, List<String> list) {
            this.setMin = str;
            this.setMax = z;
            this.length = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            if (this.setMax != setmin.setMax || !this.length.equals(setmin.length)) {
                return false;
            }
            if (this.setMin.startsWith("index_")) {
                return setmin.setMin.startsWith("index_");
            }
            return this.setMin.equals(setmin.setMin);
        }

        public final int hashCode() {
            int i;
            if (this.setMin.startsWith("index_")) {
                i = "index_".hashCode();
            } else {
                i = this.setMin.hashCode();
            }
            return (((i * 31) + (this.setMax ? 1 : 0)) * 31) + this.length.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.setMin);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.setMax);
            sb.append(", columns=");
            sb.append(this.length);
            sb.append('}');
            return sb.toString();
        }
    }
}
