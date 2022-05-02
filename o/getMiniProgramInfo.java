package o;

import id.dana.di.modules.UserStatementModule;
import o.AUTextView;
import o.b;

public final class getMiniProgramInfo implements getAdapterPosition<AUTextView.OnVisibilityChangeListener.setMax> {
    private final b.C0007b<AUDefaultTheme> setMax;
    private final UserStatementModule setMin;

    private getMiniProgramInfo(UserStatementModule userStatementModule, b.C0007b<AUDefaultTheme> bVar) {
        this.setMin = userStatementModule;
        this.setMax = bVar;
    }

    public static getMiniProgramInfo length(UserStatementModule userStatementModule, b.C0007b<AUDefaultTheme> bVar) {
        return new getMiniProgramInfo(userStatementModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AUTextView.OnVisibilityChangeListener.setMax min = this.setMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
