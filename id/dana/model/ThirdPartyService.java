package id.dana.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 \u00012\u00020\u0001:\b\u0001\u0001\u0001\u0001B½\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0002\u0010\"J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010f\u001a\u00020\tHÆ\u0003J\t\u0010g\u001a\u00020\u0014HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010v\u001a\u00020\tHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÁ\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\t2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0001J\t\u0010{\u001a\u00020\u0014HÖ\u0001J\u0013\u0010|\u001a\u00020\t2\b\u0010}\u001a\u0004\u0018\u00010~H\u0002J\b\u0010\u001a\u00020\u0014H\u0016J\n\u0010\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u00101\"\u0004\b2\u00103R\u001a\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u00101\"\u0004\b4\u00103R\u001a\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u00101\"\u0004\b5\u00103R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001a\u0010 \u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00101\"\u0004\bG\u00103R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010$\"\u0004\bO\u0010&R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010;\"\u0004\bU\u0010=R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010$\"\u0004\b_\u0010&¨\u0006\u0001"}, d2 = {"Lid/dana/model/ThirdPartyService;", "Landroid/os/Parcelable;", "key", "", "keyCategory", "action", "clientId", "appId", "isEnable", "", "icon", "link", "name", "nameInd", "nameTag", "operationType", "redirectUrl", "scopes", "isShowRedDot", "type", "", "userAction", "description", "buttonTitle", "keywords", "", "ribbonText", "spmId", "Lid/dana/model/ThirdPartyService$SpmId;", "isFeatured", "skuAttributeModel", "Lid/dana/model/SkuAttributeModel;", "needConsult", "spaceCodes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lid/dana/model/ThirdPartyService$SpmId;ZLid/dana/model/SkuAttributeModel;ZLjava/util/List;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getButtonTitle", "setButtonTitle", "getClientId", "setClientId", "getDescription", "setDescription", "getIcon", "setIcon", "()Z", "setEnable", "(Z)V", "setFeatured", "setShowRedDot", "getKey", "setKey", "getKeyCategory", "setKeyCategory", "getKeywords", "()Ljava/util/List;", "setKeywords", "(Ljava/util/List;)V", "getLink", "setLink", "getName", "setName", "getNameInd", "setNameInd", "getNameTag", "setNameTag", "getNeedConsult", "setNeedConsult", "getOperationType", "setOperationType", "getRedirectUrl", "setRedirectUrl", "getRibbonText", "setRibbonText", "getScopes", "setScopes", "getSkuAttributeModel", "()Lid/dana/model/SkuAttributeModel;", "setSkuAttributeModel", "(Lid/dana/model/SkuAttributeModel;)V", "getSpaceCodes", "setSpaceCodes", "getSpmId", "()Lid/dana/model/ThirdPartyService$SpmId;", "setSpmId", "(Lid/dana/model/ThirdPartyService$SpmId;)V", "getType", "()I", "setType", "(I)V", "getUserAction", "setUserAction", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "SpmId", "Variant", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class ThirdPartyService implements Parcelable {
    public static final Parcelable.Creator<ThirdPartyService> CREATOR = new getMax();
    @NotNull
    public static final setMax invoke = new setMax((byte) 0);
    @Nullable
    public String FastBitmap$CoordinateSystem;
    @Nullable
    public List<String> Grayscale$Algorithm;
    @Nullable
    private SpmId ICustomTabsCallback;
    @Nullable
    public String IsOverlapping;
    @Nullable
    public String Mean$Arithmetic;
    private boolean b;
    private boolean create;
    @Nullable
    public String equals;
    @Nullable
    private String getCause;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    @Nullable
    public String hashCode;
    @Nullable
    public List<String> invokeSuspend;
    @Nullable
    public String isInside;
    @Nullable
    public String length;
    private boolean onMessageChannelReady;
    @Nullable
    private String onNavigationEvent;
    @Nullable
    private SkuAttributeModel onPostMessage;
    @NotNull
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toDoubleRange;
    @Nullable
    public String toFloatRange;
    @Nullable
    public String toIntRange;
    @Nullable
    public String toString;
    public boolean valueOf;
    public int values;

    public ThirdPartyService() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (String) null, (List) null, (String) null, (SpmId) null, false, (SkuAttributeModel) null, false, (List) null, 67108863);
    }

    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyService(key=");
        sb.append(this.setMax);
        sb.append(", keyCategory=");
        sb.append(this.getMin);
        sb.append(", action=");
        sb.append(this.length);
        sb.append(", clientId=");
        sb.append(this.getMax);
        sb.append(", appId=");
        sb.append(this.setMin);
        sb.append(", isEnable=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.toFloatRange);
        sb.append(", link=");
        sb.append(this.IsOverlapping);
        sb.append(", name=");
        sb.append(this.isInside);
        sb.append(", nameInd=");
        sb.append(this.equals);
        sb.append(", nameTag=");
        sb.append(this.onNavigationEvent);
        sb.append(", operationType=");
        sb.append(this.getCause);
        sb.append(", redirectUrl=");
        sb.append(this.toIntRange);
        sb.append(", scopes=");
        sb.append(this.toString);
        sb.append(", isShowRedDot=");
        sb.append(this.create);
        sb.append(", type=");
        sb.append(this.values);
        sb.append(", userAction=");
        sb.append(this.hashCode);
        sb.append(", description=");
        sb.append(this.toDoubleRange);
        sb.append(", buttonTitle=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", keywords=");
        sb.append(this.invokeSuspend);
        sb.append(", ribbonText=");
        sb.append(this.Mean$Arithmetic);
        sb.append(", spmId=");
        sb.append(this.ICustomTabsCallback);
        sb.append(", isFeatured=");
        sb.append(this.valueOf);
        sb.append(", skuAttributeModel=");
        sb.append(this.onPostMessage);
        sb.append(", needConsult=");
        sb.append(this.onMessageChannelReady);
        sb.append(", spaceCodes=");
        sb.append(this.Grayscale$Algorithm);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
        parcel.writeString(this.equals);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.getCause);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.toString);
        parcel.writeInt(this.create ? 1 : 0);
        parcel.writeInt(this.values);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeStringList(this.invokeSuspend);
        parcel.writeString(this.Mean$Arithmetic);
        SpmId spmId = this.ICustomTabsCallback;
        if (spmId != null) {
            parcel.writeInt(1);
            spmId.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.valueOf ? 1 : 0);
        SkuAttributeModel skuAttributeModel = this.onPostMessage;
        if (skuAttributeModel != null) {
            parcel.writeInt(1);
            skuAttributeModel.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.onMessageChannelReady ? 1 : 0);
        parcel.writeStringList(this.Grayscale$Algorithm);
    }

    public ThirdPartyService(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, boolean z2, int i, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable List<String> list, @Nullable String str17, @Nullable SpmId spmId, boolean z3, @Nullable SkuAttributeModel skuAttributeModel, boolean z4, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.setMax = str;
        this.getMin = str2;
        this.length = str3;
        this.getMax = str4;
        this.setMin = str5;
        this.b = z;
        this.toFloatRange = str6;
        this.IsOverlapping = str7;
        this.isInside = str8;
        this.equals = str9;
        this.onNavigationEvent = str10;
        this.getCause = str11;
        this.toIntRange = str12;
        this.toString = str13;
        this.create = z2;
        this.values = i;
        this.hashCode = str14;
        this.toDoubleRange = str15;
        this.FastBitmap$CoordinateSystem = str16;
        this.invokeSuspend = list;
        this.Mean$Arithmetic = str17;
        this.ICustomTabsCallback = spmId;
        this.valueOf = z3;
        this.onPostMessage = skuAttributeModel;
        this.onMessageChannelReady = z4;
        this.Grayscale$Algorithm = list2;
    }

    public final boolean getMax() {
        return this.b;
    }

    public final boolean setMin() {
        return this.create;
    }

    public final boolean length() {
        return this.valueOf;
    }

    public final boolean getMin() {
        return this.onMessageChannelReady;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ThirdPartyService(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, int r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.util.List r48, java.lang.String r49, id.dana.model.ThirdPartyService.SpmId r50, boolean r51, id.dana.model.SkuAttributeModel r52, boolean r53, java.util.List r54, int r55) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r3 = r1
            goto L_0x000c
        L_0x000a:
            r3 = r30
        L_0x000c:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r5 = r2
            goto L_0x0015
        L_0x0013:
            r5 = r31
        L_0x0015:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001b
            r6 = r2
            goto L_0x001d
        L_0x001b:
            r6 = r32
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r7 = r2
            goto L_0x0025
        L_0x0023:
            r7 = r33
        L_0x0025:
            r1 = r0 & 32
            r4 = 0
            if (r1 == 0) goto L_0x002c
            r8 = 0
            goto L_0x002e
        L_0x002c:
            r8 = r34
        L_0x002e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0034
            r9 = r2
            goto L_0x0036
        L_0x0034:
            r9 = r35
        L_0x0036:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003c
            r10 = r2
            goto L_0x003e
        L_0x003c:
            r10 = r36
        L_0x003e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0044
            r11 = r2
            goto L_0x0046
        L_0x0044:
            r11 = r37
        L_0x0046:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            r12 = r2
            goto L_0x004e
        L_0x004c:
            r12 = r38
        L_0x004e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0054
            r13 = r2
            goto L_0x0056
        L_0x0054:
            r13 = r39
        L_0x0056:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005c
            r14 = r2
            goto L_0x005e
        L_0x005c:
            r14 = r40
        L_0x005e:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0064
            r15 = r2
            goto L_0x0066
        L_0x0064:
            r15 = r41
        L_0x0066:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006d
            r16 = r2
            goto L_0x006f
        L_0x006d:
            r16 = r42
        L_0x006f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0076
            r17 = 0
            goto L_0x0078
        L_0x0076:
            r17 = r43
        L_0x0078:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0081
            r18 = 0
            goto L_0x0083
        L_0x0081:
            r18 = r44
        L_0x0083:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008b
            r19 = r2
            goto L_0x008d
        L_0x008b:
            r19 = r45
        L_0x008d:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0095
            r20 = r2
            goto L_0x0097
        L_0x0095:
            r20 = r46
        L_0x0097:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009f
            r21 = r2
            goto L_0x00a1
        L_0x009f:
            r21 = r47
        L_0x00a1:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a9
            r22 = r2
            goto L_0x00ab
        L_0x00a9:
            r22 = r48
        L_0x00ab:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b3
            r23 = r2
            goto L_0x00b5
        L_0x00b3:
            r23 = r49
        L_0x00b5:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bd
            r24 = r2
            goto L_0x00bf
        L_0x00bd:
            r24 = r50
        L_0x00bf:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c7
            r25 = 0
            goto L_0x00c9
        L_0x00c7:
            r25 = r51
        L_0x00c9:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d1
            r26 = r2
            goto L_0x00d3
        L_0x00d1:
            r26 = r52
        L_0x00d3:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00db
            r27 = 0
            goto L_0x00dd
        L_0x00db:
            r27 = r53
        L_0x00dd:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00e5
            r28 = r2
            goto L_0x00e7
        L_0x00e5:
            r28 = r54
        L_0x00e7:
            r4 = 0
            r2 = r29
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (boolean) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (boolean) r17, (int) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.util.List<java.lang.String>) r22, (java.lang.String) r23, (id.dana.model.ThirdPartyService.SpmId) r24, (boolean) r25, (id.dana.model.SkuAttributeModel) r26, (boolean) r27, (java.util.List<java.lang.String>) r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.model.ThirdPartyService.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, id.dana.model.ThirdPartyService$SpmId, boolean, id.dana.model.SkuAttributeModel, boolean, java.util.List, int):void");
    }

    public final int hashCode() {
        return this.setMax.hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof ThirdPartyService) && Intrinsics.areEqual((Object) this.setMax, (Object) ((ThirdPartyService) obj).setMax);
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/model/ThirdPartyService$Variant;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Variant {
        @NotNull
        public static final setMax Companion = setMax.length;
        public static final int EDIT = 5;
        public static final int EMPTY = 6;
        public static final int FEATURE = 2;
        public static final int HEADER = 3;
        public static final int ITEM = 0;
        public static final int MORE = 1;
        public static final int SPACE = 4;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/model/ThirdPartyService$Variant$Companion;", "", "()V", "EDIT", "", "EMPTY", "FEATURE", "HEADER", "ITEM", "MORE", "SPACE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            static final /* synthetic */ setMax length = new setMax();

            private setMax() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\"\u001a\u00020#J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/model/ThirdPartyService$Builder;", "", "()V", "action", "", "appId", "buttonTitle", "clientId", "description", "enable", "", "featured", "hasRedDot", "icon", "key", "keywords", "", "link", "name", "nameInd", "nameTag", "needConsult", "operationType", "redirectUrl", "ribbonText", "scopes", "skuAttributeModel", "Lid/dana/model/SkuAttributeModel;", "spaceCodes", "spmId", "Lid/dana/model/ThirdPartyService$SpmId;", "type", "", "userAction", "build", "Lid/dana/model/ThirdPartyService;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        public String FastBitmap$CoordinateSystem;
        public SpmId Grayscale$Algorithm;
        public boolean ICustomTabsCallback;
        public String IsOverlapping;
        public String Mean$Arithmetic;
        public boolean b;
        public List<String> create;
        public String equals;
        private String getCause;
        public String getMax;
        public String getMin;
        public String hashCode;
        public boolean invoke;
        public String invokeSuspend;
        public String isInside = "";
        public boolean length;
        public SkuAttributeModel onNavigationEvent;
        public String setMax;
        public String setMin;
        public String toDoubleRange;
        public String toFloatRange;
        public String toIntRange;
        public String toString;
        public List<String> valueOf;
        public int values;

        @NotNull
        public final getMin length(@Nullable String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(-570148093, oncanceled);
                onCancelLoad.getMin(-570148093, oncanceled);
            }
            this.getCause = str;
            return this;
        }

        @NotNull
        public final ThirdPartyService setMin() {
            String str = this.isInside;
            String str2 = this.getMax;
            String str3 = this.setMin;
            String str4 = this.setMax;
            boolean z = this.length;
            String str5 = this.getMin;
            String str6 = this.IsOverlapping;
            String str7 = this.toIntRange;
            String str8 = this.equals;
            String str9 = this.toFloatRange;
            String str10 = this.toDoubleRange;
            String str11 = this.toString;
            String str12 = this.FastBitmap$CoordinateSystem;
            int i = this.values;
            String str13 = this.hashCode;
            String str14 = this.Mean$Arithmetic;
            String str15 = this.getCause;
            List<String> list = this.valueOf;
            String str16 = this.invokeSuspend;
            return new ThirdPartyService(str, str2, str3, str4, z, str5, str6, str7, str8, str9, str10, str11, str12, this.invoke, i, str13, str14, str15, (List) list, str16, this.Grayscale$Algorithm, this.b, this.onNavigationEvent, this.ICustomTabsCallback, (List) this.create, 2);
        }
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lid/dana/model/ThirdPartyService$SpmId;", "Landroid/os/Parcelable;", "home", "", "all", "(Ljava/lang/String;Ljava/lang/String;)V", "getAll", "()Ljava/lang/String;", "setAll", "(Ljava/lang/String;)V", "getHome", "setHome", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class SpmId implements Parcelable {
        public static final Parcelable.Creator<SpmId> CREATOR = new setMin();
        @Nullable
        public String getMin;
        @Nullable
        public String setMax;

        public SpmId() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.setMax);
            parcel.writeString(this.getMin);
        }

        public /* synthetic */ SpmId(byte b) {
            this((String) null, (String) null);
        }

        public SpmId(@Nullable String str, @Nullable String str2) {
            this.setMax = str;
            this.getMin = str2;
        }

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public static class setMin implements Parcelable.Creator<SpmId> {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SpmId[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                return new SpmId(parcel.readString(), parcel.readString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/model/ThirdPartyService$Companion;", "", "()V", "AKULAKU", "", "SERVICE_DANA_FOOD", "SERVICE_DANA_KAGET", "SERVICE_MY_BILLS", "SERVICE_SAVINGS_GOAL", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<ThirdPartyService> {
        public final /* synthetic */ Object[] newArray(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(222910262, oncanceled);
                onCancelLoad.getMin(222910262, oncanceled);
            }
            return new ThirdPartyService[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            List createStringArrayList = parcel.createStringArrayList();
            String readString17 = parcel.readString();
            SkuAttributeModel skuAttributeModel = null;
            SpmId createFromParcel = parcel.readInt() != 0 ? SpmId.CREATOR.createFromParcel(parcel2) : null;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                skuAttributeModel = SkuAttributeModel.CREATOR.createFromParcel(parcel2);
            }
            return new ThirdPartyService(readString, readString2, readString3, readString4, readString5, z, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, z2, readInt, readString14, readString15, readString16, (List<String>) createStringArrayList, readString17, createFromParcel, z3, skuAttributeModel, parcel.readInt() != 0, (List<String>) parcel.createStringArrayList());
        }
    }
}
