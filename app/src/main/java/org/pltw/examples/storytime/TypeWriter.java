package org.pltw.examples.storytime;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

public class TypeWriter extends android.support.v7.widget.AppCompatTextView {
    private CharSequence mText;
    private int mIndex;
    private long mDelay = 150; // in ms
    private Handler mHandler = new Handler();
    private boolean finish;

    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            setText(mText.subSequence(0, mIndex++));
            if (mIndex <= mText.length() && !finish) {
                mHandler.postDelayed(characterAdder, mDelay);
            }
            if(finish) {
                setText(mText);
                finish = false;
            }
        }
    };



    public TypeWriter(Context context) {
        super(context);
    }

    public TypeWriter(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void animateText(CharSequence txt) {
        mText = txt;
        mIndex = 0;
        setText("");
        mHandler.removeCallbacks(characterAdder);
        mHandler.postDelayed(characterAdder, mDelay);
    }
    public void setCharacterDelay(long m) {
        mDelay = m;
    }

    public void finish() {
        finish = true;
    }
}