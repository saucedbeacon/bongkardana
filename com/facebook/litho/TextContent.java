package com.facebook.litho;

import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Collections;
import java.util.List;

@DoNotStrip
public interface TextContent {
    public static final TextContent setMax = new TextContent() {
        public final List<CharSequence> getTextItems() {
            return Collections.EMPTY_LIST;
        }
    };

    @DoNotStrip
    List<CharSequence> getTextItems();
}
