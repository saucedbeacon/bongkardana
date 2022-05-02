package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lid/dana/ocr/model/OcrAndUploadTaskModel;", "Lid/dana/ocr/model/SnapReceiptTaskModel;", "Landroid/os/Parcelable;", "id", "", "action", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "filePath", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/ocr/model/OCRRequestModel;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getFilePath", "getId", "getOcrRequestModel", "()Lid/dana/ocr/model/OCRRequestModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class OcrAndUploadTaskModel extends SnapReceiptTaskModel implements Parcelable {
    public static final Parcelable.Creator<OcrAndUploadTaskModel> CREATOR = new Creator();
    @NotNull
    public static final Companion setMax = new Companion((byte) 0);
    @NotNull
    public final OCRRequestModel getMax;
    @NotNull
    public final String getMin;
    @NotNull
    private final String length;
    @NotNull
    public final String setMin;

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeParcelable(this.getMax, i);
        parcel.writeString(this.getMin);
    }

    @NotNull
    public final String length() {
        return this.setMin;
    }

    public /* synthetic */ OcrAndUploadTaskModel(String str, OCRRequestModel oCRRequestModel, String str2) {
        this(str, "ocr_and_upload_task_action", oCRRequestModel, str2);
    }

    @NotNull
    public final String getMin() {
        return this.length;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OcrAndUploadTaskModel(@NotNull String str, @NotNull String str2, @NotNull OCRRequestModel oCRRequestModel, @NotNull String str3) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "action");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        Intrinsics.checkNotNullParameter(str3, "filePath");
        this.setMin = str;
        this.length = str2;
        this.getMax = oCRRequestModel;
        this.getMin = str3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/ocr/model/OcrAndUploadTaskModel$Companion;", "", "()V", "ocrAndUploadAction", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<OcrAndUploadTaskModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OcrAndUploadTaskModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new OcrAndUploadTaskModel(parcel.readString(), parcel.readString(), (OCRRequestModel) parcel.readParcelable(OcrAndUploadTaskModel.class.getClassLoader()), parcel.readString());
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OcrAndUploadTaskModel(id=");
        sb.append(this.setMin);
        sb.append(", action=");
        sb.append(this.length);
        sb.append(", ocrRequestModel=");
        sb.append(this.getMax);
        sb.append(", filePath=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        OCRRequestModel oCRRequestModel = this.getMax;
        int hashCode3 = (hashCode2 + (oCRRequestModel != null ? oCRRequestModel.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OcrAndUploadTaskModel)) {
            return false;
        }
        OcrAndUploadTaskModel ocrAndUploadTaskModel = (OcrAndUploadTaskModel) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) ocrAndUploadTaskModel.setMin) && Intrinsics.areEqual((Object) this.length, (Object) ocrAndUploadTaskModel.length) && Intrinsics.areEqual((Object) this.getMax, (Object) ocrAndUploadTaskModel.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) ocrAndUploadTaskModel.getMin);
    }
}
