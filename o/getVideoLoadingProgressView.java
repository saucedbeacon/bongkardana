package o;

import o.b;

public final class getVideoLoadingProgressView implements getAdapterPosition<getDefaultVideoPoster> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setMediaPlaybackRequiresUserGesture> repositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getVideoLoadingProgressView(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.repositoryProvider = bVar3;
    }

    public final getDefaultVideoPoster get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.repositoryProvider.get());
    }

    public static getVideoLoadingProgressView create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
        return new getVideoLoadingProgressView(bVar, bVar2, bVar3);
    }

    public static getDefaultVideoPoster newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        return new getDefaultVideoPoster(appxloadfailed, getscheme, setmediaplaybackrequiresusergesture);
    }
}
