package o;

import id.dana.social.di.module.MutedFragmentModule;
import o.b;
import o.setOnBackListener;

public final class setStyleAndMsgText implements getAdapterPosition<setOnBackListener.setMax> {
    private final MutedFragmentModule getMin;
    private final b.C0007b<shouldRecycleViewType> setMax;

    public static setOnBackListener.setMax setMax(MutedFragmentModule mutedFragmentModule, shouldRecycleViewType shouldrecycleviewtype) {
        setOnBackListener.setMax min = mutedFragmentModule.getMin(shouldrecycleviewtype);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setOnBackListener.setMax min = this.getMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
