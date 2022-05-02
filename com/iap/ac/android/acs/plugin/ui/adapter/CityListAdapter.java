package com.iap.ac.android.acs.plugin.ui.adapter;

import android.app.Activity;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.model.CityModel;
import com.iap.ac.android.acs.plugin.ui.utils.LocationUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityRegion;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CountryRegion;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CityListAdapter extends BaseAdapter implements View.OnClickListener {
    private static final int ITEM_TYPE_ALL_CITY_FLAG = 2;
    private static final int ITEM_TYPE_CITY = 3;
    private static final int ITEM_TYPE_LOCATION = 0;
    private static final int ITEM_TYPE_POPULAR_CITY_FLAG = 1;
    private static final int ITEM_TYPE_SIZE = 4;
    private String mAllCitiesText;
    private Activity mContext;
    private List<CountryRegion> mCountryCityList = new ArrayList();
    private List<String> mCountryList = new ArrayList();
    private CityModel mCurrentCity = new CityModel();
    private List<CityRegion> mCurrentCityList = new ArrayList();
    private String mEnableLocationText;
    private List<CityRegion> mFilteredCityList = new ArrayList();
    private boolean mIsFilter;
    private boolean mIsShowLocation;
    private String mLocationText;
    private String mPopularCitiesText;
    private List<CityRegion> mPopularCityList = new ArrayList();
    private int mSelectedCountryIndex = 0;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 4;
    }

    public CityListAdapter(@NonNull Activity activity, boolean z, @Nullable List<CityRegion> list, @Nullable List<CountryRegion> list2) {
        this.mContext = activity;
        this.mIsShowLocation = z;
        if (list != null && !list.isEmpty()) {
            this.mPopularCityList = list;
        }
        if (list2 != null && !list2.isEmpty()) {
            this.mCountryCityList = list2;
            for (CountryRegion next : list2) {
                if (next != null) {
                    this.mCountryList.add(next.regionName);
                }
            }
            if (list2.get(0).cities != null && !list2.get(0).cities.isEmpty()) {
                this.mCurrentCityList.addAll(list2.get(0).cities);
            }
        }
    }

    public int getCount() {
        if (this.mIsFilter) {
            return this.mFilteredCityList.size();
        }
        return (this.mIsShowLocation ? 1 : 0) + (this.mPopularCityList.isEmpty() ^ true ? 1 : 0) + this.mPopularCityList.size() + (this.mCurrentCityList.isEmpty() ^ true ? 1 : 0) + this.mCurrentCityList.size();
    }

    public Object getItem(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 3) {
            return getCityModel(i);
        }
        if (itemViewType != 0 || TextUtils.isEmpty(this.mCurrentCity.code)) {
            return null;
        }
        CityRegion cityRegion = new CityRegion();
        cityRegion.regionCode = this.mCurrentCity.code;
        cityRegion.regionName = this.mCurrentCity.name;
        return cityRegion;
    }

    public int getItemViewType(int i) {
        if (this.mIsFilter) {
            return 3;
        }
        if (this.mIsShowLocation) {
            if (i == 0) {
                return 0;
            }
            if (!this.mPopularCityList.isEmpty() && i == 1) {
                return 1;
            }
            if (this.mCurrentCityList.isEmpty() || i != getAllCityFlagPosition()) {
                return 3;
            }
            return 2;
        } else if (!this.mPopularCityList.isEmpty() && i == 0) {
            return 1;
        } else {
            if (this.mCurrentCityList.isEmpty() || i != getAllCityFlagPosition()) {
                return 3;
            }
            return 2;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return getLocationView(view, viewGroup);
        }
        if (itemViewType == 1) {
            return getPopularCityFlagView(view, viewGroup);
        }
        if (itemViewType == 2) {
            return getAllCityFlagView(view, viewGroup);
        }
        return itemViewType == 3 ? getCityView(i, view, viewGroup) : view;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.country_text) {
            refreshCurrentAllCityList(((Integer) view.getTag()).intValue());
        } else if (view.getId() == R.id.enable_location_text) {
            LocationUtils.requestPermission(this.mContext);
        }
    }

    public void setMultiLanguageText(String str, String str2, String str3, String str4) {
        this.mLocationText = str;
        this.mEnableLocationText = str2;
        this.mPopularCitiesText = str3;
        this.mAllCitiesText = str4;
    }

    public void setCurrentCity(CityModel cityModel) {
        this.mCurrentCity = cityModel;
    }

    public void filter(@Nullable CharSequence charSequence) {
        ACLog.d(Constants.TAG, "CityListAdapter#filter, filter string: ".concat(String.valueOf(charSequence)));
        this.mFilteredCityList.clear();
        if (charSequence == null || TextUtils.isEmpty(charSequence.toString()) || TextUtils.isEmpty(charSequence.toString().trim())) {
            this.mIsFilter = false;
        } else {
            Pattern compile = Pattern.compile(charSequence.toString().trim());
            for (CountryRegion next : this.mCountryCityList) {
                if (!(next == null || next.cities == null || next.cities.isEmpty())) {
                    for (CityRegion next2 : next.cities) {
                        if (next2 != null && !TextUtils.isEmpty(next2.regionName) && compile.matcher(next2.regionName).find()) {
                            this.mFilteredCityList.add(next2);
                        }
                    }
                }
            }
            this.mIsFilter = true;
        }
        notifyDataSetChanged();
    }

    private View getLocationView(View view, ViewGroup viewGroup) {
        LocationViewHolder locationViewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.acplugin_layout_location_item, viewGroup, false);
            locationViewHolder = new LocationViewHolder();
            locationViewHolder.locationText = (TextView) view.findViewById(R.id.location_text);
            locationViewHolder.enableLocationLayout = (LinearLayout) view.findViewById(R.id.enable_location_layout);
            locationViewHolder.enableLocationText = (TextView) view.findViewById(R.id.enable_location_text);
            view.setTag(locationViewHolder);
        } else {
            locationViewHolder = (LocationViewHolder) view.getTag();
        }
        locationViewHolder.locationText.setText(String.format("%s%s", new Object[]{this.mLocationText, this.mCurrentCity.name}));
        showEnableLocationView(locationViewHolder);
        return view;
    }

    private void showEnableLocationView(LocationViewHolder locationViewHolder) {
        if (LocationUtils.checkPermission(this.mContext)) {
            locationViewHolder.enableLocationLayout.setVisibility(8);
            return;
        }
        locationViewHolder.enableLocationLayout.setVisibility(0);
        locationViewHolder.enableLocationText.setText(this.mEnableLocationText);
        locationViewHolder.enableLocationText.setOnClickListener(this);
    }

    private View getPopularCityFlagView(View view, ViewGroup viewGroup) {
        PopularCityFlagViewHolder popularCityFlagViewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.acplugin_layout_popular_city_flag_item, viewGroup, false);
            popularCityFlagViewHolder = new PopularCityFlagViewHolder();
            popularCityFlagViewHolder.flagText = (TextView) view.findViewById(R.id.flag_text);
            view.setTag(popularCityFlagViewHolder);
        } else {
            popularCityFlagViewHolder = (PopularCityFlagViewHolder) view.getTag();
        }
        popularCityFlagViewHolder.flagText.setText(this.mPopularCitiesText);
        return view;
    }

    private View getAllCityFlagView(View view, ViewGroup viewGroup) {
        AllCityFlagViewHolder allCityFlagViewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.acplugin_layout_all_city_flag_item, viewGroup, false);
            allCityFlagViewHolder = new AllCityFlagViewHolder();
            allCityFlagViewHolder.flagText = (TextView) view.findViewById(R.id.flag_text);
            allCityFlagViewHolder.countryTabContainer = (FrameLayout) view.findViewById(R.id.country_tab_container);
            allCityFlagViewHolder.countryTabScrollView = (HorizontalScrollView) view.findViewById(R.id.country_tab_scroll_view);
            allCityFlagViewHolder.countryTabLayout = (LinearLayout) view.findViewById(R.id.country_tab_layout);
            allCityFlagViewHolder.moreIcon = (ImageView) view.findViewById(R.id.more_icon);
            view.setTag(allCityFlagViewHolder);
        } else {
            allCityFlagViewHolder = (AllCityFlagViewHolder) view.getTag();
        }
        allCityFlagViewHolder.flagText.setText(this.mAllCitiesText);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) allCityFlagViewHolder.flagText.getLayoutParams();
        if (this.mCountryList.size() <= 1) {
            allCityFlagViewHolder.countryTabContainer.setVisibility(8);
            layoutParams.bottomMargin = UIUtils.dp2px(this.mContext, 8);
        } else {
            allCityFlagViewHolder.countryTabContainer.setVisibility(0);
            layoutParams.bottomMargin = 0;
            showCountryTabs(allCityFlagViewHolder);
            if (getCountryTabListWidth() > UIUtils.getScreenWidth(this.mContext)) {
                allCityFlagViewHolder.moreIcon.setVisibility(0);
            } else {
                allCityFlagViewHolder.moreIcon.setVisibility(8);
            }
        }
        allCityFlagViewHolder.flagText.setLayoutParams(layoutParams);
        return view;
    }

    private void showCountryTabs(@NonNull AllCityFlagViewHolder allCityFlagViewHolder) {
        allCityFlagViewHolder.countryTabScrollView.scrollTo(getCurrentCountryTabXValue(), 0);
        allCityFlagViewHolder.countryTabLayout.removeAllViews();
        for (int i = 0; i < this.mCountryList.size(); i++) {
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(R.layout.acplugin_layout_country_tab, allCityFlagViewHolder.countryTabLayout, false);
            textView.setText(this.mCountryList.get(i));
            textView.setTag(Integer.valueOf(i));
            textView.setOnClickListener(this);
            if (i == this.mSelectedCountryIndex) {
                textView.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.drawable.acplugin_country_tab_selected_bg));
                textView.setTextColor(this.mContext.getResources().getColor(17170443));
            } else {
                textView.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.drawable.acplugin_country_tab_normal_bg));
                textView.setTextColor(this.mContext.getResources().getColor(R.color.acplugin_common_text));
            }
            allCityFlagViewHolder.countryTabLayout.addView(textView);
        }
    }

    private View getCityView(int i, View view, ViewGroup viewGroup) {
        CityViewHolder cityViewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.acplugin_layout_city_item, viewGroup, false);
            cityViewHolder = new CityViewHolder();
            cityViewHolder.cityNameText = (TextView) view.findViewById(R.id.city_text);
            cityViewHolder.divider = view.findViewById(R.id.divider);
            view.setTag(cityViewHolder);
        } else {
            cityViewHolder = (CityViewHolder) view.getTag();
        }
        CityRegion cityModel = getCityModel(i);
        if (cityModel != null) {
            cityViewHolder.cityNameText.setText(cityModel.regionName);
        }
        showDivider(i, cityViewHolder.divider);
        return view;
    }

    private void showDivider(int i, @NonNull View view) {
        if (this.mIsFilter) {
            showNormalDivider(view);
        } else if (3 == getItemViewType(i)) {
            if (!this.mCurrentCityList.isEmpty() && !this.mPopularCityList.isEmpty() && i == this.mPopularCityList.size() + (this.mIsShowLocation ? 1 : 0)) {
                view.setVisibility(8);
            } else if ((!this.mCurrentCityList.isEmpty() || !this.mPopularCityList.isEmpty()) && i == getCount() - 1) {
                showSlimDivider(view);
            } else {
                showNormalDivider(view);
            }
        }
    }

    private void showSlimDivider(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 1;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
    }

    private void showNormalDivider(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = UIUtils.dp2px(this.mContext, 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
    }

    private CityRegion getCityModel(int i) {
        if (this.mIsFilter) {
            return this.mFilteredCityList.get(i);
        }
        if (3 != getItemViewType(i)) {
            return null;
        }
        int allCityFlagPosition = getAllCityFlagPosition();
        if (!this.mCurrentCityList.isEmpty() && i > allCityFlagPosition) {
            return this.mCurrentCityList.get((i - allCityFlagPosition) - 1);
        }
        if (!this.mPopularCityList.isEmpty()) {
            return this.mPopularCityList.get((i - 1) - (this.mIsShowLocation ? 1 : 0));
        }
        return null;
    }

    private int getAllCityFlagPosition() {
        return (this.mIsShowLocation ? 1 : 0) + (this.mPopularCityList.isEmpty() ^ true ? 1 : 0) + this.mPopularCityList.size();
    }

    private int getCountryTabListWidth() {
        StringBuilder sb = new StringBuilder();
        for (String append : this.mCountryList) {
            sb.append(append);
        }
        Paint paint = new Paint();
        paint.setTextSize((float) UIUtils.dp2px(this.mContext, 14));
        return ((int) paint.measureText(sb.toString())) + (UIUtils.dp2px(this.mContext, 12) * (this.mCountryList.size() + 1)) + (UIUtils.dp2px(this.mContext, 10) * 2 * this.mCountryList.size());
    }

    private int getCurrentCountryTabXValue() {
        int i = this.mSelectedCountryIndex;
        if (i < 0 || i >= this.mCountryList.size()) {
            StringBuilder sb = new StringBuilder("CityListAdapter#getCurrentCountryTabPosition, current position illegal: ");
            sb.append(this.mSelectedCountryIndex);
            ACLog.e(Constants.TAG, sb.toString());
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < this.mSelectedCountryIndex; i2++) {
            sb2.append(this.mCountryList.get(i2));
        }
        Paint paint = new Paint();
        paint.setTextSize((float) UIUtils.dp2px(this.mContext, 14));
        return ((((((int) paint.measureText(sb2.toString())) + (UIUtils.dp2px(this.mContext, 12) * (this.mSelectedCountryIndex + 1))) + ((UIUtils.dp2px(this.mContext, 10) * 2) * this.mSelectedCountryIndex)) + UIUtils.dp2px(this.mContext, 10)) + ((int) (paint.measureText(this.mCountryList.get(this.mSelectedCountryIndex)) / 2.0f))) - (UIUtils.getScreenWidth(this.mContext) / 2);
    }

    private void refreshCurrentAllCityList(int i) {
        this.mSelectedCountryIndex = i;
        this.mCurrentCityList.clear();
        if (i < this.mCountryCityList.size() && this.mCountryCityList.get(i) != null && this.mCountryCityList.get(i).cities != null && !this.mCountryCityList.get(i).cities.isEmpty()) {
            this.mCurrentCityList.addAll(this.mCountryCityList.get(i).cities);
        }
        notifyDataSetChanged();
    }

    static class CityViewHolder {
        TextView cityNameText;
        View divider;

        private CityViewHolder() {
        }
    }

    static class LocationViewHolder {
        LinearLayout enableLocationLayout;
        TextView enableLocationText;
        TextView locationText;

        private LocationViewHolder() {
        }
    }

    static class PopularCityFlagViewHolder {
        TextView flagText;

        private PopularCityFlagViewHolder() {
        }
    }

    static class AllCityFlagViewHolder {
        FrameLayout countryTabContainer;
        LinearLayout countryTabLayout;
        HorizontalScrollView countryTabScrollView;
        TextView flagText;
        ImageView moreIcon;

        private AllCityFlagViewHolder() {
        }
    }
}
