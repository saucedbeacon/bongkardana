package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0002J \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/data/services/repository/source/local/PreferenceFavoriteServicesEntityData;", "Lid/dana/data/services/repository/source/FavoriteServicesEntityData;", "favoriteServicesPreference", "Lid/dana/data/services/repository/source/local/FavoriteServicesPreference;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "(Lid/dana/data/services/repository/source/local/FavoriteServicesPreference;Lid/dana/data/account/repository/source/AccountEntityDataFactory;)V", "createAccountData", "Lid/dana/data/account/repository/source/AccountEntityData;", "getFavoriteServices", "Lio/reactivex/Observable;", "", "", "getPhoneNumber", "mapToListOfString", "services", "saveFavoriteServices", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class retryLocalCall {
    private final DialogLayout accountEntityDataFactory;
    /* access modifiers changed from: private */
    public final UniformIpcUtils favoriteServicesPreference;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/account/AccountEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<attach, String> {
        public static final getMin getMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            attach attach = (attach) obj;
            Intrinsics.checkNotNullParameter(attach, "it");
            return attach.getPhoneNumber();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        final /* synthetic */ retryLocalCall setMin;

        length(retryLocalCall retrylocalcall) {
            this.setMin = retrylocalcall;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            retryLocalCall retrylocalcall = this.setMin;
            return retrylocalcall.mapToListOfString(retrylocalcall.favoriteServicesPreference.getFavoriteServices(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ List getMin;
        final /* synthetic */ retryLocalCall setMin;

        getMax(retryLocalCall retrylocalcall, List list) {
            this.setMin = retrylocalcall;
            this.getMin = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.setMin.favoriteServicesPreference.saveFavoriteServices(this.getMin, str)));
        }
    }

    @Inject
    public retryLocalCall(@NotNull UniformIpcUtils uniformIpcUtils, @NotNull DialogLayout dialogLayout) {
        Intrinsics.checkNotNullParameter(uniformIpcUtils, "favoriteServicesPreference");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        this.favoriteServicesPreference = uniformIpcUtils;
        this.accountEntityDataFactory = dialogLayout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getFavoriteServices() {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = getPhoneNumber().flatMap(new length(this)).onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(new ArrayList()));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "getPhoneNumber()\n       …rvable.just(ArrayList()))");
        return onErrorResumeNext;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> mapToListOfString(List<?> list) {
        Iterable<Object> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Object valueOf : iterable) {
            arrayList.add(String.valueOf(valueOf));
        }
        TitleBarRightButtonView.AnonymousClass1<List<String>> just = TitleBarRightButtonView.AnonymousClass1.just((List) arrayList);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(strings)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveFavoriteServices(@Nullable List<String> list) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getPhoneNumber().flatMap(new getMax(this, list));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getPhoneNumber()\n       …vices, it))\n            }");
        return flatMap;
    }

    private final TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createAccountData().getAccount().map(getMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createAccountData().account.map { it.phoneNumber }");
        return map;
    }

    private final setDrawDivider createAccountData() {
        setDrawDivider createData = this.accountEntityDataFactory.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "accountEntityDataFactory.createData(Source.LOCAL)");
        return createData;
    }
}
