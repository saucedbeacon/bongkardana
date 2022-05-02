package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/featureconfig/model/DexguardIntegrityCheckConfig;", "", "dexguardRootCheckConfig", "", "dexguardHookCheckConfig", "dexguardTamperCheckConfig", "(ZZZ)V", "getDexguardHookCheckConfig", "()Z", "getDexguardRootCheckConfig", "getDexguardTamperCheckConfig", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setWebChromeClient {
    private final boolean dexguardHookCheckConfig;
    private final boolean dexguardRootCheckConfig;
    private final boolean dexguardTamperCheckConfig;

    public setWebChromeClient() {
        this(false, false, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setWebChromeClient copy$default(setWebChromeClient setwebchromeclient, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setwebchromeclient.dexguardRootCheckConfig;
        }
        if ((i & 2) != 0) {
            z2 = setwebchromeclient.dexguardHookCheckConfig;
        }
        if ((i & 4) != 0) {
            z3 = setwebchromeclient.dexguardTamperCheckConfig;
        }
        return setwebchromeclient.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.dexguardRootCheckConfig;
    }

    public final boolean component2() {
        return this.dexguardHookCheckConfig;
    }

    public final boolean component3() {
        return this.dexguardTamperCheckConfig;
    }

    @NotNull
    public final setWebChromeClient copy(boolean z, boolean z2, boolean z3) {
        return new setWebChromeClient(z, z2, z3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setWebChromeClient)) {
            return false;
        }
        setWebChromeClient setwebchromeclient = (setWebChromeClient) obj;
        return this.dexguardRootCheckConfig == setwebchromeclient.dexguardRootCheckConfig && this.dexguardHookCheckConfig == setwebchromeclient.dexguardHookCheckConfig && this.dexguardTamperCheckConfig == setwebchromeclient.dexguardTamperCheckConfig;
    }

    public final int hashCode() {
        boolean z = this.dexguardRootCheckConfig;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.dexguardHookCheckConfig;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.dexguardTamperCheckConfig;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DexguardIntegrityCheckConfig(dexguardRootCheckConfig=");
        sb.append(this.dexguardRootCheckConfig);
        sb.append(", dexguardHookCheckConfig=");
        sb.append(this.dexguardHookCheckConfig);
        sb.append(", dexguardTamperCheckConfig=");
        sb.append(this.dexguardTamperCheckConfig);
        sb.append(")");
        return sb.toString();
    }

    public setWebChromeClient(boolean z, boolean z2, boolean z3) {
        this.dexguardRootCheckConfig = z;
        this.dexguardHookCheckConfig = z2;
        this.dexguardTamperCheckConfig = z3;
    }

    public final boolean getDexguardRootCheckConfig() {
        return this.dexguardRootCheckConfig;
    }

    public final boolean getDexguardHookCheckConfig() {
        return this.dexguardHookCheckConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setWebChromeClient(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean getDexguardTamperCheckConfig() {
        return this.dexguardTamperCheckConfig;
    }
}
