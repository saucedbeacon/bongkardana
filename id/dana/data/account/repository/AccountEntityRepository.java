package id.dana.data.account.repository;

import android.content.Context;
import id.dana.data.Source;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.BackKeyDownPoint;
import o.BaseSubLayout;
import o.DialogLayout;
import o.GriverCommonResourceProxy;
import o.GriverOptionMenuPanelExtension;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.attach;
import o.b;
import o.dividerPaint;
import o.getAppLaunchParams;
import o.getCommonResources;
import o.getDividerHeight;
import o.getDrawDivider;
import o.getExtObj;
import o.getItems;
import o.getOwner;
import o.getSelection$core;
import o.getTitleView;
import o.invalidateDividers;
import o.itemClicked;
import o.onCallBack;
import o.positiveButtonClicked;
import o.setDialog;
import o.setExtModel;
import o.setItems;
import o.setMinProgress;
import o.setSelection;

@Singleton
public class AccountEntityRepository extends setMinProgress implements getCommonResources {
    private final getItems.core accountMapper;
    private final positiveButtonClicked avatarEntityDataFactory;
    private final onCallBack configEntityDataFactory;
    private final getExtObj userProfileInfoEntityDataFactory;

    @Retention(RetentionPolicy.SOURCE)
    public @interface UpdateType {
        public static final String AVATAR = "avatarUrl";
        public static final String NICKNAME = "nickname";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$saveAvatarUrl$5(String str, String str2) throws Exception {
        return str;
    }

    @Inject
    public AccountEntityRepository(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, onCallBack oncallback, positiveButtonClicked positivebuttonclicked, getExtObj getextobj, getItems.core core, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.configEntityDataFactory = oncallback;
        this.avatarEntityDataFactory = positivebuttonclicked;
        this.userProfileInfoEntityDataFactory = getextobj;
        this.accountMapper = core;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> uploadAvatar(File file) {
        return authenticatedRequest(createAvatarData().uploadAvatar(file, createAccountData().getUUIDAsString())).flatMap(updateProfile()).flatMap(saveAvatarUrl());
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getAvatarUrl() {
        return createAccountData().getAvatarUrl();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> hasAccount() {
        return createAccountData().hasAccount();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getUserId() {
        return createAccountData().getUserId();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> saveNickname(String str) {
        return createAccountData().saveNickname(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getNickname() {
        return createAccountData().getNickname();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getKycLevel() {
        return createAccountData().getKycLevel();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getUUID() {
        return createAccountData().getUUID();
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> setPocketLastTimestamp(long j) {
        return createAccountData().savePocketLastTimestamp(Long.valueOf(j));
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> getPocketLastTimestamp() {
        return createAccountData().getPocketLastTimestamp();
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getPocketNumUpdated(String str) {
        return createAccountData().getPocketNumUpdated(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> setLastActiveTimestamp(Long l) {
        return createAccountData().setLastActiveTimestamp(l);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isOverActiveTimestamp() {
        return createAccountData().getLastActiveTimestamp().map(setItems.core.getMin).flatMap(new getDividerHeight(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$isOverActiveTimestamp$2(Long l) throws Exception {
        return getTimeoutPeriode().map(new setDialog(l));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$isOverActiveTimestamp$1(Long l, Long l2) throws Exception {
        return Boolean.valueOf(l.longValue() >= l2.longValue());
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber() {
        return createAccountData().getPhoneNumber();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFirstTime() {
        return createAccountData().isFirstTime();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> finishFirstTime() {
        return createAccountData().finishFirstTime();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveAccount(GriverCommonResourceProxy griverCommonResourceProxy) {
        return createAccountData().saveAccount(this.accountMapper.transform(griverCommonResourceProxy));
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverCommonResourceProxy> getDrutherDataForUpdate(Context context) {
        TitleBarRightButtonView.AnonymousClass1<attach> drutherDataForUpdate = createAccountData().getDrutherDataForUpdate(context);
        getItems.core core = this.accountMapper;
        Objects.requireNonNull(core);
        return drutherDataForUpdate.map(new BaseSubLayout(core));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getBalanceVisibility() {
        return createAccountData().getBalanceVisibility();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setBalanceVisibility(Boolean bool) {
        return createAccountData().setBalanceVisibility(bool);
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverCommonResourceProxy> getAccount() {
        TitleBarRightButtonView.AnonymousClass1<attach> account = createAccountData().getAccount();
        getItems.core core = this.accountMapper;
        Objects.requireNonNull(core);
        return account.map(new BaseSubLayout(core));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastTransaction(GriverOptionMenuPanelExtension griverOptionMenuPanelExtension) {
        return createAccountData().saveLastTransaction(itemClicked.toTransactionEntity(griverOptionMenuPanelExtension));
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverOptionMenuPanelExtension> getLastTransaction() {
        return createAccountData().getLatestTransaction().map(getTitleView.length);
    }

    private invalidateDividers createAvatarData() {
        return this.avatarEntityDataFactory.createData("network");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$updateProfile$4(getOwner getowner) throws Exception {
        return createUserProfileInfo().updateUserProfileInfo(UpdateType.AVATAR, getowner.url).map(new dividerPaint(getowner));
    }

    private RedDotDrawable<getOwner, TitleBarRightButtonView.AnonymousClass1<String>> updateProfile() {
        return new getSelection$core(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$saveAvatarUrl$6(String str) throws Exception {
        return createAccountData().saveAvatarUrl(UpdateType.AVATAR).map(new getDrawDivider(str));
    }

    private RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass1<String>> saveAvatarUrl() {
        return new setSelection.core(this);
    }

    private setExtModel createUserProfileInfo() {
        return this.userProfileInfoEntityDataFactory.createData("network");
    }

    private AppMsgReceiver.AnonymousClass2 createAMCSConfigData() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    private TitleBarRightButtonView.AnonymousClass1<Long> getTimeoutPeriode() {
        return createSplitConfigData().getTimeoutPeriod().onErrorResumeNext(createAMCSConfigData().getTimeoutPeriod());
    }
}
