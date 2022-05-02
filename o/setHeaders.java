package o;

public class setHeaders {
    private String activityContent;
    private String activityId;
    private String activityTitle;
    private String actorAvatar;
    private String actorNickname;
    private String bizType;
    private boolean clickable;
    private String content;
    private long createdTime;
    private String feedType;
    private String imageUrl;
    private String redirectUrl;
    private String targetNickname;
    private String verb;

    public String getActivityContent() {
        return this.activityContent;
    }

    public void setActivityContent(String str) {
        this.activityContent = str;
    }

    public String getActivityTitle() {
        return this.activityTitle;
    }

    public void setActivityTitle(String str) {
        this.activityTitle = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public String getActorNickname() {
        return this.actorNickname;
    }

    public void setActorNickname(String str) {
        this.actorNickname = str;
    }

    public String getTargetNickname() {
        return this.targetNickname;
    }

    public void setTargetNickname(String str) {
        this.targetNickname = str;
    }

    public String getVerb() {
        return this.verb;
    }

    public void setVerb(String str) {
        this.verb = str;
    }

    public String getActorAvatar() {
        return this.actorAvatar;
    }

    public void setActorAvatar(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(383175236, oncanceled);
            onCancelLoad.getMin(383175236, oncanceled);
        }
        this.actorAvatar = str;
    }

    public long getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(long j) {
        this.createdTime = j;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public void setClickable(boolean z) {
        this.clickable = z;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public String getFeedType() {
        return this.feedType;
    }

    public void setFeedType(String str) {
        this.feedType = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }
}
