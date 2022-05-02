package o;

import android.view.View;
import id.dana.base.BaseKey;
import id.dana.base.KeyBaseActivity;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\bJ\u000b\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/base/KeyBaseFragment;", "T", "Lid/dana/base/KeyBaseActivity;", "K", "Lid/dana/base/BaseKey;", "Lid/dana/base/BaseFragment;", "()V", "getKey", "()Lid/dana/base/BaseKey;", "getParentActivity", "()Lid/dana/base/KeyBaseActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class MultiInstanceInvalidationService<T extends KeyBaseActivity<?>, K extends BaseKey> extends FtsOptions$Order {
    private HashMap setMin;

    /* renamed from: o.MultiInstanceInvalidationService$2  reason: invalid class name */
    public interface AnonymousClass2 {
    }

    public View getMax(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void getMax() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        getMax();
    }
}
