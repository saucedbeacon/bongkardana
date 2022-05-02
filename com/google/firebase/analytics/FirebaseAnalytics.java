package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    /* access modifiers changed from: private */
    public final zzee zzb;
    private ExecutorService zzc;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public static class Event {
        @NonNull
        public static final String ADD_PAYMENT_INFO = "add_payment_info";
        @NonNull
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";
        @NonNull
        public static final String ADD_TO_CART = "add_to_cart";
        @NonNull
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";
        @NonNull
        public static final String AD_IMPRESSION = "ad_impression";
        @NonNull
        public static final String APP_OPEN = "app_open";
        @NonNull
        public static final String BEGIN_CHECKOUT = "begin_checkout";
        @NonNull
        public static final String CAMPAIGN_DETAILS = "campaign_details";
        @NonNull
        @Deprecated
        public static final String CHECKOUT_PROGRESS = "checkout_progress";
        @NonNull
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        @NonNull
        @Deprecated
        public static final String ECOMMERCE_PURCHASE = "ecommerce_purchase";
        @NonNull
        public static final String GENERATE_LEAD = "generate_lead";
        @NonNull
        public static final String JOIN_GROUP = "join_group";
        @NonNull
        public static final String LEVEL_END = "level_end";
        @NonNull
        public static final String LEVEL_START = "level_start";
        @NonNull
        public static final String LEVEL_UP = "level_up";
        @NonNull
        public static final String LOGIN = "login";
        @NonNull
        public static final String POST_SCORE = "post_score";
        @NonNull
        @Deprecated
        public static final String PRESENT_OFFER = "present_offer";
        @NonNull
        public static final String PURCHASE = "purchase";
        @NonNull
        @Deprecated
        public static final String PURCHASE_REFUND = "purchase_refund";
        @NonNull
        public static final String REFUND = "refund";
        @NonNull
        public static final String REMOVE_FROM_CART = "remove_from_cart";
        @NonNull
        public static final String SCREEN_VIEW = "screen_view";
        @NonNull
        public static final String SEARCH = "search";
        @NonNull
        public static final String SELECT_CONTENT = "select_content";
        @NonNull
        public static final String SELECT_ITEM = "select_item";
        @NonNull
        public static final String SELECT_PROMOTION = "select_promotion";
        @NonNull
        @Deprecated
        public static final String SET_CHECKOUT_OPTION = "set_checkout_option";
        @NonNull
        public static final String SHARE = "share";
        @NonNull
        public static final String SIGN_UP = "sign_up";
        @NonNull
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        @NonNull
        public static final String TUTORIAL_BEGIN = "tutorial_begin";
        @NonNull
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";
        @NonNull
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        @NonNull
        public static final String VIEW_CART = "view_cart";
        @NonNull
        public static final String VIEW_ITEM = "view_item";
        @NonNull
        public static final String VIEW_ITEM_LIST = "view_item_list";
        @NonNull
        public static final String VIEW_PROMOTION = "view_promotion";
        @NonNull
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";

        protected Event() {
        }
    }

    public static class Param {
        @NonNull
        public static final String ACHIEVEMENT_ID = "achievement_id";
        @NonNull
        public static final String ACLID = "aclid";
        @NonNull
        public static final String AD_FORMAT = "ad_format";
        @NonNull
        public static final String AD_PLATFORM = "ad_platform";
        @NonNull
        public static final String AD_SOURCE = "ad_source";
        @NonNull
        public static final String AD_UNIT_NAME = "ad_unit_name";
        @NonNull
        public static final String AFFILIATION = "affiliation";
        @NonNull
        public static final String CAMPAIGN = "campaign";
        @NonNull
        public static final String CHARACTER = "character";
        @NonNull
        @Deprecated
        public static final String CHECKOUT_OPTION = "checkout_option";
        @NonNull
        @Deprecated
        public static final String CHECKOUT_STEP = "checkout_step";
        @NonNull
        public static final String CONTENT = "content";
        @NonNull
        public static final String CONTENT_TYPE = "content_type";
        @NonNull
        public static final String COUPON = "coupon";
        @NonNull
        public static final String CP1 = "cp1";
        @NonNull
        public static final String CREATIVE_NAME = "creative_name";
        @NonNull
        public static final String CREATIVE_SLOT = "creative_slot";
        @NonNull
        public static final String CURRENCY = "currency";
        @NonNull
        public static final String DESTINATION = "destination";
        @NonNull
        public static final String DISCOUNT = "discount";
        @NonNull
        public static final String END_DATE = "end_date";
        @NonNull
        public static final String EXTEND_SESSION = "extend_session";
        @NonNull
        public static final String FLIGHT_NUMBER = "flight_number";
        @NonNull
        public static final String GROUP_ID = "group_id";
        @NonNull
        public static final String INDEX = "index";
        @NonNull
        public static final String ITEMS = "items";
        @NonNull
        public static final String ITEM_BRAND = "item_brand";
        @NonNull
        public static final String ITEM_CATEGORY = "item_category";
        @NonNull
        public static final String ITEM_CATEGORY2 = "item_category2";
        @NonNull
        public static final String ITEM_CATEGORY3 = "item_category3";
        @NonNull
        public static final String ITEM_CATEGORY4 = "item_category4";
        @NonNull
        public static final String ITEM_CATEGORY5 = "item_category5";
        @NonNull
        public static final String ITEM_ID = "item_id";
        @NonNull
        @Deprecated
        public static final String ITEM_LIST = "item_list";
        @NonNull
        public static final String ITEM_LIST_ID = "item_list_id";
        @NonNull
        public static final String ITEM_LIST_NAME = "item_list_name";
        @NonNull
        @Deprecated
        public static final String ITEM_LOCATION_ID = "item_location_id";
        @NonNull
        public static final String ITEM_NAME = "item_name";
        @NonNull
        public static final String ITEM_VARIANT = "item_variant";
        @NonNull
        public static final String LEVEL = "level";
        @NonNull
        public static final String LEVEL_NAME = "level_name";
        @NonNull
        public static final String LOCATION = "location";
        @NonNull
        public static final String LOCATION_ID = "location_id";
        @NonNull
        public static final String MEDIUM = "medium";
        @NonNull
        public static final String METHOD = "method";
        @NonNull
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";
        @NonNull
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
        @NonNull
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";
        @NonNull
        public static final String ORIGIN = "origin";
        @NonNull
        public static final String PAYMENT_TYPE = "payment_type";
        @NonNull
        public static final String PRICE = "price";
        @NonNull
        public static final String PROMOTION_ID = "promotion_id";
        @NonNull
        public static final String PROMOTION_NAME = "promotion_name";
        @NonNull
        public static final String QUANTITY = "quantity";
        @NonNull
        public static final String SCORE = "score";
        @NonNull
        public static final String SCREEN_CLASS = "screen_class";
        @NonNull
        public static final String SCREEN_NAME = "screen_name";
        @NonNull
        public static final String SEARCH_TERM = "search_term";
        @NonNull
        public static final String SHIPPING = "shipping";
        @NonNull
        public static final String SHIPPING_TIER = "shipping_tier";
        @NonNull
        @Deprecated
        public static final String SIGN_UP_METHOD = "sign_up_method";
        @NonNull
        public static final String SOURCE = "source";
        @NonNull
        public static final String START_DATE = "start_date";
        @NonNull
        public static final String SUCCESS = "success";
        @NonNull
        public static final String TAX = "tax";
        @NonNull
        public static final String TERM = "term";
        @NonNull
        public static final String TRANSACTION_ID = "transaction_id";
        @NonNull
        public static final String TRAVEL_CLASS = "travel_class";
        @NonNull
        public static final String VALUE = "value";
        @NonNull
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";

        protected Param() {
        }
    }

    public static class UserProperty {
        @NonNull
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        @NonNull
        public static final String SIGN_UP_METHOD = "sign_up_method";

        protected UserProperty() {
        }
    }

    public FirebaseAnalytics(zzee zzee) {
        Preconditions.checkNotNull(zzee);
        this.zzb = zzee;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzee.zza(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return zza;
    }

    @Keep
    @Nullable
    public static zzhx getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzee zza2 = zzee.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza2 == null) {
            return null;
        }
        return new zzc(zza2);
    }

    @NonNull
    public final Task<String> getAppInstanceId() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                if (this.zzc == null) {
                    this.zzc = new zza(this, 0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.zzc;
            }
            return Tasks.call(executorService, new zzb(this));
        } catch (RuntimeException e) {
            this.zzb.zzC(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e);
        }
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void logEvent(@Size(max = 40, min = 1) @NonNull String str, @Nullable Bundle bundle) {
        this.zzb.zzg(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzb.zzs();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zzp(Boolean.valueOf(z));
    }

    public final void setConsent(@NonNull Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", DanaLogConstants.PushPermissionStatus.PUSH_DISABLED);
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", DanaLogConstants.PushPermissionStatus.PUSH_DISABLED);
            }
        }
        this.zzb.zzr(bundle);
    }

    @MainThread
    @Deprecated
    @Keep
    public final void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        this.zzb.zzo(activity, str, str2);
    }

    public final void setDefaultEventParameters(@Nullable Bundle bundle) {
        this.zzb.zzJ(bundle);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzb.zzt(j);
    }

    public final void setUserId(@Nullable String str) {
        this.zzb.zzn(str);
    }

    public final void setUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Size(max = 36) @Nullable String str2) {
        this.zzb.zzj((String) null, str, str2, false);
    }
}
