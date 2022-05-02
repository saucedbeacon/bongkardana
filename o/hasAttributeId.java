package o;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RequiresApi(16)
public class hasAttributeId {
    private static boolean getMin;
    private static Field length;
    private static final Object setMax = new Object();
    private static final Object setMin = new Object();

    public static SparseArray<Bundle> length(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle length(Notification notification) {
        synchronized (setMin) {
            if (getMin) {
                return null;
            }
            try {
                if (length == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        getMin = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    length = declaredField;
                }
                Bundle bundle = (Bundle) length.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    length.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                getMin = true;
                return null;
            }
        }
    }

    public static Bundle setMax(Notification.Builder builder, NotificationCompat.Action action) {
        IconCompat length2 = action.length();
        builder.addAction(length2 != null ? length2.getMax() : 0, action.setMin(), action.setMax());
        Bundle bundle = new Bundle(action.getMax());
        if (action.isInside() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", setMax(action.isInside()));
        }
        if (action.toIntRange() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", setMax(action.toIntRange()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.equals());
        return bundle;
    }

    static Bundle setMax(NotificationCompat.Action action) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat length2 = action.length();
        bundle2.putInt("icon", length2 != null ? length2.getMax() : 0);
        bundle2.putCharSequence("title", action.setMin());
        bundle2.putParcelable("actionIntent", action.setMax());
        if (action.getMax() != null) {
            bundle = new Bundle(action.getMax());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.equals());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", setMax(action.isInside()));
        bundle2.putBoolean("showsUserInterface", action.toDoubleRange());
        bundle2.putInt("semanticAction", action.toFloatRange());
        return bundle2;
    }

    private static Bundle getMax(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteInput.length);
        bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, remoteInput.setMax);
        bundle.putCharSequenceArray("choices", remoteInput.getMax);
        bundle.putBoolean("allowFreeFormInput", remoteInput.getMax());
        bundle.putBundle("extras", remoteInput.getMin);
        Set<String> set = remoteInput.setMin;
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList(set.size());
            for (String add : set) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] setMax(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = getMax(remoteInputArr[i]);
        }
        return bundleArr;
    }
}
