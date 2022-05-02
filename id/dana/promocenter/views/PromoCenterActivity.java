package id.dana.promocenter.views;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PromoCenterModule;
import id.dana.model.ThirdPartyService;
import id.dana.promocenter.adapter.RegularPromoAdapter;
import id.dana.promocenter.model.PromoSectionModel;
import id.dana.promocenter.views.PromoCenterActivity;
import id.dana.promocenter.views.PromoView;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.category.model.CategoryModel;
import id.dana.richview.promocenter.PromoCategoryView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import io.reactivex.internal.util.NotificationLite;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.DownloadFileHandle;
import o.GriverDataCacheExtension;
import o.GriverH5Manifest;
import o.GriverProgressBar;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.NormalResourcePackage;
import o.PrepareException;
import o.RedDotManager;
import o.WheelView;
import o.ZoomRecyclerView;
import o.access$902;
import o.convertDipToPx;
import o.dispatchOnCancelled;
import o.execute;
import o.genTextSelector;
import o.getDuration;
import o.isLayoutRtlSupport;
import o.isShowMenu;
import o.onAnimationUpdate;
import o.onCancelLoad;
import o.onCanceled;
import o.onScaleEnd;
import o.stopIgnoring;
import o.style;
import o.toJSONBytes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PromoCenterActivity extends BaseActivity implements execute.setMax {
    private static String getMax = "sponsored";
    private static String setMax = "regular";
    private PromoSectionModel FastBitmap$CoordinateSystem;
    private onAnimationUpdate Grayscale$Algorithm;
    private toJSONBytes IsOverlapping;
    @BindView(2131362145)
    Button btnTryAgain;
    /* access modifiers changed from: private */
    public boolean equals = true;
    /* access modifiers changed from: private */
    public CategoryModel getMin = null;
    private LinearLayoutManager hashCode;
    private GriverProgressBar.UpdateRunnable invoke;
    private boolean isInside = true;
    @BindView(2131363432)
    ImageView ivErrorPromoCenter;
    @BindView(2131363907)
    LinearLayout llPromoErrorButton;
    @BindView(2131363908)
    LinearLayout llPromoErrorImage;
    @BindView(2131364241)
    PromoCenterBottomMenuView pcbView;
    @BindView(2131364243)
    PromoCategoryView pcvPromoCenter;
    @Inject
    public execute.getMin promoCenterPresenter;
    ZoomRecyclerView.AnonymousClass2 promoSpecialAdsAdapter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    RegularPromoAdapter regularPromoAdapter;
    @BindView(2131364559)
    RecyclerView rvPromoCenter;
    private access$902 toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange;
    private GriverProgressBar.UpdateRunnable toString;
    @BindView(2131365236)
    TextView tvErrorDescription;
    @BindView(2131365241)
    TextView tvErrorTitle;
    private PromoSectionModel values;

    static /* synthetic */ int access$000(int i) {
        if (i < 4) {
            return 4;
        }
        return i - 4;
    }

    public void dismissProgress() {
    }

    public int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_promo_center;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(1382625865, oncanceled);
        onCancelLoad.getMin(1382625865, oncanceled);
        return R.layout.activity_promo_center;
    }

    public void onError(String str) {
    }

    public void showProgress() {
    }

    public void configToolbar() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2134432939 == (max = dispatchOnCancelled.getMax(applicationContext, -2134432939)))) {
            onCanceled oncanceled = new onCanceled(-2134432939, max, 512);
            onCancelLoad.setMax(-2134432939, oncanceled);
            onCancelLoad.getMin(-2134432939, oncanceled);
        }
        setCenterTitle(getString(R.string.promo));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public void onResume() {
        super.onResume();
        if (this.IsOverlapping != null) {
            setMin();
        }
    }

    private void setMin() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1545144690, oncanceled);
            onCancelLoad.getMin(1545144690, oncanceled);
        }
        if (!WheelView.ScrollerTask.getMax(this) || !WheelView.ScrollerTask.length(this)) {
            this.promoCenterPresenter.length();
        } else {
            setMax();
        }
    }

    /* access modifiers changed from: private */
    public boolean getMax(Rect rect, int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-1519537523, oncanceled);
            onCancelLoad.getMin(-1519537523, oncanceled);
        }
        if (this.hashCode.getChildAt(i) != null) {
            return this.hashCode.getChildAt(i).getLocalVisibleRect(rect);
        }
        return false;
    }

    private void getMin(String str, HashMap<String, String> hashMap) {
        if (str.contains("https://link.dana.id/")) {
            this.readLinkPropertiesPresenter.setMax(str);
        } else {
            DanaH5.startContainerFullUrl(isShowMenu.length(isShowMenu.getMax(str, (Map<String, String>) hashMap), TopupSource.PROMOTION_CENTER));
        }
    }

    private boolean length(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-688664082, oncanceled);
            onCancelLoad.getMin(-688664082, oncanceled);
        }
        return getMax(str) && getMin() && length() && WheelView.ScrollerTask.length(this);
    }

    private static boolean getMax(String str) {
        return !TextUtils.isEmpty(str) && str.toUpperCase().contains("NEAREST_LOCATION".toUpperCase());
    }

    private boolean getMin() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-286191384, oncanceled);
            onCancelLoad.getMin(-286191384, oncanceled);
        }
        CategoryModel categoryModel = this.getMin;
        boolean z = false;
        if (!(categoryModel == null || categoryModel.length == null)) {
            List<isLayoutRtlSupport> list = this.getMin.length;
            int i = 0;
            while (!z && i < list.size()) {
                z = "NEAREST_LOCATION".equals(list.get(i).setMin);
                i++;
            }
        }
        return z;
    }

    private boolean length() {
        return WheelView.ScrollerTask.getMax(this);
    }

    public void onSuccessGetPromoList(onScaleEnd onscaleend) {
        hideErrorScreen();
        this.regularPromoAdapter.getMin(onscaleend.getMin);
        PromoSectionModel promoSectionModel = this.values;
        PromoSectionModel.State state = PromoSectionModel.State.STATE_HIDE_LOADING;
        Intrinsics.checkNotNullParameter(state, "state");
        promoSectionModel.getMax.onNext(state);
        this.equals = false;
        this.toFloatRange = onscaleend.setMax();
    }

    public void onSuccessLoadMorePromo(onScaleEnd onscaleend) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(378588312, oncanceled);
            onCancelLoad.getMin(378588312, oncanceled);
        }
        this.regularPromoAdapter.getMin(false);
        RegularPromoAdapter regularPromoAdapter2 = this.regularPromoAdapter;
        regularPromoAdapter2.setMax(regularPromoAdapter2.getItemCount(), onscaleend.getMin);
        this.toFloatRange = onscaleend.setMax();
        this.toIntRange = false;
    }

    public void onErrorLoadMorePromo(boolean z) {
        this.toFloatRange = z;
        this.regularPromoAdapter.getMin(false);
        this.toIntRange = false;
    }

    public void onEmptyGetPromoList() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1421166287, oncanceled);
            onCancelLoad.getMin(-1421166287, oncanceled);
        }
        this.regularPromoAdapter.getMin();
        getMax();
        initOnEmptyView(getString(R.string.promo_empty_title), getString(R.string.promo_empty_description));
        showErrorScreen(false);
    }

    public void onErrorGetPromo() {
        this.regularPromoAdapter.getMin();
        initOnErrorView();
        showErrorScreen(true);
    }

    public void onErrorGetPromoCategorized() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1331551109, oncanceled);
            onCancelLoad.getMin(-1331551109, oncanceled);
        }
        this.regularPromoAdapter.getMin();
        showErrorScreenWithoutButton();
    }

    public void showErrorScreenWithoutButton() {
        dismissProgress();
        this.llPromoErrorImage.setVisibility(0);
        this.llPromoErrorButton.setVisibility(8);
    }

    public void onEmptyGetPromoCategorized() {
        this.regularPromoAdapter.getMin();
        initOnEmptyView(getString(R.string.promo_category_empty_title), getString(R.string.promo_category_empty_description));
        showErrorScreenWithoutButton();
    }

    public void onGetPromoAdsSuccess(List<DownloadFileHandle> list) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 497391606 == (max = dispatchOnCancelled.getMax(applicationContext, 497391606)))) {
            onCanceled oncanceled = new onCanceled(497391606, max, 512);
            onCancelLoad.setMax(497391606, oncanceled);
            onCancelLoad.getMin(497391606, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(497391606, oncanceled2);
            onCancelLoad.getMin(497391606, oncanceled2);
        }
        if (list.isEmpty()) {
            getMax();
            return;
        }
        PromoSectionModel promoSectionModel = this.FastBitmap$CoordinateSystem;
        PromoSectionModel.State state = PromoSectionModel.State.STATE_SHOW;
        Intrinsics.checkNotNullParameter(state, "state");
        promoSectionModel.getMax.onNext(state);
        this.promoSpecialAdsAdapter.getMin(list);
    }

    public void onGetPromoAdsError() {
        getMax();
    }

    public void onAllPromoSectionsCompleted() {
        Object obj;
        String str = this.getMin.getMin;
        List<DownloadFileHandle> max = this.regularPromoAdapter.getMax();
        Object obj2 = this.FastBitmap$CoordinateSystem.getMax.getMax.get();
        if (NotificationLite.isComplete(obj2) || NotificationLite.isError(obj2)) {
            obj = null;
        } else {
            obj = NotificationLite.getValue(obj2);
        }
        boolean z = ((PromoSectionModel.State) obj) == PromoSectionModel.State.STATE_SHOW;
        ArrayList arrayList = new ArrayList();
        for (DownloadFileHandle downloadFileHandle : max) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(downloadFileHandle.getMax);
            sb.append("\"");
            arrayList.add(sb.toString());
        }
        convertDipToPx.length length = new convertDipToPx.length(getApplicationContext());
        length.getMax = TrackerKey.Event.PROMOTION_CENTER_OPEN;
        convertDipToPx.length max2 = length.setMin(TrackerKey.PromotionProperty.MERCHANT_SPECIAL_SHOW, z).setMax(TrackerKey.PromotionProperty.PROMOTION_LIST, TextUtils.join(",", arrayList)).setMax(TrackerKey.PromotionProperty.CATEGORY_NAME, str);
        max2.setMin();
        genTextSelector.getMax(new convertDipToPx(max2, (byte) 0));
    }

    public void initOnErrorView() {
        Glide.setMin((FragmentActivity) this).setMin(Integer.valueOf(R.drawable.ic_no_connection)).length(this.ivErrorPromoCenter);
        getMax();
        this.tvErrorTitle.setText(getString(R.string.error_promo_title));
        this.tvErrorDescription.setText(getString(R.string.error_promo_description));
    }

    private void getMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(633403097, oncanceled);
            onCancelLoad.getMin(633403097, oncanceled);
        }
        PromoSectionModel promoSectionModel = this.FastBitmap$CoordinateSystem;
        PromoSectionModel.State state = PromoSectionModel.State.STATE_HIDDEN;
        Intrinsics.checkNotNullParameter(state, "state");
        promoSectionModel.getMax.onNext(state);
    }

    public void initOnEmptyView(String str, String str2) {
        Glide.setMin((FragmentActivity) this).setMin(Integer.valueOf(R.drawable.feeds_empty)).length(this.ivErrorPromoCenter);
        this.tvErrorTitle.setText(str);
        this.tvErrorDescription.setText(str2);
    }

    public void showErrorScreen(boolean z) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1479414757 == (max = dispatchOnCancelled.getMax(applicationContext, -1479414757)))) {
            onCanceled oncanceled = new onCanceled(-1479414757, max, 512);
            onCancelLoad.setMax(-1479414757, oncanceled);
            onCancelLoad.getMin(-1479414757, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-613806964, oncanceled2);
            onCancelLoad.getMin(-613806964, oncanceled2);
        }
        this.pcbView.hideMenu();
        this.btnTryAgain.setVisibility(z ? 0 : 8);
        dismissProgress();
        this.llPromoErrorImage.setVisibility(0);
        this.llPromoErrorButton.setVisibility(0);
    }

    public void hideErrorScreen() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1203457607, oncanceled);
            onCancelLoad.getMin(1203457607, oncanceled);
        }
        this.pcbView.showMenu();
        this.llPromoErrorImage.setVisibility(8);
        this.llPromoErrorButton.setVisibility(8);
    }

    private void toIntRange() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1130634495, oncanceled);
            onCancelLoad.getMin(-1130634495, oncanceled);
        }
        this.equals = true;
        hideErrorScreen();
    }

    private boolean isInside() {
        return getIntent().hasExtra("categoryId");
    }

    @OnClick({2131362145})
    public void onClickTryAgain() {
        hideErrorScreen();
        if (this.isInside) {
            equals();
        } else {
            IsOverlapping();
        }
        if (this.pcvPromoCenter.isHidden()) {
            this.pcvPromoCenter.show();
            this.pcvPromoCenter.retryGetCategories();
            return;
        }
        loadPromo();
    }

    private void equals() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1019529638, oncanceled);
            onCancelLoad.getMin(1019529638, oncanceled);
        }
        toFloatRange();
        IsOverlapping();
    }

    private void IsOverlapping() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1650585081, oncanceled);
            onCancelLoad.getMin(-1650585081, oncanceled);
        }
        PromoSectionModel promoSectionModel = this.values;
        PromoSectionModel.State state = PromoSectionModel.State.STATE_SHOW_LOADING;
        Intrinsics.checkNotNullParameter(state, "state");
        promoSectionModel.getMax.onNext(state);
        this.Grayscale$Algorithm.notifyDataSetChanged();
    }

    public void loadPromo() {
        if ("promocenter_category_all".equals(this.pcvPromoCenter.getSelectedCategoryId())) {
            this.promoCenterPresenter.setMin(false);
        } else {
            this.promoCenterPresenter.setMin(false, this.pcvPromoCenter.getSelectedCategoryId());
        }
    }

    private void toFloatRange() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1259274240, oncanceled);
            onCancelLoad.getMin(-1259274240, oncanceled);
        }
        PromoSectionModel promoSectionModel = this.FastBitmap$CoordinateSystem;
        PromoSectionModel.State state = PromoSectionModel.State.STATE_SHOW_LOADING;
        Intrinsics.checkNotNullParameter(state, "state");
        promoSectionModel.getMax.onNext(state);
        this.toDoubleRange.notifyDataSetChanged();
    }

    @OnClick({2131362084})
    public void onClickHome() {
        finish();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.pcbView.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void init() {
        int length;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1988286134, oncanceled);
            onCancelLoad.getMin(-1988286134, oncanceled);
        }
        Context context = null;
        if (this.IsOverlapping == null) {
            NormalResourcePackage.setMax setmax = new NormalResourcePackage.setMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                setmax.isInside = applicationComponent;
                setmax.getMin = new PromoCenterModule(this);
                setmax.toFloatRange = new ServicesModule((style.getMin) new style.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        Intrinsics.checkNotNullParameter(str, "authCode");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void getMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void length() {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    @JvmDefault
                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin() {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
                max2.getMax = this;
                max2.length = TrackerKey.SourceType.PROMOTION;
                setmax.getMax = new DeepLinkModule(max2, (byte) 0);
                ScanQrModule.setMin max3 = ScanQrModule.getMax();
                max3.setMin = this;
                setmax.length = new ScanQrModule(max3, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = this;
                setmax.setMin = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = this;
                setmax.setMax = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = this;
                setmax.IsOverlapping = new OauthModule(min2, (byte) 0);
                stopIgnoring.setMin(setmax.getMin, PromoCenterModule.class);
                stopIgnoring.setMin(setmax.getMax, DeepLinkModule.class);
                stopIgnoring.setMin(setmax.length, ScanQrModule.class);
                stopIgnoring.setMin(setmax.setMin, RestoreUrlModule.class);
                stopIgnoring.setMin(setmax.setMax, FeatureModule.class);
                stopIgnoring.setMin(setmax.IsOverlapping, OauthModule.class);
                if (setmax.toFloatRange == null) {
                    setmax.toFloatRange = new ServicesModule();
                }
                stopIgnoring.setMin(setmax.isInside, PrepareException.AnonymousClass1.class);
                this.IsOverlapping = new NormalResourcePackage(setmax.getMin, setmax.getMax, setmax.length, setmax.setMin, setmax.setMax, setmax.IsOverlapping, setmax.toFloatRange, setmax.isInside, (byte) 0);
            } else {
                throw null;
            }
        }
        this.IsOverlapping.length(this);
        registerPresenter(this.readLinkPropertiesPresenter, this.promoCenterPresenter);
        Context baseContext = getBaseContext();
        if (baseContext != null) {
            context = baseContext.getApplicationContext();
        }
        if (!(context == null || (length = dispatchOnCancelled.length(context, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-451851918, oncanceled2);
            onCancelLoad.getMin(-451851918, oncanceled2);
        }
        RegularPromoAdapter regularPromoAdapter2 = new RegularPromoAdapter();
        this.regularPromoAdapter = regularPromoAdapter2;
        regularPromoAdapter2.setMin = new PromoView.setMax(this) {
            private final PromoCenterActivity getMin;

            {
                this.getMin = r1;
            }

            public final void getMax(DownloadFileHandle downloadFileHandle, String str) {
                PromoCenterActivity.setMax(this.getMin, downloadFileHandle, str);
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        this.hashCode = linearLayoutManager;
        this.values = new PromoSectionModel(this.regularPromoAdapter, linearLayoutManager);
        this.Grayscale$Algorithm = new onAnimationUpdate(this.values);
        ZoomRecyclerView.AnonymousClass2 r2 = new IMultiInstanceInvalidationCallback.Stub<Ignore<DownloadFileHandle>, DownloadFileHandle>(this) {
            private final Context setMin;

            {
                Intrinsics.checkNotNullParameter(r2, HummerConstants.CONTEXT);
                this.setMin = r2;
            }

            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new getContentType(this.setMin, viewGroup);
            }
        };
        this.promoSpecialAdsAdapter = r2;
        r2.getMax((Ignore.setMin) new GriverH5Manifest(this));
        this.FastBitmap$CoordinateSystem = new PromoSectionModel(this.promoSpecialAdsAdapter, new LinearLayoutManager(this, 0, false));
        this.toDoubleRange = new access$902(this.FastBitmap$CoordinateSystem);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, 1, false);
        ConcatAdapter concatAdapter = new ConcatAdapter(this.toDoubleRange, this.Grayscale$Algorithm);
        this.rvPromoCenter.setLayoutManager(linearLayoutManager2);
        this.rvPromoCenter.setAdapter(concatAdapter);
        this.pcvPromoCenter.setListener(new GriverDataCacheExtension(this));
        this.pcvPromoCenter.setOnGetCategoriesListener(new PromoCategoryView.setMin() {
            public final void length(CategoryModel categoryModel) {
                CategoryModel unused = PromoCenterActivity.this.getMin = categoryModel;
                PromoCenterActivity.this.pcbView.setOnCategoryChange(categoryModel);
                PromoCenterActivity.this.pcbView.setDefault();
                PromoCenterActivity.access$700(PromoCenterActivity.this);
                PromoCenterActivity.this.loadPromo();
            }

            public final void setMax() {
                PromoCenterActivity.this.showErrorScreen(true);
            }
        });
        final Rect rect = new Rect();
        this.rvPromoCenter.getHitRect(rect);
        this.rvPromoCenter.addOnScrollListener(new RecyclerView.toIntRange() {
            public final void onScrolled(@NotNull @NonNull RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (PromoCenterActivity.this.getMax(rect, PromoCenterActivity.access$000(PromoCenterActivity.this.regularPromoAdapter.getItemCount())) && PromoCenterActivity.this.toFloatRange && !PromoCenterActivity.this.equals && !PromoCenterActivity.this.toIntRange) {
                    PromoCenterActivity.access$500(PromoCenterActivity.this);
                }
            }
        });
        this.pcbView.setOnSubmitSortClicked(new Function2(this) {
            private final PromoCenterActivity length;

            {
                this.length = r1;
            }

            public final Object invoke(Object obj, Object obj2) {
                return PromoCenterActivity.getMax(this.length, (String) obj, (Boolean) obj2);
            }
        });
        this.pcbView.setOnSubmitFilterClicked(new Function2(this) {
            private final PromoCenterActivity getMax;

            {
                this.getMax = r1;
            }

            public final Object invoke(Object obj, Object obj2) {
                return PromoCenterActivity.setMax(this.getMax, (String) obj, (Boolean) obj2);
            }
        });
    }

    private void setMax() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.invoke;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            this.invoke = null;
        }
        GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(this).getMin().subscribe(new RedDotManager(this) {
            private final PromoCenterActivity setMin;

            {
                this.setMin = r1;
            }

            public final void accept(Object obj) {
                PromoCenterActivity.getMin(this.setMin, (Location) obj);
            }
        });
        this.invoke = subscribe;
        addDisposable(subscribe);
    }

    static /* synthetic */ void access$500(PromoCenterActivity promoCenterActivity) {
        promoCenterActivity.toIntRange = true;
        promoCenterActivity.regularPromoAdapter.getMin(true);
        if ("promocenter_category_all".equals(promoCenterActivity.pcvPromoCenter.getSelectedCategoryId())) {
            promoCenterActivity.promoCenterPresenter.setMin(true);
        } else {
            promoCenterActivity.promoCenterPresenter.setMin(true, promoCenterActivity.pcvPromoCenter.getSelectedCategoryId());
        }
    }

    static /* synthetic */ void access$700(PromoCenterActivity promoCenterActivity) {
        if (promoCenterActivity.isInside()) {
            promoCenterActivity.pcvPromoCenter.setCategory(promoCenterActivity.getIntent().getStringExtra("categoryId"));
            if (promoCenterActivity.pcvPromoCenter.getCategoryFromExtra() != null) {
                promoCenterActivity.pcbView.setOnCategoryChange(promoCenterActivity.pcvPromoCenter.getCategoryFromExtra());
            }
        }
    }

    public static /* synthetic */ void length(PromoCenterActivity promoCenterActivity, String str, boolean z, Location location) {
        promoCenterActivity.promoCenterPresenter.getMax(str, z, location);
        promoCenterActivity.dispose();
    }

    public static /* synthetic */ void setMax(PromoCenterActivity promoCenterActivity, DownloadFileHandle downloadFileHandle, String str) {
        if (!TextUtils.isEmpty(str)) {
            convertDipToPx.length max = new convertDipToPx.length(promoCenterActivity.getBaseContext().getApplicationContext()).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_ID, downloadFileHandle.length).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_TYPE, "").setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_NAME, downloadFileHandle.getMax);
            Date date = new Date(downloadFileHandle.setMin);
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            convertDipToPx.length max2 = max.setMax(TrackerKey.PromotionProperty.PROMOTION_EXPIRY_DATE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", WheelView.OnWheelViewListener.getMax).format(date)).setMax(TrackerKey.PromotionProperty.PROMOTION_SPACE_CODE, promoCenterActivity.pcvPromoCenter.getSelectedCategoryId());
            max2.getMax = TrackerKey.Event.PROMOTION_BANNER_OPEN;
            max2.setMin();
            boolean z = false;
            genTextSelector.getMax(new convertDipToPx(max2, (byte) 0));
            if (downloadFileHandle.equals <= 10 && downloadFileHandle.equals >= 0) {
                z = true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(UrlTag.DETAIL_SOURCE, setMax);
            hashMap.put(UrlTag.ENTRY_POINT, TopupSource.PROMOTION_CENTER);
            hashMap.put(UrlTag.HOT_PROMO, Boolean.toString(z));
            promoCenterActivity.getMin(str, (HashMap<String, String>) hashMap);
        }
    }

    public static /* synthetic */ Unit setMax(PromoCenterActivity promoCenterActivity, String str, Boolean bool) {
        promoCenterActivity.toIntRange();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        boolean booleanValue = bool.booleanValue();
        if (promoCenterActivity.length(str)) {
            promoCenterActivity.IsOverlapping();
            GriverProgressBar.UpdateRunnable updateRunnable = promoCenterActivity.toString;
            if (updateRunnable != null) {
                updateRunnable.dispose();
                promoCenterActivity.toString = null;
            }
            GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(promoCenterActivity).getMin().subscribe(new RedDotManager(promoCenterActivity, str, booleanValue) {
                private final boolean getMax;
                private final String getMin;
                private final PromoCenterActivity length;

                {
                    this.length = r1;
                    this.getMin = r2;
                    this.getMax = r3;
                }

                public final void accept(Object obj) {
                    PromoCenterActivity.length(this.length, this.getMin, this.getMax, (Location) obj);
                }
            });
            promoCenterActivity.toString = subscribe;
            promoCenterActivity.addDisposable(subscribe);
        } else {
            promoCenterActivity.promoCenterPresenter.getMax(str, booleanValue, (Location) null);
        }
        return null;
    }

    public static /* synthetic */ void getMax(PromoCenterActivity promoCenterActivity, int i) {
        int length;
        int min;
        Context baseContext = promoCenterActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1495014030, oncanceled);
            onCancelLoad.getMin(-1495014030, oncanceled);
        }
        DownloadFileHandle downloadFileHandle = (DownloadFileHandle) promoCenterActivity.promoSpecialAdsAdapter.setMin(i);
        String str = ((ZoomRecyclerView.ScaleListener) (downloadFileHandle.setMax == null ? new ArrayList() : downloadFileHandle.setMax).get(0)).getMax;
        HashMap hashMap = new HashMap();
        hashMap.put(UrlTag.DETAIL_SOURCE, getMax);
        hashMap.put(UrlTag.ENTRY_POINT, TopupSource.PROMOTION_CENTER);
        promoCenterActivity.getMin(str, (HashMap<String, String>) hashMap);
    }

    public static /* synthetic */ void getMin(PromoCenterActivity promoCenterActivity, Location location) {
        promoCenterActivity.promoCenterPresenter.getMin(location);
        GriverProgressBar.UpdateRunnable updateRunnable = promoCenterActivity.invoke;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            promoCenterActivity.invoke = null;
        }
    }

    public static /* synthetic */ Unit getMax(PromoCenterActivity promoCenterActivity, String str, Boolean bool) {
        promoCenterActivity.toIntRange();
        execute.getMin getmin = promoCenterActivity.promoCenterPresenter;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        getmin.setMax(str, bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void getMax(PromoCenterActivity promoCenterActivity, CategoryModel categoryModel, boolean z) {
        promoCenterActivity.getMin = categoryModel;
        GriverProgressBar.UpdateRunnable updateRunnable = promoCenterActivity.toString;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            promoCenterActivity.toString = null;
        }
        promoCenterActivity.promoCenterPresenter.setMax((String) null, false);
        promoCenterActivity.promoCenterPresenter.getMax((String) null, false, (Location) null);
        promoCenterActivity.toIntRange();
        promoCenterActivity.pcbView.setDefault();
        promoCenterActivity.pcbView.setOnCategoryChange(categoryModel);
        promoCenterActivity.isInside = z;
        if (z) {
            promoCenterActivity.promoSpecialAdsAdapter.getMin();
            promoCenterActivity.equals();
            promoCenterActivity.loadPromo();
            promoCenterActivity.setMin();
            return;
        }
        promoCenterActivity.getMax();
        promoCenterActivity.promoCenterPresenter.setMin(false, categoryModel.setMin);
    }
}
