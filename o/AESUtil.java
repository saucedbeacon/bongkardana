package o;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bø\u0001\u0001\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/nearbyme/MerchantReviewRepository;", "", "createMerchantReview", "", "review", "Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "(Lid/dana/domain/nearbyme/model/MerchantCreateReview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "", "image", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface AESUtil {
    @Nullable
    Object createMerchantReview(@NotNull getSerialNumber getserialnumber, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object uploadImage(@NotNull File file, @NotNull Continuation<? super String> continuation);
}
