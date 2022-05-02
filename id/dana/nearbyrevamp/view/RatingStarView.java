package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.resetInternal;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0014\u0010\u001f\u001a\u00020\u0019*\u00020\u00162\u0006\u0010 \u001a\u00020\u0007H\u0002R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/nearbyrevamp/view/RatingStarView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "rating", "getRating", "()F", "setRating", "(F)V", "starHeight", "starWidth", "stars", "", "Landroidx/appcompat/widget/AppCompatImageView;", "getLayout", "parseAttrs", "", "populateStar", "newRating", "setStarSize", "setup", "updateStarValue", "loadImage", "icStarFilled", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RatingStarView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private int getMax;
    private List<? extends AppCompatImageView> getMin;
    private int length;
    private float setMax;
    private HashMap setMin;

    @JvmOverloads
    public RatingStarView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RatingStarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_rating_star;
    }

    public final float getRating() {
        return this.setMax;
    }

    public final void setRating(float f) {
        double ceil;
        this.setMax = f;
        if (((double) f) <= 0.0d || ((double) f) >= 0.5d) {
            float f2 = this.setMax;
            String format = new DecimalFormat("#.#").format(Float.valueOf(f2 % 1.0f));
            Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"#.#\").format(newRating % 1)");
            double parseFloat = (double) Float.parseFloat(StringsKt.replace$default(format, ",", ".", false, 4, (Object) null));
            if (parseFloat < 0.3d) {
                ceil = Math.floor((double) f2);
            } else if (parseFloat < 0.3d || parseFloat > 0.7d) {
                if (parseFloat > 0.7d) {
                    ceil = Math.ceil((double) f2);
                }
                setMin(f2);
                return;
            } else {
                f2 = ((float) Math.floor((double) f2)) + 0.5f;
                setMin(f2);
                return;
            }
            f2 = (float) ceil;
            setMin(f2);
            return;
        }
        setMin(f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingStarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RatingStarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = 16;
        this.length = 16;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public RatingStarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = 16;
        this.length = 16;
    }

    public final void setup() {
        List<? extends AppCompatImageView> listOf = CollectionsKt.listOf((AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onDestroy), (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onSupportContentChanged), (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onPanelClosed), (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.supportRequestWindowFeature), (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onPostResume));
        this.getMin = listOf;
        if (listOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stars");
        }
        for (AppCompatImageView layoutParams : listOf) {
            ViewGroup.LayoutParams layoutParams2 = layoutParams.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams2, "it.layoutParams");
            int i = this.getMax;
            if (!(i == 16 || this.length == 16)) {
                layoutParams2.width = i;
                layoutParams2.height = this.length;
            }
        }
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, resetInternal.getMin.ResultReceiver$MyResultReceiver) : null;
        if (obtainStyledAttributes != null) {
            try {
                this.getMax = (int) obtainStyledAttributes.getDimension(1, 16.0f);
                this.length = (int) obtainStyledAttributes.getDimension(0, 16.0f);
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

    private final void setMin(float f) {
        int i = 0;
        for (int i2 = 1; i2 <= 5; i2++) {
            if (((float) i2) <= f) {
                i++;
                List<? extends AppCompatImageView> list = this.getMin;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stars");
                }
                ((updateCornerMarking) Glide.setMin((View) this)).equals().length(Integer.valueOf(R.drawable.ic_star_24dp_filled)).length((ImageView) (AppCompatImageView) list.get(i2 - 1));
            } else {
                List<? extends AppCompatImageView> list2 = this.getMin;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stars");
                }
                ((updateCornerMarking) Glide.setMin((View) this)).equals().length(Integer.valueOf(R.drawable.ic_star_24dp_blank)).length((ImageView) (AppCompatImageView) list2.get(i2 - 1));
            }
        }
        if (i < 5) {
            float f2 = f - ((float) i);
            if (f2 == 0.5f) {
                List<? extends AppCompatImageView> list3 = this.getMin;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stars");
                }
                ((updateCornerMarking) Glide.setMin((View) this)).equals().length(Integer.valueOf(R.drawable.ic_star_24dp_half_filled)).length((ImageView) (AppCompatImageView) list3.get(i));
            } else if (f2 == 1.0f) {
                List<? extends AppCompatImageView> list4 = this.getMin;
                if (list4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stars");
                }
                ((updateCornerMarking) Glide.setMin((View) this)).equals().length(Integer.valueOf(R.drawable.ic_star_24dp_filled)).length((ImageView) (AppCompatImageView) list4.get(i));
            } else {
                List<? extends AppCompatImageView> list5 = this.getMin;
                if (list5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stars");
                }
                ((updateCornerMarking) Glide.setMin((View) this)).equals().length(Integer.valueOf(R.drawable.ic_star_24dp_blank)).length((ImageView) (AppCompatImageView) list5.get(i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/view/RatingStarView$Companion;", "", "()V", "DEFAULT_STAR_HEIGHT", "", "DEFAULT_STAR_WIDTH", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
