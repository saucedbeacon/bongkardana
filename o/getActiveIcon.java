package o;

import androidx.annotation.NonNull;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAmcsLiteConfig;
import o.GriverInnerAmcsLiteConfig;
import o.NullBeaconDataFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0015J\"\u0010\t\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/data/homeinfo/mapper/HomeInfoResultMapper;", "", "serializer", "Lid/dana/data/storage/Serializer;", "(Lid/dana/data/storage/Serializer;)V", "getSpmId", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;", "entity", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "transform", "Lid/dana/domain/homeinfo/KycResponse;", "Lid/dana/data/homeinfo/model/KycEntity;", "Lid/dana/domain/homeinfo/ProcessingTransactionResponse;", "Lid/dana/data/homeinfo/model/ProcessingTransactionEntity;", "Lid/dana/domain/homeinfo/SurveyInfoResponse;", "Lid/dana/data/homeinfo/model/SurveyInfo;", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "Lid/dana/domain/homeinfo/HomeInfoResponse;", "Lid/dana/data/homeinfo/repository/source/network/result/HomeInfoResult;", "Lid/dana/domain/user/CurrencyAmount;", "Lid/dana/data/model/CurrencyAmountResult;", "", "entities", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "thirdPartyServices", "key", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getActiveIcon {
    private final PluginInstallCallback serializer;

    @Inject
    public getActiveIcon(@NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
    }

    @Nullable
    public final GriverAmcsLiteConfig.AnonymousClass2 transform(@Nullable flushMessages flushmessages) {
        if (flushmessages == null) {
            return null;
        }
        GriverAmcsLiteConfig.AnonymousClass2 r0 = new initWithSecurityGuard() {
            private GriverAmcsLiteConfig akuInfo;
            private String avatarUrl;
            private stopBleScan balance;
            private onConfigChanged kyc;
            private String mobileNo;
            private String nickname;
            private setConfigProxy processingTrans;
            private GriverInnerAmcsLiteConfig.AnonymousClass1 surveyInfo;
            private List<ThirdPartyServiceResponse> thirdPartyLinks;

            public String getMobileNo() {
                return this.mobileNo;
            }

            public void setMobileNo(String str) {
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(538879853, oncanceled);
                    onCancelLoad.getMin(538879853, oncanceled);
                }
                this.mobileNo = str;
            }

            public stopBleScan getBalance() {
                return this.balance;
            }

            public void setBalance(stopBleScan stopblescan) {
                this.balance = stopblescan;
            }

            public String getAvatarUrl() {
                return this.avatarUrl;
            }

            public void setAvatarUrl(String str) {
                this.avatarUrl = str;
            }

            public String getNickname() {
                return this.nickname;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }

            public setConfigProxy getProcessingTrans() {
                return this.processingTrans;
            }

            public void setProcessingTrans(setConfigProxy setconfigproxy) {
                this.processingTrans = setconfigproxy;
            }

            public List<ThirdPartyServiceResponse> getThirdPartyLinks() {
                return this.thirdPartyLinks;
            }

            public void setThirdPartyLinks(List<ThirdPartyServiceResponse> list) {
                this.thirdPartyLinks = list;
            }

            public onConfigChanged getKyc() {
                return this.kyc;
            }

            public void setKyc(onConfigChanged onconfigchanged) {
                this.kyc = onconfigchanged;
            }

            public GriverInnerAmcsLiteConfig.AnonymousClass1 getSurveyInfo() {
                return this.surveyInfo;
            }

            public void setSurveyInfo(GriverInnerAmcsLiteConfig.AnonymousClass1 r1) {
                this.surveyInfo = r1;
            }

            public GriverAmcsLiteConfig getAkuInfo() {
                return this.akuInfo;
            }

            public void setAkuInfo(GriverAmcsLiteConfig griverAmcsLiteConfig) {
                this.akuInfo = griverAmcsLiteConfig;
            }
        };
        r0.setMobileNo(flushmessages.getMobileNo());
        r0.setBalance(transform(flushmessages.getBalance()));
        r0.setAvatarUrl(flushmessages.getAvatarUrl());
        r0.setNickname(flushmessages.getNickname());
        r0.setProcessingTrans(transform(flushmessages.getProcessingTrans()));
        r0.setThirdPartyLinks(transform(flushmessages.getThirdPartyLinks()));
        r0.setKyc(transform(flushmessages.getKyc()));
        r0.setSurveyInfo(transform(flushmessages.getSurveyInfo()));
        r0.setAkuInfo(flushmessages.getAkuInfo());
        return r0;
    }

    private final stopBleScan transform(registerWorker registerworker) {
        if (registerworker != null) {
            return new stopBleScan(registerworker.getAmount(), registerworker.getCurrency());
        }
        return null;
    }

    private final setConfigProxy transform(getUrl geturl) {
        if (geturl == null) {
            return null;
        }
        setConfigProxy setconfigproxy = new setConfigProxy();
        setconfigproxy.setCount(geturl.count);
        setconfigproxy.setHasMore(geturl.hasMore);
        return setconfigproxy;
    }

    @NotNull
    public final List<ThirdPartyServiceResponse> transform(@Nullable List<TitleBar> list) {
        List<ThirdPartyServiceResponse> list2;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (TitleBar transform : list) {
                ThirdPartyServiceResponse transform2 = transform(transform);
                if (transform2 != null) {
                    arrayList.add(transform2);
                }
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    @NotNull
    public final NullBeaconDataFactory.AnonymousClass1 transform(@Nullable List<ThirdPartyServiceResponse> list, @Nullable String str) {
        NullBeaconDataFactory.AnonymousClass1 r0 = new Object() {
            private String key;
            private List<ThirdPartyServiceResponse> thirdPartyServices;

            public String getKey() {
                return this.key;
            }

            public void setKey(String str) {
                this.key = str;
            }

            public List<ThirdPartyServiceResponse> getThirdPartyServices() {
                return this.thirdPartyServices;
            }

            public void setThirdPartyServices(List<ThirdPartyServiceResponse> list) {
                this.thirdPartyServices = list;
            }

            @NonNull
            public String toString() {
                StringBuilder sb = new StringBuilder("ThirdPartyCategoryService{key='");
                sb.append(this.key);
                sb.append('\'');
                sb.append(", thirdPartyServices=");
                sb.append(this.thirdPartyServices);
                sb.append('}');
                return sb.toString();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    AnonymousClass1 r5 = (AnonymousClass1) obj;
                    return Objects.equals(this.key, r5.key) && Objects.equals(this.thirdPartyServices, r5.thirdPartyServices);
                }
            }

            public int hashCode() {
                return Objects.hash(new Object[]{this.key, this.thirdPartyServices});
            }
        };
        r0.setKey(str);
        r0.setThirdPartyServices(list);
        return r0;
    }

    private final onConfigChanged transform(setName setname) {
        if (setname == null) {
            return null;
        }
        onConfigChanged onconfigchanged = new onConfigChanged();
        onconfigchanged.setLevel(setname.level);
        onconfigchanged.setOrderStatus(setname.orderStatus);
        return onconfigchanged;
    }

    private final GriverInnerAmcsLiteConfig.AnonymousClass1 transform(generateTabBarColorModel generatetabbarcolormodel) {
        if (generatetabbarcolormodel == null) {
            return null;
        }
        GriverInnerAmcsLiteConfig.AnonymousClass1 r0 = new Object() {
            private boolean hasActiveSurvey;
            private String innerUrl;

            public boolean isHasActiveSurvey() {
                return this.hasActiveSurvey;
            }

            public void setHasActiveSurvey(boolean z) {
                this.hasActiveSurvey = z;
            }

            public String getInnerUrl() {
                return this.innerUrl;
            }

            public void setInnerUrl(String str) {
                this.innerUrl = str;
            }
        };
        r0.setHasActiveSurvey(generatetabbarcolormodel.hasActiveSurvey);
        r0.setInnerUrl(generatetabbarcolormodel.innerUrl);
        return r0;
    }

    @Nullable
    public final ThirdPartyServiceResponse transform(@Nullable TitleBar titleBar) {
        if (titleBar == null) {
            return null;
        }
        ThirdPartyServiceResponse thirdPartyServiceResponse = r1;
        ThirdPartyServiceResponse thirdPartyServiceResponse2 = new ThirdPartyServiceResponse((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (ThirdPartyServiceResponse.SpmId) null, false, (List) null, (GriverInnerAmcsLiteConfig) null, (String) null, FlexItem.MAX_SIZE, (DefaultConstructorMarker) null);
        String key = titleBar.getKey();
        if (key == null) {
            key = "";
        }
        thirdPartyServiceResponse.setKey(key);
        thirdPartyServiceResponse.setIcon(titleBar.getIcon());
        thirdPartyServiceResponse.setLink(titleBar.getLink());
        thirdPartyServiceResponse.setName(titleBar.getName());
        thirdPartyServiceResponse.setNameInd(titleBar.getNameInd());
        thirdPartyServiceResponse.setNameTag(titleBar.getNameTag());
        thirdPartyServiceResponse.setEnable(titleBar.getEnable());
        thirdPartyServiceResponse.setAction(titleBar.getAction());
        thirdPartyServiceResponse.setOperationType(titleBar.getOperationType());
        thirdPartyServiceResponse.setRedirectUrl(titleBar.getRedirectUrl());
        thirdPartyServiceResponse.setClientId(titleBar.getClientId());
        thirdPartyServiceResponse.setAppId(titleBar.getAppId());
        thirdPartyServiceResponse.setScopes(titleBar.getScopes());
        thirdPartyServiceResponse.setUserAction(titleBar.getUserAction());
        thirdPartyServiceResponse.setDescription(titleBar.getDescription());
        thirdPartyServiceResponse.setButtonTitle(titleBar.getButtonTitle());
        thirdPartyServiceResponse.setKeyword(titleBar.getKeyword());
        thirdPartyServiceResponse.setRibbonText(titleBar.getRibbonText());
        thirdPartyServiceResponse.setHasRedDot(titleBar.getHasRedDot());
        thirdPartyServiceResponse.setSpmId(getSpmId(titleBar));
        inflateFromResource skuAttr = titleBar.getSkuAttr();
        thirdPartyServiceResponse.setSkuAttr(skuAttr != null ? TabBarModel.toSkuAttribute(skuAttr) : null);
        thirdPartyServiceResponse.setSpaceCodes(titleBar.getSpaceCodes());
        thirdPartyServiceResponse.setNeedConsult(titleBar.getNeedConsult());
        return thirdPartyServiceResponse;
    }

    private final ThirdPartyServiceResponse.SpmId getSpmId(TitleBar titleBar) {
        if (titleBar.getSpmId() != null) {
            return (ThirdPartyServiceResponse.SpmId) this.serializer.deserialize(titleBar.getSpmId(), ThirdPartyServiceResponse.SpmId.class);
        }
        return null;
    }
}
