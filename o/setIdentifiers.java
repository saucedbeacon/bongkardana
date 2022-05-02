package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/saving/interactor/CreateSaving;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/saving/model/SavingGoalView;", "Lid/dana/domain/saving/interactor/CreateSaving$Param;", "savingRepository", "Lid/dana/domain/saving/SavingRepository;", "savingCategoryRepository", "Lid/dana/domain/saving/SavingCategoryRepository;", "(Lid/dana/domain/saving/SavingRepository;Lid/dana/domain/saving/SavingCategoryRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setIdentifiers extends APWebChromeClient<BeaconManager, getMax> {
    /* access modifiers changed from: private */
    public final toStringBuilder savingCategoryRepository;
    private final getBluetoothName savingRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/saving/model/SavingGoalView;", "kotlin.jvm.PlatformType", "savingView", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<BeaconManager, TitleBarRightButtonView.AnonymousClass4<? extends BeaconManager>> {
        final /* synthetic */ setIdentifiers getMin;

        length(setIdentifiers setidentifiers) {
            this.getMin = setidentifiers;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final BeaconManager beaconManager = (BeaconManager) obj;
            Intrinsics.checkNotNullParameter(beaconManager, "savingView");
            return this.getMin.savingCategoryRepository.getSavingCategoriesByKeys(new String[]{beaconManager.getCategoryCode(), "OTHERS"}).flatMap(new RedDotDrawable<List<? extends setDebug>, TitleBarRightButtonView.AnonymousClass4<? extends BeaconManager>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    Intrinsics.checkNotNullParameter(list, "savingCategory");
                    BeaconManager beaconManager = beaconManager;
                    beaconManager.setSavingCategory((setDebug) list.get(0));
                    return TitleBarRightButtonView.AnonymousClass1.just(beaconManager);
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setIdentifiers(@NotNull getBluetoothName getbluetoothname, @NotNull toStringBuilder tostringbuilder) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbluetoothname, "savingRepository");
        Intrinsics.checkNotNullParameter(tostringbuilder, "savingCategoryRepository");
        this.savingRepository = getbluetoothname;
        this.savingCategoryRepository = tostringbuilder;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BeaconManager> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.savingRepository.createSaving(getmax.getCategoryCode(), getmax.getTitle(), getmax.getTargetAmount()).flatMap(new length(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "savingRepository.createS…          }\n            }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/saving/interactor/CreateSaving$Param;", "", "categoryCode", "", "title", "targetAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryCode", "()Ljava/lang/String;", "getTargetAmount", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String categoryCode;
        @NotNull
        private final String targetAmount;
        @NotNull
        private final String title;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.categoryCode;
            }
            if ((i & 2) != 0) {
                str2 = getmax.title;
            }
            if ((i & 4) != 0) {
                str3 = getmax.targetAmount;
            }
            return getmax.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.categoryCode;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.targetAmount;
        }

        @NotNull
        public final getMax copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "categoryCode");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(str3, "targetAmount");
            return new getMax(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.categoryCode, (Object) getmax.categoryCode) && Intrinsics.areEqual((Object) this.title, (Object) getmax.title) && Intrinsics.areEqual((Object) this.targetAmount, (Object) getmax.targetAmount);
        }

        public final int hashCode() {
            String str = this.categoryCode;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.targetAmount;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(categoryCode=");
            sb.append(this.categoryCode);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", targetAmount=");
            sb.append(this.targetAmount);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "categoryCode");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(str3, "targetAmount");
            this.categoryCode = str;
            this.title = str2;
            this.targetAmount = str3;
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
