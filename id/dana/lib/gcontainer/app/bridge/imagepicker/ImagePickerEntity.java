package id.dana.lib.gcontainer.app.bridge.imagepicker;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/imagepicker/ImagePickerEntity;", "", "dialogTitle", "", "qualityLevel", "", "height", "width", "(Ljava/lang/String;III)V", "getDialogTitle", "()Ljava/lang/String;", "setDialogTitle", "(Ljava/lang/String;)V", "getHeight", "()I", "setHeight", "(I)V", "getQualityLevel", "setQualityLevel", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class ImagePickerEntity {
    @Nullable
    private String dialogTitle;
    private int height;
    private int qualityLevel;
    private int width;

    @JSONCreator
    public ImagePickerEntity() {
        this((String) null, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ImagePickerEntity copy$default(ImagePickerEntity imagePickerEntity, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = imagePickerEntity.dialogTitle;
        }
        if ((i4 & 2) != 0) {
            i = imagePickerEntity.qualityLevel;
        }
        if ((i4 & 4) != 0) {
            i2 = imagePickerEntity.height;
        }
        if ((i4 & 8) != 0) {
            i3 = imagePickerEntity.width;
        }
        return imagePickerEntity.copy(str, i, i2, i3);
    }

    @Nullable
    public final String component1() {
        return this.dialogTitle;
    }

    public final int component2() {
        return this.qualityLevel;
    }

    public final int component3() {
        return this.height;
    }

    public final int component4() {
        return this.width;
    }

    @NotNull
    public final ImagePickerEntity copy(@Nullable String str, int i, int i2, int i3) {
        return new ImagePickerEntity(str, i, i2, i3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePickerEntity)) {
            return false;
        }
        ImagePickerEntity imagePickerEntity = (ImagePickerEntity) obj;
        return Intrinsics.areEqual((Object) this.dialogTitle, (Object) imagePickerEntity.dialogTitle) && this.qualityLevel == imagePickerEntity.qualityLevel && this.height == imagePickerEntity.height && this.width == imagePickerEntity.width;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ImagePickerEntity(dialogTitle=");
        sb.append(this.dialogTitle);
        sb.append(", qualityLevel=");
        sb.append(this.qualityLevel);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public ImagePickerEntity(@Nullable String str, int i, int i2, int i3) {
        this.dialogTitle = str;
        this.qualityLevel = i;
        this.height = i2;
        this.width = i3;
    }

    @Nullable
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final void setDialogTitle(@Nullable String str) {
        this.dialogTitle = str;
    }

    public final int getQualityLevel() {
        return this.qualityLevel;
    }

    public final void setQualityLevel(int i) {
        this.qualityLevel = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImagePickerEntity(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final int hashCode() {
        String str = this.dialogTitle;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.qualityLevel).hashCode()) * 31) + Integer.valueOf(this.height).hashCode()) * 31) + Integer.valueOf(this.width).hashCode();
    }
}
