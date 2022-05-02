package o;

import com.iap.ac.android.biz.common.constants.ACConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/DecodeGnQr;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/globalnetwork/interactor/DecodeGnQr$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5DataProvider extends parseFailed<String, getMin> {
    private final onWebViewDestory globalNetworkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public H5DataProvider(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr = this.globalNetworkRepository.decodeGnQr(getmin.getAcDecodeValue(), getmin.getAcDecodeConfig(), getmin.getFromApp());
        Intrinsics.checkNotNullExpressionValue(decodeGnQr, "globalNetworkRepository.… params.fromApp\n        )");
        return decodeGnQr;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/DecodeGnQr$Params;", "", "acDecodeValue", "", "acDecodeConfig", "fromApp", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAcDecodeConfig", "()Ljava/lang/String;", "setAcDecodeConfig", "(Ljava/lang/String;)V", "getAcDecodeValue", "setAcDecodeValue", "getFromApp", "()Z", "setFromApp", "(Z)V", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
        @NotNull
        private String acDecodeConfig;
        @NotNull
        private String acDecodeValue;
        private boolean fromApp;

        @JvmStatic
        @NotNull
        public static final getMin forDecodeGnQr(@NotNull String str, @NotNull String str2, boolean z) {
            return Companion.forDecodeGnQr(str, str2, z);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/DecodeGnQr$Params$Companion;", "", "()V", "forDecodeGnQr", "Lid/dana/domain/globalnetwork/interactor/DecodeGnQr$Params;", "acDecodeValue", "", "acDecodeConfig", "fromApp", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMin forDecodeGnQr(@NotNull String str, @NotNull String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "acDecodeValue");
                Intrinsics.checkNotNullParameter(str2, ACConstants.PARAMETER_KEY_AC_DECODE_CONFIG);
                return new getMin(str, str2, z);
            }
        }

        public getMin(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "acDecodeValue");
            Intrinsics.checkNotNullParameter(str2, ACConstants.PARAMETER_KEY_AC_DECODE_CONFIG);
            this.acDecodeValue = str;
            this.acDecodeConfig = str2;
            this.fromApp = z;
        }

        @NotNull
        public final String getAcDecodeConfig() {
            return this.acDecodeConfig;
        }

        @NotNull
        public final String getAcDecodeValue() {
            return this.acDecodeValue;
        }

        public final boolean getFromApp() {
            return this.fromApp;
        }

        public final void setAcDecodeConfig(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(1221504406, oncanceled);
                onCancelLoad.getMin(1221504406, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.acDecodeConfig = str;
        }

        public final void setAcDecodeValue(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.acDecodeValue = str;
        }

        public final void setFromApp(boolean z) {
            this.fromApp = z;
        }
    }
}
