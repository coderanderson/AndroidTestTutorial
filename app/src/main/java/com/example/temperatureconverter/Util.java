package com.example.temperatureconverter;

/**
 * Created by dranderson on 11/8/17.
 */

import android.content.Context;
import android.content.Intent;

public class Util {
    public static Intent createQuery(Context context, String fahrenheitValue, String celsiusValue, boolean direction) {
        // Reuse MainActivity for simplification
        Intent i = new Intent(context, ResultActivity.class);
        i.putExtra("fahrenheitValue", fahrenheitValue);
        i.putExtra("celsiusValue", celsiusValue);
        i.putExtra("direction", direction);
        return i;
    }
}