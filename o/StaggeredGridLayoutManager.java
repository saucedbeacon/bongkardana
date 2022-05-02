package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.appshortcut.DanaAppShortcut;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.doesTransientStatePreventRecycling;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/appcontainer/plugin/ocrreceipt/usecase/GetOcrSnapLimit;", "", "ocrConfigRepository", "Lid/dana/appcontainer/plugin/ocrreceipt/repository/OcrConfigRepository;", "(Lid/dana/appcontainer/plugin/ocrreceipt/repository/OcrConfigRepository;)V", "invoke", "Lio/reactivex/Single;", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StaggeredGridLayoutManager {
    public final shouldBeKeptAsChild getMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/appshortcut/DanaAppShortcutPresenter;", "Lid/dana/appshortcut/DanaAppShortcutContract$Presenter;", "view", "Lid/dana/appshortcut/DanaAppShortcutContract$View;", "getAppShortcutConfig", "Lid/dana/domain/appshortcut/interactor/GetAppShortcutConfig;", "(Lid/dana/appshortcut/DanaAppShortcutContract$View;Lid/dana/domain/appshortcut/interactor/GetAppShortcutConfig;)V", "getGetAppShortcutEnabledFlag", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class LayoutParams implements doesTransientStatePreventRecycling.getMin {
        private final ToolbarMenuClickListener setMax;
        /* access modifiers changed from: private */
        public final doesTransientStatePreventRecycling.length setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(LayoutParams layoutParams) {
                super(1);
                this.this$0 = layoutParams;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.setMin.getMax(z);
            }
        }

        @Inject
        public LayoutParams(@NotNull doesTransientStatePreventRecycling.length length2, @NotNull ToolbarMenuClickListener toolbarMenuClickListener) {
            Intrinsics.checkNotNullParameter(length2, "view");
            Intrinsics.checkNotNullParameter(toolbarMenuClickListener, "getAppShortcutConfig");
            this.setMin = length2;
            this.setMax = toolbarMenuClickListener;
        }

        public final void setMin() {
            APWebChromeClient.execute$default(this.setMax, onReceivedIcon.INSTANCE, new length(this), (Function1) null, 4, (Object) null);
        }

        public final void setMax() {
            this.setMax.dispose();
        }
    }

    @Inject
    public StaggeredGridLayoutManager(@NotNull shouldBeKeptAsChild shouldbekeptaschild) {
        Intrinsics.checkNotNullParameter(shouldbekeptaschild, "ocrConfigRepository");
        this.getMax = shouldbekeptaschild;
    }

    public final class SavedState implements getBindingAdapter<DanaAppShortcut> {
        @InjectedFieldSignature("id.dana.appshortcut.DanaAppShortcut.danaAppShortcutPresenter")
        public static void setMin(DanaAppShortcut danaAppShortcut, doesTransientStatePreventRecycling.getMin getmin) {
            danaAppShortcut.danaAppShortcutPresenter = getmin;
        }
    }
}
