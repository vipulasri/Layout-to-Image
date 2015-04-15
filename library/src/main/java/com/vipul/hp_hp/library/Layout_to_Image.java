package com.vipul.hp_hp.library;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

/**
 * Created by HP-HP on 3/3/2015.
 */
public class Layout_to_Image {

    View _view;
    Context _context;

    Bitmap bMap;

    public Layout_to_Image(Context context, View view)
    {
        this._context=context;
        this._view =view;
    }

    public Bitmap convert_layout()
    {
        _view.setDrawingCacheEnabled(true);

        _view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));

        _view.layout(0, 0, _view.getMeasuredWidth(), _view.getMeasuredHeight());

        _view.buildDrawingCache(true);

        bMap = Bitmap.createBitmap(_view.getDrawingCache());

        return bMap;
    }
}
