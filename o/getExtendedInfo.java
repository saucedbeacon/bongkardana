package o;

import id.dana.di.modules.UserStatementModule;
import o.AUTextView;

public final class getExtendedInfo implements getAdapterPosition<AUTextView.OnVisibilityChangeListener.getMax> {
    private final UserStatementModule getMin;

    private getExtendedInfo(UserStatementModule userStatementModule) {
        this.getMin = userStatementModule;
    }

    public static getExtendedInfo length(UserStatementModule userStatementModule) {
        return new getExtendedInfo(userStatementModule);
    }

    public final /* synthetic */ Object get() {
        AUTextView.OnVisibilityChangeListener.getMax max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
