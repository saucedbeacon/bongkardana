package id.dana.statement.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003Jm\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\bHÖ\u0001J\t\u00103\u001a\u00020\nHÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00069"}, d2 = {"Lid/dana/statement/model/UserStatementModel;", "Landroid/os/Parcelable;", "accumulateAmount", "Lid/dana/model/CurrencyAmountModel;", "statementSummaries", "", "Lid/dana/statement/model/StatementSummaryModel;", "viewType", "", "statementType", "", "totalIncome", "totalExpense", "month", "runningDate", "(Lid/dana/model/CurrencyAmountModel;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccumulateAmount", "()Lid/dana/model/CurrencyAmountModel;", "getMonth", "()Ljava/lang/String;", "setMonth", "(Ljava/lang/String;)V", "getRunningDate", "setRunningDate", "getStatementSummaries", "()Ljava/util/List;", "getStatementType", "setStatementType", "getTotalExpense", "setTotalExpense", "getTotalIncome", "setTotalIncome", "getViewType", "()I", "setViewType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class UserStatementModel implements Parcelable {
    public static final Parcelable.Creator<UserStatementModel> CREATOR = new getMin();
    @Nullable
    public String IsOverlapping;
    @Nullable
    public String equals;
    public int getMax;
    @Nullable
    public final List<StatementSummaryModel> getMin;
    @Nullable
    public String length;
    @Nullable
    public final CurrencyAmountModel setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toIntRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStatementModel)) {
            return false;
        }
        UserStatementModel userStatementModel = (UserStatementModel) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) userStatementModel.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) userStatementModel.getMin) && this.getMax == userStatementModel.getMax && Intrinsics.areEqual((Object) this.setMin, (Object) userStatementModel.setMin) && Intrinsics.areEqual((Object) this.length, (Object) userStatementModel.length) && Intrinsics.areEqual((Object) this.toIntRange, (Object) userStatementModel.toIntRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) userStatementModel.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) userStatementModel.equals);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStatementModel(accumulateAmount=");
        sb.append(this.setMax);
        sb.append(", statementSummaries=");
        sb.append(this.getMin);
        sb.append(", viewType=");
        sb.append(this.getMax);
        sb.append(", statementType=");
        sb.append(this.setMin);
        sb.append(", totalIncome=");
        sb.append(this.length);
        sb.append(", totalExpense=");
        sb.append(this.toIntRange);
        sb.append(", month=");
        sb.append(this.IsOverlapping);
        sb.append(", runningDate=");
        sb.append(this.equals);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.setMax, i);
        List<StatementSummaryModel> list = this.getMin;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (StatementSummaryModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
    }

    public UserStatementModel(@Nullable CurrencyAmountModel currencyAmountModel, @Nullable List<StatementSummaryModel> list, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.setMax = currencyAmountModel;
        this.getMin = list;
        this.getMax = i;
        this.setMin = str;
        this.length = str2;
        this.toIntRange = str3;
        this.IsOverlapping = str4;
        this.equals = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserStatementModel(id.dana.model.CurrencyAmountModel r13, java.util.List r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r7 = r2
            goto L_0x000c
        L_0x000a:
            r7 = r16
        L_0x000c:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0012
            r8 = r2
            goto L_0x0014
        L_0x0012:
            r8 = r17
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r18
        L_0x001c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0022
            r10 = r2
            goto L_0x0024
        L_0x0022:
            r10 = r19
        L_0x0024:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002a
            r11 = r2
            goto L_0x002c
        L_0x002a:
            r11 = r20
        L_0x002c:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.statement.model.UserStatementModel.<init>(id.dana.model.CurrencyAmountModel, java.util.List, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<UserStatementModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UserStatementModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            CurrencyAmountModel currencyAmountModel = (CurrencyAmountModel) parcel.readParcelable(UserStatementModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(StatementSummaryModel.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new UserStatementModel(currencyAmountModel, arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final int hashCode() {
        CurrencyAmountModel currencyAmountModel = this.setMax;
        int i = 0;
        int hashCode = (currencyAmountModel != null ? currencyAmountModel.hashCode() : 0) * 31;
        List<StatementSummaryModel> list = this.getMin;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.valueOf(this.getMax).hashCode()) * 31;
        String str = this.setMin;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.length;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.toIntRange;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.IsOverlapping;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.equals;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }
}
