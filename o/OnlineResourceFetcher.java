package o;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.ut.device.UTDevice;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OnlineResourceFetcher extends setMinProgress implements onBluetoothDescriptorWrite {
    private final getExtPages mapper;
    private final getOnlineResource userSecurityQuestionStateEntityDataFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u0002H\b¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J%\u0010\u0010\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u0002H\bH\u0007¢\u0006\u0002\u0010\u0011R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lid/dana/data/util/AmcsGnSectionConfig;", "", "()V", "gnSection", "Lcom/alibaba/fastjson/JSONObject;", "getGnSection", "()Lcom/alibaba/fastjson/JSONObject;", "Lio/reactivex/Observable;", "T", "key", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Lio/reactivex/Observable;", "getGnSectionJSONArray", "Lcom/alibaba/fastjson/JSONArray;", "getGnSectionJSONObject", "getGnSectionObject", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class FallbackListener {
        @NotNull
        public static final FallbackListener INSTANCE = new FallbackListener();

        private FallbackListener() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        static final class length<V> implements Callable<T> {
            final /* synthetic */ String getMin;
            final /* synthetic */ Object setMax;

            length(String str, Object obj) {
                this.getMin = str;
                this.setMax = obj;
            }

            public final T call() {
                return FallbackListener.getGnSectionObject(this.getMin, this.setMax);
            }
        }

        @NotNull
        public final <T> TitleBarRightButtonView.AnonymousClass1<T> getGnSection(@Nullable String str, T t) {
            TitleBarRightButtonView.AnonymousClass1<T> onErrorReturnItem = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(str, t)).onErrorReturnItem(t);
            Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "Observable.fromCallable …rReturnItem(defaultValue)");
            return onErrorReturnItem;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r1 = r0.get(r1);
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final <T> T getGnSectionObject(@org.jetbrains.annotations.Nullable java.lang.String r1, T r2) {
            /*
                o.OnlineResourceFetcher$FallbackListener r0 = INSTANCE
                com.alibaba.fastjson.JSONObject r0 = r0.getGnSection()
                if (r0 == 0) goto L_0x000f
                java.lang.Object r1 = r0.get(r1)
                if (r1 == 0) goto L_0x000f
                return r1
            L_0x000f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.OnlineResourceFetcher.FallbackListener.getGnSectionObject(java.lang.String, java.lang.Object):java.lang.Object");
        }

        @JvmStatic
        @Nullable
        public static final JSONArray getGnSectionJSONArray(@Nullable String str) {
            JSONObject gnSection = INSTANCE.getGnSection();
            if (gnSection != null) {
                return gnSection.getJSONArray(str);
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public static final JSONObject getGnSectionJSONObject(@Nullable String str) {
            JSONObject gnSection = INSTANCE.getGnSection();
            if (gnSection != null) {
                return gnSection.getJSONObject(str);
            }
            return null;
        }

        private final JSONObject getGnSection() {
            org.json.JSONObject section = fromString.getSection(cornerRadius.GN_NETWORK_INFO_NAME);
            if (section != null) {
                return getPositiveString.parseObject(section);
            }
            return null;
        }
    }

    @Singleton
    public class ResourceListener {
        private final getVersion appInfoPreference;
        private final Context context;
        private String utdid;

        @Inject
        public ResourceListener(Context context2, getVersion getversion) {
            this.context = context2;
            this.appInfoPreference = getversion;
        }

        public synchronized String getUtdid() {
            if (!TextUtils.isEmpty(this.utdid)) {
                return this.utdid;
            }
            String utdid2 = this.appInfoPreference.getUtdid();
            if (TextUtils.isEmpty(utdid2)) {
                String utdid3 = UTDevice.getUtdid(this.context);
                this.utdid = utdid3;
                this.appInfoPreference.saveUtdid(utdid3);
            } else {
                this.utdid = utdid2;
            }
            return this.utdid;
        }

        public synchronized String getUtdIdPref() {
            return this.appInfoPreference.getUtdidWithTimestamp();
        }

        public synchronized String refreshUtdIdWithTimestamp() {
            String obj;
            StringBuilder sb = new StringBuilder();
            sb.append(getUtdid());
            sb.append("-");
            sb.append(System.currentTimeMillis());
            obj = sb.toString();
            saveUtdIdWIthTimeStamp(obj);
            return obj;
        }

        public synchronized void saveUtdIdWIthTimeStamp(String str) {
            this.appInfoPreference.saveUtdIdWithTimestamp(str);
        }
    }

    @Inject
    public OnlineResourceFetcher(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getOnlineResource getonlineresource, getExtPages getextpages, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.userSecurityQuestionStateEntityDataFactory = getonlineresource;
        this.mapper = getextpages;
    }

    private setExtEnable createData() {
        return this.userSecurityQuestionStateEntityDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<onBluetoothCharacteristicWrite> getSecurityQuestionState(String str) {
        String userId = UserInfoManager.instance().getUserId();
        if (userId == null) {
            userId = getUserIdFromAccountData();
        }
        if (userId == null) {
            return TitleBarRightButtonView.AnonymousClass1.empty();
        }
        TitleBarRightButtonView.AnonymousClass1<createOnlineResource> authenticatedRequest = authenticatedRequest(createData().getSecurityQuestionState(userId, str));
        getExtPages getextpages = this.mapper;
        Objects.requireNonNull(getextpages);
        return authenticatedRequest.map(new setExtPages(getextpages));
    }

    @androidx.annotation.Nullable
    private String getUserIdFromAccountData() {
        try {
            return createAccountData().getUserId().blockingFirst();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
