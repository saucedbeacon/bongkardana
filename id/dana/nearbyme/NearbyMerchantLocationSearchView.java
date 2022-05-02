package id.dana.nearbyme;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.location.Location;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.di.modules.NearbyMerchantLocationSearchModule;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import id.dana.nearbyme.model.ShopModel;
import id.dana.richview.SearchView;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BaseResourcePackage;
import o.PrepareException;
import o.RedDotManager;
import o.getCreateTime;
import o.getExceedAppIdList;
import o.getHandlerClassName;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.onDelete;
import o.processFacade;
import o.resetInternal;
import o.setDeployAppInfoList;
import o.setOnWheelViewListener;
import o.setTextColor;
import o.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002FGB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\b\u0010$\u001a\u00020\u0007H\u0016J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007J\b\u0010(\u001a\u00020\u001eH\u0002J\u0012\u0010)\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0006\u0010,\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u0010J\u000e\u00100\u001a\u00020\u001e2\u0006\u0010/\u001a\u000201J\u000e\u00102\u001a\u00020\u001e2\u0006\u0010/\u001a\u000203J\u000e\u00104\u001a\u00020\u001e2\u0006\u0010/\u001a\u000205J\u000e\u00106\u001a\u00020\u001e2\u0006\u0010/\u001a\u000207J\u000e\u00108\u001a\u00020\u001e2\u0006\u0010/\u001a\u000209J\u0014\u0010:\u001a\u00020\u001e2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0<J\b\u0010=\u001a\u00020\u001eH\u0016J\b\u0010>\u001a\u00020\u001eH\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0002J\u0016\u0010B\u001a\u00020\u001e2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0<H\u0002J\u0016\u0010E\u001a\u00020\u001e2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0<H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006H"}, d2 = {"Lid/dana/nearbyme/NearbyMerchantLocationSearchView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isMerchantSearch", "", "location", "Landroid/location/Location;", "locationSearchListener", "Lid/dana/nearbyme/NearbyMerchantLocationSearchView$Listener;", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "presenter", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "getPresenter", "()Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "setPresenter", "(Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;)V", "changeState", "", "state", "Lid/dana/nearbyme/NearbyMerchantLocationSearchView$State;", "checkAdapterItems", "displayInitialLocationState", "displayInitialMerchantState", "getLayout", "getSearchedMerchantByPosition", "Lid/dana/nearbyme/model/ShopModel;", "position", "hideKeyboard", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "resetState", "setLocation", "setLocationListener", "listener", "setMerchantListener", "Lid/dana/nearbyme/adapter/MerchantListAdapter$OnMerchantListClickListener;", "setOnHomeShoppingClickListener", "Lid/dana/nearbyme/adapter/MerchantListAdapter$OnHomeShoppingClickListener;", "setOnOtherStoreButtonClickListener", "Lid/dana/nearbyme/adapter/MerchantListAdapter$OnOtherStoreButtonClickListener;", "setOnPromoRibbonClickListener", "Lid/dana/nearbyme/adapter/MerchantListAdapter$OnPromoRibbonClickListener;", "setOnTopUpButtonClickListener", "Lid/dana/nearbyme/adapter/MerchantListAdapter$OnTopUpButtonClickListener;", "setShopModels", "shopModels", "", "setup", "setupSearchView", "trackKeywordEvent", "", "keyword", "updateLocationData", "nearbyLocations", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "updateMerchantData", "Listener", "State", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NearbyMerchantLocationSearchView extends BaseRichView {
    /* access modifiers changed from: private */
    public length getMax;
    private HashMap getMin;
    @Inject
    public t nearbyAnalyticTracker;
    @Inject
    public setTextColor.length presenter;
    /* access modifiers changed from: private */
    public Location setMax;
    /* access modifiers changed from: private */
    public boolean setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyme/NearbyMerchantLocationSearchView$State;", "", "(Ljava/lang/String;I)V", "EMPTY_MERCHANT_VIEW", "EMPTY_LOCATION_VIEW", "INITIAL_MERCHANT_VIEW", "INITIAL_LOCATION_VIEW", "MERCHANT_EMPTY", "MERCHANT_EXIST", "LOCATION_EMPTY", "LOCATION_EXIST", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum State {
        EMPTY_MERCHANT_VIEW,
        EMPTY_LOCATION_VIEW,
        INITIAL_MERCHANT_VIEW,
        INITIAL_LOCATION_VIEW,
        MERCHANT_EMPTY,
        MERCHANT_EXIST,
        LOCATION_EMPTY,
        LOCATION_EXIST
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/NearbyMerchantLocationSearchView$Listener;", "", "onLocationSelected", "", "location", "Landroid/location/Location;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void length(@NotNull Location location);
    }

    @JvmOverloads
    public NearbyMerchantLocationSearchView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NearbyMerchantLocationSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_nearby_location_merchant_search;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "keyword", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<String> {
        final /* synthetic */ NearbyMerchantLocationSearchView length;

        setMin(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView) {
            this.length = nearbyMerchantLocationSearchView;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullExpressionValue(str, FeatureParams.KEYWORD);
            if (str != null) {
                if (StringsKt.trim((CharSequence) str).toString().length() == 0) {
                    NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView = this.length;
                    nearbyMerchantLocationSearchView.setMin(nearbyMerchantLocationSearchView.setMin ? State.INITIAL_MERCHANT_VIEW : State.INITIAL_LOCATION_VIEW);
                    return;
                }
                ((SearchView) this.length._$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).showLoading(true);
                this.length.getPresenter().length(str, NearbyMerchantLocationSearchView.access$getLocation$p(this.length));
                this.length.getPresenter().getMax(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    public static final /* synthetic */ Location access$getLocation$p(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView) {
        Location location = nearbyMerchantLocationSearchView.setMax;
        if (location == null) {
            Intrinsics.throwUninitializedPropertyAccessException("location");
        }
        return location;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NearbyMerchantLocationSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbyMerchantLocationSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NearbyMerchantLocationSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final setTextColor.length getPresenter() {
        setTextColor.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2;
    }

    public final void setPresenter(@NotNull setTextColor.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @NotNull
    public final t getNearbyAnalyticTracker() {
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        return tVar;
    }

    public final void setNearbyAnalyticTracker(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.nearbyAnalyticTracker = tVar;
    }

    public final void setup() {
        setTextColor.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.getMin();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        recyclerView.addItemDecoration(new RecyclerView.getMax(context, false) {
            private final boolean getMax;
            private Paint length;
            private final Context setMax;

            {
                Intrinsics.checkNotNullParameter(r3, HummerConstants.CONTEXT);
                this.setMax = r3;
                this.getMax = r4;
                Paint paint = new Paint();
                paint.setColor(IntRange.setMax(this.setMax, R.color.f24622131100412));
                Resources resources = this.setMax.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                paint.setStrokeWidth(TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
                Unit unit = Unit.INSTANCE;
                this.length = paint;
            }

            public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                float f;
                int i;
                RecyclerView recyclerView2 = recyclerView;
                RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic2 = recyclerView$Mean$Arithmetic;
                Intrinsics.checkNotNullParameter(canvas, "c");
                Intrinsics.checkNotNullParameter(recyclerView2, "parent");
                Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic2, "state");
                int strokeWidth = (int) (this.length.getStrokeWidth() / 2.0f);
                int childCount = !this.getMax ? recyclerView.getChildCount() - 1 : recyclerView.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = recyclerView2.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "view");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                        if (!this.getMax) {
                            f = 0.0f;
                        } else {
                            Resources resources = this.setMax.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                            f = TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
                        }
                        int viewAdapterPosition = layoutParams2.getViewAdapterPosition();
                        if (recyclerView$Mean$Arithmetic2.equals) {
                            i = recyclerView$Mean$Arithmetic2.setMax - recyclerView$Mean$Arithmetic2.getMax;
                        } else {
                            i = recyclerView$Mean$Arithmetic2.setMin;
                        }
                        if (viewAdapterPosition < i) {
                            float f2 = (float) strokeWidth;
                            canvas.drawLine(((float) childAt.getLeft()) + f, ((float) childAt.getBottom()) + f2, ((float) childAt.getRight()) - f, f2 + ((float) childAt.getBottom()), this.length);
                        }
                        i2++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    }
                }
            }

            public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                int i;
                Intrinsics.checkNotNullParameter(rect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(recyclerView, "parent");
                Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic, "state");
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (recyclerView$Mean$Arithmetic.equals) {
                    i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i = recyclerView$Mean$Arithmetic.setMin;
                }
                if (childAdapterPosition != i - 1 || this.getMax) {
                    rect.set(0, 0, 0, (int) this.length.getStrokeWidth());
                } else {
                    rect.setEmpty();
                }
            }
        });
        recyclerView.setAdapter(new getHandlerClassName(new getMax(this)));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        Context context2 = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        recyclerView2.addItemDecoration(new RecyclerView.getMax(context2, true) {
            private final boolean getMax;
            private Paint length;
            private final Context setMax;

            {
                Intrinsics.checkNotNullParameter(r3, HummerConstants.CONTEXT);
                this.setMax = r3;
                this.getMax = r4;
                Paint paint = new Paint();
                paint.setColor(IntRange.setMax(this.setMax, R.color.f24622131100412));
                Resources resources = this.setMax.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                paint.setStrokeWidth(TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
                Unit unit = Unit.INSTANCE;
                this.length = paint;
            }

            public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                float f;
                int i;
                RecyclerView recyclerView2 = recyclerView;
                RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic2 = recyclerView$Mean$Arithmetic;
                Intrinsics.checkNotNullParameter(canvas, "c");
                Intrinsics.checkNotNullParameter(recyclerView2, "parent");
                Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic2, "state");
                int strokeWidth = (int) (this.length.getStrokeWidth() / 2.0f);
                int childCount = !this.getMax ? recyclerView.getChildCount() - 1 : recyclerView.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = recyclerView2.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "view");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                        if (!this.getMax) {
                            f = 0.0f;
                        } else {
                            Resources resources = this.setMax.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                            f = TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
                        }
                        int viewAdapterPosition = layoutParams2.getViewAdapterPosition();
                        if (recyclerView$Mean$Arithmetic2.equals) {
                            i = recyclerView$Mean$Arithmetic2.setMax - recyclerView$Mean$Arithmetic2.getMax;
                        } else {
                            i = recyclerView$Mean$Arithmetic2.setMin;
                        }
                        if (viewAdapterPosition < i) {
                            float f2 = (float) strokeWidth;
                            canvas.drawLine(((float) childAt.getLeft()) + f, ((float) childAt.getBottom()) + f2, ((float) childAt.getRight()) - f, f2 + ((float) childAt.getBottom()), this.length);
                        }
                        i2++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    }
                }
            }

            public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                int i;
                Intrinsics.checkNotNullParameter(rect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(recyclerView, "parent");
                Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic, "state");
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (recyclerView$Mean$Arithmetic.equals) {
                    i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i = recyclerView$Mean$Arithmetic.setMin;
                }
                if (childAdapterPosition != i - 1 || this.getMax) {
                    rect.set(0, 0, 0, (int) this.length.getStrokeWidth());
                } else {
                    rect.setEmpty();
                }
            }
        });
        recyclerView2.setAdapter(new MerchantListAdapter());
        ((SearchView) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).setSearchHint("");
        SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds);
        Intrinsics.checkNotNullExpressionValue(searchView, "sv_merchant_location_search");
        addDisposable(searchView.getKeyword().debounce(500, TimeUnit.MILLISECONDS).map(new setDeployAppInfoList(new setMax(this))).observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).subscribe(new setMin(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/nearbyme/NearbyMerchantLocationSearchView$setup$1$1", "Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$OnClickListener;", "onLocationClicked", "", "placeId", "", "name", "address", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getHandlerClassName.setMin {
        final /* synthetic */ NearbyMerchantLocationSearchView getMax;

        getMax(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView) {
            this.getMax = nearbyMerchantLocationSearchView;
        }

        public final void onLocationClicked(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "placeId");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(str3, "address");
            this.getMax.getPresenter().setMin(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016¨\u0006\u000f"}, d2 = {"id/dana/nearbyme/NearbyMerchantLocationSearchView$injectComponent$1", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;", "onErrorGetDetailLocation", "", "onErrorGetListLocations", "onSuccessGetDetailLocation", "location", "Landroid/location/Location;", "onSuccessGetListLocations", "nearbyLocations", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onSuccessGetNearbyMerchantList", "shops", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements setTextColor.getMin {
        final /* synthetic */ NearbyMerchantLocationSearchView length;

        @JvmDefault
        public final void getMin(boolean z, @NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
        }

        @JvmDefault
        public final void onSuccessGetReverseGeocodeByLocation(@NotNull processFacade processfacade) {
            Intrinsics.checkNotNullParameter(processfacade, "address");
        }

        @JvmDefault
        public final void setMax() {
        }

        @JvmDefault
        public final void setMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopsWithPromo");
        }

        @JvmDefault
        public final void setMin(boolean z, @NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
        }

        getMin(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView) {
            this.length = nearbyMerchantLocationSearchView;
        }

        public final void getMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
            ((SearchView) this.length._$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).showLoading(false);
            NearbyMerchantLocationSearchView.access$updateMerchantData(this.length, list);
        }

        public final void onSuccessGetListLocations(@NotNull List<getCreateTime> list) {
            Intrinsics.checkNotNullParameter(list, "nearbyLocations");
            ((SearchView) this.length._$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).showLoading(false);
            NearbyMerchantLocationSearchView.access$updateLocationData(this.length, list);
        }

        public final void onErrorGetListLocations() {
            this.length.setMin(State.LOCATION_EMPTY);
        }

        public final void onSuccessGetDetailLocation(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            length access$getLocationSearchListener$p = this.length.getMax;
            if (access$getLocationSearchListener$p != null) {
                access$getLocationSearchListener$p.length(location);
            }
        }

        public final void onErrorGetDetailLocation() {
            this.length.getBaseActivity().showWarningDialog(this.length.getContext().getString(R.string.general_error_msg));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMax extends FunctionReferenceImpl implements Function1<String, String> {
        setMax(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView) {
            super(1, nearbyMerchantLocationSearchView, NearbyMerchantLocationSearchView.class, "trackKeywordEvent", "trackKeywordEvent(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "p1");
            return NearbyMerchantLocationSearchView.access$trackKeywordEvent((NearbyMerchantLocationSearchView) this.receiver, str);
        }
    }

    @NotNull
    public final ShopModel getSearchedMerchantByPosition(int i) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_merchant_list_merchant_location");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            Object min = ((MerchantListAdapter) adapter).setMin(i);
            Intrinsics.checkNotNullExpressionValue(min, "(rv_merchant_list_mercha…dapter).getItem(position)");
            return (ShopModel) min;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.nearbyme.adapter.MerchantListAdapter");
    }

    public final void setLocation(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.setMax = location;
    }

    public final void displayInitialMerchantState() {
        ((SearchView) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).focusEtSearchContact();
        setMin(State.INITIAL_MERCHANT_VIEW);
        this.setMin = true;
    }

    public final void displayInitialLocationState() {
        ((SearchView) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).focusEtSearchContact();
        setMin(State.INITIAL_LOCATION_VIEW);
        this.setMin = false;
    }

    public final void setLocationListener(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.getMax = length2;
    }

    public final void setShopModels(@NotNull List<? extends ShopModel> list) {
        Intrinsics.checkNotNullParameter(list, "shopModels");
        setTextColor.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.getMin(list);
    }

    public final void setMerchantListener(@NotNull MerchantListAdapter.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof MerchantListAdapter) {
            adapter = adapter2;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            merchantListAdapter.setMin = setmax;
        }
    }

    public final void setOnOtherStoreButtonClickListener(@NotNull MerchantListAdapter.length length2) {
        Intrinsics.checkNotNullParameter(length2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof MerchantListAdapter) {
            adapter = adapter2;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            merchantListAdapter.setMax = length2;
        }
    }

    public final void setOnTopUpButtonClickListener(@NotNull MerchantListAdapter.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof MerchantListAdapter) {
            adapter = adapter2;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            merchantListAdapter.getMax = setmin;
        }
    }

    public final void setOnPromoRibbonClickListener(@NotNull MerchantListAdapter.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof MerchantListAdapter) {
            adapter = adapter2;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            merchantListAdapter.length = getmin;
        }
    }

    public final void setOnHomeShoppingClickListener(@NotNull MerchantListAdapter.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof MerchantListAdapter) {
            adapter = adapter2;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            merchantListAdapter.getMin = getmax;
        }
    }

    private final void getMin(State state) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_merchant_list_merchant_location");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        getHandlerClassName gethandlerclassname = null;
        if (!(adapter instanceof MerchantListAdapter)) {
            adapter = null;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_location_list_merchant_location");
            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
            if (adapter2 instanceof getHandlerClassName) {
                gethandlerclassname = adapter2;
            }
            getHandlerClassName gethandlerclassname2 = gethandlerclassname;
            if (gethandlerclassname2 != null) {
                if (merchantListAdapter.getMax().isEmpty() && gethandlerclassname2.getMax().isEmpty()) {
                    state = State.EMPTY_MERCHANT_VIEW;
                }
                setMin(state);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(State state) {
        switch (getExceedAppIdList.setMin[state.ordinal()]) {
            case 1:
                setTextColor.length length2 = this.presenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length2.length();
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.startDispatchingItemsChanged);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_initial_search_state_location");
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performIdentifierAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_empty_result_location");
                linearLayout2.setVisibility(8);
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getNonActionItems);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_initial_search_state_merchant_location");
                linearLayout3.setVisibility(0);
                LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performItemAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "ll_empty_result_merchant_location");
                linearLayout4.setVisibility(8);
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setContentInsetsRelative);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_merchant_title_merchant_location");
                textView.setVisibility(8);
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView2, "tv_location_title_merchant_location");
                textView2.setVisibility(8);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_merchant_list_merchant_location");
                recyclerView.setVisibility(8);
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_location_list_merchant_location");
                recyclerView2.setVisibility(8);
                return;
            case 2:
                LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.startDispatchingItemsChanged);
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "ll_initial_search_state_location");
                linearLayout5.setVisibility(8);
                LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performIdentifierAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "ll_empty_result_location");
                linearLayout6.setVisibility(8);
                LinearLayout linearLayout7 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getNonActionItems);
                Intrinsics.checkNotNullExpressionValue(linearLayout7, "ll_initial_search_state_merchant_location");
                linearLayout7.setVisibility(8);
                LinearLayout linearLayout8 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performItemAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout8, "ll_empty_result_merchant_location");
                linearLayout8.setVisibility(0);
                TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.setContentInsetsRelative);
                Intrinsics.checkNotNullExpressionValue(textView3, "tv_merchant_title_merchant_location");
                textView3.setVisibility(8);
                TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView4, "tv_location_title_merchant_location");
                textView4.setVisibility(8);
                RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "rv_merchant_list_merchant_location");
                recyclerView3.setVisibility(8);
                RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
                Intrinsics.checkNotNullExpressionValue(recyclerView4, "rv_location_list_merchant_location");
                recyclerView4.setVisibility(8);
                return;
            case 3:
                setTextColor.length length3 = this.presenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length3.length();
                LinearLayout linearLayout9 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.startDispatchingItemsChanged);
                Intrinsics.checkNotNullExpressionValue(linearLayout9, "ll_initial_search_state_location");
                linearLayout9.setVisibility(0);
                LinearLayout linearLayout10 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performIdentifierAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout10, "ll_empty_result_location");
                linearLayout10.setVisibility(8);
                LinearLayout linearLayout11 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getNonActionItems);
                Intrinsics.checkNotNullExpressionValue(linearLayout11, "ll_initial_search_state_merchant_location");
                linearLayout11.setVisibility(8);
                LinearLayout linearLayout12 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performItemAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout12, "ll_empty_result_merchant_location");
                linearLayout12.setVisibility(8);
                TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.setContentInsetsRelative);
                Intrinsics.checkNotNullExpressionValue(textView5, "tv_merchant_title_merchant_location");
                textView5.setVisibility(8);
                TextView textView6 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView6, "tv_location_title_merchant_location");
                textView6.setVisibility(8);
                RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
                Intrinsics.checkNotNullExpressionValue(recyclerView5, "rv_merchant_list_merchant_location");
                recyclerView5.setVisibility(8);
                RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
                Intrinsics.checkNotNullExpressionValue(recyclerView6, "rv_location_list_merchant_location");
                recyclerView6.setVisibility(8);
                return;
            case 4:
                LinearLayout linearLayout13 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.startDispatchingItemsChanged);
                Intrinsics.checkNotNullExpressionValue(linearLayout13, "ll_initial_search_state_location");
                linearLayout13.setVisibility(8);
                LinearLayout linearLayout14 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performIdentifierAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout14, "ll_empty_result_location");
                linearLayout14.setVisibility(0);
                LinearLayout linearLayout15 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getNonActionItems);
                Intrinsics.checkNotNullExpressionValue(linearLayout15, "ll_initial_search_state_merchant_location");
                linearLayout15.setVisibility(8);
                LinearLayout linearLayout16 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performItemAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout16, "ll_empty_result_merchant_location");
                linearLayout16.setVisibility(8);
                TextView textView7 = (TextView) _$_findCachedViewById(resetInternal.setMax.setContentInsetsRelative);
                Intrinsics.checkNotNullExpressionValue(textView7, "tv_merchant_title_merchant_location");
                textView7.setVisibility(8);
                TextView textView8 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView8, "tv_location_title_merchant_location");
                textView8.setVisibility(8);
                RecyclerView recyclerView7 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
                Intrinsics.checkNotNullExpressionValue(recyclerView7, "rv_merchant_list_merchant_location");
                recyclerView7.setVisibility(8);
                RecyclerView recyclerView8 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
                Intrinsics.checkNotNullExpressionValue(recyclerView8, "rv_location_list_merchant_location");
                recyclerView8.setVisibility(8);
                return;
            case 5:
                TextView textView9 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView9, "tv_location_title_merchant_location");
                textView9.setVisibility(8);
                RecyclerView recyclerView9 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
                Intrinsics.checkNotNullExpressionValue(recyclerView9, "rv_location_list_merchant_location");
                recyclerView9.setVisibility(8);
                return;
            case 6:
                TextView textView10 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView10, "tv_location_title_merchant_location");
                textView10.setVisibility(0);
                RecyclerView recyclerView10 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
                Intrinsics.checkNotNullExpressionValue(recyclerView10, "rv_location_list_merchant_location");
                recyclerView10.setVisibility(0);
                LinearLayout linearLayout17 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getNonActionItems);
                Intrinsics.checkNotNullExpressionValue(linearLayout17, "ll_initial_search_state_merchant_location");
                linearLayout17.setVisibility(8);
                LinearLayout linearLayout18 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performItemAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout18, "ll_empty_result_merchant_location");
                linearLayout18.setVisibility(8);
                LinearLayout linearLayout19 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.startDispatchingItemsChanged);
                Intrinsics.checkNotNullExpressionValue(linearLayout19, "ll_initial_search_state_location");
                linearLayout19.setVisibility(8);
                LinearLayout linearLayout20 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performIdentifierAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout20, "ll_empty_result_location");
                linearLayout20.setVisibility(8);
                return;
            case 7:
                TextView textView11 = (TextView) _$_findCachedViewById(resetInternal.setMax.setContentInsetsRelative);
                Intrinsics.checkNotNullExpressionValue(textView11, "tv_merchant_title_merchant_location");
                textView11.setVisibility(8);
                RecyclerView recyclerView11 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
                Intrinsics.checkNotNullExpressionValue(recyclerView11, "rv_merchant_list_merchant_location");
                recyclerView11.setVisibility(8);
                return;
            case 8:
                TextView textView12 = (TextView) _$_findCachedViewById(resetInternal.setMax.setContentInsetsRelative);
                Intrinsics.checkNotNullExpressionValue(textView12, "tv_merchant_title_merchant_location");
                textView12.setVisibility(0);
                RecyclerView recyclerView12 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
                Intrinsics.checkNotNullExpressionValue(recyclerView12, "rv_merchant_list_merchant_location");
                recyclerView12.setVisibility(0);
                LinearLayout linearLayout21 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getNonActionItems);
                Intrinsics.checkNotNullExpressionValue(linearLayout21, "ll_initial_search_state_merchant_location");
                linearLayout21.setVisibility(8);
                LinearLayout linearLayout22 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performItemAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout22, "ll_empty_result_merchant_location");
                linearLayout22.setVisibility(8);
                LinearLayout linearLayout23 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.startDispatchingItemsChanged);
                Intrinsics.checkNotNullExpressionValue(linearLayout23, "ll_initial_search_state_location");
                linearLayout23.setVisibility(8);
                LinearLayout linearLayout24 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performIdentifierAction);
                Intrinsics.checkNotNullExpressionValue(linearLayout24, "ll_empty_result_location");
                linearLayout24.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        BaseResourcePackage.getMin getmin = new BaseResourcePackage.getMin((byte) 0);
        if (r4 != null) {
            getmin.getMin = r4;
            getmin.setMax = new NearbyMerchantLocationSearchModule(new getMin(this));
            getmin.getMax().getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            setTextColor.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = length2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void resetState() {
        setOnWheelViewListener.length((View) this);
        ((SearchView) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).clearSearchFocus();
        ((SearchView) _$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelativeWithIntrinsicBounds)).clearKeyword();
        setMin(State.INITIAL_MERCHANT_VIEW);
    }

    public static final /* synthetic */ void access$updateMerchantData(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView, List list) {
        RecyclerView recyclerView = (RecyclerView) nearbyMerchantLocationSearchView._$_findCachedViewById(resetInternal.setMax.getCompoundPaddingLeft);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof MerchantListAdapter) {
            adapter = adapter2;
        }
        MerchantListAdapter merchantListAdapter = (MerchantListAdapter) adapter;
        if (merchantListAdapter != null) {
            merchantListAdapter.getMin(list);
            if (nearbyMerchantLocationSearchView.setMin) {
                nearbyMerchantLocationSearchView.getMin(list.isEmpty() ? State.MERCHANT_EMPTY : State.MERCHANT_EXIST);
            } else {
                nearbyMerchantLocationSearchView.setMin(State.MERCHANT_EMPTY);
            }
        }
    }

    public static final /* synthetic */ void access$updateLocationData(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView, List list) {
        RecyclerView recyclerView = (RecyclerView) nearbyMerchantLocationSearchView._$_findCachedViewById(resetInternal.setMax.setSupportAllCaps);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof getHandlerClassName) {
            adapter = adapter2;
        }
        getHandlerClassName gethandlerclassname = (getHandlerClassName) adapter;
        if (gethandlerclassname != null) {
            gethandlerclassname.getMin(list);
            if (nearbyMerchantLocationSearchView.setMin) {
                nearbyMerchantLocationSearchView.getMin(list.isEmpty() ? State.LOCATION_EMPTY : State.LOCATION_EXIST);
            } else {
                nearbyMerchantLocationSearchView.setMin(list.isEmpty() ? State.EMPTY_LOCATION_VIEW : State.LOCATION_EXIST);
            }
        }
    }

    public static final /* synthetic */ String access$trackKeywordEvent(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView, String str) {
        t tVar = nearbyMerchantLocationSearchView.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        tVar.length(str, "");
        return str;
    }
}
