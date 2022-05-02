package o;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

public class getStartUrl {
    @JSONField(name = "max_contact_sync_batch_size")
    @SerializedName("max_contact_sync_batch_size")
    private int maxContactSyncBatchSize;
    @JSONField(name = "synchronize_contact")
    @SerializedName("synchronize_contact")
    private boolean synchronizeContact;

    public boolean isSynchronizeContact() {
        return this.synchronizeContact;
    }

    public void setSynchronizeContact(boolean z) {
        this.synchronizeContact = z;
    }

    public int getMaxContactSyncBatchSize() {
        return this.maxContactSyncBatchSize;
    }

    public void setMaxContactSyncBatchSize(int i) {
        this.maxContactSyncBatchSize = i;
    }
}
