package o;

import android.os.Looper;

public interface AlipayKeyboard {
    initializeKeyboard createPoster(onInput oninput);

    boolean isMainThread();

    public class AliKeyboardAction {
        private Object executionContext;
        protected final boolean suppressErrorUi;
        protected final Throwable throwable;

        public AliKeyboardAction(Throwable th) {
            this.throwable = th;
            this.suppressErrorUi = false;
        }

        public AliKeyboardAction(Throwable th, boolean z) {
            this.throwable = th;
            this.suppressErrorUi = z;
        }

        public Throwable getThrowable() {
            return this.throwable;
        }

        public boolean isSuppressErrorUi() {
            return this.suppressErrorUi;
        }

        public Object getExecutionScope() {
            return this.executionContext;
        }

        public void setExecutionScope(Object obj) {
            this.executionContext = obj;
        }
    }

    public static class setMax implements AlipayKeyboard {
        private final Looper looper;

        public setMax(Looper looper2) {
            this.looper = looper2;
        }

        public final boolean isMainThread() {
            return this.looper == Looper.myLooper();
        }

        public final initializeKeyboard createPoster(onInput oninput) {
            return new onStatisticEvent(oninput, this.looper, 10);
        }
    }
}
