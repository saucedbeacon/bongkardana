package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SplashEntryInfo;
import o.maybeSetTextColor;
import org.jetbrains.annotations.NotNull;

public final class dimen implements getAdapterPosition<Cdefault> {

    static final class setMax {
        /* access modifiers changed from: private */
        public static final dimen getMax = new dimen();
    }

    public final Cdefault get() {
        return newInstance();
    }

    public static dimen create() {
        return setMax.getMax;
    }

    public static Cdefault newInstance() {
        return new Cdefault();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0003\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nH\u0002¨\u0006\u000e"}, d2 = {"Lid/dana/data/auth/face/mapper/FaceAuthenticationEntityMapper;", "", "()V", "transform", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "result", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "Lid/dana/domain/auth/face/result/SecurityContext;", "securityContext", "Lid/dana/data/auth/face/repository/source/result/SecurityContextEntity;", "", "Lid/dana/domain/auth/face/result/VerificationMethodInfo;", "verificationMethods", "Lid/dana/data/auth/face/repository/source/result/VerificationMethodInfoEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.dimen$default  reason: invalid class name */
    public final class Cdefault {
        @NotNull
        public final GVTitleBar transform(@NotNull textChanged textchanged) {
            Intrinsics.checkNotNullParameter(textchanged, "result");
            GVTitleBar gVTitleBar = new GVTitleBar();
            gVTitleBar.setSuccess(textchanged.success);
            gVTitleBar.setSecurityId(textchanged.getSecurityId());
            gVTitleBar.setRiskResult(textchanged.getRiskResult());
            gVTitleBar.setAction(textchanged.getAction());
            gVTitleBar.setVerificationMethods(transform(textchanged.getVerificationMethods()));
            gVTitleBar.setSecurityContext(transform(textchanged.getSecurityContext()));
            return gVTitleBar;
        }

        private final List<GVTabBar> transform(List<maybeSetTextColor.Cdefault> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (maybeSetTextColor.Cdefault next : list) {
                GVTabBar gVTabBar = new GVTabBar();
                gVTabBar.setPriority(Integer.valueOf(next.getPriority()));
                gVTabBar.setVerificationMethod(next.getVerificationMethod());
                gVTabBar.setVerificationMethodCode(next.getVerificationMethodCode());
                arrayList.add(gVTabBar);
            }
            return arrayList;
        }

        private final SplashEntryInfo.AnonymousClass1 transform(ifNotZero ifnotzero) {
            String str = null;
            SplashEntryInfo.AnonymousClass1 r0 = new SplashEntryInfo.AnonymousClass1((String) null, 1, (DefaultConstructorMarker) null);
            if (ifnotzero != null) {
                str = ifnotzero.getPubKey();
            }
            r0.setPubKey(str);
            return r0;
        }
    }
}
