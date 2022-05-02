package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAmcsLiteConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001c\u0010\u0005\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u000e\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/data/user/UserInfoMapper;", "", "currencyAmountResultMapper", "Lid/dana/data/sendmoney/mapper/CurrencyAmountResultMapper;", "(Lid/dana/data/sendmoney/mapper/CurrencyAmountResultMapper;)V", "transform", "Lid/dana/data/user/source/network/result/UserInfoRpcResult;", "accountEntity", "Lid/dana/data/account/AccountEntity;", "Lid/dana/domain/homeinfo/KybResponse;", "entity", "Lid/dana/data/homeinfo/model/KybEntity;", "Lid/dana/domain/homeinfo/KycResponse;", "Lid/dana/data/homeinfo/model/KycEntity;", "defaultKycInfo", "", "Lid/dana/domain/user/MiniProgramUserInfoResponse;", "userInfo", "Lid/dana/data/user/source/network/result/MiniProgramUserInfoResult;", "Lid/dana/domain/user/UserInfoResponse;", "userInfoRpcResult", "transformToUserInfoResponse", "accountInfo", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PackageQueryPoint {
    private final defaultPlatform currencyAmountResultMapper;

    @Inject
    public PackageQueryPoint(@NotNull defaultPlatform defaultplatform) {
        Intrinsics.checkNotNullParameter(defaultplatform, "currencyAmountResultMapper");
        this.currencyAmountResultMapper = defaultplatform;
    }

    @Nullable
    public final disconnect transform(@Nullable setTemplateConfig settemplateconfig) {
        String str;
        String str2;
        if (settemplateconfig == null) {
            return null;
        }
        stopBleScan stopblescan = (stopBleScan) this.currencyAmountResultMapper.apply(settemplateconfig.getBalance());
        String ktpName = settemplateconfig.getKtpName();
        String kycLevel = settemplateconfig.getKycLevel();
        onConfigChanged transform = transform(settemplateconfig.getKyc(), settemplateconfig.getKycLevel());
        GriverAmcsLiteConfig.AnonymousClass1 transform2 = transform(settemplateconfig.getKybInfo());
        String loginId = settemplateconfig.getLoginId();
        String str3 = loginId == null ? "" : loginId;
        String nickname = settemplateconfig.getNickname();
        if (nickname == null) {
            str = "";
        } else {
            str = nickname;
        }
        String pendingTransaction = settemplateconfig.getPendingTransaction();
        boolean kycCertified = settemplateconfig.getKycCertified();
        String userPan = settemplateconfig.getUserPan();
        boolean faceAuthStatus = settemplateconfig.getFaceAuthStatus();
        boolean enrollStatus = settemplateconfig.getEnrollStatus();
        boolean faceLoginReady = settemplateconfig.getFaceLoginReady();
        String accountStatus = settemplateconfig.getAccountStatus();
        String loginStatus = settemplateconfig.getLoginStatus();
        String userStatus = settemplateconfig.getUserStatus();
        String username = settemplateconfig.getUsername();
        if (username == null) {
            str2 = "";
        } else {
            str2 = username;
        }
        return new disconnect(stopblescan, ktpName, transform2, kycCertified, kycLevel, str3, str, pendingTransaction, userPan, transform, faceAuthStatus, enrollStatus, faceLoginReady, accountStatus, loginStatus, userStatus, str2);
    }

    @NotNull
    public final startBleScan transform(@NotNull setStatus setstatus) {
        Intrinsics.checkNotNullParameter(setstatus, "userInfo");
        return new startBleScan(setstatus.getUserInfo());
    }

    private final onConfigChanged transform(setName setname, String str) {
        String str2;
        onConfigChanged onconfigchanged = new onConfigChanged();
        if (!(setname == null || (str2 = setname.level) == null)) {
            str = str2;
        }
        onconfigchanged.setLevel(str);
        String str3 = null;
        onconfigchanged.setOrderStatus(setname != null ? setname.orderStatus : null);
        boolean z = false;
        onconfigchanged.setGovFlag(setname != null ? setname.govFlag : false);
        if (setname != null) {
            str3 = setname.tncUrl;
        }
        onconfigchanged.setTncUrl(str3);
        if (setname != null) {
            z = setname.userQuits;
        }
        onconfigchanged.setUserQuits(z);
        return onconfigchanged;
    }

    private final GriverAmcsLiteConfig.AnonymousClass1 transform(setActiveIcon setactiveicon) {
        if (setactiveicon == null) {
            return null;
        }
        GriverAmcsLiteConfig.AnonymousClass1 r0 = new Object() {
            private String failedReason;
            private String kybLevel;
            private String orderStatus;

            public String getOrderStatus() {
                return this.orderStatus;
            }

            public void setOrderStatus(String str) {
                this.orderStatus = str;
            }

            public String getKybLevel() {
                return this.kybLevel;
            }

            public void setKybLevel(String str) {
                this.kybLevel = str;
            }

            public String getFailedReason() {
                return this.failedReason;
            }

            public void setFailedReason(String str) {
                this.failedReason = str;
            }
        };
        r0.setOrderStatus(setactiveicon.orderStatus);
        r0.setKybLevel(setactiveicon.kybLevel);
        r0.setFailedReason(setactiveicon.failedReason);
        return r0;
    }

    @Nullable
    public final disconnect transformToUserInfoResponse(@Nullable attach attach) {
        if (attach != null) {
            disconnect disconnect = r0;
            disconnect disconnect2 = new disconnect((stopBleScan) null, (String) null, (GriverAmcsLiteConfig.AnonymousClass1) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (onConfigChanged) null, false, false, false, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
            disconnect disconnect3 = disconnect;
            disconnect3.setBalance((stopBleScan) this.currencyAmountResultMapper.apply(attach.getBalance()));
            String nickname = attach.getNickname();
            Intrinsics.checkNotNullExpressionValue(nickname, "it.nickname");
            disconnect3.setNickname(nickname);
            disconnect3.setUserPan(attach.getUserPan());
            return disconnect3;
        }
        return null;
    }

    @Nullable
    public final setTemplateConfig transform(@Nullable attach attach) {
        if (attach == null) {
            return null;
        }
        setTemplateConfig settemplateconfig = r0;
        setTemplateConfig settemplateconfig2 = new setTemplateConfig((String) null, (String) null, (registerWorker) null, (String) null, (setActiveIcon) null, (setName) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, 524287, (DefaultConstructorMarker) null);
        setTemplateConfig settemplateconfig3 = settemplateconfig;
        settemplateconfig3.success = true;
        settemplateconfig3.setBalance(attach.getBalance());
        settemplateconfig3.setLoginId(attach.getPhoneMask());
        settemplateconfig3.setNickname(attach.getNickname());
        settemplateconfig3.setUsername(attach.getUsername());
        return settemplateconfig3;
    }
}
