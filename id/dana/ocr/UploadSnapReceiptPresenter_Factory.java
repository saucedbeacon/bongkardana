package id.dana.ocr;

import id.dana.ocr.UploadSnapReceiptContract;
import o.GriverMonitorAnalyticsConfigManager;
import o.MonitorManager;
import o.b;
import o.exceedThreshold;
import o.getAdapterPosition;
import o.getThreshold;

public final class UploadSnapReceiptPresenter_Factory implements getAdapterPosition<UploadSnapReceiptPresenter> {
    private final b.C0007b<UploadSnapReceiptContract.View> getMax;
    private final b.C0007b<exceedThreshold> getMin;
    private final b.C0007b<getThreshold> length;
    private final b.C0007b<GriverMonitorAnalyticsConfigManager.AnonymousClass1> setMax;
    private final b.C0007b<MonitorManager> setMin;

    private UploadSnapReceiptPresenter_Factory(b.C0007b<UploadSnapReceiptContract.View> bVar, b.C0007b<exceedThreshold> bVar2, b.C0007b<getThreshold> bVar3, b.C0007b<GriverMonitorAnalyticsConfigManager.AnonymousClass1> bVar4, b.C0007b<MonitorManager> bVar5) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
        this.setMin = bVar5;
    }

    public static UploadSnapReceiptPresenter_Factory length(b.C0007b<UploadSnapReceiptContract.View> bVar, b.C0007b<exceedThreshold> bVar2, b.C0007b<getThreshold> bVar3, b.C0007b<GriverMonitorAnalyticsConfigManager.AnonymousClass1> bVar4, b.C0007b<MonitorManager> bVar5) {
        return new UploadSnapReceiptPresenter_Factory(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new UploadSnapReceiptPresenter(this.getMax.get(), this.getMin.get(), this.length.get(), this.setMax.get(), this.setMin.get());
    }
}
