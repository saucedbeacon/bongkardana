package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, d2 = {"setSafeOnClickListener", "", "Landroid/view/View;", "onSafeClick", "Lkotlin/Function1;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class H5TinyPopMenu {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function1 $onSafeClick;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Function1 function1) {
            super(1);
            this.$onSafeClick = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.$onSafeClick.invoke(view);
        }
    }

    public static final void getMin(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "$this$setSafeOnClickListener");
        Intrinsics.checkNotNullParameter(function1, "onSafeClick");
        view.setOnClickListener(new showMenu(new getMin(function1)));
    }

    public final class TitleBarTheme {
        public static String length(Context context, boolean z) {
            String str;
            String str2 = "";
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                str = packageInfo.versionName;
                try {
                    str2 = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                str = str2;
            }
            if (z || str2.isEmpty()) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }
}
