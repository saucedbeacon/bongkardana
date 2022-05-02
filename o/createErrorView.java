package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultEmbedViewManager;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/globalnetwork/source/GnConfigDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/globalnetwork/source/GnConfigEntityData;", "splitGnConfigEntityData", "Lid/dana/data/globalnetwork/source/split/SplitGnConfigEntityData;", "amcsGnConfigEntityData", "Lid/dana/data/globalnetwork/source/amcs/AmcsGnConfigEntityData;", "preferenceGnConfigEntityData", "Lid/dana/data/globalnetwork/source/local/PreferenceGnConfigEntityData;", "(Lid/dana/data/globalnetwork/source/split/SplitGnConfigEntityData;Lid/dana/data/globalnetwork/source/amcs/AmcsGnConfigEntityData;Lid/dana/data/globalnetwork/source/local/PreferenceGnConfigEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createErrorView extends uncheckItems<getStateListDrawable> {
    private final isConfigSupport amcsGnConfigEntityData;
    private final getTabBarHeightSpec preferenceGnConfigEntityData;
    private final DefaultEmbedViewManager.AnonymousClass1 splitGnConfigEntityData;

    @Inject
    public createErrorView(@NotNull DefaultEmbedViewManager.AnonymousClass1 r2, @NotNull isConfigSupport isconfigsupport, @NotNull getTabBarHeightSpec gettabbarheightspec) {
        Intrinsics.checkNotNullParameter(r2, "splitGnConfigEntityData");
        Intrinsics.checkNotNullParameter(isconfigsupport, "amcsGnConfigEntityData");
        Intrinsics.checkNotNullParameter(gettabbarheightspec, "preferenceGnConfigEntityData");
        this.splitGnConfigEntityData = r2;
        this.amcsGnConfigEntityData = isconfigsupport;
        this.preferenceGnConfigEntityData = gettabbarheightspec;
    }

    @NotNull
    public final getStateListDrawable createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        int hashCode = str.hashCode();
        if (hashCode != 2997660) {
            if (hashCode == 103145323 && str.equals("local")) {
                return this.preferenceGnConfigEntityData;
            }
        } else if (str.equals("amcs")) {
            return this.amcsGnConfigEntityData;
        }
        return this.splitGnConfigEntityData;
    }
}
