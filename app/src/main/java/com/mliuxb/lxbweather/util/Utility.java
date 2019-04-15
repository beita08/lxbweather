package com.mliuxb.lxbweather.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : ZWZX
 * Author     : Liuxb
 * Date       : 2019/4/15 17:03
 */
public class Utility {

   /*
   [{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"天津"},{"id":4,"name":"重庆"},{"id":5,"name":"香港"},{"id":6,"name":"澳门"},{"id":7,"name":"台湾"},{"id":8,"name":"黑龙江"},{"id":9,"name":"吉林"},{"id":10,"name":"辽宁"},{"id":11,"name":"内蒙古"},{"id":12,"name":"河北"},{"id":13,"name":"河南"},{"id":14,"name":"山西"},{"id":15,"name":"山东"},{"id":16,"name":"江苏"},{"id":17,"name":"浙江"},{"id":18,"name":"福建"},{"id":19,"name":"江西"},{"id":20,"name":"安徽"},{"id":21,"name":"湖北"},{"id":22,"name":"湖南"},{"id":23,"name":"广东"},{"id":24,"name":"广西"},{"id":25,"name":"海南"},{"id":26,"name":"贵州"},{"id":27,"name":"云南"},{"id":28,"name":"四川"},{"id":29,"name":"西藏"},{"id":30,"name":"陕西"},{"id":31,"name":"宁夏"},{"id":32,"name":"甘肃"},{"id":33,"name":"青海"},{"id":34,"name":"新疆"}]
   */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray jsonArray = new JSONArray(response);
                for (int i = 0; i < jsonArray.length(); i++) {
                    Object o = jsonArray.get(i);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    /*
    [{"id":295,"name":"西安"},{"id":296,"name":"三原"},{"id":297,"name":"延长"},{"id":298,"name":"榆林"},{"id":299,"name":"渭南"},{"id":300,"name":"商洛"},{"id":301,"name":"安康"},{"id":302,"name":"汉中"},{"id":303,"name":"宝鸡"},{"id":304,"name":"铜川"},{"id":305,"name":"杨凌"}]
    */

    public static boolean handleCityResponse(String response) {

        return false;
    }

    /*
    [{"id":2219,"name":"三原","weather_id":"CN101110201"},{"id":2220,"name":"礼泉","weather_id":"CN101110202"},{"id":2221,"name":"永寿","weather_id":"CN101110203"},{"id":2222,"name":"淳化","weather_id":"CN101110204"},{"id":2223,"name":"泾阳","weather_id":"CN101110205"},{"id":2224,"name":"武功","weather_id":"CN101110206"},{"id":2225,"name":"乾县","weather_id":"CN101110207"},{"id":2226,"name":"彬县","weather_id":"CN101110208"},{"id":2227,"name":"长武","weather_id":"CN101110209"},{"id":2228,"name":"旬邑","weather_id":"CN101110210"},{"id":2229,"name":"兴平","weather_id":"CN101110211"}]
    */
    public static boolean handleCountyResponse(String response) {

        return false;
    }
}
