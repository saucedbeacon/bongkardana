package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/SortingSendMoneyPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getSortingSendMoney", "", "saveSortingSendMoney", "", "sortedBy", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getHash {
    @NotNull
    public static final getMin Companion;
    private static final String SEND_MONEY_SORTED_BY = "SEND_MONEY_SORTED_BY";
    private static final String SEND_MONEY_SORT_PREFERENCE;
    private final onSingleFailed preferenceFacade;

    @Inject
    public getHash(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(SEND_MONEY_SORT_PREFERENCE).setUseDrutherPreference(true)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @NotNull
    public final String getSortingSendMoney() {
        String string = this.preferenceFacade.getString(SEND_MONEY_SORTED_BY);
        return string == null ? "" : string;
    }

    public final boolean saveSortingSendMoney(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "sortedBy");
        this.preferenceFacade.saveData(SEND_MONEY_SORTED_BY, str);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/SortingSendMoneyPreference$Companion;", "", "()V", "SEND_MONEY_SORTED_BY", "", "SEND_MONEY_SORT_PREFERENCE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        getMin getmin = new getMin((DefaultConstructorMarker) null);
        Companion = getmin;
        SEND_MONEY_SORT_PREFERENCE = Intrinsics.stringPlus(Reflection.getOrCreateKotlinClass(getmin.getClass()).getSimpleName(), "production");
    }
}
