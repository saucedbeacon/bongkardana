package o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import o.LogContextImpl;

final class registerMasLog extends LogContextImpl.AppendWorker.setMin {
    final Executor getMax;

    registerMasLog(Executor executor) {
        this.getMax = executor;
    }

    static final class setMax<T> implements initLater<T> {
        final initLater<T> getMax;
        final Executor setMax;

        setMax(Executor executor, initLater<T> initlater) {
            this.setMax = executor;
            this.getMax = initlater;
        }

        public final void setMin(final initToolsProcessIfNeeded<T> inittoolsprocessifneeded) {
            ProcessInfoImpl.getMin(inittoolsprocessifneeded, "callback == null");
            this.getMax.setMin(new initToolsProcessIfNeeded<T>() {
                public final void getMin(final getAppenderManager<T> getappendermanager) {
                    setMax.this.setMax.execute(new Runnable() {
                        public final void run() {
                            if (setMax.this.getMax.getMin()) {
                                inittoolsprocessifneeded.setMax(setMax.this, new IOException("Canceled"));
                            } else {
                                inittoolsprocessifneeded.getMin(getappendermanager);
                            }
                        }
                    });
                }

                public final void setMax(initLater<T> initlater, final Throwable th) {
                    setMax.this.setMax.execute(new Runnable() {
                        public final void run() {
                            inittoolsprocessifneeded.setMax(setMax.this, th);
                        }
                    });
                }
            });
        }

        public final getAppenderManager<T> getMax() throws IOException {
            return this.getMax.getMax();
        }

        public final void length() {
            this.getMax.length();
        }

        public final boolean getMin() {
            return this.getMax.getMin();
        }

        public final initLater<T> setMin() {
            return new setMax(this.setMax, this.getMax.setMin());
        }

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            return new setMax(this.setMax, this.getMax.setMin());
        }
    }

    public final LogContextImpl.AppendWorker<?, ?> length(Type type) {
        if (ProcessInfoImpl.length(type) != initLater.class) {
            return null;
        }
        final Type max = ProcessInfoImpl.getMax(type);
        return new LogContextImpl.AppendWorker<Object, initLater<?>>() {
            public final Type getMin() {
                return max;
            }

            public final /* synthetic */ Object setMax(initLater initlater) {
                return new setMax(registerMasLog.this.getMax, initlater);
            }
        };
    }
}
