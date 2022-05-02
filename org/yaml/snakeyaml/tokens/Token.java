package org.yaml.snakeyaml.tokens;

import o.InitParams;
import org.yaml.snakeyaml.error.YAMLException;

public abstract class Token {
    public final InitParams.AnonymousClass1 getMin;
    public final InitParams.AnonymousClass1 toFloatRange;

    public abstract ID getMin();

    public enum ID {
        Alias("<alias>"),
        Anchor("<anchor>"),
        BlockEnd("<block end>"),
        BlockEntry("-"),
        BlockMappingStart("<block mapping start>"),
        BlockSequenceStart("<block sequence start>"),
        Directive("<directive>"),
        DocumentEnd("<document end>"),
        DocumentStart("<document start>"),
        FlowEntry(","),
        FlowMappingEnd("}"),
        FlowMappingStart("{"),
        FlowSequenceEnd("]"),
        FlowSequenceStart("["),
        Key("?"),
        Scalar("<scalar>"),
        StreamEnd("<stream end>"),
        StreamStart("<stream start>"),
        Tag("<tag>"),
        Value(":"),
        Whitespace("<whitespace>"),
        Comment("#"),
        Error("<error>");
        
        private final String description;

        private ID(String str) {
            this.description = str;
        }

        public final String toString() {
            return this.description;
        }
    }

    public Token(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2) {
        if (r1 == null || r2 == null) {
            throw new YAMLException("Token requires marks.");
        }
        this.getMin = r1;
        this.toFloatRange = r2;
    }
}
