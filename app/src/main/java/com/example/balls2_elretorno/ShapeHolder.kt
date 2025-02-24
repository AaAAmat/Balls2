package com.example.balls2_elretorno

import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.drawable.ShapeDrawable

class ShapeHolder(private var shape: ShapeDrawable) {
    private var x: Float = 0f
    private var y: Float = 0f
    private var color: Int = 0
    private var gradient: RadialGradient? = null
    private var alpha: Float = 1f
    private var paint: Paint? = null

    fun setPaint(value: Paint?) {
        paint = value
    }

    fun getPaint(): Paint? = paint

    fun setX(value: Float) {
        x = value
    }

    fun getX(): Float = x

    fun setY(value: Float) {
        y = value
    }

    fun getY(): Float = y

    fun getShape(): ShapeDrawable = shape

    fun getColor(): Int = color

    fun setColor(value: Int) {
        shape.paint.color = value
        color = value
    }

    fun setGradient(value: RadialGradient?) {
        gradient = value
    }

    fun getGradient(): RadialGradient? = gradient

    fun setAlpha(alpha: Float) {
        this.alpha = alpha
        shape.alpha = ((alpha * 255f) + .5f).toInt()
    }

    fun getWidth(): Float = shape.shape.width

    fun setWidth(width: Float) {
        shape.shape.resize(width, shape.shape.height)
    }

    fun getHeight(): Float = shape.shape.height

    fun setHeight(height: Float) {
        shape.shape.resize(shape.shape.width, height)
    }
}
