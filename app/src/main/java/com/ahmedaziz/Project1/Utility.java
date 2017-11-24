package com.ahmedaziz.Project1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Ahmed Aziz on 7/26/2017.
 */

public class Utility {public static String getOrder(Context context) {
    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    return prefs.getString(context.getString(R.string.pref_key),
            context.getString(R.string.action_settings));
}

}

