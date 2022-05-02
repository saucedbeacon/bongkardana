package o;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.Split;
import java.util.ArrayList;
import java.util.List;

public class registerInitListener {
    private final long changeNumber;
    private final List<Split> splits;
    private final String splitsFilterQueryString;
    private final long updateTimestamp;

    public registerInitListener(List<Split> list, long j, long j2, String str) {
        this.changeNumber = j;
        this.splits = list;
        this.updateTimestamp = j2;
        this.splitsFilterQueryString = str;
    }

    public long getChangeNumber() {
        return this.changeNumber;
    }

    public long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public String getSplitsFilterQueryString() {
        return this.splitsFilterQueryString;
    }

    @NonNull
    public List<Split> getSplits() {
        List<Split> list = this.splits;
        return list != null ? list : new ArrayList();
    }
}
