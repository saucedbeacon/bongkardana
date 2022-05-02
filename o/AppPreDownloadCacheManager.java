package o;

import id.dana.domain.qrbarcode.interactor.GetUserStaticQr;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class AppPreDownloadCacheManager implements getAdapterPosition<GetUserStaticQr> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverPrepareInterceptor> repositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\u0004H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/qriscrossborder/QrisCrossBorderRepository;", "", "getCurrentCountry", "Lio/reactivex/Observable;", "", "getOriginCountry", "saveCurrentCountry", "", "countryCode", "saveOriginCountry", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.AppPreDownloadCacheManager$1  reason: invalid class name */
    public interface AnonymousClass1 {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountry();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<String> getOriginCountry();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountry(@NotNull String str);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountry(@NotNull String str);
    }

    public AppPreDownloadCacheManager(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverPrepareInterceptor> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.repositoryProvider = bVar3;
    }

    public final GetUserStaticQr get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.repositoryProvider.get());
    }

    public static AppPreDownloadCacheManager create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverPrepareInterceptor> bVar3) {
        return new AppPreDownloadCacheManager(bVar, bVar2, bVar3);
    }

    public static GetUserStaticQr newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverPrepareInterceptor griverPrepareInterceptor) {
        return new GetUserStaticQr(appxloadfailed, getscheme, griverPrepareInterceptor);
    }
}
