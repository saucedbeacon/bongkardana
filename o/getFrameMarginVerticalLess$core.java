package o;

import android.content.Context;
import id.dana.data.base.UnInitializedSecuredPreferencesException;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class getFrameMarginVerticalLess$core {
    public static final String SECURED_ACCOUNT_PREFERENCES = "SecuredAccountPreferencesproduction";
    private final Context context;
    private onSingleFailed preferenceFacade;
    private final PluginInstallCallback serializer;

    @Inject
    public getFrameMarginVerticalLess$core(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public void init(String str) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(this.context).setPreferenceGroup(SECURED_ACCOUNT_PREFERENCES).setSerializerFacade(this.serializer).setPassword(str)).createData("local");
    }

    public void saveAccount(String str, String str2, String str3, String str4, String str5, String str6) throws UnInitializedSecuredPreferencesException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1655887957, oncanceled);
            onCancelLoad.getMin(1655887957, oncanceled);
        }
        saveAccount(new attach(str, str2, str3, str4, str5, str6));
    }

    public void saveAccount(attach attach) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("account", attach);
    }

    private void initChecking() throws UnInitializedSecuredPreferencesException {
        if (this.preferenceFacade == null) {
            throw new UnInitializedSecuredPreferencesException();
        }
    }

    public boolean hasAccount() throws UnInitializedSecuredPreferencesException {
        return getAccount() != null;
    }

    public attach getAccount() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return (attach) this.preferenceFacade.getObject("account", attach.class);
    }

    public String getPhoneNumber() throws UnInitializedSecuredPreferencesException {
        attach account = getAccount();
        if (account != null) {
            return account.getPhoneNumber();
        }
        return null;
    }

    public String getUserId() throws UnInitializedSecuredPreferencesException {
        attach account = getAccount();
        if (account != null) {
            return account.getUserId();
        }
        return null;
    }

    public String getUUID() throws UnInitializedSecuredPreferencesException {
        attach account = getAccount();
        if (account != null) {
            return account.getUUID();
        }
        return null;
    }

    public RVMain getPayMethod() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return (RVMain) this.preferenceFacade.getObject("pay_method_response", RVMain.class);
    }

    public void savePayMethodResult(RVMain rVMain) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("pay_method_response", rVMain);
    }

    public RVMain getAssetCardResult() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return (RVMain) this.preferenceFacade.getObject("asset_card_response", RVMain.class);
    }

    public void saveAssetCardResult(RVMain rVMain) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("asset_card_response", rVMain);
    }

    public void clearAll() throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.clearAllData();
    }

    public void savePocketLastTimestamp(long j) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("pocket_lastservertimestamp", Long.valueOf(j));
    }

    public Long getPocketLastTimestamp() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return this.preferenceFacade.getLong("pocket_lastservertimestamp");
    }

    public Integer getPocketNumUpdated(String str) throws UnInitializedSecuredPreferencesException {
        initChecking();
        return this.preferenceFacade.getInteger("pocket_".concat(String.valueOf(str)));
    }

    public Boolean isFirstTime() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return Boolean.valueOf(!this.preferenceFacade.getBoolean("finish_first_time").booleanValue());
    }

    public void finishFirstTime() throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("finish_first_time", Boolean.TRUE);
    }

    public void saveLastUpdatePOI(Long l) {
        this.preferenceFacade.saveData("last_updated_poi_time", l);
    }

    public void saveLastUpdatedTimeUserPan(long j) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("last_updated_time_user_pan", Long.valueOf(j));
    }

    public Long getLastUpdatePOI() {
        return this.preferenceFacade.getLong("last_updated_poi_time");
    }

    public long getLastUpdatedTimeUserPan() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return this.preferenceFacade.getLong("last_updated_time_user_pan").longValue();
    }

    public void saveStatePermissionLocation(boolean z) {
        this.preferenceFacade.saveData("permission_location_state", Boolean.valueOf(z));
    }

    public Boolean getStatePermissionLocation() {
        return this.preferenceFacade.getBoolean("permission_location_state");
    }

    public String getOfflinePublicKey() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return this.preferenceFacade.getString("offline_public_key");
    }

    public void setOfflinePublicKey(String str) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("offline_public_key", str);
    }

    public String getCardCredentialPublicKey() throws UnInitializedSecuredPreferencesException {
        initChecking();
        String string = this.preferenceFacade.getString("card_credential_public_key");
        return string == null ? "" : string;
    }

    public void setCardCredentialPublicKey(String str) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("card_credential_public_key", str);
    }

    public void saveLastTransaction(isItemChecked isitemchecked) throws UnInitializedSecuredPreferencesException {
        initChecking();
        this.preferenceFacade.saveData("last_transaction", isitemchecked);
    }

    public isItemChecked getLatestTransaction() throws UnInitializedSecuredPreferencesException {
        initChecking();
        return (isItemChecked) this.preferenceFacade.getObject("last_transaction", isItemChecked.class);
    }
}
