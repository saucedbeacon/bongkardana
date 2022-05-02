package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/twilio/repository/source/TwilioEnrollmentEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/twilio/repository/source/TwilioEntityData;", "networkTwilioEntityData", "Lid/dana/data/twilio/repository/source/network/NetworkTwilioEntityData;", "(Lid/dana/data/twilio/repository/source/network/NetworkTwilioEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NetworkStream extends uncheckItems<getRealStream> {
    public final available getMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/twilio/repository/source/network/request/VerifyPushBindEnrollmentRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "factorId", "", "identity", "(Ljava/lang/String;Ljava/lang/String;)V", "getFactorId", "()Ljava/lang/String;", "getIdentity", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Listener extends BaseRpcRequest {
        @Nullable
        private final String factorId;
        @Nullable
        private final String identity;

        public Listener() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Listener copy$default(Listener listener, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = listener.factorId;
            }
            if ((i & 2) != 0) {
                str2 = listener.identity;
            }
            return listener.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.factorId;
        }

        @Nullable
        public final String component2() {
            return this.identity;
        }

        @NotNull
        public final Listener copy(@Nullable String str, @Nullable String str2) {
            return new Listener(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Listener)) {
                return false;
            }
            Listener listener = (Listener) obj;
            return Intrinsics.areEqual((Object) this.factorId, (Object) listener.factorId) && Intrinsics.areEqual((Object) this.identity, (Object) listener.identity);
        }

        public final int hashCode() {
            String str = this.factorId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.identity;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("VerifyPushBindEnrollmentRequest(factorId=");
            sb.append(this.factorId);
            sb.append(", identity=");
            sb.append(this.identity);
            sb.append(")");
            return sb.toString();
        }

        @Nullable
        public final String getFactorId() {
            return this.factorId;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Listener(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        @Nullable
        public final String getIdentity() {
            return this.identity;
        }

        public Listener(@Nullable String str, @Nullable String str2) {
            this.factorId = str;
            this.identity = str2;
        }
    }

    @Inject
    public NetworkStream(@NotNull available available) {
        Intrinsics.checkNotNullParameter(available, "networkTwilioEntityData");
        this.getMax = available;
    }

    public final /* bridge */ /* synthetic */ Object createData(String str) {
        return this.getMax;
    }
}
