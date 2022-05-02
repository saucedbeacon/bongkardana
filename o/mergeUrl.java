package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/PreferenceSortingSendMoneyEntityData;", "Lid/dana/data/sendmoney/repository/SortingSendMoneyPreferenceEntityData;", "sortingSendMoneyPreference", "Lid/dana/data/sendmoney/repository/source/local/SortingSendMoneyPreference;", "(Lid/dana/data/sendmoney/repository/source/local/SortingSendMoneyPreference;)V", "getSortingSendMoney", "Lio/reactivex/Observable;", "", "saveSortingSendMoney", "", "sortedBy", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class mergeUrl {
    private final getHash sortingSendMoneyPreference;

    @Inject
    public mergeUrl(@NotNull getHash gethash) {
        Intrinsics.checkNotNullParameter(gethash, "sortingSendMoneyPreference");
        this.sortingSendMoneyPreference = gethash;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveSortingSendMoney(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "sortedBy");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.sortingSendMoneyPreference.saveSortingSendMoney(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(sortingS…rtingSendMoney(sortedBy))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getSortingSendMoney() {
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(this.sortingSendMoneyPreference.getSortingSendMoney());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(sortingS…ce.getSortingSendMoney())");
        return just;
    }
}
