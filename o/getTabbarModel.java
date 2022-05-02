package o;

import android.util.Base64;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\b\"\u0004\b\u0000\u0010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\b0\fJ8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002J8\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0006H\u0002J\b\u0010)\u001a\u00020$H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lid/dana/data/here/HereOauthManager;", "", "hereTokenApi", "Lid/dana/data/here/source/network/HereTokenApi;", "(Lid/dana/data/here/source/network/HereTokenApi;)V", "lastToken", "Lid/dana/data/here/model/HereTokenResponse;", "acquireNewToken", "Lio/reactivex/Observable;", "executeHereApi", "T", "apiCall", "Lkotlin/Function1;", "", "generateAuthorizationValue", "consumerKeyEncoded", "hmacSha256Encoded", "timeStampEndcoded", "uniqueIDEncoded", "versionEncoded", "signature", "generateBaseSignature", "grantTypeEncoded", "generateBaseString", "signatureBaseString", "generateSignature", "baseString", "getBrearerToken", "token", "getSha256Hashing", "Ljavax/crypto/Mac;", "getTimestampInSeconds", "getToken", "invalidateLastToken", "", "isErrorUnauthorized", "", "error", "", "setLastToken", "newToken", "shouldAcquireNewToken", "useExistingToken", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTabbarModel {
    @NotNull
    public static final String CLIENT_CREDENTIALS = "client_credentials";
    @NotNull
    public static final String CONSUMER_KEY_PARAM = "oauth_consumer_key";
    @NotNull
    public static final String CONTENT_TYPE_ENCODED_FORM = "application/x-www-form-urlencoded";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String ENC = "utf-8";
    @NotNull
    public static final String HASHING_ALGORITHM = "HmacSHA256";
    @NotNull
    public static final String HMAC_SHA256 = "HMAC-SHA256";
    @NotNull
    public static final String NONCE_PARAM = "oauth_nonce";
    @NotNull
    public static final String OAUTH = "OAuth";
    @NotNull
    public static final String SIGNATURE_METHOD_PARAM = "oauth_signature_method";
    @NotNull
    public static final String SIGNATURE_PARAM = "oauth_signature";
    @NotNull
    public static final String TIMESTAMP_PARAM = "oauth_timestamp";
    @NotNull
    public static final String VERSION = "1.0";
    @NotNull
    public static final String VERSION_PARAM = "oauth_version";
    private final setSelectedColor hereTokenApi;
    private setBadgeText lastToken = new setBadgeText("", "", -1);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/data/here/model/HereTokenResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<setBadgeText> {
        final /* synthetic */ getTabbarModel length;

        setMax(getTabbarModel gettabbarmodel) {
            this.length = gettabbarmodel;
        }

        public final /* synthetic */ void accept(Object obj) {
            setBadgeText setbadgetext = (setBadgeText) obj;
            getTabbarModel gettabbarmodel = this.length;
            Intrinsics.checkNotNullExpressionValue(setbadgetext, "it");
            gettabbarmodel.setLastToken(setbadgetext);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "T", "kotlin.jvm.PlatformType", "token", "Lid/dana/data/here/model/HereTokenResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<setBadgeText, TitleBarRightButtonView.AnonymousClass4<? extends T>> {
        final /* synthetic */ getTabbarModel getMax;
        final /* synthetic */ Function1 setMin;

        setMin(getTabbarModel gettabbarmodel, Function1 function1) {
            this.getMax = gettabbarmodel;
            this.setMin = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            setBadgeText setbadgetext = (setBadgeText) obj;
            Intrinsics.checkNotNullParameter(setbadgetext, "token");
            return ((TitleBarRightButtonView.AnonymousClass1) this.setMin.invoke(this.getMax.getBrearerToken(setbadgetext))).onErrorResumeNext(new RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends T>>(this) {
                final /* synthetic */ setMin length;

                {
                    this.length = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    Intrinsics.checkNotNullParameter(th, "error");
                    if (!this.length.getMax.isErrorUnauthorized(th)) {
                        return TitleBarRightButtonView.AnonymousClass1.error(th);
                    }
                    this.length.getMax.invalidateLastToken();
                    return this.length.getMax.getToken().flatMap(new RedDotDrawable<setBadgeText, TitleBarRightButtonView.AnonymousClass4<? extends T>>(this) {
                        final /* synthetic */ AnonymousClass5 getMax;

                        {
                            this.getMax = r1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            setBadgeText setbadgetext = (setBadgeText) obj;
                            Intrinsics.checkNotNullParameter(setbadgetext, "newToken");
                            return (TitleBarRightButtonView.AnonymousClass4) this.getMax.length.setMin.invoke(this.getMax.length.getMax.getBrearerToken(setbadgetext));
                        }
                    });
                }
            });
        }
    }

    @Inject
    public getTabbarModel(@NotNull setSelectedColor setselectedcolor) {
        Intrinsics.checkNotNullParameter(setselectedcolor, "hereTokenApi");
        this.hereTokenApi = setselectedcolor;
    }

    @NotNull
    public final <T> TitleBarRightButtonView.AnonymousClass1<T> executeHereApi(@NotNull Function1<? super String, ? extends TitleBarRightButtonView.AnonymousClass1<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "apiCall");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getToken().flatMap(new setMin(this, function1));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getToken().flatMap { tok…}\n            }\n        }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final boolean isErrorUnauthorized(Throwable th) {
        return (th instanceof HttpException) && ((HttpException) th).code() == 401;
    }

    /* access modifiers changed from: private */
    public final String getBrearerToken(setBadgeText setbadgetext) {
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(setbadgetext.getAccess_token());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final void invalidateLastToken() {
        this.lastToken = new setBadgeText("", "", -1);
    }

    /* access modifiers changed from: private */
    public final void setLastToken(setBadgeText setbadgetext) {
        this.lastToken = setbadgetext;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<setBadgeText> getToken() {
        if (shouldAcquireNewToken()) {
            return acquireNewToken();
        }
        return useExistingToken();
    }

    private final TitleBarRightButtonView.AnonymousClass1<setBadgeText> useExistingToken() {
        TitleBarRightButtonView.AnonymousClass1<setBadgeText> just = TitleBarRightButtonView.AnonymousClass1.just(this.lastToken);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(lastToken)");
        return just;
    }

    private final boolean shouldAcquireNewToken() {
        return !this.lastToken.isValid();
    }

    private final TitleBarRightButtonView.AnonymousClass1<setBadgeText> acquireNewToken() {
        String encode = URLEncoder.encode(HMAC_SHA256, ENC);
        String encode2 = URLEncoder.encode(UUID.randomUUID().toString(), ENC);
        String encode3 = URLEncoder.encode(getTimestampInSeconds(), ENC);
        String encode4 = URLEncoder.encode("TQkf1iPYvmjmvU_tVmIVtg", ENC);
        String encode5 = URLEncoder.encode(CLIENT_CREDENTIALS, ENC);
        String encode6 = URLEncoder.encode("1.0", ENC);
        Intrinsics.checkNotNullExpressionValue(encode5, "grantTypeEncoded");
        Intrinsics.checkNotNullExpressionValue(encode4, "consumerKeyEncoded");
        Intrinsics.checkNotNullExpressionValue(encode2, "uniqueIDEncoded");
        Intrinsics.checkNotNullExpressionValue(encode, "hmacSha256Encoded");
        Intrinsics.checkNotNullExpressionValue(encode3, "timeStampEndcoded");
        Intrinsics.checkNotNullExpressionValue(encode6, "versionEncoded");
        TitleBarRightButtonView.AnonymousClass1<setBadgeText> doOnNext = this.hereTokenApi.getToken("application/x-www-form-urlencoded", generateAuthorizationValue(encode4, encode, encode3, encode2, encode6, generateSignature(generateBaseString(generateBaseSignature(encode5, encode4, encode2, encode, encode3, encode6)))), CLIENT_CREDENTIALS).doOnNext(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(doOnNext, "hereTokenApi.getToken(\n …etLastToken(it)\n        }");
        return doOnNext;
    }

    private final String generateAuthorizationValue(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder("OAuth oauth_consumer_key=\"");
        sb.append(str);
        sb.append("\",oauth_signature_method=\"");
        sb.append(str2);
        sb.append("\",oauth_timestamp=\"");
        sb.append(str3);
        sb.append("\",oauth_nonce=\"");
        sb.append(str4);
        sb.append("\",oauth_version=\"");
        sb.append(str5);
        sb.append("\",oauth_signature=\"");
        sb.append(str6);
        sb.append(Typography.quote);
        return sb.toString();
    }

    private final String generateSignature(String str) {
        Mac sha256Hashing = getSha256Hashing();
        Charset forName = Charset.forName(ENC);
        Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(ENC)");
        if (str != null) {
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] encode = Base64.encode(sha256Hashing.doFinal(bytes), 0);
            Intrinsics.checkNotNullExpressionValue(encode, "Base64.encode(hashedBaseString, Base64.DEFAULT)");
            String encode2 = URLEncoder.encode(StringsKt.trim((CharSequence) new String(encode, Charsets.UTF_8)).toString(), ENC);
            Intrinsics.checkNotNullExpressionValue(encode2, "URLEncoder.encode(encodedHashedBaseString, ENC)");
            return encode2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final Mac getSha256Hashing() {
        Mac instance = Mac.getInstance(HMAC_SHA256);
        Intrinsics.checkNotNullExpressionValue(instance, "Mac.getInstance(HMAC_SHA256)");
        Charset forName = Charset.forName(ENC);
        Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(ENC)");
        byte[] bytes = "EH3tKuueP_pAm2uR4_xXah-hV2f0b0VQkwfD5USMxeHuTk2FU72zvJ3FU02n8-rn91jS0YdIJyHv-912crnApg&".getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        instance.init(new SecretKeySpec(bytes, HASHING_ALGORITHM));
        return instance;
    }

    private final String generateBaseString(String str) {
        String encode = URLEncoder.encode("https://account.api.here.com/oauth2/token", ENC);
        StringBuilder sb = new StringBuilder("POST&");
        sb.append(encode);
        sb.append(Typography.amp);
        sb.append(str);
        return sb.toString();
    }

    private final String generateBaseSignature(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder();
        sb.append(URLEncoder.encode("grant_type", ENC));
        sb.append('=');
        sb.append(str);
        sb.append(Typography.amp);
        sb.append(URLEncoder.encode(CONSUMER_KEY_PARAM, ENC));
        sb.append('=');
        sb.append(str2);
        sb.append(Typography.amp);
        sb.append(URLEncoder.encode(NONCE_PARAM, ENC));
        sb.append('=');
        sb.append(str3);
        sb.append(Typography.amp);
        sb.append(URLEncoder.encode(SIGNATURE_METHOD_PARAM, ENC));
        sb.append('=');
        sb.append(str4);
        sb.append(Typography.amp);
        sb.append(URLEncoder.encode(TIMESTAMP_PARAM, ENC));
        sb.append('=');
        sb.append(str5);
        sb.append(Typography.amp);
        sb.append(URLEncoder.encode(VERSION_PARAM, ENC));
        sb.append('=');
        sb.append(str6);
        String encode = URLEncoder.encode(sb.toString(), ENC);
        Intrinsics.checkNotNullExpressionValue(encode, "URLEncoder.encode(\n     …          , ENC\n        )");
        return encode;
    }

    private final String getTimestampInSeconds() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        return String.valueOf(instance.getTimeInMillis() / 1000);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/data/here/HereOauthManager$Companion;", "", "()V", "CLIENT_CREDENTIALS", "", "CONSUMER_KEY_PARAM", "CONTENT_TYPE_ENCODED_FORM", "ENC", "HASHING_ALGORITHM", "HMAC_SHA256", "NONCE_PARAM", "OAUTH", "SIGNATURE_METHOD_PARAM", "SIGNATURE_PARAM", "TIMESTAMP_PARAM", "VERSION", "VERSION_PARAM", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
