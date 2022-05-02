package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lid/dana/data/user/source/network/result/CheckUsernameResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "exists", "", "(Ljava/lang/Boolean;)V", "getExists", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lid/dana/data/user/source/network/result/CheckUsernameResult;", "equals", "other", "", "hashCode", "", "toString", "", "toUserProfileResponse", "Lid/dana/domain/user/UserProfileResponse;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSubPackages extends BaseRpcResult {
    @Nullable
    private final Boolean exists;

    public setSubPackages() {
        this((Boolean) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setSubPackages copy$default(setSubPackages setsubpackages, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = setsubpackages.exists;
        }
        return setsubpackages.copy(bool);
    }

    @Nullable
    public final Boolean component1() {
        return this.exists;
    }

    @NotNull
    public final setSubPackages copy(@Nullable Boolean bool) {
        return new setSubPackages(bool);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setSubPackages) && Intrinsics.areEqual((Object) this.exists, (Object) ((setSubPackages) obj).exists);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.exists;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckUsernameResult(exists=");
        sb.append(this.exists);
        sb.append(")");
        return sb.toString();
    }

    public setSubPackages(@Nullable Boolean bool) {
        this.exists = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setSubPackages(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }

    @Nullable
    public final Boolean getExists() {
        return this.exists;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.disconnectAllDevices toUserProfileResponse() {
        /*
            r4 = this;
            boolean r0 = r4.success
            java.lang.Boolean r1 = r4.exists
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0015
            boolean r3 = r1.booleanValue()
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "AE15112158172914"
            goto L_0x001a
        L_0x0015:
            java.lang.String r1 = r4.errorCode
            if (r1 != 0) goto L_0x001a
            r1 = r2
        L_0x001a:
            java.lang.String r3 = r4.errorMessage
            if (r3 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            o.disconnectAllDevices r3 = new o.disconnectAllDevices
            r3.<init>(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubPackages.toUserProfileResponse():o.disconnectAllDevices");
    }
}
