package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.BillerX2BModule;
import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import id.dana.sendmoney_v2.landing.view.RecentTransactionView;
import kotlin.Metadata;
import o.PrepareException;
import o.b;
import o.setUnit;
import org.jetbrains.annotations.Nullable;

public final class ImageHelper implements getAdapterPosition<setFormat> {
    private final b.C0007b<GriverRVResourcePresetImpl> getMin;
    private final b.C0007b<ResourceDownloadType> setMax;
    private final b.C0007b<setUnit.setMin> setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/di/component/RecentTransactionComponent;", "", "inject", "", "view", "Lid/dana/sendmoney_v2/landing/view/RecentTransactionView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecentRecipientModule.class, BillerX2BModule.class})
    public interface LoadListener {
        void setMin(@Nullable RecentTransactionView recentTransactionView);
    }

    private ImageHelper(b.C0007b<setUnit.setMin> bVar, b.C0007b<ResourceDownloadType> bVar2, b.C0007b<GriverRVResourcePresetImpl> bVar3) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMin = bVar3;
    }

    public static ImageHelper length(b.C0007b<setUnit.setMin> bVar, b.C0007b<ResourceDownloadType> bVar2, b.C0007b<GriverRVResourcePresetImpl> bVar3) {
        return new ImageHelper(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setFormat(this.setMin.get(), this.setMax.get(), this.getMin.get());
    }
}
