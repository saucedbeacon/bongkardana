package o;

import id.dana.nearbyme.merchantdetail.enums.MerchantMenu;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantMenuModel;", "", "menu", "Lid/dana/nearbyme/merchantdetail/enums/MerchantMenu;", "enabled", "", "(Lid/dana/nearbyme/merchantdetail/enums/MerchantMenu;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMenu", "()Lid/dana/nearbyme/merchantdetail/enums/MerchantMenu;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverOptionMenuPanelExtensionImpl {
    @NotNull
    public final MerchantMenu setMax;
    public boolean setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverOptionMenuPanelExtensionImpl)) {
            return false;
        }
        GriverOptionMenuPanelExtensionImpl griverOptionMenuPanelExtensionImpl = (GriverOptionMenuPanelExtensionImpl) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) griverOptionMenuPanelExtensionImpl.setMax) && this.setMin == griverOptionMenuPanelExtensionImpl.setMin;
    }

    public final int hashCode() {
        MerchantMenu merchantMenu = this.setMax;
        int hashCode = (merchantMenu != null ? merchantMenu.hashCode() : 0) * 31;
        boolean z = this.setMin;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantMenuModel(menu=");
        sb.append(this.setMax);
        sb.append(", enabled=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ GriverOptionMenuPanelExtensionImpl(MerchantMenu merchantMenu) {
        this(merchantMenu, true);
    }

    public GriverOptionMenuPanelExtensionImpl(@NotNull MerchantMenu merchantMenu, boolean z) {
        Intrinsics.checkNotNullParameter(merchantMenu, "menu");
        this.setMax = merchantMenu;
        this.setMin = z;
    }

    public final boolean getMin() {
        return this.setMin;
    }
}
