package o;

import id.dana.domain.social.ModifyRelationOperationType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/social/adapter/FriendshipListInteraction;", "", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "inactiveButtonText", "getInactiveButtonText", "onFriendInfoClick", "", "position", "", "onModifyRelationshipPopUpClick", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "onRelationshipButtonClick", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getAuthCodeForSecurityGuard {
    @NotNull
    String getMax();

    void getMax(int i);

    void getMin(int i);

    void getMin(int i, @NotNull ModifyRelationOperationType modifyRelationOperationType);

    @NotNull
    String length();
}
