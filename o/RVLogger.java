package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/sendmoney/repository/source/SendMoneyPreferenceEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/sendmoney/repository/source/local/PreferenceSendMoneyEntityData;", "sendMoneyPreference", "Lid/dana/data/sendmoney/repository/source/local/SendMoneyPreference;", "(Lid/dana/data/sendmoney/repository/source/local/SendMoneyPreference;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVLogger extends uncheckItems<parseAriverCodeUrl> {
    private final getCORSUrl sendMoneyPreference;

    /* renamed from: o.RVLogger$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<List<getExtension>> getSendMoneyHomeMenus();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/sendmoney/repository/source/SortingSendMoneyPreferenceEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/sendmoney/repository/source/local/PreferenceSortingSendMoneyEntityData;", "sortingSendMoneyPreference", "Lid/dana/data/sendmoney/repository/source/local/SortingSendMoneyPreference;", "(Lid/dana/data/sendmoney/repository/source/local/SortingSendMoneyPreference;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Proxy extends uncheckItems<mergeUrl> {
        private final getHash sortingSendMoneyPreference;

        @Inject
        public Proxy(@NotNull getHash gethash) {
            Intrinsics.checkNotNullParameter(gethash, "sortingSendMoneyPreference");
            this.sortingSendMoneyPreference = gethash;
        }

        @NotNull
        public final mergeUrl createData(@Nullable String str) {
            return new mergeUrl(this.sortingSendMoneyPreference);
        }
    }

    @Inject
    public RVLogger(@NotNull getCORSUrl getcorsurl) {
        Intrinsics.checkNotNullParameter(getcorsurl, "sendMoneyPreference");
        this.sendMoneyPreference = getcorsurl;
    }

    @NotNull
    public final parseAriverCodeUrl createData(@Nullable String str) {
        return new parseAriverCodeUrl(this.sendMoneyPreference);
    }
}
