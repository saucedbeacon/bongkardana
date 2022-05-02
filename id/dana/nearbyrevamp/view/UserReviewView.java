package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerModel;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConfirmPopup;
import o.OptionMenuRecyclerAdapter;
import o.UniformLocalAuthDialogExtensionImpl;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.resetInternal;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\u00020\u0001:\u0001.B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0019H\u0002J\u0016\u0010 \u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0016H\u0002J\u0010\u0010*\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0016H\u0002J\b\u0010-\u001a\u00020\u001dH\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lid/dana/nearbyrevamp/view/UserReviewView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adapter", "Lid/dana/nearbyme/merchantdetail/adapter/MerchantLatestReviewPhotoAdapter;", "merchantReviewModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "checkIfReviewsIsPastYear", "", "date", "Ljava/util/Date;", "getDateText", "", "diffDay", "getDayDiff", "", "dateTime", "getLayout", "setCreatedDate", "", "setData", "setDate", "setPhotos", "images", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "setProfileAvatar", "url", "setRating", "rating", "setReview", "review", "setShopModel", "setUsername", "userName", "setup", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UserReviewView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private HashMap getMin;
    /* access modifiers changed from: private */
    public ShopModel length;
    private UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog setMax;
    /* access modifiers changed from: private */
    public OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 setMin;

    @JvmOverloads
    public UserReviewView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public UserReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_user_review;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mediaViewerModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<MediaViewerModel, Unit> {
        final /* synthetic */ UserReviewView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(UserReviewView userReviewView) {
            super(1);
            this.this$0 = userReviewView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MediaViewerModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MediaViewerModel mediaViewerModel) {
            String str;
            Intrinsics.checkNotNullParameter(mediaViewerModel, "mediaViewerModel");
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 access$getMerchantReviewModel$p = this.this$0.setMin;
            if (access$getMerchantReviewModel$p != null) {
                ShopModel access$getShopModel$p = this.this$0.length;
                if (access$getShopModel$p != null) {
                    str = access$getShopModel$p.invoke;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                MerchantPhotoViewerModel merchantPhotoViewerModel = new MerchantPhotoViewerModel(str, access$getMerchantReviewModel$p.IsOverlapping, mediaViewerModel);
                BaseActivity baseActivity = this.this$0.getBaseActivity();
                if (baseActivity != null) {
                    MerchantPhotoViewerDialog.length length = MerchantPhotoViewerDialog.length;
                    FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                    MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, merchantPhotoViewerModel);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserReviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public UserReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setup() {
        this.setMax = new UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog(new setMin(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.rvPhotos);
        if (recyclerView != null) {
            UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog uniformLocalAuthDialog = this.setMax;
            if (uniformLocalAuthDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            recyclerView.setAdapter(uniformLocalAuthDialog);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new RecyclerView.getMax() {
                private final int getMin = 8;

                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                    rect.left = this.getMin;
                    rect.right = this.getMin;
                    rect.bottom = this.getMin;
                }
            });
            ViewCompat.setMax((View) recyclerView, false);
            recyclerView.setRecycledViewPool(new RecyclerView$FastBitmap$CoordinateSystem());
        }
    }

    public final void setData(@Nullable OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r8) {
        if (r8 != null) {
            this.setMin = r8;
            String str = r8.length;
            Context context = getContext();
            if (context != null) {
                ((updateCornerMarking) Glide.getMax(context)).equals().length(str).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMin((int) R.drawable.avatar_placeholder).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.ivUserAvatar));
            }
            String str2 = r8.setMax;
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onFocusChanged);
            if (textView != null) {
                CharSequence charSequence = str2;
                if (charSequence.length() == 0) {
                    charSequence = getContext().getString(R.string.user_review_anonymous_label);
                }
                textView.setText(charSequence);
            }
            CharSequence charSequence2 = r8.getMin;
            if (charSequence2.length() == 0) {
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.tvReview);
                if (textView2 != null) {
                    View view = textView2;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(8);
                }
            } else {
                TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.tvReview);
                if (textView3 != null) {
                    View view2 = textView3;
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    view2.setVisibility(0);
                }
                TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.tvReview);
                if (textView4 != null) {
                    textView4.setText(charSequence2);
                }
            }
            int i = r8.setMin;
            if (i == 0) {
                RatingStarView ratingStarView = (RatingStarView) _$_findCachedViewById(resetInternal.setMax.getRadius);
                if (ratingStarView != null) {
                    View view3 = ratingStarView;
                    Intrinsics.checkNotNullParameter(view3, "<this>");
                    view3.setVisibility(8);
                }
            } else {
                RatingStarView ratingStarView2 = (RatingStarView) _$_findCachedViewById(resetInternal.setMax.getRadius);
                if (ratingStarView2 != null) {
                    View view4 = ratingStarView2;
                    Intrinsics.checkNotNullParameter(view4, "<this>");
                    view4.setVisibility(0);
                }
                RatingStarView ratingStarView3 = (RatingStarView) _$_findCachedViewById(resetInternal.setMax.getRadius);
                if (ratingStarView3 != null) {
                    ratingStarView3.setRating((float) i);
                }
            }
            long j = r8.isInside;
            TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.setSuggestionsAdapter);
            if (textView5 != null) {
                int min = (int) ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j));
                Date date = new Date(j);
                String str3 = null;
                if (min == 0) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        str3 = context2.getString(R.string.feed_section_today);
                    }
                } else if (min != 1) {
                    str3 = new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(new Date(date.getTime()));
                } else {
                    Context context3 = getContext();
                    if (context3 != null) {
                        str3 = context3.getString(R.string.feed_section_yesterday);
                    }
                }
                if (getMax(date)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(' ');
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(date);
                    sb.append(String.valueOf(instance.get(1)));
                    str3 = sb.toString();
                }
                if (str3 == null) {
                    str3 = "";
                }
                textView5.setText(str3);
            }
            List<MerchantImageModel> list = r8.toIntRange;
            UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog uniformLocalAuthDialog = this.setMax;
            if (uniformLocalAuthDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            uniformLocalAuthDialog.getMin(list);
        }
    }

    public final void setShopModel(@Nullable ShopModel shopModel) {
        this.length = shopModel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/view/UserReviewView$Companion;", "", "()V", "DIFF_TODAY", "", "DIFF_YESTERDAY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    private static boolean getMax(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return true;
        }
        return false;
    }
}
