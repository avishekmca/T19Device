package com.example.librryt19.Model;

public class Attributes {
    private static String dataString="";
    private static String battery="0 %";
    private static String date="NA";
    private static String temp_cen="NA";
    private static String temp_frn="NA";

    public static String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    public static String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public static String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static String getTemp_cen() {
        return temp_cen;
    }

    public void setTemp_cen(String temp_cen) {
        this.temp_cen = temp_cen;
    }

    public static String getTemp_frn() {
        return temp_frn;
    }

    public void setTemp_frn(String temp_frn) {
        this.temp_frn = temp_frn;
    }
}
