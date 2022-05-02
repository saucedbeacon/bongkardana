package id.dana.richview.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
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
import o.allowsGoneWidget;
import o.clamp;
import o.getInsetDodgeRect;
import o.parseBehavior;
import o.recordLastChildRect;
import o.resetInternal;
import o.setScaleX;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import o.updatePostConstraints;
import o.updatePostLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u0007H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010!\u001a\u00020\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010#\u001a\u00020\u001fH\u0016J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/richview/imageview/ImageWithDescriptionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "description", "", "image", "Landroid/graphics/drawable/Drawable;", "multiTransformation", "Lcom/bumptech/glide/load/MultiTransformation;", "Landroid/graphics/Bitmap;", "note", "skeletonLogo", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "getSkeletonLogo", "()Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "skeletonLogo$delegate", "Lkotlin/Lazy;", "title", "getLayout", "getRoundedCornerTransformation", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "parseAttrs", "", "setDescription", "setNote", "setTitle", "setup", "showImage", "src", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ImageWithDescriptionView extends BaseRichView {
    private final Lazy equals;
    private String getMax;
    private String getMin;
    private setScaleX<Bitmap> length;
    private Drawable setMax;
    private String setMin;
    private HashMap toIntRange;

    @JvmOverloads
    public ImageWithDescriptionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ImageWithDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
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
        return R.layout.view_image_with_description;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageWithDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageWithDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.equals = LazyKt.lazy(new setMax(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ImageWithDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.equals = LazyKt.lazy(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<getInsetDodgeRect> {
        final /* synthetic */ ImageWithDescriptionView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ImageWithDescriptionView imageWithDescriptionView) {
            super(0);
            this.this$0 = imageWithDescriptionView;
        }

        public final getInsetDodgeRect invoke() {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.this$0._$_findCachedViewById(resetInternal.setMax.getNanoTime));
            setmax.getMax = R.layout.view_sku_logo_skeleton;
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
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        this.length = new setScaleX<>(new allowsGoneWidget(), new updatePostConstraints(context.getResources().getDimensionPixelSize(R.dimen.f26342131165288)));
        Drawable drawable = this.setMax;
        if (drawable != null) {
            showImage(drawable);
        }
        String str = this.getMin;
        if (str != null) {
            setTitle(str);
        }
        String str2 = this.setMin;
        if (str2 != null) {
            setDescription(str2);
        }
        String str3 = this.getMax;
        if (str3 != null) {
            setNote(str3);
        }
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.onSessionReady);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext()\n           …ImageWithDescriptionView)");
            try {
                this.setMax = obtainStyledAttributes.getDrawable(2);
                this.getMin = obtainStyledAttributes.getString(3);
                this.setMin = obtainStyledAttributes.getString(0);
                this.getMax = obtainStyledAttributes.getString(1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void showImage(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "src");
        ((updateCornerMarking) Glide.getMax(getContext())).equals().setMax((int) R.drawable.ic_placeholder_merchant).toFloatRange(drawable).getMax((updatePostLayout<Bitmap>[]) new updatePostLayout[]{this.length}).setMin((int) R.drawable.ic_placeholder_merchant).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.startSupportActionMode));
    }

    public final void showImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        updateMessageMenuItem<Bitmap> min = ((updateCornerMarking) Glide.getMax(getContext())).equals().setMax((int) R.drawable.ic_placeholder_merchant).length(str).getMax((updatePostLayout<Bitmap>[]) new updatePostLayout[]{this.length}).setMin((int) R.drawable.ic_placeholder_merchant);
        min.length(new length(this, (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.startSupportActionMode)), (parseBehavior<Bitmap>) null, min, clamp.setMax());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0014J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0003\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/richview/imageview/ImageWithDescriptionView$showImage$1", "Lcom/bumptech/glide/request/target/CustomViewTarget;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Bitmap;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceCleared", "placeholder", "onResourceLoading", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends recordLastChildRect<AppCompatImageView, Bitmap> {
        final /* synthetic */ ImageWithDescriptionView length;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ImageWithDescriptionView imageWithDescriptionView, View view) {
            super(view);
            this.length = imageWithDescriptionView;
        }

        public final /* synthetic */ void getMin(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(bitmap, "resource");
            ImageWithDescriptionView.access$getSkeletonLogo$p(this.length).length();
            ((AppCompatImageView) this.length._$_findCachedViewById(resetInternal.setMax.startSupportActionMode)).setImageBitmap(bitmap);
        }

        public final void setMax(@Nullable Drawable drawable) {
            ImageWithDescriptionView.access$getSkeletonLogo$p(this.length).getMin();
            super.setMax(drawable);
        }

        public final void length(@Nullable Drawable drawable) {
            ImageWithDescriptionView.access$getSkeletonLogo$p(this.length).length();
            ((AppCompatImageView) this.length._$_findCachedViewById(resetInternal.setMax.startSupportActionMode)).setImageDrawable(drawable);
        }

        public final void setMin(@Nullable Drawable drawable) {
            ImageWithDescriptionView.access$getSkeletonLogo$p(this.length).length();
            ((AppCompatImageView) this.length._$_findCachedViewById(resetInternal.setMax.startSupportActionMode)).setImageDrawable(drawable);
        }
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "description");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.forceUniformHeight);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setNote(@Nullable String str) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getImeOptions);
        if (textView != null) {
            CharSequence charSequence = str;
            textView.setText(charSequence);
            View view = textView;
            int i = 0;
            if (!(!(charSequence == null || charSequence.length() == 0))) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static final /* synthetic */ getInsetDodgeRect access$getSkeletonLogo$p(ImageWithDescriptionView imageWithDescriptionView) {
        return (getInsetDodgeRect) imageWithDescriptionView.equals.getValue();
    }
}
