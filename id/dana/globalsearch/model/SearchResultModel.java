package id.dana.globalsearch.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JM\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006%"}, d2 = {"Lid/dana/globalsearch/model/SearchResultModel;", "", "categoryName", "", "requiresLocationPermission", "", "paySearchInfos", "", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "hasSeeAll", "limitList", "", "shouldLoadMore", "(Ljava/lang/String;ZLjava/util/List;ZIZ)V", "getCategoryName", "()Ljava/lang/String;", "getHasSeeAll", "()Z", "getLimitList", "()I", "getPaySearchInfos", "()Ljava/util/List;", "setPaySearchInfos", "(Ljava/util/List;)V", "getRequiresLocationPermission", "getShouldLoadMore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchResultModel {
    @Nullable
    private final String categoryName;
    private final boolean hasSeeAll;
    private final int limitList;
    @NotNull
    private List<PaySearchInfoModel> paySearchInfos;
    private final boolean requiresLocationPermission;
    private final boolean shouldLoadMore;

    public SearchResultModel() {
        this((String) null, false, (List) null, false, 0, false, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SearchResultModel copy$default(SearchResultModel searchResultModel, String str, boolean z, List<PaySearchInfoModel> list, boolean z2, int i, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchResultModel.categoryName;
        }
        if ((i2 & 2) != 0) {
            z = searchResultModel.requiresLocationPermission;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            list = searchResultModel.paySearchInfos;
        }
        List<PaySearchInfoModel> list2 = list;
        if ((i2 & 8) != 0) {
            z2 = searchResultModel.hasSeeAll;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            i = searchResultModel.limitList;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z3 = searchResultModel.shouldLoadMore;
        }
        return searchResultModel.copy(str, z4, list2, z5, i3, z3);
    }

    @Nullable
    public final String component1() {
        return this.categoryName;
    }

    public final boolean component2() {
        return this.requiresLocationPermission;
    }

    @NotNull
    public final List<PaySearchInfoModel> component3() {
        return this.paySearchInfos;
    }

    public final boolean component4() {
        return this.hasSeeAll;
    }

    public final int component5() {
        return this.limitList;
    }

    public final boolean component6() {
        return this.shouldLoadMore;
    }

    @NotNull
    public final SearchResultModel copy(@Nullable String str, boolean z, @NotNull List<PaySearchInfoModel> list, boolean z2, int i, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "paySearchInfos");
        return new SearchResultModel(str, z, list, z2, i, z3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultModel)) {
            return false;
        }
        SearchResultModel searchResultModel = (SearchResultModel) obj;
        return Intrinsics.areEqual((Object) this.categoryName, (Object) searchResultModel.categoryName) && this.requiresLocationPermission == searchResultModel.requiresLocationPermission && Intrinsics.areEqual((Object) this.paySearchInfos, (Object) searchResultModel.paySearchInfos) && this.hasSeeAll == searchResultModel.hasSeeAll && this.limitList == searchResultModel.limitList && this.shouldLoadMore == searchResultModel.shouldLoadMore;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResultModel(categoryName=");
        sb.append(this.categoryName);
        sb.append(", requiresLocationPermission=");
        sb.append(this.requiresLocationPermission);
        sb.append(", paySearchInfos=");
        sb.append(this.paySearchInfos);
        sb.append(", hasSeeAll=");
        sb.append(this.hasSeeAll);
        sb.append(", limitList=");
        sb.append(this.limitList);
        sb.append(", shouldLoadMore=");
        sb.append(this.shouldLoadMore);
        sb.append(")");
        return sb.toString();
    }

    public SearchResultModel(@Nullable String str, boolean z, @NotNull List<PaySearchInfoModel> list, boolean z2, int i, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "paySearchInfos");
        this.categoryName = str;
        this.requiresLocationPermission = z;
        this.paySearchInfos = list;
        this.hasSeeAll = z2;
        this.limitList = i;
        this.shouldLoadMore = z3;
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final boolean getRequiresLocationPermission() {
        return this.requiresLocationPermission;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchResultModel(java.lang.String r5, boolean r6, java.util.List r7, boolean r8, int r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000c
            r12 = 0
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0015
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0015:
            r1 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001c
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = r8
        L_0x001d:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = r9
        L_0x0024:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r10
        L_0x002a:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.globalsearch.model.SearchResultModel.<init>(java.lang.String, boolean, java.util.List, boolean, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<PaySearchInfoModel> getPaySearchInfos() {
        return this.paySearchInfos;
    }

    public final void setPaySearchInfos(@NotNull List<PaySearchInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.paySearchInfos = list;
    }

    public final boolean getHasSeeAll() {
        return this.hasSeeAll;
    }

    public final int getLimitList() {
        return this.limitList;
    }

    public final boolean getShouldLoadMore() {
        return this.shouldLoadMore;
    }

    public final int hashCode() {
        String str = this.categoryName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.requiresLocationPermission;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        List<PaySearchInfoModel> list = this.paySearchInfos;
        if (list != null) {
            i = list.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.hasSeeAll;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((i3 + (z3 ? 1 : 0)) * 31) + Integer.valueOf(this.limitList).hashCode()) * 31;
        boolean z4 = this.shouldLoadMore;
        if (!z4) {
            z2 = z4;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }
}
