package id.dana.data.globalsearch.source.network.result;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u001d"}, d2 = {"Lid/dana/data/globalsearch/source/network/result/PaginatorEntity;", "", "offset", "", "pageNum", "totalCount", "totalPage", "pageSize", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageNum", "getPageSize", "getTotalCount", "getTotalPage", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lid/dana/data/globalsearch/source/network/result/PaginatorEntity;", "equals", "", "other", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class PaginatorEntity {
    @Nullable
    private final Integer offset;
    @Nullable
    private final Integer pageNum;
    @Nullable
    private final Integer pageSize;
    @Nullable
    private final Integer totalCount;
    @Nullable
    private final Integer totalPage;

    public static /* synthetic */ PaginatorEntity copy$default(PaginatorEntity paginatorEntity, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = paginatorEntity.offset;
        }
        if ((i & 2) != 0) {
            num2 = paginatorEntity.pageNum;
        }
        Integer num6 = num2;
        if ((i & 4) != 0) {
            num3 = paginatorEntity.totalCount;
        }
        Integer num7 = num3;
        if ((i & 8) != 0) {
            num4 = paginatorEntity.totalPage;
        }
        Integer num8 = num4;
        if ((i & 16) != 0) {
            num5 = paginatorEntity.pageSize;
        }
        return paginatorEntity.copy(num, num6, num7, num8, num5);
    }

    @Nullable
    public final Integer component1() {
        return this.offset;
    }

    @Nullable
    public final Integer component2() {
        return this.pageNum;
    }

    @Nullable
    public final Integer component3() {
        return this.totalCount;
    }

    @Nullable
    public final Integer component4() {
        return this.totalPage;
    }

    @Nullable
    public final Integer component5() {
        return this.pageSize;
    }

    @NotNull
    public final PaginatorEntity copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        return new PaginatorEntity(num, num2, num3, num4, num5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaginatorEntity)) {
            return false;
        }
        PaginatorEntity paginatorEntity = (PaginatorEntity) obj;
        return Intrinsics.areEqual((Object) this.offset, (Object) paginatorEntity.offset) && Intrinsics.areEqual((Object) this.pageNum, (Object) paginatorEntity.pageNum) && Intrinsics.areEqual((Object) this.totalCount, (Object) paginatorEntity.totalCount) && Intrinsics.areEqual((Object) this.totalPage, (Object) paginatorEntity.totalPage) && Intrinsics.areEqual((Object) this.pageSize, (Object) paginatorEntity.pageSize);
    }

    public final int hashCode() {
        Integer num = this.offset;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.pageNum;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.totalCount;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.totalPage;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.pageSize;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaginatorEntity(offset=");
        sb.append(this.offset);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", totalPage=");
        sb.append(this.totalPage);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(")");
        return sb.toString();
    }

    public PaginatorEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.offset = num;
        this.pageNum = num2;
        this.totalCount = num3;
        this.totalPage = num4;
        this.pageSize = num5;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }
}
