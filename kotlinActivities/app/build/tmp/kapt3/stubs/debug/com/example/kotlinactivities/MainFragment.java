package com.example.kotlinactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/example/kotlinactivities/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "KEY_PARSE_DATA", "", "PREFS", "SOUND_PREFS", "TEXT_KEY", "actualElement", "Lcom/example/kotlinactivities/Element;", "btnmoreInfo", "Landroid/widget/Button;", "counter", "", "ivBack", "Landroid/widget/ImageView;", "ivNext", "ivPlay", "ivPrincipal", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "preferences", "Landroid/content/SharedPreferences;", "soundElement", "getFavoriteSound", "initViews", "", "makeToast", "nextActivity", "nextImage", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "playSound", "sound", "previousImage", "setActualFood", "setMainActivity1Listeners", "app_debug"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TEXT_KEY = "TEXT_KEY";
    private final java.lang.String KEY_PARSE_DATA = "SAVED_FOOD";
    private int counter = 0;
    private final java.lang.String PREFS = "MY_PREFERENCES";
    private final java.lang.String SOUND_PREFS = "FAV_SOUND";
    private android.content.SharedPreferences preferences;
    private final com.squareup.moshi.Moshi moshi = null;
    private android.widget.ImageView ivPrincipal;
    private android.widget.ImageView ivBack;
    private android.widget.ImageView ivNext;
    private android.widget.Button btnmoreInfo;
    private com.example.kotlinactivities.Element actualElement;
    private com.example.kotlinactivities.Element soundElement;
    private android.widget.ImageView ivPlay;
    
    public MainFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final com.example.kotlinactivities.Element getFavoriteSound() {
        return null;
    }
    
    private final void setActualFood() {
    }
    
    private final void setMainActivity1Listeners() {
    }
    
    private final void previousImage() {
    }
    
    private final void nextImage() {
    }
    
    private final void nextActivity() {
    }
    
    private final void makeToast() {
    }
    
    private final void playSound(int sound) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
}