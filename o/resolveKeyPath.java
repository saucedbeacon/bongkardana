package o;

import o.TitleBarRightButtonView;

public interface resolveKeyPath<T> {
    TitleBarRightButtonView.AnonymousClass1<T> getObject(String str, Class<T> cls);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveData(String str, T t);
}
