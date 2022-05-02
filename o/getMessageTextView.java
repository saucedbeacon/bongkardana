package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resolveColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/announcement/repository/source/AnnouncementEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/announcement/AnnouncementEntityData;", "networkAnnouncementEntityData", "Lid/dana/data/announcement/repository/source/network/NetworkAnnouncementEntityData;", "mockAnnouncementEntityData", "Lid/dana/data/announcement/repository/source/mock/MockAnnouncementEntityData;", "localAnnouncementEntityData", "Lid/dana/data/announcement/repository/source/local/LocalAnnouncementEntityData;", "(Lid/dana/data/announcement/repository/source/network/NetworkAnnouncementEntityData;Lid/dana/data/announcement/repository/source/mock/MockAnnouncementEntityData;Lid/dana/data/announcement/repository/source/local/LocalAnnouncementEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getMessageTextView extends uncheckItems<getItemSelector> {
    private final adjustAlpha localAnnouncementEntityData;
    private final resolveColor.Cdefault mockAnnouncementEntityData;
    private final preShow networkAnnouncementEntityData;

    @Inject
    public getMessageTextView(@NotNull preShow preshow, @NotNull resolveColor.Cdefault defaultR, @NotNull adjustAlpha adjustalpha) {
        Intrinsics.checkNotNullParameter(preshow, "networkAnnouncementEntityData");
        Intrinsics.checkNotNullParameter(defaultR, "mockAnnouncementEntityData");
        Intrinsics.checkNotNullParameter(adjustalpha, "localAnnouncementEntityData");
        this.networkAnnouncementEntityData = preshow;
        this.mockAnnouncementEntityData = defaultR;
        this.localAnnouncementEntityData = adjustalpha;
    }

    @NotNull
    public final getItemSelector createData(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3357066) {
                if (hashCode == 103145323 && str.equals("local")) {
                    return this.localAnnouncementEntityData;
                }
            } else if (str.equals("mock")) {
                return this.mockAnnouncementEntityData;
            }
        }
        return this.networkAnnouncementEntityData;
    }
}
