package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015\"\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015\"\u000e\u0010\u0019\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"CONTACT_ID", "", "CONTACT_RAW_ID", "DISPLAYNAME_SELECTION", "DISPLAY_NAME", "INDO_PHONE_REGION_SELECTION", "INDO_PREFIX", "INDO_PREFIX_WITH_PLUS", "INDO_PREFIX_WITH_ZERO", "IN_PHONENUMBER_SELECTION", "LAST_UPDATED_TIME", "MIMETYPE", "MIMETYPE_INDO_REGION_SELECTION", "MIMETYPE_LAST_UPDATED_TIME_INDO_REGION_SELECTION", "MIMETYPE_PHONENUMBER", "MIMETYPE_SELECTION", "PHONENUMBER", "PHONENUMBER_SELECTION", "PROJECTION_PHONENUMBER_CONTACTNAME", "", "getPROJECTION_PHONENUMBER_CONTACTNAME", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PROJECTION_WITH_LAST_UPDATED_TIME", "getPROJECTION_WITH_LAST_UPDATED_TIME", "SORT_ORDER_ASCENDING", "SORT_ORDER_ASCENDING_WITH_LIMIT", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getAuthNoticeDialog {
    @NotNull
    public static final String CONTACT_ID = "contact_id";
    @NotNull
    public static final String CONTACT_RAW_ID = "raw_contact_id";
    @NotNull
    public static final String DISPLAYNAME_SELECTION = "mimetype = ? AND LOWER(display_name) LIKE ?";
    @NotNull
    public static final String DISPLAY_NAME = "display_name";
    @NotNull
    public static final String INDO_PHONE_REGION_SELECTION = "(data1 LIKE ? OR data1 LIKE ? OR data1 LIKE ?)";
    @NotNull
    public static final String INDO_PREFIX = "628%";
    @NotNull
    public static final String INDO_PREFIX_WITH_PLUS = "+628%";
    @NotNull
    public static final String INDO_PREFIX_WITH_ZERO = "08%";
    @NotNull
    public static final String IN_PHONENUMBER_SELECTION = "mimetype = ? AND data1 IN (%s)";
    @NotNull
    public static final String LAST_UPDATED_TIME = "contact_last_updated_timestamp";
    @NotNull
    public static final String MIMETYPE = "mimetype";
    @NotNull
    public static final String MIMETYPE_INDO_REGION_SELECTION = "mimetype = ? AND (data1 LIKE ? OR data1 LIKE ? OR data1 LIKE ?)";
    @NotNull
    public static final String MIMETYPE_LAST_UPDATED_TIME_INDO_REGION_SELECTION = "mimetype = ? AND contact_last_updated_timestamp > ? AND (data1 LIKE ? OR data1 LIKE ? OR data1 LIKE ?)";
    @NotNull
    public static final String MIMETYPE_PHONENUMBER = "vnd.android.cursor.item/phone_v2";
    @NotNull
    public static final String MIMETYPE_SELECTION = "mimetype = ?";
    @NotNull
    public static final String PHONENUMBER = "data1";
    @NotNull
    public static final String PHONENUMBER_SELECTION = "mimetype = ? AND data1 LIKE ?";
    @NotNull
    private static final String[] PROJECTION_PHONENUMBER_CONTACTNAME = {"data1", "display_name"};
    @NotNull
    private static final String[] PROJECTION_WITH_LAST_UPDATED_TIME = {"contact_id", "data1", "display_name", "raw_contact_id", "contact_last_updated_timestamp"};
    @NotNull
    public static final String SORT_ORDER_ASCENDING = "%s COLLATE NOCASE ASC";
    @NotNull
    public static final String SORT_ORDER_ASCENDING_WITH_LIMIT = "%s COLLATE NOCASE ASC LIMIT %s OFFSET %s";

    @NotNull
    public static final String[] getPROJECTION_WITH_LAST_UPDATED_TIME() {
        return PROJECTION_WITH_LAST_UPDATED_TIME;
    }

    @NotNull
    public static final String[] getPROJECTION_PHONENUMBER_CONTACTNAME() {
        return PROJECTION_PHONENUMBER_CONTACTNAME;
    }
}
