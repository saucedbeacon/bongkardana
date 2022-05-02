package o;

import java.io.Serializable;

public class DefaultClassLoaderFactory implements Serializable {
    private boolean hasPrize;
    private String questActionType;
    private String questDescription;
    private String questId;
    private String questName;
    private String questRedirectType;
    private String questRedirectValue;
    private String questStatus;

    public String getQuestId() {
        return this.questId;
    }

    public void setQuestId(String str) {
        this.questId = str;
    }

    public String getQuestName() {
        return this.questName;
    }

    public void setQuestName(String str) {
        this.questName = str;
    }

    public String getQuestDescription() {
        return this.questDescription;
    }

    public void setQuestDescription(String str) {
        this.questDescription = str;
    }

    public String getQuestStatus() {
        return this.questStatus;
    }

    public void setQuestStatus(String str) {
        this.questStatus = str;
    }

    public String getQuestActionType() {
        return this.questActionType;
    }

    public void setQuestActionType(String str) {
        this.questActionType = str;
    }

    public String getQuestRedirectType() {
        return this.questRedirectType;
    }

    public void setQuestRedirectType(String str) {
        this.questRedirectType = str;
    }

    public String getQuestRedirectValue() {
        return this.questRedirectValue;
    }

    public void setQuestRedirectValue(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(516885815, oncanceled);
            onCancelLoad.getMin(516885815, oncanceled);
        }
        this.questRedirectValue = str;
    }

    public boolean isHasPrize() {
        return this.hasPrize;
    }

    public void setHasPrize(boolean z) {
        this.hasPrize = z;
    }
}
