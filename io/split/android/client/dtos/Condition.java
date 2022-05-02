package io.split.android.client.dtos;

import java.util.List;

public class Condition {
    public ConditionType conditionType;
    public String label;
    public MatcherGroup matcherGroup;
    public List<Partition> partitions;
}
