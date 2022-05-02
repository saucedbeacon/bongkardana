package o;

import java.util.Date;

public class getFree {
    private DefaultClassLoaderFactory activeQuest;
    private Date missionExpireTime;
    private String missionId;
    private String missionStatus;
    private String missionThumbnail;

    public String getMissionId() {
        return this.missionId;
    }

    public void setMissionId(String str) {
        this.missionId = str;
    }

    public DefaultClassLoaderFactory getActiveQuest() {
        return this.activeQuest;
    }

    public void setActiveQuest(DefaultClassLoaderFactory defaultClassLoaderFactory) {
        this.activeQuest = defaultClassLoaderFactory;
    }

    public Date getMissionExpireTime() {
        return this.missionExpireTime;
    }

    public void setMissionExpireTime(Date date) {
        this.missionExpireTime = date;
    }

    public String getMissionStatus() {
        return this.missionStatus;
    }

    public void setMissionStatus(String str) {
        this.missionStatus = str;
    }

    public String getMissionThumbnail() {
        return this.missionThumbnail;
    }

    public void setMissionThumbnail(String str) {
        this.missionThumbnail = str;
    }
}
