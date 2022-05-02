package o;

import javax.inject.Inject;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CommonUtil extends parseFailed<Boolean, getMin> {
    private final dynamicProxy playStoreReviewRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/playstorereview/model/AppReviewInfo;", "", "show", "", "inApp", "(ZZ)V", "getInApp", "()Z", "getShow", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.CommonUtil$1  reason: invalid class name */
    public final class AnonymousClass1 {
        private final boolean inApp;
        private final boolean show;

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.show;
            }
            if ((i & 2) != 0) {
                z2 = r0.inApp;
            }
            return r0.copy(z, z2);
        }

        public final boolean component1() {
            return this.show;
        }

        public final boolean component2() {
            return this.inApp;
        }

        @NotNull
        public final AnonymousClass1 copy(boolean z, boolean z2) {
            return new AnonymousClass1(z, z2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return this.show == r3.show && this.inApp == r3.inApp;
        }

        public final int hashCode() {
            boolean z = this.show;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.inApp;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AppReviewInfo(show=");
            sb.append(this.show);
            sb.append(", inApp=");
            sb.append(this.inApp);
            sb.append(")");
            return sb.toString();
        }

        {
            this.show = r1;
            this.inApp = r2;
        }

        public final boolean getInApp() {
            return this.inApp;
        }

        public final boolean getShow() {
            return this.show;
        }
    }

    @Inject
    public CommonUtil(appxLoadFailed appxloadfailed, getScheme getscheme, dynamicProxy dynamicproxy) {
        super(appxloadfailed, getscheme);
        this.playStoreReviewRepository = dynamicproxy;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMin getmin) {
        return this.playStoreReviewRepository.saveLastPlayStoreReviewShow(getmin.action, getmin.actionTime, getmin.triggerTime);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public final String action;
        /* access modifiers changed from: private */
        public final long actionTime;
        /* access modifiers changed from: private */
        public final long triggerTime;

        private getMin(String str, long j, long j2) {
            this.action = str;
            this.actionTime = j;
            this.triggerTime = j2;
        }

        public static getMin forSaveLastPlayStoreReviewParams(String str, long j, long j2) {
            return new getMin(str, j, j2);
        }
    }
}
