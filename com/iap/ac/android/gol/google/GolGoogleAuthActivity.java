package com.iap.ac.android.gol.google;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.iap.ac.android.a.a;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AcBaseResult;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.gol.SignContractRequest;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.biz.core.R;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.e;
import com.iap.ac.android.gol.SignContractManager;
import com.iap.ac.android.gol.google.model.AuthenticationResult;
import com.iap.ac.android.gol.google.model.MerchantAuthenticationResult;
import com.iap.ac.android.gol.google.network.GolGooglePrepareProcessor;
import com.iap.ac.android.gol.google.network.GolGooglePrepareResponse;
import com.iap.ac.android.gol.rpc.AuthDataUtils;
import com.iap.ac.android.gol.rpc.AuthProcessor;
import com.iap.ac.android.gol.rpc.result.AuthPrepareResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GolGoogleAuthActivity extends Activity {
    public static final String DEFAULT_STATION_OPENAPI = "TNGD_WALLET_MY";
    public static final String GSP_ASSOCIATION_ID = "gspAssociationId";
    public static final String GSP_AUTHENTICATION_REQUEST = "gspAuthenticationRequest";
    public static final String GSP_AUTHENTICATION_RESPONSE = "gspAuthenticationResponse";
    public static final String GSP_CALLBACK_URL = "gspCallbackUrl";
    public static final String GSP_MAJOR_VERSION = "gspMajorVersion";
    public static final String TAG = GolGoogleAuthActivity.class.getSimpleName();
    public static final String URL_PARAM_BIZ_CONTENT = "bizContent";
    public static final String URL_PARAM_NEED_CALLBACK = "needCallback";
    public static final byte[] getMax = {Framer.STDOUT_FRAME_PREFIX, -29, -120, -86, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 132;
    public String mAuthenticationResponse;
    public Map<String, String> mMerchantOriginalRequest = new HashMap();
    public long mStartTime;

    /* access modifiers changed from: private */
    public void googlePrepareInThread() {
        if (ConfigCenter.INSTANCE.getGoogleInvokeImgsApi() || !ACManager.getInstance().getCommonConfig().appId.contains(DEFAULT_STATION_OPENAPI)) {
            signContractByRPC();
        } else {
            signContractByOpenApi();
        }
    }

    private boolean preCheck() {
        return this.mMerchantOriginalRequest.size() > 0;
    }

    private void prepareOriginAuthenticationRequest() {
        Intent intent = getIntent();
        if (intent == null) {
            ACLog.e("AGS_AgsForGoogleAuthActivity", "intent is null, return directly");
            return;
        }
        if (intent.hasExtra(GSP_ASSOCIATION_ID)) {
            this.mMerchantOriginalRequest.put(GSP_ASSOCIATION_ID, intent.getStringExtra(GSP_ASSOCIATION_ID));
        } else {
            this.mMerchantOriginalRequest.put(GSP_ASSOCIATION_ID, "");
        }
        this.mMerchantOriginalRequest.put(GSP_AUTHENTICATION_REQUEST, intent.getStringExtra(GSP_AUTHENTICATION_REQUEST));
        if (intent.hasExtra("gspCallbackUrl")) {
            this.mMerchantOriginalRequest.put("gspCallbackUrl", intent.getStringExtra("gspCallbackUrl"));
        }
        if (intent.hasExtra(GSP_MAJOR_VERSION)) {
            this.mMerchantOriginalRequest.put(GSP_MAJOR_VERSION, intent.getStringExtra(GSP_MAJOR_VERSION));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r8 = r8 * 175
            int r8 = 179 - r8
            int r9 = r9 * 165
            int r9 = 176 - r9
            byte[] r0 = getMax
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r8
            r7 = r9
            r4 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L_0x0025
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0025:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x002a:
            int r8 = r8 + 1
            int r9 = r9 + r3
            int r9 = r9 + -2
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gol.google.GolGoogleAuthActivity.setMin(int, byte, byte):java.lang.String");
    }

    private void signContract(@NonNull String str) {
        Uri parse = Uri.parse(str);
        SignContractRequest signContractRequest = new SignContractRequest();
        signContractRequest.needCallback = parse.getBooleanQueryParameter(URL_PARAM_NEED_CALLBACK, false);
        signContractRequest.bizContent = parse.getQueryParameter(URL_PARAM_BIZ_CONTENT);
        if (TextUtils.isEmpty(signContractRequest.bizContent)) {
            signContractRequest.authUrl = str;
        }
        ACLog.d(Constants.TAG, String.format("signContract begin, needCallback: %s, bizContent: %s, authUrl: %s", new Object[]{Boolean.valueOf(signContractRequest.needCallback), signContractRequest.bizContent, signContractRequest.authUrl}));
        SignContractManager.getInstance().signContract(true, signContractRequest, new AcCallback<AcBaseResult>() {
            public void onResult(AcBaseResult acBaseResult) {
                if (acBaseResult.success) {
                    GolGoogleAuthActivity.this.onAuthSuccess();
                    e.a(true, GolGoogleAuthActivity.this.mStartTime);
                    return;
                }
                e.a(false, GolGoogleAuthActivity.this.mStartTime);
                if (TextUtils.equals(acBaseResult.errorCode, "USER_CANCEL")) {
                    GolGoogleAuthActivity.this.onAuthCanceled();
                } else {
                    GolGoogleAuthActivity.this.onAuthFailed();
                }
            }
        });
    }

    private void signContractByOpenApi() {
        String str;
        GolGooglePrepareResponse prepare = new GolGooglePrepareProcessor(this).prepare(this.mMerchantOriginalRequest);
        String str2 = "";
        if (prepare == null) {
            str = str2;
        } else {
            str = prepare.gspAuthenticationResponse;
        }
        this.mAuthenticationResponse = str;
        if (prepare != null) {
            str2 = prepare.authUrl;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(this.mAuthenticationResponse)) {
            StringBuilder sb = new StringBuilder("(singContractByOpenApi)google sign contract, prepare error: ");
            sb.append(str2);
            sb.append(", ");
            sb.append(this.mAuthenticationResponse);
            e.a(sb.toString(), this.mStartTime);
            onAuthFailed();
            return;
        }
        signContract(str2);
    }

    private void signContractByRPC() {
        String str;
        MerchantAuthenticationResult merchantAuthenticationResult;
        AuthPrepareResult prepare = new AuthProcessor().prepare(AuthDataUtils.generatePrepareRequest(this.mMerchantOriginalRequest));
        String str2 = "";
        if (prepare == null) {
            str = str2;
        } else {
            str = prepare.responseBody;
        }
        AuthenticationResult authenticationResult = (AuthenticationResult) JsonUtils.fromJson(str, AuthenticationResult.class);
        if (!(authenticationResult == null || (merchantAuthenticationResult = authenticationResult.merchantAuthenticationResponse) == null)) {
            this.mAuthenticationResponse = merchantAuthenticationResult.gspAuthenticationResponse;
        }
        if (authenticationResult != null) {
            str2 = authenticationResult.getAuthUrl();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(this.mAuthenticationResponse)) {
            StringBuilder sb = new StringBuilder("(signContractByRPC)google sign contract, prepare error: ");
            sb.append(str2);
            sb.append(", ");
            sb.append(this.mAuthenticationResponse);
            e.a(sb.toString(), this.mStartTime);
            onAuthFailed();
            return;
        }
        signContract(str2);
    }

    public void onAuthCanceled() {
        if (this.mAuthenticationResponse != null) {
            Intent intent = new Intent();
            intent.putExtra("gspAuthenticationResponse", this.mAuthenticationResponse);
            setResult(0, intent);
        } else {
            setResult(0);
        }
        finish();
    }

    public void onAuthFailed() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1915177365, oncanceled);
            onCancelLoad.getMin(-1915177365, oncanceled);
        }
        Intent intent = new Intent();
        String str = this.mAuthenticationResponse;
        if (str != null) {
            intent.putExtra("gspAuthenticationResponse", str);
        }
        setResult(1, intent);
        finish();
    }

    public void onAuthSuccess() {
        Intent intent = new Intent();
        intent.putExtra("gspAuthenticationResponse", this.mAuthenticationResponse);
        setResult(-1, intent);
        finish();
    }

    public void onCreate(@Nullable Bundle bundle, @Nullable PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        int min2;
        int length3;
        int length4;
        byte[] bArr = getMax;
        byte b = (byte) bArr[85];
        String min3 = setMin(b, (byte) b, (byte) bArr[8]);
        byte[] bArr2 = getMax;
        byte b2 = (byte) bArr2[8];
        String min4 = setMin(b2, (byte) b2, (byte) bArr2[85]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min3, min4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(33387448, oncanceled);
            onCancelLoad.getMin(33387448, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length4 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length4, 4);
            onCancelLoad.setMax(33387448, oncanceled2);
            onCancelLoad.getMin(33387448, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length3 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
            onCanceled oncanceled3 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(33387448, oncanceled3);
            onCancelLoad.getMin(33387448, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        Context applicationContext4 = baseContext4 != null ? baseContext4.getApplicationContext() : null;
        if (!(applicationContext4 == null || (length2 = applicationContext4.fileList().length) == (min2 = dispatchOnCancelled.setMin(applicationContext4, length2)))) {
            onCanceled oncanceled4 = new onCanceled(length2, min2, 8);
            onCancelLoad.setMax(33387448, oncanceled4);
            onCancelLoad.getMin(33387448, oncanceled4);
        }
        Context baseContext5 = getBaseContext();
        if (baseContext5 != null) {
            context = baseContext5.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled5 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(33387448, oncanceled5);
            onCancelLoad.getMin(33387448, oncanceled5);
        }
        super.onCreate(bundle);
        ConfigCenter.INSTANCE.refreshConfigs();
        if (ConfigCenter.INSTANCE.getLoadingGolGoogleAuthToggle()) {
            setContentView(R.layout.acsdk_activity_gol_google_auth);
        }
        this.mStartTime = SystemClock.elapsedRealtime();
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_google_sign_contract_enter").event();
        prepareOriginAuthenticationRequest();
        if (!preCheck()) {
            StringBuilder a2 = a.a("google sign contract error with invalid param: ");
            a2.append(this.mMerchantOriginalRequest);
            e.a(a2.toString(), this.mStartTime);
            onAuthFailed();
            return;
        }
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                GolGoogleAuthActivity.this.googlePrepareInThread();
            }
        });
    }
}
