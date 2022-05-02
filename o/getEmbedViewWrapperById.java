package o;

import o.releaseView;

final class getEmbedViewWrapperById implements RedDotDrawable {
    private final releaseView.setMax getMax;
    private final releaseView setMin;

    public getEmbedViewWrapperById(releaseView releaseview, releaseView.setMax setmax) {
        this.setMin = releaseview;
        this.getMax = setmax;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$buildUseCaseObservable$0(this.getMax, (Boolean) obj);
    }
}
