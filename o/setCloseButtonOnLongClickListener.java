package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public final class setCloseButtonOnLongClickListener {
    private setCloseButtonOnLongClickListener() {
    }

    public static class setMax implements Externalizable {
        private static final long serialVersionUID = 1;
        private String domesticCarrierCodeFormattingRule_ = "";
        private String format_ = "";
        private boolean hasDomesticCarrierCodeFormattingRule;
        private boolean hasFormat;
        private boolean hasNationalPrefixFormattingRule;
        private boolean hasNationalPrefixOptionalWhenFormatting;
        private boolean hasPattern;
        private List<String> leadingDigitsPattern_ = new ArrayList();
        private String nationalPrefixFormattingRule_ = "";
        private boolean nationalPrefixOptionalWhenFormatting_ = false;
        private String pattern_ = "";

        public static final class setMin extends setMax {
            public final setMax build() {
                return this;
            }

            public final setMin mergeFrom(setMax setmax) {
                if (setmax.hasPattern()) {
                    setPattern(setmax.getPattern());
                }
                if (setmax.hasFormat()) {
                    setFormat(setmax.getFormat());
                }
                for (int i = 0; i < setmax.leadingDigitsPatternSize(); i++) {
                    addLeadingDigitsPattern(setmax.getLeadingDigitsPattern(i));
                }
                if (setmax.hasNationalPrefixFormattingRule()) {
                    setNationalPrefixFormattingRule(setmax.getNationalPrefixFormattingRule());
                }
                if (setmax.hasDomesticCarrierCodeFormattingRule()) {
                    setDomesticCarrierCodeFormattingRule(setmax.getDomesticCarrierCodeFormattingRule());
                }
                if (setmax.hasNationalPrefixOptionalWhenFormatting()) {
                    setNationalPrefixOptionalWhenFormatting(setmax.getNationalPrefixOptionalWhenFormatting());
                }
                return this;
            }
        }

        public static setMin newBuilder() {
            return new setMin();
        }

        public boolean hasPattern() {
            return this.hasPattern;
        }

        public String getPattern() {
            return this.pattern_;
        }

        public setMax setPattern(String str) {
            this.hasPattern = true;
            this.pattern_ = str;
            return this;
        }

        public boolean hasFormat() {
            return this.hasFormat;
        }

        public String getFormat() {
            return this.format_;
        }

        public setMax setFormat(String str) {
            this.hasFormat = true;
            this.format_ = str;
            return this;
        }

        public List<String> leadingDigitPatterns() {
            return this.leadingDigitsPattern_;
        }

        public int leadingDigitsPatternSize() {
            return this.leadingDigitsPattern_.size();
        }

        public String getLeadingDigitsPattern(int i) {
            return this.leadingDigitsPattern_.get(i);
        }

        public setMax addLeadingDigitsPattern(String str) {
            if (str != null) {
                this.leadingDigitsPattern_.add(str);
                return this;
            }
            throw null;
        }

        public boolean hasNationalPrefixFormattingRule() {
            return this.hasNationalPrefixFormattingRule;
        }

        public String getNationalPrefixFormattingRule() {
            return this.nationalPrefixFormattingRule_;
        }

        public setMax setNationalPrefixFormattingRule(String str) {
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = str;
            return this;
        }

        public setMax clearNationalPrefixFormattingRule() {
            this.hasNationalPrefixFormattingRule = false;
            this.nationalPrefixFormattingRule_ = "";
            return this;
        }

        public boolean hasNationalPrefixOptionalWhenFormatting() {
            return this.hasNationalPrefixOptionalWhenFormatting;
        }

        public boolean getNationalPrefixOptionalWhenFormatting() {
            return this.nationalPrefixOptionalWhenFormatting_;
        }

        public setMax setNationalPrefixOptionalWhenFormatting(boolean z) {
            this.hasNationalPrefixOptionalWhenFormatting = true;
            this.nationalPrefixOptionalWhenFormatting_ = z;
            return this;
        }

        public boolean hasDomesticCarrierCodeFormattingRule() {
            return this.hasDomesticCarrierCodeFormattingRule;
        }

        public String getDomesticCarrierCodeFormattingRule() {
            return this.domesticCarrierCodeFormattingRule_;
        }

        public setMax setDomesticCarrierCodeFormattingRule(String str) {
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = str;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this.pattern_);
            objectOutput.writeUTF(this.format_);
            int leadingDigitsPatternSize = leadingDigitsPatternSize();
            objectOutput.writeInt(leadingDigitsPatternSize);
            for (int i = 0; i < leadingDigitsPatternSize; i++) {
                objectOutput.writeUTF(this.leadingDigitsPattern_.get(i));
            }
            objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
            if (this.hasNationalPrefixFormattingRule) {
                objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
            }
            objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
            if (this.hasDomesticCarrierCodeFormattingRule) {
                objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
            }
            objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            setPattern(objectInput.readUTF());
            setFormat(objectInput.readUTF());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.leadingDigitsPattern_.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixFormattingRule(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setDomesticCarrierCodeFormattingRule(objectInput.readUTF());
            }
            setNationalPrefixOptionalWhenFormatting(objectInput.readBoolean());
        }
    }

    public static class getMax implements Externalizable {
        private static final long serialVersionUID = 1;
        private String exampleNumber_ = "";
        private boolean hasExampleNumber;
        private boolean hasNationalNumberPattern;
        private String nationalNumberPattern_ = "";
        private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
        private List<Integer> possibleLength_ = new ArrayList();

        /* renamed from: o.setCloseButtonOnLongClickListener$getMax$getMax  reason: collision with other inner class name */
        public static final class C0110getMax extends getMax {
            public final getMax build() {
                return this;
            }

            public final C0110getMax mergeFrom(getMax getmax) {
                if (getmax.hasNationalNumberPattern()) {
                    setNationalNumberPattern(getmax.getNationalNumberPattern());
                }
                for (int i = 0; i < getmax.getPossibleLengthCount(); i++) {
                    addPossibleLength(getmax.getPossibleLength(i));
                }
                for (int i2 = 0; i2 < getmax.getPossibleLengthLocalOnlyCount(); i2++) {
                    addPossibleLengthLocalOnly(getmax.getPossibleLengthLocalOnly(i2));
                }
                if (getmax.hasExampleNumber()) {
                    setExampleNumber(getmax.getExampleNumber());
                }
                return this;
            }
        }

        public static C0110getMax newBuilder() {
            return new C0110getMax();
        }

        public boolean hasNationalNumberPattern() {
            return this.hasNationalNumberPattern;
        }

        public String getNationalNumberPattern() {
            return this.nationalNumberPattern_;
        }

        public getMax setNationalNumberPattern(String str) {
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = str;
            return this;
        }

        public getMax clearNationalNumberPattern() {
            this.hasNationalNumberPattern = false;
            this.nationalNumberPattern_ = "";
            return this;
        }

        public List<Integer> getPossibleLengthList() {
            return this.possibleLength_;
        }

        public int getPossibleLengthCount() {
            return this.possibleLength_.size();
        }

        public int getPossibleLength(int i) {
            return this.possibleLength_.get(i).intValue();
        }

        public getMax addPossibleLength(int i) {
            this.possibleLength_.add(Integer.valueOf(i));
            return this;
        }

        public getMax clearPossibleLength() {
            this.possibleLength_.clear();
            return this;
        }

        public List<Integer> getPossibleLengthLocalOnlyList() {
            return this.possibleLengthLocalOnly_;
        }

        public int getPossibleLengthLocalOnlyCount() {
            return this.possibleLengthLocalOnly_.size();
        }

        public int getPossibleLengthLocalOnly(int i) {
            return this.possibleLengthLocalOnly_.get(i).intValue();
        }

        public getMax addPossibleLengthLocalOnly(int i) {
            this.possibleLengthLocalOnly_.add(Integer.valueOf(i));
            return this;
        }

        public getMax clearPossibleLengthLocalOnly() {
            this.possibleLengthLocalOnly_.clear();
            return this;
        }

        public boolean hasExampleNumber() {
            return this.hasExampleNumber;
        }

        public String getExampleNumber() {
            return this.exampleNumber_;
        }

        public getMax setExampleNumber(String str) {
            this.hasExampleNumber = true;
            this.exampleNumber_ = str;
            return this;
        }

        public getMax clearExampleNumber() {
            this.hasExampleNumber = false;
            this.exampleNumber_ = "";
            return this;
        }

        public boolean exactlySameAs(getMax getmax) {
            return this.nationalNumberPattern_.equals(getmax.nationalNumberPattern_) && this.possibleLength_.equals(getmax.possibleLength_) && this.possibleLengthLocalOnly_.equals(getmax.possibleLengthLocalOnly_) && this.exampleNumber_.equals(getmax.exampleNumber_);
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.hasNationalNumberPattern);
            if (this.hasNationalNumberPattern) {
                objectOutput.writeUTF(this.nationalNumberPattern_);
            }
            int possibleLengthCount = getPossibleLengthCount();
            objectOutput.writeInt(possibleLengthCount);
            for (int i = 0; i < possibleLengthCount; i++) {
                objectOutput.writeInt(this.possibleLength_.get(i).intValue());
            }
            int possibleLengthLocalOnlyCount = getPossibleLengthLocalOnlyCount();
            objectOutput.writeInt(possibleLengthLocalOnlyCount);
            for (int i2 = 0; i2 < possibleLengthLocalOnlyCount; i2++) {
                objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i2).intValue());
            }
            objectOutput.writeBoolean(this.hasExampleNumber);
            if (this.hasExampleNumber) {
                objectOutput.writeUTF(this.exampleNumber_);
            }
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                setNationalNumberPattern(objectInput.readUTF());
            }
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                setExampleNumber(objectInput.readUTF());
            }
        }
    }

    public static class getMin implements Externalizable {
        private static final long serialVersionUID = 1;
        private getMax carrierSpecific_ = null;
        private int countryCode_ = 0;
        private getMax emergency_ = null;
        private getMax fixedLine_ = null;
        private getMax generalDesc_ = null;
        private boolean hasCarrierSpecific;
        private boolean hasCountryCode;
        private boolean hasEmergency;
        private boolean hasFixedLine;
        private boolean hasGeneralDesc;
        private boolean hasId;
        private boolean hasInternationalPrefix;
        private boolean hasLeadingDigits;
        private boolean hasLeadingZeroPossible;
        private boolean hasMainCountryForCode;
        private boolean hasMobile;
        private boolean hasMobileNumberPortableRegion;
        private boolean hasNationalPrefix;
        private boolean hasNationalPrefixForParsing;
        private boolean hasNationalPrefixTransformRule;
        private boolean hasNoInternationalDialling;
        private boolean hasPager;
        private boolean hasPersonalNumber;
        private boolean hasPreferredExtnPrefix;
        private boolean hasPreferredInternationalPrefix;
        private boolean hasPremiumRate;
        private boolean hasSameMobileAndFixedLinePattern;
        private boolean hasSharedCost;
        private boolean hasShortCode;
        private boolean hasSmsServices;
        private boolean hasStandardRate;
        private boolean hasTollFree;
        private boolean hasUan;
        private boolean hasVoicemail;
        private boolean hasVoip;
        private String id_ = "";
        private String internationalPrefix_ = "";
        private List<setMax> intlNumberFormat_ = new ArrayList();
        private String leadingDigits_ = "";
        private boolean leadingZeroPossible_ = false;
        private boolean mainCountryForCode_ = false;
        private boolean mobileNumberPortableRegion_ = false;
        private getMax mobile_ = null;
        private String nationalPrefixForParsing_ = "";
        private String nationalPrefixTransformRule_ = "";
        private String nationalPrefix_ = "";
        private getMax noInternationalDialling_ = null;
        private List<setMax> numberFormat_ = new ArrayList();
        private getMax pager_ = null;
        private getMax personalNumber_ = null;
        private String preferredExtnPrefix_ = "";
        private String preferredInternationalPrefix_ = "";
        private getMax premiumRate_ = null;
        private boolean sameMobileAndFixedLinePattern_ = false;
        private getMax sharedCost_ = null;
        private getMax shortCode_ = null;
        private getMax smsServices_ = null;
        private getMax standardRate_ = null;
        private getMax tollFree_ = null;
        private getMax uan_ = null;
        private getMax voicemail_ = null;
        private getMax voip_ = null;

        public static final class getMax extends getMin {
            public final getMin build() {
                return this;
            }
        }

        public static getMax newBuilder() {
            return new getMax();
        }

        public boolean hasGeneralDesc() {
            return this.hasGeneralDesc;
        }

        public getMax getGeneralDesc() {
            return this.generalDesc_;
        }

        public getMin setGeneralDesc(getMax getmax) {
            if (getmax != null) {
                this.hasGeneralDesc = true;
                this.generalDesc_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasFixedLine() {
            return this.hasFixedLine;
        }

        public getMax getFixedLine() {
            return this.fixedLine_;
        }

        public getMin setFixedLine(getMax getmax) {
            if (getmax != null) {
                this.hasFixedLine = true;
                this.fixedLine_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasMobile() {
            return this.hasMobile;
        }

        public getMax getMobile() {
            return this.mobile_;
        }

        public getMin setMobile(getMax getmax) {
            if (getmax != null) {
                this.hasMobile = true;
                this.mobile_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasTollFree() {
            return this.hasTollFree;
        }

        public getMax getTollFree() {
            return this.tollFree_;
        }

        public getMin setTollFree(getMax getmax) {
            if (getmax != null) {
                this.hasTollFree = true;
                this.tollFree_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasPremiumRate() {
            return this.hasPremiumRate;
        }

        public getMax getPremiumRate() {
            return this.premiumRate_;
        }

        public getMin setPremiumRate(getMax getmax) {
            if (getmax != null) {
                this.hasPremiumRate = true;
                this.premiumRate_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasSharedCost() {
            return this.hasSharedCost;
        }

        public getMax getSharedCost() {
            return this.sharedCost_;
        }

        public getMin setSharedCost(getMax getmax) {
            if (getmax != null) {
                this.hasSharedCost = true;
                this.sharedCost_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasPersonalNumber() {
            return this.hasPersonalNumber;
        }

        public getMax getPersonalNumber() {
            return this.personalNumber_;
        }

        public getMin setPersonalNumber(getMax getmax) {
            if (getmax != null) {
                this.hasPersonalNumber = true;
                this.personalNumber_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasVoip() {
            return this.hasVoip;
        }

        public getMax getVoip() {
            return this.voip_;
        }

        public getMin setVoip(getMax getmax) {
            if (getmax != null) {
                this.hasVoip = true;
                this.voip_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasPager() {
            return this.hasPager;
        }

        public getMax getPager() {
            return this.pager_;
        }

        public getMin setPager(getMax getmax) {
            if (getmax != null) {
                this.hasPager = true;
                this.pager_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasUan() {
            return this.hasUan;
        }

        public getMax getUan() {
            return this.uan_;
        }

        public getMin setUan(getMax getmax) {
            if (getmax != null) {
                this.hasUan = true;
                this.uan_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasEmergency() {
            return this.hasEmergency;
        }

        public getMax getEmergency() {
            return this.emergency_;
        }

        public getMin setEmergency(getMax getmax) {
            if (getmax != null) {
                this.hasEmergency = true;
                this.emergency_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasVoicemail() {
            return this.hasVoicemail;
        }

        public getMax getVoicemail() {
            return this.voicemail_;
        }

        public getMin setVoicemail(getMax getmax) {
            if (getmax != null) {
                this.hasVoicemail = true;
                this.voicemail_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasShortCode() {
            return this.hasShortCode;
        }

        public getMax getShortCode() {
            return this.shortCode_;
        }

        public getMin setShortCode(getMax getmax) {
            if (getmax != null) {
                this.hasShortCode = true;
                this.shortCode_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasStandardRate() {
            return this.hasStandardRate;
        }

        public getMax getStandardRate() {
            return this.standardRate_;
        }

        public getMin setStandardRate(getMax getmax) {
            if (getmax != null) {
                this.hasStandardRate = true;
                this.standardRate_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasCarrierSpecific() {
            return this.hasCarrierSpecific;
        }

        public getMax getCarrierSpecific() {
            return this.carrierSpecific_;
        }

        public getMin setCarrierSpecific(getMax getmax) {
            if (getmax != null) {
                this.hasCarrierSpecific = true;
                this.carrierSpecific_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasSmsServices() {
            return this.hasSmsServices;
        }

        public getMax getSmsServices() {
            return this.smsServices_;
        }

        public getMin setSmsServices(getMax getmax) {
            if (getmax != null) {
                this.hasSmsServices = true;
                this.smsServices_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasNoInternationalDialling() {
            return this.hasNoInternationalDialling;
        }

        public getMax getNoInternationalDialling() {
            return this.noInternationalDialling_;
        }

        public getMin setNoInternationalDialling(getMax getmax) {
            if (getmax != null) {
                this.hasNoInternationalDialling = true;
                this.noInternationalDialling_ = getmax;
                return this;
            }
            throw null;
        }

        public boolean hasId() {
            return this.hasId;
        }

        public String getId() {
            return this.id_;
        }

        public getMin setId(String str) {
            this.hasId = true;
            this.id_ = str;
            return this;
        }

        public boolean hasCountryCode() {
            return this.hasCountryCode;
        }

        public int getCountryCode() {
            return this.countryCode_;
        }

        public getMin setCountryCode(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        public boolean hasInternationalPrefix() {
            return this.hasInternationalPrefix;
        }

        public String getInternationalPrefix() {
            return this.internationalPrefix_;
        }

        public getMin setInternationalPrefix(String str) {
            this.hasInternationalPrefix = true;
            this.internationalPrefix_ = str;
            return this;
        }

        public boolean hasPreferredInternationalPrefix() {
            return this.hasPreferredInternationalPrefix;
        }

        public String getPreferredInternationalPrefix() {
            return this.preferredInternationalPrefix_;
        }

        public getMin setPreferredInternationalPrefix(String str) {
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = str;
            return this;
        }

        public getMin clearPreferredInternationalPrefix() {
            this.hasPreferredInternationalPrefix = false;
            this.preferredInternationalPrefix_ = "";
            return this;
        }

        public boolean hasNationalPrefix() {
            return this.hasNationalPrefix;
        }

        public String getNationalPrefix() {
            return this.nationalPrefix_;
        }

        public getMin setNationalPrefix(String str) {
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = str;
            return this;
        }

        public getMin clearNationalPrefix() {
            this.hasNationalPrefix = false;
            this.nationalPrefix_ = "";
            return this;
        }

        public boolean hasPreferredExtnPrefix() {
            return this.hasPreferredExtnPrefix;
        }

        public String getPreferredExtnPrefix() {
            return this.preferredExtnPrefix_;
        }

        public getMin setPreferredExtnPrefix(String str) {
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = str;
            return this;
        }

        public getMin clearPreferredExtnPrefix() {
            this.hasPreferredExtnPrefix = false;
            this.preferredExtnPrefix_ = "";
            return this;
        }

        public boolean hasNationalPrefixForParsing() {
            return this.hasNationalPrefixForParsing;
        }

        public String getNationalPrefixForParsing() {
            return this.nationalPrefixForParsing_;
        }

        public getMin setNationalPrefixForParsing(String str) {
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = str;
            return this;
        }

        public boolean hasNationalPrefixTransformRule() {
            return this.hasNationalPrefixTransformRule;
        }

        public String getNationalPrefixTransformRule() {
            return this.nationalPrefixTransformRule_;
        }

        public getMin setNationalPrefixTransformRule(String str) {
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = str;
            return this;
        }

        public getMin clearNationalPrefixTransformRule() {
            this.hasNationalPrefixTransformRule = false;
            this.nationalPrefixTransformRule_ = "";
            return this;
        }

        public boolean hasSameMobileAndFixedLinePattern() {
            return this.hasSameMobileAndFixedLinePattern;
        }

        public boolean getSameMobileAndFixedLinePattern() {
            return this.sameMobileAndFixedLinePattern_;
        }

        public getMin setSameMobileAndFixedLinePattern(boolean z) {
            this.hasSameMobileAndFixedLinePattern = true;
            this.sameMobileAndFixedLinePattern_ = z;
            return this;
        }

        public getMin clearSameMobileAndFixedLinePattern() {
            this.hasSameMobileAndFixedLinePattern = false;
            this.sameMobileAndFixedLinePattern_ = false;
            return this;
        }

        public List<setMax> numberFormats() {
            return this.numberFormat_;
        }

        public int numberFormatSize() {
            return this.numberFormat_.size();
        }

        public setMax getNumberFormat(int i) {
            return this.numberFormat_.get(i);
        }

        public getMin addNumberFormat(setMax setmax) {
            if (setmax != null) {
                this.numberFormat_.add(setmax);
                return this;
            }
            throw null;
        }

        public List<setMax> intlNumberFormats() {
            return this.intlNumberFormat_;
        }

        public int intlNumberFormatSize() {
            return this.intlNumberFormat_.size();
        }

        public setMax getIntlNumberFormat(int i) {
            return this.intlNumberFormat_.get(i);
        }

        public getMin addIntlNumberFormat(setMax setmax) {
            if (setmax != null) {
                this.intlNumberFormat_.add(setmax);
                return this;
            }
            throw null;
        }

        public getMin clearIntlNumberFormat() {
            this.intlNumberFormat_.clear();
            return this;
        }

        public boolean hasMainCountryForCode() {
            return this.hasMainCountryForCode;
        }

        public boolean isMainCountryForCode() {
            return this.mainCountryForCode_;
        }

        public boolean getMainCountryForCode() {
            return this.mainCountryForCode_;
        }

        public getMin setMainCountryForCode(boolean z) {
            this.hasMainCountryForCode = true;
            this.mainCountryForCode_ = z;
            return this;
        }

        public getMin clearMainCountryForCode() {
            this.hasMainCountryForCode = false;
            this.mainCountryForCode_ = false;
            return this;
        }

        public boolean hasLeadingDigits() {
            return this.hasLeadingDigits;
        }

        public String getLeadingDigits() {
            return this.leadingDigits_;
        }

        public getMin setLeadingDigits(String str) {
            this.hasLeadingDigits = true;
            this.leadingDigits_ = str;
            return this;
        }

        public boolean hasLeadingZeroPossible() {
            return this.hasLeadingZeroPossible;
        }

        public boolean isLeadingZeroPossible() {
            return this.leadingZeroPossible_;
        }

        public getMin setLeadingZeroPossible(boolean z) {
            this.hasLeadingZeroPossible = true;
            this.leadingZeroPossible_ = z;
            return this;
        }

        public getMin clearLeadingZeroPossible() {
            this.hasLeadingZeroPossible = false;
            this.leadingZeroPossible_ = false;
            return this;
        }

        public boolean hasMobileNumberPortableRegion() {
            return this.hasMobileNumberPortableRegion;
        }

        public boolean isMobileNumberPortableRegion() {
            return this.mobileNumberPortableRegion_;
        }

        public getMin setMobileNumberPortableRegion(boolean z) {
            this.hasMobileNumberPortableRegion = true;
            this.mobileNumberPortableRegion_ = z;
            return this;
        }

        public getMin clearMobileNumberPortableRegion() {
            this.hasMobileNumberPortableRegion = false;
            this.mobileNumberPortableRegion_ = false;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.hasGeneralDesc);
            if (this.hasGeneralDesc) {
                this.generalDesc_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasFixedLine);
            if (this.hasFixedLine) {
                this.fixedLine_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasMobile);
            if (this.hasMobile) {
                this.mobile_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasTollFree);
            if (this.hasTollFree) {
                this.tollFree_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPremiumRate);
            if (this.hasPremiumRate) {
                this.premiumRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSharedCost);
            if (this.hasSharedCost) {
                this.sharedCost_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPersonalNumber);
            if (this.hasPersonalNumber) {
                this.personalNumber_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoip);
            if (this.hasVoip) {
                this.voip_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPager);
            if (this.hasPager) {
                this.pager_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasUan);
            if (this.hasUan) {
                this.uan_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasEmergency);
            if (this.hasEmergency) {
                this.emergency_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoicemail);
            if (this.hasVoicemail) {
                this.voicemail_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasShortCode);
            if (this.hasShortCode) {
                this.shortCode_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasStandardRate);
            if (this.hasStandardRate) {
                this.standardRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasCarrierSpecific);
            if (this.hasCarrierSpecific) {
                this.carrierSpecific_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSmsServices);
            if (this.hasSmsServices) {
                this.smsServices_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasNoInternationalDialling);
            if (this.hasNoInternationalDialling) {
                this.noInternationalDialling_.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.id_);
            objectOutput.writeInt(this.countryCode_);
            objectOutput.writeUTF(this.internationalPrefix_);
            objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
            if (this.hasPreferredInternationalPrefix) {
                objectOutput.writeUTF(this.preferredInternationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefix);
            if (this.hasNationalPrefix) {
                objectOutput.writeUTF(this.nationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
            if (this.hasPreferredExtnPrefix) {
                objectOutput.writeUTF(this.preferredExtnPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
            if (this.hasNationalPrefixForParsing) {
                objectOutput.writeUTF(this.nationalPrefixForParsing_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
            if (this.hasNationalPrefixTransformRule) {
                objectOutput.writeUTF(this.nationalPrefixTransformRule_);
            }
            objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
            int numberFormatSize = numberFormatSize();
            objectOutput.writeInt(numberFormatSize);
            for (int i = 0; i < numberFormatSize; i++) {
                this.numberFormat_.get(i).writeExternal(objectOutput);
            }
            int intlNumberFormatSize = intlNumberFormatSize();
            objectOutput.writeInt(intlNumberFormatSize);
            for (int i2 = 0; i2 < intlNumberFormatSize; i2++) {
                this.intlNumberFormat_.get(i2).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.mainCountryForCode_);
            objectOutput.writeBoolean(this.hasLeadingDigits);
            if (this.hasLeadingDigits) {
                objectOutput.writeUTF(this.leadingDigits_);
            }
            objectOutput.writeBoolean(this.leadingZeroPossible_);
            objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                getMax getmax = new getMax();
                getmax.readExternal(objectInput);
                setGeneralDesc(getmax);
            }
            if (objectInput.readBoolean()) {
                getMax getmax2 = new getMax();
                getmax2.readExternal(objectInput);
                setFixedLine(getmax2);
            }
            if (objectInput.readBoolean()) {
                getMax getmax3 = new getMax();
                getmax3.readExternal(objectInput);
                setMobile(getmax3);
            }
            if (objectInput.readBoolean()) {
                getMax getmax4 = new getMax();
                getmax4.readExternal(objectInput);
                setTollFree(getmax4);
            }
            if (objectInput.readBoolean()) {
                getMax getmax5 = new getMax();
                getmax5.readExternal(objectInput);
                setPremiumRate(getmax5);
            }
            if (objectInput.readBoolean()) {
                getMax getmax6 = new getMax();
                getmax6.readExternal(objectInput);
                setSharedCost(getmax6);
            }
            if (objectInput.readBoolean()) {
                getMax getmax7 = new getMax();
                getmax7.readExternal(objectInput);
                setPersonalNumber(getmax7);
            }
            if (objectInput.readBoolean()) {
                getMax getmax8 = new getMax();
                getmax8.readExternal(objectInput);
                setVoip(getmax8);
            }
            if (objectInput.readBoolean()) {
                getMax getmax9 = new getMax();
                getmax9.readExternal(objectInput);
                setPager(getmax9);
            }
            if (objectInput.readBoolean()) {
                getMax getmax10 = new getMax();
                getmax10.readExternal(objectInput);
                setUan(getmax10);
            }
            if (objectInput.readBoolean()) {
                getMax getmax11 = new getMax();
                getmax11.readExternal(objectInput);
                setEmergency(getmax11);
            }
            if (objectInput.readBoolean()) {
                getMax getmax12 = new getMax();
                getmax12.readExternal(objectInput);
                setVoicemail(getmax12);
            }
            if (objectInput.readBoolean()) {
                getMax getmax13 = new getMax();
                getmax13.readExternal(objectInput);
                setShortCode(getmax13);
            }
            if (objectInput.readBoolean()) {
                getMax getmax14 = new getMax();
                getmax14.readExternal(objectInput);
                setStandardRate(getmax14);
            }
            if (objectInput.readBoolean()) {
                getMax getmax15 = new getMax();
                getmax15.readExternal(objectInput);
                setCarrierSpecific(getmax15);
            }
            if (objectInput.readBoolean()) {
                getMax getmax16 = new getMax();
                getmax16.readExternal(objectInput);
                setSmsServices(getmax16);
            }
            if (objectInput.readBoolean()) {
                getMax getmax17 = new getMax();
                getmax17.readExternal(objectInput);
                setNoInternationalDialling(getmax17);
            }
            setId(objectInput.readUTF());
            setCountryCode(objectInput.readInt());
            setInternationalPrefix(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                setPreferredInternationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setPreferredExtnPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixForParsing(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixTransformRule(objectInput.readUTF());
            }
            setSameMobileAndFixedLinePattern(objectInput.readBoolean());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                setMax setmax = new setMax();
                setmax.readExternal(objectInput);
                this.numberFormat_.add(setmax);
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                setMax setmax2 = new setMax();
                setmax2.readExternal(objectInput);
                this.intlNumberFormat_.add(setmax2);
            }
            setMainCountryForCode(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                setLeadingDigits(objectInput.readUTF());
            }
            setLeadingZeroPossible(objectInput.readBoolean());
            setMobileNumberPortableRegion(objectInput.readBoolean());
        }
    }

    public static class length implements Externalizable {
        private static final long serialVersionUID = 1;
        private List<getMin> metadata_ = new ArrayList();

        public static final class getMin extends length {
            public final length build() {
                return this;
            }
        }

        public static getMin newBuilder() {
            return new getMin();
        }

        public List<getMin> getMetadataList() {
            return this.metadata_;
        }

        public int getMetadataCount() {
            return this.metadata_.size();
        }

        public length addMetadata(getMin getmin) {
            if (getmin != null) {
                this.metadata_.add(getmin);
                return this;
            }
            throw null;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            int metadataCount = getMetadataCount();
            objectOutput.writeInt(metadataCount);
            for (int i = 0; i < metadataCount; i++) {
                this.metadata_.get(i).writeExternal(objectOutput);
            }
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                getMin getmin = new getMin();
                getmin.readExternal(objectInput);
                this.metadata_.add(getmin);
            }
        }

        public length clear() {
            this.metadata_.clear();
            return this;
        }
    }
}
