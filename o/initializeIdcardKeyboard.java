package o;

import android.os.Bundle;
import o.AlipayKeyboard;

public abstract class initializeIdcardKeyboard<T> {
    protected final setKeyboardActionListener config;

    /* access modifiers changed from: protected */
    public abstract T createErrorFragment(AlipayKeyboard.AliKeyboardAction aliKeyboardAction, Bundle bundle);

    protected initializeIdcardKeyboard(setKeyboardActionListener setkeyboardactionlistener) {
        this.config = setkeyboardactionlistener;
    }

    /* access modifiers changed from: protected */
    public T prepareErrorFragment(AlipayKeyboard.AliKeyboardAction aliKeyboardAction, boolean z, Bundle bundle) {
        Bundle bundle2;
        if (aliKeyboardAction.isSuppressErrorUi()) {
            return null;
        }
        if (bundle != null) {
            bundle2 = (Bundle) bundle.clone();
        } else {
            bundle2 = new Bundle();
        }
        if (!bundle2.containsKey(AlipayKeyboardActionListener.KEY_TITLE)) {
            bundle2.putString(AlipayKeyboardActionListener.KEY_TITLE, getTitleFor(aliKeyboardAction, bundle2));
        }
        if (!bundle2.containsKey(AlipayKeyboardActionListener.KEY_MESSAGE)) {
            bundle2.putString(AlipayKeyboardActionListener.KEY_MESSAGE, getMessageFor(aliKeyboardAction, bundle2));
        }
        if (!bundle2.containsKey(AlipayKeyboardActionListener.KEY_FINISH_AFTER_DIALOG)) {
            bundle2.putBoolean(AlipayKeyboardActionListener.KEY_FINISH_AFTER_DIALOG, z);
        }
        if (!bundle2.containsKey(AlipayKeyboardActionListener.KEY_EVENT_TYPE_ON_CLOSE) && this.config.defaultEventTypeOnDialogClosed != null) {
            bundle2.putSerializable(AlipayKeyboardActionListener.KEY_EVENT_TYPE_ON_CLOSE, this.config.defaultEventTypeOnDialogClosed);
        }
        if (!bundle2.containsKey(AlipayKeyboardActionListener.KEY_ICON_ID) && this.config.defaultDialogIconId != 0) {
            bundle2.putInt(AlipayKeyboardActionListener.KEY_ICON_ID, this.config.defaultDialogIconId);
        }
        return createErrorFragment(aliKeyboardAction, bundle2);
    }

    /* access modifiers changed from: protected */
    public String getTitleFor(AlipayKeyboard.AliKeyboardAction aliKeyboardAction, Bundle bundle) {
        return this.config.resources.getString(this.config.defaultTitleId);
    }

    /* access modifiers changed from: protected */
    public String getMessageFor(AlipayKeyboard.AliKeyboardAction aliKeyboardAction, Bundle bundle) {
        return this.config.resources.getString(this.config.getMessageIdForThrowable(aliKeyboardAction.throwable));
    }
}
