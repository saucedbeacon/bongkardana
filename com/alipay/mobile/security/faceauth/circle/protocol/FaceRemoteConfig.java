package com.alipay.mobile.security.faceauth.circle.protocol;

import com.alipay.mobile.security.bio.config.bean.Algorithm;
import com.alipay.mobile.security.bio.config.bean.Coll;
import com.alipay.mobile.security.bio.config.bean.FaceTips;
import com.alipay.mobile.security.bio.config.bean.NavigatePage;
import com.alipay.mobile.security.bio.config.bean.SceneEnv;
import com.alipay.mobile.security.bio.config.bean.Upload;
import com.alipay.mobile.security.bio.utils.StringUtil;

public class FaceRemoteConfig {
    private Algorithm algorithm = new Algorithm();
    private Coll coll = new Coll();
    private DeviceSetting[] deviceSettings = new DeviceSetting[0];
    private int env = 0;
    private FaceTips faceTips = new FaceTips();
    private NavigatePage navi = new NavigatePage();
    private SceneEnv sceneEnv = new SceneEnv();
    private int ui = 991;
    private Upload upload = new Upload();

    public void setSceneEnv(SceneEnv sceneEnv2) {
        this.sceneEnv = sceneEnv2;
    }

    public SceneEnv getSceneEnv() {
        return this.sceneEnv;
    }

    public void setNavi(NavigatePage navigatePage) {
        this.navi = navigatePage;
    }

    public NavigatePage getNavi() {
        return this.navi;
    }

    public void setColl(Coll coll2) {
        this.coll = coll2;
    }

    public Coll getColl() {
        return this.coll;
    }

    public void setUpload(Upload upload2) {
        this.upload = upload2;
    }

    public Upload getUpload() {
        return this.upload;
    }

    public void setAlgorithm(Algorithm algorithm2) {
        this.algorithm = algorithm2;
    }

    public Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public void setEnv(int i) {
        this.env = i;
    }

    public int getEnv() {
        return this.env;
    }

    public void setUi(int i) {
        this.ui = i;
    }

    public int getUi() {
        return this.ui;
    }

    public FaceTips getFaceTips() {
        return this.faceTips;
    }

    public void setFaceTips(FaceTips faceTips2) {
        this.faceTips = faceTips2;
    }

    public DeviceSetting[] getDeviceSettings() {
        return this.deviceSettings;
    }

    public void setDeviceSettings(DeviceSetting[] deviceSettingArr) {
        this.deviceSettings = deviceSettingArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FaceRemoteConfig{sceneEnv=");
        sb.append(this.sceneEnv);
        sb.append(", navi=");
        sb.append(this.navi);
        sb.append(", coll=");
        sb.append(this.coll);
        sb.append(", upload=");
        sb.append(this.upload);
        sb.append(", algorithm=");
        sb.append(this.algorithm);
        sb.append(", faceTips=");
        sb.append(this.faceTips);
        sb.append(", deviceSettings=");
        sb.append(StringUtil.array2String(this.deviceSettings));
        sb.append(", env=");
        sb.append(this.env);
        sb.append(", ui=");
        sb.append(this.ui);
        sb.append('}');
        return sb.toString();
    }
}
