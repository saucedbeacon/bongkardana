package o;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b,\b\b\u0018\u00002\u00020\u0001:\u0001?B¯\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0014HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010:\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0014HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018¨\u0006@"}, d2 = {"Lid/dana/data/config/model/Device;", "", "androidId", "", "appVersion", "blueMac", "buildBoard", "buildBootloader", "buildBrand", "buildDevice", "buildManufacturer", "buildModel", "buildProduct", "fingerPrint", "isEmulator", "", "isRooted", "networkType", "osVersion", "osVersionInt", "", "timeZone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAndroidId", "()Ljava/lang/String;", "getAppVersion", "getBlueMac", "getBuildBoard", "getBuildBootloader", "getBuildBrand", "getBuildDevice", "getBuildManufacturer", "getBuildModel", "getBuildProduct", "getFingerPrint", "()Z", "getNetworkType", "getOsVersion", "getOsVersionInt", "()I", "getTimeZone", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Builder", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class tempExtension {
    @NotNull
    private final String androidId;
    @NotNull
    private final String appVersion;
    @NotNull
    private final String blueMac;
    @NotNull
    private final String buildBoard;
    @NotNull
    private final String buildBootloader;
    @NotNull
    private final String buildBrand;
    @NotNull
    private final String buildDevice;
    @NotNull
    private final String buildManufacturer;
    @NotNull
    private final String buildModel;
    @NotNull
    private final String buildProduct;
    @NotNull
    private final String fingerPrint;
    private final boolean isEmulator;
    private final boolean isRooted;
    @NotNull
    private final String networkType;
    @NotNull
    private final String osVersion;
    private final int osVersionInt;
    @NotNull
    private final String timeZone;

    public static /* synthetic */ tempExtension copy$default(tempExtension tempextension, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, String str12, String str13, int i, String str14, int i2, Object obj) {
        tempExtension tempextension2 = tempextension;
        int i3 = i2;
        return tempextension.copy((i3 & 1) != 0 ? tempextension2.androidId : str, (i3 & 2) != 0 ? tempextension2.appVersion : str2, (i3 & 4) != 0 ? tempextension2.blueMac : str3, (i3 & 8) != 0 ? tempextension2.buildBoard : str4, (i3 & 16) != 0 ? tempextension2.buildBootloader : str5, (i3 & 32) != 0 ? tempextension2.buildBrand : str6, (i3 & 64) != 0 ? tempextension2.buildDevice : str7, (i3 & 128) != 0 ? tempextension2.buildManufacturer : str8, (i3 & 256) != 0 ? tempextension2.buildModel : str9, (i3 & 512) != 0 ? tempextension2.buildProduct : str10, (i3 & 1024) != 0 ? tempextension2.fingerPrint : str11, (i3 & 2048) != 0 ? tempextension2.isEmulator : z, (i3 & 4096) != 0 ? tempextension2.isRooted : z2, (i3 & 8192) != 0 ? tempextension2.networkType : str12, (i3 & 16384) != 0 ? tempextension2.osVersion : str13, (i3 & 32768) != 0 ? tempextension2.osVersionInt : i, (i3 & 65536) != 0 ? tempextension2.timeZone : str14);
    }

    @NotNull
    public final String component1() {
        return this.androidId;
    }

    @NotNull
    public final String component10() {
        return this.buildProduct;
    }

    @NotNull
    public final String component11() {
        return this.fingerPrint;
    }

    public final boolean component12() {
        return this.isEmulator;
    }

    public final boolean component13() {
        return this.isRooted;
    }

    @NotNull
    public final String component14() {
        return this.networkType;
    }

    @NotNull
    public final String component15() {
        return this.osVersion;
    }

    public final int component16() {
        return this.osVersionInt;
    }

    @NotNull
    public final String component17() {
        return this.timeZone;
    }

    @NotNull
    public final String component2() {
        return this.appVersion;
    }

    @NotNull
    public final String component3() {
        return this.blueMac;
    }

    @NotNull
    public final String component4() {
        return this.buildBoard;
    }

    @NotNull
    public final String component5() {
        return this.buildBootloader;
    }

    @NotNull
    public final String component6() {
        return this.buildBrand;
    }

    @NotNull
    public final String component7() {
        return this.buildDevice;
    }

    @NotNull
    public final String component8() {
        return this.buildManufacturer;
    }

    @NotNull
    public final String component9() {
        return this.buildModel;
    }

    @NotNull
    public final tempExtension copy(@JSONField(name = "androidId") @NotNull String str, @JSONField(name = "appVersion") @NotNull String str2, @JSONField(name = "blueMac") @NotNull String str3, @JSONField(name = "buildBoard") @NotNull String str4, @JSONField(name = "buildBootloader") @NotNull String str5, @JSONField(name = "buildBrand") @NotNull String str6, @JSONField(name = "buildDevice") @NotNull String str7, @JSONField(name = "buildManufacturer") @NotNull String str8, @JSONField(name = "buildModel") @NotNull String str9, @JSONField(name = "buildProduct") @NotNull String str10, @JSONField(name = "fingerPrint") @NotNull String str11, @JSONField(name = "isEmulator") boolean z, @JSONField(name = "isRooted") boolean z2, @JSONField(name = "networkType") @NotNull String str12, @JSONField(name = "osVersion") @NotNull String str13, @JSONField(name = "osVersionInt") int i, @JSONField(name = "timeZone") @NotNull String str14) {
        String str15 = str;
        Intrinsics.checkNotNullParameter(str15, "androidId");
        Intrinsics.checkNotNullParameter(str2, "appVersion");
        Intrinsics.checkNotNullParameter(str3, "blueMac");
        Intrinsics.checkNotNullParameter(str4, "buildBoard");
        Intrinsics.checkNotNullParameter(str5, "buildBootloader");
        Intrinsics.checkNotNullParameter(str6, "buildBrand");
        Intrinsics.checkNotNullParameter(str7, "buildDevice");
        Intrinsics.checkNotNullParameter(str8, "buildManufacturer");
        Intrinsics.checkNotNullParameter(str9, "buildModel");
        Intrinsics.checkNotNullParameter(str10, "buildProduct");
        Intrinsics.checkNotNullParameter(str11, "fingerPrint");
        Intrinsics.checkNotNullParameter(str12, "networkType");
        Intrinsics.checkNotNullParameter(str13, "osVersion");
        Intrinsics.checkNotNullParameter(str14, RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
        return new tempExtension(str15, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, str12, str13, i, str14);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tempExtension)) {
            return false;
        }
        tempExtension tempextension = (tempExtension) obj;
        return Intrinsics.areEqual((Object) this.androidId, (Object) tempextension.androidId) && Intrinsics.areEqual((Object) this.appVersion, (Object) tempextension.appVersion) && Intrinsics.areEqual((Object) this.blueMac, (Object) tempextension.blueMac) && Intrinsics.areEqual((Object) this.buildBoard, (Object) tempextension.buildBoard) && Intrinsics.areEqual((Object) this.buildBootloader, (Object) tempextension.buildBootloader) && Intrinsics.areEqual((Object) this.buildBrand, (Object) tempextension.buildBrand) && Intrinsics.areEqual((Object) this.buildDevice, (Object) tempextension.buildDevice) && Intrinsics.areEqual((Object) this.buildManufacturer, (Object) tempextension.buildManufacturer) && Intrinsics.areEqual((Object) this.buildModel, (Object) tempextension.buildModel) && Intrinsics.areEqual((Object) this.buildProduct, (Object) tempextension.buildProduct) && Intrinsics.areEqual((Object) this.fingerPrint, (Object) tempextension.fingerPrint) && this.isEmulator == tempextension.isEmulator && this.isRooted == tempextension.isRooted && Intrinsics.areEqual((Object) this.networkType, (Object) tempextension.networkType) && Intrinsics.areEqual((Object) this.osVersion, (Object) tempextension.osVersion) && this.osVersionInt == tempextension.osVersionInt && Intrinsics.areEqual((Object) this.timeZone, (Object) tempextension.timeZone);
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
        sb.append(", fingerPrint=");
        sb.append(this.fingerPrint);
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
        sb.append(", timeZone=");
        sb.append(this.timeZone);
        sb.append(")");
        return sb.toString();
    }

    public tempExtension(@JSONField(name = "androidId") @NotNull String str, @JSONField(name = "appVersion") @NotNull String str2, @JSONField(name = "blueMac") @NotNull String str3, @JSONField(name = "buildBoard") @NotNull String str4, @JSONField(name = "buildBootloader") @NotNull String str5, @JSONField(name = "buildBrand") @NotNull String str6, @JSONField(name = "buildDevice") @NotNull String str7, @JSONField(name = "buildManufacturer") @NotNull String str8, @JSONField(name = "buildModel") @NotNull String str9, @JSONField(name = "buildProduct") @NotNull String str10, @JSONField(name = "fingerPrint") @NotNull String str11, @JSONField(name = "isEmulator") boolean z, @JSONField(name = "isRooted") boolean z2, @JSONField(name = "networkType") @NotNull String str12, @JSONField(name = "osVersion") @NotNull String str13, @JSONField(name = "osVersionInt") int i, @JSONField(name = "timeZone") @NotNull String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        Intrinsics.checkNotNullParameter(str15, "androidId");
        Intrinsics.checkNotNullParameter(str16, "appVersion");
        Intrinsics.checkNotNullParameter(str17, "blueMac");
        Intrinsics.checkNotNullParameter(str18, "buildBoard");
        Intrinsics.checkNotNullParameter(str19, "buildBootloader");
        Intrinsics.checkNotNullParameter(str20, "buildBrand");
        Intrinsics.checkNotNullParameter(str21, "buildDevice");
        Intrinsics.checkNotNullParameter(str22, "buildManufacturer");
        Intrinsics.checkNotNullParameter(str23, "buildModel");
        Intrinsics.checkNotNullParameter(str24, "buildProduct");
        Intrinsics.checkNotNullParameter(str25, "fingerPrint");
        Intrinsics.checkNotNullParameter(str26, "networkType");
        Intrinsics.checkNotNullParameter(str27, "osVersion");
        Intrinsics.checkNotNullParameter(str28, RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
        this.androidId = str15;
        this.appVersion = str16;
        this.blueMac = str17;
        this.buildBoard = str18;
        this.buildBootloader = str19;
        this.buildBrand = str20;
        this.buildDevice = str21;
        this.buildManufacturer = str22;
        this.buildModel = str23;
        this.buildProduct = str24;
        this.fingerPrint = str25;
        this.isEmulator = z;
        this.isRooted = z2;
        this.networkType = str26;
        this.osVersion = str27;
        this.osVersionInt = i;
        this.timeZone = str28;
    }

    @NotNull
    public final String getAndroidId() {
        return this.androidId;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getBlueMac() {
        return this.blueMac;
    }

    @NotNull
    public final String getBuildBoard() {
        return this.buildBoard;
    }

    @NotNull
    public final String getBuildBootloader() {
        return this.buildBootloader;
    }

    @NotNull
    public final String getBuildBrand() {
        return this.buildBrand;
    }

    @NotNull
    public final String getBuildDevice() {
        return this.buildDevice;
    }

    @NotNull
    public final String getBuildManufacturer() {
        return this.buildManufacturer;
    }

    @NotNull
    public final String getBuildModel() {
        return this.buildModel;
    }

    @NotNull
    public final String getBuildProduct() {
        return this.buildProduct;
    }

    @NotNull
    public final String getFingerPrint() {
        return this.fingerPrint;
    }

    public final boolean isEmulator() {
        return this.isEmulator;
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    @NotNull
    public final String getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final int getOsVersionInt() {
        return this.osVersionInt;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010!\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/data/config/model/Device$Builder;", "", "()V", "androidId", "", "appVersion", "blueMac", "buildBoard", "buildBootloader", "buildBrand", "buildDevice", "buildManufacturer", "buildModel", "buildProduct", "fingerPrint", "isEmulator", "", "isRooted", "networkType", "osVersion", "osVersionInt", "", "timeZone", "build", "Lid/dana/data/config/model/Device;", "withAndroidId", "withAppVersion", "withBlueMac", "withBuildBoard", "withBuildBootloader", "withBuildBrand", "withBuildDevice", "withBuildManufacturer", "withBuildModel", "withBuildProduct", "withFingerPrint", "withNetworkType", "withOsVersion", "withOsVersionInt", "withTimeZone", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private String androidId = "";
        private String appVersion = "";
        private String blueMac = "";
        private String buildBoard = "";
        private String buildBootloader = "";
        private String buildBrand = "";
        private String buildDevice = "";
        private String buildManufacturer = "";
        private String buildModel = "";
        private String buildProduct = "";
        private String fingerPrint = "";
        private boolean isEmulator;
        private boolean isRooted;
        private String networkType = "";
        private String osVersion = "";
        private int osVersionInt;
        private String timeZone = "TimeLocation()";

        @NotNull
        public final getMin withAndroidId(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.androidId = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withAppVersion(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.appVersion = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBlueMac(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.blueMac = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildBoard(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildBoard = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildBootloader(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildBootloader = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildBrand(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildBrand = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildDevice(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildDevice = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildManufacturer(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildManufacturer = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildModel(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildModel = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withBuildProduct(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.buildProduct = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withFingerPrint(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.fingerPrint = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin isEmulator(boolean z) {
            getMin getmin = this;
            getmin.isEmulator = z;
            return getmin;
        }

        @NotNull
        public final getMin isRooted(boolean z) {
            getMin getmin = this;
            getmin.isRooted = z;
            return getmin;
        }

        @NotNull
        public final getMin withNetworkType(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.networkType = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withOsVersion(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.osVersion = str;
            }
            return getmin;
        }

        @NotNull
        public final getMin withOsVersionInt(int i) {
            getMin getmin = this;
            getmin.osVersionInt = i;
            return getmin;
        }

        @NotNull
        public final getMin withTimeZone(@Nullable String str) {
            getMin getmin = this;
            if (str != null) {
                getmin.timeZone = str;
            }
            return getmin;
        }

        @NotNull
        public final tempExtension build() {
            return new tempExtension(this.androidId, this.appVersion, this.blueMac, this.buildBoard, this.buildBootloader, this.buildBrand, this.buildDevice, this.buildManufacturer, this.buildModel, this.buildProduct, this.fingerPrint, this.isEmulator, this.isRooted, this.networkType, this.osVersion, this.osVersionInt, this.timeZone);
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
        String str11 = this.fingerPrint;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z = this.isEmulator;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode11 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isRooted;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str12 = this.networkType;
        int hashCode12 = (i3 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.osVersion;
        int hashCode13 = (((hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31) + Integer.valueOf(this.osVersionInt).hashCode()) * 31;
        String str14 = this.timeZone;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode13 + i;
    }
}
