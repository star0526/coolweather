package com.star.coolweather.bean;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;

    private String countyName;

    private String weahterId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
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
