package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class flushMessages extends BaseRpcResult {
    private transient GriverAmcsLiteConfig akuInfo;
    private String avatarUrl;
    private transient registerWorker balance;
    private transient setName kyc;
    private String mobileNo;
    private String nickname;
    public String paylaterChannel;
    private transient getUrl processingTrans;
    private transient generateTabBarColorModel surveyInfo;
    private List<TitleBar> thirdPartyLinks;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public registerWorker getBalance() {
        return this.balance;
    }

    public void setBalance(registerWorker registerworker) {
        this.balance = registerworker;
    }

    public setName getKyc() {
        return this.kyc;
    }

    public void setKyc(setName setname) {
        this.kyc = setname;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String str) {
        this.mobileNo = str;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public getUrl getProcessingTrans() {
        return this.processingTrans;
    }

    public void setProcessingTrans(getUrl geturl) {
        this.processingTrans = geturl;
    }

    public generateTabBarColorModel getSurveyInfo() {
        return this.surveyInfo;
    }

    public void setSurveyInfo(generateTabBarColorModel generatetabbarcolormodel) {
        this.surveyInfo = generatetabbarcolormodel;
    }

    public GriverAmcsLiteConfig getAkuInfo() {
        return this.akuInfo;
    }

    public void setAkuInfo(GriverAmcsLiteConfig griverAmcsLiteConfig) {
        this.akuInfo = griverAmcsLiteConfig;
    }

    public List<TitleBar> getThirdPartyLinks() {
        return this.thirdPartyLinks;
    }

    public void setThirdPartyLinks(List<TitleBar> list) {
        this.thirdPartyLinks = list;
    }
}
