package com.example.kotlinactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020&H\u0002J\u001a\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010,\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010-\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/kotlinactivities/SecondFragment;", "Landroidx/fragment/app/Fragment;", "()V", "KEY_PARSE_DATA", "", "PREFS", "USER_PREFS", "btnBack", "Landroid/widget/Button;", "bundle", "Landroid/os/Bundle;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "element", "Lcom/example/kotlinactivities/Element;", "flag", "", "getFlag", "()Z", "setFlag", "(Z)V", "food", "ivSecondary", "Landroid/widget/ImageView;", "ivStar", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "preferences", "Landroid/content/SharedPreferences;", "txtvSecondary", "Landroid/widget/TextView;", "getFavoriteFood", "initViews", "", "nextActivity", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "saveFavoriteFood", "setMainActivity2Listeners", "app_debug"})
public final class SecondFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String KEY_PARSE_DATA = "SAVED_FOOD";
    private android.os.Bundle bundle;
    private com.example.kotlinactivities.Element element;
    private com.example.kotlinactivities.Element food;
    private final java.lang.String PREFS = "MY_PREFERENCES";
    private final java.lang.String USER_PREFS = "FAV_FOOD";
    private android.content.SharedPreferences preferences;
    private boolean flag = false;
    private final com.squareup.moshi.Moshi moshi = null;
    private android.widget.ImageView ivSecondary;
    private android.widget.Button btnBack;
    private android.widget.TextView txtvSecondary;
    private android.widget.ImageView ivStar;
    private int counter = 0;
    
    public SecondFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean getFlag() {
        return false;
    }
    
    public final void setFlag(boolean p0) {
    }
    
    private final void initViews() {
    }
    
    public final int getCounter() {
        return 0;
    }
    
    public final void setCounter(int p0) {
    }
    
    private final void setMainActivity2Listeners() {
    }
    
    private final com.example.kotlinactivities.Element getFavoriteFood() {
        return null;
    }
    
    private final void saveFavoriteFood(com.example.kotlinactivities.Element element) {
    }
    
    private final void nextActivity() {
    }
}