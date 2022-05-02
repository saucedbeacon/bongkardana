package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.maps.SupportMapFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyme/DanaMapFragment;", "Lcom/google/android/gms/maps/SupportMapFragment;", "()V", "isMapBeingTouched", "", "()Z", "setMapBeingTouched", "(Z)V", "isMapEverTouched", "setMapEverTouched", "originalContentView", "Landroid/view/View;", "getView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "viewGroup", "Landroid/view/ViewGroup;", "bundle", "Landroid/os/Bundle;", "Companion", "TouchableWrapper", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCreateDate extends SupportMapFragment {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);
    private View getMax;
    private HashMap length;
    boolean setMax;
    public boolean setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<MotionEvent, Unit> {
        final /* synthetic */ getCreateDate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getCreateDate getcreatedate) {
            super(1);
            this.this$0 = getcreatedate;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MotionEvent) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.this$0.setMax = true;
                this.this$0.setMin = true;
            } else if (action == 1) {
                this.this$0.setMax = false;
            }
        }
    }

    public final boolean setMin() {
        return this.setMin;
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.getMax = super.onCreateView(layoutInflater, viewGroup, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        setMax setmax = new setMax(requireContext, new setMin(this));
        setmax.addView(this.getMax);
        return setmax;
    }

    @Nullable
    public final View getView() {
        return this.getMax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006H\u0016R,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lid/dana/nearbyme/DanaMapFragment$TouchableWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "handleTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "event", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getHandleTouchEvent", "()Lkotlin/jvm/functions/Function1;", "dispatchTouchEvent", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class setMax extends FrameLayout {
        @NotNull
        private final Function1<MotionEvent, Unit> setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(@NotNull Context context, @NotNull Function1<? super MotionEvent, Unit> function1) {
            super(context);
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(function1, "handleTouchEvent");
            this.setMin = function1;
        }

        public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "event");
            this.setMin.invoke(motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/DanaMapFragment$Companion;", "", "()V", "newInstance", "Lid/dana/nearbyme/DanaMapFragment;", "options", "Lcom/google/android/gms/maps/GoogleMapOptions;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
