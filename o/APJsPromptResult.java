package o;

import o.b;

public final class APJsPromptResult implements getAdapterPosition<useHttpAuthUsernamePassword> {
    private final b.C0007b<confirm> cardRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public APJsPromptResult(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<confirm> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.cardRepositoryProvider = bVar3;
    }

    public final useHttpAuthUsernamePassword get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.cardRepositoryProvider.get());
    }

    public static APJsPromptResult create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<confirm> bVar3) {
        return new APJsPromptResult(bVar, bVar2, bVar3);
    }

    public static useHttpAuthUsernamePassword newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, confirm confirm) {
        return new useHttpAuthUsernamePassword(appxloadfailed, getscheme, confirm);
    }
}
