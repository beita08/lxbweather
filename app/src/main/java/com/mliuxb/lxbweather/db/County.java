package com.mliuxb.lxbweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : ZWZX
 * Author     : Liuxb
 * Date       : 2019/4/9 17:24
 */
public class County extends LitePalSupport{

    private int id;

    private String countyName;

    private String weatherId;

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

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
