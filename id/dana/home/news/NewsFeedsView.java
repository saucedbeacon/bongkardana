package id.dana.home.news;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.feeds.GlobalFeedsModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.OauthModule;
import id.dana.model.ThirdPartyService;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.BLEBridgeExtension;
import o.BindView;
import o.Ignore;
import o.PrepareException;
import o.R;
import o.RVWebSocketManager;
import o.connectBLEDevice;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getDuration;
import o.getRunningAnimators;
import o.isShowMenu;
import o.onProcess;
import o.onVerifyError;
import o.projection;
import o.setTrimPathOffset;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;

public class NewsFeedsView extends BaseRichView {
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    private RVWebSocketManager.Holder getMax;
    /* access modifiers changed from: private */
    public String length;
    @BindView(2131364152)
    RecyclerView newsList;
    @Inject
    public setTrimPathOffset.setMax presenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public BindView.setMin restoreUrlPresenter;
    @Inject
    public R.id.getMax scanQrPresenter;
    private List<onProcess> setMax;
    private connectBLEDevice setMin;

    public int getLayout() {
        return id.dana.R.layout.view_news_feeds;
    }

    public int getPageSize() {
        return 5;
    }

    public NewsFeedsView(@NonNull Context context) {
        super(context);
    }

    public NewsFeedsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewsFeedsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NewsFeedsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r14) {
        if (this.getMax == null) {
            onVerifyError.setMin setmin = new onVerifyError.setMin((byte) 0);
            if (r14 != null) {
                setmin.toIntRange = r14;
                setmin.setMin = new GlobalFeedsModule(new setTrimPathOffset.setMin() {
                    public final void dismissProgress() {
                    }

                    public final void showProgress() {
                    }

                    public final void length(BLEBridgeExtension.AnonymousClass10 r3) {
                        NewsFeedsView.this.getMin(r3, false);
                        NewsFeedsView.this.enableClick();
                    }

                    public final void onError(String str) {
                        NewsFeedsView.this.enableClick();
                    }

                    public final void setMax(BLEBridgeExtension.AnonymousClass10 r2, Boolean bool) {
                        if (r2.setMax.isEmpty() || r2.setMax == null) {
                            NewsFeedsView.this.presenter.getMax(5, (String) null);
                            return;
                        }
                        NewsFeedsView.this.getMin(r2, bool.booleanValue());
                        NewsFeedsView.this.enableClick();
                    }
                });
                setmin.toFloatRange = new ServicesModule((style.getMin) new style.getMin() {
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
                    public final void onError(@org.jetbrains.annotations.Nullable String str) {
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
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = getBaseActivity();
                max.length = TrackerKey.SourceType.DANA_NEWS;
                setmin.getMax = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = getBaseActivity();
                setmin.getMin = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = getBaseActivity();
                setmin.length = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = getBaseActivity();
                setmin.setMax = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = getBaseActivity();
                setmin.IsOverlapping = new OauthModule(min2, (byte) 0);
                stopIgnoring.setMin(setmin.setMin, GlobalFeedsModule.class);
                stopIgnoring.setMin(setmin.getMax, DeepLinkModule.class);
                stopIgnoring.setMin(setmin.getMin, ScanQrModule.class);
                stopIgnoring.setMin(setmin.length, RestoreUrlModule.class);
                stopIgnoring.setMin(setmin.setMax, FeatureModule.class);
                stopIgnoring.setMin(setmin.IsOverlapping, OauthModule.class);
                if (setmin.toFloatRange == null) {
                    setmin.toFloatRange = new ServicesModule();
                }
                stopIgnoring.setMin(setmin.toIntRange, PrepareException.AnonymousClass1.class);
                this.getMax = new onVerifyError(setmin.setMin, setmin.getMax, setmin.getMin, setmin.length, setmin.setMax, setmin.IsOverlapping, setmin.toFloatRange, setmin.toIntRange, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.setMin(this);
        registerPresenter(this.presenter, this.readDeepLinkPropertiesPresenter, this.scanQrPresenter, this.restoreUrlPresenter, this.featurePresenter);
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.length(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public void getMin(BLEBridgeExtension.AnonymousClass10 r3, boolean z) {
        if (this.setMax == null) {
            this.setMax = new ArrayList();
        }
        if (r3.length() || z) {
            this.setMax.clear();
        }
        if (r3.setMax != null) {
            this.setMax.addAll(r3.setMax);
        }
        this.setMin.setMin = r3.setMax();
        connectBLEDevice connectbledevice = this.setMin;
        List<onProcess> list = this.setMax;
        connectbledevice.getMax().clear();
        connectbledevice.getMax().addAll(list);
        this.setMin.notifyDataSetChanged();
        this.length = r3.getMax;
    }

    public void updateNewsFeeds(BLEBridgeExtension.AnonymousClass10 r2) {
        getMin(r2, true);
    }

    public void refreshFeeds(int i, String str, Boolean bool) {
        this.presenter.length(Boolean.TRUE);
    }

    public void setup() {
        connectBLEDevice connectbledevice = new connectBLEDevice(new ArrayList());
        this.setMin = connectbledevice;
        connectbledevice.getMax((Ignore.setMin) new projection(getBaseActivity()) {
            public final void getMax(int i) {
                NewsFeedsView.access$400(NewsFeedsView.this, i);
            }
        });
        this.setMin.getMin = new connectBLEDevice.getMin() {
            public final void setMin() {
                if (NewsFeedsView.this.isRichViewClickable()) {
                    NewsFeedsView.this.disableClick();
                    NewsFeedsView.this.presenter.getMax(5, NewsFeedsView.this.length);
                }
            }

            public final void getMin(onProcess onprocess) {
                if (NewsFeedsView.this.isRichViewClickable() && NewsFeedsView.getMin(onprocess)) {
                    NewsFeedsView.this.disableClick();
                    NewsFeedsView.access$1100(NewsFeedsView.this, onprocess.toDoubleRange);
                    NewsFeedsView.access$1200(NewsFeedsView.this, onprocess.getMin);
                }
            }
        };
        this.newsList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.newsList.setNestedScrollingEnabled(false);
        this.newsList.setAdapter(this.setMin);
    }

    /* access modifiers changed from: private */
    public static boolean getMin(onProcess onprocess) {
        return onprocess != null && !TextUtils.isEmpty(onprocess.toDoubleRange);
    }

    private static boolean setMin(onProcess onprocess) {
        return onprocess != null && "FULL".equalsIgnoreCase(onprocess.toIntRange);
    }

    static /* synthetic */ void access$400(NewsFeedsView newsFeedsView, int i) {
        onProcess onprocess = (onProcess) newsFeedsView.setMin.setMin(i);
        if (setMin(onprocess)) {
            String str = onprocess.toDoubleRange;
            if (isShowMenu.length(str)) {
                newsFeedsView.readDeepLinkPropertiesPresenter.setMax(str);
            } else {
                DanaH5.startContainerFullUrl(str);
            }
        } else {
            newsFeedsView.enableClick();
        }
    }

    static /* synthetic */ void access$1100(NewsFeedsView newsFeedsView, String str) {
        if (isShowMenu.length(str)) {
            newsFeedsView.readDeepLinkPropertiesPresenter.setMax(str);
        } else {
            DanaH5.startContainerFullUrl(str);
        }
    }

    static /* synthetic */ void access$1200(NewsFeedsView newsFeedsView, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(newsFeedsView.getContext().getApplicationContext());
        length2.getMax = TrackerKey.Event.DANA_NEWS_OPEN;
        convertDipToPx.length max = length2.setMax(TrackerKey.NewsProperty.NEWS_TITLE, str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }
}
