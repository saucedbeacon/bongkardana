package o;

import id.dana.domain.social.ModifyRelationOperationType;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/social/interactor/ModifyFollowingRelationship;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "", "", "Lid/dana/domain/social/ModifyRelationOperationType;", "socialGeneralRepository", "Lid/dana/domain/social/SocialGeneralRepository;", "(Lid/dana/domain/social/SocialGeneralRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setSampleExpirationMilliseconds extends APWebChromeClient<Boolean, Map<String, ? extends ModifyRelationOperationType>> {
    private final getResponseCode socialGeneralRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setSampleExpirationMilliseconds(@NotNull getResponseCode getresponsecode) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getresponsecode, "socialGeneralRepository");
        this.socialGeneralRepository = getresponsecode;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull Map<String, ? extends ModifyRelationOperationType> map) {
        Intrinsics.checkNotNullParameter(map, "params");
        if (map.isEmpty()) {
            TitleBarRightButtonView.AnonymousClass1<Boolean> error = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new Exception("param must not be null"));
            Intrinsics.checkNotNullExpressionValue(error, "Observable.error(Excepti…param must not be null\"))");
            return error;
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
        return this.socialGeneralRepository.modifyFollowingRelationship((String) entry.getKey(), ((ModifyRelationOperationType) entry.getValue()).getOperationType());
    }
}
