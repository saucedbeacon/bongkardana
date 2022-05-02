package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lid/dana/data/social/model/ActivityReactionsResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kind", "", "users", "", "Lid/dana/data/social/model/ActivityReactionsUserResult;", "maxId", "hasNext", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getHasNext", "()Z", "getKind", "()Ljava/lang/String;", "getMaxId", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class executeAuth extends BaseRpcResult {
    private final boolean hasNext;
    @NotNull
    private final String kind;
    @Nullable
    private final String maxId;
    @Nullable
    private List<getExtendDescriptionInSetting> users;

    public executeAuth() {
        this((String) null, (List) null, (String) null, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ executeAuth copy$default(executeAuth executeauth, String str, List<getExtendDescriptionInSetting> list, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = executeauth.kind;
        }
        if ((i & 2) != 0) {
            list = executeauth.users;
        }
        if ((i & 4) != 0) {
            str2 = executeauth.maxId;
        }
        if ((i & 8) != 0) {
            z = executeauth.hasNext;
        }
        return executeauth.copy(str, list, str2, z);
    }

    @NotNull
    public final String component1() {
        return this.kind;
    }

    @Nullable
    public final List<getExtendDescriptionInSetting> component2() {
        return this.users;
    }

    @Nullable
    public final String component3() {
        return this.maxId;
    }

    public final boolean component4() {
        return this.hasNext;
    }

    @NotNull
    public final executeAuth copy(@NotNull String str, @Nullable List<getExtendDescriptionInSetting> list, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "kind");
        return new executeAuth(str, list, str2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof executeAuth)) {
            return false;
        }
        executeAuth executeauth = (executeAuth) obj;
        return Intrinsics.areEqual((Object) this.kind, (Object) executeauth.kind) && Intrinsics.areEqual((Object) this.users, (Object) executeauth.users) && Intrinsics.areEqual((Object) this.maxId, (Object) executeauth.maxId) && this.hasNext == executeauth.hasNext;
    }

    public final int hashCode() {
        String str = this.kind;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<getExtendDescriptionInSetting> list = this.users;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.maxId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.hasNext;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityReactionsResult(kind=");
        sb.append(this.kind);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ executeAuth(String str, List list, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }

    @Nullable
    public final List<getExtendDescriptionInSetting> getUsers() {
        return this.users;
    }

    public final void setUsers(@Nullable List<getExtendDescriptionInSetting> list) {
        this.users = list;
    }

    @Nullable
    public final String getMaxId() {
        return this.maxId;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public executeAuth(@NotNull String str, @Nullable List<getExtendDescriptionInSetting> list, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "kind");
        this.kind = str;
        this.users = list;
        this.maxId = str2;
        this.hasNext = z;
    }
}
