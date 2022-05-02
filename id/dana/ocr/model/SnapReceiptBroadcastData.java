package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 #2\u00020\u0001:\u0002#$B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lid/dana/ocr/model/SnapReceiptBroadcastData;", "Landroid/os/Parcelable;", "status", "", "statusMessage", "errorCode", "submitReceiptResult", "Lid/dana/ocr/model/SubmitReceiptResultModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/ocr/model/SubmitReceiptResultModel;)V", "getErrorCode", "()Ljava/lang/String;", "getStatus", "getStatusMessage", "getSubmitReceiptResult", "()Lid/dana/ocr/model/SubmitReceiptResultModel;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toIntent", "Landroid/content/Intent;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Status", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SnapReceiptBroadcastData implements Parcelable {
    public static final Parcelable.Creator<SnapReceiptBroadcastData> CREATOR = new Creator();
    @NotNull
    public static final Companion getMax = new Companion((byte) 0);
    @NotNull
    public final String getMin;
    @Nullable
    public final String length;
    @Nullable
    public final SubmitReceiptResultModel setMax;
    @Nullable
    public final String setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapReceiptBroadcastData)) {
            return false;
        }
        SnapReceiptBroadcastData snapReceiptBroadcastData = (SnapReceiptBroadcastData) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) snapReceiptBroadcastData.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) snapReceiptBroadcastData.setMin) && Intrinsics.areEqual((Object) this.length, (Object) snapReceiptBroadcastData.length) && Intrinsics.areEqual((Object) this.setMax, (Object) snapReceiptBroadcastData.setMax);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SubmitReceiptResultModel submitReceiptResultModel = this.setMax;
        if (submitReceiptResultModel != null) {
            i = submitReceiptResultModel.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapReceiptBroadcastData(status=");
        sb.append(this.getMin);
        sb.append(", statusMessage=");
        sb.append(this.setMin);
        sb.append(", errorCode=");
        sb.append(this.length);
        sb.append(", submitReceiptResult=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        SubmitReceiptResultModel submitReceiptResultModel = this.setMax;
        if (submitReceiptResultModel != null) {
            parcel.writeInt(1);
            submitReceiptResultModel.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public SnapReceiptBroadcastData(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable SubmitReceiptResultModel submitReceiptResultModel) {
        Intrinsics.checkNotNullParameter(str, "status");
        this.getMin = str;
        this.setMin = str2;
        this.length = str3;
        this.setMax = submitReceiptResultModel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/ocr/model/SnapReceiptBroadcastData$Companion;", "", "()V", "ERROR_CODE_KEY", "", "STATUS_KEY", "STATUS_MESSAGE_KEY", "SUBMIT_RECEIPT_RESULT_KEY", "UPLOAD_LOCAL_SERVICE_LISTENER", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/ocr/model/SnapReceiptBroadcastData$Status;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        @NotNull
        public static final Companion Companion = Companion.getMin;
        @NotNull
        public static final String Completed = "Completed";
        @NotNull
        public static final String Error = "Error";
        @NotNull
        public static final String InProgress = "InProgress";
        @NotNull
        public static final String Success = "Success";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/ocr/model/SnapReceiptBroadcastData$Status$Companion;", "", "()V", "Completed", "", "Error", "InProgress", "Success", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            static final /* synthetic */ Companion getMin = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SnapReceiptBroadcastData> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SnapReceiptBroadcastData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new SnapReceiptBroadcastData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SubmitReceiptResultModel.CREATOR.createFromParcel(parcel) : null);
        }
    }
}
