package o;

import com.alibaba.fastjson.JSONObject;
import id.dana.data.Source;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

@Singleton
public class getShortName {
    private static final String TAG = "DynamicUrlWrapper";
    /* access modifiers changed from: private */
    public String changeNameUrl = "https://m.dana.id/m/portal/settings/editNickname";
    /* access modifiers changed from: private */
    public String changePinUrl = "https://m.dana.id/m/portal/security/resetPin?mode=modify";
    private final onCallBack configEntityDataFactory;
    /* access modifiers changed from: private */
    public String forgotPinUrl = "https://m.dana.id/m/portal/security/resetPin?mode=reset";
    /* access modifiers changed from: private */
    public String helpUrl = "https://m.dana.id/m/standalone/help";
    /* access modifiers changed from: private */
    public String kycFromProfileUrl = "https://m.dana.id/m/kyc/landingPage?entryPoint=profile";
    /* access modifiers changed from: private */
    public String myPaymentCardsUrl = "https://m.dana.id/m/portal/bankcardlist";
    /* access modifiers changed from: private */
    public String pocketUrl = "https://m.dana.id/i/dana-promotion/pocket/list";
    /* access modifiers changed from: private */
    public String privacyPolicyUrl = "https://m.dana.id/m/standalone/policy";
    /* access modifiers changed from: private */
    public String readEMoney = "https://link.dana.id/read-emoney";
    /* access modifiers changed from: private */
    public String topupUrl = "https://m.dana.id/m/portal/topup?entryPoint={entryPoint}";
    /* access modifiers changed from: private */
    public String transactionCompletedUrl = "https://m.dana.id/i/transaction/list/completed";
    private String transactionDetailUrl = "https://m.dana.id/m/portal/transaction?bizOrderId=%s&isClosable=true";
    /* access modifiers changed from: private */
    public String transactionProgressingUrl = "https://m.dana.id/i/transaction/list/progressing";
    /* access modifiers changed from: private */
    public String tutorialUrl = "https://m.dana.id/i/tutorial/index";
    /* access modifiers changed from: private */
    public String voucherDetail = "https://m.dana.id/m/pocket/detail?pocketId=%s&isClosable=true";

    private String getEntryPointTag() {
        return "{entryPoint}";
    }

    @Inject
    public getShortName(onCallBack oncallback) {
        this.configEntityDataFactory = oncallback;
        init();
    }

    private AppMsgReceiver.AnonymousClass2 createSplitDataConfig() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    private AppMsgReceiver.AnonymousClass2 createAMCSDataConfig() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private void init() {
        initH5Entries();
        initElectronicmoneyEntries();
    }

    private void initH5Entries() {
        createSplitDataConfig().getH5Entries().onErrorResumeNext(getH5EntriesFromAMCS()).subscribe(new GriverProgressBar<JSONObject>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : jSONObject.entrySet()) {
                        hashMap.put((String) next.getKey(), (String) next.getValue());
                    }
                    String str = (String) hashMap.get("reset_pin");
                    getShortName getshortname = getShortName.this;
                    StringBuilder sb = new StringBuilder("https://m.dana.id");
                    String str2 = (String) hashMap.get("tutorial");
                    sb.append(setInterceptors.getDynamicUrl((String) hashMap.get(DanaLogConstants.BizType.TOPUP), (String) null, "/m/portal/topup?entryPoint={entryPoint}"));
                    String unused = getshortname.topupUrl = sb.toString();
                    getShortName getshortname2 = getShortName.this;
                    StringBuilder sb2 = new StringBuilder("https://m.dana.id");
                    sb2.append(setInterceptors.getDynamicUrl((String) hashMap.get("pocket"), (String) null, "/i/dana-promotion/pocket/list"));
                    String unused2 = getshortname2.pocketUrl = sb2.toString();
                    getShortName getshortname3 = getShortName.this;
                    StringBuilder sb3 = new StringBuilder("https://m.dana.id");
                    sb3.append(setInterceptors.getDynamicUrl((String) hashMap.get("transaction_completed"), (String) null, "/i/transaction/list/completed"));
                    String unused3 = getshortname3.transactionCompletedUrl = sb3.toString();
                    getShortName getshortname4 = getShortName.this;
                    StringBuilder sb4 = new StringBuilder("https://m.dana.id");
                    sb4.append(setInterceptors.getDynamicUrl((String) hashMap.get("transaction_progressing"), (String) null, "/i/transaction/list/progressing"));
                    String unused4 = getshortname4.transactionProgressingUrl = sb4.toString();
                    getShortName getshortname5 = getShortName.this;
                    StringBuilder sb5 = new StringBuilder("https://m.dana.id");
                    sb5.append(setInterceptors.getDynamicUrl((String) hashMap.get("kyc"), "?entryPoint=profile", "/m/kyc/landingPage?entryPoint=profile"));
                    String unused5 = getshortname5.kycFromProfileUrl = sb5.toString();
                    getShortName getshortname6 = getShortName.this;
                    StringBuilder sb6 = new StringBuilder("https://m.dana.id");
                    sb6.append(setInterceptors.getDynamicUrl((String) hashMap.get("my_payment_cards"), (String) null, "/m/portal/bankcardlist"));
                    String unused6 = getshortname6.myPaymentCardsUrl = sb6.toString();
                    getShortName getshortname7 = getShortName.this;
                    StringBuilder sb7 = new StringBuilder("https://m.dana.id");
                    sb7.append(setInterceptors.getDynamicUrl(str, "?mode=modify", "/m/portal/security/resetPin?mode=modify"));
                    String unused7 = getshortname7.changePinUrl = sb7.toString();
                    getShortName getshortname8 = getShortName.this;
                    StringBuilder sb8 = new StringBuilder("https://m.dana.id");
                    sb8.append(setInterceptors.getDynamicUrl(str, "?mode=reset", "/m/portal/security/resetPin?mode=reset"));
                    String unused8 = getshortname8.forgotPinUrl = sb8.toString();
                    getShortName getshortname9 = getShortName.this;
                    StringBuilder sb9 = new StringBuilder("https://m.dana.id");
                    sb9.append(setInterceptors.getDynamicUrl((String) hashMap.get("change_name"), (String) null, "/m/portal/settings/editNickname"));
                    String unused9 = getshortname9.changeNameUrl = sb9.toString();
                    getShortName getshortname10 = getShortName.this;
                    StringBuilder sb10 = new StringBuilder("https://m.dana.id");
                    sb10.append(setInterceptors.getDynamicUrl((String) hashMap.get("help"), (String) null, "/m/standalone/help"));
                    String unused10 = getshortname10.helpUrl = sb10.toString();
                    getShortName getshortname11 = getShortName.this;
                    StringBuilder sb11 = new StringBuilder("https://m.dana.id");
                    sb11.append(setInterceptors.getDynamicUrl((String) hashMap.get("privacy_policy"), (String) null, "/m/standalone/policy"));
                    String unused11 = getshortname11.privacyPolicyUrl = sb11.toString();
                    getShortName getshortname12 = getShortName.this;
                    StringBuilder sb12 = new StringBuilder("https://m.dana.id");
                    sb12.append(setInterceptors.getDynamicUrl(str2, (String) null, "/i/tutorial/index"));
                    String unused12 = getshortname12.tutorialUrl = sb12.toString();
                    getShortName getshortname13 = getShortName.this;
                    StringBuilder sb13 = new StringBuilder("https://m.dana.id");
                    sb13.append(setInterceptors.getDynamicUrl((String) hashMap.get("pocket_detail"), (String) null, "/m/pocket/detail?pocketId=%s&isClosable=true"));
                    String unused13 = getshortname13.voucherDetail = sb13.toString();
                }
            }
        });
    }

    private void initElectronicmoneyEntries() {
        createSplitDataConfig().getDeeplinkEntries().subscribe(new GriverProgressBar<JSONObject>() {
            public final void onComplete() {
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                HashMap hashMap = new HashMap();
                for (Map.Entry next : ((JSONObject) obj).entrySet()) {
                    hashMap.put((String) next.getKey(), (String) next.getValue());
                }
                getShortName getshortname = getShortName.this;
                StringBuilder sb = new StringBuilder("https://link.dana.id");
                sb.append(setInterceptors.getDynamicUrl((String) hashMap.get("read_emoney"), (String) null, "/read-emoney"));
                String unused = getshortname.readEMoney = sb.toString();
            }

            public final void onError(Throwable th) {
                String unused = getShortName.this.readEMoney = "";
            }
        });
    }

    private TitleBarRightButtonView.AnonymousClass1<JSONObject> getH5EntriesFromAMCS() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(applyTransparentTitle.setMin);
    }

    public String getTopupUrl(String str) {
        if (!isEntryPointExist()) {
            addEntryPoint();
        }
        return this.topupUrl.replace(getEntryPointTag(), str);
    }

    private void addEntryPoint() {
        String str = "?";
        if (this.topupUrl.contains(str)) {
            str = "&";
        }
        StringBuilder sb = new StringBuilder("entryPoint=");
        sb.append(getEntryPointTag());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.topupUrl);
        sb2.append(str);
        sb2.append(obj);
        this.topupUrl = sb2.toString();
    }

    private boolean isEntryPointExist() {
        return this.topupUrl.contains(getEntryPointTag());
    }

    public String getPocketUrl() {
        return this.pocketUrl;
    }

    public String getTransactionCompletedUrl() {
        return this.transactionCompletedUrl;
    }

    public String getTransactionProgressingUrl() {
        return this.transactionProgressingUrl;
    }

    public String getTransactionDetailUrl() {
        return this.transactionDetailUrl;
    }

    public String getKycFromProfileUrl() {
        return this.kycFromProfileUrl;
    }

    public String getMyPaymentCardsUrl() {
        return this.myPaymentCardsUrl;
    }

    public String getChangePinUrl() {
        return this.changePinUrl;
    }

    public String getForgotPinUrl() {
        return this.forgotPinUrl;
    }

    public String getChangeNameUrl() {
        return this.changeNameUrl;
    }

    public String getHelpUrl() {
        return this.helpUrl;
    }

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public String getTutorialUrl() {
        return this.tutorialUrl;
    }

    public String getReadEMoney() {
        return this.readEMoney;
    }

    public String getVoucherDetail() {
        return this.voucherDetail;
    }
}
