package com.rn.emotion.rn;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.rn.emotion.views.EmotionView;

import androidx.annotation.NonNull;

public class EmotionViewManager extends SimpleViewManager<EmotionView> {

    @NonNull
    @Override
    public String getName() {
        return "EmotionView";
    }


    @NonNull
    @Override
    protected EmotionView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new EmotionView(reactContext);
    }

    @ReactProp(name="text")
    public void setEmotionText(EmotionView view,String text){
        view.setEmotionText(text);
    }


    @ReactProp(name="size")
    public void setEmotionSize(EmotionView view,Integer size){

    }
}
