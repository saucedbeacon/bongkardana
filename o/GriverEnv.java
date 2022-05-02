package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/domain/investment/InvestmentRepository;", "", "getUserInvestment", "Lio/reactivex/Observable;", "Lid/dana/domain/investment/model/UserInvestmentInfo;", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface GriverEnv {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getWorkSpaceId> getUserInvestment();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lid/dana/domain/kycamledd/model/EddConsult;", "", "eddStatus", "", "eddInfo", "Lid/dana/domain/kycamledd/model/EddInfo;", "eddMandatory", "(ZLid/dana/domain/kycamledd/model/EddInfo;Z)V", "getEddInfo", "()Lid/dana/domain/kycamledd/model/EddInfo;", "getEddMandatory", "()Z", "getEddStatus", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverEnv$2  reason: invalid class name */
    public final class AnonymousClass2 {
        @Nullable
        private final GriverRVResourceEnvProxyImpl eddInfo;
        private final boolean eddMandatory;
        private final boolean eddStatus;

        public AnonymousClass2(boolean z, @Nullable GriverRVResourceEnvProxyImpl griverRVResourceEnvProxyImpl, boolean z2) {
            this.eddStatus = z;
            this.eddInfo = griverRVResourceEnvProxyImpl;
            this.eddMandatory = z2;
        }

        public final boolean getEddStatus() {
            return this.eddStatus;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(boolean z, GriverRVResourceEnvProxyImpl griverRVResourceEnvProxyImpl, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new GriverRVResourceEnvProxyImpl((String) null, (List) null, 3, (DefaultConstructorMarker) null) : griverRVResourceEnvProxyImpl, z2);
        }

        @Nullable
        public final GriverRVResourceEnvProxyImpl getEddInfo() {
            return this.eddInfo;
        }

        public final boolean getEddMandatory() {
            return this.eddMandatory;
        }
    }
}
