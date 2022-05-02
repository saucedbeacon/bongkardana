package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import o.dimen;
import o.resolveDimen;
import o.resolveDrawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J4\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/data/auth/face/repository/FaceAuthenticationEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/auth/face/repository/FaceAuthenticationRepository;", "faceAuthenticationEntityDataFactory", "Lid/dana/data/auth/face/repository/source/network/FaceAuthenticationEntityDataFactory;", "faceAuthenticationEntityMapper", "Lid/dana/data/auth/face/mapper/FaceAuthenticationEntityMapper;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "securityGuardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "(Lid/dana/data/auth/face/repository/source/network/FaceAuthenticationEntityDataFactory;Lid/dana/data/auth/face/mapper/FaceAuthenticationEntityMapper;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;)V", "createFaceAuthenticationData", "Lid/dana/data/auth/face/repository/source/FaceAuthenticationEntityData;", "switch", "Lio/reactivex/Observable;", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "faceAuthNew", "", "securityId", "", "verify", "pin", "pubKey", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class font extends setMinProgress implements GriverSplashFragmentExtension {
    private final dimenPx faceAuthenticationEntityDataFactory;
    /* access modifiers changed from: private */
    public final dimen.Cdefault faceAuthenticationEntityMapper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionRepository;", "faceAuthSuggestionPreference", "Lid/dana/data/auth/face/repository/source/local/FaceAuthSuggestionPreference;", "(Lid/dana/data/auth/face/repository/source/local/FaceAuthSuggestionPreference;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.font$default  reason: invalid class name */
    public final class Cdefault extends uncheckItems<resolveDrawable.Cdefault> {
        private final resolveDimen.Cdefault faceAuthSuggestionPreference;

        @Inject
        public Cdefault(@NotNull resolveDimen.Cdefault defaultR) {
            Intrinsics.checkNotNullParameter(defaultR, "faceAuthSuggestionPreference");
            this.faceAuthSuggestionPreference = defaultR;
        }

        @NotNull
        public final resolveDrawable.Cdefault createData(@Nullable String str) {
            return new resolveFloat(this.faceAuthSuggestionPreference);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<textChanged, GVTitleBar> {
        final /* synthetic */ font length;

        length(font font) {
            this.length = font;
        }

        public final /* synthetic */ Object apply(Object obj) {
            textChanged textchanged = (textChanged) obj;
            Intrinsics.checkNotNullParameter(textchanged, "it");
            return this.length.faceAuthenticationEntityMapper.transform(textchanged);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<textChanged, GVTitleBar> {
        final /* synthetic */ font getMin;

        setMax(font font) {
            this.getMin = font;
        }

        public final /* synthetic */ Object apply(Object obj) {
            textChanged textchanged = (textChanged) obj;
            Intrinsics.checkNotNullParameter(textchanged, "it");
            return this.getMin.faceAuthenticationEntityMapper.transform(textchanged);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public font(@NotNull dimenPx dimenpx, @NotNull dimen.Cdefault defaultR, @NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r5, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r5, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dimenpx, "faceAuthenticationEntityDataFactory");
        Intrinsics.checkNotNullParameter(defaultR, "faceAuthenticationEntityMapper");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r5, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "securityGuardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        this.faceAuthenticationEntityDataFactory = dimenpx;
        this.faceAuthenticationEntityMapper = defaultR;
    }

    @NotNull
    /* renamed from: switch  reason: not valid java name */
    public final TitleBarRightButtonView.AnonymousClass1<GVTitleBar> m1112switch(boolean z, @Nullable String str) {
        TitleBarRightButtonView.AnonymousClass1<GVTitleBar> authenticatedRequest = authenticatedRequest(createFaceAuthenticationData().m1115switch(z, str).map(new setMax(this)));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(cre…tyMapper.transform(it) })");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GVTitleBar> verify(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        TitleBarRightButtonView.AnonymousClass1<GVTitleBar> authenticatedRequest = authenticatedRequest(createFaceAuthenticationData().verify(z, str, str2, str3).map(new length(this)));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(cre…tyMapper.transform(it) })");
        return authenticatedRequest;
    }

    private final safeGetFont createFaceAuthenticationData() {
        return this.faceAuthenticationEntityDataFactory.createData("network");
    }
}
