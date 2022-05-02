package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.nearbyme.merchantdetail.enums.MerchantMenu;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment;
import id.dana.nearbyme.model.ShopModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.OptionMenuRecyclerAdapter;
import o.UniformLocalAuthDialogExtensionImpl;
import o.j;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020 H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020 H\u0002J\u0012\u0010$\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010%\u001a\u00020\f2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002J\u0012\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0002J\u0017\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010/\u001a\u00020\fH\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantLatestReviewViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "parent", "Landroid/view/ViewGroup;", "reviewSize", "", "currentShopModel", "Lid/dana/nearbyme/model/ShopModel;", "clickListener", "Lkotlin/Function1;", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "", "hasOtherReviews", "", "pageSource", "", "(Landroid/view/ViewGroup;ILid/dana/nearbyme/model/ShopModel;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;)V", "adapter", "Lid/dana/nearbyme/merchantdetail/adapter/MerchantLatestReviewPhotoAdapter;", "getParent", "()Landroid/view/ViewGroup;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "bindData", "data", "checkIfReviewsIsPastYear", "date", "Ljava/util/Date;", "getDateText", "diffDay", "getDayDiff", "", "dateTime", "setCreatedDate", "setDate", "setDesc", "setPhotoReview", "photo", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "setProfileAvatar", "url", "setRating", "rating", "(Ljava/lang/Integer;)V", "setUsername", "showSeeOtherButton", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NavigationBarUtil extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public final ShopModel IsOverlapping;
    private final int equals;
    private UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog getMax;
    @NotNull
    private final ViewGroup getMin;
    /* access modifiers changed from: private */
    public final String isInside;
    private final RecyclerView$FastBitmap$CoordinateSystem setMin = new RecyclerView$FastBitmap$CoordinateSystem();
    private final Function1<MediaViewerModel, Unit> toFloatRange;
    private final boolean toIntRange;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: o.NavigationBarUtil$1  reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] getMax;
        public static final /* synthetic */ int[] length;
        public static final /* synthetic */ int[] setMax;

        static {
            int[] iArr = new int[MerchantMenu.values().length];
            length = iArr;
            iArr[MerchantMenu.RESERVE.ordinal()] = 1;
            length[MerchantMenu.PICK_UP.ordinal()] = 2;
            length[MerchantMenu.CONTACT_US.ordinal()] = 3;
            length[MerchantMenu.DIRECTION.ordinal()] = 4;
            length[MerchantMenu.TOP_UP.ordinal()] = 5;
            length[MerchantMenu.HOME_SHOPPING.ordinal()] = 6;
            int[] iArr2 = new int[MerchantMenu.values().length];
            getMax = iArr2;
            iArr2[MerchantMenu.RESERVE.ordinal()] = 1;
            getMax[MerchantMenu.PICK_UP.ordinal()] = 2;
            getMax[MerchantMenu.CONTACT_US.ordinal()] = 3;
            getMax[MerchantMenu.DIRECTION.ordinal()] = 4;
            getMax[MerchantMenu.TOP_UP.ordinal()] = 5;
            getMax[MerchantMenu.HOME_SHOPPING.ordinal()] = 6;
            int[] iArr3 = new int[MerchantMenu.values().length];
            setMax = iArr3;
            iArr3[MerchantMenu.RESERVE.ordinal()] = 1;
            setMax[MerchantMenu.PICK_UP.ordinal()] = 2;
            setMax[MerchantMenu.CONTACT_US.ordinal()] = 3;
            setMax[MerchantMenu.DIRECTION.ordinal()] = 4;
            setMax[MerchantMenu.TOP_UP.ordinal()] = 5;
            setMax[MerchantMenu.HOME_SHOPPING.ordinal()] = 6;
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r3;
        OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3 r11 = (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) obj;
        if (!(r11 == null || (r3 = r11.getMax) == null)) {
            String str = r3.length;
            Context context = this.length;
            if (context != null) {
                updateMessageMenuItem<Bitmap> min = ((updateCornerMarking) Glide.getMax(context)).equals().length(str).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMin((int) R.drawable.avatar_placeholder);
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                min.length((ImageView) view.findViewById(resetInternal.setMax.AppCompatDelegateImpl$PanelFeatureState$SavedState));
            }
            String str2 = r3.setMax;
            CharSequence charSequence = str2;
            String str3 = "";
            if (charSequence == null || charSequence.length() == 0) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView = (TextView) view2.findViewById(resetInternal.setMax.onGetSmallIconId);
                if (textView != null) {
                    Context context2 = this.length;
                    Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                    textView.setText(context2.getResources().getString(R.string.user_review_anonymous_label));
                }
            } else {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.onGetSmallIconId);
                if (textView2 != null) {
                    if (str2 == null) {
                        str2 = str3;
                    }
                    textView2.setText(str2);
                }
            }
            String str4 = r3.getMin;
            CharSequence charSequence2 = str4;
            if (charSequence2 == null || charSequence2.length() == 0) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView3 = (TextView) view4.findViewById(resetInternal.setMax.Toolbar$LayoutParams);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                TextView textView4 = (TextView) view5.findViewById(resetInternal.setMax.Toolbar$LayoutParams);
                if (textView4 != null) {
                    if (str4 == null) {
                        str4 = str3;
                    }
                    textView4.setText(str4);
                }
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                TextView textView5 = (TextView) view6.findViewById(resetInternal.setMax.Toolbar$LayoutParams);
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            }
            Integer valueOf = Integer.valueOf(r3.setMin);
            if (valueOf == null) {
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                TextView textView6 = (TextView) view7.findViewById(resetInternal.setMax.isChildOrHidden);
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
            } else if (valueOf.intValue() != 0) {
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                TextView textView7 = (TextView) view8.findViewById(resetInternal.setMax.isChildOrHidden);
                Intrinsics.checkNotNullExpressionValue(textView7, "itemView.tv_rating");
                textView7.setVisibility(0);
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                TextView textView8 = (TextView) view9.findViewById(resetInternal.setMax.isChildOrHidden);
                Intrinsics.checkNotNullExpressionValue(textView8, "itemView.tv_rating");
                textView8.setText(String.valueOf(valueOf.intValue()));
            } else {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                TextView textView9 = (TextView) view10.findViewById(resetInternal.setMax.isChildOrHidden);
                Intrinsics.checkNotNullExpressionValue(textView9, "itemView.tv_rating");
                textView9.setVisibility(8);
            }
            List<MerchantImageModel> list = r3.toIntRange;
            this.getMax = new UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog(this.toFloatRange);
            View view11 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view11, "itemView");
            RecyclerView recyclerView = (RecyclerView) view11.findViewById(resetInternal.setMax.onDragEvent);
            if (recyclerView != null) {
                UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog uniformLocalAuthDialog = this.getMax;
                if (uniformLocalAuthDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                recyclerView.setAdapter(uniformLocalAuthDialog);
            }
            View view12 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view12, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view12.findViewById(resetInternal.setMax.onDragEvent);
            if (recyclerView2 != null) {
                recyclerView2.setRecycledViewPool(this.setMin);
            }
            UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog uniformLocalAuthDialog2 = this.getMax;
            if (uniformLocalAuthDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            uniformLocalAuthDialog2.getMin(list);
            long j = r3.isInside;
            View view13 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view13, "itemView");
            TextView textView10 = (TextView) view13.findViewById(resetInternal.setMax.getThumbTintList);
            Intrinsics.checkNotNullExpressionValue(textView10, "itemView.tv_date");
            int min2 = (int) ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j));
            Date date = new Date(j);
            String str5 = null;
            if (min2 == 0) {
                Context context3 = this.length;
                if (context3 != null) {
                    str5 = context3.getString(R.string.feed_section_today);
                }
            } else if (min2 != 1) {
                str5 = new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(new Date(date.getTime()));
            } else {
                Context context4 = this.length;
                if (context4 != null) {
                    str5 = context4.getString(R.string.feed_section_yesterday);
                }
            }
            if (length(date)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                sb.append(' ');
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                sb.append(String.valueOf(instance.get(1)));
                str5 = sb.toString();
            }
            if (str5 != null) {
                str3 = str5;
            }
            textView10.setText(str3);
        }
        if (r11 != null && r11.setMax == 0 && getAdapterPosition() == this.equals - 1 && this.toIntRange) {
            View view14 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view14, "itemView");
            Button button = (Button) view14.findViewById(resetInternal.setMax.RemoteActionCompatParcelizer);
            if (button != null) {
                button.setVisibility(0);
            }
            View view15 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view15, "itemView");
            Button button2 = (Button) view15.findViewById(resetInternal.setMax.RemoteActionCompatParcelizer);
            if (button2 != null) {
                button2.setOnClickListener(new getMax(this));
            }
        }
    }

    public final class OnNavigationStateListener implements getBindingAdapter<MerchantReviewDialogFragment> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment.presenter")
        public static void getMin(MerchantReviewDialogFragment merchantReviewDialogFragment, j.AnonymousClass1.length length) {
            merchantReviewDialogFragment.presenter = length;
        }

        @InjectedFieldSignature("id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment.tracker")
        public static void setMax(MerchantReviewDialogFragment merchantReviewDialogFragment, addError adderror) {
            merchantReviewDialogFragment.tracker = adderror;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBarUtil(@NotNull ViewGroup viewGroup, int i, @NotNull ShopModel shopModel, @NotNull Function1<? super MediaViewerModel, Unit> function1, boolean z, @NotNull String str) {
        super(viewGroup.getContext(), R.layout.view_item_latest_review, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(shopModel, "currentShopModel");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        Intrinsics.checkNotNullParameter(str, "pageSource");
        this.getMin = viewGroup;
        this.equals = i;
        this.IsOverlapping = shopModel;
        this.toFloatRange = function1;
        this.toIntRange = z;
        this.isInside = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ NavigationBarUtil getMax;

        getMax(NavigationBarUtil navigationBarUtil) {
            this.getMax = navigationBarUtil;
        }

        public final void onClick(View view) {
            MerchantReviewDetailActivity.length length = MerchantReviewDetailActivity.Companion;
            Context context = this.getMax.length;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            MerchantReviewDetailActivity.length.length(context, this.getMax.isInside, this.getMax.IsOverlapping);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantLatestReviewViewHolder$Companion;", "", "()V", "DIFF_TODAY", "", "DIFF_YESTERDAY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    private static boolean length(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return true;
        }
        return false;
    }
}
