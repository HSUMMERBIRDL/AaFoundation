package com.hl.foundation.frame.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;

/**
 * Created by ${Stephen} on 2017-06-07.
 */

public abstract class BaseBottomDialog extends Dialog {
    public BaseBottomDialog(Context context) {
        super(context);
        dialogTitleLineColor();
        windowPoy();
    }

    protected abstract void windowPoy();


    protected void dialogTitleLineColor() {
        {
            int divierId = getContext().getResources().getIdentifier("android:id/titleDivider",
                    null,
                    null);
            View divider = findViewById(divierId);
            if (null != divider)
                divider.setBackgroundColor(Color.TRANSPARENT);
        }
    }


}
