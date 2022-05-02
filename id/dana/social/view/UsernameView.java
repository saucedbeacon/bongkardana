package id.dana.social.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.social.view.activity.ChangeUsernameActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.multiple;
import o.resetInternal;
import o.setBuildNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\rH\u0016J\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/social/view/UsernameView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "username", "", "getLayout", "hideUsernameEmptyState", "", "openChangeUsernameActivity", "Landroid/content/Intent;", "setUsername", "setup", "showUsernameEmptyState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UsernameView extends BaseRichView {
    private HashMap getMax;
    private String setMin;

    @JvmOverloads
    public UsernameView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public UsernameView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_username;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UsernameView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UsernameView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ UsernameView setMax;

        setMax(UsernameView usernameView) {
            this.setMax = usernameView;
        }

        public final void onClick(View view) {
            UsernameView.access$openChangeUsernameActivity(this.setMax);
        }
    }

    public final void setup() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.ComponentActivity$3);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new setMax(this));
        }
    }

    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        this.setMin = str;
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onGetActiveNotifications);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    public final void showUsernameEmptyState() {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.adjustListItemSelectionBounds);
        if (imageView != null) {
            View view = imageView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
    }

    public final void hideUsernameEmptyState() {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.adjustListItemSelectionBounds);
        if (imageView != null) {
            View view = imageView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    public static final /* synthetic */ Intent access$openChangeUsernameActivity(UsernameView usernameView) {
        Intent putExtras = new Intent(usernameView.getContext(), ChangeUsernameActivity.class).putExtras(multiple.getMin(TuplesKt.to(ChangeUsernameActivity.PARAM_USERNAME, usernameView.setMin)));
        Context context = usernameView.getContext();
        if (context != null) {
            context.startActivity(putExtras);
        }
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(context, ChangeUs…artActivity(it)\n        }");
        return putExtras;
    }
}
