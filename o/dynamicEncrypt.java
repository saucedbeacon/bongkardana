package o;

import android.os.AsyncTask;
import io.split.android.client.SplitClient;

public abstract class dynamicEncrypt {
    protected AsyncTask<SplitClient, Void, SplitClient> _asyncTansk;
    protected atlasSafeEncrypt _task;

    public abstract void execute();

    protected dynamicEncrypt(atlasSafeEncrypt atlassafeencrypt) {
        this._task = atlassafeencrypt;
    }
}
