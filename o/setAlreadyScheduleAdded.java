package o;

import o.b;

public final class setAlreadyScheduleAdded implements getAdapterPosition<setShouldResumeWebView> {
    private final b.C0007b<SplashView> length;

    private setAlreadyScheduleAdded(b.C0007b<SplashView> bVar) {
        this.length = bVar;
    }

    public static setAlreadyScheduleAdded getMin(b.C0007b<SplashView> bVar) {
        return new setAlreadyScheduleAdded(bVar);
    }

    public final /* synthetic */ Object get() {
        return new setShouldResumeWebView(this.length.get());
    }
}
