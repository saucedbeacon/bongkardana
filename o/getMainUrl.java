package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/data/user/source/network/request/UpdateUserInfoRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "userInfoBizScene", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserInfoBizScene", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getMainUrl extends BaseRpcRequest {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String USERNAME = "USERNAME";
    @NotNull
    private final String userInfoBizScene;
    @NotNull
    private final String value;

    public static /* synthetic */ getMainUrl copy$default(getMainUrl getmainurl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getmainurl.userInfoBizScene;
        }
        if ((i & 2) != 0) {
            str2 = getmainurl.value;
        }
        return getmainurl.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.userInfoBizScene;
    }

    @NotNull
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final getMainUrl copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "userInfoBizScene");
        Intrinsics.checkNotNullParameter(str2, "value");
        return new getMainUrl(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMainUrl)) {
            return false;
        }
        getMainUrl getmainurl = (getMainUrl) obj;
        return Intrinsics.areEqual((Object) this.userInfoBizScene, (Object) getmainurl.userInfoBizScene) && Intrinsics.areEqual((Object) this.value, (Object) getmainurl.value);
    }

    public final int hashCode() {
        String str = this.userInfoBizScene;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateUserInfoRequest(userInfoBizScene=");
        sb.append(this.userInfoBizScene);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getUserInfoBizScene() {
        return this.userInfoBizScene;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public getMainUrl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "userInfoBizScene");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.userInfoBizScene = str;
        this.value = str2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/user/source/network/request/UpdateUserInfoRequest$Companion;", "", "()V", "USERNAME", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
