package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.LogContextImpl;
import o.TitleBarRightButtonView;

public final class getLogCategory extends LogContextImpl.AppendWorker.setMin {
    @Nullable
    private final hasCornerMarking length = null;
    private final boolean setMin = false;

    public final LogContextImpl.AppendWorker<?, ?> length(Type type) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> length2 = ProcessInfoImpl.length(type);
        if (length2 == setFavoriteBtnVisibility.class) {
            return new writeFile(Void.class, this.length, this.setMin, false, true, false, false, false, true);
        }
        boolean z3 = length2 == setBadgeData.class;
        boolean z4 = length2 == TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.class;
        boolean z5 = length2 == isCornerMarkingShow.class;
        if (length2 != TitleBarRightButtonView.AnonymousClass1.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type length3 = ProcessInfoImpl.length(0, (ParameterizedType) type);
        Class<?> length4 = ProcessInfoImpl.length(length3);
        if (length4 == getAppenderManager.class) {
            if (length3 instanceof ParameterizedType) {
                type2 = ProcessInfoImpl.length(0, (ParameterizedType) length3);
                z2 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (length4 != Appender.class) {
            type2 = length3;
            z2 = false;
            z = true;
            return new writeFile(type2, this.length, this.setMin, z2, z, z3, z4, z5, false);
        } else if (length3 instanceof ParameterizedType) {
            type2 = ProcessInfoImpl.length(0, (ParameterizedType) length3);
            z2 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z = false;
        return new writeFile(type2, this.length, this.setMin, z2, z, z3, z4, z5, false);
    }
}
