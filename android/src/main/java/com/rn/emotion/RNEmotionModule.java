
package com.rn.emotion;

import android.text.Spannable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.rn.emotion.plugin.EmotionSpannableMaker;

public class RNEmotionModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNEmotionModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNEmotion";
  }


  @ReactMethod
  public String getEmotionString(String text,int size){
    Spannable spannable = EmotionSpannableMaker.buildEmotionSpannable(this.reactContext,text,size);
    return spannable.toString();
  }

}