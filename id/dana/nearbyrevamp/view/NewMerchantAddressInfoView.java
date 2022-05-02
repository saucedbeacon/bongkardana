package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u0007H\u0016J)\u0010\u000e\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000f0\u0011J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyrevamp/view/NewMerchantAddressInfoView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getLayout", "setOtherLocationsListener", "", "onOtherStoreClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setup", "showAddress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewMerchantAddressInfoView extends BaseRichView {
    /* access modifiers changed from: private */
    public ShopModel getMax;
    private HashMap length;

    @JvmOverloads
    public NewMerchantAddressInfoView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NewMerchantAddressInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_new_merchant_address_info;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewMerchantAddressInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMerchantAddressInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NewMerchantAddressInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void showAddress(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.getMax = shopModel;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setDividerPadding);
        int i = 8;
        if (textView != null) {
            ContactAddressModel max = shopModel.setMax();
            Intrinsics.checkNotNullExpressionValue(max, "officeAddress");
            CharSequence charSequence = max.setMin;
            if (!(charSequence == null || charSequence.length() == 0)) {
                textView.setVisibility(0);
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getInputType);
        if (textView2 != null) {
            View view = textView2;
            boolean min = shopModel.setMin();
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (min) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ Function1 length;
        final /* synthetic */ NewMerchantAddressInfoView setMin;

        getMin(NewMerchantAddressInfoView newMerchantAddressInfoView, Function1 function1) {
            this.setMin = newMerchantAddressInfoView;
            this.length = function1;
        }

        public final void onClick(View view) {
            ShopModel access$getShopModel$p = this.setMin.getMax;
            if (access$getShopModel$p != null) {
                this.length.invoke(access$getShopModel$p);
            }
        }
    }

    public final void setOtherLocationsListener(@NotNull Function1<? super ShopModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onOtherStoreClickListener");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getInputType);
        if (textView != null) {
            textView.setOnClickListener(new getMin(this, function1));
        }
    }
}
