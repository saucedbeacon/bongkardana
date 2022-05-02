package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.FileMangerBridgeExtension;
import o.uploadFileByHttp;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/di/modules/PaymentSettingModule;", "", "view", "Lid/dana/paymentsetting/PaymentSettingContract$View;", "(Lid/dana/paymentsetting/PaymentSettingContract$View;)V", "providePresenter", "Lid/dana/paymentsetting/PaymentSettingContract$Presenter;", "presenter", "Lid/dana/paymentsetting/PaymentSettingPresenter;", "providePresenter$app_productionRelease", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class PaymentSettingModule {
    private final FileMangerBridgeExtension.AnonymousClass1.length length;

    public PaymentSettingModule(@NotNull FileMangerBridgeExtension.AnonymousClass1.length length2) {
        Intrinsics.checkNotNullParameter(length2, "view");
        this.length = length2;
    }

    @NotNull
    @Provides
    public final FileMangerBridgeExtension.AnonymousClass1.length getMin() {
        return this.length;
    }

    @NotNull
    @Provides
    public final FileMangerBridgeExtension.AnonymousClass1.getMax length(@NotNull uploadFileByHttp uploadfilebyhttp) {
        Intrinsics.checkNotNullParameter(uploadfilebyhttp, "presenter");
        return uploadfilebyhttp;
    }
}
