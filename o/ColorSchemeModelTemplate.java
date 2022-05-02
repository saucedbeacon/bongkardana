package o;

import javax.inject.Singleton;

@Singleton
public class ColorSchemeModelTemplate {
    String currentCountryCode;

    public String getCurrentCountryCode() {
        return this.currentCountryCode;
    }

    public void setCurrentCountryCode(String str) {
        this.currentCountryCode = str;
    }
}
