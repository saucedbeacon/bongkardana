package o;

public final /* synthetic */ class getAppExtInfo {
    public static /* synthetic */ getIsvAgent getFollowerItemList$default(getCurrentPageUrl getcurrentpageurl, Integer num, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = 0;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return getcurrentpageurl.getFollowerItemList(num, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFollowerItemList");
    }

    public static /* synthetic */ getIsvAgentDesc getFollowingItemList$default(getCurrentPageUrl getcurrentpageurl, Integer num, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = 0;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return getcurrentpageurl.getFollowingItemList(num, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFollowingItemList");
    }
}
