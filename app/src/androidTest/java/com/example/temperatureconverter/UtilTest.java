package com.example.temperatureconverter;

/**
 * Created by dranderson on 11/8/17.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.mock;


@RunWith(MockitoJUnitRunner.class)
public class UtilTest {
    @Test
    public void shouldContainTheCorrectExtras() throws Exception {
        Context context = mock(Context.class);
        Intent intent = Util.createQuery(context, "F", "C", true);
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("F", extras.getString("fahrenheitValue"));
        assertEquals("C", extras.getString("celsiusValue"));
        assertEquals(true, extras.getBoolean("direction"));
    }
}