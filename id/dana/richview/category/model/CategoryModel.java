package id.dana.richview.category.model;

import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import o.isLayoutRtlSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010'\u001a\u00020\u001fH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR \u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lid/dana/richview/category/model/CategoryModel;", "", "()V", "chipName", "", "getChipName", "()Ljava/lang/String;", "setChipName", "(Ljava/lang/String;)V", "filters", "", "Lid/dana/common/model/OptionModel;", "getFilters", "()Ljava/util/List;", "setFilters", "(Ljava/util/List;)V", "id", "getId", "setId", "isSelected", "", "()Z", "setSelected", "(Z)V", "name", "getName", "setName", "sorts", "getSorts", "setSorts", "viewType", "", "getViewType$annotations", "getViewType", "()I", "setViewType", "(I)V", "equals", "other", "hashCode", "ViewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CategoryModel {
    @NotNull
    public List<isLayoutRtlSupport> equals = new ArrayList();
    public boolean getMax;
    @Nullable
    public String getMin;
    @NotNull
    public List<isLayoutRtlSupport> length = new ArrayList();
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    public int toFloatRange;

    public final boolean length() {
        return this.getMax;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CategoryModel)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        CategoryModel categoryModel = (CategoryModel) obj;
        String str = categoryModel.setMin;
        if (str != null) {
            return Intrinsics.areEqual((Object) str, (Object) this.setMin);
        }
        int i = categoryModel.toFloatRange;
        if (i != 0 && i == this.toFloatRange) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.setMin;
        return ((str != null ? str.hashCode() : 0) * 31) + this.toFloatRange;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/richview/category/model/CategoryModel$ViewType;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        public static final int CATEGORY_VIEW = 1;
        @NotNull
        public static final length Companion = length.getMin;
        public static final int SHIMMER_VIEW = 2;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/richview/category/model/CategoryModel$ViewType$Companion;", "", "()V", "CATEGORY_VIEW", "", "SHIMMER_VIEW", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            static final /* synthetic */ length getMin = new length();

            private length() {
            }
        }
    }
}
