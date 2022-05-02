package id.dana.notificationcenter.views;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import id.dana.base.BaseWithToolbarFragment;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.NotificationCenterModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.lazada.LazadaGuideActivity;
import id.dana.model.ThirdPartyService;
import id.dana.notificationcenter.NotificationAdapter;
import id.dana.tracker.TrackerKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.BindView;
import o.ContactActivityResultPoint;
import o.ContactUtils;
import o.GriverManifest;
import o.Ignore;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.R;
import o.WebSocketResultEnum;
import o.WindowBridgeExtension;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getCarrierName;
import o.getDuration;
import o.getRunningAnimators;
import o.getShortName;
import o.parseContent;
import o.pickFromContactsList;
import o.projection;
import o.setCancelOnTouchOutside$core;
import o.setPhoneNumber;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NotificationCenterFragment extends BaseWithToolbarFragment implements getCarrierName.setMax {
    private NotificationAdapter IsOverlapping;
    @Inject
    public GriverManifest.AnonymousClass22.getMin checkoutH5EventPresenter;
    @Inject
    public getShortName dynamicUrlWrapper;
    private String equals;
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    /* access modifiers changed from: private */
    public boolean getMin;
    private boolean isInside = false;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public getCarrierName.length presenter;
    @BindView(2131364279)
    ProgressBar progressBar;
    @BindView(2131364163)
    RecyclerView rcNotifications;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @BindView(2131364354)
    SwipeRefreshLayout refreshNotification;
    @Inject
    public BindView.setMin restoreUrlPresenter;
    @Inject
    public R.id.getMax scanQrPresenter;
    private setCancelOnTouchOutside$core setMax;
    private WebSocketResultEnum setMin;
    private String toFloatRange;
    private String toIntRange;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final String APPEND = "0";
        public static final String PREPEND = "1";
    }

    public final int setMin() {
        return id.dana.R.layout.fragment_notification_center;
    }

    public static NotificationCenterFragment equals() {
        return new NotificationCenterFragment();
    }

    public void showProgress() {
        this.progressBar.setVisibility(0);
        this.refreshNotification.setVisibility(8);
    }

    public void dismissProgress() {
        this.refreshNotification.setRefreshing(false);
        this.progressBar.setVisibility(8);
        this.refreshNotification.setVisibility(0);
    }

    public void onError(String str) {
        dismissProgress();
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        String string = getResources().getString(id.dana.R.string.notification_center);
        if (this.toolbarTitle != null) {
            this.toolbarTitle.setText(string);
        }
        getMax(id.dana.R.drawable.btn_arrow_left);
        if (this.setMin == null) {
            parseContent.setMin setmin = new parseContent.setMin((byte) 0);
            if (this.getMax != null) {
                r3 = this.getMax.getApplicationComponent();
            } else {
                r3 = null;
            }
            if (r3 != null) {
                setmin.IsOverlapping = r3;
                setmin.setMax = new NotificationCenterModule(this);
                setmin.equals = new CheckoutH5EventModule(new ContactUtils(this));
                setmin.toFloatRange = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(getActivity()));
                setmin.isInside = new ServicesModule((style.getMin) new style.getMin() {
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
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = this.getMax;
                if (this.setMax == null) {
                    this.setMax = new setCancelOnTouchOutside$core() {
                        public final void onContainerCreated(Bundle bundle) {
                        }

                        public final void onContainerDestroyed(Bundle bundle) {
                            if (NotificationCenterFragment.this.checkoutH5EventPresenter != null) {
                                NotificationCenterFragment.this.checkoutH5EventPresenter.length();
                            }
                            if (NotificationCenterFragment.this.getMin) {
                                NotificationCenterFragment.this.playStoreReviewPresenter.length();
                            }
                        }
                    };
                }
                max.getMin = this.setMax;
                max.length = "Notification";
                setmin.getMax = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = this.getMax;
                if (this.setMax == null) {
                    this.setMax = new setCancelOnTouchOutside$core() {
                        public final void onContainerCreated(Bundle bundle) {
                        }

                        public final void onContainerDestroyed(Bundle bundle) {
                            if (NotificationCenterFragment.this.checkoutH5EventPresenter != null) {
                                NotificationCenterFragment.this.checkoutH5EventPresenter.length();
                            }
                            if (NotificationCenterFragment.this.getMin) {
                                NotificationCenterFragment.this.playStoreReviewPresenter.length();
                            }
                        }
                    };
                }
                max2.setMax = this.setMax;
                setmin.getMin = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = this.getMax;
                if (this.setMax == null) {
                    this.setMax = new setCancelOnTouchOutside$core() {
                        public final void onContainerCreated(Bundle bundle) {
                        }

                        public final void onContainerDestroyed(Bundle bundle) {
                            if (NotificationCenterFragment.this.checkoutH5EventPresenter != null) {
                                NotificationCenterFragment.this.checkoutH5EventPresenter.length();
                            }
                            if (NotificationCenterFragment.this.getMin) {
                                NotificationCenterFragment.this.playStoreReviewPresenter.length();
                            }
                        }
                    };
                }
                min.length = this.setMax;
                setmin.setMin = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length = FeatureModule.length();
                length.setMax = this.getMax;
                setmin.length = new FeatureModule(length, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = this.getMax;
                setmin.toIntRange = new OauthModule(min2, (byte) 0);
                stopIgnoring.setMin(setmin.setMax, NotificationCenterModule.class);
                stopIgnoring.setMin(setmin.getMax, DeepLinkModule.class);
                stopIgnoring.setMin(setmin.getMin, ScanQrModule.class);
                stopIgnoring.setMin(setmin.setMin, RestoreUrlModule.class);
                stopIgnoring.setMin(setmin.length, FeatureModule.class);
                stopIgnoring.setMin(setmin.toIntRange, OauthModule.class);
                if (setmin.isInside == null) {
                    setmin.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(setmin.toFloatRange, PlayStoreReviewModules.class);
                stopIgnoring.setMin(setmin.equals, CheckoutH5EventModule.class);
                stopIgnoring.setMin(setmin.IsOverlapping, PrepareException.AnonymousClass1.class);
                this.setMin = new parseContent(setmin.setMax, setmin.getMax, setmin.getMin, setmin.setMin, setmin.length, setmin.toIntRange, setmin.isInside, setmin.toFloatRange, setmin.equals, setmin.IsOverlapping, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMin.setMin(this);
        getMin(this.presenter, this.readDeepLinkPropertiesPresenter, this.scanQrPresenter, this.restoreUrlPresenter, this.featurePresenter);
        this.refreshNotification.setOnRefreshListener(new pickFromContactsList(this));
    }

    public final void IsOverlapping() {
        dismissProgress();
        this.IsOverlapping.getMin(Collections.emptyList());
        super.IsOverlapping();
    }

    public final void setMin(setPhoneNumber setphonenumber) {
        List<ContactActivityResultPoint> list;
        dismissProgress();
        this.isInside = true;
        if (setphonenumber != null && (list = setphonenumber.length) != null && !list.isEmpty()) {
            if ("1".equals(this.toIntRange)) {
                this.IsOverlapping.setMin(list);
            } else {
                this.IsOverlapping.length(list);
                this.IsOverlapping.getMin = setphonenumber.setMax();
            }
            this.equals = ((ContactActivityResultPoint) this.IsOverlapping.setMin(0)).getMax;
            this.toFloatRange = setphonenumber.getMin;
        }
    }

    public final void getMax() {
        dismissProgress();
        this.isInside = true;
    }

    public final void o_() {
        this.IsOverlapping = new NotificationAdapter(this.dynamicUrlWrapper);
        this.rcNotifications.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rcNotifications.setAdapter(this.IsOverlapping);
        this.IsOverlapping.getMax((Ignore.setMin) new projection(this.getMax) {
            public final void getMax(int i) {
                NotificationCenterFragment.setMax(NotificationCenterFragment.this, i);
            }
        });
        getCarrierName.length length = this.presenter;
        if (length != null) {
            length.getMin(10, (String) null, (String) null);
            this.toIntRange = "0";
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getContext().getApplicationContext());
        length2.getMax = TrackerKey.Event.NOTIFICATION_INBOX_OPEN;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        super.o_();
    }

    private static boolean getMax(ContactActivityResultPoint contactActivityResultPoint) {
        return "ipgRegistration".equals(contactActivityResultPoint.toIntRange) && "lazada".equals(contactActivityResultPoint.IsOverlapping);
    }

    public void onClickLeftMenuButton(View view) {
        this.getMax.onBackPressed();
    }

    static /* synthetic */ void setMax(NotificationCenterFragment notificationCenterFragment, int i) {
        ContactActivityResultPoint contactActivityResultPoint;
        int itemViewType = notificationCenterFragment.IsOverlapping.getItemViewType(i);
        if (itemViewType == 2) {
            if (notificationCenterFragment.isInside) {
                notificationCenterFragment.isInside = false;
                notificationCenterFragment.presenter.getMin(10, notificationCenterFragment.toFloatRange, (String) null);
                notificationCenterFragment.toIntRange = "0";
            }
            notificationCenterFragment.r_();
        } else if (itemViewType == 1 && !WindowBridgeExtension.AnonymousClass1.getMin() && (contactActivityResultPoint = (ContactActivityResultPoint) notificationCenterFragment.IsOverlapping.setMin(i)) != null) {
            contactActivityResultPoint.toFloatRange = notificationCenterFragment.dynamicUrlWrapper;
            convertDipToPx.length length = new convertDipToPx.length(notificationCenterFragment.getContext().getApplicationContext());
            length.getMax = TrackerKey.Event.NOTIFICATION_INBOX_READ;
            convertDipToPx.length max = length.setMax(TrackerKey.NotificationInboxProperty.NOTIFICATION_ID, contactActivityResultPoint.getMax).setMax(TrackerKey.NotificationInboxProperty.REDIRECT_TYPE, contactActivityResultPoint.toIntRange).setMax(TrackerKey.NotificationInboxProperty.REDIRECT_VALUE, contactActivityResultPoint.getMax()).setMax(TrackerKey.NotificationInboxProperty.ICON_URL, contactActivityResultPoint.setMax);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            if (!contactActivityResultPoint.getMin()) {
                contactActivityResultPoint.setMin = true;
                notificationCenterFragment.presenter.getMin(contactActivityResultPoint.getMax, contactActivityResultPoint.getMax());
            }
            if (getMax(contactActivityResultPoint)) {
                notificationCenterFragment.getMax.onBackPressed();
                notificationCenterFragment.getMax.startActivity(LazadaGuideActivity.createIntent(notificationCenterFragment.getMax));
                return;
            }
            notificationCenterFragment.IsOverlapping.notifyItemChanged(i);
            String max2 = contactActivityResultPoint.getMax();
            if (max2.trim().contains("https://link.dana.id/")) {
                notificationCenterFragment.readDeepLinkPropertiesPresenter.setMax(max2);
                return;
            }
            if (notificationCenterFragment.setMax == null) {
                notificationCenterFragment.setMax = new setCancelOnTouchOutside$core() {
                    public final void onContainerCreated(Bundle bundle) {
                    }

                    public final void onContainerDestroyed(Bundle bundle) {
                        if (NotificationCenterFragment.this.checkoutH5EventPresenter != null) {
                            NotificationCenterFragment.this.checkoutH5EventPresenter.length();
                        }
                        if (NotificationCenterFragment.this.getMin) {
                            NotificationCenterFragment.this.playStoreReviewPresenter.length();
                        }
                    }
                };
            }
            DanaH5.startContainerFullUrl(max2, notificationCenterFragment.setMax);
            notificationCenterFragment.checkoutH5EventPresenter.getMin();
            notificationCenterFragment.getMin = false;
        }
    }

    public static /* synthetic */ void length(NotificationCenterFragment notificationCenterFragment) {
        notificationCenterFragment.presenter.getMin(100, (String) null, notificationCenterFragment.equals);
        notificationCenterFragment.toIntRange = "1";
    }
}
