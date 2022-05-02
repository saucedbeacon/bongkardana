package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/deeplink/model/DeepLinkPayload;", "Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "deepLinkRepository", "Lid/dana/domain/deeplink/repository/DeepLinkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/deeplink/repository/DeepLinkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onMessage extends parseFailed<getRequestHeaders, getMax> {
    private final setSupportZoom deepLinkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onMessage(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull setSupportZoom setsupportzoom) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(setsupportzoom, "deepLinkRepository");
        this.deepLinkRepository = setsupportzoom;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.deepLinkRepository.readProperties(getmax.getUrl());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties$Params;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        @NotNull
        private final String url;

        @JvmStatic
        @NotNull
        public static final getMax forLinkRead(@NotNull String str) {
            return Companion.forLinkRead(str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties$Params$Companion;", "", "()V", "forLinkRead", "Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties$Params;", "url", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMax forLinkRead(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                return new getMax(str, (DefaultConstructorMarker) null);
            }
        }

        private getMax(String str) {
            this.url = str;
        }

        public /* synthetic */ getMax(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }
}
