package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerModel;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.merchantreview.ViewRatingStarBar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConfirmPopup;
import o.OptionMenuRecyclerAdapter;
import o.UniformLocalAuthDialogExtensionImpl;
import o.containsFavoriteMenuItem;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0002J\u0017\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010(\u001a\u00020\u0015H\u0016J\u0012\u0010)\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010*\u001a\u00020\u0015H\u0002R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantYourReviewView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "merchantReview", "getMerchantReview", "()Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "setMerchantReview", "(Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getLayout", "", "hideMerchantMyReviewView", "", "loadSkeletonView", "setCreatedDate", "date", "", "setDate", "", "setDesc", "data", "setPhotoReview", "photo", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "setProfileAvatar", "url", "setRating", "rating", "(Ljava/lang/Integer;)V", "setUsername", "setup", "setupMerchantReview", "stopSkeletonLoading", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantYourReviewView extends BaseRichView {
    private final RecyclerView$FastBitmap$CoordinateSystem getMax;
    private onDetachedFromLayoutParams getMin;
    private HashMap setMax;
    @Nullable
    private OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 setMin;

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
        return R.layout.view_merchant_your_review;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mediaViewerModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<MediaViewerModel, Unit> {
        final /* synthetic */ MerchantYourReviewView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(MerchantYourReviewView merchantYourReviewView) {
            super(1);
            this.this$0 = merchantYourReviewView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MediaViewerModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MediaViewerModel mediaViewerModel) {
            String str;
            Intrinsics.checkNotNullParameter(mediaViewerModel, "mediaViewerModel");
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 merchantReview = this.this$0.getMerchantReview();
            String str2 = null;
            if (merchantReview != null) {
                str = merchantReview.toFloatRange;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 merchantReview2 = this.this$0.getMerchantReview();
            if (merchantReview2 != null) {
                str2 = merchantReview2.IsOverlapping;
            }
            if (str2 != null) {
                str3 = str2;
            }
            MerchantPhotoViewerModel merchantPhotoViewerModel = new MerchantPhotoViewerModel(str, str3, mediaViewerModel);
            MerchantPhotoViewerDialog.length length = MerchantPhotoViewerDialog.length;
            BaseActivity baseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "baseActivity.supportFragmentManager");
            MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, merchantPhotoViewerModel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantYourReviewView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantYourReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = new RecyclerView$FastBitmap$CoordinateSystem();
    }

    @Nullable
    public final OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 getMerchantReview() {
        return this.setMin;
    }

    public final void setMerchantReview(@Nullable OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r10) {
        String str;
        if (r10 != null) {
            int i = 0;
            if (!(r10.getMax.length() == 0)) {
                onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
                if (ondetachedfromlayoutparams != null) {
                    ondetachedfromlayoutparams.length();
                }
                String str2 = r10.length;
                Context context = getContext();
                if (context != null) {
                    ((updateCornerMarking) Glide.getMax(context)).equals().length(str2).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMin((int) R.drawable.avatar_placeholder).length((ImageView) _$_findCachedViewById(resetInternal.setMax.AppCompatDelegateImpl$PanelFeatureState$SavedState));
                }
                String str3 = r10.setMax;
                CharSequence charSequence = str3;
                String str4 = "";
                if (charSequence == null || charSequence.length() == 0) {
                    TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
                    if (textView != null) {
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                        textView.setText(context2.getResources().getString(R.string.user_review_anonymous_label));
                    }
                } else {
                    TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
                    if (textView2 != null) {
                        if (str3 == null) {
                            str3 = str4;
                        }
                        textView2.setText(str3);
                    }
                }
                String str5 = r10.getMin;
                CharSequence charSequence2 = str5;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.Toolbar$LayoutParams);
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                } else {
                    TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.Toolbar$LayoutParams);
                    if (textView4 != null) {
                        if (str5 == null) {
                            str5 = str4;
                        }
                        textView4.setText(str5);
                    }
                    TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.Toolbar$LayoutParams);
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                }
                Integer valueOf = Integer.valueOf(r10.setMin);
                ViewRatingStarBar viewRatingStarBar = (ViewRatingStarBar) _$_findCachedViewById(resetInternal.setMax.onStopNestedScroll);
                if (viewRatingStarBar != null) {
                    if (valueOf != null) {
                        i = valueOf.intValue();
                    }
                    viewRatingStarBar.setStarSelected(i);
                }
                List<MerchantImageModel> list = r10.toIntRange;
                UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog uniformLocalAuthDialog = new UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog(new getMin(this));
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onDragEvent);
                if (recyclerView != null) {
                    recyclerView.setAdapter(uniformLocalAuthDialog);
                }
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onDragEvent);
                if (recyclerView2 != null) {
                    recyclerView2.setRecycledViewPool(this.getMax);
                }
                uniformLocalAuthDialog.getMin(list);
                long j = r10.isInside;
                TextView textView6 = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbTintList);
                Intrinsics.checkNotNullExpressionValue(textView6, "tv_date");
                long min = ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j));
                Context context3 = getContext();
                int i2 = (int) min;
                Date date = new Date(j);
                if (i2 == 0) {
                    str = context3.getString(R.string.feed_section_today);
                } else if (i2 != 1) {
                    str = new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(new Date(date.getTime()));
                } else {
                    str = context3.getString(R.string.feed_section_yesterday);
                }
                if (ConfirmPopup.AnonymousClass1.length(date)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" ");
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(date);
                    sb.append(String.valueOf(instance.get(1)));
                    str = sb.toString();
                }
                if (str != null) {
                    str4 = str;
                }
                textView6.setText(str4);
                this.setMin = r10;
            }
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setHeaderViewInt);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.setMin = r10;
    }

    public final void setup() {
        if (this.getMin == null) {
            this.getMin = containsFavoriteMenuItem.getMin((LinearLayout) _$_findCachedViewById(resetInternal.setMax.setHeaderViewInt), R.layout.view_skeleton_merchant_latest_view);
        }
    }
}
