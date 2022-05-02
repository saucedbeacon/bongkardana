package o;

import id.dana.di.modules.MiniProgramModule;
import o.GriverDefaultPromptExtension;

public final class castToInt implements getAdapterPosition<GriverDefaultPromptExtension.AnonymousClass2.getMin> {
    private final MiniProgramModule getMin;

    private castToInt(MiniProgramModule miniProgramModule) {
        this.getMin = miniProgramModule;
    }

    public static castToInt setMin(MiniProgramModule miniProgramModule) {
        return new castToInt(miniProgramModule);
    }

    public final /* synthetic */ Object get() {
        GriverDefaultPromptExtension.AnonymousClass2.getMin max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
