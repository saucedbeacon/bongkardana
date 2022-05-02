package id.dana.domain.social;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/domain/social/SocialSyncRetryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/lang/Exception;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class SocialSyncRetryException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialSyncRetryException(@NotNull Exception exc) {
        super(exc);
        Intrinsics.checkNotNullParameter(exc, "exception");
    }
}
