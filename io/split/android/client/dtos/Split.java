package io.split.android.client.dtos;

import java.util.List;
import java.util.Map;

public class Split {
    public int algo;
    public long changeNumber;
    public List<Condition> conditions;
    public Map<String, String> configurations;
    public String defaultTreatment;
    public boolean killed;
    public String name;
    public int seed;
    public Status status;
    public Integer trafficAllocation;
    public Integer trafficAllocationSeed;
    public String trafficTypeName;
}
