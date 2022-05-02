package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/twilio/repository/source/network/result/VerifyPushDerollResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "securityId", "", "verificationMethodInfos", "", "(Ljava/lang/String;Ljava/util/List;)V", "getSecurityId", "()Ljava/lang/String;", "getVerificationMethodInfos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ResourcePackage extends BaseRpcResult {
    @Nullable
    private final String securityId;
    @Nullable
    private final List<String> verificationMethodInfos;

    public ResourcePackage() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ResourcePackage copy$default(ResourcePackage resourcePackage, String str, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourcePackage.securityId;
        }
        if ((i & 2) != 0) {
            list = resourcePackage.verificationMethodInfos;
        }
        return resourcePackage.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.securityId;
    }

    @Nullable
    public final List<String> component2() {
        return this.verificationMethodInfos;
    }

    @NotNull
    public final ResourcePackage copy(@Nullable String str, @Nullable List<String> list) {
        return new ResourcePackage(str, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourcePackage)) {
            return false;
        }
        ResourcePackage resourcePackage = (ResourcePackage) obj;
        return Intrinsics.areEqual((Object) this.securityId, (Object) resourcePackage.securityId) && Intrinsics.areEqual((Object) this.verificationMethodInfos, (Object) resourcePackage.verificationMethodInfos);
    }

    public final int hashCode() {
        String str = this.securityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.verificationMethodInfos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyPushDerollResult(securityId=");
        sb.append(this.securityId);
        sb.append(", verificationMethodInfos=");
        sb.append(this.verificationMethodInfos);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourcePackage(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<String> getVerificationMethodInfos() {
        return this.verificationMethodInfos;
    }

    public ResourcePackage(@Nullable String str, @Nullable List<String> list) {
        this.securityId = str;
        this.verificationMethodInfos = list;
    }
}
