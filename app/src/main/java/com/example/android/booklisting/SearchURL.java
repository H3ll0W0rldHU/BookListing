package com.example.android.booklisting;

public class SearchURL {
    private String mRequestUrlPrefix = "https://www.googleapis.com/books/v1/volumes?q=";
    private String mRequestUrlPostfix = "&maxResults=15";
    private String mSearchQuery = "";

    public SearchURL(String requestUrlPrefix, String searchQuery, String requestUrlPostfix) {
        mRequestUrlPrefix = requestUrlPrefix;
        mSearchQuery = searchQuery;
        mRequestUrlPostfix = requestUrlPostfix;
    }

    public String getRequestUrlPrefix() {
        return mRequestUrlPrefix;
    }

    public String getRequestUrlPostfix() {
        return mRequestUrlPostfix;
    }

    public String getSearchQuery() {
        return mSearchQuery;
    }

}

