package com.alibaba.ariver.app.api.point.engine;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@AutoExtension
public interface EngineInitFailedPoint extends Extension {
    public static final Comparator<Action> ACTION_COMPARATOR = new Comparator<Action>() {
        public final int compare(Action action, Action action2) {
            if (action == null) {
                return -1;
            }
            if (action2 == null || action.ordinal() > action2.ordinal()) {
                return 1;
            }
            if (action.ordinal() < action2.ordinal()) {
                return -1;
            }
            return 0;
        }
    };
    public static final ResultResolver<Action> RESULT_RESOLVER = new ResultResolver<Action>() {
        public final Action resolve(List<Action> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Collections.sort(list, EngineInitFailedPoint.ACTION_COMPARATOR);
            return list.get(list.size() - 1);
        }
    };

    public enum Action {
        IGNORE,
        REENTER,
        SHOW_ERROR,
        SHOW_ALERT,
        EXIT
    }

    @ThreadType(ExecutorType.URGENT)
    Action onEngineInitFailed();
}
