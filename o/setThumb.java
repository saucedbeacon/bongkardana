package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.setPhotoSize;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0002\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/sendmoney/remarks/NotePresenter;", "Lid/dana/sendmoney/remarks/NoteContract$Presenter;", "getNoteMaxChar", "Lid/dana/domain/sendmoney/interactor/GetNoteMaxChar;", "view", "Lid/dana/sendmoney/remarks/NoteContract$View;", "(Lid/dana/domain/sendmoney/interactor/GetNoteMaxChar;Lid/dana/sendmoney/remarks/NoteContract$View;)V", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setThumb implements setPhotoSize.setMin {
    /* access modifiers changed from: private */
    public final setPhotoSize.getMin setMax;
    private final isBackgroundModeUninitialized setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ setThumb this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(setThumb setthumb) {
            super(1);
            this.this$0 = setthumb;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.setMax.getMin(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setThumb this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(setThumb setthumb) {
            super(1);
            this.this$0 = setthumb;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.getMin(50);
        }
    }

    @Inject
    public setThumb(@NotNull isBackgroundModeUninitialized isbackgroundmodeuninitialized, @NotNull setPhotoSize.getMin getmin) {
        Intrinsics.checkNotNullParameter(isbackgroundmodeuninitialized, "getNoteMaxChar");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMin = isbackgroundmodeuninitialized;
        this.setMax = getmin;
    }

    public final void getMin() {
        this.setMin.execute(onReceivedIcon.INSTANCE, new setMax(this), new setMin(this));
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}
