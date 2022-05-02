package id.dana.home.view;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.data.account.repository.AccountEntityRepository;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import o.setFirstVerticalBias;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lid/dana/home/view/ProfileNavigationTabView;", "Lid/dana/home/view/NavigationTabView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getLayout", "getTabTextView", "Landroid/widget/TextView;", "setupUserTabIcon", "", "avatarUrl", "", "verifiedUser", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ProfileNavigationTabView extends NavigationTabView {
    private HashMap length;

    @JvmOverloads
    public ProfileNavigationTabView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ProfileNavigationTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_nav_tab_profile;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNavigationTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProfileNavigationTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ProfileNavigationTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final TextView getTabTextView() {
        View view = getView();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.onInterceptTouchEvent);
        if (textView != null) {
            return textView;
        }
        TextView tabTextView = super.getTabTextView();
        Intrinsics.checkNotNullExpressionValue(tabTextView, "super.getTabTextView()");
        return tabTextView;
    }

    public final void setupUserTabIcon(@NotNull String str, boolean z) {
        boolean z2;
        int i;
        Intrinsics.checkNotNullParameter(str, AccountEntityRepository.UpdateType.AVATAR);
        View view = getView();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.getTabContainer);
        boolean z3 = true;
        int i2 = 0;
        if (appCompatImageView != null) {
            if (z) {
                if (!(str.length() == 0)) {
                    i = 4;
                    appCompatImageView.setVisibility(i);
                }
            }
            i = 0;
            appCompatImageView.setVisibility(i);
        }
        View view2 = getView();
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(resetInternal.setMax.setSubtitle);
        if (appCompatImageView2 != null) {
            View view3 = appCompatImageView2;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(z ? 0 : 8);
        }
        if (getContext() instanceof Activity) {
            Context context = getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            } else if (!((Activity) context).isDestroyed()) {
                z2 = true;
                if (z && z2) {
                    View view4 = getView();
                    Intrinsics.checkNotNullExpressionValue(view4, "view");
                    CircleImageView circleImageView = (CircleImageView) view4.findViewById(resetInternal.setMax.startActionModeForChild);
                    if (circleImageView != null) {
                        View view5 = circleImageView;
                        if (str.length() <= 0) {
                            z3 = false;
                        }
                        if (!z3) {
                            i2 = 8;
                        }
                        view5.setVisibility(i2);
                        ((setFirstVerticalBias) ((setFirstVerticalBias) Glide.getMax(circleImageView.getContext()).getMax(str).length((int) R.drawable.avatar_placeholder)).getMin((int) R.drawable.avatar_placeholder)).length((ImageView) circleImageView);
                        return;
                    }
                    return;
                }
            }
        }
        z2 = false;
        if (z) {
        }
    }
}
