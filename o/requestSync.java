package o;

import androidx.annotation.NonNull;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.domain.services.Category;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Singleton;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;

@Singleton
public class requestSync {
    private static final int MAX_FEATURED_SERVICE = 8;

    public TitleBarRightButtonView.AnonymousClass1<NullBeaconDataFactory.AnonymousClass1> transform(List<String> list, List<NullBeaconDataFactory.AnonymousClass1> list2) {
        renameGnCategoryFeatured(list2);
        if (list2.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(new Object() {
                private String key;
                private List<ThirdPartyServiceResponse> thirdPartyServices;

                public String getKey() {
                    return this.key;
                }

                public void setKey(String str) {
                    this.key = str;
                }

                public List<ThirdPartyServiceResponse> getThirdPartyServices() {
                    return this.thirdPartyServices;
                }

                public void setThirdPartyServices(List<ThirdPartyServiceResponse> list) {
                    this.thirdPartyServices = list;
                }

                @NonNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("ThirdPartyCategoryService{key='");
                    sb.append(this.key);
                    sb.append('\'');
                    sb.append(", thirdPartyServices=");
                    sb.append(this.thirdPartyServices);
                    sb.append('}');
                    return sb.toString();
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        AnonymousClass1 r5 = (AnonymousClass1) obj;
                        return Objects.equals(this.key, r5.key) && Objects.equals(this.thirdPartyServices, r5.thirdPartyServices);
                    }
                }

                public int hashCode() {
                    return Objects.hash(new Object[]{this.key, this.thirdPartyServices});
                }
            });
        }
        if (list == null || list.isEmpty()) {
            NullBeaconDataFactory.AnonymousClass1 featuredService = getFeaturedService(list2);
            if (featuredService == null) {
                return TitleBarRightButtonView.AnonymousClass1.just(new Object() {
                    private String key;
                    private List<ThirdPartyServiceResponse> thirdPartyServices;

                    public String getKey() {
                        return this.key;
                    }

                    public void setKey(String str) {
                        this.key = str;
                    }

                    public List<ThirdPartyServiceResponse> getThirdPartyServices() {
                        return this.thirdPartyServices;
                    }

                    public void setThirdPartyServices(List<ThirdPartyServiceResponse> list) {
                        this.thirdPartyServices = list;
                    }

                    @NonNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("ThirdPartyCategoryService{key='");
                        sb.append(this.key);
                        sb.append('\'');
                        sb.append(", thirdPartyServices=");
                        sb.append(this.thirdPartyServices);
                        sb.append('}');
                        return sb.toString();
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            AnonymousClass1 r5 = (AnonymousClass1) obj;
                            return Objects.equals(this.key, r5.key) && Objects.equals(this.thirdPartyServices, r5.thirdPartyServices);
                        }
                    }

                    public int hashCode() {
                        return Objects.hash(new Object[]{this.key, this.thirdPartyServices});
                    }
                });
            }
            doLimitFeaturedServices(featuredService);
            return TitleBarRightButtonView.AnonymousClass1.just(featuredService);
        }
        NullBeaconDataFactory.AnonymousClass1 featuredService2 = getFeaturedService(list2);
        if (featuredService2 == null) {
            return TitleBarRightButtonView.AnonymousClass1.just(new Object() {
                private String key;
                private List<ThirdPartyServiceResponse> thirdPartyServices;

                public String getKey() {
                    return this.key;
                }

                public void setKey(String str) {
                    this.key = str;
                }

                public List<ThirdPartyServiceResponse> getThirdPartyServices() {
                    return this.thirdPartyServices;
                }

                public void setThirdPartyServices(List<ThirdPartyServiceResponse> list) {
                    this.thirdPartyServices = list;
                }

                @NonNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("ThirdPartyCategoryService{key='");
                    sb.append(this.key);
                    sb.append('\'');
                    sb.append(", thirdPartyServices=");
                    sb.append(this.thirdPartyServices);
                    sb.append('}');
                    return sb.toString();
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        AnonymousClass1 r5 = (AnonymousClass1) obj;
                        return Objects.equals(this.key, r5.key) && Objects.equals(this.thirdPartyServices, r5.thirdPartyServices);
                    }
                }

                public int hashCode() {
                    return Objects.hash(new Object[]{this.key, this.thirdPartyServices});
                }
            });
        }
        return TitleBarRightButtonView.AnonymousClass1.just(createNewThirdPartyCategoryServices(featuredService2, transform(list2), list));
    }

    private void renameGnCategoryFeatured(List<NullBeaconDataFactory.AnonymousClass1> list) {
        for (NullBeaconDataFactory.AnonymousClass1 next : list) {
            if (next.getKey().equals(Category.GLOBAL_NETWORK_FEATURED)) {
                next.setKey(Category.FEATURED);
            }
        }
    }

    private List<ThirdPartyServiceResponse> filterByFavoriteServices(Map<String, ThirdPartyServiceResponse> map, List<String> list, List<ThirdPartyServiceResponse> list2, NullBeaconDataFactory.AnonymousClass1 r7) {
        removeExistingFeaturedService(map, list, r7);
        for (int i = 0; i < list.size(); i++) {
            ThirdPartyServiceResponse thirdPartyServiceResponse = map.get(list.get(i));
            if (thirdPartyServiceResponse != null) {
                list2.add(thirdPartyServiceResponse);
            } else {
                ThirdPartyServiceResponse nonPromotedFeaturedService = getNonPromotedFeaturedService(r7);
                if (nonPromotedFeaturedService != null) {
                    list2.add(nonPromotedFeaturedService);
                    r7.getThirdPartyServices().remove(nonPromotedFeaturedService);
                }
            }
        }
        return list2;
    }

    private void addServiceResponseToMap(List<ThirdPartyServiceResponse> list, Map<String, ThirdPartyServiceResponse> map) {
        for (int i = 0; i < list.size(); i++) {
            ThirdPartyServiceResponse thirdPartyServiceResponse = list.get(i);
            map.put(thirdPartyServiceResponse.getKey(), thirdPartyServiceResponse);
        }
    }

    private NullBeaconDataFactory.AnonymousClass1 getFeaturedService(List<NullBeaconDataFactory.AnonymousClass1> list) {
        for (NullBeaconDataFactory.AnonymousClass1 next : list) {
            if (Category.FEATURED.equalsIgnoreCase(next.getKey())) {
                return next;
            }
        }
        return null;
    }

    private Map<String, ThirdPartyServiceResponse> transform(List<NullBeaconDataFactory.AnonymousClass1> list) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            addServiceResponseToMap(list.get(i).getThirdPartyServices(), hashMap);
        }
        return hashMap;
    }

    private NullBeaconDataFactory.AnonymousClass1 createNewThirdPartyCategoryServices(NullBeaconDataFactory.AnonymousClass1 r3, Map<String, ThirdPartyServiceResponse> map, List<String> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getPromotedService(r3));
        r3.setThirdPartyServices(filterByFavoriteServices(map, list, arrayList, r3));
        return r3;
    }

    private ThirdPartyServiceResponse getPromotedService(NullBeaconDataFactory.AnonymousClass1 r2) {
        if (r2.getThirdPartyServices() == null || r2.getThirdPartyServices().isEmpty()) {
            return new ThirdPartyServiceResponse();
        }
        return r2.getThirdPartyServices().get(0);
    }

    private ThirdPartyServiceResponse getNonPromotedFeaturedService(NullBeaconDataFactory.AnonymousClass1 r2) {
        if (isValidThirdPartyServicesTemp(r2)) {
            return r2.getThirdPartyServices().get(1);
        }
        return null;
    }

    private boolean isValidThirdPartyServicesTemp(NullBeaconDataFactory.AnonymousClass1 r2) {
        return r2.getThirdPartyServices() != null && r2.getThirdPartyServices().size() > 1;
    }

    private void doLimitFeaturedServices(NullBeaconDataFactory.AnonymousClass1 r4) {
        if (r4.getThirdPartyServices().size() > 8) {
            r4.setThirdPartyServices(r4.getThirdPartyServices().subList(0, 8));
        }
    }

    private void removeExistingFeaturedService(Map<String, ThirdPartyServiceResponse> map, List<String> list, NullBeaconDataFactory.AnonymousClass1 r5) {
        for (String str : list) {
            ThirdPartyServiceResponse thirdPartyServiceResponse = map.get(str);
            if (thirdPartyServiceResponse != null) {
                r5.getThirdPartyServices().remove(thirdPartyServiceResponse);
            }
        }
    }
}
