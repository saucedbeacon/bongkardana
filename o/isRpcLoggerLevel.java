package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.usereducation.constant.BottomSheetType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/saving/repository/source/local/DefaultSavingWithdrawEntityData;", "Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getWithdrawOption", "Lio/reactivex/Observable;", "", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isRpcLoggerLevel implements isUrgent {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String DEFAULT_SAVING_WITHDRAW_OPTION_JSON = "json/amcs-saving-withdraw-option.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    @Inject
    public isRpcLoggerLevel(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWithdrawOption() {
        List<String> deserializeList = this.serializer.deserializeList(getPositiveString.loadJSONFromAsset(this.context, DEFAULT_SAVING_WITHDRAW_OPTION_JSON));
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(deserializeList, BottomSheetType.LIST);
        for (String add : deserializeList) {
            arrayList.add(add);
        }
        TitleBarRightButtonView.AnonymousClass1<List<String>> just = TitleBarRightButtonView.AnonymousClass1.just(arrayList);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(withdrawOptions)");
        return just;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/saving/repository/source/local/DefaultSavingWithdrawEntityData$Companion;", "", "()V", "DEFAULT_SAVING_WITHDRAW_OPTION_JSON", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
