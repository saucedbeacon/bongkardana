package o;

import com.alibaba.fastjson.annotation.JSONField;
import id.dana.data.saving.model.MainEmptyStateEntity;
import id.dana.data.saving.model.SavingBenefitEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/data/saving/model/SavingEmptyStateEntity;", "", "mainEmptyState", "Lid/dana/data/saving/model/MainEmptyStateEntity;", "savingBenefit", "", "Lid/dana/data/saving/model/SavingBenefitEntity;", "(Lid/dana/data/saving/model/MainEmptyStateEntity;Ljava/util/List;)V", "getMainEmptyState", "()Lid/dana/data/saving/model/MainEmptyStateEntity;", "setMainEmptyState", "(Lid/dana/data/saving/model/MainEmptyStateEntity;)V", "getSavingBenefit", "()Ljava/util/List;", "setSavingBenefit", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class url {
    @NotNull
    MainEmptyStateEntity mainEmptyState;
    @NotNull
    List<SavingBenefitEntity> savingBenefit;

    public /* synthetic */ url() {
    }

    public static /* synthetic */ url copy$default(url url, MainEmptyStateEntity mainEmptyStateEntity, List<SavingBenefitEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            mainEmptyStateEntity = url.mainEmptyState;
        }
        if ((i & 2) != 0) {
            list = url.savingBenefit;
        }
        return url.copy(mainEmptyStateEntity, list);
    }

    @NotNull
    public final MainEmptyStateEntity component1() {
        return this.mainEmptyState;
    }

    @NotNull
    public final List<SavingBenefitEntity> component2() {
        return this.savingBenefit;
    }

    @NotNull
    public final url copy(@JSONField(name = "main_empty_state") @NotNull MainEmptyStateEntity mainEmptyStateEntity, @JSONField(name = "benefit_list") @NotNull List<SavingBenefitEntity> list) {
        Intrinsics.checkNotNullParameter(mainEmptyStateEntity, "mainEmptyState");
        Intrinsics.checkNotNullParameter(list, "savingBenefit");
        return new url(mainEmptyStateEntity, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof url)) {
            return false;
        }
        url url = (url) obj;
        return Intrinsics.areEqual((Object) this.mainEmptyState, (Object) url.mainEmptyState) && Intrinsics.areEqual((Object) this.savingBenefit, (Object) url.savingBenefit);
    }

    public final int hashCode() {
        MainEmptyStateEntity mainEmptyStateEntity = this.mainEmptyState;
        int i = 0;
        int hashCode = (mainEmptyStateEntity != null ? mainEmptyStateEntity.hashCode() : 0) * 31;
        List<SavingBenefitEntity> list = this.savingBenefit;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingEmptyStateEntity(mainEmptyState=");
        sb.append(this.mainEmptyState);
        sb.append(", savingBenefit=");
        sb.append(this.savingBenefit);
        sb.append(")");
        return sb.toString();
    }

    public url(@JSONField(name = "main_empty_state") @NotNull MainEmptyStateEntity mainEmptyStateEntity, @JSONField(name = "benefit_list") @NotNull List<SavingBenefitEntity> list) {
        Intrinsics.checkNotNullParameter(mainEmptyStateEntity, "mainEmptyState");
        Intrinsics.checkNotNullParameter(list, "savingBenefit");
        this.mainEmptyState = mainEmptyStateEntity;
        this.savingBenefit = list;
    }

    @NotNull
    public final MainEmptyStateEntity getMainEmptyState() {
        return this.mainEmptyState;
    }

    public final void setMainEmptyState(@NotNull MainEmptyStateEntity mainEmptyStateEntity) {
        Intrinsics.checkNotNullParameter(mainEmptyStateEntity, "<set-?>");
        this.mainEmptyState = mainEmptyStateEntity;
    }

    @NotNull
    public final List<SavingBenefitEntity> getSavingBenefit() {
        return this.savingBenefit;
    }

    public final void setSavingBenefit(@NotNull List<SavingBenefitEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.savingBenefit = list;
    }
}
