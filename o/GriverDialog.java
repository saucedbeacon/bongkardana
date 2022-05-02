package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.GriverBaseFragment;
import o.OptionMenuRecyclerAdapter;
import o.b;
import o.negativeListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mapper/MerchantDanaDealsMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "()V", "map", "oldItem", "transformMoneyViewToMoneyViewModel", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "moneyView", "Lid/dana/domain/nearbyme/model/MoneyView;", "transformVoucherInfoToMerchantVoucherInfoModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "voucherInfo", "Lid/dana/domain/nearbyme/model/VoucherInfo;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverDialog extends setSpeed<List<? extends mediaMounted>, List<? extends OptionMenuRecyclerAdapter.OptionMenuViewHolder>> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014RA\u0010\u0006\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerViewHolder;", "T", "", "Lid/dana/base/BaseRecyclerViewHolder;", "parent", "Landroid/view/ViewGroup;", "bindDataFunction", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Landroid/view/View;", "view", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "getBindDataFunction", "()Lkotlin/jvm/functions/Function2;", "getParent", "()Landroid/view/ViewGroup;", "bindData", "(Ljava/lang/Object;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Builder<T> extends Ignore<T> {
        @NotNull
        private final ViewGroup getMin;
        @NotNull
        private final Function2<T, View, Unit> setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ViewGroup viewGroup, @NotNull Function2<? super T, ? super View, Unit> function2) {
            super(viewGroup.getContext(), R.layout.view_media_viewer, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            Intrinsics.checkNotNullParameter(function2, "bindDataFunction");
            this.getMin = viewGroup;
            this.setMin = function2;
        }

        public final void setMax(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "data");
            Function2<T, View, Unit> function2 = this.setMin;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            function2.invoke(t, view);
        }
    }

    public final class DialogParam implements getAdapterPosition<GriverBaseFragment.Main> {
        private final b.C0007b<negativeString> getMin;
        private final b.C0007b<negativeListener.length> length;
        private final b.C0007b<isRAndAbove> setMax;

        private DialogParam(b.C0007b<negativeString> bVar, b.C0007b<negativeListener.length> bVar2, b.C0007b<isRAndAbove> bVar3) {
            this.getMin = bVar;
            this.length = bVar2;
            this.setMax = bVar3;
        }

        public static DialogParam setMax(b.C0007b<negativeString> bVar, b.C0007b<negativeListener.length> bVar2, b.C0007b<isRAndAbove> bVar3) {
            return new DialogParam(bVar, bVar2, bVar3);
        }

        public final /* synthetic */ Object get() {
            return new GriverBaseFragment.Main(this.getMin.get(), this.length.get(), this.setMax.get());
        }
    }

    public final /* synthetic */ Object map(Object obj) {
        List<mediaMounted> list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "oldItem");
        ArrayList arrayList = new ArrayList();
        for (mediaMounted mediamounted : list) {
            String goodsId = mediamounted.getGoodsId();
            String provider = mediamounted.getProvider();
            String type = mediamounted.getType();
            String description = mediamounted.getDescription();
            String goodsTitle = mediamounted.getGoodsTitle();
            getAppDir price = mediamounted.getPrice();
            MoneyViewModel moneyViewModel = new MoneyViewModel(price.getAmount(), price.getCurrency(), price.getCurrencyCode());
            getAppDir denom = mediamounted.getDenom();
            MoneyViewModel moneyViewModel2 = new MoneyViewModel(denom.getAmount(), denom.getCurrency(), denom.getCurrencyCode());
            boolean available = mediamounted.getAvailable();
            String productCode = mediamounted.getProductCode();
            Map<String, String> extendInfo = mediamounted.getExtendInfo();
            fileName voucherInfo = mediamounted.getVoucherInfo();
            String voucherName = voucherInfo.getVoucherName();
            String voucherIcon = voucherInfo.getVoucherIcon();
            String voucherBackground = voucherInfo.getVoucherBackground();
            String voucherShortDescription = voucherInfo.getVoucherShortDescription();
            MoneyViewModel.length length = MoneyViewModel.length;
            MoneyViewModel length2 = MoneyViewModel.length.length(voucherInfo.getVoucherValue());
            MoneyViewModel.length length3 = MoneyViewModel.length;
            MoneyViewModel length4 = MoneyViewModel.length.length(voucherInfo.getVoucherPrice());
            MoneyViewModel.length length5 = MoneyViewModel.length;
            MoneyViewModel length6 = MoneyViewModel.length.length(voucherInfo.getDisplayVoucherValue());
            MoneyViewModel.length length7 = MoneyViewModel.length;
            SettingMenu settingMenu = new SettingMenu(voucherName, voucherIcon, voucherBackground, voucherShortDescription, length2, length4, length6, MoneyViewModel.length.length(voucherInfo.getDisplayVoucherPrice()), voucherInfo.getTnc(), voucherInfo.getHowTo(), voucherInfo.getDiscountOffRate(), false);
            double savingRate = mediamounted.getSavingRate();
            OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder = r3;
            OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder2 = new OptionMenuRecyclerAdapter.OptionMenuViewHolder(goodsId, provider, type, description, goodsTitle, moneyViewModel, moneyViewModel2, available, productCode, extendInfo, settingMenu, savingRate);
            arrayList.add(optionMenuViewHolder);
        }
        return arrayList;
    }
}
