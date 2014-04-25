package com.myxilove.gift.allforyou.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ImageViewBorder extends ImageView {

	public ImageViewBorder(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	private String namespace = "http://xmz.com";
	private int color;

	public ImageViewBorder(Context context, AttributeSet attrs) {
		super(context, attrs);
		color = Color.parseColor(attrs.getAttributeValue(namespace,
				"BorderColor"));
	}

	@Override
	protected void onDraw(Canvas canvas) {

		super.onDraw(canvas);
		// 画边框 暂时去除小边框
		Rect rec = canvas.getClipBounds();
		rec.bottom = rec.bottom + 2;
		rec.right = rec.right + 2;
		Paint paint = new Paint();
		paint.setColor(color);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawRect(rec, paint);
	}
}
