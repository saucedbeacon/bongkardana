package o;

import androidx.lifecycle.LiveData;
import id.dana.nearbyme.homeshopping.model.HomeShoppingModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.tracker.TrackerKey;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantDetailViewState;", "", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "source", "", "(Lid/dana/nearbyme/model/ShopModel;Ljava/lang/String;)V", "merchantInfo", "Landroidx/lifecycle/MutableLiveData;", "Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "getMerchantInfo", "()Landroidx/lifecycle/MutableLiveData;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "getOfficePhoneNumber", "toHomeShoppingModel", "Lid/dana/nearbyme/homeshopping/model/HomeShoppingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverMenuExtensionImpl {
    @NotNull
    public String getMax;
    @NotNull
    public final CascadingMenuPopup$HorizPosition<OptionMenuRecyclerAdapter> getMin;
    @NotNull
    public final ShopModel setMax;

    public /* synthetic */ GriverMenuExtensionImpl(ShopModel shopModel) {
        this(shopModel, TrackerKey.SourceType.NEARBY_ME_DETAIL);
    }

    public GriverMenuExtensionImpl(@NotNull ShopModel shopModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, "source");
        this.setMax = shopModel;
        this.getMax = str;
        this.getMin = new CascadingMenuPopup$HorizPosition<>();
    }

    @NotNull
    public final HomeShoppingModel setMin() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.setMax.Grayscale$Algorithm;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.setMax.asInterface;
        if (str7 == null) {
            str = "";
        } else {
            str = str7;
        }
        String str8 = this.setMax.invoke;
        if (str8 == null) {
            str2 = "";
        } else {
            str2 = str8;
        }
        String str9 = this.setMax.hashCode;
        if (str9 == null) {
            str3 = "";
        } else {
            str3 = str9;
        }
        String min = this.setMax.getMin(", ");
        if (min == null) {
            str4 = "";
        } else {
            str4 = min;
        }
        return new HomeShoppingModel(str6, str, str2, str3, str4, setMax(), this.getMax);
    }

    private final String setMax() {
        boolean z;
        try {
            List<String> list = this.setMax.IsOverlapping;
            Intrinsics.checkNotNullExpressionValue(list, "shopModel.officeNumbers");
            for (Object next : list) {
                String str = (String) next;
                Intrinsics.checkNotNullExpressionValue(str, "phoneNumber");
                if (str.length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    Intrinsics.checkNotNullExpressionValue(next, "shopModel.officeNumbers.…sNotEmpty()\n            }");
                    return (String) next;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            Object obj = this.getMin.setMin;
            String str2 = null;
            if (obj == LiveData.setMax) {
                obj = null;
            }
            OptionMenuRecyclerAdapter optionMenuRecyclerAdapter = (OptionMenuRecyclerAdapter) obj;
            if (optionMenuRecyclerAdapter != null) {
                str2 = optionMenuRecyclerAdapter.getMin();
            }
            return str2 == null ? "" : str2;
        }
    }
}
