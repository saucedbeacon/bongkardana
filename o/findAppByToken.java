package o;

import com.alibaba.fastjson.annotation.JSONField;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lid/dana/data/config/model/SysFeature;", "", "bluetooth", "", "locationGPS", "nfc", "nfcHostCardEmulation", "telephony", "usbAccessory", "usbHost", "wifi", "wifiDirect", "(ZZZZZZZZZ)V", "getBluetooth", "()Z", "getLocationGPS", "getNfc", "getNfcHostCardEmulation", "getTelephony", "getUsbAccessory", "getUsbHost", "getWifi", "getWifiDirect", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class findAppByToken {
    private final boolean bluetooth;
    private final boolean locationGPS;
    private final boolean nfc;
    private final boolean nfcHostCardEmulation;
    private final boolean telephony;
    private final boolean usbAccessory;
    private final boolean usbHost;
    private final boolean wifi;
    private final boolean wifiDirect;

    public static /* synthetic */ findAppByToken copy$default(findAppByToken findappbytoken, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        findAppByToken findappbytoken2 = findappbytoken;
        int i2 = i;
        return findappbytoken.copy((i2 & 1) != 0 ? findappbytoken2.bluetooth : z, (i2 & 2) != 0 ? findappbytoken2.locationGPS : z2, (i2 & 4) != 0 ? findappbytoken2.nfc : z3, (i2 & 8) != 0 ? findappbytoken2.nfcHostCardEmulation : z4, (i2 & 16) != 0 ? findappbytoken2.telephony : z5, (i2 & 32) != 0 ? findappbytoken2.usbAccessory : z6, (i2 & 64) != 0 ? findappbytoken2.usbHost : z7, (i2 & 128) != 0 ? findappbytoken2.wifi : z8, (i2 & 256) != 0 ? findappbytoken2.wifiDirect : z9);
    }

    public final boolean component1() {
        return this.bluetooth;
    }

    public final boolean component2() {
        return this.locationGPS;
    }

    public final boolean component3() {
        return this.nfc;
    }

    public final boolean component4() {
        return this.nfcHostCardEmulation;
    }

    public final boolean component5() {
        return this.telephony;
    }

    public final boolean component6() {
        return this.usbAccessory;
    }

    public final boolean component7() {
        return this.usbHost;
    }

    public final boolean component8() {
        return this.wifi;
    }

    public final boolean component9() {
        return this.wifiDirect;
    }

    @NotNull
    public final findAppByToken copy(@JSONField(name = "bluetooth") boolean z, @JSONField(name = "locationGPS") boolean z2, @JSONField(name = "nfc") boolean z3, @JSONField(name = "nfcHostCardEmulation") boolean z4, @JSONField(name = "telephony") boolean z5, @JSONField(name = "usbAccessory") boolean z6, @JSONField(name = "usbHost") boolean z7, @JSONField(name = "wifi") boolean z8, @JSONField(name = "wifiDirect") boolean z9) {
        return new findAppByToken(z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findAppByToken)) {
            return false;
        }
        findAppByToken findappbytoken = (findAppByToken) obj;
        return this.bluetooth == findappbytoken.bluetooth && this.locationGPS == findappbytoken.locationGPS && this.nfc == findappbytoken.nfc && this.nfcHostCardEmulation == findappbytoken.nfcHostCardEmulation && this.telephony == findappbytoken.telephony && this.usbAccessory == findappbytoken.usbAccessory && this.usbHost == findappbytoken.usbHost && this.wifi == findappbytoken.wifi && this.wifiDirect == findappbytoken.wifiDirect;
    }

    public final int hashCode() {
        boolean z = this.bluetooth;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.locationGPS;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.nfc;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.nfcHostCardEmulation;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.telephony;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.usbAccessory;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.usbHost;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.wifi;
        if (z9) {
            z9 = true;
        }
        int i8 = (i7 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.wifiDirect;
        if (!z10) {
            z2 = z10;
        }
        return i8 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SysFeature(bluetooth=");
        sb.append(this.bluetooth);
        sb.append(", locationGPS=");
        sb.append(this.locationGPS);
        sb.append(", nfc=");
        sb.append(this.nfc);
        sb.append(", nfcHostCardEmulation=");
        sb.append(this.nfcHostCardEmulation);
        sb.append(", telephony=");
        sb.append(this.telephony);
        sb.append(", usbAccessory=");
        sb.append(this.usbAccessory);
        sb.append(", usbHost=");
        sb.append(this.usbHost);
        sb.append(", wifi=");
        sb.append(this.wifi);
        sb.append(", wifiDirect=");
        sb.append(this.wifiDirect);
        sb.append(")");
        return sb.toString();
    }

    public findAppByToken(@JSONField(name = "bluetooth") boolean z, @JSONField(name = "locationGPS") boolean z2, @JSONField(name = "nfc") boolean z3, @JSONField(name = "nfcHostCardEmulation") boolean z4, @JSONField(name = "telephony") boolean z5, @JSONField(name = "usbAccessory") boolean z6, @JSONField(name = "usbHost") boolean z7, @JSONField(name = "wifi") boolean z8, @JSONField(name = "wifiDirect") boolean z9) {
        this.bluetooth = z;
        this.locationGPS = z2;
        this.nfc = z3;
        this.nfcHostCardEmulation = z4;
        this.telephony = z5;
        this.usbAccessory = z6;
        this.usbHost = z7;
        this.wifi = z8;
        this.wifiDirect = z9;
    }

    public final boolean getBluetooth() {
        return this.bluetooth;
    }

    public final boolean getLocationGPS() {
        return this.locationGPS;
    }

    public final boolean getNfc() {
        return this.nfc;
    }

    public final boolean getNfcHostCardEmulation() {
        return this.nfcHostCardEmulation;
    }

    public final boolean getTelephony() {
        return this.telephony;
    }

    public final boolean getUsbAccessory() {
        return this.usbAccessory;
    }

    public final boolean getUsbHost() {
        return this.usbHost;
    }

    public final boolean getWifi() {
        return this.wifi;
    }

    public final boolean getWifiDirect() {
        return this.wifiDirect;
    }
}
