package com.amniltech.preferenceactivitydemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.preference.PreferenceManager;

public class GetSetting {
    private Context mContext;
    private SharedPreferences sharedPreferences;

    public GetSetting (Context mContext){
        this.mContext = mContext;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
    }



    public boolean getDarkEnabled() {
        return sharedPreferences.getBoolean("setting_dark_mode",false);
    }


}

