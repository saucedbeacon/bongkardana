package com.iap.ac.android.acs.plugin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.rpc.reversegeocode.ReverseGeocodeFacade;
import com.iap.ac.android.acs.plugin.rpc.reversegeocode.model.LocationInfo;
import com.iap.ac.android.acs.plugin.rpc.reversegeocode.request.ReverseGeocodeRequest;
import com.iap.ac.android.acs.plugin.rpc.reversegeocode.result.ReverseGeocodeResult;
import com.iap.ac.android.acs.plugin.ui.adapter.CityListAdapter;
import com.iap.ac.android.acs.plugin.ui.model.CityModel;
import com.iap.ac.android.acs.plugin.ui.utils.LocationUtils;
import com.iap.ac.android.acs.plugin.ui.utils.MultiLanguageUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginActionBar;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginSearchBar;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.callback.MultiLanguageCallback;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityRegion;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CountryRegion;
import com.iap.ac.android.biz.common.multilanguage.MultiLanguageManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class ChooseCityActivity extends Activity {
    public static final int getMax = 4;
    public static final byte[] length = {59, -110, -84, -123, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    /* access modifiers changed from: private */
    public ACPluginActionBar mActionBar;
    private List<CityRegion> mAllCities;
    /* access modifiers changed from: private */
    public String mAllCitiesText;
    private ListView mCityList;
    /* access modifiers changed from: private */
    public CityListAdapter mCityListAdapter;
    private List<String> mCountryCodes;
    /* access modifiers changed from: private */
    public CityModel mCurrentCity = new CityModel();
    /* access modifiers changed from: private */
    public String mEnableLocationText;
    private boolean mIsShowLocation;
    /* access modifiers changed from: private */
    public TextView mListEmptyHintText;
    /* access modifiers changed from: private */
    public String mLocationText;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private List<CityRegion> mPopularCities;
    /* access modifiers changed from: private */
    public String mPopularCitiesText;
    /* access modifiers changed from: private */
    public CityRegion mRegionModel;
    /* access modifiers changed from: private */
    public ACPluginSearchBar mSearchBar;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = length
            int r6 = r6 * 45
            int r6 = r6 + 56
            int r7 = r7 * 175
            int r7 = 178 - r7
            int r8 = r8 * 165
            int r8 = r8 + 11
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0035
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0029:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L_0x0035:
            int r7 = r7 + r6
            int r6 = r7 + -2
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.ui.activity.ChooseCityActivity.getMin(byte, int, byte):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        int max2;
        byte b = (byte) length[85];
        byte b2 = (byte) b;
        String min2 = getMin(b, b2, (byte) b2);
        byte b3 = (byte) length[8];
        byte b4 = (byte) b3;
        String min3 = getMin(b3, b4, (byte) b4);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1761035733, oncanceled);
            onCancelLoad.getMin(1761035733, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1761035733 == (max2 = dispatchOnCancelled.getMax(applicationContext2, 1761035733)))) {
            onCanceled oncanceled2 = new onCanceled(1761035733, max2, 512);
            onCancelLoad.setMax(1761035733, oncanceled2);
            onCancelLoad.getMin(1761035733, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || 1761035733 == (max = dispatchOnCancelled.getMax(applicationContext3, 1761035733)))) {
            onCanceled oncanceled3 = new onCanceled(1761035733, max, 512);
            onCancelLoad.setMax(1761035733, oncanceled3);
            onCancelLoad.getMin(1761035733, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled4 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(1761035733, oncanceled4);
            onCancelLoad.getMin(1761035733, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(R.layout.acplugin_activity_choose_city);
        initData();
        initView();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        StringBuilder sb = new StringBuilder("ChooseCityActivity#onDestroy, region model: ");
        sb.append(this.mRegionModel);
        ACLog.d(Constants.TAG, sb.toString());
        Intent intent = new Intent(Constants.ACTION_CHOOSE_CITY);
        CityRegion cityRegion = this.mRegionModel;
        if (cityRegion != null) {
            intent.putExtra(Constants.KEY_CITY_CODE, cityRegion.regionCode);
            intent.putExtra(Constants.KEY_CITY_NAME, this.mRegionModel.regionName);
        }
        sendBroadcast(intent);
        MultiLanguageUtils.clear();
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(792293103, oncanceled);
            onCancelLoad.getMin(792293103, oncanceled);
        }
        if (i == 124 && iArr.length > 0 && iArr[0] == 0) {
            getCityByLocation();
        }
    }

    private void initData() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1620617892, oncanceled);
            onCancelLoad.getMin(1620617892, oncanceled);
        }
        String stringExtra = getIntent().getStringExtra("locale");
        ACLog.d(Constants.TAG, "ChooseCityActivity#initData, locale from JS parameter: ".concat(String.valueOf(stringExtra)));
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = UIUtils.getLocale(this);
            ACLog.d(Constants.TAG, "ChooseCityActivity#initData, local from JS parameter is empty, get system locale: ".concat(String.valueOf(stringExtra)));
        }
        MultiLanguageUtils.locale = stringExtra;
        this.mIsShowLocation = getIntent().getBooleanExtra(UIConstants.KEY_IS_SHOW_LOCATION, false);
        this.mPopularCities = convertCityModels(getIntent().getParcelableArrayListExtra(UIConstants.KEY_POPULAR_CITY_LIST));
        StringBuilder sb = new StringBuilder("ChooseCityActivity#initData, popular city list: ");
        sb.append(this.mPopularCities);
        ACLog.d(Constants.TAG, sb.toString());
        this.mAllCities = convertCityModels(getIntent().getParcelableArrayListExtra(UIConstants.KEY_ALL_CITY_LIST));
        StringBuilder sb2 = new StringBuilder("ChooseCityActivity#initData, all city list: ");
        sb2.append(this.mAllCities);
        ACLog.d(Constants.TAG, sb2.toString());
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra(UIConstants.KEY_COUNTRY_CODE_LIST);
        this.mCountryCodes = stringArrayListExtra;
        if (stringArrayListExtra == null) {
            this.mCountryCodes = new ArrayList();
        }
        StringBuilder sb3 = new StringBuilder("ChooseCityActivity#initData, country code list: ");
        sb3.append(this.mCountryCodes);
        ACLog.d(Constants.TAG, sb3.toString());
    }

    private void initView() {
        this.mActionBar = (ACPluginActionBar) findViewById(R.id.action_bar);
        this.mSearchBar = (ACPluginSearchBar) findViewById(R.id.search_bar);
        this.mCityList = (ListView) findViewById(R.id.city_list);
        TextView textView = (TextView) findViewById(R.id.list_empty_hint_text);
        this.mListEmptyHintText = textView;
        this.mCityList.setEmptyView(textView);
        initSearchBar();
        initCityList();
        fillText();
        getCityByLocation();
    }

    private void fillText() {
        this.mActionBar.setTitle(getString(R.string.acplugin_choose_city));
        this.mSearchBar.setHint(getString(R.string.acplugin_search_city));
        this.mListEmptyHintText.setText(getString(R.string.acplugin_no_result));
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.acplugin_location));
        sb.append(" ");
        this.mLocationText = sb.toString();
        this.mCurrentCity.name = getString(R.string.acplugin_locate_fail);
        this.mEnableLocationText = getString(R.string.acplugin_enable_locate);
        this.mPopularCitiesText = getString(R.string.acplugin_popular_cities);
        this.mAllCitiesText = getString(R.string.acplugin_all_cities);
        MultiLanguageUtils.getMultiLanguageTextMap(new MultiLanguageUtils.Callback() {
            public void onGetMultiLanguageText(@NonNull Map<String, String> map) {
                ChooseCityActivity.this.mActionBar.setTitle(map.get("ChooseCity"));
                ChooseCityActivity.this.mSearchBar.setHint(map.get("SearchCity"));
                ChooseCityActivity.this.mListEmptyHintText.setText(map.get("NoResult"));
                String unused = ChooseCityActivity.this.mLocationText = map.get("Location");
                ChooseCityActivity.this.mCurrentCity.name = map.get("LocateFail");
                String unused2 = ChooseCityActivity.this.mEnableLocationText = map.get("EnableLocate");
                String unused3 = ChooseCityActivity.this.mPopularCitiesText = map.get("PopularCities");
                String unused4 = ChooseCityActivity.this.mAllCitiesText = map.get("AllCities");
                ChooseCityActivity.this.refreshCityList();
            }
        });
    }

    private void initSearchBar() {
        this.mSearchBar.setOnSearchListener(new ACPluginSearchBar.OnSearchListener() {
            public void onSearch(CharSequence charSequence) {
                if (ChooseCityActivity.this.mCityListAdapter != null) {
                    ChooseCityActivity.this.mCityListAdapter.filter(charSequence);
                }
            }
        });
    }

    private void initCityList() {
        this.mCityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (ChooseCityActivity.this.mCityListAdapter == null) {
                    ACLog.e(Constants.TAG, "ChooseCityActivity#onItemClick, city list adapter is null");
                    return;
                }
                Object item = ChooseCityActivity.this.mCityListAdapter.getItem(i);
                if (!(item instanceof CityRegion)) {
                    ACLog.e(Constants.TAG, "ChooseCityActivity#onItemClick, city list item data illegal");
                    return;
                }
                CityRegion unused = ChooseCityActivity.this.mRegionModel = (CityRegion) item;
                ACLog.d(Constants.TAG, "ChooseCityActivity#onItemClick, finish current activity");
                ChooseCityActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: private */
    public void refreshCityList() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-619948156, oncanceled);
            onCancelLoad.getMin(-619948156, oncanceled);
        }
        if (UIUtils.isActivityDisabled(this)) {
            ACLog.e(Constants.TAG, "ChooseCityActivity#refreshCityList, activity disabled");
            return;
        }
        List<CityRegion> list = this.mAllCities;
        if (list == null || list.isEmpty()) {
            initCDNCityList();
            return;
        }
        ACLog.d(Constants.TAG, "ChooseCityActivity#refreshCityList, all city list exists, start to refresh UI");
        CountryRegion countryRegion = new CountryRegion();
        countryRegion.cities = this.mAllCities;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(countryRegion);
        initCityListAdapter(arrayList);
    }

    private void initCDNCityList() {
        MultiLanguageManager.queryCity(MultiLanguageUtils.locale, this.mCountryCodes, new MultiLanguageCallback<List<CountryRegion>>() {
            public void onResult(@NonNull List<CountryRegion> list) {
                if (UIUtils.isActivityDisabled(ChooseCityActivity.this)) {
                    ACLog.e(Constants.TAG, "ChooseCityActivity#initCDNCityList, activity disabled");
                    return;
                }
                if (list.isEmpty()) {
                    MonitorUtil.monitorError("getCityList empty");
                }
                ACLog.d(Constants.TAG, "ChooseCityActivity#initCDNCityList, start to refresh UI");
                ChooseCityActivity.this.initCityListAdapter(list);
            }
        });
    }

    /* access modifiers changed from: private */
    public void initCityListAdapter(List<CountryRegion> list) {
        CityListAdapter cityListAdapter = new CityListAdapter(this, this.mIsShowLocation, this.mPopularCities, list);
        this.mCityListAdapter = cityListAdapter;
        cityListAdapter.setMultiLanguageText(this.mLocationText, this.mEnableLocationText, this.mPopularCitiesText, this.mAllCitiesText);
        this.mCityListAdapter.setCurrentCity(this.mCurrentCity);
        this.mCityList.setAdapter(this.mCityListAdapter);
    }

    private List<CityRegion> convertCityModels(@Nullable List<CityModel> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e(Constants.TAG, "ChooseCityActivity#convertCityModels, city model list is empty");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (CityModel next : list) {
            if (next != null && !TextUtils.isEmpty(next.code) && !TextUtils.isEmpty(next.name)) {
                CityRegion cityRegion = new CityRegion();
                cityRegion.regionCode = next.code;
                cityRegion.regionName = next.name;
                arrayList.add(cityRegion);
            }
        }
        return arrayList;
    }

    private String[] convertCountryCodes(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e(Constants.TAG, "ChooseCityActivity#convertCountryCodes, country code list is empty");
            return new String[0];
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    private void getCityByLocation() {
        final Location location = LocationUtils.getLocation(this);
        if (location == null) {
            ACLog.e(Constants.TAG, "ChooseCityActivity#getCityByLocation, location is null");
            refreshCurrentCity();
            return;
        }
        StringBuilder sb = new StringBuilder("ChooseCityActivity#getCityByLocation, longitude: ");
        sb.append(location.getLongitude());
        sb.append(", latitude: ");
        sb.append(location.getLatitude());
        ACLog.d(Constants.TAG, sb.toString());
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                if (!ChooseCityActivity.this.getCityByLocation(location)) {
                    ChooseCityActivity.this.refreshCurrentCity();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean getCityByLocation(Location location) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1365784779 == (max = dispatchOnCancelled.getMax(applicationContext, 1365784779)))) {
            onCanceled oncanceled = new onCanceled(1365784779, max, 512);
            onCancelLoad.setMax(1365784779, oncanceled);
            onCancelLoad.getMin(1365784779, oncanceled);
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ReverseGeocodeRequest reverseGeocodeRequest = new ReverseGeocodeRequest();
            reverseGeocodeRequest.locationInfo = new LocationInfo();
            reverseGeocodeRequest.locationInfo.longitude = String.valueOf(location.getLongitude());
            reverseGeocodeRequest.locationInfo.latitude = String.valueOf(location.getLatitude());
            ReverseGeocodeResult reverseGeocode = ((ReverseGeocodeFacade) RPCProxyHost.getInterfaceProxy(ReverseGeocodeFacade.class, "ac_biz")).reverseGeocode(reverseGeocodeRequest);
            MonitorUtil.monitorRPC(ReverseGeocodeFacade.OPERATION_TYPE_REVERSE_GEO_CODE, SystemClock.elapsedRealtime() - elapsedRealtime, reverseGeocode);
            if (reverseGeocode == null) {
                ACLog.e(Constants.TAG, "ChooseCityActivity#getCityByLocation, rpc result is null");
                return false;
            } else if (!reverseGeocode.success) {
                StringBuilder sb = new StringBuilder("ChooseCityActivity#getCityByLocation, rpc result fail, error: ");
                sb.append(reverseGeocode.errorCode);
                sb.append(", errorMessage: ");
                sb.append(reverseGeocode.errorMessage);
                ACLog.e(Constants.TAG, sb.toString());
                return false;
            } else if (TextUtils.isEmpty(reverseGeocode.region)) {
                ACLog.e(Constants.TAG, "ChooseCityActivity#getCityByLocation, rpc success but region is empty");
                return false;
            } else {
                ACLog.d(Constants.TAG, "ChooseCityActivity#getCityByLocation, rpc success, ".concat(String.valueOf(reverseGeocode)));
                convertRegion(reverseGeocode.region);
                return true;
            }
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "ChooseCityActivity#getCityByLocation, rpc error: ".concat(String.valueOf(th)));
            return false;
        }
    }

    private void convertRegion(@NonNull final String str) {
        MultiLanguageUtils.getMultiLanguageTextMap(new MultiLanguageUtils.Callback() {
            public void onGetMultiLanguageText(@NonNull Map<String, String> map) {
                String str = map.get(str);
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder("ChooseCityActivity#convertRegion, region code: ");
                    sb.append(str);
                    sb.append(", region name: ");
                    sb.append(str);
                    ACLog.d(Constants.TAG, sb.toString());
                    ChooseCityActivity.this.mCurrentCity.code = str;
                    ChooseCityActivity.this.mCurrentCity.name = str;
                }
                ChooseCityActivity.this.refreshCurrentCity();
            }
        });
    }

    /* access modifiers changed from: private */
    public void refreshCurrentCity() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1368632853 == (max = dispatchOnCancelled.getMax(applicationContext, -1368632853)))) {
            onCanceled oncanceled = new onCanceled(-1368632853, max, 512);
            onCancelLoad.setMax(-1368632853, oncanceled);
            onCancelLoad.getMin(-1368632853, oncanceled);
        }
        StringBuilder sb = new StringBuilder("ChooseCityActivity#refreshCurrentCity, current city: ");
        sb.append(this.mCurrentCity);
        ACLog.d(Constants.TAG, sb.toString());
        this.mMainHandler.post(new Runnable() {
            public void run() {
                if (UIUtils.isActivityDisabled(ChooseCityActivity.this)) {
                    ACLog.e(Constants.TAG, "ChooseCityActivity#refreshCurrentCity, activity disabled");
                } else if (ChooseCityActivity.this.mCityListAdapter != null) {
                    ChooseCityActivity.this.mCityListAdapter.setCurrentCity(ChooseCityActivity.this.mCurrentCity);
                    ChooseCityActivity.this.mCityListAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}
