package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class error extends uncheckItems<flowLog> {
    private final errorLog exploreDanaPreferences;

    @Inject
    public error(errorLog errorlog) {
        this.exploreDanaPreferences = errorlog;
    }

    public flowLog createData(String str) {
        return new addData2Performance(this.exploreDanaPreferences);
    }
}
