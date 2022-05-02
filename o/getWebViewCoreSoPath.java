package o;

import android.text.TextUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/GetUserOriginCountryCode;", "Lid/dana/domain/common/ObservableUseCase;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "currentCountryCode", "getUserOriginCountryCode", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getWebViewCoreSoPath extends getItemAtIndex<String, String> {
    /* access modifiers changed from: private */
    public final onWebViewDestory globalNetworkRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "originCountryCode", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        final /* synthetic */ getWebViewCoreSoPath getMin;
        final /* synthetic */ String length;

        setMin(getWebViewCoreSoPath getwebviewcoresopath, String str) {
            this.getMin = getwebviewcoresopath;
            this.length = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "originCountryCode");
            if (!(str.length() == 0) || TextUtils.isEmpty(this.length)) {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(str);
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(originCountryCode)");
            } else {
                this.getMin.globalNetworkRepository.saveOriginCountryCode(this.length);
                r2 = TitleBarRightButtonView.AnonymousClass1.just(this.length);
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(currentCountryCode)");
            }
            return r2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getWebViewCoreSoPath(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
        this.globalNetworkRepository = onwebviewdestory;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(@Nullable String str) {
        return getUserOriginCountryCode(str);
    }

    private final TitleBarRightButtonView.AnonymousClass1<String> getUserOriginCountryCode(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.globalNetworkRepository.getOriginCountryCode().flatMap(new setMin(this, str));
        Intrinsics.checkNotNullExpressionValue(flatMap, "globalNetworkRepository.…          }\n            }");
        return flatMap;
    }
}
