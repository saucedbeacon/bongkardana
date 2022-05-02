package o;

public class result extends initWithSecurityGuard {
    private String nextTaskRedirectUrl;
    private String referredNextTask;

    public String getReferredNextTask() {
        return this.referredNextTask;
    }

    public void setReferredNextTask(String str) {
        this.referredNextTask = str;
    }

    public String getNextTaskRedirectUrl() {
        return this.nextTaskRedirectUrl;
    }

    public void setNextTaskRedirectUrl(String str) {
        this.nextTaskRedirectUrl = str;
    }
}
