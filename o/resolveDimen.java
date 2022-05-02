package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

public final class resolveDimen implements getAdapterPosition<resolveInt> {

    static final class getMax {
        /* access modifiers changed from: private */
        public static final resolveDimen getMax = new resolveDimen();
    }

    public final resolveInt get() {
        return newInstance();
    }

    public static resolveDimen create() {
        return getMax.getMax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, d2 = {"Lid/dana/data/auth/face/repository/source/local/FaceAuthSuggestionPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "faceAuthSuggestionStateSavingTime", "", "getFaceAuthSuggestionStateSavingTime", "()J", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "shouldNeverShowFaceAuthSuggestion", "", "getShouldNeverShowFaceAuthSuggestion", "()Z", "shouldSuggestFaceAuth", "getShouldSuggestFaceAuth", "clearFaceAuthSuggestionState", "saveFaceAuthSuggestionState", "hasShown", "saveFaceAuthSuggestionStateSavingTime", "", "currentTimeStamp", "saveNeverShowFaceAuthSuggestionState", "shouldNeverShow", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.resolveDimen$default  reason: invalid class name */
    public final class Cdefault {
        @NotNull
        public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
        private static final String DIALOG_ON_BOARDING_FACE_LOGIN = "dialog_face_login_suggestion";
        private static final String DIALOG_ON_BOARDING_FACE_LOGIN_LAST_SAVE = "dialog_face_login_suggestion_last_save";
        private static final String NEVER_SHOW_DIALOG_ON_BOARDING_FACE_LOGIN = "never_show_dialog_face_login_suggestion";
        @NotNull
        public static final String USER_EDUCATION_PREFERENCE = "UserEducationPreferenceproduction";
        private final onSingleFailed preferenceFacade;

        @Inject
        public Cdefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup("UserEducationPreferenceproduction").setUseDrutherPreference(true)).createData("local");
            Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
            this.preferenceFacade = createData;
        }

        public final boolean getShouldSuggestFaceAuth() {
            Boolean bool = this.preferenceFacade.getBoolean(DIALOG_ON_BOARDING_FACE_LOGIN, true);
            Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…OARDING_FACE_LOGIN, true)");
            return bool.booleanValue();
        }

        public final boolean getShouldNeverShowFaceAuthSuggestion() {
            Boolean bool = this.preferenceFacade.getBoolean(NEVER_SHOW_DIALOG_ON_BOARDING_FACE_LOGIN, false);
            Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…ARDING_FACE_LOGIN, false)");
            return bool.booleanValue();
        }

        public final boolean saveFaceAuthSuggestionState(boolean z) {
            this.preferenceFacade.saveData(DIALOG_ON_BOARDING_FACE_LOGIN, Boolean.valueOf(!z));
            return true;
        }

        public final boolean saveNeverShowFaceAuthSuggestionState(boolean z) {
            this.preferenceFacade.saveData(NEVER_SHOW_DIALOG_ON_BOARDING_FACE_LOGIN, Boolean.valueOf(z));
            return true;
        }

        public final boolean clearFaceAuthSuggestionState() {
            this.preferenceFacade.clearData(DIALOG_ON_BOARDING_FACE_LOGIN);
            return true;
        }

        public final void saveFaceAuthSuggestionStateSavingTime(long j) {
            this.preferenceFacade.saveData(DIALOG_ON_BOARDING_FACE_LOGIN_LAST_SAVE, Long.valueOf(j));
        }

        public final long getFaceAuthSuggestionStateSavingTime() {
            Long l = this.preferenceFacade.getLong(DIALOG_ON_BOARDING_FACE_LOGIN_LAST_SAVE);
            Intrinsics.checkNotNullExpressionValue(l, "preferenceFacade.getLong…ING_FACE_LOGIN_LAST_SAVE)");
            return l.longValue();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/auth/face/repository/source/local/FaceAuthSuggestionPreference$Companion;", "", "()V", "DIALOG_ON_BOARDING_FACE_LOGIN", "", "DIALOG_ON_BOARDING_FACE_LOGIN_LAST_SAVE", "NEVER_SHOW_DIALOG_ON_BOARDING_FACE_LOGIN", "USER_EDUCATION_PREFERENCE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.resolveDimen$default$getMax */
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static resolveInt newInstance() {
        return new resolveInt();
    }
}
