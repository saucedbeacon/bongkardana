package id.dana.sendmoney.contact.provider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.dispatchOnCancelled;
import o.isOriginHasAppInfo;
import o.onCancelLoad;
import o.onCanceled;

public final class ContactProvider {
    public static final String[] getMax = {"contact_id", "data1", "mimetype", "raw_contact_id"};
    private static final String[] getMin = {"contact_id", "display_name", Column.DISPLAY_PHOTO, "data1", "mimetype"};
    @RequiresApi(18)
    public static final String[] setMax = {"contact_id", "data1", "mimetype", "raw_contact_id", "contact_last_updated_timestamp"};
    public ContentResolver length;
    @VisibleForTesting
    String setMin;

    @Retention(RetentionPolicy.SOURCE)
    @interface Column {
        public static final String CONTACT_ID = "contact_id";
        public static final String CONTACT_RAW_ID = "raw_contact_id";
        public static final String DISPLAY_NAME = "display_name";
        public static final String DISPLAY_PHOTO = "photo_uri";
        public static final String MIMETYPE = "mimetype";
        public static final String MIMETYPE_PHONENUMBER = "vnd.android.cursor.item/phone_v2";
        public static final String PHONENUMBER = "data1";
    }

    @RequiresApi(18)
    @Retention(RetentionPolicy.SOURCE)
    @interface ColumnSpecial {
        public static final String LAST_UPDATED_TIME = "contact_last_updated_timestamp";
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface Selection {
        public static final String FILTER_CONTACT_RAW_ID = "mimetype = ? AND raw_contact_id > ?";
        public static final String FILTER_DISPLAY_NAME = "mimetype = ? AND LOWER(display_name) LIKE ?";
        public static final String FILTER_PHONENUMBER = "mimetype = ? AND data1 LIKE ?";
        public static final String SELECT_ALL = "mimetype = ?";
    }

    @RequiresApi(api = 18)
    @Retention(RetentionPolicy.SOURCE)
    @interface SelectionSpecial {
        public static final String FILTER_LAST_UPDATED_TIME = "mimetype = ? AND contact_last_updated_timestamp > ?";
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface SortOrder {
        public static final String SORT_ORDER_ASCENDING = "%s COLLATE NOCASE ASC";
        public static final String SORT_ORDER_ASCENDING_WITH_LIMIT = "%s COLLATE NOCASE ASC LIMIT %s OFFSET %s";
    }

    @Inject
    public ContactProvider(ContentResolver contentResolver) {
        this(contentResolver, "");
    }

    public ContactProvider(ContentResolver contentResolver, @Nullable String str) {
        this.length = contentResolver;
        if (str != null) {
            this.setMin = str.toLowerCase();
        }
    }

    public final List<ContactModel> setMax(int i, String str) {
        Cursor cursor;
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(415417742, oncanceled);
            onCancelLoad.getMin(415417742, oncanceled);
        }
        if (CornerMarkingDataProvider.setMin()) {
            cursor = length(i, str);
        } else {
            cursor = getMin(i, str);
        }
        return getMin(cursor);
    }

    public static List<ContactModel> getMax(Cursor cursor) {
        if (cursor == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("contact_id");
            int columnIndex2 = cursor.getColumnIndex("display_name");
            int columnIndex3 = cursor.getColumnIndex(Column.DISPLAY_PHOTO);
            int columnIndex4 = cursor.getColumnIndex("data1");
            int columnIndex5 = cursor.getColumnIndex("mimetype");
            while (cursor.moveToNext()) {
                int i = cursor.getInt(columnIndex);
                String string = cursor.getString(columnIndex2);
                String string2 = cursor.getString(columnIndex3);
                String string3 = cursor.getString(columnIndex4);
                if (cursor.getString(columnIndex5).equals("vnd.android.cursor.item/phone_v2")) {
                    ContactModel contactModel = new ContactModel(i, string, string2, isOriginHasAppInfo.getCleanSpaceAndDash(string3), (byte) 0);
                    if (!arrayList.contains(contactModel)) {
                        arrayList.add(contactModel);
                    }
                }
            }
            return arrayList;
        } finally {
            cursor.close();
        }
    }

    public static List<ContactModel> getMin(Cursor cursor) {
        if (cursor == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("contact_id");
            int columnIndex2 = cursor.getColumnIndex("data1");
            int columnIndex3 = cursor.getColumnIndex("mimetype");
            int columnIndex4 = cursor.getColumnIndex("raw_contact_id");
            int i = 0;
            if (CornerMarkingDataProvider.setMin()) {
                i = cursor.getColumnIndex("contact_last_updated_timestamp");
            }
            while (cursor.moveToNext()) {
                int i2 = cursor.getInt(columnIndex);
                String string = cursor.getString(columnIndex2);
                String string2 = cursor.getString(columnIndex3);
                String string3 = cursor.getString(columnIndex4);
                String string4 = i != 0 ? cursor.getString(i) : "";
                if (string2.equals("vnd.android.cursor.item/phone_v2")) {
                    arrayList.add(new ContactModel(i2, isOriginHasAppInfo.getCleanSpaceAndDash(string), string3, string4));
                }
            }
            return arrayList;
        } finally {
            cursor.close();
        }
    }

    private Cursor getMin(int i, String str) {
        String[] strArr = getMax;
        String[] strArr2 = {"vnd.android.cursor.item/phone_v2", str};
        String[] strArr3 = new String[2];
        System.arraycopy(strArr2, 0, strArr3, 0, 2);
        return this.length.query(ContactsContract.Data.CONTENT_URI, strArr, Selection.FILTER_CONTACT_RAW_ID, strArr3, String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", new Object[]{"raw_contact_id", Integer.valueOf(i), 0}));
    }

    @RequiresApi(api = 18)
    private Cursor length(int i, String str) {
        String[] strArr = setMax;
        String[] strArr2 = {"vnd.android.cursor.item/phone_v2", str};
        String[] strArr3 = new String[2];
        System.arraycopy(strArr2, 0, strArr3, 0, 2);
        return this.length.query(ContactsContract.Data.CONTENT_URI, strArr, SelectionSpecial.FILTER_LAST_UPDATED_TIME, strArr3, String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", new Object[]{"contact_last_updated_timestamp", Integer.valueOf(i), 0}));
    }

    public final Cursor getMax(int i, int i2) {
        if (TextUtils.isEmpty(this.setMin)) {
            String[] strArr = getMin;
            String[] strArr2 = new String[1];
            System.arraycopy(new String[]{"vnd.android.cursor.item/phone_v2"}, 0, strArr2, 0, 1);
            return this.length.query(ContactsContract.Data.CONTENT_URI, strArr, "mimetype = ?", strArr2, String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", new Object[]{"display_name", Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (isOriginHasAppInfo.isPhoneNumberPrefix(this.setMin)) {
            String[] strArr3 = getMin;
            StringBuilder sb = new StringBuilder("%");
            sb.append(this.setMin);
            sb.append("%");
            String[] strArr4 = new String[2];
            System.arraycopy(new String[]{"vnd.android.cursor.item/phone_v2", sb.toString()}, 0, strArr4, 0, 2);
            return this.length.query(ContactsContract.Data.CONTENT_URI, strArr3, "mimetype = ? AND data1 LIKE ?", strArr4, String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", new Object[]{"display_name", Integer.valueOf(i), Integer.valueOf(i2)}));
        } else {
            String[] strArr5 = getMin;
            StringBuilder sb2 = new StringBuilder("%");
            sb2.append(this.setMin);
            sb2.append("%");
            String[] strArr6 = new String[2];
            System.arraycopy(new String[]{"vnd.android.cursor.item/phone_v2", sb2.toString()}, 0, strArr6, 0, 2);
            return this.length.query(ContactsContract.Data.CONTENT_URI, strArr5, "mimetype = ? AND LOWER(display_name) LIKE ?", strArr6, String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", new Object[]{"display_name", Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    public static String getMin(String str, int i) {
        return String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", new Object[]{str, Integer.valueOf(i), 0});
    }

    public static String[] length(String... strArr) {
        String[] strArr2 = new String[1];
        System.arraycopy(strArr, 0, strArr2, 0, 1);
        return strArr2;
    }

    public final boolean setMax() {
        return getMax(getMax(1, 0)).isEmpty();
    }

    public static /* synthetic */ Integer setMin(ContactProvider contactProvider) {
        String[] strArr = getMin;
        String[] strArr2 = new String[1];
        System.arraycopy(new String[]{"vnd.android.cursor.item/phone_v2"}, 0, strArr2, 0, 1);
        Cursor query = contactProvider.length.query(ContactsContract.Data.CONTENT_URI, strArr, "mimetype = ?", strArr2, (String) null);
        query.moveToFirst();
        return Integer.valueOf(query.getCount());
    }
}
