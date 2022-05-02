package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber;
import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.setCloseButtonOnLongClickListener;
import o.setOptionMenuOnClickListener;

final class PhoneNumberMatcher implements Iterator<setOptionMenuOnClickListener> {
    private static final Pattern[] INNER_MATCHES = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private static final Pattern LEAD_CLASS;
    private static final Pattern MATCHING_BRACKETS;
    private static final Pattern PATTERN;
    private static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
    private setOptionMenuOnClickListener lastMatch = null;
    private final PhoneNumberUtil.Leniency leniency;
    private long maxTries;
    private final PhoneNumberUtil phoneUtil;
    private final String preferredRegion;
    private int searchIndex = 0;
    private State state = State.NOT_READY;
    private final CharSequence text;

    enum State {
        NOT_READY,
        READY,
        DONE
    }

    interface setMin {
        boolean checkGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr);
    }

    static {
        StringBuilder sb = new StringBuilder("[^");
        sb.append("(\\[（［");
        sb.append(")\\]）］");
        sb.append("]");
        String obj = sb.toString();
        String limit = limit(0, 3);
        StringBuilder sb2 = new StringBuilder("(?:[");
        sb2.append("(\\[（［");
        sb2.append("])?(?:");
        sb2.append(obj);
        sb2.append("+[");
        sb2.append(")\\]）］");
        sb2.append("])?");
        sb2.append(obj);
        sb2.append("+(?:[");
        sb2.append("(\\[（［");
        sb2.append("]");
        sb2.append(obj);
        sb2.append("+[");
        sb2.append(")\\]）］");
        sb2.append("])");
        sb2.append(limit);
        sb2.append(obj);
        sb2.append("*");
        MATCHING_BRACKETS = Pattern.compile(sb2.toString());
        String limit2 = limit(0, 2);
        String limit3 = limit(0, 4);
        String limit4 = limit(0, 20);
        String concat = "[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]".concat(String.valueOf(limit3));
        StringBuilder sb3 = new StringBuilder("\\p{Nd}");
        sb3.append(limit(1, 20));
        String obj2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("(\\[（［");
        sb4.append("+＋");
        String obj3 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("[");
        sb5.append(obj3);
        sb5.append("]");
        String obj4 = sb5.toString();
        LEAD_CLASS = Pattern.compile(obj4);
        StringBuilder sb6 = new StringBuilder("(?:");
        sb6.append(obj4);
        sb6.append(concat);
        sb6.append(")");
        sb6.append(limit2);
        sb6.append(obj2);
        sb6.append("(?:");
        sb6.append(concat);
        sb6.append(obj2);
        sb6.append(")");
        sb6.append(limit4);
        sb6.append("(?:");
        sb6.append(PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING);
        sb6.append(")?");
        PATTERN = Pattern.compile(sb6.toString(), 66);
    }

    private static String limit(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, String str, String str2, PhoneNumberUtil.Leniency leniency2, long j) {
        if (phoneNumberUtil == null || leniency2 == null) {
            throw null;
        } else if (j >= 0) {
            this.phoneUtil = phoneNumberUtil;
            this.text = str == null ? "" : str;
            this.preferredRegion = str2;
            this.leniency = leniency2;
            this.maxTries = j;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private setOptionMenuOnClickListener find(int i) {
        Matcher matcher = PATTERN.matcher(this.text);
        while (this.maxTries > 0 && matcher.find(i)) {
            int start = matcher.start();
            CharSequence trimAfterFirstMatch = trimAfterFirstMatch(PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, this.text.subSequence(start, matcher.end()));
            setOptionMenuOnClickListener extractMatch = extractMatch(trimAfterFirstMatch, start);
            if (extractMatch != null) {
                return extractMatch;
            }
            i = start + trimAfterFirstMatch.length();
            this.maxTries--;
        }
        return null;
    }

    private static CharSequence trimAfterFirstMatch(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    static boolean isLatinLetter(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    private static boolean isInvalidPunctuationSymbol(char c) {
        return c == '%' || Character.getType(c) == 26;
    }

    private setOptionMenuOnClickListener extractMatch(CharSequence charSequence, int i) {
        if (SLASH_SEPARATED_DATES.matcher(charSequence).find()) {
            return null;
        }
        if (TIME_STAMPS.matcher(charSequence).find()) {
            if (TIME_STAMPS_SUFFIX.matcher(this.text.toString().substring(charSequence.length() + i)).lookingAt()) {
                return null;
            }
        }
        setOptionMenuOnClickListener parseAndVerify = parseAndVerify(charSequence, i);
        if (parseAndVerify != null) {
            return parseAndVerify;
        }
        return extractInnerMatch(charSequence, i);
    }

    private setOptionMenuOnClickListener extractInnerMatch(CharSequence charSequence, int i) {
        for (Pattern matcher : INNER_MATCHES) {
            Matcher matcher2 = matcher.matcher(charSequence);
            boolean z = true;
            while (matcher2.find() && this.maxTries > 0) {
                if (z) {
                    setOptionMenuOnClickListener parseAndVerify = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, charSequence.subSequence(0, matcher2.start())), i);
                    if (parseAndVerify != null) {
                        return parseAndVerify;
                    }
                    this.maxTries--;
                    z = false;
                }
                setOptionMenuOnClickListener parseAndVerify2 = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, matcher2.group(1)), matcher2.start(1) + i);
                if (parseAndVerify2 != null) {
                    return parseAndVerify2;
                }
                this.maxTries--;
            }
        }
        return null;
    }

    private setOptionMenuOnClickListener parseAndVerify(CharSequence charSequence, int i) {
        try {
            if (MATCHING_BRACKETS.matcher(charSequence).matches()) {
                if (!PUB_PAGES.matcher(charSequence).find()) {
                    if (this.leniency.compareTo(PhoneNumberUtil.Leniency.VALID) >= 0) {
                        if (i > 0 && !LEAD_CLASS.matcher(charSequence).lookingAt()) {
                            char charAt = this.text.charAt(i - 1);
                            if (isInvalidPunctuationSymbol(charAt) || isLatinLetter(charAt)) {
                                return null;
                            }
                        }
                        int length = charSequence.length() + i;
                        if (length < this.text.length()) {
                            char charAt2 = this.text.charAt(length);
                            if (isInvalidPunctuationSymbol(charAt2) || isLatinLetter(charAt2)) {
                                return null;
                            }
                        }
                    }
                    Phonenumber.PhoneNumber parseAndKeepRawInput = this.phoneUtil.parseAndKeepRawInput(charSequence, this.preferredRegion);
                    if ((!this.phoneUtil.getRegionCodeForCountryCode(parseAndKeepRawInput.getCountryCode()).equals("IL") || this.phoneUtil.getNationalSignificantNumber(parseAndKeepRawInput).length() != 4 || (i != 0 && (i <= 0 || this.text.charAt(i - 1) == '*'))) && this.leniency.verify(parseAndKeepRawInput, charSequence, this.phoneUtil)) {
                        parseAndKeepRawInput.clearCountryCodeSource();
                        parseAndKeepRawInput.clearRawInput();
                        parseAndKeepRawInput.clearPreferredDomesticCarrierCode();
                        return new setOptionMenuOnClickListener(i, charSequence.toString(), parseAndKeepRawInput);
                    }
                }
            }
        } catch (NumberParseException unused) {
        }
        return null;
    }

    static boolean allNumberGroupsRemainGrouped(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i;
        if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String num = Integer.toString(phoneNumber.getCountryCode());
            i = sb.indexOf(num) + num.length();
        } else {
            i = 0;
        }
        int i2 = 0;
        while (i2 < strArr.length) {
            int indexOf = sb.indexOf(strArr[i2], i);
            if (indexOf < 0) {
                return false;
            }
            i = indexOf + strArr[i2].length();
            if (i2 != 0 || i >= sb.length() || phoneNumberUtil.getNddPrefixForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()), true) == null || !Character.isDigit(sb.charAt(i))) {
                i2++;
            } else {
                return sb.substring(i - strArr[i2].length()).startsWith(phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
            }
        }
        return sb.substring(i).contains(phoneNumber.getExtension());
    }

    static boolean allNumberGroupsAreExactlyPresent(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        String[] split = PhoneNumberUtil.NON_DIGITS_PATTERN.split(sb.toString());
        int length = phoneNumber.hasExtension() ? split.length - 2 : split.length - 1;
        if (split.length == 1 || split[length].contains(phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) {
            return true;
        }
        int length2 = strArr.length - 1;
        while (length2 > 0 && length >= 0) {
            if (!split[length].equals(strArr[length2])) {
                return false;
            }
            length2--;
            length--;
        }
        if (length < 0 || !split[length].endsWith(strArr[0])) {
            return false;
        }
        return true;
    }

    private static String[] getNationalNumberGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, setCloseButtonOnLongClickListener.setMax setmax) {
        if (setmax != null) {
            return phoneNumberUtil.formatNsnUsingPattern(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), setmax, PhoneNumberUtil.PhoneNumberFormat.RFC3966).split("-");
        }
        String format = phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int indexOf = format.indexOf(59);
        if (indexOf < 0) {
            indexOf = format.length();
        }
        return format.substring(format.indexOf(45) + 1, indexOf).split("-");
    }

    static boolean checkNumberGroupingIsValid(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, setMin setmin) {
        StringBuilder normalizeDigits = PhoneNumberUtil.normalizeDigits(charSequence, true);
        if (setmin.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, (setCloseButtonOnLongClickListener.setMax) null))) {
            return true;
        }
        setCloseButtonOnLongClickListener.getMin alternateFormatsForCountry = phoneNumberUtil.getMetadataSource().getAlternateFormatsForCountry(phoneNumber.getCountryCode());
        if (alternateFormatsForCountry == null) {
            return false;
        }
        for (setCloseButtonOnLongClickListener.setMax nationalNumberGroups : alternateFormatsForCountry.numberFormats()) {
            if (setmin.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, nationalNumberGroups))) {
                return true;
            }
        }
        return false;
    }

    static boolean containsMoreThanOneSlashInNationalNumber(Phonenumber.PhoneNumber phoneNumber, String str) {
        int indexOf;
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0 || (indexOf = str.indexOf(47, indexOf2 + 1)) < 0) {
            return false;
        }
        if (!(phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) || !PhoneNumberUtil.normalizeDigitsOnly(str.substring(0, indexOf2)).equals(Integer.toString(phoneNumber.getCountryCode()))) {
            return true;
        }
        return str.substring(indexOf + 1).contains("/");
    }

    static boolean containsOnlyValidXChars(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (phoneNumberUtil.isNumberMatch(phoneNumber, (CharSequence) str.substring(i2)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!PhoneNumberUtil.normalizeDigitsOnly(str.substring(i)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    static boolean isNationalPrefixPresentIfRequired(Phonenumber.PhoneNumber phoneNumber, PhoneNumberUtil phoneNumberUtil) {
        setCloseButtonOnLongClickListener.getMin metadataForRegion;
        setCloseButtonOnLongClickListener.setMax chooseFormattingPatternForNumber;
        if (phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY && (metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()))) != null && (chooseFormattingPatternForNumber = phoneNumberUtil.chooseFormattingPatternForNumber(metadataForRegion.numberFormats(), phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) != null && chooseFormattingPatternForNumber.getNationalPrefixFormattingRule().length() > 0 && !chooseFormattingPatternForNumber.getNationalPrefixOptionalWhenFormatting() && !PhoneNumberUtil.formattingRuleHasFirstGroupOnly(chooseFormattingPatternForNumber.getNationalPrefixFormattingRule())) {
            return phoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(new StringBuilder(PhoneNumberUtil.normalizeDigitsOnly(phoneNumber.getRawInput())), metadataForRegion, (StringBuilder) null);
        }
        return true;
    }

    public final boolean hasNext() {
        if (this.state == State.NOT_READY) {
            setOptionMenuOnClickListener find = find(this.searchIndex);
            this.lastMatch = find;
            if (find == null) {
                this.state = State.DONE;
            } else {
                this.searchIndex = find.end();
                this.state = State.READY;
            }
        }
        return this.state == State.READY;
    }

    public final setOptionMenuOnClickListener next() {
        if (hasNext()) {
            setOptionMenuOnClickListener setoptionmenuonclicklistener = this.lastMatch;
            this.lastMatch = null;
            this.state = State.NOT_READY;
            return setoptionmenuonclicklistener;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
