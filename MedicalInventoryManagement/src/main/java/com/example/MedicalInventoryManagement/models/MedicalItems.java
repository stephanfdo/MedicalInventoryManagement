package com.example.MedicalInventoryManagement.models;

public class MedicalItems {

    private int itemID;
    private String sergicalSpirit;
    private String bandage;

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getSergicalSpirit() {
        return sergicalSpirit;
    }

    public void setSergicalSpirit(String sergicalSpirit) {
        this.sergicalSpirit = sergicalSpirit;
    }

    public String getBandage() {
        return bandage;
    }

    public void setBandage(String bandage) {
        this.bandage = bandage;
    }

    public String getCottonWhool() {
        return cottonWhool;
    }

    public void setCottonWhool(String cottonWhool) {
        this.cottonWhool = cottonWhool;
    }

    public String getSiringers() {
        return siringers;
    }

    public void setSiringers(String siringers) {
        this.siringers = siringers;
    }

    private String cottonWhool;
    private String siringers;

}
