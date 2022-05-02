package o;

import io.split.android.client.SplitClient;
import io.split.android.client.events.SplitEventTaskMethodNotImplementedException;

public class atlasSafeEncrypt {
    public void onPostExecution(SplitClient splitClient) {
        throw new SplitEventTaskMethodNotImplementedException();
    }

    public void onPostExecutionView(SplitClient splitClient) {
        throw new SplitEventTaskMethodNotImplementedException();
    }
}
