package id.dana.lib.gcontainer.app.bridge.deviceinfo;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\nPQRSTUVWXYB\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0012\b\u0003\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0007¢\u0006\u0002\u0010\u0017J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0012\b\u0003\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0007HÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001R$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001b¨\u0006Z"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo;", "", "ipAddress", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$IPAddress;", "sysFeature", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$SysFeature;", "bluetooth", "", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Bluetooth;", "cpu", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Cpu;", "device", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device;", "display", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Display;", "externalStorage", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$ExternalStorage;", "gps", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Gps;", "memory", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Memory;", "wifi", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Wifi;", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$IPAddress;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$SysFeature;Ljava/util/List;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Cpu;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Display;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$ExternalStorage;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Gps;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Memory;Ljava/util/List;)V", "getBluetooth", "()Ljava/util/List;", "setBluetooth", "(Ljava/util/List;)V", "getCpu", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Cpu;", "setCpu", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Cpu;)V", "getDevice", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device;", "setDevice", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device;)V", "getDisplay", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Display;", "setDisplay", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Display;)V", "getExternalStorage", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$ExternalStorage;", "setExternalStorage", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$ExternalStorage;)V", "getGps", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Gps;", "setGps", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Gps;)V", "getIpAddress", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$IPAddress;", "setIpAddress", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$IPAddress;)V", "getMemory", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Memory;", "setMemory", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Memory;)V", "getSysFeature", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$SysFeature;", "setSysFeature", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$SysFeature;)V", "getWifi", "setWifi", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Bluetooth", "Cpu", "Device", "Display", "ExternalStorage", "Gps", "IPAddress", "Memory", "SysFeature", "Wifi", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class DeviceInfo {
    @Nullable
    private List<Bluetooth> bluetooth;
    @Nullable
    private Cpu cpu;
    @Nullable
    private Device device;
    @Nullable
    private Display display;
    @Nullable
    private ExternalStorage externalStorage;
    @Nullable
    private Gps gps;
    @JSONField(name = "IP")
    @Nullable
    private IPAddress ipAddress;
    @Nullable
    private Memory memory;
    @Nullable
    private SysFeature sysFeature;
    @Nullable
    private List<Wifi> wifi;

    @JSONCreator
    public DeviceInfo() {
        this((IPAddress) null, (SysFeature) null, (List) null, (Cpu) null, (Device) null, (Display) null, (ExternalStorage) null, (Gps) null, (Memory) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, IPAddress iPAddress, SysFeature sysFeature2, List list, Cpu cpu2, Device device2, Display display2, ExternalStorage externalStorage2, Gps gps2, Memory memory2, List list2, int i, Object obj) {
        DeviceInfo deviceInfo2 = deviceInfo;
        int i2 = i;
        return deviceInfo.copy((i2 & 1) != 0 ? deviceInfo2.ipAddress : iPAddress, (i2 & 2) != 0 ? deviceInfo2.sysFeature : sysFeature2, (i2 & 4) != 0 ? deviceInfo2.bluetooth : list, (i2 & 8) != 0 ? deviceInfo2.cpu : cpu2, (i2 & 16) != 0 ? deviceInfo2.device : device2, (i2 & 32) != 0 ? deviceInfo2.display : display2, (i2 & 64) != 0 ? deviceInfo2.externalStorage : externalStorage2, (i2 & 128) != 0 ? deviceInfo2.gps : gps2, (i2 & 256) != 0 ? deviceInfo2.memory : memory2, (i2 & 512) != 0 ? deviceInfo2.wifi : list2);
    }

    @Nullable
    public final IPAddress component1() {
        return this.ipAddress;
    }

    @Nullable
    public final List<Wifi> component10() {
        return this.wifi;
    }

    @Nullable
    public final SysFeature component2() {
        return this.sysFeature;
    }

    @Nullable
    public final List<Bluetooth> component3() {
        return this.bluetooth;
    }

    @Nullable
    public final Cpu component4() {
        return this.cpu;
    }

    @Nullable
    public final Device component5() {
        return this.device;
    }

    @Nullable
    public final Display component6() {
        return this.display;
    }

    @Nullable
    public final ExternalStorage component7() {
        return this.externalStorage;
    }

    @Nullable
    public final Gps component8() {
        return this.gps;
    }

    @Nullable
    public final Memory component9() {
        return this.memory;
    }

    @NotNull
    public final DeviceInfo copy(@Nullable IPAddress iPAddress, @JSONField(name = "SysFeature") @Nullable SysFeature sysFeature2, @JSONField(name = "bluetooth") @Nullable List<Bluetooth> list, @JSONField(name = "cpu") @Nullable Cpu cpu2, @JSONField(name = "device") @Nullable Device device2, @JSONField(name = "display") @Nullable Display display2, @JSONField(name = "externalStorage") @Nullable ExternalStorage externalStorage2, @JSONField(name = "gps") @Nullable Gps gps2, @JSONField(name = "memory") @Nullable Memory memory2, @JSONField(name = "wifi") @Nullable List<Wifi> list2) {
        return new DeviceInfo(iPAddress, sysFeature2, list, cpu2, device2, display2, externalStorage2, gps2, memory2, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.areEqual((Object) this.ipAddress, (Object) deviceInfo.ipAddress) && Intrinsics.areEqual((Object) this.sysFeature, (Object) deviceInfo.sysFeature) && Intrinsics.areEqual((Object) this.bluetooth, (Object) deviceInfo.bluetooth) && Intrinsics.areEqual((Object) this.cpu, (Object) deviceInfo.cpu) && Intrinsics.areEqual((Object) this.device, (Object) deviceInfo.device) && Intrinsics.areEqual((Object) this.display, (Object) deviceInfo.display) && Intrinsics.areEqual((Object) this.externalStorage, (Object) deviceInfo.externalStorage) && Intrinsics.areEqual((Object) this.gps, (Object) deviceInfo.gps) && Intrinsics.areEqual((Object) this.memory, (Object) deviceInfo.memory) && Intrinsics.areEqual((Object) this.wifi, (Object) deviceInfo.wifi);
    }

    public final int hashCode() {
        IPAddress iPAddress = this.ipAddress;
        int i = 0;
        int hashCode = (iPAddress != null ? iPAddress.hashCode() : 0) * 31;
        SysFeature sysFeature2 = this.sysFeature;
        int hashCode2 = (hashCode + (sysFeature2 != null ? sysFeature2.hashCode() : 0)) * 31;
        List<Bluetooth> list = this.bluetooth;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Cpu cpu2 = this.cpu;
        int hashCode4 = (hashCode3 + (cpu2 != null ? cpu2.hashCode() : 0)) * 31;
        Device device2 = this.device;
        int hashCode5 = (hashCode4 + (device2 != null ? device2.hashCode() : 0)) * 31;
        Display display2 = this.display;
        int hashCode6 = (hashCode5 + (display2 != null ? display2.hashCode() : 0)) * 31;
        ExternalStorage externalStorage2 = this.externalStorage;
        int hashCode7 = (hashCode6 + (externalStorage2 != null ? externalStorage2.hashCode() : 0)) * 31;
        Gps gps2 = this.gps;
        int hashCode8 = (hashCode7 + (gps2 != null ? gps2.hashCode() : 0)) * 31;
        Memory memory2 = this.memory;
        int hashCode9 = (hashCode8 + (memory2 != null ? memory2.hashCode() : 0)) * 31;
        List<Wifi> list2 = this.wifi;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(ipAddress=");
        sb.append(this.ipAddress);
        sb.append(", sysFeature=");
        sb.append(this.sysFeature);
        sb.append(", bluetooth=");
        sb.append(this.bluetooth);
        sb.append(", cpu=");
        sb.append(this.cpu);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", display=");
        sb.append(this.display);
        sb.append(", externalStorage=");
        sb.append(this.externalStorage);
        sb.append(", gps=");
        sb.append(this.gps);
        sb.append(", memory=");
        sb.append(this.memory);
        sb.append(", wifi=");
        sb.append(this.wifi);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public DeviceInfo(@Nullable IPAddress iPAddress, @JSONField(name = "SysFeature") @Nullable SysFeature sysFeature2, @JSONField(name = "bluetooth") @Nullable List<Bluetooth> list, @JSONField(name = "cpu") @Nullable Cpu cpu2, @JSONField(name = "device") @Nullable Device device2, @JSONField(name = "display") @Nullable Display display2, @JSONField(name = "externalStorage") @Nullable ExternalStorage externalStorage2, @JSONField(name = "gps") @Nullable Gps gps2, @JSONField(name = "memory") @Nullable Memory memory2, @JSONField(name = "wifi") @Nullable List<Wifi> list2) {
        this.ipAddress = iPAddress;
        this.sysFeature = sysFeature2;
        this.bluetooth = list;
        this.cpu = cpu2;
        this.device = device2;
        this.display = display2;
        this.externalStorage = externalStorage2;
        this.gps = gps2;
        this.memory = memory2;
        this.wifi = list2;
    }

    @Nullable
    public final IPAddress getIpAddress() {
        return this.ipAddress;
    }

    public final void setIpAddress(@Nullable IPAddress iPAddress) {
        this.ipAddress = iPAddress;
    }

    @Nullable
    public final SysFeature getSysFeature() {
        return this.sysFeature;
    }

    public final void setSysFeature(@Nullable SysFeature sysFeature2) {
        this.sysFeature = sysFeature2;
    }

    @Nullable
    public final List<Bluetooth> getBluetooth() {
        return this.bluetooth;
    }

    public final void setBluetooth(@Nullable List<Bluetooth> list) {
        this.bluetooth = list;
    }

    @Nullable
    public final Cpu getCpu() {
        return this.cpu;
    }

    public final void setCpu(@Nullable Cpu cpu2) {
        this.cpu = cpu2;
    }

    @Nullable
    public final Device getDevice() {
        return this.device;
    }

    public final void setDevice(@Nullable Device device2) {
        this.device = device2;
    }

    @Nullable
    public final Display getDisplay() {
        return this.display;
    }

    public final void setDisplay(@Nullable Display display2) {
        this.display = display2;
    }

    @Nullable
    public final ExternalStorage getExternalStorage() {
        return this.externalStorage;
    }

    public final void setExternalStorage(@Nullable ExternalStorage externalStorage2) {
        this.externalStorage = externalStorage2;
    }

    @Nullable
    public final Gps getGps() {
        return this.gps;
    }

    public final void setGps(@Nullable Gps gps2) {
        this.gps = gps2;
    }

    @Nullable
    public final Memory getMemory() {
        return this.memory;
    }

    public final void setMemory(@Nullable Memory memory2) {
        this.memory = memory2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DeviceInfo(id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.IPAddress r12, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.SysFeature r13, java.util.List r14, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Cpu r15, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Device r16, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Display r17, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.ExternalStorage r18, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Gps r19, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Memory r20, java.util.List r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.<init>(id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$IPAddress, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$SysFeature, java.util.List, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Cpu, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Device, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Display, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$ExternalStorage, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Gps, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Memory, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final List<Wifi> getWifi() {
        return this.wifi;
    }

    public final void setWifi(@Nullable List<Wifi> list) {
        this.wifi = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J?\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Gps;", "", "latitude", "", "longitude", "error", "", "time", "", "cityName", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;)V", "getCityName", "()Ljava/lang/String;", "setCityName", "(Ljava/lang/String;)V", "getError", "()I", "setError", "(I)V", "getLatitude", "setLatitude", "getLongitude", "setLongitude", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Gps {
        @NotNull
        private String cityName;
        private int error;
        @Nullable
        private String latitude;
        @Nullable
        private String longitude;
        private long time;

        @JSONCreator
        public Gps() {
            this((String) null, (String) null, 0, 0, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Gps copy$default(Gps gps, String str, String str2, int i, long j, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = gps.latitude;
            }
            if ((i2 & 2) != 0) {
                str2 = gps.longitude;
            }
            String str4 = str2;
            if ((i2 & 4) != 0) {
                i = gps.error;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                j = gps.time;
            }
            long j2 = j;
            if ((i2 & 16) != 0) {
                str3 = gps.cityName;
            }
            return gps.copy(str, str4, i3, j2, str3);
        }

        @Nullable
        public final String component1() {
            return this.latitude;
        }

        @Nullable
        public final String component2() {
            return this.longitude;
        }

        public final int component3() {
            return this.error;
        }

        public final long component4() {
            return this.time;
        }

        @NotNull
        public final String component5() {
            return this.cityName;
        }

        @NotNull
        public final Gps copy(@JSONField(name = "latitude") @Nullable String str, @JSONField(name = "longitude") @Nullable String str2, @JSONField(name = "error") int i, @JSONField(name = "time") long j, @JSONField(name = "cityName") @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str3, Constants.KEY_CITY_NAME);
            return new Gps(str, str2, i, j, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gps)) {
                return false;
            }
            Gps gps = (Gps) obj;
            return Intrinsics.areEqual((Object) this.latitude, (Object) gps.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) gps.longitude) && this.error == gps.error && this.time == gps.time && Intrinsics.areEqual((Object) this.cityName, (Object) gps.cityName);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Gps(latitude=");
            sb.append(this.latitude);
            sb.append(", longitude=");
            sb.append(this.longitude);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", time=");
            sb.append(this.time);
            sb.append(", cityName=");
            sb.append(this.cityName);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Gps(@JSONField(name = "latitude") @Nullable String str, @JSONField(name = "longitude") @Nullable String str2, @JSONField(name = "error") int i, @JSONField(name = "time") long j, @JSONField(name = "cityName") @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str3, Constants.KEY_CITY_NAME);
            this.latitude = str;
            this.longitude = str2;
            this.error = i;
            this.time = j;
            this.cityName = str3;
        }

        @Nullable
        public final String getLatitude() {
            return this.latitude;
        }

        public final void setLatitude(@Nullable String str) {
            this.latitude = str;
        }

        @Nullable
        public final String getLongitude() {
            return this.longitude;
        }

        public final void setLongitude(@Nullable String str) {
            this.longitude = str;
        }

        public final int getError() {
            return this.error;
        }

        public final void setError(int i) {
            this.error = i;
        }

        public final long getTime() {
            return this.time;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Gps(java.lang.String r5, java.lang.String r6, int r7, long r8, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = r6
            L_0x000e:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0015
                r7 = 0
                r1 = 0
                goto L_0x0016
            L_0x0015:
                r1 = r7
            L_0x0016:
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001c
                r8 = 0
            L_0x001c:
                r2 = r8
                r5 = r11 & 16
                if (r5 == 0) goto L_0x0023
                java.lang.String r10 = ""
            L_0x0023:
                r11 = r10
                r5 = r4
                r6 = r12
                r7 = r0
                r8 = r1
                r9 = r2
                r5.<init>(r6, r7, r8, r9, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Gps.<init>(java.lang.String, java.lang.String, int, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @NotNull
        public final String getCityName() {
            return this.cityName;
        }

        public final void setCityName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.cityName = str;
        }

        public final int hashCode() {
            String str = this.latitude;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.longitude;
            int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.valueOf(this.error).hashCode()) * 31) + Long.valueOf(this.time).hashCode()) * 31;
            String str3 = this.cityName;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\b\b\u0018\u00002\u00020\u0001:\u0001fBý\u0001\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0012HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0017HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jÿ\u0001\u0010a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010b\u001a\u00020\u00122\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\u0017HÖ\u0001J\t\u0010e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010:\"\u0004\b;\u0010<R\u001e\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010:\"\u0004\b=\u0010<R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001d\"\u0004\bK\u0010\u001f¨\u0006g"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device;", "", "androidId", "", "appVersion", "blueMac", "buildBoard", "buildBootloader", "buildBrand", "buildDevice", "buildManufacturer", "buildModel", "buildProduct", "buildSerial", "deviceId", "fingerPrint", "imei", "isEmulator", "", "isRooted", "networkType", "osVersion", "osVersionInt", "", "timeLocation", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device$TimeLocation;", "utdidAdvertisementId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device$TimeLocation;Ljava/lang/String;)V", "getAndroidId", "()Ljava/lang/String;", "setAndroidId", "(Ljava/lang/String;)V", "getAppVersion", "setAppVersion", "getBlueMac", "setBlueMac", "getBuildBoard", "setBuildBoard", "getBuildBootloader", "setBuildBootloader", "getBuildBrand", "setBuildBrand", "getBuildDevice", "setBuildDevice", "getBuildManufacturer", "setBuildManufacturer", "getBuildModel", "setBuildModel", "getBuildProduct", "setBuildProduct", "getBuildSerial", "setBuildSerial", "getDeviceId", "setDeviceId", "getFingerPrint", "setFingerPrint", "getImei", "setImei", "()Z", "setEmulator", "(Z)V", "setRooted", "getNetworkType", "setNetworkType", "getOsVersion", "setOsVersion", "getOsVersionInt", "()I", "setOsVersionInt", "(I)V", "getTimeLocation", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device$TimeLocation;", "setTimeLocation", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device$TimeLocation;)V", "getUtdidAdvertisementId", "setUtdidAdvertisementId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "TimeLocation", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Device {
        @Nullable
        private String androidId;
        @Nullable
        private String appVersion;
        @Nullable
        private String blueMac;
        @Nullable
        private String buildBoard;
        @Nullable
        private String buildBootloader;
        @Nullable
        private String buildBrand;
        @Nullable
        private String buildDevice;
        @Nullable
        private String buildManufacturer;
        @Nullable
        private String buildModel;
        @Nullable
        private String buildProduct;
        @Nullable
        private String buildSerial;
        @Nullable
        private String deviceId;
        @Nullable
        private String fingerPrint;
        @Nullable
        private String imei;
        @JSONField(name = "isEmulator")
        private boolean isEmulator;
        @JSONField(name = "isRooted")
        private boolean isRooted;
        @Nullable
        private String networkType;
        @Nullable
        private String osVersion;
        private int osVersionInt;
        @Nullable
        private TimeLocation timeLocation;
        @Nullable
        private String utdidAdvertisementId;

        @JSONCreator
        public Device() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, 0, (TimeLocation) null, (String) null, 2097151, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Device copy$default(Device device, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2, String str15, String str16, int i, TimeLocation timeLocation2, String str17, int i2, Object obj) {
            Device device2 = device;
            int i3 = i2;
            return device.copy((i3 & 1) != 0 ? device2.androidId : str, (i3 & 2) != 0 ? device2.appVersion : str2, (i3 & 4) != 0 ? device2.blueMac : str3, (i3 & 8) != 0 ? device2.buildBoard : str4, (i3 & 16) != 0 ? device2.buildBootloader : str5, (i3 & 32) != 0 ? device2.buildBrand : str6, (i3 & 64) != 0 ? device2.buildDevice : str7, (i3 & 128) != 0 ? device2.buildManufacturer : str8, (i3 & 256) != 0 ? device2.buildModel : str9, (i3 & 512) != 0 ? device2.buildProduct : str10, (i3 & 1024) != 0 ? device2.buildSerial : str11, (i3 & 2048) != 0 ? device2.deviceId : str12, (i3 & 4096) != 0 ? device2.fingerPrint : str13, (i3 & 8192) != 0 ? device2.imei : str14, (i3 & 16384) != 0 ? device2.isEmulator : z, (i3 & 32768) != 0 ? device2.isRooted : z2, (i3 & 65536) != 0 ? device2.networkType : str15, (i3 & 131072) != 0 ? device2.osVersion : str16, (i3 & 262144) != 0 ? device2.osVersionInt : i, (i3 & 524288) != 0 ? device2.timeLocation : timeLocation2, (i3 & 1048576) != 0 ? device2.utdidAdvertisementId : str17);
        }

        @Nullable
        public final String component1() {
            return this.androidId;
        }

        @Nullable
        public final String component10() {
            return this.buildProduct;
        }

        @Nullable
        public final String component11() {
            return this.buildSerial;
        }

        @Nullable
        public final String component12() {
            return this.deviceId;
        }

        @Nullable
        public final String component13() {
            return this.fingerPrint;
        }

        @Nullable
        public final String component14() {
            return this.imei;
        }

        public final boolean component15() {
            return this.isEmulator;
        }

        public final boolean component16() {
            return this.isRooted;
        }

        @Nullable
        public final String component17() {
            return this.networkType;
        }

        @Nullable
        public final String component18() {
            return this.osVersion;
        }

        public final int component19() {
            return this.osVersionInt;
        }

        @Nullable
        public final String component2() {
            return this.appVersion;
        }

        @Nullable
        public final TimeLocation component20() {
            return this.timeLocation;
        }

        @Nullable
        public final String component21() {
            return this.utdidAdvertisementId;
        }

        @Nullable
        public final String component3() {
            return this.blueMac;
        }

        @Nullable
        public final String component4() {
            return this.buildBoard;
        }

        @Nullable
        public final String component5() {
            return this.buildBootloader;
        }

        @Nullable
        public final String component6() {
            return this.buildBrand;
        }

        @Nullable
        public final String component7() {
            return this.buildDevice;
        }

        @Nullable
        public final String component8() {
            return this.buildManufacturer;
        }

        @Nullable
        public final String component9() {
            return this.buildModel;
        }

        @NotNull
        public final Device copy(@JSONField(name = "androidId") @Nullable String str, @JSONField(name = "appVersion") @Nullable String str2, @JSONField(name = "blueMac") @Nullable String str3, @JSONField(name = "buildBoard") @Nullable String str4, @JSONField(name = "buildBootloader") @Nullable String str5, @JSONField(name = "buildBrand") @Nullable String str6, @JSONField(name = "buildDevice") @Nullable String str7, @JSONField(name = "buildManufacturer") @Nullable String str8, @JSONField(name = "buildModel") @Nullable String str9, @JSONField(name = "buildProduct") @Nullable String str10, @JSONField(name = "buildSerial") @Nullable String str11, @JSONField(name = "device_id") @Nullable String str12, @JSONField(name = "fingerPrint") @Nullable String str13, @JSONField(name = "imei") @Nullable String str14, boolean z, boolean z2, @JSONField(name = "networkType") @Nullable String str15, @JSONField(name = "osVersion") @Nullable String str16, @JSONField(name = "osVersionInt") int i, @JSONField(name = "timeLocation") @Nullable TimeLocation timeLocation2, @JSONField(name = "utdidAdvertisementId") @Nullable String str17) {
            return new Device(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, z2, str15, str16, i, timeLocation2, str17);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return Intrinsics.areEqual((Object) this.androidId, (Object) device.androidId) && Intrinsics.areEqual((Object) this.appVersion, (Object) device.appVersion) && Intrinsics.areEqual((Object) this.blueMac, (Object) device.blueMac) && Intrinsics.areEqual((Object) this.buildBoard, (Object) device.buildBoard) && Intrinsics.areEqual((Object) this.buildBootloader, (Object) device.buildBootloader) && Intrinsics.areEqual((Object) this.buildBrand, (Object) device.buildBrand) && Intrinsics.areEqual((Object) this.buildDevice, (Object) device.buildDevice) && Intrinsics.areEqual((Object) this.buildManufacturer, (Object) device.buildManufacturer) && Intrinsics.areEqual((Object) this.buildModel, (Object) device.buildModel) && Intrinsics.areEqual((Object) this.buildProduct, (Object) device.buildProduct) && Intrinsics.areEqual((Object) this.buildSerial, (Object) device.buildSerial) && Intrinsics.areEqual((Object) this.deviceId, (Object) device.deviceId) && Intrinsics.areEqual((Object) this.fingerPrint, (Object) device.fingerPrint) && Intrinsics.areEqual((Object) this.imei, (Object) device.imei) && this.isEmulator == device.isEmulator && this.isRooted == device.isRooted && Intrinsics.areEqual((Object) this.networkType, (Object) device.networkType) && Intrinsics.areEqual((Object) this.osVersion, (Object) device.osVersion) && this.osVersionInt == device.osVersionInt && Intrinsics.areEqual((Object) this.timeLocation, (Object) device.timeLocation) && Intrinsics.areEqual((Object) this.utdidAdvertisementId, (Object) device.utdidAdvertisementId);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Device(androidId=");
            sb.append(this.androidId);
            sb.append(", appVersion=");
            sb.append(this.appVersion);
            sb.append(", blueMac=");
            sb.append(this.blueMac);
            sb.append(", buildBoard=");
            sb.append(this.buildBoard);
            sb.append(", buildBootloader=");
            sb.append(this.buildBootloader);
            sb.append(", buildBrand=");
            sb.append(this.buildBrand);
            sb.append(", buildDevice=");
            sb.append(this.buildDevice);
            sb.append(", buildManufacturer=");
            sb.append(this.buildManufacturer);
            sb.append(", buildModel=");
            sb.append(this.buildModel);
            sb.append(", buildProduct=");
            sb.append(this.buildProduct);
            sb.append(", buildSerial=");
            sb.append(this.buildSerial);
            sb.append(", deviceId=");
            sb.append(this.deviceId);
            sb.append(", fingerPrint=");
            sb.append(this.fingerPrint);
            sb.append(", imei=");
            sb.append(this.imei);
            sb.append(", isEmulator=");
            sb.append(this.isEmulator);
            sb.append(", isRooted=");
            sb.append(this.isRooted);
            sb.append(", networkType=");
            sb.append(this.networkType);
            sb.append(", osVersion=");
            sb.append(this.osVersion);
            sb.append(", osVersionInt=");
            sb.append(this.osVersionInt);
            sb.append(", timeLocation=");
            sb.append(this.timeLocation);
            sb.append(", utdidAdvertisementId=");
            sb.append(this.utdidAdvertisementId);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Device(@JSONField(name = "androidId") @Nullable String str, @JSONField(name = "appVersion") @Nullable String str2, @JSONField(name = "blueMac") @Nullable String str3, @JSONField(name = "buildBoard") @Nullable String str4, @JSONField(name = "buildBootloader") @Nullable String str5, @JSONField(name = "buildBrand") @Nullable String str6, @JSONField(name = "buildDevice") @Nullable String str7, @JSONField(name = "buildManufacturer") @Nullable String str8, @JSONField(name = "buildModel") @Nullable String str9, @JSONField(name = "buildProduct") @Nullable String str10, @JSONField(name = "buildSerial") @Nullable String str11, @JSONField(name = "device_id") @Nullable String str12, @JSONField(name = "fingerPrint") @Nullable String str13, @JSONField(name = "imei") @Nullable String str14, boolean z, boolean z2, @JSONField(name = "networkType") @Nullable String str15, @JSONField(name = "osVersion") @Nullable String str16, @JSONField(name = "osVersionInt") int i, @JSONField(name = "timeLocation") @Nullable TimeLocation timeLocation2, @JSONField(name = "utdidAdvertisementId") @Nullable String str17) {
            this.androidId = str;
            this.appVersion = str2;
            this.blueMac = str3;
            this.buildBoard = str4;
            this.buildBootloader = str5;
            this.buildBrand = str6;
            this.buildDevice = str7;
            this.buildManufacturer = str8;
            this.buildModel = str9;
            this.buildProduct = str10;
            this.buildSerial = str11;
            this.deviceId = str12;
            this.fingerPrint = str13;
            this.imei = str14;
            this.isEmulator = z;
            this.isRooted = z2;
            this.networkType = str15;
            this.osVersion = str16;
            this.osVersionInt = i;
            this.timeLocation = timeLocation2;
            this.utdidAdvertisementId = str17;
        }

        @Nullable
        public final String getAndroidId() {
            return this.androidId;
        }

        public final void setAndroidId(@Nullable String str) {
            this.androidId = str;
        }

        @Nullable
        public final String getAppVersion() {
            return this.appVersion;
        }

        public final void setAppVersion(@Nullable String str) {
            this.appVersion = str;
        }

        @Nullable
        public final String getBlueMac() {
            return this.blueMac;
        }

        public final void setBlueMac(@Nullable String str) {
            this.blueMac = str;
        }

        @Nullable
        public final String getBuildBoard() {
            return this.buildBoard;
        }

        public final void setBuildBoard(@Nullable String str) {
            this.buildBoard = str;
        }

        @Nullable
        public final String getBuildBootloader() {
            return this.buildBootloader;
        }

        public final void setBuildBootloader(@Nullable String str) {
            this.buildBootloader = str;
        }

        @Nullable
        public final String getBuildBrand() {
            return this.buildBrand;
        }

        public final void setBuildBrand(@Nullable String str) {
            this.buildBrand = str;
        }

        @Nullable
        public final String getBuildDevice() {
            return this.buildDevice;
        }

        public final void setBuildDevice(@Nullable String str) {
            this.buildDevice = str;
        }

        @Nullable
        public final String getBuildManufacturer() {
            return this.buildManufacturer;
        }

        public final void setBuildManufacturer(@Nullable String str) {
            this.buildManufacturer = str;
        }

        @Nullable
        public final String getBuildModel() {
            return this.buildModel;
        }

        public final void setBuildModel(@Nullable String str) {
            this.buildModel = str;
        }

        @Nullable
        public final String getBuildProduct() {
            return this.buildProduct;
        }

        public final void setBuildProduct(@Nullable String str) {
            this.buildProduct = str;
        }

        @Nullable
        public final String getBuildSerial() {
            return this.buildSerial;
        }

        public final void setBuildSerial(@Nullable String str) {
            this.buildSerial = str;
        }

        @Nullable
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final void setDeviceId(@Nullable String str) {
            this.deviceId = str;
        }

        @Nullable
        public final String getFingerPrint() {
            return this.fingerPrint;
        }

        public final void setFingerPrint(@Nullable String str) {
            this.fingerPrint = str;
        }

        @Nullable
        public final String getImei() {
            return this.imei;
        }

        public final void setImei(@Nullable String str) {
            this.imei = str;
        }

        public final boolean isEmulator() {
            return this.isEmulator;
        }

        public final void setEmulator(boolean z) {
            this.isEmulator = z;
        }

        public final boolean isRooted() {
            return this.isRooted;
        }

        public final void setRooted(boolean z) {
            this.isRooted = z;
        }

        @Nullable
        public final String getNetworkType() {
            return this.networkType;
        }

        public final void setNetworkType(@Nullable String str) {
            this.networkType = str;
        }

        @Nullable
        public final String getOsVersion() {
            return this.osVersion;
        }

        public final void setOsVersion(@Nullable String str) {
            this.osVersion = str;
        }

        public final int getOsVersionInt() {
            return this.osVersionInt;
        }

        public final void setOsVersionInt(int i) {
            this.osVersionInt = i;
        }

        @Nullable
        public final TimeLocation getTimeLocation() {
            return this.timeLocation;
        }

        public final void setTimeLocation(@Nullable TimeLocation timeLocation2) {
            this.timeLocation = timeLocation2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Device(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, boolean r37, boolean r38, java.lang.String r39, java.lang.String r40, int r41, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Device.TimeLocation r42, java.lang.String r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
            /*
                r22 = this;
                r0 = r44
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0008
                r1 = 0
                goto L_0x000a
            L_0x0008:
                r1 = r23
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = 0
                goto L_0x0012
            L_0x0010:
                r3 = r24
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                r4 = 0
                goto L_0x001a
            L_0x0018:
                r4 = r25
            L_0x001a:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0020
                r5 = 0
                goto L_0x0022
            L_0x0020:
                r5 = r26
            L_0x0022:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0028
                r6 = 0
                goto L_0x002a
            L_0x0028:
                r6 = r27
            L_0x002a:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0030
                r7 = 0
                goto L_0x0032
            L_0x0030:
                r7 = r28
            L_0x0032:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0038
                r8 = 0
                goto L_0x003a
            L_0x0038:
                r8 = r29
            L_0x003a:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0040
                r9 = 0
                goto L_0x0042
            L_0x0040:
                r9 = r30
            L_0x0042:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0048
                r10 = 0
                goto L_0x004a
            L_0x0048:
                r10 = r31
            L_0x004a:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0050
                r11 = 0
                goto L_0x0052
            L_0x0050:
                r11 = r32
            L_0x0052:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0058
                r12 = 0
                goto L_0x005a
            L_0x0058:
                r12 = r33
            L_0x005a:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x0060
                r13 = 0
                goto L_0x0062
            L_0x0060:
                r13 = r34
            L_0x0062:
                r14 = r0 & 4096(0x1000, float:5.74E-42)
                if (r14 == 0) goto L_0x0068
                r14 = 0
                goto L_0x006a
            L_0x0068:
                r14 = r35
            L_0x006a:
                r15 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r15 == 0) goto L_0x0070
                r15 = 0
                goto L_0x0072
            L_0x0070:
                r15 = r36
            L_0x0072:
                r2 = r0 & 16384(0x4000, float:2.2959E-41)
                r16 = 0
                if (r2 == 0) goto L_0x007a
                r2 = 0
                goto L_0x007c
            L_0x007a:
                r2 = r37
            L_0x007c:
                r17 = 32768(0x8000, float:4.5918E-41)
                r17 = r0 & r17
                if (r17 == 0) goto L_0x0086
                r17 = 0
                goto L_0x0088
            L_0x0086:
                r17 = r38
            L_0x0088:
                r18 = 65536(0x10000, float:9.18355E-41)
                r18 = r0 & r18
                if (r18 == 0) goto L_0x0091
                r18 = 0
                goto L_0x0093
            L_0x0091:
                r18 = r39
            L_0x0093:
                r19 = 131072(0x20000, float:1.83671E-40)
                r19 = r0 & r19
                if (r19 == 0) goto L_0x009c
                r19 = 0
                goto L_0x009e
            L_0x009c:
                r19 = r40
            L_0x009e:
                r20 = 262144(0x40000, float:3.67342E-40)
                r20 = r0 & r20
                if (r20 == 0) goto L_0x00a5
                goto L_0x00a7
            L_0x00a5:
                r16 = r41
            L_0x00a7:
                r20 = 524288(0x80000, float:7.34684E-40)
                r20 = r0 & r20
                if (r20 == 0) goto L_0x00b0
                r20 = 0
                goto L_0x00b2
            L_0x00b0:
                r20 = r42
            L_0x00b2:
                r21 = 1048576(0x100000, float:1.469368E-39)
                r0 = r0 & r21
                if (r0 == 0) goto L_0x00ba
                r0 = 0
                goto L_0x00bc
            L_0x00ba:
                r0 = r43
            L_0x00bc:
                r23 = r22
                r24 = r1
                r25 = r3
                r26 = r4
                r27 = r5
                r28 = r6
                r29 = r7
                r30 = r8
                r31 = r9
                r32 = r10
                r33 = r11
                r34 = r12
                r35 = r13
                r36 = r14
                r37 = r15
                r38 = r2
                r39 = r17
                r40 = r18
                r41 = r19
                r42 = r16
                r43 = r20
                r44 = r0
                r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Device.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Device$TimeLocation, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Nullable
        public final String getUtdidAdvertisementId() {
            return this.utdidAdvertisementId;
        }

        public final void setUtdidAdvertisementId(@Nullable String str) {
            this.utdidAdvertisementId = str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Device$TimeLocation;", "", "latitude", "", "longitude", "timeZone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/String;", "setLatitude", "(Ljava/lang/String;)V", "getLongitude", "setLongitude", "getTimeZone", "setTimeZone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
        public static final class TimeLocation {
            @Nullable
            private String latitude;
            @Nullable
            private String longitude;
            @Nullable
            private String timeZone;

            @JSONCreator
            public TimeLocation() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ TimeLocation copy$default(TimeLocation timeLocation, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = timeLocation.latitude;
                }
                if ((i & 2) != 0) {
                    str2 = timeLocation.longitude;
                }
                if ((i & 4) != 0) {
                    str3 = timeLocation.timeZone;
                }
                return timeLocation.copy(str, str2, str3);
            }

            @Nullable
            public final String component1() {
                return this.latitude;
            }

            @Nullable
            public final String component2() {
                return this.longitude;
            }

            @Nullable
            public final String component3() {
                return this.timeZone;
            }

            @NotNull
            public final TimeLocation copy(@JSONField(name = "latitude") @Nullable String str, @JSONField(name = "longitude") @Nullable String str2, @JSONField(name = "timeZone") @Nullable String str3) {
                return new TimeLocation(str, str2, str3);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TimeLocation)) {
                    return false;
                }
                TimeLocation timeLocation = (TimeLocation) obj;
                return Intrinsics.areEqual((Object) this.latitude, (Object) timeLocation.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) timeLocation.longitude) && Intrinsics.areEqual((Object) this.timeZone, (Object) timeLocation.timeZone);
            }

            public final int hashCode() {
                String str = this.latitude;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.longitude;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.timeZone;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode2 + i;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("TimeLocation(latitude=");
                sb.append(this.latitude);
                sb.append(", longitude=");
                sb.append(this.longitude);
                sb.append(", timeZone=");
                sb.append(this.timeZone);
                sb.append(")");
                return sb.toString();
            }

            @JSONCreator
            public TimeLocation(@JSONField(name = "latitude") @Nullable String str, @JSONField(name = "longitude") @Nullable String str2, @JSONField(name = "timeZone") @Nullable String str3) {
                this.latitude = str;
                this.longitude = str2;
                this.timeZone = str3;
            }

            @Nullable
            public final String getLatitude() {
                return this.latitude;
            }

            public final void setLatitude(@Nullable String str) {
                this.latitude = str;
            }

            @Nullable
            public final String getLongitude() {
                return this.longitude;
            }

            public final void setLongitude(@Nullable String str) {
                this.longitude = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ TimeLocation(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }

            @Nullable
            public final String getTimeZone() {
                return this.timeZone;
            }

            public final void setTimeZone(@Nullable String str) {
                this.timeZone = str;
            }
        }

        public final int hashCode() {
            String str = this.androidId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.appVersion;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.blueMac;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.buildBoard;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.buildBootloader;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.buildBrand;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.buildDevice;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.buildManufacturer;
            int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.buildModel;
            int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.buildProduct;
            int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.buildSerial;
            int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.deviceId;
            int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.fingerPrint;
            int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
            String str14 = this.imei;
            int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
            boolean z = this.isEmulator;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode14 + (z ? 1 : 0)) * 31;
            boolean z3 = this.isRooted;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            String str15 = this.networkType;
            int hashCode15 = (i3 + (str15 != null ? str15.hashCode() : 0)) * 31;
            String str16 = this.osVersion;
            int hashCode16 = (((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + Integer.valueOf(this.osVersionInt).hashCode()) * 31;
            TimeLocation timeLocation2 = this.timeLocation;
            int hashCode17 = (hashCode16 + (timeLocation2 != null ? timeLocation2.hashCode() : 0)) * 31;
            String str17 = this.utdidAdvertisementId;
            if (str17 != null) {
                i = str17.hashCode();
            }
            return hashCode17 + i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006/"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Cpu;", "", "cpuABI", "", "cpuABI2", "cpuArchitecture", "cpuCurFreq", "", "cpuMaxFreq", "cpuMinFreq", "cpuName", "cpuSerial", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getCpuABI", "()Ljava/lang/String;", "setCpuABI", "(Ljava/lang/String;)V", "getCpuABI2", "setCpuABI2", "getCpuArchitecture", "setCpuArchitecture", "getCpuCurFreq", "()I", "setCpuCurFreq", "(I)V", "getCpuMaxFreq", "setCpuMaxFreq", "getCpuMinFreq", "setCpuMinFreq", "getCpuName", "setCpuName", "getCpuSerial", "setCpuSerial", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Cpu {
        @Nullable
        private String cpuABI;
        @Nullable
        private String cpuABI2;
        @Nullable
        private String cpuArchitecture;
        private int cpuCurFreq;
        private int cpuMaxFreq;
        private int cpuMinFreq;
        @Nullable
        private String cpuName;
        @Nullable
        private String cpuSerial;

        @JSONCreator
        public Cpu() {
            this((String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Cpu copy$default(Cpu cpu, String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, int i4, Object obj) {
            Cpu cpu2 = cpu;
            int i5 = i4;
            return cpu.copy((i5 & 1) != 0 ? cpu2.cpuABI : str, (i5 & 2) != 0 ? cpu2.cpuABI2 : str2, (i5 & 4) != 0 ? cpu2.cpuArchitecture : str3, (i5 & 8) != 0 ? cpu2.cpuCurFreq : i, (i5 & 16) != 0 ? cpu2.cpuMaxFreq : i2, (i5 & 32) != 0 ? cpu2.cpuMinFreq : i3, (i5 & 64) != 0 ? cpu2.cpuName : str4, (i5 & 128) != 0 ? cpu2.cpuSerial : str5);
        }

        @Nullable
        public final String component1() {
            return this.cpuABI;
        }

        @Nullable
        public final String component2() {
            return this.cpuABI2;
        }

        @Nullable
        public final String component3() {
            return this.cpuArchitecture;
        }

        public final int component4() {
            return this.cpuCurFreq;
        }

        public final int component5() {
            return this.cpuMaxFreq;
        }

        public final int component6() {
            return this.cpuMinFreq;
        }

        @Nullable
        public final String component7() {
            return this.cpuName;
        }

        @Nullable
        public final String component8() {
            return this.cpuSerial;
        }

        @NotNull
        public final Cpu copy(@JSONField(name = "cpuABI") @Nullable String str, @JSONField(name = "cpuABI2") @Nullable String str2, @JSONField(name = "cpuArchitecture") @Nullable String str3, @JSONField(name = "cpuCurFreq") int i, @JSONField(name = "cpuMaxFreq") int i2, @JSONField(name = "cpuMinFreq") int i3, @JSONField(name = "cpuName") @Nullable String str4, @JSONField(name = "cpuSerial") @Nullable String str5) {
            return new Cpu(str, str2, str3, i, i2, i3, str4, str5);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cpu)) {
                return false;
            }
            Cpu cpu = (Cpu) obj;
            return Intrinsics.areEqual((Object) this.cpuABI, (Object) cpu.cpuABI) && Intrinsics.areEqual((Object) this.cpuABI2, (Object) cpu.cpuABI2) && Intrinsics.areEqual((Object) this.cpuArchitecture, (Object) cpu.cpuArchitecture) && this.cpuCurFreq == cpu.cpuCurFreq && this.cpuMaxFreq == cpu.cpuMaxFreq && this.cpuMinFreq == cpu.cpuMinFreq && Intrinsics.areEqual((Object) this.cpuName, (Object) cpu.cpuName) && Intrinsics.areEqual((Object) this.cpuSerial, (Object) cpu.cpuSerial);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Cpu(cpuABI=");
            sb.append(this.cpuABI);
            sb.append(", cpuABI2=");
            sb.append(this.cpuABI2);
            sb.append(", cpuArchitecture=");
            sb.append(this.cpuArchitecture);
            sb.append(", cpuCurFreq=");
            sb.append(this.cpuCurFreq);
            sb.append(", cpuMaxFreq=");
            sb.append(this.cpuMaxFreq);
            sb.append(", cpuMinFreq=");
            sb.append(this.cpuMinFreq);
            sb.append(", cpuName=");
            sb.append(this.cpuName);
            sb.append(", cpuSerial=");
            sb.append(this.cpuSerial);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Cpu(@JSONField(name = "cpuABI") @Nullable String str, @JSONField(name = "cpuABI2") @Nullable String str2, @JSONField(name = "cpuArchitecture") @Nullable String str3, @JSONField(name = "cpuCurFreq") int i, @JSONField(name = "cpuMaxFreq") int i2, @JSONField(name = "cpuMinFreq") int i3, @JSONField(name = "cpuName") @Nullable String str4, @JSONField(name = "cpuSerial") @Nullable String str5) {
            this.cpuABI = str;
            this.cpuABI2 = str2;
            this.cpuArchitecture = str3;
            this.cpuCurFreq = i;
            this.cpuMaxFreq = i2;
            this.cpuMinFreq = i3;
            this.cpuName = str4;
            this.cpuSerial = str5;
        }

        @Nullable
        public final String getCpuABI() {
            return this.cpuABI;
        }

        public final void setCpuABI(@Nullable String str) {
            this.cpuABI = str;
        }

        @Nullable
        public final String getCpuABI2() {
            return this.cpuABI2;
        }

        public final void setCpuABI2(@Nullable String str) {
            this.cpuABI2 = str;
        }

        @Nullable
        public final String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        public final void setCpuArchitecture(@Nullable String str) {
            this.cpuArchitecture = str;
        }

        public final int getCpuCurFreq() {
            return this.cpuCurFreq;
        }

        public final void setCpuCurFreq(int i) {
            this.cpuCurFreq = i;
        }

        public final int getCpuMaxFreq() {
            return this.cpuMaxFreq;
        }

        public final void setCpuMaxFreq(int i) {
            this.cpuMaxFreq = i;
        }

        public final int getCpuMinFreq() {
            return this.cpuMinFreq;
        }

        public final void setCpuMinFreq(int i) {
            this.cpuMinFreq = i;
        }

        @Nullable
        public final String getCpuName() {
            return this.cpuName;
        }

        public final void setCpuName(@Nullable String str) {
            this.cpuName = str;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Cpu(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, int r14, int r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r10
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r11
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r12
            L_0x0018:
                r5 = r0 & 8
                r6 = 0
                if (r5 == 0) goto L_0x001f
                r5 = 0
                goto L_0x0020
            L_0x001f:
                r5 = r13
            L_0x0020:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x0026
                r7 = 0
                goto L_0x0027
            L_0x0026:
                r7 = r14
            L_0x0027:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = r15
            L_0x002d:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0033
                r8 = r2
                goto L_0x0035
            L_0x0033:
                r8 = r16
            L_0x0035:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r2 = r17
            L_0x003c:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r7
                r16 = r6
                r17 = r8
                r18 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Cpu.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Nullable
        public final String getCpuSerial() {
            return this.cpuSerial;
        }

        public final void setCpuSerial(@Nullable String str) {
            this.cpuSerial = str;
        }

        public final int hashCode() {
            String str = this.cpuABI;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.cpuABI2;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.cpuArchitecture;
            int hashCode3 = (((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.valueOf(this.cpuCurFreq).hashCode()) * 31) + Integer.valueOf(this.cpuMaxFreq).hashCode()) * 31) + Integer.valueOf(this.cpuMinFreq).hashCode()) * 31;
            String str4 = this.cpuName;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.cpuSerial;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode4 + i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jc\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00061"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$SysFeature;", "", "bluetooth", "", "locationGPS", "nfc", "nfcHostCardEmulation", "telephony", "usbAccessory", "usbHost", "wifi", "wifiDirect", "(ZZZZZZZZZ)V", "getBluetooth", "()Z", "setBluetooth", "(Z)V", "getLocationGPS", "setLocationGPS", "getNfc", "setNfc", "getNfcHostCardEmulation", "setNfcHostCardEmulation", "getTelephony", "setTelephony", "getUsbAccessory", "setUsbAccessory", "getUsbHost", "setUsbHost", "getWifi", "setWifi", "getWifiDirect", "setWifiDirect", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class SysFeature {
        private boolean bluetooth;
        private boolean locationGPS;
        private boolean nfc;
        private boolean nfcHostCardEmulation;
        private boolean telephony;
        private boolean usbAccessory;
        private boolean usbHost;
        private boolean wifi;
        private boolean wifiDirect;

        @JSONCreator
        public SysFeature() {
            this(false, false, false, false, false, false, false, false, false, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ SysFeature copy$default(SysFeature sysFeature, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, Object obj) {
            SysFeature sysFeature2 = sysFeature;
            int i2 = i;
            return sysFeature.copy((i2 & 1) != 0 ? sysFeature2.bluetooth : z, (i2 & 2) != 0 ? sysFeature2.locationGPS : z2, (i2 & 4) != 0 ? sysFeature2.nfc : z3, (i2 & 8) != 0 ? sysFeature2.nfcHostCardEmulation : z4, (i2 & 16) != 0 ? sysFeature2.telephony : z5, (i2 & 32) != 0 ? sysFeature2.usbAccessory : z6, (i2 & 64) != 0 ? sysFeature2.usbHost : z7, (i2 & 128) != 0 ? sysFeature2.wifi : z8, (i2 & 256) != 0 ? sysFeature2.wifiDirect : z9);
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
        public final SysFeature copy(@JSONField(name = "bluetooth") boolean z, @JSONField(name = "locationGPS") boolean z2, @JSONField(name = "nfc") boolean z3, @JSONField(name = "nfcHostCardEmulation") boolean z4, @JSONField(name = "telephony") boolean z5, @JSONField(name = "usbAccessory") boolean z6, @JSONField(name = "usbHost") boolean z7, @JSONField(name = "wifi") boolean z8, @JSONField(name = "wifiDirect") boolean z9) {
            return new SysFeature(z, z2, z3, z4, z5, z6, z7, z8, z9);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SysFeature)) {
                return false;
            }
            SysFeature sysFeature = (SysFeature) obj;
            return this.bluetooth == sysFeature.bluetooth && this.locationGPS == sysFeature.locationGPS && this.nfc == sysFeature.nfc && this.nfcHostCardEmulation == sysFeature.nfcHostCardEmulation && this.telephony == sysFeature.telephony && this.usbAccessory == sysFeature.usbAccessory && this.usbHost == sysFeature.usbHost && this.wifi == sysFeature.wifi && this.wifiDirect == sysFeature.wifiDirect;
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

        @JSONCreator
        public SysFeature(@JSONField(name = "bluetooth") boolean z, @JSONField(name = "locationGPS") boolean z2, @JSONField(name = "nfc") boolean z3, @JSONField(name = "nfcHostCardEmulation") boolean z4, @JSONField(name = "telephony") boolean z5, @JSONField(name = "usbAccessory") boolean z6, @JSONField(name = "usbHost") boolean z7, @JSONField(name = "wifi") boolean z8, @JSONField(name = "wifiDirect") boolean z9) {
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

        public final void setBluetooth(boolean z) {
            this.bluetooth = z;
        }

        public final boolean getLocationGPS() {
            return this.locationGPS;
        }

        public final void setLocationGPS(boolean z) {
            this.locationGPS = z;
        }

        public final boolean getNfc() {
            return this.nfc;
        }

        public final void setNfc(boolean z) {
            this.nfc = z;
        }

        public final boolean getNfcHostCardEmulation() {
            return this.nfcHostCardEmulation;
        }

        public final void setNfcHostCardEmulation(boolean z) {
            this.nfcHostCardEmulation = z;
        }

        public final boolean getTelephony() {
            return this.telephony;
        }

        public final void setTelephony(boolean z) {
            this.telephony = z;
        }

        public final boolean getUsbAccessory() {
            return this.usbAccessory;
        }

        public final void setUsbAccessory(boolean z) {
            this.usbAccessory = z;
        }

        public final boolean getUsbHost() {
            return this.usbHost;
        }

        public final void setUsbHost(boolean z) {
            this.usbHost = z;
        }

        public final boolean getWifi() {
            return this.wifi;
        }

        public final void setWifi(boolean z) {
            this.wifi = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SysFeature(boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = 0
                goto L_0x000a
            L_0x0009:
                r1 = r11
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = 0
                goto L_0x0011
            L_0x0010:
                r3 = r12
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = 0
                goto L_0x0018
            L_0x0017:
                r4 = r13
            L_0x0018:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001e
                r5 = 0
                goto L_0x001f
            L_0x001e:
                r5 = r14
            L_0x001f:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0025
                r6 = 0
                goto L_0x0026
            L_0x0025:
                r6 = r15
            L_0x0026:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002c
                r7 = 0
                goto L_0x002e
            L_0x002c:
                r7 = r16
            L_0x002e:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0034
                r8 = 0
                goto L_0x0036
            L_0x0034:
                r8 = r17
            L_0x0036:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003c
                r9 = 0
                goto L_0x003e
            L_0x003c:
                r9 = r18
            L_0x003e:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r2 = r19
            L_0x0045:
                r11 = r10
                r12 = r1
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r9
                r20 = r2
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.SysFeature.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final boolean getWifiDirect() {
            return this.wifiDirect;
        }

        public final void setWifiDirect(boolean z) {
            this.wifiDirect = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Memory;", "", "maxMemory", "", "totalMemory", "(Ljava/lang/String;Ljava/lang/String;)V", "getMaxMemory", "()Ljava/lang/String;", "setMaxMemory", "(Ljava/lang/String;)V", "getTotalMemory", "setTotalMemory", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Memory {
        @Nullable
        private String maxMemory;
        @Nullable
        private String totalMemory;

        @JSONCreator
        public Memory() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Memory copy$default(Memory memory, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = memory.maxMemory;
            }
            if ((i & 2) != 0) {
                str2 = memory.totalMemory;
            }
            return memory.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.maxMemory;
        }

        @Nullable
        public final String component2() {
            return this.totalMemory;
        }

        @NotNull
        public final Memory copy(@JSONField(name = "maxMemory") @Nullable String str, @JSONField(name = "totalMemory") @Nullable String str2) {
            return new Memory(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Memory)) {
                return false;
            }
            Memory memory = (Memory) obj;
            return Intrinsics.areEqual((Object) this.maxMemory, (Object) memory.maxMemory) && Intrinsics.areEqual((Object) this.totalMemory, (Object) memory.totalMemory);
        }

        public final int hashCode() {
            String str = this.maxMemory;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.totalMemory;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Memory(maxMemory=");
            sb.append(this.maxMemory);
            sb.append(", totalMemory=");
            sb.append(this.totalMemory);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Memory(@JSONField(name = "maxMemory") @Nullable String str, @JSONField(name = "totalMemory") @Nullable String str2) {
            this.maxMemory = str;
            this.totalMemory = str2;
        }

        @Nullable
        public final String getMaxMemory() {
            return this.maxMemory;
        }

        public final void setMaxMemory(@Nullable String str) {
            this.maxMemory = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Memory(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        @Nullable
        public final String getTotalMemory() {
            return this.totalMemory;
        }

        public final void setTotalMemory(@Nullable String str) {
            this.totalMemory = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$ExternalStorage;", "", "diskFree", "", "diskTotal", "(Ljava/lang/String;Ljava/lang/String;)V", "getDiskFree", "()Ljava/lang/String;", "setDiskFree", "(Ljava/lang/String;)V", "getDiskTotal", "setDiskTotal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class ExternalStorage {
        @Nullable
        private String diskFree;
        @Nullable
        private String diskTotal;

        @JSONCreator
        public ExternalStorage() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ExternalStorage copy$default(ExternalStorage externalStorage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = externalStorage.diskFree;
            }
            if ((i & 2) != 0) {
                str2 = externalStorage.diskTotal;
            }
            return externalStorage.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.diskFree;
        }

        @Nullable
        public final String component2() {
            return this.diskTotal;
        }

        @NotNull
        public final ExternalStorage copy(@JSONField(name = "diskFree") @Nullable String str, @JSONField(name = "diskTotal") @Nullable String str2) {
            return new ExternalStorage(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExternalStorage)) {
                return false;
            }
            ExternalStorage externalStorage = (ExternalStorage) obj;
            return Intrinsics.areEqual((Object) this.diskFree, (Object) externalStorage.diskFree) && Intrinsics.areEqual((Object) this.diskTotal, (Object) externalStorage.diskTotal);
        }

        public final int hashCode() {
            String str = this.diskFree;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.diskTotal;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ExternalStorage(diskFree=");
            sb.append(this.diskFree);
            sb.append(", diskTotal=");
            sb.append(this.diskTotal);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public ExternalStorage(@JSONField(name = "diskFree") @Nullable String str, @JSONField(name = "diskTotal") @Nullable String str2) {
            this.diskFree = str;
            this.diskTotal = str2;
        }

        @Nullable
        public final String getDiskFree() {
            return this.diskFree;
        }

        public final void setDiskFree(@Nullable String str) {
            this.diskFree = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExternalStorage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        @Nullable
        public final String getDiskTotal() {
            return this.diskTotal;
        }

        public final void setDiskTotal(@Nullable String str) {
            this.diskTotal = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$IPAddress;", "", "ethIp", "", "trueIp", "(Ljava/lang/String;Ljava/lang/String;)V", "getEthIp", "()Ljava/lang/String;", "setEthIp", "(Ljava/lang/String;)V", "getTrueIp", "setTrueIp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class IPAddress {
        @Nullable
        private String ethIp;
        @Nullable
        private String trueIp;

        @JSONCreator
        public IPAddress() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ IPAddress copy$default(IPAddress iPAddress, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iPAddress.ethIp;
            }
            if ((i & 2) != 0) {
                str2 = iPAddress.trueIp;
            }
            return iPAddress.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.ethIp;
        }

        @Nullable
        public final String component2() {
            return this.trueIp;
        }

        @NotNull
        public final IPAddress copy(@JSONField(name = "ethIp") @Nullable String str, @JSONField(name = "trueIp") @Nullable String str2) {
            return new IPAddress(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IPAddress)) {
                return false;
            }
            IPAddress iPAddress = (IPAddress) obj;
            return Intrinsics.areEqual((Object) this.ethIp, (Object) iPAddress.ethIp) && Intrinsics.areEqual((Object) this.trueIp, (Object) iPAddress.trueIp);
        }

        public final int hashCode() {
            String str = this.ethIp;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.trueIp;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("IPAddress(ethIp=");
            sb.append(this.ethIp);
            sb.append(", trueIp=");
            sb.append(this.trueIp);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public IPAddress(@JSONField(name = "ethIp") @Nullable String str, @JSONField(name = "trueIp") @Nullable String str2) {
            this.ethIp = str;
            this.trueIp = str2;
        }

        @Nullable
        public final String getEthIp() {
            return this.ethIp;
        }

        public final void setEthIp(@Nullable String str) {
            this.ethIp = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IPAddress(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        @Nullable
        public final String getTrueIp() {
            return this.trueIp;
        }

        public final void setTrueIp(@Nullable String str) {
            this.trueIp = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Display;", "", "density", "", "height", "width", "(III)V", "getDensity", "()I", "setDensity", "(I)V", "getHeight", "setHeight", "getWidth", "setWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Display {
        private int density;
        private int height;
        private int width;

        @JSONCreator
        public Display() {
            this(0, 0, 0, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Display copy$default(Display display, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = display.density;
            }
            if ((i4 & 2) != 0) {
                i2 = display.height;
            }
            if ((i4 & 4) != 0) {
                i3 = display.width;
            }
            return display.copy(i, i2, i3);
        }

        public final int component1() {
            return this.density;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.width;
        }

        @NotNull
        public final Display copy(@JSONField(name = "density") int i, @JSONField(name = "height") int i2, @JSONField(name = "width") int i3) {
            return new Display(i, i2, i3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return false;
            }
            Display display = (Display) obj;
            return this.density == display.density && this.height == display.height && this.width == display.width;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Display(density=");
            sb.append(this.density);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Display(@JSONField(name = "density") int i, @JSONField(name = "height") int i2, @JSONField(name = "width") int i3) {
            this.density = i;
            this.height = i2;
            this.width = i3;
        }

        public final int getDensity() {
            return this.density;
        }

        public final void setDensity(int i) {
            this.density = i;
        }

        public final int getHeight() {
            return this.height;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Display(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setWidth(int i) {
            this.width = i;
        }

        public final int hashCode() {
            return (((Integer.valueOf(this.density).hashCode() * 31) + Integer.valueOf(this.height).hashCode()) * 31) + Integer.valueOf(this.width).hashCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001B=\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006$"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Wifi;", "", "bssid", "", "frequency", "", "isCurrent", "", "level", "ssid", "(Ljava/lang/String;IZILjava/lang/String;)V", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "getFrequency", "()I", "setFrequency", "(I)V", "()Z", "setCurrent", "(Z)V", "getLevel", "setLevel", "getSsid", "setSsid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Wifi {
        @Nullable
        private String bssid;
        private int frequency;
        @JSONField(name = "isCurrent")
        private boolean isCurrent;
        private int level;
        @Nullable
        private String ssid;

        @JSONCreator
        public Wifi() {
            this((String) null, 0, false, 0, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Wifi copy$default(Wifi wifi, String str, int i, boolean z, int i2, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = wifi.bssid;
            }
            if ((i3 & 2) != 0) {
                i = wifi.frequency;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                z = wifi.isCurrent;
            }
            boolean z2 = z;
            if ((i3 & 8) != 0) {
                i2 = wifi.level;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                str2 = wifi.ssid;
            }
            return wifi.copy(str, i4, z2, i5, str2);
        }

        @Nullable
        public final String component1() {
            return this.bssid;
        }

        public final int component2() {
            return this.frequency;
        }

        public final boolean component3() {
            return this.isCurrent;
        }

        public final int component4() {
            return this.level;
        }

        @Nullable
        public final String component5() {
            return this.ssid;
        }

        @NotNull
        public final Wifi copy(@JSONField(name = "bssid") @Nullable String str, @JSONField(name = "frequency") int i, boolean z, @JSONField(name = "level") int i2, @JSONField(name = "ssid") @Nullable String str2) {
            return new Wifi(str, i, z, i2, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Wifi)) {
                return false;
            }
            Wifi wifi = (Wifi) obj;
            return Intrinsics.areEqual((Object) this.bssid, (Object) wifi.bssid) && this.frequency == wifi.frequency && this.isCurrent == wifi.isCurrent && this.level == wifi.level && Intrinsics.areEqual((Object) this.ssid, (Object) wifi.ssid);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Wifi(bssid=");
            sb.append(this.bssid);
            sb.append(", frequency=");
            sb.append(this.frequency);
            sb.append(", isCurrent=");
            sb.append(this.isCurrent);
            sb.append(", level=");
            sb.append(this.level);
            sb.append(", ssid=");
            sb.append(this.ssid);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Wifi(@JSONField(name = "bssid") @Nullable String str, @JSONField(name = "frequency") int i, boolean z, @JSONField(name = "level") int i2, @JSONField(name = "ssid") @Nullable String str2) {
            this.bssid = str;
            this.frequency = i;
            this.isCurrent = z;
            this.level = i2;
            this.ssid = str2;
        }

        @Nullable
        public final String getBssid() {
            return this.bssid;
        }

        public final void setBssid(@Nullable String str) {
            this.bssid = str;
        }

        public final int getFrequency() {
            return this.frequency;
        }

        public final void setFrequency(int i) {
            this.frequency = i;
        }

        public final boolean isCurrent() {
            return this.isCurrent;
        }

        public final void setCurrent(boolean z) {
            this.isCurrent = z;
        }

        public final int getLevel() {
            return this.level;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Wifi(java.lang.String r5, int r6, boolean r7, int r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = r0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                r1 = 0
                if (r5 == 0) goto L_0x000f
                r2 = 0
                goto L_0x0010
            L_0x000f:
                r2 = r6
            L_0x0010:
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0016
                r3 = 0
                goto L_0x0017
            L_0x0016:
                r3 = r7
            L_0x0017:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r1 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = r0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r2
                r8 = r3
                r9 = r1
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Wifi.<init>(java.lang.String, int, boolean, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Nullable
        public final String getSsid() {
            return this.ssid;
        }

        public final void setSsid(@Nullable String str) {
            this.ssid = str;
        }

        public final int hashCode() {
            String str = this.bssid;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.frequency).hashCode()) * 31;
            boolean z = this.isCurrent;
            if (z) {
                z = true;
            }
            int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + Integer.valueOf(this.level).hashCode()) * 31;
            String str2 = this.ssid;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J=\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006#"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Bluetooth;", "", "address", "", "bondState", "", "isBounded", "", "isBounding", "type", "(Ljava/lang/String;IZZI)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getBondState", "()I", "setBondState", "(I)V", "()Z", "setBounded", "(Z)V", "setBounding", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class Bluetooth {
        @Nullable
        private String address;
        private int bondState;
        @JSONField(name = "isBounded")
        private boolean isBounded;
        @JSONField(name = "isBounding")
        private boolean isBounding;
        private int type;

        @JSONCreator
        public Bluetooth() {
            this((String) null, 0, false, false, 0, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Bluetooth copy$default(Bluetooth bluetooth, String str, int i, boolean z, boolean z2, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = bluetooth.address;
            }
            if ((i3 & 2) != 0) {
                i = bluetooth.bondState;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                z = bluetooth.isBounded;
            }
            boolean z3 = z;
            if ((i3 & 8) != 0) {
                z2 = bluetooth.isBounding;
            }
            boolean z4 = z2;
            if ((i3 & 16) != 0) {
                i2 = bluetooth.type;
            }
            return bluetooth.copy(str, i4, z3, z4, i2);
        }

        @Nullable
        public final String component1() {
            return this.address;
        }

        public final int component2() {
            return this.bondState;
        }

        public final boolean component3() {
            return this.isBounded;
        }

        public final boolean component4() {
            return this.isBounding;
        }

        public final int component5() {
            return this.type;
        }

        @NotNull
        public final Bluetooth copy(@JSONField(name = "address") @Nullable String str, @JSONField(name = "bondState") int i, boolean z, boolean z2, @JSONField(name = "type") int i2) {
            return new Bluetooth(str, i, z, z2, i2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bluetooth)) {
                return false;
            }
            Bluetooth bluetooth = (Bluetooth) obj;
            return Intrinsics.areEqual((Object) this.address, (Object) bluetooth.address) && this.bondState == bluetooth.bondState && this.isBounded == bluetooth.isBounded && this.isBounding == bluetooth.isBounding && this.type == bluetooth.type;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Bluetooth(address=");
            sb.append(this.address);
            sb.append(", bondState=");
            sb.append(this.bondState);
            sb.append(", isBounded=");
            sb.append(this.isBounded);
            sb.append(", isBounding=");
            sb.append(this.isBounding);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(")");
            return sb.toString();
        }

        @JSONCreator
        public Bluetooth(@JSONField(name = "address") @Nullable String str, @JSONField(name = "bondState") int i, boolean z, boolean z2, @JSONField(name = "type") int i2) {
            this.address = str;
            this.bondState = i;
            this.isBounded = z;
            this.isBounding = z2;
            this.type = i2;
        }

        @Nullable
        public final String getAddress() {
            return this.address;
        }

        public final void setAddress(@Nullable String str) {
            this.address = str;
        }

        public final int getBondState() {
            return this.bondState;
        }

        public final void setBondState(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(941580520, oncanceled);
                onCancelLoad.getMin(941580520, oncanceled);
            }
            this.bondState = i;
        }

        public final boolean isBounded() {
            return this.isBounded;
        }

        public final void setBounded(boolean z) {
            this.isBounded = z;
        }

        public final boolean isBounding() {
            return this.isBounding;
        }

        public final void setBounding(boolean z) {
            this.isBounding = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Bluetooth(java.lang.String r4, int r5, boolean r6, boolean r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0005
                r4 = 0
            L_0x0005:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L_0x000c
                r10 = 0
                goto L_0x000d
            L_0x000c:
                r10 = r5
            L_0x000d:
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                r1 = 0
                goto L_0x0014
            L_0x0013:
                r1 = r6
            L_0x0014:
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                r2 = 0
                goto L_0x001b
            L_0x001a:
                r2 = r7
            L_0x001b:
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0020
                goto L_0x0021
            L_0x0020:
                r0 = r8
            L_0x0021:
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r1
                r9 = r2
                r10 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo.Bluetooth.<init>(java.lang.String, int, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final int hashCode() {
            String str = this.address;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.bondState).hashCode()) * 31;
            boolean z = this.isBounded;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.isBounding;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + Integer.valueOf(this.type).hashCode();
        }
    }
}
