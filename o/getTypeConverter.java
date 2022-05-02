package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.R;
import id.dana.common.view.RadioOptionsView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0014J\u0006\u0010\u0017\u001a\u00020\u000bR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/bottomsheet/BaseBottomSheetRadioButton;", "Lid/dana/base/BaseBottomSheetFullDialogFragment;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "options", "", "Lid/dana/common/model/OptionModel;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "onSubmitClicked", "Lkotlin/Function1;", "", "", "getOnSubmitClicked", "()Lkotlin/jvm/functions/Function1;", "setOnSubmitClicked", "(Lkotlin/jvm/functions/Function1;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getLayout", "onOptionClicked", "view", "Landroid/view/View;", "onShow", "show", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class getTypeConverter extends IMultiInstanceInvalidationCallback.Default {
    @NotNull
    public static final length isInside = new length((byte) 0);
    private final List<isLayoutRtlSupport> equals;
    @NotNull
    public Function1<? super Integer, Unit> getMax = getMin.INSTANCE;
    public final FragmentManager getMin;
    private HashMap toIntRange;

    public void equals() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int getMin() {
        return R.layout.bottomsheet_radio_button;
    }

    public View getMin(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        equals();
    }

    public void setMax(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function1<View, Unit> {
        getMax(getTypeConverter gettypeconverter) {
            super(1, gettypeconverter, getTypeConverter.class, "onOptionClicked", "onOptionClicked(Landroid/view/View;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "p1");
            ((getTypeConverter) this.receiver).setMax(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Integer, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final void invoke(int i) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    public getTypeConverter(@NotNull FragmentManager fragmentManager, @NotNull List<isLayoutRtlSupport> list) {
        Intrinsics.checkNotNullParameter(fragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(list, SecurityConstants.KEY_OPTIONS);
        this.getMin = fragmentManager;
        this.equals = list;
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) getMin(resetInternal.setMax.RequiresPermission$Read);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_bottom_sheet_radio_button");
        return frameLayout;
    }

    public void setMin() {
        super.setMin();
        ((RadioOptionsView) getMin(resetInternal.setMax.setExpandActivityOverflowButtonContentDescription)).setItems(this.equals, new getMax(this));
        ((DanaButtonPrimaryView) getMin(resetInternal.setMax.newSessionWithExtras)).setOnClickListener(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ getTypeConverter getMax;

        setMax(getTypeConverter gettypeconverter) {
            this.getMax = gettypeconverter;
        }

        public final void onClick(View view) {
            this.getMax.getMax.invoke(Integer.valueOf(((RadioOptionsView) this.getMax.getMin(resetInternal.setMax.setExpandActivityOverflowButtonContentDescription)).getSelectedOption()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/bottomsheet/BaseBottomSheetRadioButton$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
