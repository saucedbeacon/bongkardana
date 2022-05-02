package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.DialogRecyclerView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/UsernameCheckManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "checkForError", "", "usernameCheck", "Lid/dana/data/social/model/UsernameCheck;", "isConsecutivePeriod", "isContainSpaceOrOtherUniqueCharacter", "isEndWithPeriod", "isNotBetween3And20Character", "isNumberOnly", "isStartWithPeriod", "runUserNameCheck", "usernameTaken", "username", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class startPermissionGuide {
    @NotNull
    public static final String ALPHANUMERIC_AND_PERIOD_REGEX = "^[a-zA-Z0-9.]*$";
    @NotNull
    public static final String CONSECUTIVE_PERIOD_REGEX = "^.*\\.\\..*$";
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    @NotNull
    private final Context context;

    @Inject
    public startPermissionGuide(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.context = context2;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final j runUserNameCheck(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "usernameCheck");
        checkForError(jVar);
        return jVar;
    }

    private final boolean checkForError(j jVar) {
        return isStartWithPeriod(jVar) || isEndWithPeriod(jVar) || isNotBetween3And20Character(jVar) || isNumberOnly(jVar) || isContainSpaceOrOtherUniqueCharacter(jVar) || isConsecutivePeriod(jVar);
    }

    private final boolean isNotBetween3And20Character(j jVar) {
        int length = jVar.getUsername().length();
        if (3 <= length && 20 >= length) {
            return false;
        }
        String string = this.context.getString(DialogRecyclerView.setMax.error_username_length);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.error_username_length)");
        jVar.setErrorMessage(string);
        return true;
    }

    private final boolean isContainSpaceOrOtherUniqueCharacter(j jVar) {
        if (new Regex(ALPHANUMERIC_AND_PERIOD_REGEX).matches(jVar.getUsername())) {
            return false;
        }
        String string = this.context.getString(DialogRecyclerView.setMax.error_username_space_unique_char);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ername_space_unique_char)");
        jVar.setErrorMessage(string);
        return true;
    }

    private final boolean isNumberOnly(j jVar) {
        try {
            Integer.parseInt(jVar.getUsername());
            String string = this.context.getString(DialogRecyclerView.setMax.error_username_numbers_only);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…or_username_numbers_only)");
            jVar.setErrorMessage(string);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean isConsecutivePeriod(j jVar) {
        if (!new Regex(CONSECUTIVE_PERIOD_REGEX).containsMatchIn(jVar.getUsername())) {
            return false;
        }
        String string = this.context.getString(DialogRecyclerView.setMax.error_username_consecutive_period);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rname_consecutive_period)");
        jVar.setErrorMessage(string);
        return true;
    }

    private final boolean isEndWithPeriod(j jVar) {
        if (!StringsKt.endsWith$default(jVar.getUsername(), ".", false, 2, (Object) null)) {
            return false;
        }
        String string = this.context.getString(DialogRecyclerView.setMax.error_username_start_end_period);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…sername_start_end_period)");
        jVar.setErrorMessage(string);
        return true;
    }

    private final boolean isStartWithPeriod(j jVar) {
        if (!StringsKt.startsWith$default(jVar.getUsername(), ".", false, 2, (Object) null)) {
            return false;
        }
        String string = this.context.getString(DialogRecyclerView.setMax.error_username_start_end_period);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…sername_start_end_period)");
        jVar.setErrorMessage(string);
        return true;
    }

    @NotNull
    public final j usernameTaken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        String string = this.context.getString(DialogRecyclerView.setMax.error_username_taken);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.error_username_taken)");
        return new j(str, string);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/social/UsernameCheckManager$Companion;", "", "()V", "ALPHANUMERIC_AND_PERIOD_REGEX", "", "CONSECUTIVE_PERIOD_REGEX", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
