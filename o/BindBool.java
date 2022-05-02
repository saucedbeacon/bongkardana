package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.onFailure;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/contract/sendmoney/v2/SendMoneyV2Presenter;", "Lid/dana/contract/sendmoney/v2/SendMoneyV2Contract$Presenter;", "isSendMoneyV2Enabled", "Lid/dana/domain/sendmoney/interactor/IsSendMoneyV2Enabled;", "view", "Lid/dana/contract/sendmoney/v2/SendMoneyV2Contract$View;", "(Lid/dana/domain/sendmoney/interactor/IsSendMoneyV2Enabled;Lid/dana/contract/sendmoney/v2/SendMoneyV2Contract$View;)V", "isSendMoneyV2Enable", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BindBool implements onFailure.getMin {
    private final setDataRequestNotifier getMax;
    /* access modifiers changed from: private */
    public final onFailure.setMin setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BindBool this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(BindBool bindBool) {
            super(1);
            this.this$0 = bindBool;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMax.length(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BindBool this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(BindBool bindBool) {
            super(1);
            this.this$0 = bindBool;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.length(false);
        }
    }

    @Inject
    public BindBool(@NotNull setDataRequestNotifier setdatarequestnotifier, @NotNull onFailure.setMin setmin) {
        Intrinsics.checkNotNullParameter(setdatarequestnotifier, "isSendMoneyV2Enabled");
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.getMax = setdatarequestnotifier;
        this.setMax = setmin;
    }

    public final void setMin() {
        this.getMax.execute(onReceivedIcon.INSTANCE, new getMin(this), new length(this));
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
