package com.iap.ac.android.acs.plugin.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.MobilePhoneRegion;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionsGroupByInitial;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class PhoneRegionListAdapter extends BaseAdapter {
    private static final String REGION_FORMAT_RULE = "%s-%s";
    private List<MobilePhoneRegion> mBackupPhoneRegionList = this.mPhoneRegionList;
    private Context mContext;
    private boolean mIsFilter;
    private List<MobilePhoneRegion> mPhoneRegionList;
    private HashMap<Integer, String> mSectionPositionMap;

    public long getItemId(int i) {
        return (long) i;
    }

    public PhoneRegionListAdapter(@NonNull Context context, @NonNull List<RegionsGroupByInitial> list) {
        this.mContext = context;
        convertData(list);
    }

    public int getCount() {
        return this.mPhoneRegionList.size();
    }

    public Object getItem(int i) {
        return this.mPhoneRegionList.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.acplugin_layout_phone_region_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.letterText = (TextView) view.findViewById(R.id.letter_text);
            viewHolder.regionText = (TextView) view.findViewById(R.id.region_text);
            viewHolder.phonePrefixView = (TextView) view.findViewById(R.id.phone_prefix_text);
            viewHolder.divider = view.findViewById(R.id.divider);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        showLetter(i, viewHolder.letterText);
        showDivider(i, viewHolder.divider);
        MobilePhoneRegion mobilePhoneRegion = this.mPhoneRegionList.get(i);
        viewHolder.regionText.setText(getFormattedRegion(mobilePhoneRegion));
        viewHolder.phonePrefixView.setText(mobilePhoneRegion.mobilePhoneRegionCode);
        return view;
    }

    public void filter(@Nullable CharSequence charSequence) {
        ACLog.d(Constants.TAG, "PhoneRegionListAdapter#filter, filter string: ".concat(String.valueOf(charSequence)));
        if (charSequence == null || TextUtils.isEmpty(charSequence.toString()) || TextUtils.isEmpty(charSequence.toString().trim())) {
            this.mPhoneRegionList = this.mBackupPhoneRegionList;
            this.mIsFilter = false;
        } else {
            Pattern compile = Pattern.compile(charSequence.toString().trim().toUpperCase(Locale.ROOT));
            ArrayList arrayList = new ArrayList();
            for (MobilePhoneRegion next : this.mBackupPhoneRegionList) {
                if (next == null) {
                    ACLog.e(Constants.TAG, "PhoneRegionListAdapter#filter, region model is null");
                } else if (TextUtils.isEmpty(next.regionName)) {
                    StringBuilder sb = new StringBuilder("PhoneRegionListAdapter#filter, region name is empty, region: ");
                    sb.append(next.regionCode);
                    sb.append(", regionName: ");
                    sb.append(next.regionName);
                    sb.append(", mobilePhoneRegionCode: ");
                    sb.append(next.mobilePhoneRegionCode);
                    ACLog.e(Constants.TAG, sb.toString());
                } else if (compile.matcher(getFormattedRegion(next)).find()) {
                    arrayList.add(next);
                }
            }
            this.mPhoneRegionList = arrayList;
            this.mIsFilter = true;
        }
        notifyDataSetChanged();
    }

    private void convertData(@NonNull List<RegionsGroupByInitial> list) {
        this.mPhoneRegionList = new ArrayList();
        this.mSectionPositionMap = new HashMap<>();
        int i = 0;
        for (RegionsGroupByInitial next : list) {
            if (next == null) {
                ACLog.e(Constants.TAG, "PhoneRegionListAdapter#convertData, ACCDNPhoneRegionCodeList is null");
            } else if (next.mobilePhoneRegions == null || next.mobilePhoneRegions.isEmpty()) {
                ACLog.e(Constants.TAG, "PhoneRegionListAdapter#convertData, phoneRegionCodeList in ACCDNPhoneRegionCodeList is null");
            } else {
                this.mPhoneRegionList.addAll(next.mobilePhoneRegions);
                this.mSectionPositionMap.put(Integer.valueOf(i), next.regionInitial);
                i += next.mobilePhoneRegions.size();
            }
        }
    }

    private void showLetter(int i, TextView textView) {
        if (isShowLetter(i)) {
            textView.setVisibility(0);
            textView.setText(this.mSectionPositionMap.get(Integer.valueOf(i)));
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ACLog.d(Constants.TAG, "PhoneRegionListAdapter#showLetter, letter click, do nothing");
                }
            });
            return;
        }
        textView.setVisibility(8);
    }

    private void showDivider(int i, View view) {
        if (isHideDivider(i)) {
            view.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.mIsFilter || i != this.mPhoneRegionList.size() - 1) {
            layoutParams.height = UIUtils.dp2px(this.mContext, 1);
        } else {
            layoutParams.height = 1;
        }
        view.setVisibility(0);
        view.setLayoutParams(layoutParams);
    }

    private boolean isShowLetter(int i) {
        if (this.mIsFilter) {
            return false;
        }
        return this.mSectionPositionMap.containsKey(Integer.valueOf(i));
    }

    private boolean isHideDivider(int i) {
        if (!this.mIsFilter && i != this.mPhoneRegionList.size() - 1) {
            return this.mSectionPositionMap.containsKey(Integer.valueOf(i + 1));
        }
        return false;
    }

    private String getFormattedRegion(@NonNull MobilePhoneRegion mobilePhoneRegion) {
        return String.format(REGION_FORMAT_RULE, new Object[]{mobilePhoneRegion.regionCode, mobilePhoneRegion.regionName});
    }

    static class ViewHolder {
        View divider;
        TextView letterText;
        TextView phonePrefixView;
        TextView regionText;

        private ViewHolder() {
        }
    }
}
