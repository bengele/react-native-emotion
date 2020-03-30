package com.rn.emotion.views;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.rn.emotion.plugin.EmotionSpannableMaker;

public class EmotionView extends TextView {

    private Context mContext;

    public EmotionView(Context context) {
        super(context);
        mContext = context;
    }

    public EmotionView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        mContext = context;

    }

    public EmotionView(Context context, AttributeSet attrs){
        super(context,attrs);
        mContext = context;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
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
        setText(spannable);

    }

    @Override
    public void setTextSize(float size) {
        super.setTextSize(size);
    }

}


