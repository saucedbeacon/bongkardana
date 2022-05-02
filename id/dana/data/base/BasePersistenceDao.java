package id.dana.data.base;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import o.AuthSkipResultModel;
import o.DataNode;
import o.ErrId;
import o.InvokeException;
import o.NodeAware;
import o.PageShowLoadingPoint;
import o.RemoteDebugUtils;
import o.RemoteNormalExtensionInvoker;
import o.com_alibaba_ariver_app_api_ExtOpt$77$1;
import o.com_alibaba_ariver_app_api_ExtOpt$80$1;
import o.decide;
import o.exitRemoteDebug;
import o.isRemoteDebugMode;
import o.sendNetworkResponse;
import o.setCanSkipAuth;
import o.setShowType;
import o.setSuccessScopes;
import o.showLoading;

@Database(entities = {NodeAware.class, InvokeException.class, RemoteNormalExtensionInvoker.class, DataNode.class, sendNetworkResponse.class, RemoteDebugUtils.class, AuthSkipResultModel.class, setShowType.class, PageShowLoadingPoint.class, com_alibaba_ariver_app_api_ExtOpt$80$1.class}, exportSchema = false, version = 16)
public abstract class BasePersistenceDao extends RoomDatabase {
    public abstract ErrId.ErrCodeWebview danaUserContactDao();

    public abstract setSuccessScopes followerDao();

    public abstract setCanSkipAuth followingDao();

    public abstract showLoading geofenceDao();

    public abstract com_alibaba_ariver_app_api_ExtOpt$77$1 loyaltyReceiptDao();

    public abstract decide recentBankDao();

    public abstract ErrId.ErrValue recentContactDao();

    public abstract exitRemoteDebug recentPayerSplitBillDao();

    public abstract isRemoteDebugMode splitBillHistoryDao();

    public void endTransaction() {
        try {
            super.endTransaction();
        } catch (Exception e) {
            if (e.getClass().getName().contains("CursorWindowAllocationException")) {
                FirebaseCrashlytics.getInstance().recordException(e);
                return;
            }
            throw e;
        }
    }
}
