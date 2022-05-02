package o;

import java.io.File;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lid/dana/domain/nearbyme/interactor/merchantreview/UploadMerchantReviewImage;", "Lid/dana/domain/core/usecase/CoroutineWorkerUseCase;", "Ljava/io/File;", "", "merchantReviewRepository", "Lid/dana/domain/nearbyme/MerchantReviewRepository;", "(Lid/dana/domain/nearbyme/MerchantReviewRepository;)V", "execute", "param", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getMac extends onReceivedTouchIconUrl<File, String> {
    private final AESUtil merchantReviewRepository;

    @Inject
    public getMac(@NotNull AESUtil aESUtil) {
        Intrinsics.checkNotNullParameter(aESUtil, "merchantReviewRepository");
        this.merchantReviewRepository = aESUtil;
    }

    @Nullable
    public final Object execute(@NotNull File file, @NotNull Continuation<? super String> continuation) {
        return this.merchantReviewRepository.uploadImage(file, continuation);
    }
}
