package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/twilio/model/TwilioChallenge;", "", "scene", "", "challengeInfo", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getChallengeInfo", "()Ljava/util/Map;", "getScene", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BLEManager {
    @NotNull
    private final Map<String, String> challengeInfo;
    @NotNull
    private final String scene;

    public BLEManager() {
        this((String) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BLEManager copy$default(BLEManager bLEManager, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bLEManager.scene;
        }
        if ((i & 2) != 0) {
            map = bLEManager.challengeInfo;
        }
        return bLEManager.copy(str, map);
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
    public final BLEManager copy(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "scene");
        Intrinsics.checkNotNullParameter(map, "challengeInfo");
        return new BLEManager(str, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BLEManager)) {
            return false;
        }
        BLEManager bLEManager = (BLEManager) obj;
        return Intrinsics.areEqual((Object) this.scene, (Object) bLEManager.scene) && Intrinsics.areEqual((Object) this.challengeInfo, (Object) bLEManager.challengeInfo);
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
        StringBuilder sb = new StringBuilder("TwilioChallenge(scene=");
        sb.append(this.scene);
        sb.append(", challengeInfo=");
        sb.append(this.challengeInfo);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lid/dana/domain/useragreement/model/AgreementInfo;", "", "title", "", "description", "extendInfo", "", "agreementKey", "needUserAgreement", "", "contentValue", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAgreementKey", "()Ljava/lang/String;", "getContentType", "getContentValue", "getDescription", "getExtendInfo", "()Ljava/util/Map;", "getNeedUserAgreement", "()Z", "getTitle", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ScanHandler {
        @Nullable
        private final String agreementKey;
        @Nullable
        private final String contentType;
        @Nullable
        private final String contentValue;
        @Nullable
        private final String description;
        @Nullable
        private final Map<String, String> extendInfo;
        private final boolean needUserAgreement;
        @Nullable
        private final String title;

        public ScanHandler(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5) {
            this.title = str;
            this.description = str2;
            this.extendInfo = map;
            this.agreementKey = str3;
            this.needUserAgreement = z;
            this.contentValue = str4;
            this.contentType = str5;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        @Nullable
        public final String getAgreementKey() {
            return this.agreementKey;
        }

        public final boolean getNeedUserAgreement() {
            return this.needUserAgreement;
        }

        @Nullable
        public final String getContentValue() {
            return this.contentValue;
        }

        @Nullable
        public final String getContentType() {
            return this.contentType;
        }
    }

    public BLEManager(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "scene");
        Intrinsics.checkNotNullParameter(map, "challengeInfo");
        this.scene = str;
        this.challengeInfo = map;
    }

    @NotNull
    public final String getScene() {
        return this.scene;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BLEManager(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    @NotNull
    public final Map<String, String> getChallengeInfo() {
        return this.challengeInfo;
    }
}
