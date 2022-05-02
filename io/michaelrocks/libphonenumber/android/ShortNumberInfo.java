package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.Phonenumber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.TinyMenuUtils;
import o.setCloseButtonOnLongClickListener;
import o.setDefaultImageColor;
import o.setFavoriteButtonClickListener;

public class ShortNumberInfo {
    private static final Set<String> REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT;
    private static final Logger logger = Logger.getLogger(ShortNumberInfo.class.getName());
    private final Map<Integer, List<String>> countryCallingCodeToRegionCodeMap = setDefaultImageColor.getCountryCodeToRegionCodeMap();
    private final setFavoriteButtonClickListener matcherApi;
    private final TinyMenuUtils metadataSource;

    public enum ShortNumberCost {
        TOLL_FREE,
        STANDARD_RATE,
        PREMIUM_RATE,
        UNKNOWN_COST
    }

    static {
        HashSet hashSet = new HashSet();
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT = hashSet;
        hashSet.add("BR");
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.add("CL");
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.add("NI");
    }

    ShortNumberInfo(TinyMenuUtils tinyMenuUtils, setFavoriteButtonClickListener setfavoritebuttonclicklistener) {
        this.metadataSource = tinyMenuUtils;
        this.matcherApi = setfavoritebuttonclicklistener;
    }

    private List<String> getRegionCodesForCountryCode(int i) {
        List list = this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList(0);
        }
        return Collections.unmodifiableList(list);
    }

    private boolean regionDialingFromMatchesNumber(Phonenumber.PhoneNumber phoneNumber, String str) {
        return getRegionCodesForCountryCode(phoneNumber.getCountryCode()).contains(str);
    }

    public boolean isPossibleShortNumberForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion;
        if (!regionDialingFromMatchesNumber(phoneNumber, str) || (shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str)) == null) {
            return false;
        }
        return shortNumberMetadataForRegion.getGeneralDesc().getPossibleLengthList().contains(Integer.valueOf(getNationalSignificantNumber(phoneNumber).length()));
    }

    public boolean isPossibleShortNumber(Phonenumber.PhoneNumber phoneNumber) {
        List<String> regionCodesForCountryCode = getRegionCodesForCountryCode(phoneNumber.getCountryCode());
        int length = getNationalSignificantNumber(phoneNumber).length();
        for (String shortNumberMetadataForRegion : regionCodesForCountryCode) {
            setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion2 = this.metadataSource.getShortNumberMetadataForRegion(shortNumberMetadataForRegion);
            if (shortNumberMetadataForRegion2 != null && shortNumberMetadataForRegion2.getGeneralDesc().getPossibleLengthList().contains(Integer.valueOf(length))) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidShortNumberForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion;
        if (!regionDialingFromMatchesNumber(phoneNumber, str) || (shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str)) == null) {
            return false;
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getGeneralDesc())) {
            return false;
        }
        return matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getShortCode());
    }

    public boolean isValidShortNumber(Phonenumber.PhoneNumber phoneNumber) {
        List<String> regionCodesForCountryCode = getRegionCodesForCountryCode(phoneNumber.getCountryCode());
        String regionCodeForShortNumberFromRegionList = getRegionCodeForShortNumberFromRegionList(phoneNumber, regionCodesForCountryCode);
        if (regionCodesForCountryCode.size() <= 1 || regionCodeForShortNumberFromRegionList == null) {
            return isValidShortNumberForRegion(phoneNumber, regionCodeForShortNumberFromRegionList);
        }
        return true;
    }

    public ShortNumberCost getExpectedCostForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        if (!regionDialingFromMatchesNumber(phoneNumber, str)) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!shortNumberMetadataForRegion.getGeneralDesc().getPossibleLengthList().contains(Integer.valueOf(nationalSignificantNumber.length()))) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getPremiumRate())) {
            return ShortNumberCost.PREMIUM_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getStandardRate())) {
            return ShortNumberCost.STANDARD_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getTollFree())) {
            return ShortNumberCost.TOLL_FREE;
        }
        if (isEmergencyNumber(nationalSignificantNumber, str)) {
            return ShortNumberCost.TOLL_FREE;
        }
        return ShortNumberCost.UNKNOWN_COST;
    }

    public ShortNumberCost getExpectedCost(Phonenumber.PhoneNumber phoneNumber) {
        List<String> regionCodesForCountryCode = getRegionCodesForCountryCode(phoneNumber.getCountryCode());
        if (regionCodesForCountryCode.size() == 0) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        if (regionCodesForCountryCode.size() == 1) {
            return getExpectedCostForRegion(phoneNumber, regionCodesForCountryCode.get(0));
        }
        ShortNumberCost shortNumberCost = ShortNumberCost.TOLL_FREE;
        for (String expectedCostForRegion : regionCodesForCountryCode) {
            ShortNumberCost expectedCostForRegion2 = getExpectedCostForRegion(phoneNumber, expectedCostForRegion);
            int i = AnonymousClass1.$SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost[expectedCostForRegion2.ordinal()];
            if (i == 1) {
                return ShortNumberCost.PREMIUM_RATE;
            }
            if (i == 2) {
                shortNumberCost = ShortNumberCost.UNKNOWN_COST;
            } else if (i != 3) {
                if (i != 4) {
                    logger.log(Level.SEVERE, "Unrecognised cost for region: ".concat(String.valueOf(expectedCostForRegion2)));
                }
            } else if (shortNumberCost != ShortNumberCost.UNKNOWN_COST) {
                shortNumberCost = ShortNumberCost.STANDARD_RATE;
            }
        }
        return shortNumberCost;
    }

    /* renamed from: io.michaelrocks.libphonenumber.android.ShortNumberInfo$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.michaelrocks.libphonenumber.android.ShortNumberInfo$ShortNumberCost[] r0 = io.michaelrocks.libphonenumber.android.ShortNumberInfo.ShortNumberCost.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost = r0
                io.michaelrocks.libphonenumber.android.ShortNumberInfo$ShortNumberCost r1 = io.michaelrocks.libphonenumber.android.ShortNumberInfo.ShortNumberCost.PREMIUM_RATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost     // Catch:{ NoSuchFieldError -> 0x001d }
                io.michaelrocks.libphonenumber.android.ShortNumberInfo$ShortNumberCost r1 = io.michaelrocks.libphonenumber.android.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.michaelrocks.libphonenumber.android.ShortNumberInfo$ShortNumberCost r1 = io.michaelrocks.libphonenumber.android.ShortNumberInfo.ShortNumberCost.STANDARD_RATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.michaelrocks.libphonenumber.android.ShortNumberInfo$ShortNumberCost r1 = io.michaelrocks.libphonenumber.android.ShortNumberInfo.ShortNumberCost.TOLL_FREE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.michaelrocks.libphonenumber.android.ShortNumberInfo.AnonymousClass1.<clinit>():void");
        }
    }

    private String getRegionCodeForShortNumberFromRegionList(Phonenumber.PhoneNumber phoneNumber, List<String> list) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        for (String next : list) {
            setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(next);
            if (shortNumberMetadataForRegion != null && matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getShortCode())) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Set<String> getSupportedRegions() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: package-private */
    public String getExampleShortNumber(String str) {
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null) {
            return "";
        }
        setCloseButtonOnLongClickListener.getMax shortCode = shortNumberMetadataForRegion.getShortCode();
        if (shortCode.hasExampleNumber()) {
            return shortCode.getExampleNumber();
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public String getExampleShortNumberForCost(String str, ShortNumberCost shortNumberCost) {
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null) {
            return "";
        }
        setCloseButtonOnLongClickListener.getMax getmax = null;
        int i = AnonymousClass1.$SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost[shortNumberCost.ordinal()];
        if (i == 1) {
            getmax = shortNumberMetadataForRegion.getPremiumRate();
        } else if (i == 3) {
            getmax = shortNumberMetadataForRegion.getStandardRate();
        } else if (i == 4) {
            getmax = shortNumberMetadataForRegion.getTollFree();
        }
        if (getmax == null || !getmax.hasExampleNumber()) {
            return "";
        }
        return getmax.getExampleNumber();
    }

    public boolean connectsToEmergencyNumber(String str, String str2) {
        return matchesEmergencyNumberHelper(str, str2, true);
    }

    public boolean isEmergencyNumber(CharSequence charSequence, String str) {
        return matchesEmergencyNumberHelper(charSequence, str, false);
    }

    private boolean matchesEmergencyNumberHelper(CharSequence charSequence, String str, boolean z) {
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion;
        CharSequence extractPossibleNumber = PhoneNumberUtil.extractPossibleNumber(charSequence);
        boolean z2 = false;
        if (PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(extractPossibleNumber).lookingAt() || (shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str)) == null || !shortNumberMetadataForRegion.hasEmergency()) {
            return false;
        }
        String normalizeDigitsOnly = PhoneNumberUtil.normalizeDigitsOnly(extractPossibleNumber);
        if (z && !REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.contains(str)) {
            z2 = true;
        }
        return this.matcherApi.matchNationalNumber(normalizeDigitsOnly, shortNumberMetadataForRegion.getEmergency(), z2);
    }

    public boolean isCarrierSpecific(Phonenumber.PhoneNumber phoneNumber) {
        String regionCodeForShortNumberFromRegionList = getRegionCodeForShortNumberFromRegionList(phoneNumber, getRegionCodesForCountryCode(phoneNumber.getCountryCode()));
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(regionCodeForShortNumberFromRegionList);
        return shortNumberMetadataForRegion != null && matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getCarrierSpecific());
    }

    public boolean isCarrierSpecificForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        if (!regionDialingFromMatchesNumber(phoneNumber, str)) {
            return false;
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null || !matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getCarrierSpecific())) {
            return false;
        }
        return true;
    }

    public boolean isSmsServiceForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        setCloseButtonOnLongClickListener.getMin shortNumberMetadataForRegion;
        if (regionDialingFromMatchesNumber(phoneNumber, str) && (shortNumberMetadataForRegion = this.metadataSource.getShortNumberMetadataForRegion(str)) != null && matchesPossibleNumberAndNationalNumber(getNationalSignificantNumber(phoneNumber), shortNumberMetadataForRegion.getSmsServices())) {
            return true;
        }
        return false;
    }

    private static String getNationalSignificantNumber(Phonenumber.PhoneNumber phoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phoneNumber.isItalianLeadingZero()) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    private boolean matchesPossibleNumberAndNationalNumber(String str, setCloseButtonOnLongClickListener.getMax getmax) {
        if (getmax.getPossibleLengthCount() <= 0 || getmax.getPossibleLengthList().contains(Integer.valueOf(str.length()))) {
            return this.matcherApi.matchNationalNumber(str, getmax, false);
        }
        return false;
    }
}
