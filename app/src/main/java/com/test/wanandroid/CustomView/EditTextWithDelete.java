package com.test.wanandroid.CustomView;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import com.test.wanandroid.R;

/**
 * 作者：weisongsong on 2022/5/6
 * <p>
 * 邮箱：15231167995@163.com
 */
public class EditTextWithDelete extends androidx.appcompat.widget.AppCompatEditText {
    private static final String TAG = "EditTextWithDelete";
    private Drawable imgInable;
    private Drawable imgAble;
    private Context mContext;

    public EditTextWithDelete(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public EditTextWithDelete(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public EditTextWithDelete(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init(){
        imgInable = mContext.getResources().getDrawable(R.drawable.delete_gray);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                setDrawable();
            }
        });
    }

    private void setDrawable(){
        if (length() <1)
            setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
        else
            setCompoundDrawablesWithIntrinsicBounds(null,null,imgInable,null);
    }

    //处理删除事件
    public boolean onTouchEvent(MotionEvent event){
        if (imgInable != null && event.getAction() == MotionEvent.ACTION_UP){
            int eventX = (int) event.getRawX();
            int eventY = (int) event.getRawY();
            Log.e(TAG,"eventX = "+eventX+"; eventY = "+eventY);
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            rect.left = rect.right-100;
            if (rect.contains(eventX,eventY))
                setText("");
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
