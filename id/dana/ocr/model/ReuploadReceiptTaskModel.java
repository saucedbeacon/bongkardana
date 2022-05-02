package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lid/dana/ocr/model/ReuploadReceiptTaskModel;", "Lid/dana/ocr/model/SnapReceiptTaskModel;", "Landroid/os/Parcelable;", "id", "", "action", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/ocr/model/OCRRequestModel;)V", "getAction", "()Ljava/lang/String;", "getId", "getOcrRequestModel", "()Lid/dana/ocr/model/OCRRequestModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class ReuploadReceiptTaskModel extends SnapReceiptTaskModel implements Parcelable {
    public static final Parcelable.Creator<ReuploadReceiptTaskModel> CREATOR = new Creator();
    @NotNull
    public static final Companion setMax = new Companion((byte) 0);
    @NotNull
    public final OCRRequestModel getMax;
    @NotNull
    private final String getMin;
    @NotNull
    public final String length;

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.length);
        parcel.writeString(this.getMin);
        parcel.writeParcelable(this.getMax, i);
    }

    @NotNull
    public final String length() {
        return this.length;
    }

    public /* synthetic */ ReuploadReceiptTaskModel(String str, OCRRequestModel oCRRequestModel) {
        this(str, "reupload_task_action", oCRRequestModel);
    }

    @NotNull
    public final String getMin() {
        return this.getMin;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReuploadReceiptTaskModel(@NotNull String str, @NotNull String str2, @NotNull OCRRequestModel oCRRequestModel) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "action");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        this.length = str;
        this.getMin = str2;
        this.getMax = oCRRequestModel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/ocr/model/ReuploadReceiptTaskModel$Companion;", "", "()V", "reUploadAction", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ReuploadReceiptTaskModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ReuploadReceiptTaskModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new ReuploadReceiptTaskModel(parcel.readString(), parcel.readString(), (OCRRequestModel) parcel.readParcelable(ReuploadReceiptTaskModel.class.getClassLoader()));
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReuploadReceiptTaskModel(id=");
        sb.append(this.length);
        sb.append(", action=");
        sb.append(this.getMin);
        sb.append(", ocrRequestModel=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        OCRRequestModel oCRRequestModel = this.getMax;
        if (oCRRequestModel != null) {
            i = oCRRequestModel.hashCode();
        }
        return hashCode2 + i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReuploadReceiptTaskModel)) {
            return false;
        }
        ReuploadReceiptTaskModel reuploadReceiptTaskModel = (ReuploadReceiptTaskModel) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) reuploadReceiptTaskModel.length) && Intrinsics.areEqual((Object) this.getMin, (Object) reuploadReceiptTaskModel.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) reuploadReceiptTaskModel.getMax);
    }
}
