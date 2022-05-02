package com.alipay.mobile.security.bio.config.bean;

public class SceneEnv {
    private String sceneCode = "";
    private String sceneType = "normal";

    public void setSceneCode(String str) {
        this.sceneCode = str;
    }

    public String getSceneCode() {
        return this.sceneCode;
    }

    public void setSceneType(String str) {
        this.sceneType = str;
    }

    public String getSceneType() {
        return this.sceneType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SceneEnv{sceneCode='");
        sb.append(this.sceneCode);
        sb.append('\'');
        sb.append(", sceneType='");
        sb.append(this.sceneType);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
