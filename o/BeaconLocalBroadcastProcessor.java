package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/saving/interactor/UpdateSaving;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/saving/model/SavingGoalView;", "Lid/dana/domain/saving/interactor/UpdateSaving$Param;", "savingRepository", "Lid/dana/domain/saving/SavingRepository;", "savingCategoryRepository", "Lid/dana/domain/saving/SavingCategoryRepository;", "(Lid/dana/domain/saving/SavingRepository;Lid/dana/domain/saving/SavingCategoryRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BeaconLocalBroadcastProcessor extends APWebChromeClient<BeaconManager, length> {
    private final toStringBuilder savingCategoryRepository;
    private final getBluetoothName savingRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingGoalView;", "savingUpdate", "savingCategories", "", "", "Lid/dana/domain/saving/model/SavingCategory;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T1, T2, R> implements removeNode<BeaconManager, Map<String, ? extends setDebug>, BeaconManager> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: o.setDebug} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object setMax(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                o.BeaconManager r2 = (o.BeaconManager) r2
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "savingUpdate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "savingCategories"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r2.getCategoryCode()
                java.lang.Object r0 = r3.get(r0)
                o.setDebug r0 = (o.setDebug) r0
                if (r0 != 0) goto L_0x0023
                java.lang.String r0 = "OTHERS"
                java.lang.Object r3 = r3.get(r0)
                r0 = r3
                o.setDebug r0 = (o.setDebug) r0
            L_0x0023:
                r2.setSavingCategory(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BeaconLocalBroadcastProcessor.getMin.setMax(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BeaconLocalBroadcastProcessor(@NotNull getBluetoothName getbluetoothname, @NotNull toStringBuilder tostringbuilder) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbluetoothname, "savingRepository");
        Intrinsics.checkNotNullParameter(tostringbuilder, "savingCategoryRepository");
        this.savingRepository = getbluetoothname;
        this.savingCategoryRepository = tostringbuilder;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BeaconManager> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        TitleBarRightButtonView.AnonymousClass1<BeaconManager> zip = TitleBarRightButtonView.AnonymousClass1.zip(this.savingRepository.updateSaving(length2.getSavingId(), length2.getCategoryCode(), length2.getTitle(), length2.getTargetAmount()), this.savingCategoryRepository.getSavingCategoriesMap(), getMin.setMin);
        Intrinsics.checkNotNullExpressionValue(zip, "Observable.zip(\n        …}\n            }\n        )");
        return zip;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/domain/saving/interactor/UpdateSaving$Param;", "", "savingId", "", "categoryCode", "title", "targetAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryCode", "()Ljava/lang/String;", "getSavingId", "getTargetAmount", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final String categoryCode;
        @NotNull
        private final String savingId;
        @NotNull
        private final String targetAmount;
        @NotNull
        private final String title;

        public static /* synthetic */ length copy$default(length length, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = length.savingId;
            }
            if ((i & 2) != 0) {
                str2 = length.categoryCode;
            }
            if ((i & 4) != 0) {
                str3 = length.title;
            }
            if ((i & 8) != 0) {
                str4 = length.targetAmount;
            }
            return length.copy(str, str2, str3, str4);
        }

        @NotNull
        public final String component1() {
            return this.savingId;
        }

        @NotNull
        public final String component2() {
            return this.categoryCode;
        }

        @NotNull
        public final String component3() {
            return this.title;
        }

        @NotNull
        public final String component4() {
            return this.targetAmount;
        }

        @NotNull
        public final length copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "savingId");
            Intrinsics.checkNotNullParameter(str2, "categoryCode");
            Intrinsics.checkNotNullParameter(str3, "title");
            Intrinsics.checkNotNullParameter(str4, "targetAmount");
            return new length(str, str2, str3, str4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return Intrinsics.areEqual((Object) this.savingId, (Object) length.savingId) && Intrinsics.areEqual((Object) this.categoryCode, (Object) length.categoryCode) && Intrinsics.areEqual((Object) this.title, (Object) length.title) && Intrinsics.areEqual((Object) this.targetAmount, (Object) length.targetAmount);
        }

        public final int hashCode() {
            String str = this.savingId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.categoryCode;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.targetAmount;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(savingId=");
            sb.append(this.savingId);
            sb.append(", categoryCode=");
            sb.append(this.categoryCode);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", targetAmount=");
            sb.append(this.targetAmount);
            sb.append(")");
            return sb.toString();
        }

        public length(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "savingId");
            Intrinsics.checkNotNullParameter(str2, "categoryCode");
            Intrinsics.checkNotNullParameter(str3, "title");
            Intrinsics.checkNotNullParameter(str4, "targetAmount");
            this.savingId = str;
            this.categoryCode = str2;
            this.title = str3;
            this.targetAmount = str4;
        }

        @NotNull
        public final String getSavingId() {
            return this.savingId;
        }

        @NotNull
        public final String getCategoryCode() {
            return this.categoryCode;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTargetAmount() {
            return this.targetAmount;
        }
    }
}
