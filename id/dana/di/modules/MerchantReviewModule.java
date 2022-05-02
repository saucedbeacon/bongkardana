package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.AESUtil;
import o.BridgeUtils;
import o.getMac;
import o.getWorkerHandler;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lid/dana/di/modules/MerchantReviewModule;", "", "()V", "provideMerchantReviewRepository", "Lid/dana/domain/nearbyme/MerchantReviewRepository;", "merchantReviewEntityRepository", "Lid/dana/data/nearbyme/repository/MerchantReviewEntityRepository;", "providesCreateReview", "Lid/dana/domain/nearbyme/interactor/merchantreview/CreateMerchantReview;", "repository", "providesUploadImage", "Lid/dana/domain/nearbyme/interactor/merchantreview/UploadMerchantReviewImage;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantReviewModule {
    @NotNull
    public static final MerchantReviewModule getMax = new MerchantReviewModule();

    private MerchantReviewModule() {
    }

    @JvmStatic
    @NotNull
    @Provides
    public static final AESUtil setMax(@NotNull getWorkerHandler getworkerhandler) {
        Intrinsics.checkNotNullParameter(getworkerhandler, "merchantReviewEntityRepository");
        return getworkerhandler;
    }

    @JvmStatic
    @NotNull
    @Provides
    public static final BridgeUtils setMin(@NotNull AESUtil aESUtil) {
        Intrinsics.checkNotNullParameter(aESUtil, "repository");
        return new BridgeUtils(aESUtil);
    }

    @JvmStatic
    @NotNull
    @Provides
    public static final getMac getMax(@NotNull AESUtil aESUtil) {
        Intrinsics.checkNotNullParameter(aESUtil, "repository");
        return new getMac(aESUtil);
    }
}
