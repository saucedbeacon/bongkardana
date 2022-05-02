package o;

import android.content.Context;
import id.dana.domain.registration.AuthenticationMethod;
import id.dana.richview.profile.RiskResultType;
import java.util.Locale;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import o.maybeSetTextColor;
import o.resolveDimen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0015"}, d2 = {"Lid/dana/data/auth/face/repository/source/local/MockFaceAuthenticationEntityData;", "Lid/dana/data/auth/face/repository/source/FaceAuthenticationEntityData;", "()V", "actionState", "", "", "[Ljava/lang/String;", "riskResultState", "verificationMethodCodeState", "verificationMethodState", "generateResultForEnroll", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "generateResultForSwitch", "switch", "Lio/reactivex/Observable;", "faceAuthNew", "", "securityId", "verify", "pin", "pubKey", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class resolveInt implements safeGetFont {
    private final String[] actionState = {"TO_RISK", "TO_ENROLL", "TO_KYC"};
    private final String[] riskResultState = {RiskResultType.ACCEPT, RiskResultType.VERIFICATION};
    private final String[] verificationMethodCodeState = {"pin", "accept", "micface"};
    private final String[] verificationMethodState = {"PIN", RiskResultType.ACCEPT, AuthenticationMethod.FACE_LOGIN};

    /* renamed from: o.resolveInt$default  reason: invalid class name */
    public final class Cdefault implements getAdapterPosition<resolveDimen.Cdefault> {
        private final b.C0007b<Context> contextProvider;

        public Cdefault(b.C0007b<Context> bVar) {
            this.contextProvider = bVar;
        }

        public final resolveDimen.Cdefault get() {
            return newInstance(this.contextProvider.get());
        }

        public static Cdefault create(b.C0007b<Context> bVar) {
            return new Cdefault(bVar);
        }

        public static resolveDimen.Cdefault newInstance(Context context) {
            return new resolveDimen.Cdefault(context);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<textChanged> verify(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        TitleBarRightButtonView.AnonymousClass1<textChanged> just = TitleBarRightButtonView.AnonymousClass1.just(generateResultForEnroll());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(generateResultForEnroll())");
        return just;
    }

    private final textChanged generateResultForSwitch() {
        maybeSetTextColor.Cdefault defaultR = new maybeSetTextColor.Cdefault(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        defaultR.setPriority(setEntryInfo.randomInt());
        defaultR.setVerificationMethod(this.verificationMethodState[setEntryInfo.randomInt(this.riskResultState.length)]);
        String str = this.verificationMethodCodeState[setEntryInfo.randomInt(this.riskResultState.length)];
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            defaultR.setVerificationMethodCode(lowerCase);
            textChanged textchanged = new textChanged();
            textchanged.success = setEntryInfo.randomBoolean();
            if (textchanged.success) {
                String[] strArr = this.riskResultState;
                textchanged.setRiskResult(strArr[setEntryInfo.randomInt(strArr.length)]);
                if (Intrinsics.areEqual((Object) this.riskResultState[1], (Object) textchanged.getRiskResult())) {
                    textchanged.setSecurityId(setEntryInfo.randomString());
                    textchanged.setVerificationMethods(CollectionsKt.mutableListOf(defaultR));
                    ifNotZero securityContext = textchanged.getSecurityContext();
                    if (securityContext != null) {
                        securityContext.setPubKey(setEntryInfo.randomString());
                    }
                    String[] strArr2 = this.actionState;
                    textchanged.setAction(strArr2[setEntryInfo.randomInt(strArr2.length)]);
                }
            }
            return textchanged;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final textChanged generateResultForEnroll() {
        textChanged textchanged = new textChanged();
        textchanged.success = setEntryInfo.randomBoolean();
        if (textchanged.success) {
            String[] strArr = this.riskResultState;
            textchanged.setRiskResult(strArr[setEntryInfo.randomInt(strArr.length)]);
            textchanged.setSecurityId(setEntryInfo.randomString());
            textchanged.setAction(this.actionState[1]);
        }
        return textchanged;
    }

    @NotNull
    /* renamed from: switch  reason: not valid java name */
    public final TitleBarRightButtonView.AnonymousClass1<textChanged> m1114switch(boolean z, @Nullable String str) {
        TitleBarRightButtonView.AnonymousClass1<textChanged> just = TitleBarRightButtonView.AnonymousClass1.just(generateResultForSwitch());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(generateResultForSwitch())");
        return just;
    }
}
