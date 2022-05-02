package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.fragment.MutedFragment;
import o.setOnBackListener;

public final class onTouchModeChanged implements getBindingAdapter<MutedFragment> {
    @InjectedFieldSignature("id.dana.social.fragment.MutedFragment.presenter")
    public static void length(MutedFragment mutedFragment, setOnBackListener.setMax setmax) {
        mutedFragment.presenter = setmax;
    }
}
