package o;

import o.b;

public final class supportZoom implements getAdapterPosition<setBuiltInZoomControls> {
    private final b.C0007b<getMediaPlaybackRequiresUserGesture> deviceWhitelistRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public supportZoom(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMediaPlaybackRequiresUserGesture> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.deviceWhitelistRepositoryProvider = bVar3;
    }

    public final setBuiltInZoomControls get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.deviceWhitelistRepositoryProvider.get());
    }

    public static supportZoom create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMediaPlaybackRequiresUserGesture> bVar3) {
        return new supportZoom(bVar, bVar2, bVar3);
    }

    public static setBuiltInZoomControls newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getMediaPlaybackRequiresUserGesture getmediaplaybackrequiresusergesture) {
        return new setBuiltInZoomControls(appxloadfailed, getscheme, getmediaplaybackrequiresusergesture);
    }
}
