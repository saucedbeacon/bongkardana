package id.dana.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lid/dana/home/model/EddQuestionInfoDTOModel;", "Landroid/os/Parcelable;", "questionId", "", "question", "eddAnswerInfoModels", "", "Lid/dana/home/model/EddAnswerInfoDTOModel;", "type", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getEddAnswerInfoModels", "()Ljava/util/List;", "getQuestion", "()Ljava/lang/String;", "getQuestionId", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class EddQuestionInfoDTOModel implements Parcelable {
    public static final Parcelable.Creator<EddQuestionInfoDTOModel> CREATOR = new getMin();
    @NotNull
    public final String getMin;
    public int length;
    @NotNull
    public final List<EddAnswerInfoDTOModel> setMax;
    @NotNull
    public final String setMin;

    public EddQuestionInfoDTOModel() {
        this((String) null, (String) null, (List) null, 0, 15);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EddQuestionInfoDTOModel)) {
            return false;
        }
        EddQuestionInfoDTOModel eddQuestionInfoDTOModel = (EddQuestionInfoDTOModel) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) eddQuestionInfoDTOModel.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) eddQuestionInfoDTOModel.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) eddQuestionInfoDTOModel.setMax) && this.length == eddQuestionInfoDTOModel.length;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EddQuestionInfoDTOModel(questionId=");
        sb.append(this.setMin);
        sb.append(", question=");
        sb.append(this.getMin);
        sb.append(", eddAnswerInfoModels=");
        sb.append(this.setMax);
        sb.append(", type=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        List<EddAnswerInfoDTOModel> list = this.setMax;
        parcel.writeInt(list.size());
        for (EddAnswerInfoDTOModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.length);
    }

    public EddQuestionInfoDTOModel(@NotNull String str, @NotNull String str2, @NotNull List<EddAnswerInfoDTOModel> list, int i) {
        Intrinsics.checkNotNullParameter(str, "questionId");
        Intrinsics.checkNotNullParameter(str2, RequestConstants.KEY_QUESTION);
        Intrinsics.checkNotNullParameter(list, "eddAnswerInfoModels");
        this.setMin = str;
        this.getMin = str2;
        this.setMax = list;
        this.length = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EddQuestionInfoDTOModel(String str, String str2, List list, int i, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 1 : i);
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<EddQuestionInfoDTOModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EddQuestionInfoDTOModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(EddAnswerInfoDTOModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new EddQuestionInfoDTOModel(readString, readString2, arrayList, parcel.readInt());
        }
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<EddAnswerInfoDTOModel> list = this.setMax;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.valueOf(this.length).hashCode();
    }
}
