package id.dana.nearbyme.merchantreview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.component.BaseRichView;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020&H\u0014J\u001c\u0010'\u001a\u00020&2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010(\u001a\u00020&H\u0002J\u000e\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0018J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR)\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lid/dana/nearbyme/merchantreview/ViewRatingStarBar;", "Lid/dana/component/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "innerBottomPadding", "getInnerBottomPadding", "()I", "setInnerBottomPadding", "(I)V", "innerLeftPadding", "getInnerLeftPadding", "setInnerLeftPadding", "innerRightPadding", "getInnerRightPadding", "setInnerRightPadding", "innerTopPadding", "getInnerTopPadding", "setInnerTopPadding", "onStarClickListener", "Lid/dana/nearbyme/merchantreview/ViewRatingStarBar$ClickListener;", "starSelected", "getStarSelected", "setStarSelected", "stars", "", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "getStars", "()Ljava/util/List;", "stars$delegate", "Lkotlin/Lazy;", "getLayout", "onAttachedToWindow", "", "parseAttrs", "renderSelectedStar", "setOnStarClickListener", "clickListener", "setup", "setupListener", "updatePadding", "ClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ViewRatingStarBar extends BaseRichView {
    private int getMax;
    private int getMin;
    private int isInside;
    private int length;
    /* access modifiers changed from: private */
    public setMax setMax;
    private final Lazy setMin = LazyKt.lazy(new getMin(this));
    private int toFloatRange;
    private HashMap toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantreview/ViewRatingStarBar$ClickListener;", "", "onStarClick", "", "rating", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void setMin(int i);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_rating_star_bar;
    }

    public final void setup() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewRatingStarBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public static final /* synthetic */ setMax access$getOnStarClickListener$p(ViewRatingStarBar viewRatingStarBar) {
        setMax setmax = viewRatingStarBar.setMax;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onStarClickListener");
        }
        return setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<List<? extends AppCompatImageView>> {
        final /* synthetic */ ViewRatingStarBar this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ViewRatingStarBar viewRatingStarBar) {
            super(0);
            this.this$0 = viewRatingStarBar;
        }

        @NotNull
        public final List<AppCompatImageView> invoke() {
            return CollectionsKt.listOf((AppCompatImageView) this.this$0._$_findCachedViewById(resetInternal.setMax.createRatingBar), (AppCompatImageView) this.this$0._$_findCachedViewById(resetInternal.setMax.showsIcon), (AppCompatImageView) this.this$0._$_findCachedViewById(resetInternal.setMax.ExpandedMenuView), (AppCompatImageView) this.this$0._$_findCachedViewById(resetInternal.setMax.createViewFromTag), (AppCompatImageView) this.this$0._$_findCachedViewById(resetInternal.setMax.createMultiAutoCompleteTextView));
        }
    }

    public final int getInnerTopPadding() {
        return this.getMin;
    }

    public final void setInnerTopPadding(int i) {
        this.getMin = i;
        length();
    }

    public final int getInnerBottomPadding() {
        return this.getMax;
    }

    public final void setInnerBottomPadding(int i) {
        this.getMax = i;
        length();
    }

    public final int getInnerLeftPadding() {
        return this.length;
    }

    public final void setInnerLeftPadding(int i) {
        this.length = i;
        length();
    }

    public final int getInnerRightPadding() {
        return this.isInside;
    }

    public final void setInnerRightPadding(int i) {
        this.isInside = i;
        length();
    }

    public final int getStarSelected() {
        return this.toFloatRange;
    }

    public final void setStarSelected(int i) {
        this.toFloatRange = i;
        getMin();
    }

    public final void setOnStarClickListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "clickListener");
        this.setMax = setmax;
        int i = 0;
        for (Object next : (List) this.setMin.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) next;
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new setMin(i, this));
            }
            i = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getMin();
    }

    private final void length() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.onBackPressed);
        if (linearLayout != null) {
            linearLayout.setPadding(this.length, this.getMin, this.isInside, this.getMax);
        }
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, resetInternal.getMin.Dimension) : null;
        if (obtainStyledAttributes != null) {
            try {
                setInnerTopPadding((int) obtainStyledAttributes.getDimension(3, 0.0f));
                setInnerBottomPadding((int) obtainStyledAttributes.getDimension(0, 0.0f));
                setInnerLeftPadding((int) obtainStyledAttributes.getDimension(1, 0.0f));
                setInnerRightPadding((int) obtainStyledAttributes.getDimension(2, 0.0f));
            } catch (Throwable th) {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/merchantreview/ViewRatingStarBar$setupListener$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ ViewRatingStarBar getMax;
        final /* synthetic */ int setMin;

        setMin(int i, ViewRatingStarBar viewRatingStarBar) {
            this.setMin = i;
            this.getMax = viewRatingStarBar;
        }

        public final void onClick(View view) {
            this.getMax.setStarSelected(this.setMin + 1);
            ViewRatingStarBar.access$getOnStarClickListener$p(this.getMax).setMin(this.getMax.getStarSelected());
        }
    }

    private final void getMin() {
        int i = 0;
        for (Object next : (List) this.setMin.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Glide.setMin((View) this).length().getMax(Integer.valueOf(i < this.toFloatRange ? R.drawable.ic_star_filled : R.drawable.ic_star)).length((ImageView) (AppCompatImageView) next);
            i = i2;
        }
    }
}
