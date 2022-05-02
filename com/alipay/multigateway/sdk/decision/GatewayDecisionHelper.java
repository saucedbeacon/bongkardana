package com.alipay.multigateway.sdk.decision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.multigateway.sdk.ConditionValueGetter;
import com.alipay.multigateway.sdk.GatewayInfo;
import com.alipay.multigateway.sdk.Rule;
import com.alipay.multigateway.sdk.decision.condition.Condition;
import com.alipay.multigateway.sdk.decision.condition.ConditionProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GatewayDecisionHelper {
    private ConditionProcessor conditionProcessor = new ConditionProcessor();
    private ConditionValueGetter conditionValueGetter;
    @NonNull
    private List<Rule> rules = new ArrayList();

    public GatewayDecisionHelper(ConditionValueGetter conditionValueGetter2) {
        this.conditionValueGetter = conditionValueGetter2;
    }

    @NonNull
    public List<Rule> getRules() {
        return this.rules;
    }

    public synchronized void replaceRules(@NonNull List<Rule> list) {
        sortRules(list);
        this.rules = list;
    }

    public synchronized void addRules(@NonNull List<Rule> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Rule next : list) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= this.rules.size()) {
                        break;
                    } else if (TextUtils.equals(next.getName(), this.rules.get(i).getName())) {
                        this.rules.set(i, next);
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    arrayList.add(next);
                }
            }
            this.rules.addAll(arrayList);
            sortRules(this.rules);
        }
    }

    private static void sortRules(@NonNull List<Rule> list) {
        Collections.sort(list, new Comparator<Rule>() {
            public final int compare(Rule rule, Rule rule2) {
                if (rule == null || rule2 == null) {
                    return 0;
                }
                return rule2.getPriority() - rule.getPriority();
            }
        });
    }

    @Nullable
    public synchronized GatewayInfo decide(@NonNull Object obj) {
        for (Rule next : this.rules) {
            for (Condition next2 : next.getConditions()) {
                Object value = this.conditionValueGetter.getValue(next2.type, obj);
                if (value == null || !this.conditionProcessor.isMatch(next2, value)) {
                }
            }
            return next.getGatewayInfo();
        }
        return null;
    }
}
