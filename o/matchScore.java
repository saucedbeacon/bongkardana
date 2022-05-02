package o;

import o.TitleBarRightButtonView;

public final /* synthetic */ class matchScore {
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getSelectedFollowingItem$default(getResponseCode getresponsecode, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return getresponsecode.getSelectedFollowingItem(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSelectedFollowingItem");
    }

    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getSelectedFollowerItem$default(getResponseCode getresponsecode, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return getresponsecode.getSelectedFollowerItem(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSelectedFollowerItem");
    }
}
