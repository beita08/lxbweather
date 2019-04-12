package com.mliuxb.lxbweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : ZWZX
 * Author     : Liuxb
 * Date       : 2019/3/18 17:19
 */
public class Province extends LitePalSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
