package id.dana.globalsearch.view.sku;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.globalsearch.view.sku.model.SKUModel;
import id.dana.richview.imageview.ImageWithDescriptionView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverManifest;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.makeHeaderView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0016\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/globalsearch/view/sku/SKUItemView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "onItemClickCallback", "Lkotlin/Function1;", "", "skuItemAdapter", "Lid/dana/globalsearch/view/sku/adapter/SKUItemAdapter;", "getEdgeDecorator", "Lid/dana/utils/EdgeDecorator;", "getHorizontalLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayout", "setData", "skuModels", "", "Lid/dana/globalsearch/view/sku/model/SKUModel;", "setItemClickCallback", "setup", "setupAdapter", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SKUItemView extends BaseRichView {
    /* access modifiers changed from: private */
    public Function1<? super Integer, Unit> getMax;
    private GriverManifest.AnonymousClass19 setMax;
    private HashMap setMin;

    @JvmOverloads
    public SKUItemView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SKUItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_service;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SKUItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SKUItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SKUItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/globalsearch/view/sku/SKUItemView$setupAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Ignore.setMin {
        final /* synthetic */ SKUItemView length;

        setMax(SKUItemView sKUItemView) {
            this.length = sKUItemView;
        }

        public final void length(int i) {
            Function1 access$getOnItemClickCallback$p = this.length.getMax;
            if (access$getOnItemClickCallback$p != null) {
                access$getOnItemClickCallback$p.invoke(Integer.valueOf(i));
            }
        }
    }

    public final void setData(@Nullable List<SKUModel> list) {
        GriverManifest.AnonymousClass19 r0 = this.setMax;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skuItemAdapter");
        }
        r0.getMin(list);
        GriverManifest.AnonymousClass19 r3 = this.setMax;
        if (r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skuItemAdapter");
        }
        r3.notifyDataSetChanged();
    }

    public final void setItemClickCallback(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onItemClickCallback");
        this.getMax = function1;
    }

    public final void setup() {
        GriverManifest.AnonymousClass19 r0 = new IMultiInstanceInvalidationCallback.Stub<Ignore<SKUModel>, SKUModel>() {
            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new Ignore<SKUModel>(viewGroup) {
                    public final /* synthetic */ void setMax(Object obj) {
                        SKUModel sKUModel = (SKUModel) obj;
                        Intrinsics.checkNotNullParameter(sKUModel, "data");
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        ImageWithDescriptionView imageWithDescriptionView = (ImageWithDescriptionView) view.findViewById(resetInternal.setMax.setCancelable);
                        imageWithDescriptionView.showImage(sKUModel.getFoodUrl());
                        imageWithDescriptionView.setTitle(sKUModel.getFoodName());
                        imageWithDescriptionView.setDescription(sKUModel.getShopName().length() == 0 ? sKUModel.getMerchantName() : sKUModel.getShopName());
                        int i = AnonymousClass18.getMax[sKUModel.getState().ordinal()];
                        String str = null;
                        if (i == 1) {
                            AppCompatImageView appCompatImageView = (AppCompatImageView) imageWithDescriptionView._$_findCachedViewById(resetInternal.setMax.startSupportActionMode);
                            if (appCompatImageView != null) {
                                getBluetoothAdapterState.getMax(appCompatImageView);
                            }
                            str = imageWithDescriptionView.getContext().getString(R.string.closed);
                        } else if (i != 2) {
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) imageWithDescriptionView._$_findCachedViewById(resetInternal.setMax.startSupportActionMode);
                            if (appCompatImageView2 != null) {
                                ImageView imageView = appCompatImageView2;
                                Intrinsics.checkNotNullParameter(imageView, "$this$removeGreyscale");
                                imageView.setColorFilter((ColorFilter) null);
                                imageView.setImageAlpha(255);
                            }
                        } else {
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) imageWithDescriptionView._$_findCachedViewById(resetInternal.setMax.startSupportActionMode);
                            if (appCompatImageView3 != null) {
                                getBluetoothAdapterState.getMax(appCompatImageView3);
                            }
                            str = imageWithDescriptionView.getContext().getString(R.string.out_of_stock);
                        }
                        imageWithDescriptionView.setNote(str);
                    }

                    {
                        Intrinsics.checkNotNullParameter(r3, "parent");
                    }
                };
            }
        };
        r0.getMax((Ignore.setMin) new setMax(this));
        Unit unit = Unit.INSTANCE;
        this.setMax = r0;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setExpandActivityOverflowButtonDrawable);
        if (recyclerView != null) {
            GriverManifest.AnonymousClass19 r1 = this.setMax;
            if (r1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skuItemAdapter");
            }
            recyclerView.setAdapter(r1);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerView.addItemDecoration(new makeHeaderView(getResources().getDimensionPixelOffset(R.dimen.f26372131165291), getResources().getDimensionPixelOffset(R.dimen.f26362131165290), getResources().getDimensionPixelOffset(R.dimen.f26362131165290)));
        }
    }
}
