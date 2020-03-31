package com.rn.emotion.rn;


import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.rn.emotion.plugin.EmotionSpannableMaker;
import com.rn.emotion.views.EmotionView;

import androidx.annotation.NonNull;

public class RNEmotionViewManager extends SimpleViewManager<EmotionView> {

    protected static final String REACT_CLASS = "RNCEmotionView";

    private Integer fontSize = 18;

    private Context mContext;

    public RNEmotionViewManager() {

    }

    @NonNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }


    @Override
    protected EmotionView createViewInstance(@NonNull ThemedReactContext reactContext) {
        mContext = reactContext;
        return new EmotionView(reactContext);
    }

    @ReactProp(name = "text")
    public void setEmotionText(EmotionView view, String text) {
        Spannable spannable = EmotionSpannableMaker.buildEmotionSpannable(mContext, text, fontSize);
        view.setText(spannable);
    }


    @ReactProp(name = "fontSize")
    public void setEmotionSize(EmotionView view, Integer size) {
        fontSize = size;
        view.setTextSize(size);
    }
}
