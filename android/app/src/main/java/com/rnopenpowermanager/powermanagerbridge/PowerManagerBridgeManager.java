//  Created by react-native-create-bridge

package com.rnopenpowermanager.powermanagerbridge;

import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import android.graphics.Color;
import android.widget.Toast;

import com.facebook.react.uimanager.annotations.ReactProp;


public class PowerManagerBridgeManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "PowerManagerBridge";
    private ThemedReactContext mContext;
    private View view;

    @Override
    public String getName() {
        // Tell React the name of the module
        // https://facebook.github.io/react-native/docs/native-components-android.html#1-create-the-viewmanager-subclass

        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext context){
        // Create a view here
        // https://facebook.github.io/react-native/docs/native-components-android.html#2-implement-method-createviewinstance
        mContext = context;
        view = new View(context);
        view.setBackgroundColor(Color.BLUE);
        return view;
    }

    @ReactProp(name = "exampleProp")
    public void setExampleProp(View view, String prop) {
        // Set properties from React onto your native component via a setter method
        // https://facebook.github.io/react-native/docs/native-components-android.html#3-expose-view-property-setters-using-reactprop-or-reactpropgroup-annotation
    }


}
