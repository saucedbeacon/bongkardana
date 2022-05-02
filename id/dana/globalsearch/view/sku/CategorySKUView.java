package id.dana.globalsearch.view.sku;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.globalsearch.basecategory.BaseCategoryGlobalSearchView;
import id.dana.globalsearch.basecategory.SearchResultVerticalView;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.SearchResultModel;
import id.dana.globalsearch.view.sku.model.SKUModel;
import id.dana.globalsearch.view.widget.CategoryHeaderView;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.resetInternal;
import o.setBridgeManifests;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lid/dana/globalsearch/view/sku/CategorySKUView;", "Lid/dana/globalsearch/basecategory/BaseCategoryGlobalSearchView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "merchantState", "Lid/dana/globalsearch/view/sku/model/SKUModel$MerchantState;", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "getMerchantState", "(Lid/dana/globalsearch/model/PaySearchInfoModel;)Lid/dana/globalsearch/view/sku/model/SKUModel$MerchantState;", "getCategoryHeaderView", "Lid/dana/globalsearch/view/widget/CategoryHeaderView;", "getLayout", "hideSearchResult", "", "setItemClickCallback", "onItemClickCallback", "Lkotlin/Function1;", "setLoadMoreCallback", "onLoadMore", "Lkotlin/Function0;", "showSearchResult", "searchResult", "Lid/dana/globalsearch/model/SearchResultModel;", "showSection", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CategorySKUView extends BaseCategoryGlobalSearchView {
    private HashMap setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length extends TypeReference<Map<String, ? extends String>> {
    }

    @JvmOverloads
    public CategorySKUView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public CategorySKUView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_category_sku;
    }

    public final void setLoadMoreCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onLoadMore");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategorySKUView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CategorySKUView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CategorySKUView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void showSearchResult(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        showSection();
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setLogo);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(8);
        }
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            View view = searchResultVerticalView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        SKUItemView sKUItemView = (SKUItemView) _$_findCachedViewById(resetInternal.setMax.setFirstBaselineToTopHeight);
        if (sKUItemView != null) {
            View view2 = sKUItemView;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(0);
        }
        Iterable<PaySearchInfoModel> limitedItems = getLimitedItems(searchResultModel);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(limitedItems, 10));
        for (PaySearchInfoModel paySearchInfoModel : limitedItems) {
            String logo = paySearchInfoModel.getLogo();
            String merchantName = setBridgeManifests.setMax(paySearchInfoModel.getInfo()).getMerchantName();
            String name = paySearchInfoModel.getName();
            String str = paySearchInfoModel.getUrlMap().get("DETAIL");
            if (str == null) {
                str = "";
            }
            arrayList.add(new SKUModel(logo, merchantName, "", name, str, setMax(paySearchInfoModel)));
        }
        List list = (List) arrayList;
        SKUItemView sKUItemView2 = (SKUItemView) _$_findCachedViewById(resetInternal.setMax.setFirstBaselineToTopHeight);
        if (sKUItemView2 != null) {
            sKUItemView2.setData(list);
        }
    }

    private static SKUModel.MerchantState setMax(PaySearchInfoModel paySearchInfoModel) {
        Map map;
        String obj;
        Object obj2 = paySearchInfoModel.getInfo().get("openHours");
        if (obj2 == null || (obj = obj2.toString()) == null) {
            map = null;
        } else if (obj == null) {
            try {
                map = MapsKt.emptyMap();
            } catch (Exception unused) {
                map = MapsKt.emptyMap();
            }
        } else {
            Object parseObject = JSON.parseObject(new JSONObject(obj).toString(), new length(), new Feature[0]);
            Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
            map = (Map) parseObject;
        }
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Calendar instance = Calendar.getInstance();
        String str = (String) map.get("CLOSE_".concat(String.valueOf(instance.get(7) - 1)));
        if (str != null) {
            instance.set(11, Integer.parseInt(StringsKt.take(str, 2)));
            instance.set(12, Integer.parseInt(StringsKt.takeLast(str, 2)));
            Date date = new Date();
            Intrinsics.checkNotNullExpressionValue(instance, "calendar");
            if (date.after(instance.getTime())) {
                return SKUModel.MerchantState.CLOSED;
            }
        }
        if (Intrinsics.areEqual(paySearchInfoModel.getInfo().get("isStockAvailable"), (Object) SummaryActivity.CHECKED)) {
            return SKUModel.MerchantState.OPEN;
        }
        return SKUModel.MerchantState.OUT_OF_STOCK;
    }

    public final void showSection() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.onQueueChanged);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
    }

    public final void hideSearchResult() {
        SKUItemView sKUItemView = (SKUItemView) _$_findCachedViewById(resetInternal.setMax.setFirstBaselineToTopHeight);
        if (sKUItemView != null) {
            View view = sKUItemView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    @Nullable
    public final CategoryHeaderView getCategoryHeaderView() {
        return (CategoryHeaderView) _$_findCachedViewById(resetInternal.setMax.onMetadataChanged);
    }

    public final void setItemClickCallback(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onItemClickCallback");
        ((SKUItemView) _$_findCachedViewById(resetInternal.setMax.setFirstBaselineToTopHeight)).setItemClickCallback(function1);
    }
}
