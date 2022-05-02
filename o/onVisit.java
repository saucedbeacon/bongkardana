package o;

import com.google.gson.annotations.SerializedName;

public class onVisit {
    @SerializedName("latest_agreed_version")
    public int latestAgreedVersion;

    public onVisit(int i) {
        this.latestAgreedVersion = i;
    }
}
