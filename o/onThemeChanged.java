package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/data/ipg/model/UserConfigContentIPG;", "", "userConsent", "", "(Z)V", "getUserConsent", "()Z", "setUserConsent", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onThemeChanged {
    @SerializedName("user_consent")
    private boolean userConsent;

    public onThemeChanged() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onThemeChanged copy$default(onThemeChanged onthemechanged, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onthemechanged.userConsent;
        }
        return onthemechanged.copy(z);
    }

    public final boolean component1() {
        return this.userConsent;
    }

    @NotNull
    public final onThemeChanged copy(boolean z) {
        return new onThemeChanged(z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof onThemeChanged) && this.userConsent == ((onThemeChanged) obj).userConsent;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.userConsent;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserConfigContentIPG(userConsent=");
        sb.append(this.userConsent);
        sb.append(")");
        return sb.toString();
    }

    public onThemeChanged(boolean z) {
        this.userConsent = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onThemeChanged(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getUserConsent() {
        return this.userConsent;
    }

    public final void setUserConsent(boolean z) {
        this.userConsent = z;
    }
}
