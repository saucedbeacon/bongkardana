package o;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lid/dana/domain/danah5/model/H5UserDataEntity;", "", "appId", "", "h5ShareData", "Landroid/os/Bundle;", "versionRequirements", "Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;", "(Ljava/lang/String;Landroid/os/Bundle;Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getH5ShareData", "()Landroid/os/Bundle;", "setH5ShareData", "(Landroid/os/Bundle;)V", "getVersionRequirements", "()Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;", "setVersionRequirements", "(Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onJsPrompt {
    @Nullable
    private String appId;
    @NotNull
    private Bundle h5ShareData;
    @NotNull
    private BaseGriverRpcRequest versionRequirements;

    public static /* synthetic */ onJsPrompt copy$default(onJsPrompt onjsprompt, String str, Bundle bundle, BaseGriverRpcRequest baseGriverRpcRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onjsprompt.appId;
        }
        if ((i & 2) != 0) {
            bundle = onjsprompt.h5ShareData;
        }
        if ((i & 4) != 0) {
            baseGriverRpcRequest = onjsprompt.versionRequirements;
        }
        return onjsprompt.copy(str, bundle, baseGriverRpcRequest);
    }

    @Nullable
    public final String component1() {
        return this.appId;
    }

    @NotNull
    public final Bundle component2() {
        return this.h5ShareData;
    }

    @NotNull
    public final BaseGriverRpcRequest component3() {
        return this.versionRequirements;
    }

    @NotNull
    public final onJsPrompt copy(@Nullable String str, @NotNull Bundle bundle, @NotNull BaseGriverRpcRequest baseGriverRpcRequest) {
        Intrinsics.checkNotNullParameter(bundle, "h5ShareData");
        Intrinsics.checkNotNullParameter(baseGriverRpcRequest, "versionRequirements");
        return new onJsPrompt(str, bundle, baseGriverRpcRequest);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onJsPrompt)) {
            return false;
        }
        onJsPrompt onjsprompt = (onJsPrompt) obj;
        return Intrinsics.areEqual((Object) this.appId, (Object) onjsprompt.appId) && Intrinsics.areEqual((Object) this.h5ShareData, (Object) onjsprompt.h5ShareData) && Intrinsics.areEqual((Object) this.versionRequirements, (Object) onjsprompt.versionRequirements);
    }

    public final int hashCode() {
        String str = this.appId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bundle bundle = this.h5ShareData;
        int hashCode2 = (hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31;
        BaseGriverRpcRequest baseGriverRpcRequest = this.versionRequirements;
        if (baseGriverRpcRequest != null) {
            i = baseGriverRpcRequest.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("H5UserDataEntity(appId=");
        sb.append(this.appId);
        sb.append(", h5ShareData=");
        sb.append(this.h5ShareData);
        sb.append(", versionRequirements=");
        sb.append(this.versionRequirements);
        sb.append(")");
        return sb.toString();
    }

    public onJsPrompt(@Nullable String str, @NotNull Bundle bundle, @NotNull BaseGriverRpcRequest baseGriverRpcRequest) {
        Intrinsics.checkNotNullParameter(bundle, "h5ShareData");
        Intrinsics.checkNotNullParameter(baseGriverRpcRequest, "versionRequirements");
        this.appId = str;
        this.h5ShareData = bundle;
        this.versionRequirements = baseGriverRpcRequest;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    @NotNull
    public final Bundle getH5ShareData() {
        return this.h5ShareData;
    }

    public final void setH5ShareData(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.h5ShareData = bundle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ onJsPrompt(java.lang.String r15, android.os.Bundle r16, o.BaseGriverRpcRequest r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r14 = this;
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0024
            o.BaseGriverRpcRequest r0 = new o.BaseGriverRpcRequest
            o.ErrorConstants r7 = new o.ErrorConstants
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>((int) r2, (int) r3, (int) r4, (int) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6)
            o.ErrorConstants r1 = new o.ErrorConstants
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r1
            r8.<init>((int) r9, (int) r10, (int) r11, (int) r12, (kotlin.jvm.internal.DefaultConstructorMarker) r13)
            r0.<init>(r7, r1)
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x002a
        L_0x0024:
            r1 = r14
            r2 = r15
            r3 = r16
            r0 = r17
        L_0x002a:
            r14.<init>(r15, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onJsPrompt.<init>(java.lang.String, android.os.Bundle, o.BaseGriverRpcRequest, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final BaseGriverRpcRequest getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setVersionRequirements(@NotNull BaseGriverRpcRequest baseGriverRpcRequest) {
        Intrinsics.checkNotNullParameter(baseGriverRpcRequest, "<set-?>");
        this.versionRequirements = baseGriverRpcRequest;
    }
}
