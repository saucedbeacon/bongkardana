package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RVOpenAuthHelper;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002J4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cJ;\u0010 \u001a\u0004\u0018\u00010\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\"2\u0006\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\"2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0002\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/data/social/sync/SocialContactProvider;", "", "context", "Landroid/content/Context;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/Context;Landroid/content/ContentResolver;)V", "addSelectionsFromArgsDynamically", "", "arguments", "", "getAllContact", "", "Lid/dana/data/social/model/SocialContactEntity;", "limit", "", "offset", "getContactCount", "getCursorFromAllContactQuery", "Landroid/database/Cursor;", "getCursorFromModifiedContactQuery", "lastUpdatedTime", "getModifiedContactSinceSpecificTime", "hasContactPermission", "", "isEmpty", "isInputInvalid", "populateContactDeviceName", "", "phoneNumbers", "", "phoneNumAndNameMap", "query", "projection", "", "selection", "selectionArgs", "sortOrder", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAuthContentResult {
    private final ContentResolver contentResolver;
    private final Context context;

    private final boolean isInputInvalid(int i) {
        return i <= 0;
    }

    @Inject
    public getAuthContentResult(@NotNull Context context2, @NotNull ContentResolver contentResolver2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(contentResolver2, "contentResolver");
        this.context = context2;
        this.contentResolver = contentResolver2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = o.showErrorTipDialog.getContactListFromCursor(r2);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o.RVOpenAuthHelper.AnonymousClass1> getAllContact(int r2, int r3) {
        /*
            r1 = this;
            boolean r0 = r1.hasContactPermission()
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1.isInputInvalid(r2)
            if (r0 == 0) goto L_0x000d
            goto L_0x001e
        L_0x000d:
            android.database.Cursor r2 = r1.getCursorFromAllContactQuery(r2, r3)
            if (r2 == 0) goto L_0x0019
            java.util.List r2 = o.showErrorTipDialog.getContactListFromCursor(r2)
            if (r2 != 0) goto L_0x001d
        L_0x0019:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001d:
            return r2
        L_0x001e:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAuthContentResult.getAllContact(int, int):java.util.List");
    }

    @NotNull
    public final List<RVOpenAuthHelper.AnonymousClass1> getModifiedContactSinceSpecificTime(int i, int i2, @NotNull String str) {
        List<RVOpenAuthHelper.AnonymousClass1> contactListFromCursor;
        Intrinsics.checkNotNullParameter(str, "lastUpdatedTime");
        if (!hasContactPermission() || isInputInvalid(i, str)) {
            return CollectionsKt.emptyList();
        }
        Cursor cursorFromModifiedContactQuery = getCursorFromModifiedContactQuery(i, i2, str);
        if (cursorFromModifiedContactQuery == null || (contactListFromCursor = showErrorTipDialog.getContactListFromCursor(cursorFromModifiedContactQuery)) == null) {
            return CollectionsKt.emptyList();
        }
        return contactListFromCursor;
    }

    public final int getContactCount() {
        Cursor query = query(new String[]{"contact_id"}, getAuthNoticeDialog.MIMETYPE_INDO_REGION_SELECTION, new String[]{"vnd.android.cursor.item/phone_v2", getAuthNoticeDialog.INDO_PREFIX, getAuthNoticeDialog.INDO_PREFIX_WITH_PLUS, getAuthNoticeDialog.INDO_PREFIX_WITH_ZERO}, "");
        if (query != null) {
            return query.getCount();
        }
        return 0;
    }

    public final boolean isEmpty() {
        return getContactCount() <= 0;
    }

    public final boolean hasContactPermission() {
        return FontRes.length(this.context, "android.permission.READ_CONTACTS") == 0;
    }

    private final boolean isInputInvalid(int i, String str) {
        if (i > 0) {
            return str.length() == 0;
        }
    }

    private final Cursor getCursorFromAllContactQuery(int i, int i2) {
        String[] projection_with_last_updated_time = getAuthNoticeDialog.getPROJECTION_WITH_LAST_UPDATED_TIME();
        String[] strArr = {"vnd.android.cursor.item/phone_v2", getAuthNoticeDialog.INDO_PREFIX, getAuthNoticeDialog.INDO_PREFIX_WITH_PLUS, getAuthNoticeDialog.INDO_PREFIX_WITH_ZERO};
        String format = String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", Arrays.copyOf(new Object[]{"raw_contact_id", Integer.valueOf(i), Integer.valueOf(i2)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        return query(projection_with_last_updated_time, getAuthNoticeDialog.MIMETYPE_INDO_REGION_SELECTION, strArr, format);
    }

    private final Cursor getCursorFromModifiedContactQuery(int i, int i2, String str) {
        String[] projection_with_last_updated_time = getAuthNoticeDialog.getPROJECTION_WITH_LAST_UPDATED_TIME();
        String[] strArr = {"vnd.android.cursor.item/phone_v2", str, getAuthNoticeDialog.INDO_PREFIX, getAuthNoticeDialog.INDO_PREFIX_WITH_PLUS, getAuthNoticeDialog.INDO_PREFIX_WITH_ZERO};
        String format = String.format("%s COLLATE NOCASE ASC LIMIT %s OFFSET %s", Arrays.copyOf(new Object[]{"contact_last_updated_timestamp", Integer.valueOf(i), Integer.valueOf(i2)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        return query(projection_with_last_updated_time, getAuthNoticeDialog.MIMETYPE_LAST_UPDATED_TIME_INDO_REGION_SELECTION, strArr, format);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0070, code lost:
        r8 = o.showErrorTipDialog.toPhoneNumberAndContactNameMap(r8, r9);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> populateContactDeviceName(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r8, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "phoneNumbers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "phoneNumAndNameMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r7.hasContactPermission()
            if (r0 != 0) goto L_0x0018
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Map r8 = (java.util.Map) r8
            return r8
        L_0x0018:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r0)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r8 = kotlin.collections.CollectionsKt.toMutableList(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            r0.addAll(r8)
            java.lang.String[] r8 = o.getAuthNoticeDialog.getPROJECTION_PHONENUMBER_CONTACTNAME()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.addSelectionsFromArgsDynamically(r0)
            r4 = 0
            r2[r4] = r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r3 = "mimetype = ? AND data1 IN (%s)"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "java.lang.String.format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r5)
            if (r0 == 0) goto L_0x0079
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "data1"
            r5[r4] = r6
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r4 = "%s COLLATE NOCASE ASC"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            android.database.Cursor r8 = r7.query(r8, r2, r0, r1)
            if (r8 == 0) goto L_0x0078
            java.util.Map r8 = o.showErrorTipDialog.toPhoneNumberAndContactNameMap(r8, r9)
            if (r8 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r9 = r8
        L_0x0078:
            return r9
        L_0x0079:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAuthContentResult.populateContactDeviceName(java.util.Set, java.util.Map):java.util.Map");
    }

    private final String addSelectionsFromArgsDynamically(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("?");
        }
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "selections.toString()");
        return obj;
    }

    private final Cursor query(String[] strArr, String str, String[] strArr2, String str2) {
        return this.contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, str, strArr2, str2);
    }
}
