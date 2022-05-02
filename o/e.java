package o;

import id.dana.nearbyme.di.module.HomeShoppingTncModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/BizDestination;", "", "bizParam", "", "secondaryBizParam", "(Ljava/lang/String;Ljava/lang/String;)V", "getBizParam", "()Ljava/lang/String;", "getSecondaryBizParam", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class e {
    @NotNull
    private final String bizParam;
    @Nullable
    private final String secondaryBizParam;

    public static /* synthetic */ e copy$default(e eVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.bizParam;
        }
        if ((i & 2) != 0) {
            str2 = eVar.secondaryBizParam;
        }
        return eVar.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.bizParam;
    }

    @Nullable
    public final String component2() {
        return this.secondaryBizParam;
    }

    @NotNull
    public final e copy(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "bizParam");
        return new e(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual((Object) this.bizParam, (Object) eVar.bizParam) && Intrinsics.areEqual((Object) this.secondaryBizParam, (Object) eVar.secondaryBizParam);
    }

    public final int hashCode() {
        String str = this.bizParam;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secondaryBizParam;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BizDestination(bizParam=");
        sb.append(this.bizParam);
        sb.append(", secondaryBizParam=");
        sb.append(this.secondaryBizParam);
        sb.append(")");
        return sb.toString();
    }

    public e(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "bizParam");
        this.bizParam = str;
        this.secondaryBizParam = str2;
    }

    @NotNull
    public final String getBizParam() {
        return this.bizParam;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    @Nullable
    public final String getSecondaryBizParam() {
        return this.secondaryBizParam;
    }

    /* renamed from: o.e$1  reason: invalid class name */
    public final class AnonymousClass1 implements getAdapterPosition<k.AnonymousClass4.getMax> {
        private final HomeShoppingTncModule getMax;

        public static k.AnonymousClass4.getMax length(HomeShoppingTncModule homeShoppingTncModule) {
            k.AnonymousClass4.getMax max = homeShoppingTncModule.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            k.AnonymousClass4.getMax max = this.getMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
