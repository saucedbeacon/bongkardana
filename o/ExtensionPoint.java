package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ExtensionPoint implements getAdapterPosition<as> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/request/TransferGenerateQrRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "qris", "", "amount", "", "comment", "qrCount", "", "(ZLjava/lang/String;Ljava/lang/String;I)V", "getAmount", "()Ljava/lang/String;", "getComment", "getQrCount", "()I", "getQris", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class ProxyGenerator extends BaseRpcRequest {
        @NotNull
        private final String amount;
        @NotNull
        private final String comment;
        private final int qrCount;
        private final boolean qris;

        public static /* synthetic */ ProxyGenerator copy$default(ProxyGenerator proxyGenerator, boolean z, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = proxyGenerator.qris;
            }
            if ((i2 & 2) != 0) {
                str = proxyGenerator.amount;
            }
            if ((i2 & 4) != 0) {
                str2 = proxyGenerator.comment;
            }
            if ((i2 & 8) != 0) {
                i = proxyGenerator.qrCount;
            }
            return proxyGenerator.copy(z, str, str2, i);
        }

        public final boolean component1() {
            return this.qris;
        }

        @NotNull
        public final String component2() {
            return this.amount;
        }

        @NotNull
        public final String component3() {
            return this.comment;
        }

        public final int component4() {
            return this.qrCount;
        }

        @NotNull
        public final ProxyGenerator copy(boolean z, @NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, "comment");
            return new ProxyGenerator(z, str, str2, i);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProxyGenerator)) {
                return false;
            }
            ProxyGenerator proxyGenerator = (ProxyGenerator) obj;
            return this.qris == proxyGenerator.qris && Intrinsics.areEqual((Object) this.amount, (Object) proxyGenerator.amount) && Intrinsics.areEqual((Object) this.comment, (Object) proxyGenerator.comment) && this.qrCount == proxyGenerator.qrCount;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("TransferGenerateQrRequest(qris=");
            sb.append(this.qris);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", comment=");
            sb.append(this.comment);
            sb.append(", qrCount=");
            sb.append(this.qrCount);
            sb.append(")");
            return sb.toString();
        }

        public final boolean getQris() {
            return this.qris;
        }

        @NotNull
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        public final int getQrCount() {
            return this.qrCount;
        }

        public ProxyGenerator(boolean z, @NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, "comment");
            this.qris = z;
            this.amount = str;
            this.comment = str2;
            this.qrCount = i;
        }

        public final int hashCode() {
            boolean z = this.qris;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.amount;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.comment;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((hashCode + i2) * 31) + Integer.valueOf(this.qrCount).hashCode();
        }
    }

    public ExtensionPoint(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2) {
        this.contextProvider = bVar;
        this.amcsManagerProvider = bVar2;
    }

    public final as get() {
        return newInstance(this.contextProvider.get(), this.amcsManagerProvider.get());
    }

    public static ExtensionPoint create(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2) {
        return new ExtensionPoint(bVar, bVar2);
    }

    public static as newInstance(Context context, AppPausePoint appPausePoint) {
        return new as(context, appPausePoint);
    }
}
