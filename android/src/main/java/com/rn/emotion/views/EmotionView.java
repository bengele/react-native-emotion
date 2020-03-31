package com.rn.emotion.views;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rn.emotion.plugin.EmotionSpannableMaker;

public class EmotionView extends TextView {

    private Context mContext;

    public EmotionView(Context context) {
        super(context);
        mContext = context;
        initLayout();
    }

    public EmotionView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        mContext = context;
    }

    public EmotionView(Context context, AttributeSet attrs){
        super(context,attrs);
        mContext = context;
    }


    private void initLayout(){
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(lp);
    }


    /**
     * 设置表情文字
     * @param text
     */
    public void setEmotionText(String text){
        setEmotionText(text,this.getLineHeight());
    }

    /**
     * 设置表情文字
     * @param text
     * @param size
     */
    public void setEmotionText(String text,int size){
        Spannable spannable = EmotionSpannableMaker.buildEmotionSpannable(mContext,text,size);
        setText(text);
        ViewGroup.LayoutParams lp = getLayoutParams();
        lp.width = 200;
        lp.height = 100;
        setBackgroundColor(0xfd0);
        setLayoutParams(lp);
    }

    @Override
    public void setTextSize(float size) {
        super.setTextSize(size);
    }

}


