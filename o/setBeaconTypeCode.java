package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/saving/interactor/GetSavingSummary;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/saving/model/SavingSummary;", "Lid/dana/domain/core/usecase/NoParams;", "savingRepository", "Lid/dana/domain/saving/SavingRepository;", "savingCategoryRepository", "Lid/dana/domain/saving/SavingCategoryRepository;", "(Lid/dana/domain/saving/SavingRepository;Lid/dana/domain/saving/SavingCategoryRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setBeaconTypeCode extends APWebChromeClient<logDebug, onReceivedIcon> {
    private final toStringBuilder savingCategoryRepository;
    private final getBluetoothName savingRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingSummary;", "savingSummary", "savingCategories", "", "", "Lid/dana/domain/saving/model/SavingCategory;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T1, T2, R> implements removeNode<logDebug, Map<String, ? extends setDebug>, logDebug> {
        public static final length getMax = new length();

        length() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            logDebug logdebug = (logDebug) obj;
            Map map = (Map) obj2;
            Intrinsics.checkNotNullParameter(logdebug, "savingSummary");
            Intrinsics.checkNotNullParameter(map, "savingCategories");
            for (BeaconManager beaconManager : logdebug.getSavingGoalViews()) {
                setDebug setdebug = (setDebug) map.get(beaconManager.getCategoryCode());
                if (setdebug == null) {
                    setdebug = (setDebug) map.get("OTHERS");
                }
                beaconManager.setSavingCategory(setdebug);
            }
            return logdebug;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setBeaconTypeCode(@NotNull getBluetoothName getbluetoothname, @NotNull toStringBuilder tostringbuilder) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbluetoothname, "savingRepository");
        Intrinsics.checkNotNullParameter(tostringbuilder, "savingCategoryRepository");
        this.savingRepository = getbluetoothname;
        this.savingCategoryRepository = tostringbuilder;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<logDebug> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<logDebug> zip = TitleBarRightButtonView.AnonymousClass1.zip(this.savingRepository.getSavingSummary(), this.savingCategoryRepository.getSavingCategoriesMap(), length.getMax);
        Intrinsics.checkNotNullExpressionValue(zip, "Observable.zip(savingRep…         }\n            })");
        return zip;
    }
}
