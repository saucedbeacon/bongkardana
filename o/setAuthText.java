package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVOpenAuthHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/social/repository/source/network/request/SocialSyncRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "userContactList", "", "Lid/dana/data/social/model/SocialUserContact;", "(Ljava/util/List;)V", "getUserContactList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAuthText extends BaseRpcRequest {
    @NotNull
    private final List<RVOpenAuthHelper.AnonymousClass4> userContactList;

    public static /* synthetic */ setAuthText copy$default(setAuthText setauthtext, List<RVOpenAuthHelper.AnonymousClass4> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = setauthtext.userContactList;
        }
        return setauthtext.copy(list);
    }

    @NotNull
    public final List<RVOpenAuthHelper.AnonymousClass4> component1() {
        return this.userContactList;
    }

    @NotNull
    public final setAuthText copy(@NotNull List<RVOpenAuthHelper.AnonymousClass4> list) {
        Intrinsics.checkNotNullParameter(list, "userContactList");
        return new setAuthText(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setAuthText) && Intrinsics.areEqual((Object) this.userContactList, (Object) ((setAuthText) obj).userContactList);
        }
        return true;
    }

    public final int hashCode() {
        List<RVOpenAuthHelper.AnonymousClass4> list = this.userContactList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialSyncRequest(userContactList=");
        sb.append(this.userContactList);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<RVOpenAuthHelper.AnonymousClass4> getUserContactList() {
        return this.userContactList;
    }

    public setAuthText(@NotNull List<RVOpenAuthHelper.AnonymousClass4> list) {
        Intrinsics.checkNotNullParameter(list, "userContactList");
        this.userContactList = list;
    }
}
