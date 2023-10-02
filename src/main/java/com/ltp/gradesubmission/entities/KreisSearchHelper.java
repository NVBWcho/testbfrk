package com.ltp.gradesubmission.entities;

import java.util.List;

public class KreisSearchHelper {

    private List<String> kreise;
    private String selectedKreis;

    private String searchType;

    public KreisSearchHelper() {
    }

    public KreisSearchHelper(List<String> kreise, String selectedKreis, String searchType) {
        this.kreise = kreise;
        this.selectedKreis = selectedKreis;
        this.searchType = searchType;
    }

    public List<String> getKreise() {
        return kreise;
    }

    public void setKreise(List<String> kreise) {
        this.kreise = kreise;
    }

    public String getSelectedKreis() {
        return selectedKreis;
    }

    public void setSelectedKreis(String selectedKreis) {
        this.selectedKreis = selectedKreis;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
}
