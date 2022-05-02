package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.getAnimatedVisibility;
import o.setContentHeight;

public class MultiInstanceInvalidationClient$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ setContentHeight this$0;

    public MultiInstanceInvalidationClient$1(setContentHeight setcontentheight) {
        this.this$0 = setcontentheight;
    }

    public void onInvalidation(final String[] strArr) {
        this.this$0.isInside.execute(new Runnable() {
            public final void run() {
                getAnimatedVisibility getanimatedvisibility = MultiInstanceInvalidationClient$1.this.this$0.getMax;
                String[] strArr = strArr;
                synchronized (getanimatedvisibility.toFloatRange) {
                    Iterator<Map.Entry<getAnimatedVisibility.setMax, getAnimatedVisibility.setMin>> it = getanimatedvisibility.toFloatRange.iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        if (!((getAnimatedVisibility.setMax) next.getKey()).setMin()) {
                            getAnimatedVisibility.setMin setmin = (getAnimatedVisibility.setMin) next.getValue();
                            Set<String> set = null;
                            if (setmin.setMax.length == 1) {
                                int length = strArr.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    } else if (strArr[i].equalsIgnoreCase(setmin.setMax[0])) {
                                        set = setmin.getMax;
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            } else {
                                HashSet hashSet = new HashSet();
                                for (String str : strArr) {
                                    String[] strArr2 = setmin.setMax;
                                    int length2 = strArr2.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length2) {
                                            break;
                                        }
                                        String str2 = strArr2[i2];
                                        if (str2.equalsIgnoreCase(str)) {
                                            hashSet.add(str2);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                if (hashSet.size() > 0) {
                                    set = hashSet;
                                }
                            }
                            if (set != null) {
                                setmin.getMin.getMin(set);
                            }
                        }
                    }
                }
            }
        });
    }
}
