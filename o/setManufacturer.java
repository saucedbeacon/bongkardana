package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/saving/interactor/InitSavingCreate;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/saving/model/SavingCreateInit;", "Lid/dana/domain/core/usecase/NoParams;", "savingRepository", "Lid/dana/domain/saving/SavingRepository;", "savingCategoryRepository", "Lid/dana/domain/saving/SavingCategoryRepository;", "(Lid/dana/domain/saving/SavingRepository;Lid/dana/domain/saving/SavingCategoryRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setManufacturer extends APWebChromeClient<getRegionExitPeriod, onReceivedIcon> {
    /* access modifiers changed from: private */
    public final toStringBuilder savingCategoryRepository;
    private final getBluetoothName savingRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/saving/model/SavingCreateInit;", "kotlin.jvm.PlatformType", "savingCreateInit", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getRegionExitPeriod, TitleBarRightButtonView.AnonymousClass4<? extends getRegionExitPeriod>> {
        final /* synthetic */ setManufacturer length;

        length(setManufacturer setmanufacturer) {
            this.length = setmanufacturer;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final getRegionExitPeriod getregionexitperiod = (getRegionExitPeriod) obj;
            Intrinsics.checkNotNullParameter(getregionexitperiod, "savingCreateInit");
            toStringBuilder access$getSavingCategoryRepository$p = this.length.savingCategoryRepository;
            Object[] array = getregionexitperiod.getCategoryCodes().toArray(new String[0]);
            if (array != null) {
                return access$getSavingCategoryRepository$p.getSavingCategoriesByKeys((String[]) array).flatMap(new RedDotDrawable<List<? extends setDebug>, TitleBarRightButtonView.AnonymousClass4<? extends getRegionExitPeriod>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(list, "it");
                        getRegionExitPeriod getregionexitperiod = getregionexitperiod;
                        getregionexitperiod.getSavingCategories().addAll(list);
                        return TitleBarRightButtonView.AnonymousClass1.just(getregionexitperiod);
                    }
                });
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setManufacturer(@NotNull getBluetoothName getbluetoothname, @NotNull toStringBuilder tostringbuilder) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbluetoothname, "savingRepository");
        Intrinsics.checkNotNullParameter(tostringbuilder, "savingCategoryRepository");
        this.savingRepository = getbluetoothname;
        this.savingCategoryRepository = tostringbuilder;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getRegionExitPeriod> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.savingRepository.initSavingCreate().flatMap(new length(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "savingRepository.initSav…          }\n            }");
        return flatMap;
    }
}
