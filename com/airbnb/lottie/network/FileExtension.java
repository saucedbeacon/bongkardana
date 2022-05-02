package com.airbnb.lottie.network;

import o.setTitleMargin;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public final String tempExtension() {
        StringBuilder sb = new StringBuilder(".temp");
        sb.append(this.extension);
        return sb.toString();
    }

    public final String toString() {
        return this.extension;
    }

    public static FileExtension forFile(String str) {
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        setTitleMargin.setMax("Unable to find correct extension for ".concat(String.valueOf(str)));
        return JSON;
    }
}
