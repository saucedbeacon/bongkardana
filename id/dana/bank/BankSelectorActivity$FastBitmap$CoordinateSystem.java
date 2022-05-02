package id.dana.bank;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
final class BankSelectorActivity$FastBitmap$CoordinateSystem extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ BankSelectorActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BankSelectorActivity$FastBitmap$CoordinateSystem(BankSelectorActivity bankSelectorActivity) {
        super(1);
        this.this$0 = bankSelectorActivity;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        BankSelectorActivity.access$openBankListActivity(this.this$0);
    }
}
