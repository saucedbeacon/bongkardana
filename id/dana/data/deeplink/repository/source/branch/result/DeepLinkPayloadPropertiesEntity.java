package id.dana.data.deeplink.repository.source.branch.result;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lid/dana/data/deeplink/repository/source/branch/result/DeepLinkPayloadPropertiesEntity;", "", "data", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "getData", "()Lcom/google/gson/JsonObject;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DeepLinkPayloadPropertiesEntity {
    @Nullable
    @Keep
    private JsonObject data;

    public DeepLinkPayloadPropertiesEntity() {
        this((JsonObject) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DeepLinkPayloadPropertiesEntity copy$default(DeepLinkPayloadPropertiesEntity deepLinkPayloadPropertiesEntity, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = deepLinkPayloadPropertiesEntity.data;
        }
        return deepLinkPayloadPropertiesEntity.copy(jsonObject);
    }

    @Nullable
    public final JsonObject component1() {
        return this.data;
    }

    @NotNull
    public final DeepLinkPayloadPropertiesEntity copy(@Nullable JsonObject jsonObject) {
        return new DeepLinkPayloadPropertiesEntity(jsonObject);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof DeepLinkPayloadPropertiesEntity) && Intrinsics.areEqual((Object) this.data, (Object) ((DeepLinkPayloadPropertiesEntity) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        JsonObject jsonObject = this.data;
        if (jsonObject != null) {
            return jsonObject.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkPayloadPropertiesEntity(data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public DeepLinkPayloadPropertiesEntity(@Nullable JsonObject jsonObject) {
        this.data = jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeepLinkPayloadPropertiesEntity(JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jsonObject);
    }

    @Nullable
    public final JsonObject getData() {
        return this.data;
    }

    public final void setData(@Nullable JsonObject jsonObject) {
        this.data = jsonObject;
    }
}
