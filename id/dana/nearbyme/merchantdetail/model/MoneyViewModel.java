package id.dana.nearbyme.merchantdetail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.android.parcel.Parcelize;
import o.getAppDir;
import o.isOriginHasAppInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0000J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0000J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006$"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "Landroid/os/Parcelable;", "amount", "", "currency", "currencyCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getCurrencyCode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "getAmountLong", "", "getCleanAmount", "getDisplayAmount", "hashCode", "isLessThan", "maxTargetAmount", "isMoreThan", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class MoneyViewModel implements Parcelable {
    public static final Parcelable.Creator<MoneyViewModel> CREATOR = new getMin();
    @NotNull
    public static final length length = new length((byte) 0);
    @NotNull
    public final String getMin;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    public MoneyViewModel() {
        this((String) null, (String) null, (String) null, 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyViewModel)) {
            return false;
        }
        MoneyViewModel moneyViewModel = (MoneyViewModel) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) moneyViewModel.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) moneyViewModel.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) moneyViewModel.setMax);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyViewModel(amount=");
        sb.append(this.setMin);
        sb.append(", currency=");
        sb.append(this.getMin);
        sb.append(", currencyCode=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
    }

    public MoneyViewModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        Intrinsics.checkNotNullParameter(str3, AppsFlyerProperties.CURRENCY_CODE);
        this.setMin = str;
        this.getMin = str2;
        this.setMax = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyViewModel(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel$Companion;", "", "()V", "fromCurrencyAmountModel", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "currencyAmountModel", "Lid/dana/model/CurrencyAmountModel;", "fromMoneyView", "moneyView", "Lid/dana/domain/nearbyme/model/MoneyView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @NotNull
        public static MoneyViewModel length(@Nullable getAppDir getappdir) {
            String str = null;
            String amount = getappdir != null ? getappdir.getAmount() : null;
            String str2 = "";
            if (amount == null) {
                amount = str2;
            }
            String currency = getappdir != null ? getappdir.getCurrency() : null;
            if (currency == null) {
                currency = str2;
            }
            if (getappdir != null) {
                str = getappdir.getCurrencyCode();
            }
            if (str != null) {
                str2 = str;
            }
            return new MoneyViewModel(amount, currency, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<MoneyViewModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MoneyViewModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new MoneyViewModel(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final boolean getMax(@NotNull MoneyViewModel moneyViewModel) {
        Intrinsics.checkNotNullParameter(moneyViewModel, "maxTargetAmount");
        String cleanAll = isOriginHasAppInfo.getCleanAll(this.setMin);
        String str = "0";
        if (cleanAll == null) {
            cleanAll = str;
        }
        Long longOrNull = StringsKt.toLongOrNull(cleanAll);
        long j = 0;
        long longValue = longOrNull != null ? longOrNull.longValue() : 0;
        String cleanAll2 = isOriginHasAppInfo.getCleanAll(moneyViewModel.setMin);
        if (cleanAll2 != null) {
            str = cleanAll2;
        }
        Long longOrNull2 = StringsKt.toLongOrNull(str);
        if (longOrNull2 != null) {
            j = longOrNull2.longValue();
        }
        return longValue > j;
    }

    public final boolean getMin(@NotNull MoneyViewModel moneyViewModel) {
        Intrinsics.checkNotNullParameter(moneyViewModel, "maxTargetAmount");
        String cleanAll = isOriginHasAppInfo.getCleanAll(this.setMin);
        String str = "0";
        if (cleanAll == null) {
            cleanAll = str;
        }
        Long longOrNull = StringsKt.toLongOrNull(cleanAll);
        long j = 0;
        long longValue = longOrNull != null ? longOrNull.longValue() : 0;
        String cleanAll2 = isOriginHasAppInfo.getCleanAll(moneyViewModel.setMin);
        if (cleanAll2 != null) {
            str = cleanAll2;
        }
        Long longOrNull2 = StringsKt.toLongOrNull(str);
        if (longOrNull2 != null) {
            j = longOrNull2.longValue();
        }
        return longValue < j;
    }
}
