package com.anonymous.AwesomeProject;

import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class CalendarModule extends ReactContextBaseJavaModule {
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }
    // The native module can then be accessed in JS like this:
    // const {CalendarModule} = ReactNative.NativeModules;
    @Override
    public String getName() {
        return "CalendarModule";
    }
    //  All native module methods meant to be invoked from JavaScript
    //  must be annotated with @ReactMethod.
    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location);
    }
}