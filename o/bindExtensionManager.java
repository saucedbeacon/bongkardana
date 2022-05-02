package o;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.data.miniprogram.model.MiniProgramVersionRequirementsEntity;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/data/danah5/H5EntityRepository;", "Lid/dana/domain/danah5/H5Repository;", "context", "Landroid/content/Context;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "accountRepository", "Lid/dana/data/account/repository/AccountEntityRepository;", "(Landroid/content/Context;Lid/dana/data/toggle/SplitFacade;Lid/dana/data/account/repository/AccountEntityRepository;)V", "checkMiniProgramVersionRequirements", "Lio/reactivex/Observable;", "Lid/dana/domain/danah5/model/H5UserDataEntity;", "appId", "", "originalBundle", "Landroid/os/Bundle;", "sharedData", "fetchConfigs", "urlOrAppId", "bundle", "getSharedData", "url", "userId", "getUtdId", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class bindExtensionManager implements onCreateWindow {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    private final Context getMax;
    private final AccountEntityRepository getMin;
    private final UpdateAppCallback setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/danah5/model/H5UserDataEntity;", "kotlin.jvm.PlatformType", "it", "Landroid/os/Bundle;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<Bundle, TitleBarRightButtonView.AnonymousClass4<? extends onJsPrompt>> {
        final /* synthetic */ String getMin;
        final /* synthetic */ Bundle length;
        final /* synthetic */ bindExtensionManager setMin;

        IsOverlapping(bindExtensionManager bindextensionmanager, String str, Bundle bundle) {
            this.setMin = bindextensionmanager;
            this.getMin = str;
            this.length = bundle;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bundle bundle = (Bundle) obj;
            Intrinsics.checkNotNullParameter(bundle, "it");
            return bindExtensionManager.setMin(this.setMin, this.getMin, this.length, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/miniprogram/model/MiniProgramVersionRequirementsEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<MiniProgramVersionRequirementsEntity, BaseGriverRpcRequest> {
        public static final getMax length = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            MiniProgramVersionRequirementsEntity miniProgramVersionRequirementsEntity = (MiniProgramVersionRequirementsEntity) obj;
            Intrinsics.checkNotNullParameter(miniProgramVersionRequirementsEntity, "it");
            Intrinsics.checkNotNullParameter(miniProgramVersionRequirementsEntity, "$this$toMiniProgramVersionRequirements");
            return new BaseGriverRpcRequest(ErrorConstants.Companion.fromVersion(miniProgramVersionRequirementsEntity.getMinAppVersion()), ErrorConstants.Companion.fromVersion(miniProgramVersionRequirementsEntity.getMinAndroidVersion()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/danah5/model/H5UserDataEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<BaseGriverRpcRequest, onJsPrompt> {
        final /* synthetic */ onJsPrompt getMax;

        getMin(onJsPrompt onjsprompt) {
            this.getMax = onjsprompt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseGriverRpcRequest baseGriverRpcRequest = (BaseGriverRpcRequest) obj;
            Intrinsics.checkNotNullParameter(baseGriverRpcRequest, "it");
            onJsPrompt onjsprompt = this.getMax;
            onjsprompt.setVersionRequirements(baseGriverRpcRequest);
            return onjsprompt;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends Bundle>> {
        final /* synthetic */ String getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ bindExtensionManager setMin;

        setMin(bindExtensionManager bindextensionmanager, String str, String str2) {
            this.setMin = bindextensionmanager;
            this.getMin = str;
            this.getMax = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            return bindExtensionManager.setMin(this.setMin, this.getMin != null ? null : this.getMax, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<Throwable, Bundle> {
        final /* synthetic */ Function0 setMax;

        toIntRange(Function0 function0) {
            this.setMax = function0;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return (Bundle) this.setMax.invoke();
        }
    }

    @Inject
    public bindExtensionManager(@NotNull Context context, @NotNull UpdateAppCallback updateAppCallback, @NotNull AccountEntityRepository accountEntityRepository) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        Intrinsics.checkNotNullParameter(accountEntityRepository, "accountRepository");
        this.getMax = context;
        this.setMax = updateAppCallback;
        this.getMin = accountEntityRepository;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onJsPrompt> fetchConfigs(@NotNull String str, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "urlOrAppId");
        Intrinsics.checkNotNullParameter(bundle, HummerConstants.BUNDLE);
        String str2 = null;
        if (TextUtils.isDigitsOnly(str)) {
            str2 = str;
        } else if (StringsKt.startsWith$default(str, "mini://", false, 2, (Object) null)) {
            str2 = Uri.parse(str).getQueryParameter("_ariver_appid");
        }
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.getMin.getUserId().onErrorReturnItem("").flatMap(new setMin(this, str2, str)).flatMap(new IsOverlapping(this, str2, bundle));
        Intrinsics.checkNotNullExpressionValue(flatMap, "accountRepository.userId…ents(appId, bundle, it) }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<Bundle> {
        final /* synthetic */ String $userId;
        final /* synthetic */ bindExtensionManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(bindExtensionManager bindextensionmanager, String str) {
            super(0);
            this.this$0 = bindextensionmanager;
            this.$userId = str;
        }

        @NotNull
        public final Bundle invoke() {
            Bundle bundle = new Bundle(2);
            bundle.putString("userId", this.$userId);
            bundle.putString("utdId", bindExtensionManager.getMax(this.this$0));
            return bundle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<getRequestMainPackage, Bundle> {
        final /* synthetic */ String getMin;
        final /* synthetic */ bindExtensionManager length;
        final /* synthetic */ String setMin;

        toFloatRange(bindExtensionManager bindextensionmanager, String str, String str2) {
            this.length = bindextensionmanager;
            this.setMin = str;
            this.getMin = str2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: id.dana.domain.danah5.model.H5ShareData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: id.dana.domain.danah5.model.H5ShareData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: id.dana.domain.danah5.model.H5ShareData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: id.dana.domain.danah5.model.H5ShareData} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: getMin */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.os.Bundle apply(@org.jetbrains.annotations.NotNull o.getRequestMainPackage r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "h5_share_data"
                java.lang.String r1 = "split/default-feature-h5-share-data.json"
                java.lang.String r10 = o.getRequestMainPackage.length(r10, r0, r1)
                r0 = 0
                if (r10 == 0) goto L_0x002b
                if (r10 != 0) goto L_0x0014
                goto L_0x0029
            L_0x0014:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0029 }
                r1.<init>(r10)     // Catch:{ Exception -> 0x0029 }
                com.google.gson.Gson r10 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0029 }
                r10.<init>()     // Catch:{ Exception -> 0x0029 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0029 }
                java.lang.Class<id.dana.domain.danah5.model.H5ShareData> r2 = id.dana.domain.danah5.model.H5ShareData.class
                java.lang.Object r10 = r10.fromJson((java.lang.String) r1, r2)     // Catch:{ Exception -> 0x0029 }
                r0 = r10
            L_0x0029:
                id.dana.domain.danah5.model.H5ShareData r0 = (id.dana.domain.danah5.model.H5ShareData) r0
            L_0x002b:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                android.os.Bundle r10 = new android.os.Bundle
                r1 = 2
                r10.<init>(r1)
                java.lang.String[] r1 = r0.getUserId()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0061
                int r4 = r1.length
                r5 = 0
            L_0x003e:
                if (r5 >= r4) goto L_0x0056
                r6 = r1[r5]
                java.lang.String r7 = r9.setMin
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                kotlin.text.Regex r8 = new kotlin.text.Regex
                r8.<init>((java.lang.String) r6)
                boolean r6 = r8.matches(r7)
                if (r6 == 0) goto L_0x0053
                r1 = 1
                goto L_0x0057
            L_0x0053:
                int r5 = r5 + 1
                goto L_0x003e
            L_0x0056:
                r1 = 0
            L_0x0057:
                if (r1 != r3) goto L_0x0061
                java.lang.String r1 = r9.getMin
                java.lang.String r4 = "userId"
                r10.putString(r4, r1)
            L_0x0061:
                java.lang.String[] r0 = r0.getUtdId()
                if (r0 == 0) goto L_0x008f
                int r1 = r0.length
                r4 = 0
            L_0x0069:
                if (r4 >= r1) goto L_0x0081
                r5 = r0[r4]
                java.lang.String r6 = r9.setMin
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                kotlin.text.Regex r7 = new kotlin.text.Regex
                r7.<init>((java.lang.String) r5)
                boolean r5 = r7.matches(r6)
                if (r5 == 0) goto L_0x007e
                r2 = 1
                goto L_0x0081
            L_0x007e:
                int r4 = r4 + 1
                goto L_0x0069
            L_0x0081:
                if (r2 != r3) goto L_0x008f
                o.bindExtensionManager r0 = r9.length
                java.lang.String r0 = o.bindExtensionManager.getMax(r0)
                java.lang.String r1 = "utdId"
                r10.putString(r1, r0)
            L_0x008f:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindExtensionManager.toFloatRange.apply(o.getRequestMainPackage):android.os.Bundle");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/miniprogram/model/MiniProgramVersionRequirementsEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getRequestMainPackage, MiniProgramVersionRequirementsEntity> {
        final /* synthetic */ String setMax;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends TypeReference<Map<String, ? extends MiniProgramVersionRequirementsEntity>> {
        }

        length(String str) {
            this.setMax = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: getMin */
        public MiniProgramVersionRequirementsEntity apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            Map map;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("miniprogram_version_management", false);
            Intrinsics.checkNotNull(max);
            if (max == null) {
                try {
                    map = MapsKt.emptyMap();
                } catch (Exception unused) {
                    map = MapsKt.emptyMap();
                }
            } else {
                Object parseObject = JSON.parseObject(new JSONObject(max).toString(), new getMin(), new Feature[0]);
                Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
                map = (Map) parseObject;
            }
            Object obj = map.get(this.setMax);
            Intrinsics.checkNotNull(obj);
            return (MiniProgramVersionRequirementsEntity) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/danah5/H5EntityRepository$Companion;", "", "()V", "DEFAULT_FEATURE_H5_SHARE_DATA", "", "USER_ID", "UTD_ID", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMin(bindExtensionManager bindextensionmanager, String str, String str2) {
        Function0 isinside = new isInside(bindextensionmanager, str2);
        if (str == null) {
            TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(isinside.invoke());
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(defaultBundle())");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<R> onErrorReturn = getMinimumFontSize.timeoutForFirstEmit(bindextensionmanager.setMax.setMin.length(), 10000).map(new toFloatRange(bindextensionmanager, str, str2)).onErrorReturn(new toIntRange(isinside));
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "splitFacade.trafficTypeU…eturn { defaultBundle() }");
        return onErrorReturn;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMin(bindExtensionManager bindextensionmanager, String str, Bundle bundle, Bundle bundle2) {
        bundle.putAll(bundle2);
        Unit unit = Unit.INSTANCE;
        onJsPrompt onjsprompt = new onJsPrompt(str, bundle, (BaseGriverRpcRequest) null, 4, (DefaultConstructorMarker) null);
        if (str == null) {
            TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(onjsprompt);
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(userData)");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(bindextensionmanager.setMax.setMin.length(), 10000).map(new length(str)).onErrorReturnItem(new MiniProgramVersionRequirementsEntity((String) null, (String) null, 3, (DefaultConstructorMarker) null)).map(getMax.length).map(new getMin(onjsprompt));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…sionRequirements = it } }");
        return map;
    }

    public static final /* synthetic */ String getMax(bindExtensionManager bindextensionmanager) {
        String str;
        ConfigCenter instance = ConfigCenter.getInstance();
        if (instance.isInitialized()) {
            ConfigCenterContext configContext = instance.getConfigContext();
            Intrinsics.checkNotNullExpressionValue(configContext, "configContext");
            str = configContext.getIdentifierProvider().getUtdId(bindextensionmanager.getMax);
        } else {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "ConfigCenter.getInstance…Id(context) else \"\"\n    }");
        return str;
    }
}
