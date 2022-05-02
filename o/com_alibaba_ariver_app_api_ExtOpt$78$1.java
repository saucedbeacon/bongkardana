package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\rH\u0016¨\u0006\u0011"}, d2 = {"Lid/dana/data/loyalty/repository/source/local/LocalLoyaltyEntityData;", "Lid/dana/data/base/BasePersistence;", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "persistenceDao", "Ldagger/Lazy;", "Lid/dana/data/base/BasePersistenceDao;", "(Ldagger/Lazy;)V", "deleteReceiptDataByUserLoyaltyId", "Lio/reactivex/Observable;", "", "userLoyaltyId", "", "getReceiptDataByUserLoyaltyId", "Lid/dana/data/loyalty/repository/source/local/entity/LoyaltyReceiptEntity;", "saveReceiptData", "", "loyaltyReceiptEntity", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$78$1 extends reverseAnimationSpeed implements com_alibaba_ariver_app_api_ExtOpt$75$1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$78$1(@NotNull Lazy<BasePersistenceDao> lazy) {
        super(lazy);
        Intrinsics.checkNotNullParameter(lazy, "persistenceDao");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> saveReceiptData(@NotNull com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_80_1, "loyaltyReceiptEntity");
        TitleBarRightButtonView.AnonymousClass1<Long> just = TitleBarRightButtonView.AnonymousClass1.just(Long.valueOf(getDb().loyaltyReceiptDao().insertReceipt(com_alibaba_ariver_app_api_extopt_80_1)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(db.loyal…pt(loyaltyReceiptEntity))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$80$1> getReceiptDataByUserLoyaltyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$80$1> just = TitleBarRightButtonView.AnonymousClass1.just(getDb().loyaltyReceiptDao().getReceiptByUserLoyaltyId(str));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(db.loyal…LoyaltyId(userLoyaltyId))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> deleteReceiptDataByUserLoyaltyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
        TitleBarRightButtonView.AnonymousClass1<Integer> just = TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(getDb().loyaltyReceiptDao().deleteReceipt(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(db.loyal…teReceipt(userLoyaltyId))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$88$1> submitReceipt(@NotNull com_alibaba_ariver_app_api_ExtOpt$81$1 com_alibaba_ariver_app_api_extopt_81_1, @NotNull String str) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_81_1, "submitReceiptRequest");
        Intrinsics.checkNotNullParameter(str, "token");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$88$1> max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(null);
        Intrinsics.checkNotNullExpressionValue(max, "Single.just(null)");
        return max;
    }
}
