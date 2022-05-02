package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class H5Event implements getAdapterPosition<releaseView> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    final class Error implements RedDotDrawable {
        public static final Error length = new Error();

        public final Object apply(Object obj) {
            return ((TitleBarRightButtonView.AnonymousClass1) obj).delay(30, TimeUnit.SECONDS);
        }
    }

    public H5Event(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/GetGnContent;", "Lid/dana/domain/common/ObservableUseCase;", "Lid/dana/domain/globalnetwork/model/GnContent;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "countryCode", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class Builder extends getItemAtIndex<PageProcessPoint, String> {
        private final onWebViewDestory globalNetworkRepository;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public Builder(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull onWebViewDestory onwebviewdestory) {
            super(appxloadfailed, getscheme);
            Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
            Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
            Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
            this.globalNetworkRepository = onwebviewdestory;
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<PageProcessPoint> buildUseCaseObservable(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            TitleBarRightButtonView.AnonymousClass1<PageProcessPoint> gnContent = this.globalNetworkRepository.getGnContent(str);
            Intrinsics.checkNotNullExpressionValue(gnContent, "globalNetworkRepository.getGnContent(countryCode)");
            return gnContent;
        }
    }

    public final releaseView get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static H5Event create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new H5Event(bVar, bVar2, bVar3);
    }

    public static releaseView newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new releaseView(appxloadfailed, getscheme, onwebviewdestory);
    }
}
