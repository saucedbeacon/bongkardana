package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/twilio/repository/source/network/request/VerifyPushRequestChallengeRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "scene", "", "challengeInfo", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getChallengeInfo", "()Ljava/util/Map;", "getScene", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onInputClose extends BaseRpcRequest {
    @NotNull
    private final Map<String, String> challengeInfo;
    @NotNull
    private final String scene;

    public onInputClose() {
        this((String) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onInputClose copy$default(onInputClose oninputclose, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oninputclose.scene;
        }
        if ((i & 2) != 0) {
            map = oninputclose.challengeInfo;
        }
        return oninputclose.copy(str, map);
    }

    @NotNull
    public final String component1() {
        return this.scene;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.challengeInfo;
    }

    @NotNull
    public final onInputClose copy(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "scene");
        Intrinsics.checkNotNullParameter(map, "challengeInfo");
        return new onInputClose(str, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onInputClose)) {
            return false;
        }
        onInputClose oninputclose = (onInputClose) obj;
        return Intrinsics.areEqual((Object) this.scene, (Object) oninputclose.scene) && Intrinsics.areEqual((Object) this.challengeInfo, (Object) oninputclose.challengeInfo);
    }

    public final int hashCode() {
        String str = this.scene;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.challengeInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyPushRequestChallengeRequest(scene=");
        sb.append(this.scene);
        sb.append(", challengeInfo=");
        sb.append(this.challengeInfo);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getScene() {
        return this.scene;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onInputClose(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    @NotNull
    public final Map<String, String> getChallengeInfo() {
        return this.challengeInfo;
    }

    public onInputClose(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "scene");
        Intrinsics.checkNotNullParameter(map, "challengeInfo");
        this.scene = str;
        this.challengeInfo = map;
    }
}
