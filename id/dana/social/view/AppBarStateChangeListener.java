package id.dana.social.view;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/social/view/AppBarStateChangeListener;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "()V", "mCurrentState", "Lid/dana/social/view/AppBarStateChangeListener$State;", "onOffsetChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "i", "", "onStateChanged", "state", "State", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class AppBarStateChangeListener implements AppBarLayout.OnOffsetChangedListener {
    private State length = State.IDLE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/social/view/AppBarStateChangeListener$State;", "", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "IDLE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum State {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    public abstract void setMax(@NotNull AppBarLayout appBarLayout, @NotNull State state);

    public void onOffsetChanged(@NotNull AppBarLayout appBarLayout, int i) {
        State state;
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        if (i == 0) {
            if (this.length != State.EXPANDED) {
                setMax(appBarLayout, State.EXPANDED);
            }
            state = State.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            if (this.length != State.COLLAPSED) {
                setMax(appBarLayout, State.COLLAPSED);
            }
            state = State.COLLAPSED;
        } else {
            if (this.length != State.IDLE) {
                setMax(appBarLayout, State.IDLE);
            }
            state = State.IDLE;
        }
        this.length = state;
    }
}
