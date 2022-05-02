package o;

import io.split.android.client.dtos.Split;
import java.util.List;

public class getSecurityToken {
    private final List<Split> activeSplits;
    private final List<Split> archivedSplits;
    private final long changeNumber;
    private final long updateTimestamp;

    public getSecurityToken(List<Split> list, List<Split> list2, long j, long j2) {
        this.activeSplits = list;
        this.archivedSplits = list2;
        this.changeNumber = j;
        this.updateTimestamp = j2;
    }

    public List<Split> getActiveSplits() {
        return this.activeSplits;
    }

    public List<Split> getArchivedSplits() {
        return this.archivedSplits;
    }

    public long getChangeNumber() {
        return this.changeNumber;
    }

    public long getUpdateTimestamp() {
        return this.updateTimestamp;
    }
}
