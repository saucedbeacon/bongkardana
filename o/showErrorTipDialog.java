package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVOpenAuthHelper;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0012\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0003\u001a\u0012\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0003\u001a\u0012\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0003\u001a\u0012\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0003\u001a*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r*\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000f"}, d2 = {"getContactListFromCursor", "", "Lid/dana/data/social/model/SocialContactEntity;", "Landroid/database/Cursor;", "parseContactDisplayId", "", "kotlin.jvm.PlatformType", "parseContactId", "", "parseContactRawId", "parseLastUpdatedTime", "parsePhoneNumber", "toPhoneNumberAndContactNameMap", "", "mapResult", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class showErrorTipDialog {
    public static final int parseContactId(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "$this$parseContactId");
        return cursor.getInt(cursor.getColumnIndex("contact_id"));
    }

    public static final String parseContactDisplayId(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "$this$parseContactDisplayId");
        return cursor.getString(cursor.getColumnIndex("display_name"));
    }

    public static final String parsePhoneNumber(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "$this$parsePhoneNumber");
        return cursor.getString(cursor.getColumnIndex("data1"));
    }

    public static final String parseContactRawId(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "$this$parseContactRawId");
        return cursor.getString(cursor.getColumnIndex("raw_contact_id"));
    }

    public static final String parseLastUpdatedTime(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "$this$parseLastUpdatedTime");
        return cursor.getString(cursor.getColumnIndex("contact_last_updated_timestamp"));
    }

    @NotNull
    public static final Map<String, String> toPhoneNumberAndContactNameMap(@NotNull Cursor cursor, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(cursor, "$this$toPhoneNumberAndContactNameMap");
        Intrinsics.checkNotNullParameter(map, "mapResult");
        while (cursor.moveToNext()) {
            String parsePhoneNumber = parsePhoneNumber(cursor);
            Intrinsics.checkNotNullExpressionValue(parsePhoneNumber, "parsePhoneNumber()");
            String parseContactDisplayId = parseContactDisplayId(cursor);
            Intrinsics.checkNotNullExpressionValue(parseContactDisplayId, "parseContactDisplayId()");
            map.put(parsePhoneNumber, parseContactDisplayId);
        }
        return map;
    }

    @NotNull
    public static final List<RVOpenAuthHelper.AnonymousClass1> getContactListFromCursor(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "$this$getContactListFromCursor");
        List<RVOpenAuthHelper.AnonymousClass1> arrayList = new ArrayList<>();
        while (cursor.moveToNext()) {
            arrayList.add(RVOpenAuthHelper.AnonymousClass1.Companion.fromCursorWithoutPhoto(cursor));
        }
        return arrayList;
    }
}
