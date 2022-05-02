package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lid/dana/ocr/model/BaseOCRResultModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "success", "", "errorCode", "", "(ZLjava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getSuccess", "()Z", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class BaseOCRResultModel implements Parcelable {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR((byte) 0);
    private final boolean getMin;
    @Nullable
    private final String length;

    public int describeContents() {
        return 0;
    }

    public BaseOCRResultModel(boolean z, @Nullable String str) {
        this.getMin = z;
        this.length = str;
    }

    public boolean getMax() {
        return this.getMin;
    }

    @Nullable
    public String setMin() {
        return this.length;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseOCRResultModel(@NotNull Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(getMax() ? (byte) 1 : 0);
        parcel.writeString(setMin());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/ocr/model/BaseOCRResultModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lid/dana/ocr/model/BaseOCRResultModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lid/dana/ocr/model/BaseOCRResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class CREATOR implements Parcelable.Creator<BaseOCRResultModel> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BaseOCRResultModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BaseOCRResultModel[i];
        }
    }
}
