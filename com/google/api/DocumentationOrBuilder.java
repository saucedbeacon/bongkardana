package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DocumentationOrBuilder extends MessageLiteOrBuilder {
    String getDocumentationRootUrl();

    ByteString getDocumentationRootUrlBytes();

    String getOverview();

    ByteString getOverviewBytes();

    Page getPages(int i);

    int getPagesCount();

    List<Page> getPagesList();

    DocumentationRule getRules(int i);

    int getRulesCount();

    List<DocumentationRule> getRulesList();

    String getSummary();

    ByteString getSummaryBytes();
}
