package id.dana.nearbyme.model;

import android.content.Context;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.multilanguage.utils.ResultCode;
import id.dana.domain.nearbyme.model.MerchantStatusEnum;
import id.dana.nearbyme.MerchantViewType;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopOpenHourModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import o.NebulaLoadingView;
import o.dispatchOnCancelled;
import o.g;
import o.onCancelLoad;
import o.onCanceled;

public class ShopModel implements Parcelable {
    public static final Parcelable.Creator<ShopModel> CREATOR = new Parcelable.Creator<ShopModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShopModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShopModel(parcel);
        }
    };
    protected static final List<String> length = Arrays.asList(new String[]{"216620000035833566172", "216620000258073885924"});
    public Map<String, String> FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    public String ICustomTabsCallback;
    public boolean ICustomTabsCallback$Default;
    public boolean ICustomTabsCallback$Stub;
    private List<Integer> ICustomTabsCallback$Stub$Proxy;
    public boolean ICustomTabsService;
    public List<String> IsOverlapping;
    public List<PromoInfoModel> Mean$Arithmetic;
    public int asBinder;
    public String asInterface;
    public String b;
    public double create;
    public Map<String, String> equals;
    public boolean extraCallback;
    public List<MerchantSubcategoryModel> extraCallbackWithResult;
    private int extraCommand;
    public String getCause;
    public List<MerchantImageModel> getDefaultImpl;
    public int getInterfaceDescriptor;
    public String getMax;
    public String getMin;
    public String hashCode;
    public String invoke;
    public String invokeSuspend;
    public boolean isInside;
    private boolean mayLaunchUrl;
    public List<ShopOpenHourModel> onMessageChannelReady;
    public double onNavigationEvent;
    public String onPostMessage;
    public MerchantStatusEnum onRelationshipValidationResult;
    public Long onTransact;
    public int setDefaultImpl;
    public String setMax;
    public List<ContactAddressModel> setMin;
    public String toDoubleRange;
    public double toFloatRange;
    public String toIntRange;
    public double toString;
    public List<String> valueOf;
    public double values;

    public int describeContents() {
        return 0;
    }

    public ShopModel() {
        this.ICustomTabsCallback$Stub$Proxy = new ArrayList();
        this.IsOverlapping = new ArrayList();
        this.extraCallback = false;
        this.asBinder = 0;
        this.getDefaultImpl = new ArrayList();
        this.ICustomTabsService = false;
        onNavigationEvent();
        create();
        ICustomTabsCallback();
        onPostMessage();
    }

    public ShopModel(String str, String str2) {
        this.ICustomTabsCallback$Stub$Proxy = new ArrayList();
        this.IsOverlapping = new ArrayList();
        this.extraCallback = false;
        this.asBinder = 0;
        this.getDefaultImpl = new ArrayList();
        this.ICustomTabsService = false;
        this.Grayscale$Algorithm = str;
        this.b = str2;
        onNavigationEvent();
        create();
        ICustomTabsCallback();
        onPostMessage();
    }

    protected ShopModel(Parcel parcel) {
        this.ICustomTabsCallback$Stub$Proxy = new ArrayList();
        this.IsOverlapping = new ArrayList();
        boolean z = false;
        this.extraCallback = false;
        this.asBinder = 0;
        this.getDefaultImpl = new ArrayList();
        this.ICustomTabsService = false;
        this.getMin = parcel.readString();
        this.setMax = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.createTypedArrayList(ContactAddressModel.CREATOR);
        this.toFloatRange = parcel.readDouble();
        this.toIntRange = parcel.readString();
        this.values = parcel.readDouble();
        this.hashCode = parcel.readString();
        this.toString = parcel.readDouble();
        this.invoke = parcel.readString();
        this.valueOf = parcel.createStringArrayList();
        this.extraCallbackWithResult = parcel.createTypedArrayList(MerchantSubcategoryModel.CREATOR);
        this.Grayscale$Algorithm = parcel.readString();
        this.getCause = parcel.readString();
        this.ICustomTabsCallback = parcel.readString();
        this.b = parcel.readString();
        this.onPostMessage = parcel.readString();
        this.extraCommand = parcel.readInt();
        this.toDoubleRange = parcel.readString();
        this.Mean$Arithmetic = parcel.createTypedArrayList(PromoInfoModel.CREATOR);
        this.IsOverlapping = parcel.createStringArrayList();
        this.create = parcel.readDouble();
        this.onNavigationEvent = parcel.readDouble();
        this.isInside = parcel.readByte() != 0 ? true : z;
        this.onMessageChannelReady = parcel.createTypedArrayList(ShopOpenHourModel.CREATOR);
        this.asInterface = parcel.readString();
        this.invokeSuspend = parcel.readString();
        onNavigationEvent();
        create();
        ICustomTabsCallback();
        onPostMessage();
    }

    private void onNavigationEvent() {
        List<Integer> list = this.ICustomTabsCallback$Stub$Proxy;
        String str = this.b;
        list.add(Integer.valueOf(str == null ? 0 : str.hashCode()));
        this.ICustomTabsCallback$Stub$Proxy.add(Integer.valueOf((int) this.toFloatRange));
        this.ICustomTabsCallback$Stub$Proxy.add(Integer.valueOf((int) this.values));
        this.ICustomTabsCallback$Stub$Proxy.add(Integer.valueOf((int) this.toString));
        this.ICustomTabsCallback$Stub$Proxy.add(Integer.valueOf((int) this.create));
    }

    private void create() {
        List<Integer> list = this.ICustomTabsCallback$Stub$Proxy;
        String str = this.getMin;
        int i = 0;
        list.add(Integer.valueOf(str == null ? 0 : str.hashCode()));
        List<Integer> list2 = this.ICustomTabsCallback$Stub$Proxy;
        String str2 = this.setMax;
        list2.add(Integer.valueOf(str2 == null ? 0 : str2.hashCode()));
        this.ICustomTabsCallback$Stub$Proxy.add(Integer.valueOf((int) this.onNavigationEvent));
        List<Integer> list3 = this.ICustomTabsCallback$Stub$Proxy;
        String str3 = this.getMax;
        list3.add(Integer.valueOf(str3 == null ? 0 : str3.hashCode()));
        List<Integer> list4 = this.ICustomTabsCallback$Stub$Proxy;
        String str4 = this.toIntRange;
        list4.add(Integer.valueOf(str4 == null ? 0 : str4.hashCode()));
        List<Integer> list5 = this.ICustomTabsCallback$Stub$Proxy;
        Map<String, String> map = this.equals;
        if (map != null) {
            i = map.hashCode();
        }
        list5.add(Integer.valueOf(i));
    }

    private void ICustomTabsCallback() {
        List<Integer> list = this.ICustomTabsCallback$Stub$Proxy;
        List<ContactAddressModel> list2 = this.setMin;
        int i = 0;
        list.add(Integer.valueOf(list2 == null ? 0 : list2.hashCode()));
        List<Integer> list3 = this.ICustomTabsCallback$Stub$Proxy;
        String str = this.toDoubleRange;
        list3.add(Integer.valueOf(str == null ? 0 : str.hashCode()));
        List<Integer> list4 = this.ICustomTabsCallback$Stub$Proxy;
        String str2 = this.hashCode;
        list4.add(Integer.valueOf(str2 == null ? 0 : str2.hashCode()));
        List<Integer> list5 = this.ICustomTabsCallback$Stub$Proxy;
        String str3 = this.invoke;
        list5.add(Integer.valueOf(str3 == null ? 0 : str3.hashCode()));
        List<Integer> list6 = this.ICustomTabsCallback$Stub$Proxy;
        Map<String, String> map = this.FastBitmap$CoordinateSystem;
        list6.add(Integer.valueOf(map == null ? 0 : map.hashCode()));
        List<Integer> list7 = this.ICustomTabsCallback$Stub$Proxy;
        List<String> list8 = this.valueOf;
        list7.add(Integer.valueOf(list8 == null ? 0 : list8.hashCode()));
        List<Integer> list9 = this.ICustomTabsCallback$Stub$Proxy;
        List<PromoInfoModel> list10 = this.Mean$Arithmetic;
        list9.add(Integer.valueOf(list10 == null ? 0 : list10.hashCode()));
        List<Integer> list11 = this.ICustomTabsCallback$Stub$Proxy;
        List<String> list12 = this.IsOverlapping;
        if (list12 != null) {
            i = list12.hashCode();
        }
        list11.add(Integer.valueOf(i));
    }

    private void onPostMessage() {
        List<Integer> list = this.ICustomTabsCallback$Stub$Proxy;
        String str = this.getCause;
        int i = 0;
        list.add(Integer.valueOf(str == null ? 0 : str.hashCode()));
        List<Integer> list2 = this.ICustomTabsCallback$Stub$Proxy;
        String str2 = this.ICustomTabsCallback;
        list2.add(Integer.valueOf(str2 == null ? 0 : str2.hashCode()));
        List<Integer> list3 = this.ICustomTabsCallback$Stub$Proxy;
        MerchantStatusEnum merchantStatusEnum = this.onRelationshipValidationResult;
        list3.add(Integer.valueOf(merchantStatusEnum == null ? 0 : merchantStatusEnum.hashCode()));
        List<Integer> list4 = this.ICustomTabsCallback$Stub$Proxy;
        String str3 = this.onPostMessage;
        list4.add(Integer.valueOf(str3 == null ? 0 : str3.hashCode()));
        List<Integer> list5 = this.ICustomTabsCallback$Stub$Proxy;
        List<MerchantSubcategoryModel> list6 = this.extraCallbackWithResult;
        if (list6 != null) {
            i = list6.hashCode();
        }
        list5.add(Integer.valueOf(i));
        this.ICustomTabsCallback$Stub$Proxy.add(Integer.valueOf(this.extraCommand));
    }

    public final boolean getMax() {
        return this.isInside;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
        parcel.writeTypedList(this.setMin);
        parcel.writeDouble(this.toFloatRange);
        parcel.writeString(this.toIntRange);
        parcel.writeDouble(this.values);
        parcel.writeString(this.hashCode);
        parcel.writeDouble(this.toString);
        parcel.writeString(this.invoke);
        parcel.writeStringList(this.valueOf);
        parcel.writeTypedList(this.extraCallbackWithResult);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.getCause);
        parcel.writeString(this.ICustomTabsCallback);
        parcel.writeString(this.b);
        parcel.writeString(this.onPostMessage);
        parcel.writeInt(this.extraCommand);
        parcel.writeString(this.toDoubleRange);
        parcel.writeTypedList(this.Mean$Arithmetic);
        parcel.writeStringList(this.IsOverlapping);
        parcel.writeDouble(this.create);
        parcel.writeDouble(this.onNavigationEvent);
        parcel.writeByte(this.isInside ? (byte) 1 : 0);
        parcel.writeTypedList(this.onMessageChannelReady);
        parcel.writeString(this.asInterface);
        parcel.writeString(this.invokeSuspend);
    }

    public final boolean setMin() {
        return this.extraCallback && !toDoubleRange() && !onRelationshipValidationResult();
    }

    public final ContactAddressModel setMax() {
        for (ContactAddressModel next : this.setMin) {
            if (next.setMax != null && next.setMax.equals("OFFICE_ADD")) {
                return next;
            }
        }
        return new ContactAddressModel();
    }

    public final String getMin(boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (MerchantSubcategoryModel next : this.extraCallbackWithResult) {
            if (next.getMin != null && !getMin(next)) {
                if (z) {
                    return next.getMin;
                }
                if (next.getMin != null) {
                    if (sb.length() > 0) {
                        sb.append(str);
                    }
                    sb.append(next.getMin);
                }
            }
        }
        return sb.toString();
    }

    public final boolean setMax(List<g.AnonymousClass1> list) {
        List<MerchantSubcategoryModel> list2 = this.extraCallbackWithResult;
        if (list2 != null && !list2.isEmpty()) {
            for (g.AnonymousClass1 length2 : list) {
                if (length(length2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean length(g.AnonymousClass1 r5) {
        List<MerchantSubcategoryModel> list = this.extraCallbackWithResult;
        if (list != null && !list.isEmpty()) {
            for (MerchantSubcategoryModel merchantSubcategoryModel : this.extraCallbackWithResult) {
                if (merchantSubcategoryModel.setMin.contains(r5.getMax)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void toFloatRange() {
        if (this.invokeSuspend != null && FastBitmap$CoordinateSystem()) {
            MerchantSubcategoryModel merchantSubcategoryModel = new MerchantSubcategoryModel();
            if (merchantSubcategoryModel.setMin != null && !merchantSubcategoryModel.setMin.contains(MerchantViewType.MERCHANT_CAT_DANA_BISNIS)) {
                merchantSubcategoryModel.setMin.add(MerchantViewType.MERCHANT_CAT_DANA_BISNIS);
            }
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new ArrayList();
            }
            this.extraCallbackWithResult.add(merchantSubcategoryModel);
        }
    }

    public final boolean isInside() {
        if (!equals() || !this.Mean$Arithmetic.get(0).getMin()) {
            return false;
        }
        return true;
    }

    public final void length(List<PromoInfoModel> list) {
        this.mayLaunchUrl = true;
        this.Mean$Arithmetic = list;
        if (list != null && !list.isEmpty()) {
            MerchantSubcategoryModel merchantSubcategoryModel = new MerchantSubcategoryModel();
            if (merchantSubcategoryModel.setMin != null && !merchantSubcategoryModel.setMin.contains(MerchantViewType.MERCHANT_CAT_PROMO)) {
                merchantSubcategoryModel.setMin.add(MerchantViewType.MERCHANT_CAT_PROMO);
            }
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new ArrayList();
            }
            this.extraCallbackWithResult.add(merchantSubcategoryModel);
        }
    }

    private static String setMax(String str) {
        if (str.endsWith("%")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("%");
        return sb.toString();
    }

    public final boolean toIntRange() {
        List<String> list = this.valueOf;
        return list != null && list.contains("9998");
    }

    public final boolean toDoubleRange() {
        return "216620000020928274717".equals(this.Grayscale$Algorithm);
    }

    private boolean onRelationshipValidationResult() {
        return "216620000013750392977".equals(this.Grayscale$Algorithm) || length.contains(this.Grayscale$Algorithm);
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return "UMI".equals(this.invokeSuspend) || "UME".equals(this.invokeSuspend) || "UKE".equals(this.invokeSuspend);
    }

    public final void getMax(List<ShopOpenHourModel> list) {
        this.onMessageChannelReady = list;
        if (onMessageChannelReady() || getMax()) {
            MerchantSubcategoryModel merchantSubcategoryModel = new MerchantSubcategoryModel();
            if (merchantSubcategoryModel.setMin != null && !merchantSubcategoryModel.setMin.contains(MerchantViewType.MERCHANT_CAT_OPEN_NOW)) {
                merchantSubcategoryModel.setMin.add(MerchantViewType.MERCHANT_CAT_OPEN_NOW);
            }
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new ArrayList();
            }
            this.extraCallbackWithResult.add(merchantSubcategoryModel);
        }
    }

    private boolean onMessageChannelReady() {
        List<ShopOpenHourModel> list = this.onMessageChannelReady;
        return list != null && !list.isEmpty() && this.onMessageChannelReady.size() > (Calendar.getInstance().get(7) + 5) % 7 && this.onMessageChannelReady.get((Calendar.getInstance().get(7) + 5) % 7).length() == ShopOpenHourModel.OpenHourType.OPEN;
    }

    public static int values() {
        return (Calendar.getInstance().get(7) + 5) % 7;
    }

    public int hashCode() {
        int i = 7;
        for (Integer intValue : this.ICustomTabsCallback$Stub$Proxy) {
            i *= intValue.intValue() + 31;
        }
        return i;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ShopModel)) {
            return false;
        }
        ShopModel shopModel = (ShopModel) obj;
        if (shopModel.asBinder == 0 && shopModel.Grayscale$Algorithm.equals(this.Grayscale$Algorithm) && shopModel.b.equals(this.b)) {
            return true;
        }
        return false;
    }

    public final void length(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(868579861, oncanceled);
            onCancelLoad.getMin(868579861, oncanceled);
        }
        this.asInterface = str;
    }

    public final boolean Mean$Arithmetic() {
        return this.ICustomTabsCallback$Default;
    }

    public final String invoke() {
        List<String> list = this.IsOverlapping;
        return (list == null || list.isEmpty()) ? "" : this.IsOverlapping.get(0);
    }

    public final Location invokeSuspend() {
        double d = this.values;
        double d2 = this.toString;
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    public final boolean valueOf() {
        return this.mayLaunchUrl;
    }

    public final String Grayscale$Algorithm() {
        if (TextUtils.isEmpty(this.invoke) || this.invoke.length() <= 15) {
            return this.invoke;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.invoke.substring(0, 15));
        sb.append("...");
        return sb.toString();
    }

    public final boolean b() {
        return this.ICustomTabsCallback$Stub;
    }

    public final boolean getCause() {
        return this.ICustomTabsService;
    }

    public final boolean setMin(String str) {
        return !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(str) && this.b.equals(str);
    }

    public final boolean getMin() {
        try {
            return this.valueOf.contains(ResultCode.Fail.UNKNOWN_ERROR);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final String length() {
        List<MerchantSubcategoryModel> list = this.extraCallbackWithResult;
        return (list == null || list.isEmpty()) ? "" : getMin(true, " ");
    }

    private static boolean getMin(MerchantSubcategoryModel merchantSubcategoryModel) {
        return merchantSubcategoryModel.setMin.contains(MerchantViewType.MERCHANT_CAT_PROMO);
    }

    public final String getMin(String str) {
        List<MerchantSubcategoryModel> list = this.extraCallbackWithResult;
        return (list == null || list.isEmpty()) ? "" : getMin(false, str);
    }

    public final boolean equals() {
        List<PromoInfoModel> list = this.Mean$Arithmetic;
        return list != null && !list.isEmpty();
    }

    public final String IsOverlapping() {
        String str;
        String str2 = "";
        if (this.Mean$Arithmetic.get(0).setMax == null || this.Mean$Arithmetic.get(0).setMax.equalsIgnoreCase("PERCENTAGE")) {
            if (equals()) {
                str2 = this.Mean$Arithmetic.get(0).getMin;
            }
            str = setMax(str2);
        } else {
            if (equals()) {
                str2 = this.Mean$Arithmetic.get(0).getMin;
            }
            str = NebulaLoadingView.AnonymousClass1.getMin(str2);
        }
        return isInside() ? "Max ".concat(String.valueOf(str)) : str;
    }

    public final String getMin(Context context) {
        List<ShopOpenHourModel> list = this.onMessageChannelReady;
        return (list == null || list.isEmpty()) ? "" : this.onMessageChannelReady.get((Calendar.getInstance().get(7) + 5) % 7).length(context);
    }
}
