package o;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.bumptech.glide.Glide;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.merchantmanagement.view.MerchantManagementActivity;
import id.dana.miniprogram.tnc.MissingRequiredUserInfoDialogActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.usereducation.constant.BottomSheetType;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.SystemInfoBridgeExtension;
import o.WheelView;
import o.getInsetDodgeRect;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lid/dana/merchantmanagement/adapter/MerchantManagementAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/merchantmanagement/model/LinkedMerchantModel;", "()V", "listener", "Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;", "getListener", "()Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;", "setListener", "(Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;)V", "addAll", "", "list", "", "addItemBanner", "createShimmer", "getItemViewType", "", "position", "getShimmer", "itemBannerNotReady", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeShimmer", "shouldRenderEmptyState", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DialogBridgeExtension extends IMultiInstanceInvalidationCallback.Stub<Ignore<alert>, alert> {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    public prompt setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"showDialog", "", "Lid/dana/domain/authcode/interactor/GetAuthCode$MissingRequiredUserInfoException;", "serviceName", "", "iconUrl", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.DialogBridgeExtension$6  reason: invalid class name */
    public final class AnonymousClass6 {
        public static final void getMax(@NotNull GetAuthCode.MissingRequiredUserInfoException missingRequiredUserInfoException, @NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(missingRequiredUserInfoException, "$this$showDialog");
            Intrinsics.checkNotNullParameter(str, "serviceName");
            Application applicationContext = GriverEnv.getApplicationContext();
            Intent putExtra = new Intent(applicationContext, MissingRequiredUserInfoDialogActivity.class).addFlags(268435456).putExtra("startParams", new MissingRequiredUserInfoDialogActivity.StartParams(str, str2, missingRequiredUserInfoException.getMissingUserData()));
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, MissingR…TRA_START_PARAMS, params)");
            applicationContext.startActivity(putExtra);
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == 1) {
            prompt prompt = this.setMin;
            if (prompt == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            ignore = new AnonymousClass3(viewGroup, prompt);
        } else if (i == 3) {
            ignore = new Ignore<alert>(viewGroup) {
                {
                    Intrinsics.checkNotNullParameter(r3, "parent");
                }
            };
        } else if (i == 4) {
            ignore = new Ignore<alert>(viewGroup) {
                public ImageView getMax;

                {
                    Intrinsics.checkNotNullParameter(r3, "parent");
                }

                public final /* synthetic */ void setMax(Object obj) {
                    View findViewById = this.itemView.findViewById(R.id.f57142131364291);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.promotion_image)");
                    this.getMax = (ImageView) findViewById;
                }
            };
        } else if (i != 5) {
            ignore = new Ignore<alert>(viewGroup) {
                {
                    Intrinsics.checkNotNullParameter(r3, "parent");
                }

                public final /* synthetic */ void setMax(Object obj) {
                    getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.itemView);
                    setmax.getMax = R.layout.view_merchant_skeleton;
                    setmax.setMax = 1500;
                    setmax.length = true;
                    setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
                    setmax.isInside = 0;
                    new getInsetDodgeRect(setmax, (byte) 0).getMin();
                }
            };
        } else {
            prompt prompt2 = this.setMin;
            if (prompt2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            ignore = new AnonymousClass3(viewGroup, prompt2, true);
        }
        return ignore;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/merchantmanagement/view/viewholder/MerchantItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/merchantmanagement/model/LinkedMerchantModel;", "parent", "Landroid/view/ViewGroup;", "listener", "Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;", "bottomItem", "", "(Landroid/view/ViewGroup;Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;Z)V", "getListener", "()Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;", "bindData", "", "data", "bindImage", "imageUrl", "", "targetView", "Landroid/widget/ImageView;", "getDate", "date", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.DialogBridgeExtension$3  reason: invalid class name */
    public final class AnonymousClass3 extends Ignore<alert> {
        @NotNull
        public static final length setMin = new length((byte) 0);
        private boolean getMin;
        @NotNull
        final prompt setMax;

        public final /* synthetic */ void setMax(Object obj) {
            alert alert = (alert) obj;
            Intrinsics.checkNotNullParameter(alert, "data");
            Context context = this.length;
            Object[] objArr = new Object[1];
            long j = alert.getMin;
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            Locale locale = WheelView.OnWheelViewListener.getMax;
            int i = 0;
            objArr[0] = new SimpleDateFormat("dd MMM yyyy", locale).format(new Date(j));
            String string = context.getString(R.string.linked_since, objArr);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…tDate(merchantBoundDate))");
            View view = this.itemView;
            if (this.getMin) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.isOverflowMenuShowPending);
                if (constraintLayout != null) {
                    constraintLayout.setBackground(IntRange.length(view.getContext(), (int) R.drawable.item_bottom_rounded));
                }
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(resetInternal.setMax.isOverflowMenuShowPending);
                if (constraintLayout2 != null) {
                    constraintLayout2.setBackgroundColor(IntRange.setMax(view.getContext(), 17170443));
                }
            }
            View findViewById = view.findViewById(resetInternal.setMax.setNeutralButton);
            if (findViewById != null) {
                if (this.getMin) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.removeAllTabs);
            if (textView != null) {
                textView.setText(alert.length);
            }
            TextView textView2 = (TextView) view.findViewById(resetInternal.setMax.animateToTab);
            if (textView2 != null) {
                textView2.setText(string);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.onPrepareSupportNavigateUpTaskStack);
            if (appCompatImageView != null) {
                ((updateCornerMarking) Glide.getMax(this.length)).setMax(alert.getMax).length((ImageView) appCompatImageView);
            }
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) view.findViewById(resetInternal.setMax.onTransact);
            if (danaButtonSecondaryView != null) {
                danaButtonSecondaryView.setContentDescription(danaButtonSecondaryView.getContext().getString(R.string.btnRemoveMerchant));
                danaButtonSecondaryView.setOnClickListener(new getMax(alert, string, this));
            }
        }

        public /* synthetic */ AnonymousClass3(ViewGroup viewGroup, prompt prompt) {
            this(viewGroup, prompt, false);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(@NotNull ViewGroup viewGroup, @NotNull prompt prompt, boolean z) {
            super(viewGroup.getContext(), R.layout.item_merchant, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            Intrinsics.checkNotNullParameter(prompt, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.setMax = prompt;
            this.getMin = z;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/merchantmanagement/view/viewholder/MerchantItemViewHolder$bindData$1$1$2$1", "id/dana/merchantmanagement/view/viewholder/MerchantItemViewHolder$$special$$inlined$apply$lambda$1", "id/dana/merchantmanagement/view/viewholder/MerchantItemViewHolder$$special$$inlined$apply$lambda$2"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.DialogBridgeExtension$3$getMax */
        static final class getMax implements View.OnClickListener {
            final /* synthetic */ AnonymousClass3 getMax;
            final /* synthetic */ String getMin;
            final /* synthetic */ alert length;

            getMax(alert alert, String str, AnonymousClass3 r3) {
                this.length = alert;
                this.getMin = str;
                this.getMax = r3;
            }

            public final void onClick(View view) {
                this.getMax.setMax.getMin(this.length, this.getMax.getBindingAdapterPosition());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/merchantmanagement/view/viewholder/MerchantItemViewHolder$Companion;", "", "()V", "DATE_FORMAT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.DialogBridgeExtension$3$length */
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(byte b) {
                this();
            }
        }
    }

    /* renamed from: o.DialogBridgeExtension$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<MerchantManagementActivity> {
        @InjectedFieldSignature("id.dana.merchantmanagement.view.MerchantManagementActivity.presenter")
        public static void length(MerchantManagementActivity merchantManagementActivity, SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getmax) {
            merchantManagementActivity.presenter = getmax;
        }

        @InjectedFieldSignature("id.dana.merchantmanagement.view.MerchantManagementActivity.dynamicUrlWrapper")
        public static void getMin(MerchantManagementActivity merchantManagementActivity, getShortName getshortname) {
            merchantManagementActivity.dynamicUrlWrapper = getshortname;
        }
    }

    public final int getItemViewType(int i) {
        if (((alert) getMax().get(i)).length.length() > 0) {
            if (getMax().size() - 1 == i) {
                return 5;
            }
            return 1;
        } else if (((alert) getMax().get(i)).equals == 3) {
            return 3;
        } else {
            return ((alert) getMax().get(i)).equals == 4 ? 4 : 2;
        }
    }

    public final void getMax(@NotNull List<alert> list) {
        Intrinsics.checkNotNullParameter(list, BottomSheetType.LIST);
        List max = getMax();
        if (max != null) {
            max.addAll(list);
        } else {
            getMin(list);
        }
        notifyDataSetChanged();
    }

    public final boolean setMin() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List max = getMax();
        if (max != null) {
            Iterable iterable = max;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    alert alert = (alert) it.next();
                    if (alert.equals == 3 || alert.equals == 4) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            List max2 = getMax();
            if (max2 != null) {
                Iterable iterable2 = max2;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it2 = iterable2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((alert) it2.next()).equals == 1) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            z2 = false;
                            break;
                        }
                    }
                }
            }
            z2 = true;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean setMax() {
        return ((alert) getMax().get(1)).equals != 4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/merchantmanagement/adapter/MerchantManagementAdapter$Companion;", "", "()V", "BANNER_ITEM_POSITION", "", "BANNER_SECTION", "BOTTOM_LIST_SECTION", "ITEM_SECTION", "LOAD_MORE_SECTION", "TITLE_SECTION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
