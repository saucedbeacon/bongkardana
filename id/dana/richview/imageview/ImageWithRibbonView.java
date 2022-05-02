package id.dana.richview.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IntRange;
import o.clamp;
import o.getBluetoothAdapterState;
import o.getInsetDodgeRect;
import o.parseBehavior;
import o.recordLastChildRect;
import o.resetInternal;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0015J\b\u0010 \u001a\u00020\u0019H\u0016J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0013J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u0007R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/richview/imageview/ImageWithRibbonView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "skeletonLogo", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "getSkeletonLogo", "()Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "skeletonLogo$delegate", "Lkotlin/Lazy;", "srcImage", "Landroid/graphics/drawable/Drawable;", "textLineBottom", "", "textLineTop", "getLayout", "parseAttrs", "", "removeImageGreyscale", "setImageGreyscale", "setRibbonTextLineBottom", "description", "setRibbonTextLineTop", "title", "setup", "showImage", "src", "url", "placeholderDrawable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ImageWithRibbonView extends BaseRichView {
    private final Lazy getMax;
    private String getMin;
    private Drawable length;
    private HashMap setMax;
    private String setMin;

    @JvmOverloads
    public ImageWithRibbonView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ImageWithRibbonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_image_with_ribbon;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageWithRibbonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageWithRibbonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = LazyKt.lazy(new getMax(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ImageWithRibbonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = LazyKt.lazy(new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<getInsetDodgeRect> {
        final /* synthetic */ ImageWithRibbonView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ImageWithRibbonView imageWithRibbonView) {
            super(0);
            this.this$0 = imageWithRibbonView;
        }

        public final getInsetDodgeRect invoke() {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.this$0._$_findCachedViewById(resetInternal.setMax.getContentPaddingRight));
            setmax.getMax = R.layout.view_merchant_logo_skeleton;
            setmax.setMax = 1000;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            return getinsetdodgerect;
        }
    }

    public final void setup() {
        Drawable drawable = this.length;
        if (drawable != null) {
            showImage(drawable);
        }
        String str = this.setMin;
        if (str != null) {
            setRibbonTextLineTop(str);
        }
        String str2 = this.getMin;
        if (str2 != null) {
            setRibbonTextLineBottom(str2);
        }
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.onShuffleModeChanged);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext()\n           …able.ImageWithRibbonView)");
            try {
                this.length = obtainStyledAttributes.getDrawable(2);
                this.setMin = obtainStyledAttributes.getString(1);
                this.getMin = obtainStyledAttributes.getString(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void showImage(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "src");
        ((updateCornerMarking) Glide.getMax(getContext())).equals().setMax((int) R.drawable.ic_placeholder_merchant).toFloatRange(drawable).setMin((int) R.drawable.ic_placeholder_merchant).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode));
    }

    public static /* synthetic */ void showImage$default(ImageWithRibbonView imageWithRibbonView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.drawable.ic_placeholder_merchant;
        }
        imageWithRibbonView.showImage(str, i);
    }

    public final void showImage(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        updateMessageMenuItem<Bitmap> min = ((updateCornerMarking) Glide.getMax(getContext())).equals().setMax(i).length(str).setMin(i);
        min.length(new setMax(this, (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode)), (parseBehavior<Bitmap>) null, min, clamp.setMax());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0014J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0003\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/richview/imageview/ImageWithRibbonView$showImage$1", "Lcom/bumptech/glide/request/target/CustomViewTarget;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Bitmap;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceCleared", "placeholder", "onResourceLoading", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends recordLastChildRect<AppCompatImageView, Bitmap> {
        final /* synthetic */ ImageWithRibbonView getMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ImageWithRibbonView imageWithRibbonView, View view) {
            super(view);
            this.getMax = imageWithRibbonView;
        }

        public final /* synthetic */ void getMin(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(bitmap, "resource");
            ImageWithRibbonView.access$getSkeletonLogo$p(this.getMax).length();
            ((AppCompatImageView) this.getMax._$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode)).setImageBitmap(bitmap);
        }

        public final void setMax(@Nullable Drawable drawable) {
            ImageWithRibbonView.access$getSkeletonLogo$p(this.getMax).getMin();
            super.setMax(drawable);
        }

        public final void length(@Nullable Drawable drawable) {
            ImageWithRibbonView.access$getSkeletonLogo$p(this.getMax).length();
            ((AppCompatImageView) this.getMax._$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode)).setImageDrawable(drawable);
        }

        public final void setMin(@Nullable Drawable drawable) {
            ImageWithRibbonView.access$getSkeletonLogo$p(this.getMax).length();
            ((AppCompatImageView) this.getMax._$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode)).setImageDrawable(drawable);
        }
    }

    public final void setRibbonTextLineTop(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setQueryRefinementEnabled);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setRibbonTextLineBottom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "description");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setQueryRefinementEnabled);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setImageGreyscale() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivLogo");
        getBluetoothAdapterState.getMax(appCompatImageView);
    }

    public final void removeImageGreyscale() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onWindowStartingSupportActionMode);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivLogo");
        ImageView imageView = appCompatImageView;
        Intrinsics.checkNotNullParameter(imageView, "$this$removeGreyscale");
        imageView.setColorFilter((ColorFilter) null);
        imageView.setImageAlpha(255);
    }

    public static final /* synthetic */ getInsetDodgeRect access$getSkeletonLogo$p(ImageWithRibbonView imageWithRibbonView) {
        return (getInsetDodgeRect) imageWithRibbonView.getMax.getValue();
    }
}
