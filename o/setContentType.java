package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0002R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/promocenter/views/BottomSheetSort;", "Lid/dana/bottomsheet/BaseBottomSheetRadioButton;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "options", "", "Lid/dana/common/model/OptionModel;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "selectedIndex", "", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "enableButton", "", "initSelectedOption", "onOptionClicked", "view", "Landroid/view/View;", "onShow", "setSelectedRadioButton", "radioGroup", "Landroid/widget/RadioGroup;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setContentType extends getTypeConverter {
    public int equals = -1;
    private HashMap toIntRange;

    public final void equals() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View getMin(int i) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setContentType(@NotNull FragmentManager fragmentManager, @NotNull List<isLayoutRtlSupport> list) {
        super(fragmentManager, list);
        Intrinsics.checkNotNullParameter(fragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(list, SecurityConstants.KEY_OPTIONS);
    }

    public final void setMin() {
        super.setMin();
        TextView textView = (TextView) getMin(resetInternal.setMax.launchQuerySearch);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
        textView.setText(getString(R.string.sort_label));
        ((DanaButtonPrimaryView) getMin(resetInternal.setMax.newSessionWithExtras)).setActiveButton(getString(R.string.sort_button_title), (Drawable) null);
        if (this.equals < 0) {
            ((DanaButtonPrimaryView) getMin(resetInternal.setMax.newSessionWithExtras)).setDisabled(getString(R.string.sort_button_title));
            return;
        }
        RadioGroup radioGroup = (RadioGroup) getMin(resetInternal.setMax.ActionMenuPresenter$SavedState);
        Intrinsics.checkNotNullExpressionValue(radioGroup, "it");
        if (!(radioGroup.getChildCount() > this.equals)) {
            radioGroup = null;
        }
        if (radioGroup != null) {
            View childAt = radioGroup.getChildAt(this.equals);
            if (!(childAt instanceof RadioButton)) {
                childAt = null;
            }
            if (childAt != null) {
                if (childAt != null) {
                    ((RadioButton) childAt).setChecked(true);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
                }
            }
        }
        ((DanaButtonPrimaryView) getMin(resetInternal.setMax.newSessionWithExtras)).setActiveButton(getString(R.string.sort_button_title), (Drawable) null);
    }

    public final void setMax(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((DanaButtonPrimaryView) getMin(resetInternal.setMax.newSessionWithExtras)).setActiveButton(getString(R.string.sort_button_title), (Drawable) null);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
