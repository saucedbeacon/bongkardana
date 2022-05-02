package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/featureconfig/model/GlobalSearchWidget;", "", "orderId", "", "name", "", "(ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOrderId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class createWebMessageChannel {
    @NotNull
    private final String name;
    private final int orderId;

    public static /* synthetic */ createWebMessageChannel copy$default(createWebMessageChannel createwebmessagechannel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createwebmessagechannel.orderId;
        }
        if ((i2 & 2) != 0) {
            str = createwebmessagechannel.name;
        }
        return createwebmessagechannel.copy(i, str);
    }

    public final int component1() {
        return this.orderId;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final createWebMessageChannel copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new createWebMessageChannel(i, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createWebMessageChannel)) {
            return false;
        }
        createWebMessageChannel createwebmessagechannel = (createWebMessageChannel) obj;
        return this.orderId == createwebmessagechannel.orderId && Intrinsics.areEqual((Object) this.name, (Object) createwebmessagechannel.name);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalSearchWidget(orderId=");
        sb.append(this.orderId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }

    public createWebMessageChannel(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.orderId = i;
        this.name = str;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.orderId).hashCode() * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
