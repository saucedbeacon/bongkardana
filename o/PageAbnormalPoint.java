package o;

import o.b;

public final class PageAbnormalPoint implements getAdapterPosition<H5ErrorCode> {
    private final b.C0007b<PageFinishedPoint> userBankRepositoryProvider;

    public PageAbnormalPoint(b.C0007b<PageFinishedPoint> bVar) {
        this.userBankRepositoryProvider = bVar;
    }

    public final H5ErrorCode get() {
        return newInstance(this.userBankRepositoryProvider.get());
    }

    public static PageAbnormalPoint create(b.C0007b<PageFinishedPoint> bVar) {
        return new PageAbnormalPoint(bVar);
    }

    public static H5ErrorCode newInstance(PageFinishedPoint pageFinishedPoint) {
        return new H5ErrorCode(pageFinishedPoint);
    }
}
