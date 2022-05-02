package id.dana.explore.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.explore.view.ExploreDanaFragment;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.TimeOutContext;
import o.onBeaconUpdate;
import o.openBluetooth;
import o.performRequest;
import o.resetInternal;
import o.supportAdvertise;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u001c\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010#\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010$\u001a\u00020\u001d2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000eH\u0002J\u001a\u0010&\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0012\u0010(\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010)\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\rH\u0002J\u000e\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\rJ\u0014\u0010.\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eJ6\u00100\u001a\u00020\u00172.\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\fj\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e`\u000fJ\b\u00101\u001a\u00020\u0017H\u0016J\u000e\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R6\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\fj\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e`\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lid/dana/explore/view/ExploreProductView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "exploreDanaFragmentListener", "Lid/dana/explore/view/ExploreDanaFragment$ExploreDanaFragmentListener;", "postPaidProfileKeyHashMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "productAdapter", "Lid/dana/explore/adapter/ExploreProductAdapter;", "buildPostPaidUrl", "baseUrl", "bizParam", "goodsId", "checkKey", "", "exploreProductModel", "Lid/dana/explore/model/ExploreProductModel;", "getLayout", "initProductRecyclerView", "isPayment", "", "bizId", "Lid/dana/domain/globalsearch/model/ProductBizId;", "link", "isPostPaid", "item", "isPostPaidKeyValid", "isPrePaid", "prePaidKey", "isTelkom", "key", "navigateToPostPaidPage", "navigateToPrePaidPage", "navigateToServicePage", "serviceKey", "openH5Container", "url", "setItems", "defaultSku", "setPostPaidProfileKey", "setup", "setupExploreDanaListener", "listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ExploreProductView extends BaseRichView {
    private HashMap<String, List<String>> getMin;
    private HashMap length;
    /* access modifiers changed from: private */
    public TimeOutContext setMax;
    private ExploreDanaFragment.setMin setMin;

    @JvmOverloads
    public ExploreProductView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ExploreProductView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_explore_product;
    }

    public static final /* synthetic */ TimeOutContext access$getProductAdapter$p(ExploreProductView exploreProductView) {
        TimeOutContext timeOutContext = exploreProductView.setMax;
        if (timeOutContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
        }
        return timeOutContext;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExploreProductView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExploreProductView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements Ignore.setMin {
        final /* synthetic */ ExploreProductView length;

        getMax(ExploreProductView exploreProductView) {
            this.length = exploreProductView;
        }

        public final void length(int i) {
            openBluetooth openbluetooth = ((supportAdvertise) ExploreProductView.access$getProductAdapter$p(this.length).setMin(i)).setMax;
            performRequest performrequest = openbluetooth.toIntRange;
            CharSequence bizId = performrequest != null ? performrequest.getBizId() : null;
            if (!(bizId == null || bizId.length() == 0)) {
                ExploreProductView.access$checkKey(this.length, openbluetooth);
                return;
            }
            ExploreProductView exploreProductView = this.length;
            String str = openbluetooth.IsOverlapping;
            if (str == null) {
                str = "";
            }
            ExploreProductView.access$navigateToServicePage(exploreProductView, str);
        }
    }

    private static boolean setMax(List<String> list) {
        return list != null && !list.isEmpty();
    }

    private static boolean length(performRequest performrequest, String str) {
        CharSequence bizId = performrequest != null ? performrequest.getBizId() : null;
        if (!(bizId == null || bizId.length() == 0)) {
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void setItems(@NotNull List<openBluetooth> list) {
        Intrinsics.checkNotNullParameter(list, "defaultSku");
        TimeOutContext timeOutContext = this.setMax;
        if (timeOutContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
        }
        List max = timeOutContext.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        CollectionsKt.removeAll(max, TimeOutContext.setMin.INSTANCE);
        timeOutContext.notifyDataSetChanged();
        for (openBluetooth openbluetooth : list) {
            TimeOutContext timeOutContext2 = this.setMax;
            if (timeOutContext2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
            }
            timeOutContext2.getMax().add(new supportAdvertise(0, openbluetooth));
        }
        TimeOutContext timeOutContext3 = this.setMax;
        if (timeOutContext3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
        }
        timeOutContext3.notifyDataSetChanged();
    }

    public final void setupExploreDanaListener(@NotNull ExploreDanaFragment.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.setMin = setmin;
    }

    static /* synthetic */ String buildPostPaidUrl$default(ExploreProductView exploreProductView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return getMax(str, str2, str3);
    }

    public final void openH5Container(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        DanaH5.startContainerFullUrl(str);
    }

    public final void setPostPaidProfileKey(@NotNull HashMap<String, List<String>> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "postPaidProfileKeyHashMap");
        this.getMin = hashMap;
    }

    private static boolean getMax(performRequest performrequest, String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "service_telkom")) {
            CharSequence bizId = performrequest != null ? performrequest.getBizId() : null;
            if (!(bizId == null || bizId.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    private static String getMax(String str, String str2, String str3) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        Uri.Builder appendQueryParameter = parse.buildUpon().appendQueryParameter("autoInquiry", SummaryActivity.CHECKED).appendQueryParameter("bizParam", str2);
        if (str3 != null) {
            appendQueryParameter.appendQueryParameter("goodsId", str3);
        }
        String obj = appendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "uriBuilder.build().toString()");
        return obj;
    }

    public final void setup() {
        Context context = getContext();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onTextChanged);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        TimeOutContext timeOutContext = new TimeOutContext();
        this.setMax = timeOutContext;
        if (timeOutContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
        }
        recyclerView.setAdapter(timeOutContext);
        recyclerView.setNestedScrollingEnabled(false);
        TimeOutContext timeOutContext2 = this.setMax;
        if (timeOutContext2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
        }
        timeOutContext2.getMax().clear();
        List max = timeOutContext2.getMax();
        openBluetooth openbluetooth = r5;
        openBluetooth openbluetooth2 = new openBluetooth((List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (performRequest) null, (String) null, (String) null, (String) null, 16383);
        max.add(new supportAdvertise(1, openbluetooth));
        List max2 = timeOutContext2.getMax();
        openBluetooth openbluetooth3 = r6;
        openBluetooth openbluetooth4 = new openBluetooth((List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (performRequest) null, (String) null, (String) null, (String) null, 16383);
        max2.add(new supportAdvertise(1, openbluetooth3));
        timeOutContext2.notifyDataSetChanged();
        TimeOutContext timeOutContext3 = this.setMax;
        if (timeOutContext3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
        }
        timeOutContext3.getMax((Ignore.setMin) new getMax(this));
    }

    private final boolean length(openBluetooth openbluetooth) {
        String str;
        if (openbluetooth == null || (str = openbluetooth.IsOverlapping) == null || (!Intrinsics.areEqual((Object) str, (Object) "service_electricity") && !Intrinsics.areEqual((Object) str, (Object) "service_mobilerecharge") && !Intrinsics.areEqual((Object) str, (Object) "service_mobilepostpaid"))) {
            return false;
        }
        HashMap<String, List<String>> hashMap = this.getMin;
        if (hashMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postPaidProfileKeyHashMap");
        }
        List list = hashMap.get(str);
        performRequest performrequest = openbluetooth.toIntRange;
        String profileKey = performrequest != null ? performrequest.getProfileKey() : null;
        Collection collection = list;
        boolean z = true;
        if (!(collection == null || collection.isEmpty())) {
            CharSequence charSequence = profileKey;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                return list.contains(profileKey);
            }
        }
        return false;
    }

    private final boolean setMin(openBluetooth openbluetooth) {
        List<String> list;
        String str;
        if (openbluetooth == null || (list = openbluetooth.length) == null) {
            list = CollectionsKt.emptyList();
        }
        HashMap<String, List<String>> hashMap = this.getMin;
        if (hashMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postPaidProfileKeyHashMap");
        }
        Map map = hashMap;
        if (openbluetooth != null) {
            str = openbluetooth.IsOverlapping;
        } else {
            str = null;
        }
        List list2 = (List) map.get(str);
        if (!list.isEmpty()) {
            Collection collection = list2;
            return !(collection == null || collection.isEmpty()) && (CollectionsKt.intersect(list2, list).isEmpty() ^ true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r2.equals("service_mobilerecharge") == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r2.equals("service_mobilepostpaid") != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$checkKey(id.dana.explore.view.ExploreProductView r9, o.openBluetooth r10) {
        /*
            boolean r0 = r9.length(r10)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0090
            boolean r0 = r9.setMin(r10)
            if (r0 == 0) goto L_0x008f
            r0 = 0
            if (r10 == 0) goto L_0x0014
            java.lang.String r2 = r10.IsOverlapping
            goto L_0x0015
        L_0x0014:
            r2 = r0
        L_0x0015:
            if (r2 != 0) goto L_0x0019
            goto L_0x008c
        L_0x0019:
            int r3 = r2.hashCode()
            r4 = -692436776(0xffffffffd6ba40d8, float:-1.02393832E14)
            if (r3 == r4) goto L_0x0060
            r4 = 930525159(0x3776afe7, float:1.4703698E-5)
            if (r3 == r4) goto L_0x0037
            r4 = 2038502419(0x79811413, float:8.377668E34)
            if (r3 == r4) goto L_0x002e
            goto L_0x008c
        L_0x002e:
            java.lang.String r3 = "service_mobilerecharge"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008c
            goto L_0x0068
        L_0x0037:
            java.lang.String r3 = "service_electricity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008c
            java.lang.String r2 = r10.hashCode
            java.lang.String r2 = o.isShowMenu.setMin(r2)
            if (r2 != 0) goto L_0x0049
            java.lang.String r2 = "https://m.dana.id/i/biller-app/electricity/postpaid"
        L_0x0049:
            r4 = r2
            o.performRequest r10 = r10.toIntRange
            if (r10 == 0) goto L_0x0052
            java.lang.String r0 = r10.getBizId()
        L_0x0052:
            if (r0 != 0) goto L_0x0056
            r5 = r1
            goto L_0x0057
        L_0x0056:
            r5 = r0
        L_0x0057:
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            java.lang.String r1 = buildPostPaidUrl$default(r3, r4, r5, r6, r7, r8)
            goto L_0x008c
        L_0x0060:
            java.lang.String r3 = "service_mobilepostpaid"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008c
        L_0x0068:
            java.lang.String r2 = r10.hashCode
            java.lang.String r2 = o.isShowMenu.setMin(r2)
            if (r2 != 0) goto L_0x0072
            java.lang.String r2 = "https://m.dana.id/i/biller-app/mobile-postpaid"
        L_0x0072:
            o.performRequest r3 = r10.toIntRange
            if (r3 == 0) goto L_0x007b
            java.lang.String r3 = r3.getBizId()
            goto L_0x007c
        L_0x007b:
            r3 = r0
        L_0x007c:
            if (r3 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r1 = r3
        L_0x0080:
            o.performRequest r10 = r10.toIntRange
            if (r10 == 0) goto L_0x0088
            java.lang.String r0 = r10.getGoodsId()
        L_0x0088:
            java.lang.String r1 = getMax(r2, r1, r0)
        L_0x008c:
            r9.openH5Container(r1)
        L_0x008f:
            return
        L_0x0090:
            java.util.List<java.lang.String> r0 = r10.getMax
            boolean r0 = setMax(r0)
            java.lang.String r2 = "exploreDanaFragmentListener"
            if (r0 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00b2
            java.util.List<java.lang.String> r10 = r10.getMax
            if (r10 == 0) goto L_0x00b2
            java.lang.Object r10 = kotlin.collections.CollectionsKt.firstOrNull(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00b2
            id.dana.explore.view.ExploreDanaFragment$setMin r9 = r9.setMin
            if (r9 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00af:
            r9.getMax(r10)
        L_0x00b2:
            return
        L_0x00b3:
            o.performRequest r0 = r10.toIntRange
            java.lang.String r3 = r10.IsOverlapping
            if (r3 != 0) goto L_0x00ba
            r3 = r1
        L_0x00ba:
            boolean r0 = getMax(r0, r3)
            java.lang.String r3 = "UrlUtil.getCleanUrl(link.orEmpty())"
            if (r0 == 0) goto L_0x00ee
            id.dana.explore.view.ExploreDanaFragment$setMin r9 = r9.setMin
            if (r9 != 0) goto L_0x00c9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00c9:
            o.onBeaconUpdate r0 = o.onBeaconUpdate.setMax
            java.lang.String r0 = r10.IsOverlapping
            if (r0 != 0) goto L_0x00d0
            r0 = r1
        L_0x00d0:
            o.performRequest r2 = r10.toIntRange
            java.lang.String r4 = r10.hashCode
            if (r4 != 0) goto L_0x00d7
            r4 = r1
        L_0x00d7:
            java.lang.String r4 = o.isShowMenu.setMin(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            java.lang.String r3 = r10.equals
            java.lang.String r10 = r10.toString
            if (r10 != 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r1 = r10
        L_0x00e6:
            java.lang.String r10 = o.onBeaconUpdate.length(r0, r2, r4, r3, r1)
            r9.length(r10)
            return
        L_0x00ee:
            o.performRequest r0 = r10.toIntRange
            java.lang.String r4 = r10.hashCode
            boolean r0 = length(r0, r4)
            if (r0 == 0) goto L_0x011d
            o.onBeaconUpdate r0 = o.onBeaconUpdate.setMax
            java.lang.String r0 = r10.IsOverlapping
            if (r0 != 0) goto L_0x00ff
            r0 = r1
        L_0x00ff:
            o.performRequest r2 = r10.toIntRange
            java.lang.String r4 = r10.hashCode
            if (r4 != 0) goto L_0x0106
            r4 = r1
        L_0x0106:
            java.lang.String r4 = o.isShowMenu.setMin(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            java.lang.String r3 = r10.equals
            java.lang.String r10 = r10.toString
            if (r10 != 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r1 = r10
        L_0x0115:
            java.lang.String r10 = o.onBeaconUpdate.length(r0, r2, r4, r3, r1)
            r9.openH5Container(r10)
            return
        L_0x011d:
            java.lang.String r10 = r10.IsOverlapping
            if (r10 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r1 = r10
        L_0x0123:
            id.dana.explore.view.ExploreDanaFragment$setMin r9 = r9.setMin
            if (r9 != 0) goto L_0x012a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x012a:
            o.onBeaconUpdate r10 = o.onBeaconUpdate.setMax
            java.lang.String r10 = o.onBeaconUpdate.getMin(r1)
            r9.length(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.explore.view.ExploreProductView.access$checkKey(id.dana.explore.view.ExploreProductView, o.openBluetooth):void");
    }

    public static final /* synthetic */ void access$navigateToServicePage(ExploreProductView exploreProductView, String str) {
        ExploreDanaFragment.setMin setmin = exploreProductView.setMin;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exploreDanaFragmentListener");
        }
        onBeaconUpdate onbeaconupdate = onBeaconUpdate.setMax;
        setmin.length(onBeaconUpdate.getMin(str));
    }
}
