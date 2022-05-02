package o;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.exoplayer2.C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.RequiresOptIn;

@RequiresApi(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class level extends RequiresOptIn.Level {
    /* access modifiers changed from: protected */
    public Typeface getMax(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.setMin, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.toFloatRange.invoke((Object) null, new Object[]{newInstance, C.SANS_SERIF_NAME, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public Method toIntRange(Class<?> cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
