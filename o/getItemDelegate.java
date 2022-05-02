package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getMenus;
import o.onLeftHiddenState;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/announcement/AnnouncementPresenter;", "Lid/dana/announcement/AnnouncementContract$Presenter;", "view", "Lid/dana/announcement/AnnouncementContract$View;", "saveGnAnnouncementId", "Lid/dana/domain/announcement/interactor/SaveGnAnnouncementId;", "(Lid/dana/announcement/AnnouncementContract$View;Lid/dana/domain/announcement/interactor/SaveGnAnnouncementId;)V", "tag", "", "kotlin.jvm.PlatformType", "onDestroy", "", "id", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getItemDelegate implements onLeftHiddenState.setMin {
    private final getMenus getMax;
    /* access modifiers changed from: private */
    public final String getMin = getItemDelegate.class.getSimpleName();
    /* access modifiers changed from: private */
    public final onLeftHiddenState.getMin setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ getItemDelegate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getItemDelegate getitemdelegate) {
            super(1);
            this.this$0 = getitemdelegate;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.getMin, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Inject
    public getItemDelegate(@NotNull onLeftHiddenState.getMin getmin, @NotNull getMenus getmenus) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(getmenus, "saveGnAnnouncementId");
        this.setMin = getmin;
        this.getMax = getmenus;
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.getMax.execute(new getMenus.getMin(str), length.INSTANCE, new getMax(this));
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
