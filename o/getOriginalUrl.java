package o;

import o.b;

public final class getOriginalUrl implements getAdapterPosition<getFavicon> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setMediaPlaybackRequiresUserGesture> repositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getOriginalUrl(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.repositoryProvider = bVar3;
    }

    public final getFavicon get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.repositoryProvider.get());
    }

    public static getOriginalUrl create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
        return new getOriginalUrl(bVar, bVar2, bVar3);
    }

    public static getFavicon newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        return new getFavicon(appxloadfailed, getscheme, setmediaplaybackrequiresusergesture);
    }
}
