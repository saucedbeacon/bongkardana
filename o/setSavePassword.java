package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "electronicmoneyRepository", "Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setSavePassword extends parseFailed<getUseWideViewPort, getMax> {
    private final setAllowFileAccess electronicmoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setSavePassword(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull setAllowFileAccess setallowfileaccess) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(setallowfileaccess, "electronicmoneyRepository");
        this.electronicmoneyRepository = setallowfileaccess;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getUseWideViewPort> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.electronicmoneyRepository.getTopUpCommandEmoney(getmax.getCardType(), getmax.getCardProvider(), getmax.getState(), getmax.getData());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney$Params;", "", "cardType", "", "cardProvider", "state", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCardProvider", "()Ljava/lang/String;", "getCardType", "getData", "()Ljava/util/Map;", "getState", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        private final String cardProvider;
        @NotNull
        private final String cardType;
        @NotNull
        private final Map<String, String> data;
        @Nullable
        private final String state;

        @JvmStatic
        @NotNull
        public static final getMax create(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map) {
            return Companion.create(str, str2, str3, map);
        }

        private getMax(String str, String str2, String str3, Map<String, String> map) {
            this.cardType = str;
            this.cardProvider = str2;
            this.state = str3;
            this.data = map;
        }

        public /* synthetic */ getMax(String str, String str2, String str3, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, map);
        }

        @NotNull
        public final String getCardProvider() {
            return this.cardProvider;
        }

        @NotNull
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        public final String getState() {
            return this.state;
        }

        @NotNull
        public final Map<String, String> getData() {
            return this.data;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney$Params$Companion;", "", "()V", "create", "Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney$Params;", "cardType", "", "cardProvider", "state", "data", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMax create(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "cardType");
                Intrinsics.checkNotNullParameter(str2, "cardProvider");
                Intrinsics.checkNotNullParameter(map, "data");
                return new getMax(str, str2, str3, map, (DefaultConstructorMarker) null);
            }
        }
    }
}
