package com.star.coolweather.bean;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;

    private String countryName;

    private String weahterId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeahterId() {
        return weahterId;
    }

    public void setWeahterId(String weahterId) {
        this.weahterId = weahterId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
