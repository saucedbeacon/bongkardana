package o;

import android.content.Context;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.contract.deeplink.path.FeatureParams;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.KClassesJvm;
import o.NativeCallContext;
import o.RVResourceUtils;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class setOriginalData implements getAdapterPosition<NativeCallContext.AnonymousClass1> {
    private final b.C0007b<Context> contextProvider;

    public setOriginalData(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final NativeCallContext.AnonymousClass1 get() {
        return newInstance(this.contextProvider.get());
    }

    public static setOriginalData create(b.C0007b<Context> bVar) {
        return new setOriginalData(bVar);
    }

    public static NativeCallContext.AnonymousClass1 newInstance(Context context) {
        return new Object(context) {
            @NotNull
            public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
            @NotNull
            public static final String MERCHANT_INFO_PREFERENCES = "MerchantInfoPreferencesproduction";
            /* access modifiers changed from: private */
            public final Context context;
            private final Lazy preferenceFacade$delegate = LazyKt.lazy(new length(this));

            public final onSingleFailed getPreferenceFacade$data_productionRelease() {
                return (onSingleFailed) this.preferenceFacade$delegate.getValue();
            }

            {
                Intrinsics.checkNotNullParameter(r2, HummerConstants.CONTEXT);
                this.context = r2;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/storage/PreferenceFacade;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.NativeCallContext$1$length */
            static final class length extends Lambda implements Function0<onSingleFailed> {
                final /* synthetic */ AnonymousClass1 this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                length(AnonymousClass1 r1) {
                    super(0);
                    this.this$0 = r1;
                }

                public final onSingleFailed invoke() {
                    return new RVResourceUtils(new RVResourceUtils.getMax(this.this$0.context).setPreferenceGroup(AnonymousClass1.MERCHANT_INFO_PREFERENCES)).createData("local");
                }
            }

            @NotNull
            public final InitParams getMerchantImageResult(@NotNull String str, @NotNull String str2, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "merchantId");
                Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
                String keyOf = keyOf(str, str2, String.valueOf(i), String.valueOf(i2));
                onSingleFailed preferenceFacade$data_productionRelease = getPreferenceFacade$data_productionRelease();
                StringBuilder sb = new StringBuilder();
                sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(InitParams.class)));
                sb.append(keyOf);
                InitParams initParams = (InitParams) preferenceFacade$data_productionRelease.getObject(sb.toString(), InitParams.class);
                return initParams == null ? new InitParams(CollectionsKt.emptyList()) : initParams;
            }

            public final void saveMerchantImageResult(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull InitParams initParams) {
                Intrinsics.checkNotNullParameter(str, "merchantId");
                Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
                Intrinsics.checkNotNullParameter(initParams, "merchantImage");
                String keyOf = keyOf(str, str2, String.valueOf(i), String.valueOf(i2));
                onSingleFailed preferenceFacade$data_productionRelease = getPreferenceFacade$data_productionRelease();
                StringBuilder sb = new StringBuilder();
                sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(InitParams.class)));
                sb.append(keyOf);
                preferenceFacade$data_productionRelease.saveData(sb.toString(), initParams);
            }

            public final boolean getBoolean(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "key");
                Boolean bool = getPreferenceFacade$data_productionRelease().getBoolean(str, z);
                Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBoolean(key, defaultValue)");
                return bool.booleanValue();
            }

            public final void saveBoolean(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "key");
                getPreferenceFacade$data_productionRelease().saveData(str, Boolean.valueOf(z));
            }

            public static /* synthetic */ Object getObject$data_productionRelease$default(AnonymousClass1 r2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = "";
                }
                Intrinsics.checkNotNullParameter(str, "key");
                onSingleFailed preferenceFacade$data_productionRelease = r2.getPreferenceFacade$data_productionRelease();
                StringBuilder sb = new StringBuilder();
                Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
                sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(Object.class)));
                sb.append(str);
                String obj2 = sb.toString();
                Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
                return preferenceFacade$data_productionRelease.getObject(obj2, Object.class);
            }

            public final /* synthetic */ <T> T getObject$data_productionRelease(String str) {
                Intrinsics.checkNotNullParameter(str, "key");
                onSingleFailed preferenceFacade$data_productionRelease = getPreferenceFacade$data_productionRelease();
                StringBuilder sb = new StringBuilder();
                Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
                sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(Object.class)));
                sb.append(str);
                String obj = sb.toString();
                Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
                return preferenceFacade$data_productionRelease.getObject(obj, Object.class);
            }

            private final /* synthetic */ <T> void saveObject(String str, T t) {
                onSingleFailed preferenceFacade$data_productionRelease = getPreferenceFacade$data_productionRelease();
                StringBuilder sb = new StringBuilder();
                Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
                sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(Object.class)));
                sb.append(str);
                preferenceFacade$data_productionRelease.saveData(sb.toString(), t);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/nearbyme/repository/source/session/MerchantInfoPreferences$Companion;", "", "()V", "MERCHANT_INFO_PREFERENCES", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.NativeCallContext$1$setMax */
            public static final class setMax {
                private setMax() {
                }

                public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            private final String keyOf(String... strArr) {
                String str = "";
                for (String append : strArr) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(append);
                    sb.append(' ');
                    str = sb.toString();
                }
                return String.valueOf(str.hashCode());
            }
        };
    }
}
