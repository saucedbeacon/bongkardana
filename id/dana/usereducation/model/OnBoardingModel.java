package id.dana.usereducation.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006("}, d2 = {"Lid/dana/usereducation/model/OnBoardingModel;", "Landroid/os/Parcelable;", "title", "", "type", "contentOnBoardingModels", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "scenario", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContentOnBoardingModels", "()Ljava/util/List;", "setContentOnBoardingModels", "(Ljava/util/List;)V", "getScenario", "()Ljava/lang/String;", "setScenario", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class OnBoardingModel implements Parcelable {
    public static final Parcelable.Creator<OnBoardingModel> CREATOR = new getMin();
    @NotNull
    public List<ContentOnBoardingModel> getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String length;
    @NotNull
    public String setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBoardingModel)) {
            return false;
        }
        OnBoardingModel onBoardingModel = (OnBoardingModel) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) onBoardingModel.getMin) && Intrinsics.areEqual((Object) this.length, (Object) onBoardingModel.length) && Intrinsics.areEqual((Object) this.getMax, (Object) onBoardingModel.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) onBoardingModel.setMin);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ContentOnBoardingModel> list = this.getMax;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OnBoardingModel(title=");
        sb.append(this.getMin);
        sb.append(", type=");
        sb.append(this.length);
        sb.append(", contentOnBoardingModels=");
        sb.append(this.getMax);
        sb.append(", scenario=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        List<ContentOnBoardingModel> list = this.getMax;
        parcel.writeInt(list.size());
        for (ContentOnBoardingModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.setMin);
    }

    public OnBoardingModel(@NotNull String str, @NotNull String str2, @NotNull List<ContentOnBoardingModel> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "contentOnBoardingModels");
        Intrinsics.checkNotNullParameter(str3, "scenario");
        this.getMin = str;
        this.length = str2;
        this.getMax = list;
        this.setMin = str3;
    }

    public /* synthetic */ OnBoardingModel(String str, String str2, List list) {
        this(str, str2, list, "");
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<OnBoardingModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OnBoardingModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(ContentOnBoardingModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new OnBoardingModel(readString, readString2, arrayList, parcel.readString());
        }
    }
}
