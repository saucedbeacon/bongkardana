package com.alipay.multigateway.sdk;

import androidx.annotation.NonNull;
import com.alipay.multigateway.sdk.decision.condition.Condition;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.List;

public class Rule {
    private List<Condition> conditions = new ArrayList();
    private GatewayInfo gatewayInfo;
    private final String name;
    private final int priority;

    public Rule(String str, int i) {
        this.name = str;
        this.priority = i;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setConditions(@NonNull List<Condition> list) {
        this.conditions = list;
    }

    public void setGatewayInfo(@NonNull GatewayInfo gatewayInfo2) {
        this.gatewayInfo = gatewayInfo2;
    }

    @NonNull
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    @NonNull
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void addCondition(@NonNull Condition condition) {
        this.conditions.add(condition);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Rule<");
        sb.append(this.name);
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }
}
