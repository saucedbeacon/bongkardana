package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "", "getActorUserId", "", "getActorUsername", "getContactPhoneNumber", "getHeaderName", "getNickname", "updateHeaderName", "", "headerName", "updateNickName", "deviceContactNickName", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getShowType {
    @NotNull
    String getActorUserId();

    @NotNull
    String getActorUsername();

    @NotNull
    String getContactPhoneNumber();

    @NotNull
    String getHeaderName();

    @NotNull
    String getNickname();

    void updateHeaderName(@NotNull String str);

    void updateNickName(@NotNull String str);
}
