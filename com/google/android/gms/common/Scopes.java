package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

public final class Scopes {
    public static final String APP_STATE = "https://www.googleapis.com/auth/appstate";
    public static final String CLOUD_SAVE = "https://www.googleapis.com/auth/datastoremobile";
    public static final String DRIVE_APPFOLDER = "https://www.googleapis.com/auth/drive.appdata";
    @KeepForSdk
    public static final String DRIVE_APPS = "https://www.googleapis.com/auth/drive.apps";
    public static final String DRIVE_FILE = "https://www.googleapis.com/auth/drive.file";
    @KeepForSdk
    public static final String DRIVE_FULL = "https://www.googleapis.com/auth/drive";
    public static final String EMAIL = "email";
    @Deprecated
    public static final String FITNESS_ACTIVITY_READ = "https://www.googleapis.com/auth/fitness.activity.read";
    @Deprecated
    public static final String FITNESS_ACTIVITY_READ_WRITE = "https://www.googleapis.com/auth/fitness.activity.write";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_BLOOD_GLUCOSE_READ = "https://www.googleapis.com/auth/fitness.blood_glucose.read";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_BLOOD_GLUCOSE_READ_WRITE = "https://www.googleapis.com/auth/fitness.blood_glucose.write";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_BLOOD_PRESSURE_READ = "https://www.googleapis.com/auth/fitness.blood_pressure.read";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_BLOOD_PRESSURE_READ_WRITE = "https://www.googleapis.com/auth/fitness.blood_pressure.write";
    @Deprecated
    public static final String FITNESS_BODY_READ = "https://www.googleapis.com/auth/fitness.body.read";
    @Deprecated
    public static final String FITNESS_BODY_READ_WRITE = "https://www.googleapis.com/auth/fitness.body.write";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_BODY_TEMPERATURE_READ = "https://www.googleapis.com/auth/fitness.body_temperature.read";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_BODY_TEMPERATURE_READ_WRITE = "https://www.googleapis.com/auth/fitness.body_temperature.write";
    @Deprecated
    public static final String FITNESS_LOCATION_READ = "https://www.googleapis.com/auth/fitness.location.read";
    @Deprecated
    public static final String FITNESS_LOCATION_READ_WRITE = "https://www.googleapis.com/auth/fitness.location.write";
    @Deprecated
    public static final String FITNESS_NUTRITION_READ = "https://www.googleapis.com/auth/fitness.nutrition.read";
    @Deprecated
    public static final String FITNESS_NUTRITION_READ_WRITE = "https://www.googleapis.com/auth/fitness.nutrition.write";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_OXYGEN_SATURATION_READ = "https://www.googleapis.com/auth/fitness.oxygen_saturation.read";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_OXYGEN_SATURATION_READ_WRITE = "https://www.googleapis.com/auth/fitness.oxygen_saturation.write";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_REPRODUCTIVE_HEALTH_READ = "https://www.googleapis.com/auth/fitness.reproductive_health.read";
    @ShowFirstParty
    @KeepForSdk
    public static final String FITNESS_REPRODUCTIVE_HEALTH_READ_WRITE = "https://www.googleapis.com/auth/fitness.reproductive_health.write";
    public static final String GAMES = "https://www.googleapis.com/auth/games";
    @KeepForSdk
    public static final String GAMES_LITE = "https://www.googleapis.com/auth/games_lite";
    @KeepForSdk
    public static final String OPEN_ID = "openid";
    @Deprecated
    public static final String PLUS_LOGIN = "https://www.googleapis.com/auth/plus.login";
    public static final String PLUS_ME = "https://www.googleapis.com/auth/plus.me";
    public static final String PROFILE = "profile";

    private Scopes() {
    }
}
