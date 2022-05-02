package o;

import android.os.AsyncTask;
import com.google.common.base.Preconditions;
import io.split.android.client.SplitClient;
import io.split.android.client.events.SplitEventTaskMethodNotImplementedException;

public class dynamicDecryptByteArray extends dynamicEncrypt {
    private SplitClient _sclient;

    public dynamicDecryptByteArray(atlasSafeEncrypt atlassafeencrypt, SplitClient splitClient) {
        super(atlassafeencrypt);
        Preconditions.checkNotNull(atlassafeencrypt);
        this._sclient = (SplitClient) Preconditions.checkNotNull(splitClient);
    }

    public void execute() {
        this._asyncTansk = new AsyncTask<SplitClient, Void, SplitClient>() {
            /* access modifiers changed from: protected */
            public final SplitClient doInBackground(SplitClient... splitClientArr) {
                if (splitClientArr.length <= 0) {
                    return null;
                }
                SplitClient splitClient = (SplitClient) Preconditions.checkNotNull(splitClientArr[0]);
                try {
                    dynamicDecryptByteArray.this._task.onPostExecution(splitClient);
                } catch (SplitEventTaskMethodNotImplementedException unused) {
                }
                return splitClient;
            }

            /* access modifiers changed from: protected */
            public final void onPostExecute(SplitClient splitClient) {
                Preconditions.checkNotNull(splitClient);
                try {
                    dynamicDecryptByteArray.this._task.onPostExecutionView(splitClient);
                } catch (SplitEventTaskMethodNotImplementedException unused) {
                }
            }
        };
        this._asyncTansk.execute(new SplitClient[]{this._sclient});
    }
}
