package com.anonymous.AwesomeProject;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyAppPackage implements ReactPackage {

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
//        return Collections.emptyList();
        return Arrays.<ViewManager>asList(
                new ReactImageManager(reactContext),
                new MyViewManager(reactContext)
        );
    }

   // imports the native module you created, CalendarModule.
   // It then instantiates CalendarModule within the createNativeModules() function
   // and returns it as a list of NativeModules to register
    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new CalendarModule(reactContext));

        return modules;
    }

}