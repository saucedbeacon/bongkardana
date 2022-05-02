package o;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.domain.promoquest.model.PrizeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/promoquest/adapter/TabAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "pageTitles", "", "addFragment", "", "fragment", "key", "", "title", "getCount", "", "getItem", "position", "getPageTitle", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ImageBridgeExtension extends onLevelChange {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);
    private final ArrayList<Fragment> getMax = new ArrayList<>();
    private final ArrayList<CharSequence> setMin = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageBridgeExtension(@NotNull FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
    }

    public final void setMin(@NotNull Fragment fragment, @NotNull String str, @Nullable CharSequence charSequence) {
        int length = str.length();
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-373887658, oncanceled);
            onCancelLoad.getMin(-373887658, oncanceled);
        }
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "key");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        fragment.setArguments(arguments);
        Bundle arguments2 = fragment.getArguments();
        if (arguments2 != null) {
            arguments2.putString("TabAdapter.key", str);
        }
        this.getMax.add(fragment);
        this.setMin.add(charSequence);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"openPrize", "", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "listener", "Lid/dana/danah5/DanaH5Listener;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.ImageBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 {
        public static final void setMax(@NotNull GriverAMCSAppUpdater griverAMCSAppUpdater, @NotNull getShortName getshortname) {
            String str;
            Intrinsics.checkNotNullParameter(griverAMCSAppUpdater, "$this$openPrize");
            Intrinsics.checkNotNullParameter(getshortname, "dynamicUrlWrapper");
            String prizeType = griverAMCSAppUpdater.getPrizeType();
            if (prizeType != null) {
                int hashCode = prizeType.hashCode();
                if (hashCode != 807116442) {
                    if (hashCode == 1262689061 && prizeType.equals(PrizeType.CHANCETOKEN)) {
                        str = "https://m.dana.id/m/tap-win";
                        DanaH5.startContainerFullUrl(str, (setCancelOnTouchOutside$core) null);
                    }
                } else if (prizeType.equals(PrizeType.CASHBACK)) {
                    String transactionDetailUrl = getshortname.getTransactionDetailUrl();
                    Intrinsics.checkNotNullExpressionValue(transactionDetailUrl, "dynamicUrlWrapper.transactionDetailUrl");
                    str = String.format(transactionDetailUrl, Arrays.copyOf(new Object[]{griverAMCSAppUpdater.getPrizeAwardOrderId()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
                    DanaH5.startContainerFullUrl(str, (setCancelOnTouchOutside$core) null);
                }
            }
            String voucherDetail = getshortname.getVoucherDetail();
            Intrinsics.checkNotNullExpressionValue(voucherDetail, "dynamicUrlWrapper.voucherDetail");
            str = String.format(voucherDetail, Arrays.copyOf(new Object[]{griverAMCSAppUpdater.getVoucherId()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
            DanaH5.startContainerFullUrl(str, (setCancelOnTouchOutside$core) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/promoquest/fragment/PromoQuestRewardDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "displaySuccessMessage", "", "onPrimaryButtonClicked", "Lkotlin/Function0;", "", "(ZLkotlin/jvm/functions/Function0;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "onShow", "onStart", "setButtonListener", "setDialogContent", "setRewardClaimFailed", "setRewardClaimSuccess", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class CheckFilePathResult extends order {
        @NotNull
        public static final getMin getMax = new getMin((byte) 0);
        /* access modifiers changed from: private */
        public final Function0<Unit> IsOverlapping;
        private final boolean getMin;
        private HashMap toFloatRange;

        private View setMax(int i) {
            if (this.toFloatRange == null) {
                this.toFloatRange = new HashMap();
            }
            View view = (View) this.toFloatRange.get(Integer.valueOf(i));
            if (view != null) {
                return view;
            }
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this.toFloatRange.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }

        public final int getMin() {
            return R.layout.view_coordinator_promo_quest_reward;
        }

        public final float length() {
            return 0.5f;
        }

        public CheckFilePathResult(boolean z, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "onPrimaryButtonClicked");
            this.getMin = z;
            this.IsOverlapping = function0;
        }

        @NotNull
        public final FrameLayout getMax() {
            FrameLayout frameLayout = (FrameLayout) setMax(resetInternal.setMax.equals);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "bs_promo_quest_claim");
            return frameLayout;
        }

        public final void onStart() {
            super.onStart();
            getMax(getDialog());
            length(getDialog());
        }

        public final void setMax() {
            super.setMax();
            if (this.getMin) {
                ImageView imageView = (ImageView) setMax(resetInternal.setMax.ActionMenuItemView);
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.prize_claimed_success);
                }
                TextView textView = (TextView) setMax(resetInternal.setMax.CustomTabsIntent$ShareState);
                if (textView != null) {
                    textView.setText(getString(R.string.quest_success_claim_title));
                }
                TextView textView2 = (TextView) setMax(resetInternal.setMax.setSplitTrack);
                if (textView2 != null) {
                    textView2.setText(getString(R.string.quest_success_claim_description));
                }
                DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMax(resetInternal.setMax.INotificationSideChannel$Default);
                if (danaButtonPrimaryView != null) {
                    danaButtonPrimaryView.setActiveButton(getString(R.string.see_prize), (Drawable) null);
                }
            } else {
                ImageView imageView2 = (ImageView) setMax(resetInternal.setMax.ActionMenuItemView);
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.prize_claimed_failed);
                }
                TextView textView3 = (TextView) setMax(resetInternal.setMax.CustomTabsIntent$ShareState);
                if (textView3 != null) {
                    textView3.setText(getString(R.string.quest_failed_claim_title));
                }
                TextView textView4 = (TextView) setMax(resetInternal.setMax.setSplitTrack);
                if (textView4 != null) {
                    textView4.setText(getString(R.string.quest_failed_claim_description));
                }
                DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) setMax(resetInternal.setMax.INotificationSideChannel$Default);
                if (danaButtonPrimaryView2 != null) {
                    danaButtonPrimaryView2.setActiveButton(getString(R.string.get_help), (Drawable) null);
                }
            }
            ((DanaButtonSecondaryView) setMax(resetInternal.setMax.IconCompatParcelizer)).setOnClickListener(new length(this));
            ((DanaButtonPrimaryView) setMax(resetInternal.setMax.INotificationSideChannel$Default)).setOnClickListener(new getMax(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class length implements View.OnClickListener {
            final /* synthetic */ CheckFilePathResult getMax;

            length(CheckFilePathResult checkFilePathResult) {
                this.getMax = checkFilePathResult;
            }

            public final void onClick(View view) {
                this.getMax.dismiss();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class getMax implements View.OnClickListener {
            final /* synthetic */ CheckFilePathResult setMin;

            getMax(CheckFilePathResult checkFilePathResult) {
                this.setMin = checkFilePathResult;
            }

            public final void onClick(View view) {
                this.setMin.IsOverlapping.invoke();
                this.setMin.dismiss();
            }
        }

        public final void setMin() {
            super.setMin();
            setMin(setMin(getDialog()), 3);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/promoquest/fragment/PromoQuestRewardDialogFragment$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(byte b) {
                this();
            }
        }

        public final /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            HashMap hashMap = this.toFloatRange;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
    }

    @NotNull
    public final Fragment getMax(int i) {
        Fragment fragment = this.getMax.get(i);
        Intrinsics.checkNotNullExpressionValue(fragment, "fragments[position]");
        return fragment;
    }

    public final int getCount() {
        return this.getMax.size();
    }

    @Nullable
    public final CharSequence getPageTitle(int i) {
        return this.setMin.get(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/promoquest/adapter/TabAdapter$Companion;", "", "()V", "FRAGMENT_KEY", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
