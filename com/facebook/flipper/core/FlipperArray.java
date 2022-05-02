package com.facebook.flipper.core;

import org.json.JSONArray;

public class FlipperArray {
    public final JSONArray setMax;

    public static class getMax {
        public final JSONArray getMax = new JSONArray();
    }

    public FlipperArray(JSONArray jSONArray) {
        this.setMax = jSONArray == null ? new JSONArray() : jSONArray;
    }

    public String toString() {
        return this.setMax.toString();
    }

    public boolean equals(Object obj) {
        return this.setMax.toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.setMax.hashCode();
    }
}
