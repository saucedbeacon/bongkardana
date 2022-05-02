package o;

public final class createLiteVMInstance {
    private static final String HASHABLE_FORMAT = "%s:%s:%s:%s:%d";
    private static final int OFFSET = 0;
    private static final int SEED = 0;
    private static final String UNKNOWN = "UNKNOWN";

    private static String unknownIfNull(String str) {
        return str == null ? "UNKNOWN" : str;
    }

    private static Long zeroIfNull(Long l) {
        return Long.valueOf(l == null ? 0 : l.longValue());
    }

    public static Long process(dynamicDecryptDDp dynamicdecryptddp) {
        if (dynamicdecryptddp == null) {
            return null;
        }
        String format = String.format(HASHABLE_FORMAT, new Object[]{unknownIfNull(dynamicdecryptddp.key()), unknownIfNull(dynamicdecryptddp.split()), unknownIfNull(dynamicdecryptddp.treatment()), unknownIfNull(dynamicdecryptddp.appliedRule()), zeroIfNull(dynamicdecryptddp.changeNumber())});
        return Long.valueOf(showCommonDialog.murmurhash3_x86_32(format, 0, format.length(), 0));
    }
}
