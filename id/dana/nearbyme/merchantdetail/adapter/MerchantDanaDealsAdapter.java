package id.dana.nearbyme.merchantdetail.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.nearbyme.merchantdetail.viewholder.MerchantDanaDealsShimmerViewHolder;
import id.dana.nearbyme.merchantdetail.viewholder.MerchantDanaDealsViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.OptionMenuRecyclerAdapter;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyme/merchantdetail/adapter/MerchantDanaDealsAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onBuyButtonClickListener", "Lkotlin/Function1;", "", "getOnBuyButtonClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnBuyButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MerchantDanaDealType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDanaDealsAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder>, OptionMenuRecyclerAdapter.OptionMenuViewHolder> {
    @NotNull
    public Function1<? super OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> getMin = setMax.INSTANCE;
    private Context setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final void invoke(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder) {
            Intrinsics.checkNotNullParameter(optionMenuViewHolder, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OptionMenuRecyclerAdapter.OptionMenuViewHolder) obj);
            return Unit.INSTANCE;
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == MerchantDanaDealType.SHIMMER.getValue()) {
            ignore = new MerchantDanaDealsShimmerViewHolder(viewGroup);
        } else if (i == MerchantDanaDealType.NON_SHIMMER.getValue()) {
            ignore = new MerchantDanaDealsViewHolder(viewGroup, this.getMin);
        } else {
            ignore = new MerchantDanaDealsViewHolder(viewGroup, this.getMin);
        }
        return ignore;
    }

    public MerchantDanaDealsAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = context;
    }

    public final int getItemViewType(int i) {
        if (((OptionMenuRecyclerAdapter.OptionMenuViewHolder) getMax().get(i)).isInside.setMin()) {
            return MerchantDanaDealType.SHIMMER.getValue();
        }
        return MerchantDanaDealType.NON_SHIMMER.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/merchantdetail/adapter/MerchantDanaDealsAdapter$MerchantDanaDealType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SHIMMER", "NON_SHIMMER", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    enum MerchantDanaDealType {
        SHIMMER(0),
        NON_SHIMMER(1);
        
        private final int value;

        private MerchantDanaDealType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
