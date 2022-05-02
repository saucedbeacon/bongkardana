package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Beacon extends parseFailed<List<AltBeaconParser>, Void> {
    private final setMfgReserved referralWidgetRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/saving/interactor/GetSavingDetail;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/saving/model/SavingDetail;", "Lid/dana/domain/saving/interactor/GetSavingDetail$Param;", "savingRepository", "Lid/dana/domain/saving/SavingRepository;", "savingCategoryRepository", "Lid/dana/domain/saving/SavingCategoryRepository;", "(Lid/dana/domain/saving/SavingRepository;Lid/dana/domain/saving/SavingCategoryRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class Builder extends APWebChromeClient<setRegionExitPeriod, setMax> {
        /* access modifiers changed from: private */
        public final toStringBuilder savingCategoryRepository;
        private final getBluetoothName savingRepository;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/saving/model/SavingDetail;", "kotlin.jvm.PlatformType", "savingDetail", "apply"}, k = 3, mv = {1, 4, 2})
        static final class getMin<T, R> implements RedDotDrawable<setRegionExitPeriod, TitleBarRightButtonView.AnonymousClass4<? extends setRegionExitPeriod>> {
            final /* synthetic */ Builder setMin;

            getMin(Builder builder) {
                this.setMin = builder;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final setRegionExitPeriod setregionexitperiod = (setRegionExitPeriod) obj;
                Intrinsics.checkNotNullParameter(setregionexitperiod, "savingDetail");
                return this.setMin.savingCategoryRepository.getSavingCategoriesByKeys(new String[]{setregionexitperiod.getSavingGoalView().getCategoryCode(), "OTHERS"}).flatMap(new RedDotDrawable<List<? extends setDebug>, TitleBarRightButtonView.AnonymousClass4<? extends setRegionExitPeriod>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(list, "it");
                        setRegionExitPeriod setregionexitperiod = setregionexitperiod;
                        setregionexitperiod.getSavingGoalView().setSavingCategory((setDebug) list.get(0));
                        return TitleBarRightButtonView.AnonymousClass1.just(setregionexitperiod);
                    }
                });
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public Builder(@NotNull getBluetoothName getbluetoothname, @NotNull toStringBuilder tostringbuilder) {
            super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(getbluetoothname, "savingRepository");
            Intrinsics.checkNotNullParameter(tostringbuilder, "savingCategoryRepository");
            this.savingRepository = getbluetoothname;
            this.savingCategoryRepository = tostringbuilder;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<setRegionExitPeriod> buildUseCase(@NotNull setMax setmax) {
            Intrinsics.checkNotNullParameter(setmax, "params");
            TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.savingRepository.getSavingDetail(setmax.getSavingId(), setmax.getTopUpViewsPage(), setmax.getTopUpViewsSize()).flatMap(new getMin(this));
            Intrinsics.checkNotNullExpressionValue(flatMap, "savingRepository.getSavi…          }\n            }");
            return flatMap;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/domain/saving/interactor/GetSavingDetail$Param;", "", "savingId", "", "topUpViewsPage", "", "topUpViewsSize", "(Ljava/lang/String;JJ)V", "getSavingId", "()Ljava/lang/String;", "getTopUpViewsPage", "()J", "getTopUpViewsSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            @NotNull
            private final String savingId;
            private final long topUpViewsPage;
            private final long topUpViewsSize;

            public static /* synthetic */ setMax copy$default(setMax setmax, String str, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setmax.savingId;
                }
                if ((i & 2) != 0) {
                    j = setmax.topUpViewsPage;
                }
                long j3 = j;
                if ((i & 4) != 0) {
                    j2 = setmax.topUpViewsSize;
                }
                return setmax.copy(str, j3, j2);
            }

            @NotNull
            public final String component1() {
                return this.savingId;
            }

            public final long component2() {
                return this.topUpViewsPage;
            }

            public final long component3() {
                return this.topUpViewsSize;
            }

            @NotNull
            public final setMax copy(@NotNull String str, long j, long j2) {
                Intrinsics.checkNotNullParameter(str, "savingId");
                return new setMax(str, j, j2);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof setMax)) {
                    return false;
                }
                setMax setmax = (setMax) obj;
                return Intrinsics.areEqual((Object) this.savingId, (Object) setmax.savingId) && this.topUpViewsPage == setmax.topUpViewsPage && this.topUpViewsSize == setmax.topUpViewsSize;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("Param(savingId=");
                sb.append(this.savingId);
                sb.append(", topUpViewsPage=");
                sb.append(this.topUpViewsPage);
                sb.append(", topUpViewsSize=");
                sb.append(this.topUpViewsSize);
                sb.append(")");
                return sb.toString();
            }

            public setMax(@NotNull String str, long j, long j2) {
                Intrinsics.checkNotNullParameter(str, "savingId");
                this.savingId = str;
                this.topUpViewsPage = j;
                this.topUpViewsSize = j2;
            }

            @NotNull
            public final String getSavingId() {
                return this.savingId;
            }

            public final long getTopUpViewsPage() {
                return this.topUpViewsPage;
            }

            public final long getTopUpViewsSize() {
                return this.topUpViewsSize;
            }

            public final int hashCode() {
                String str = this.savingId;
                return ((((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.topUpViewsPage).hashCode()) * 31) + Long.valueOf(this.topUpViewsSize).hashCode();
            }
        }
    }

    @Inject
    public Beacon(appxLoadFailed appxloadfailed, getScheme getscheme, setMfgReserved setmfgreserved) {
        super(appxloadfailed, getscheme);
        this.referralWidgetRepository = setmfgreserved;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<AltBeaconParser>> buildUseCaseObservable(Void voidR) {
        return this.referralWidgetRepository.getReferralWidget();
    }
}
