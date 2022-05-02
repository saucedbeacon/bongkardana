package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.fragment.BlockedFragment;
import o.setRightButtonUnicode;

public final class setSelectedPositionInt implements getBindingAdapter<BlockedFragment> {
    @InjectedFieldSignature("id.dana.social.fragment.BlockedFragment.presenter")
    public static void setMin(BlockedFragment blockedFragment, setRightButtonUnicode.getMin getmin) {
        blockedFragment.presenter = getmin;
    }
}
