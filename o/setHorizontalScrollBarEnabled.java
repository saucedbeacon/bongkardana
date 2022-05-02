package o;

public class setHorizontalScrollBarEnabled {
    public static final String FEEDBACK_ENABLE = "feedback_enable";
    public static final String FEEDBACK_URL = "feedback_url";
    private boolean feedbackEnable;
    private String feedbackUrl;

    public boolean isFeedbackEnable() {
        return this.feedbackEnable;
    }

    public void setFeedbackEnable(boolean z) {
        this.feedbackEnable = z;
    }

    public String getFeedbackUrl() {
        return this.feedbackUrl;
    }

    public void setFeedbackUrl(String str) {
        this.feedbackUrl = str;
    }
}
