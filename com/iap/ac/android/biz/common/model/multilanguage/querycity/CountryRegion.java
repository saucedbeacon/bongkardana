package com.iap.ac.android.biz.common.model.multilanguage.querycity;

import java.util.ArrayList;
import java.util.List;

public class CountryRegion {
    @Deprecated
    public List<CityRegion> cities = new ArrayList();
    public List<CityRegionsGroupByInitial> cityRegionsGroupByInitials = new ArrayList();
    public String regionCode;
    public String regionName;
}
