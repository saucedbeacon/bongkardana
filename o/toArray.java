package o;

public class toArray {
    private boolean completed;
    private String failReason;
    private String label;

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean z) {
        this.completed = z;
    }

    public String getFailReason() {
        return this.failReason;
    }

    public void setFailReason(String str) {
        this.failReason = str;
    }
}
