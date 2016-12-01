package com.cleveroad.library;

public class TableLayoutSettings {
    public static final long LONG_PRESS_DELAY = 1000;
    private int mShadowSize;
    private int mMinimumVelocity;
    private int mMaximumVelocity;
    private int mTouchSlop;
    private int mLayoutWidth;
    private int mLayoutHeight;


    public TableLayoutSettings() {
    }

    public int getShadowSize() {
        return mShadowSize;
    }

    public TableLayoutSettings setShadowSize(int shadowSize) {
        mShadowSize = shadowSize;
        return this;
    }

    public int getMinimumVelocity() {
        return mMinimumVelocity;
    }

    public TableLayoutSettings setMinimumVelocity(int minimumVelocity) {
        mMinimumVelocity = minimumVelocity;
        return this;
    }

    public int getMaximumVelocity() {
        return mMaximumVelocity;
    }

    public TableLayoutSettings setMaximumVelocity(int maximumVelocity) {
        mMaximumVelocity = maximumVelocity;
        return this;
    }

    public int getTouchSlop() {
        return mTouchSlop;
    }

    public TableLayoutSettings setTouchSlop(int touchSlop) {
        mTouchSlop = touchSlop;
        return this;
    }

    public int getLayoutWidth() {
        return mLayoutWidth;
    }

    public TableLayoutSettings setLayoutWidth(int layoutWidth) {
        mLayoutWidth = layoutWidth;
        return this;
    }

    public int getLayoutHeight() {
        return mLayoutHeight;
    }

    public TableLayoutSettings setLayoutHeight(int layoutHeight) {
        mLayoutHeight = layoutHeight;
        return this;
    }
}
