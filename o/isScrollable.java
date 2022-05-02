package o;

import o.b;

public final class isScrollable implements getAdapterPosition<positiveButtonClicked> {
    private final b.C0007b<isAtTop> networkFileUploadEntityDataProvider;

    public isScrollable(b.C0007b<isAtTop> bVar) {
        this.networkFileUploadEntityDataProvider = bVar;
    }

    public final positiveButtonClicked get() {
        return newInstance(this.networkFileUploadEntityDataProvider.get());
    }

    public static isScrollable create(b.C0007b<isAtTop> bVar) {
        return new isScrollable(bVar);
    }

    public static positiveButtonClicked newInstance(isAtTop isattop) {
        return new positiveButtonClicked(isattop);
    }
}
