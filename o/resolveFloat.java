package o;

import android.content.Context;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import o.isColorDark;
import o.resolveDimen;
import o.resolveDrawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/data/auth/face/repository/source/local/PreferenceFaceAuthSuggestionEntityData;", "Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionRepository;", "faceAuthSuggestionPreference", "Lid/dana/data/auth/face/repository/source/local/FaceAuthSuggestionPreference;", "(Lid/dana/data/auth/face/repository/source/local/FaceAuthSuggestionPreference;)V", "faceAuthSuggestionStateSavingTime", "", "getFaceAuthSuggestionStateSavingTime", "()J", "shouldNeverShowFaceAuthSuggestion", "Lio/reactivex/Observable;", "", "getShouldNeverShowFaceAuthSuggestion", "()Lio/reactivex/Observable;", "shouldSuggestFaceAuth", "getShouldSuggestFaceAuth", "clearFaceAuthSuggestionState", "saveFaceAuthSuggestionState", "hasShown", "saveFaceAuthSuggestionStateSavingTime", "", "currentDateTimeStamp", "saveNeverShowFaceAuthSuggestionState", "shouldNeverShow", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class resolveFloat implements resolveDrawable.Cdefault {
    private final resolveDimen.Cdefault faceAuthSuggestionPreference;

    @Inject
    public resolveFloat(@NotNull resolveDimen.Cdefault defaultR) {
        Intrinsics.checkNotNullParameter(defaultR, "faceAuthSuggestionPreference");
        this.faceAuthSuggestionPreference = defaultR;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldSuggestFaceAuth() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.faceAuthSuggestionPreference.getShouldSuggestFaceAuth()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(faceAuth…ce.shouldSuggestFaceAuth)");
        return just;
    }

    @Singleton
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¨\u0006\u001a"}, d2 = {"Lid/dana/data/auth/face/repository/source/network/NetworkFaceAuthenticationEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/auth/face/repository/source/network/FaceAuthenticationFacade;", "Lid/dana/data/auth/face/repository/source/FaceAuthenticationEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "switch", "Lio/reactivex/Observable;", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "faceAuthNew", "", "securityId", "", "verify", "pin", "pubKey", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.resolveFloat$default  reason: invalid class name */
    public final class Cdefault extends setRepeatCount<isColorDark.Cdefault> implements safeGetFont {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        public static final String PASSWORD = "PASSWORD";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/auth/face/repository/source/network/FaceAuthenticationFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.resolveFloat$default$getMax */
        static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<isColorDark.Cdefault, textChanged> {
            final /* synthetic */ additionalPaddingForFont setMin;

            getMax(additionalPaddingForFont additionalpaddingforfont) {
                this.setMin = additionalpaddingforfont;
            }

            public final /* synthetic */ Object processFacade(Object obj) {
                return ((isColorDark.Cdefault) obj).m1325switch(this.setMin);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/auth/face/repository/source/network/FaceAuthenticationFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.resolveFloat$default$length */
        static final class length<F, S> implements addAnimatorUpdateListener.getMax<isColorDark.Cdefault, textChanged> {
            final /* synthetic */ additionalPaddingForFont setMin;

            length(additionalPaddingForFont additionalpaddingforfont) {
                this.setMin = additionalpaddingforfont;
            }

            public final /* synthetic */ Object processFacade(Object obj) {
                return ((isColorDark.Cdefault) obj).m1325switch(this.setMin);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public Cdefault(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
            super(setisurgentresource, appxloadfailed, onappresume, context);
            Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
            Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
            Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        }

        @NotNull
        public final Class<isColorDark.Cdefault> getFacadeClass() {
            return isColorDark.Cdefault.class;
        }

        @NotNull
        /* renamed from: switch  reason: not valid java name */
        public final TitleBarRightButtonView.AnonymousClass1<textChanged> m1113switch(boolean z, @Nullable String str) {
            additionalPaddingForFont additionalpaddingforfont = new additionalPaddingForFont(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            additionalpaddingforfont.envInfo = generateMobileEnvInfo();
            additionalpaddingforfont.setFaceAuthNew(z);
            additionalpaddingforfont.setSecurityId(str);
            TitleBarRightButtonView.AnonymousClass1<textChanged> wrapper = wrapper(new getMax(additionalpaddingforfont));
            Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.switch(request) }");
            return wrapper;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<textChanged> verify(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            additionalPaddingForFont additionalpaddingforfont = new additionalPaddingForFont(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            additionalpaddingforfont.envInfo = generateMobileEnvInfo();
            additionalpaddingforfont.setFaceAuthNew(z);
            additionalpaddingforfont.setSecurityId(str);
            additionalpaddingforfont.setVerificationMethod("PASSWORD");
            additionalpaddingforfont.setValidateData(RSAHelper.encrypt(str2, str3));
            TitleBarRightButtonView.AnonymousClass1<textChanged> wrapper = wrapper(new length(additionalpaddingforfont));
            Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.switch(request) }");
            return wrapper;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/auth/face/repository/source/network/NetworkFaceAuthenticationEntityData$Companion;", "", "()V", "PASSWORD", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.resolveFloat$default$getMin */
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldNeverShowFaceAuthSuggestion() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.faceAuthSuggestionPreference.getShouldNeverShowFaceAuthSuggestion()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(faceAuth…erShowFaceAuthSuggestion)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveFaceAuthSuggestionState(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.faceAuthSuggestionPreference.saveFaceAuthSuggestionState(z)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …uggestionState(hasShown))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveNeverShowFaceAuthSuggestionState(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.faceAuthSuggestionPreference.saveNeverShowFaceAuthSuggestionState(z)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …onState(shouldNeverShow))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> clearFaceAuthSuggestionState() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.faceAuthSuggestionPreference.clearFaceAuthSuggestionState()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …aceAuthSuggestionState())");
        return just;
    }

    public final void saveFaceAuthSuggestionStateSavingTime(long j) {
        this.faceAuthSuggestionPreference.saveFaceAuthSuggestionStateSavingTime(j);
    }

    public final long getFaceAuthSuggestionStateSavingTime() {
        return this.faceAuthSuggestionPreference.getFaceAuthSuggestionStateSavingTime();
    }
}
