package o;

import o.b;

public final class onConsoleMessage implements getAdapterPosition<onJsBeforeUnload> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setMediaPlaybackRequiresUserGesture> repositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onConsoleMessage(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.repositoryProvider = bVar3;
    }

    public final onJsBeforeUnload get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.repositoryProvider.get());
    }

    public static onConsoleMessage create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
        return new onConsoleMessage(bVar, bVar2, bVar3);
    }

    public static onJsBeforeUnload newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        return new onJsBeforeUnload(appxloadfailed, getscheme, setmediaplaybackrequiresusergesture);
    }
}
