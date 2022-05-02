package o;

import android.content.Context;
import id.dana.R;
import id.dana.richview.category.model.CategoryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.ZoomRecyclerView;
import o.b;

public final class onAnimationCancel implements getAdapterPosition<ZoomRecyclerView.AnonymousClass1> {
    private final b.C0007b<Context> setMax;

    private onAnimationCancel(b.C0007b<Context> bVar) {
        this.setMax = bVar;
    }

    public static onAnimationCancel length(b.C0007b<Context> bVar) {
        return new onAnimationCancel(bVar);
    }

    public final /* synthetic */ Object get() {
        return new setSpeed<List<parseAppInfoFromJSONString>, List<CategoryModel>>(this.setMax.get()) {
            private final Context getMin;

            public final /* synthetic */ Object map(Object obj) {
                List<parseAppInfoFromJSONString> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (parseAppInfoFromJSONString parseappinfofromjsonstring : list) {
                        CategoryModel categoryModel = new CategoryModel();
                        categoryModel.setMin = parseappinfofromjsonstring.getCategoryId();
                        categoryModel.getMin = parseappinfofromjsonstring.getCategoryName();
                        categoryModel.getMax = false;
                        categoryModel.toFloatRange = 1;
                        List<isLayoutRtlSupport> min = setMin(parseappinfofromjsonstring.getCategoryFilter(), "filter");
                        Intrinsics.checkNotNullParameter(min, "<set-?>");
                        categoryModel.length = min;
                        List<isLayoutRtlSupport> min2 = setMin(parseappinfofromjsonstring.getCategorySorting(), "sort");
                        Intrinsics.checkNotNullParameter(min2, "<set-?>");
                        categoryModel.equals = min2;
                        arrayList.add(categoryModel);
                    }
                }
                return arrayList;
            }

            {
                this.getMin = r1;
            }

            private List<isLayoutRtlSupport> setMin(List<String> list, String str) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (String next : list) {
                        String str2 = "";
                        if (!"filter".equals(str)) {
                            char c = 65535;
                            int hashCode = next.hashCode();
                            if (hashCode != 77184) {
                                if (hashCode == 1739043310 && next.equals("NEAR_EXPIRED")) {
                                    c = 0;
                                }
                            } else if (next.equals("NEW")) {
                                c = 1;
                            }
                            if (c == 0) {
                                str2 = this.getMin.getString(R.string.near_expired);
                            } else if (c == 1) {
                                str2 = this.getMin.getString(R.string.new_promo);
                            }
                        } else if ("NEAREST_LOCATION".equalsIgnoreCase(next)) {
                            str2 = this.getMin.getString(R.string.near_merchant);
                        }
                        arrayList.add(new isLayoutRtlSupport(str2, next));
                    }
                }
                return arrayList;
            }
        };
    }
}
