package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lid/dana/domain/requestmoney/model/BankSelectorConfig;", "", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "nameCheckConfig", "Lid/dana/domain/requestmoney/model/NameCheckConfig;", "topFeaturedBanks", "", "", "digitalMoneys", "Lid/dana/domain/sendmoney/model/DigitalMoney;", "(Lid/dana/domain/sendmoney/model/TransferInit;Lid/dana/domain/requestmoney/model/NameCheckConfig;Ljava/util/List;Ljava/util/List;)V", "getDigitalMoneys", "()Ljava/util/List;", "getNameCheckConfig", "()Lid/dana/domain/requestmoney/model/NameCheckConfig;", "getTopFeaturedBanks", "getTransferInit", "()Lid/dana/domain/sendmoney/model/TransferInit;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getParserIdentifier {
    @NotNull
    private final List<getMatchingBeaconTypeCode> digitalMoneys;
    @NotNull
    private final isMultiFrameBeacon nameCheckConfig;
    @NotNull
    private final List<String> topFeaturedBanks;
    @NotNull
    private final getDataFieldCount transferInit;

    public static /* synthetic */ getParserIdentifier copy$default(getParserIdentifier getparseridentifier, getDataFieldCount getdatafieldcount, isMultiFrameBeacon ismultiframebeacon, List<String> list, List<getMatchingBeaconTypeCode> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            getdatafieldcount = getparseridentifier.transferInit;
        }
        if ((i & 2) != 0) {
            ismultiframebeacon = getparseridentifier.nameCheckConfig;
        }
        if ((i & 4) != 0) {
            list = getparseridentifier.topFeaturedBanks;
        }
        if ((i & 8) != 0) {
            list2 = getparseridentifier.digitalMoneys;
        }
        return getparseridentifier.copy(getdatafieldcount, ismultiframebeacon, list, list2);
    }

    @NotNull
    public final getDataFieldCount component1() {
        return this.transferInit;
    }

    @NotNull
    public final isMultiFrameBeacon component2() {
        return this.nameCheckConfig;
    }

    @NotNull
    public final List<String> component3() {
        return this.topFeaturedBanks;
    }

    @NotNull
    public final List<getMatchingBeaconTypeCode> component4() {
        return this.digitalMoneys;
    }

    @NotNull
    public final getParserIdentifier copy(@NotNull getDataFieldCount getdatafieldcount, @NotNull isMultiFrameBeacon ismultiframebeacon, @NotNull List<String> list, @NotNull List<getMatchingBeaconTypeCode> list2) {
        Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
        Intrinsics.checkNotNullParameter(ismultiframebeacon, "nameCheckConfig");
        Intrinsics.checkNotNullParameter(list, "topFeaturedBanks");
        Intrinsics.checkNotNullParameter(list2, "digitalMoneys");
        return new getParserIdentifier(getdatafieldcount, ismultiframebeacon, list, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getParserIdentifier)) {
            return false;
        }
        getParserIdentifier getparseridentifier = (getParserIdentifier) obj;
        return Intrinsics.areEqual((Object) this.transferInit, (Object) getparseridentifier.transferInit) && Intrinsics.areEqual((Object) this.nameCheckConfig, (Object) getparseridentifier.nameCheckConfig) && Intrinsics.areEqual((Object) this.topFeaturedBanks, (Object) getparseridentifier.topFeaturedBanks) && Intrinsics.areEqual((Object) this.digitalMoneys, (Object) getparseridentifier.digitalMoneys);
    }

    public final int hashCode() {
        getDataFieldCount getdatafieldcount = this.transferInit;
        int i = 0;
        int hashCode = (getdatafieldcount != null ? getdatafieldcount.hashCode() : 0) * 31;
        isMultiFrameBeacon ismultiframebeacon = this.nameCheckConfig;
        int hashCode2 = (hashCode + (ismultiframebeacon != null ? ismultiframebeacon.hashCode() : 0)) * 31;
        List<String> list = this.topFeaturedBanks;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<getMatchingBeaconTypeCode> list2 = this.digitalMoneys;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankSelectorConfig(transferInit=");
        sb.append(this.transferInit);
        sb.append(", nameCheckConfig=");
        sb.append(this.nameCheckConfig);
        sb.append(", topFeaturedBanks=");
        sb.append(this.topFeaturedBanks);
        sb.append(", digitalMoneys=");
        sb.append(this.digitalMoneys);
        sb.append(")");
        return sb.toString();
    }

    public getParserIdentifier(@NotNull getDataFieldCount getdatafieldcount, @NotNull isMultiFrameBeacon ismultiframebeacon, @NotNull List<String> list, @NotNull List<getMatchingBeaconTypeCode> list2) {
        Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
        Intrinsics.checkNotNullParameter(ismultiframebeacon, "nameCheckConfig");
        Intrinsics.checkNotNullParameter(list, "topFeaturedBanks");
        Intrinsics.checkNotNullParameter(list2, "digitalMoneys");
        this.transferInit = getdatafieldcount;
        this.nameCheckConfig = ismultiframebeacon;
        this.topFeaturedBanks = list;
        this.digitalMoneys = list2;
    }

    @NotNull
    public final getDataFieldCount getTransferInit() {
        return this.transferInit;
    }

    @NotNull
    public final isMultiFrameBeacon getNameCheckConfig() {
        return this.nameCheckConfig;
    }

    @NotNull
    public final List<String> getTopFeaturedBanks() {
        return this.topFeaturedBanks;
    }

    @NotNull
    public final List<getMatchingBeaconTypeCode> getDigitalMoneys() {
        return this.digitalMoneys;
    }
}
