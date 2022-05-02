package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.model.ShopOpenHourModel;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.SimpleListAdapter;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, d2 = {"Lid/dana/nearbyrevamp/view/OpenHourDetailDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "openHourDetailAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/OpenHourDetailAdapter;", "getOpenHourDetailAdapter", "()Lid/dana/nearbyrevamp/merchantdetail/adapter/OpenHourDetailAdapter;", "openHourDetailAdapter$delegate", "Lkotlin/Lazy;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "shopModel$delegate", "getBottomSheet", "", "getDimAmount", "", "getFullDayOpenHourList", "", "Lid/dana/nearbyme/model/ShopOpenHourModel;", "getLayout", "", "getSortedOpenHours", "openHours", "", "isFullDialogHeightRequired", "", "onShow", "", "onStart", "setupData", "setupRecyclerView", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AddPhoneContactView extends order {
    @NotNull
    public static final length getMin = new length((byte) 0);
    private final Lazy equals = LazyKt.lazy(new setMax(this));
    private final Lazy getMax = LazyKt.lazy(getMin.INSTANCE);
    private HashMap isInside;

    private View getMax(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final /* bridge */ /* synthetic */ FrameLayout getMax() {
        return null;
    }

    public final int getMin() {
        return R.layout.view_open_hour_detail_bottomsheet;
    }

    public final float length() {
        return 0.5f;
    }

    public final boolean t_() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/nearbyrevamp/merchantdetail/adapter/OpenHourDetailAdapter;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<SimpleListAdapter.OnItemClickListener> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(0);
        }

        @NotNull
        public final SimpleListAdapter.OnItemClickListener invoke() {
            return new SimpleListAdapter.OnItemClickListener();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/nearbyme/model/ShopModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<ShopModel> {
        final /* synthetic */ AddPhoneContactView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(AddPhoneContactView addPhoneContactView) {
            super(0);
            this.this$0 = addPhoneContactView;
        }

        @Nullable
        public final ShopModel invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return (ShopModel) arguments.getParcelable("shopModel");
            }
            return null;
        }
    }

    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        getMax(dialog);
        length(dialog);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements DialogInterface.OnDismissListener {
        final /* synthetic */ AddPhoneContactView setMax;

        setMin(AddPhoneContactView addPhoneContactView) {
            this.setMax = addPhoneContactView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.setMax.dismiss();
        }
    }

    public final void setMin() {
        super.setMin();
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setInitialActivityCount);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = (RecyclerView) getMax(resetInternal.setMax.setInitialActivityCount);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((SimpleListAdapter.OnItemClickListener) this.getMax.getValue());
        }
        if (((ShopModel) this.equals.getValue()) != null) {
            SimpleListAdapter.OnItemClickListener onItemClickListener = (SimpleListAdapter.OnItemClickListener) this.getMax.getValue();
            ShopModel shopModel = (ShopModel) this.equals.getValue();
            Intrinsics.checkNotNull(shopModel);
            Intrinsics.checkNotNullExpressionValue(shopModel, "shopModel!!");
            List<ShopOpenHourModel> list = shopModel.onMessageChannelReady;
            Intrinsics.checkNotNullExpressionValue(list, "shopModel!!.shopOpenHours");
            List arrayList = new ArrayList();
            ShopModel shopModel2 = (ShopModel) this.equals.getValue();
            Intrinsics.checkNotNull(shopModel2);
            Intrinsics.checkNotNullExpressionValue(shopModel2, "shopModel!!");
            if (shopModel2.getMax()) {
                arrayList.addAll(equals());
            } else {
                arrayList.addAll(list);
            }
            ShopModel shopModel3 = (ShopModel) this.equals.getValue();
            Intrinsics.checkNotNull(shopModel3);
            Intrinsics.checkNotNullExpressionValue(shopModel3, "shopModel!!");
            ((ShopOpenHourModel) arrayList.get(ShopModel.values())).getMax = true;
            onItemClickListener.getMin(arrayList);
        }
    }

    private static List<ShopOpenHourModel> equals() {
        List<ShopOpenHourModel> arrayList = new ArrayList<>();
        DateFormatSymbols instance = DateFormatSymbols.getInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(instance, "DateFormatSymbols.getIns…eUtil.getCurrentLocale())");
        String[] weekdays = instance.getWeekdays();
        Intrinsics.checkNotNullExpressionValue(weekdays, "localizedDays");
        for (String str : weekdays) {
            Intrinsics.checkNotNullExpressionValue(str, "it");
            if (str.length() > 0) {
                arrayList.add(new ShopOpenHourModel(str, true, 14));
            }
        }
        if (Intrinsics.areEqual((Object) ((ShopOpenHourModel) CollectionsKt.first(arrayList)).length, (Object) weekdays[1])) {
            arrayList.add((ShopOpenHourModel) CollectionsKt.removeFirst(arrayList));
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/nearbyrevamp/view/OpenHourDetailDialogFragment$Companion;", "", "()V", "SHOP_MODEL", "", "TAG", "newInstance", "Lid/dana/nearbyrevamp/view/OpenHourDetailDialogFragment;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
