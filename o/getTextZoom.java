package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/electronicmoney/model/response/EmoneyReversal;", "Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "electronicmoneyRepository", "Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getTextZoom extends parseFailed<setLayoutAlgorithm, length> {
    private final setAllowFileAccess electronicmoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getTextZoom(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull setAllowFileAccess setallowfileaccess) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(setallowfileaccess, "electronicmoneyRepository");
        this.electronicmoneyRepository = setallowfileaccess;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setLayoutAlgorithm> buildUseCaseObservable(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.electronicmoneyRepository.getReversalEmoney(length2.getCardType(), length2.getCardProvider(), length2.getData());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal$Params;", "", "cardType", "", "cardProvider", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCardProvider", "()Ljava/lang/String;", "getCardType", "getData", "()Ljava/util/Map;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        public static final C0060length Companion = new C0060length((DefaultConstructorMarker) null);
        @NotNull
        private final String cardProvider;
        @NotNull
        private final String cardType;
        @NotNull
        private final Map<String, String> data;

        @JvmStatic
        @NotNull
        public static final length create(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return Companion.create(str, str2, map);
        }

        private length(String str, String str2, Map<String, String> map) {
            this.cardType = str;
            this.cardProvider = str2;
            this.data = map;
        }

        public /* synthetic */ length(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map);
        }

        @NotNull
        public final String getCardProvider() {
            return this.cardProvider;
        }

        @NotNull
        public final String getCardType() {
            return this.cardType;
        }

        @NotNull
        public final Map<String, String> getData() {
            return this.data;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0007¨\u0006\n"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal$Params$Companion;", "", "()V", "create", "Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal$Params;", "cardType", "", "cardProvider", "data", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.getTextZoom$length$length  reason: collision with other inner class name */
        public static final class C0060length {
            private C0060length() {
            }

            public /* synthetic */ C0060length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final length create(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "cardType");
                Intrinsics.checkNotNullParameter(str2, "cardProvider");
                Intrinsics.checkNotNullParameter(map, "data");
                return new length(str, str2, map, (DefaultConstructorMarker) null);
            }
        }
    }
}