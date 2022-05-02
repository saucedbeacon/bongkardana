package id.dana.usereducation.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.setCheckBoxPrompt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\tB1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006,"}, d2 = {"Lid/dana/usereducation/model/ContentOnBoardingModel;", "Landroid/os/Parcelable;", "image", "", "subtitle", "", "description", "(ILjava/lang/String;Ljava/lang/String;)V", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "imageSource", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getImage", "()I", "setImage", "(I)V", "getImageSource", "setImageSource", "getImageUrl", "setImageUrl", "getSubtitle", "setSubtitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class ContentOnBoardingModel implements Parcelable {
    public static final Parcelable.Creator<ContentOnBoardingModel> CREATOR = new setMax();
    @NotNull
    private String getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String length;
    public int setMax;
    @NotNull
    public String setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentOnBoardingModel)) {
            return false;
        }
        ContentOnBoardingModel contentOnBoardingModel = (ContentOnBoardingModel) obj;
        return this.setMax == contentOnBoardingModel.setMax && Intrinsics.areEqual((Object) this.length, (Object) contentOnBoardingModel.length) && Intrinsics.areEqual((Object) this.getMin, (Object) contentOnBoardingModel.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) contentOnBoardingModel.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) contentOnBoardingModel.getMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentOnBoardingModel(image=");
        sb.append(this.setMax);
        sb.append(", imageUrl=");
        sb.append(this.length);
        sb.append(", subtitle=");
        sb.append(this.getMin);
        sb.append(", description=");
        sb.append(this.setMin);
        sb.append(", imageSource=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
    }

    public ContentOnBoardingModel(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "subtitle");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "imageSource");
        this.setMax = i;
        this.length = str;
        this.getMin = str2;
        this.setMin = str3;
        this.getMax = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ContentOnBoardingModel(int i, String str, String str2, String str3, String str4, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, str2, str3, str4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentOnBoardingModel(@DrawableRes int i, @NotNull String str, @NotNull String str2) {
        this(i, (String) null, str, str2, setCheckBoxPrompt.length.SOURCE_LOCAL, 2);
        Intrinsics.checkNotNullParameter(str, "subtitle");
        Intrinsics.checkNotNullParameter(str2, "description");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentOnBoardingModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(0, str, str2, str3, "URL", 1);
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "subtitle");
        Intrinsics.checkNotNullParameter(str3, "description");
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<ContentOnBoardingModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ContentOnBoardingModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new ContentOnBoardingModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.setMax).hashCode() * 31;
        String str = this.length;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.getMin;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMax;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }
}
