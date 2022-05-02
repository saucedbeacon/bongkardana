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
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import o.startBeaconDiscovery;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u001c\u0010\u001f\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\fJ\u0010\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010\fJ\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002J\u0006\u0010*\u001a\u00020\u0017J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0010J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0010J\u000e\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\fJ\u000e\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\fJ\u000e\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\fJ\b\u00105\u001a\u00020\u0017H\u0016J\u000e\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0010J\u000e\u00106\u001a\u00020\u00172\u0006\u00108\u001a\u00020\fJ\u0016\u00106\u001a\u00020\u00172\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0007J\u0012\u0010:\u001a\u00020\u00172\b\u0010;\u001a\u0004\u0018\u00010<H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lid/dana/richview/imageview/ImageWithHorizontalDescriptionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomLineDistanceText", "", "bottomLineFirstText", "bottomLineRedNoteText", "mainImage", "Landroid/graphics/drawable/Drawable;", "titleBadge", "titleText", "upperLineFirstText", "upperLineRedNoteText", "getLayout", "getStatusMaintenanceService", "", "isEnable", "", "hideDotBetweenText", "hideEverythingInBottomLine", "hideEverythingInUpperLine", "isAllTextBeforeNoteEmpty", "isAllUpperLineEmpty", "parseAttrs", "setBottomLineFirstText", "secondLineDescription", "setBottomRedNoteText", "redNote", "setDistanceText", "distance", "setDotAfterDistance", "setDotBeforeDistance", "setDotUpperLine", "setEmptyViewBeforeDistance", "setFirstLineBadgeGone", "setTitleBadge", "badgeDrawable", "badgeUrl", "setTitleBadgeWithVector", "setTitleText", "title", "setUpperLineFirstText", "upperDesc", "setUpperLineRedNoteText", "upperNote", "setup", "showImage", "src", "url", "placeholderDrawable", "showView", "view", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ImageWithHorizontalDescriptionView extends BaseRichView {
    private HashMap IsOverlapping;
    private String equals;
    private String getMax;
    private Drawable getMin;
    private String length;
    private String setMax;
    private Drawable setMin;
    private String toFloatRange;
    private String toIntRange;

    @JvmOverloads
    public ImageWithHorizontalDescriptionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ImageWithHorizontalDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_image_with_horizontal_description;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageWithHorizontalDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageWithHorizontalDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = "";
        this.getMax = "";
        this.toFloatRange = "";
        this.equals = "";
        this.toIntRange = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ImageWithHorizontalDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = "";
        this.getMax = "";
        this.toFloatRange = "";
        this.equals = "";
        this.toIntRange = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if ((r5.toFloatRange.length() == 0) != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setup() {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.setMin
            if (r0 == 0) goto L_0x0007
            r5.showImage((android.graphics.drawable.Drawable) r0)
        L_0x0007:
            java.lang.String r0 = r5.length
            r5.setTitleText(r0)
            android.graphics.drawable.Drawable r0 = r5.getMin
            if (r0 == 0) goto L_0x0013
            r5.setTitleBadge((android.graphics.drawable.Drawable) r0)
        L_0x0013:
            java.lang.String r0 = r5.getMax
            r5.setBottomLineFirstText(r0)
            java.lang.String r0 = r5.toFloatRange
            r5.setBottomRedNoteText(r0)
            java.lang.String r0 = r5.equals
            r5.setUpperLineFirstText(r0)
            java.lang.String r0 = r5.toIntRange
            r5.setUpperLineRedNoteText(r0)
            java.lang.String r0 = r5.getMax
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r5.setMax
            if (r0 != 0) goto L_0x004e
        L_0x003e:
            int r0 = o.resetInternal.setMax.getLocationOffset
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x004e
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x004e:
            java.lang.String r0 = r5.setMax
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r5.toFloatRange
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x0071
        L_0x0061:
            int r0 = o.resetInternal.setMax.measureNullChild
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0071
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x0071:
            java.lang.String r0 = r5.toIntRange
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007d
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x008f
            int r0 = o.resetInternal.setMax.layoutHorizontal
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x008f
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x008f:
            java.lang.String r0 = r5.getMax
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x009b
            r0 = 1
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r3 = 8
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = r5.setMax
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = r5.toFloatRange
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b0
            r0 = 1
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            if (r0 == 0) goto L_0x0101
            int r0 = o.resetInternal.setMax.MenuPopupWindow$MenuDropDownListView
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00c0
            r0.setVisibility(r3)
        L_0x00c0:
            int r0 = o.resetInternal.setMax.getLocationOffset
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00cd
            r0.setVisibility(r3)
        L_0x00cd:
            int r0 = o.resetInternal.setMax.setSingleChoiceItems
            android.view.View r0 = r5._$_findCachedViewById(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            if (r0 == 0) goto L_0x00da
            r0.setVisibility(r3)
        L_0x00da:
            int r0 = o.resetInternal.setMax.measureChildBeforeLayout
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00e7
            r0.setVisibility(r3)
        L_0x00e7:
            int r0 = o.resetInternal.setMax.measureNullChild
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00f4
            r0.setVisibility(r3)
        L_0x00f4:
            int r0 = o.resetInternal.setMax.isMeasureWithLargestChildEnabled
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0101
            r0.setVisibility(r3)
        L_0x0101:
            java.lang.String r0 = r5.equals
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x010d
            r0 = 1
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r5.toIntRange
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            if (r1 == 0) goto L_0x0138
            int r0 = o.resetInternal.setMax.LinearLayoutCompat$DividerMode
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x012b
            r0.setVisibility(r3)
        L_0x012b:
            int r0 = o.resetInternal.setMax.performCompletion
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0138
            r0.setVisibility(r3)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.imageview.ImageWithHorizontalDescriptionView.setup():void");
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.IMediaSession);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext()\n           …orizontalDescriptionView)");
            try {
                this.setMin = obtainStyledAttributes.getDrawable(3);
                String string = obtainStyledAttributes.getString(6);
                String str = "";
                if (string == null) {
                    string = str;
                }
                this.length = string;
                this.getMin = obtainStyledAttributes.getDrawable(4);
                String string2 = obtainStyledAttributes.getString(1);
                if (string2 == null) {
                    string2 = str;
                }
                this.getMax = string2;
                String string3 = obtainStyledAttributes.getString(0);
                if (string3 == null) {
                    string3 = str;
                }
                this.setMax = string3;
                String string4 = obtainStyledAttributes.getString(2);
                if (string4 == null) {
                    string4 = str;
                }
                this.toFloatRange = string4;
                String string5 = obtainStyledAttributes.getString(7);
                if (string5 == null) {
                    string5 = str;
                }
                this.equals = string5;
                String string6 = obtainStyledAttributes.getString(8);
                if (string6 != null) {
                    str = string6;
                }
                this.toIntRange = str;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void showImage(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "src");
        ImageWithRibbonView imageWithRibbonView = (ImageWithRibbonView) _$_findCachedViewById(resetInternal.setMax.setDefaultShowAsAction);
        if (imageWithRibbonView != null) {
            imageWithRibbonView.showImage(drawable);
        }
    }

    public final void showImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        ImageWithRibbonView imageWithRibbonView = (ImageWithRibbonView) _$_findCachedViewById(resetInternal.setMax.setDefaultShowAsAction);
        if (imageWithRibbonView != null) {
            ImageWithRibbonView.showImage$default(imageWithRibbonView, str, 0, 2, (Object) null);
        }
    }

    public final void showImage(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        ImageWithRibbonView imageWithRibbonView = (ImageWithRibbonView) _$_findCachedViewById(resetInternal.setMax.setDefaultShowAsAction);
        if (imageWithRibbonView != null) {
            imageWithRibbonView.showImage(str, i);
        }
    }

    public final void setTitleBadge(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "badgeDrawable");
        updateMessageMenuItem<Bitmap> equals2 = ((updateCornerMarking) Glide.getMax(getContext())).equals();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        updateMessageMenuItem<Bitmap> floatRange = equals2.getMax(startBeaconDiscovery.getMax(context, R.drawable.ic_verified_blue)).toFloatRange(drawable);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        floatRange.setMin(startBeaconDiscovery.getMax(context2, R.drawable.ic_verified_blue)).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getDrawerToggleDelegate));
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getDrawerToggleDelegate);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
    }

    public final void setTitleBadgeWithVector(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "badgeDrawable");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getDrawerToggleDelegate);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(drawable);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) appCompatImageView.findViewById(resetInternal.setMax.getDrawerToggleDelegate);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
        }
    }

    public final void setTitleBadge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "badgeUrl");
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMax(17170443).setMin(17170443).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getDrawerToggleDelegate));
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getDrawerToggleDelegate);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
    }

    public final void setTitleText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onItemClicked);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.onItemClicked);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    public final void setFirstLineBadgeGone() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getDrawerToggleDelegate);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    public final void setBottomLineFirstText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "secondLineDescription");
        this.getMax = str;
        CharSequence charSequence = str;
        if (charSequence.length() > 0) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.MenuPopupWindow$MenuDropDownListView);
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.MenuPopupWindow$MenuDropDownListView);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        setMin();
    }

    public final void setDistanceText(@Nullable String str) {
        this.setMax = str;
        if (str != null) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.measureChildBeforeLayout);
            if (textView != null) {
                textView.setText(str);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSingleChoiceItems);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.measureChildBeforeLayout);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if ((this.getMax.length() == 0) && this.setMax != null) {
                TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.MenuPopupWindow$MenuDropDownListView);
                if (textView3 != null) {
                    textView3.setText("");
                }
                TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.MenuPopupWindow$MenuDropDownListView);
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
            }
            setMin();
            length();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if ((r0 == null || r0.length() == 0) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setMin() {
        /*
            r4 = this;
            java.lang.String r0 = r4.getMax
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r4.setMax
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x004f
            int r0 = o.resetInternal.setMax.getLocationOffset
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0041
            android.content.Context r1 = r4.getContext()
            r3 = 2131886851(0x7f120303, float:1.9408293E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0041:
            int r0 = o.resetInternal.setMax.getLocationOffset
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x004e
            r0.setVisibility(r2)
        L_0x004e:
            return
        L_0x004f:
            int r0 = o.resetInternal.setMax.getLocationOffset
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0065
            android.view.View r0 = (android.view.View) r0
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.imageview.ImageWithHorizontalDescriptionView.setMin():void");
    }

    private final void length() {
        CharSequence charSequence;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.measureNullChild);
        if (textView != null) {
            if (!getMax()) {
                if (!(this.toFloatRange.length() == 0)) {
                    charSequence = getContext().getString(R.string.dot);
                    textView.setText(charSequence);
                }
            }
            textView.setText(charSequence);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.measureNullChild);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    private final boolean getMax() {
        return (this.getMax.length() == 0) && this.setMax == null;
    }

    private final boolean setMax() {
        if (this.equals.length() == 0) {
            if (this.toIntRange.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void setBottomRedNoteText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "redNote");
        this.toFloatRange = str;
        if (str.length() > 0) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.isMeasureWithLargestChildEnabled);
            if (textView != null) {
                textView.setText(this.toFloatRange);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.isMeasureWithLargestChildEnabled);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            length();
        }
    }

    public final void setUpperLineFirstText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "upperDesc");
        this.equals = str;
        if (str.length() > 0) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$DividerMode);
            if (textView != null) {
                textView.setText(this.equals);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$DividerMode);
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$DividerMode);
        Intrinsics.checkNotNullExpressionValue(textView3, "tvFirstTextUpperLine");
        textView3.setVisibility(8);
    }

    public final void setUpperLineRedNoteText(@NotNull String str) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "upperNote");
        this.toIntRange = str;
        if (str.length() > 0) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.performCompletion);
            if (textView != null) {
                textView.setText(this.toIntRange);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.performCompletion);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.layoutHorizontal);
            if (textView3 != null) {
                if (!setMax()) {
                    charSequence = getContext().getString(R.string.dot);
                }
                textView3.setText(charSequence);
            }
            TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.layoutHorizontal);
            if (textView4 != null) {
                textView4.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.performCompletion);
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
    }

    public final void getStatusMaintenanceService(boolean z) {
        if (!z) {
            ImageWithRibbonView imageWithRibbonView = (ImageWithRibbonView) _$_findCachedViewById(resetInternal.setMax.setDefaultShowAsAction);
            if (imageWithRibbonView != null) {
                imageWithRibbonView.setImageGreyscale();
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.performCompletion);
            if (textView != null) {
                textView.setText(getResources().getString(R.string.global_search_service_under_maintenance));
                return;
            }
            return;
        }
        ImageWithRibbonView imageWithRibbonView2 = (ImageWithRibbonView) _$_findCachedViewById(resetInternal.setMax.setDefaultShowAsAction);
        if (imageWithRibbonView2 != null) {
            imageWithRibbonView2.removeImageGreyscale();
        }
    }
}
