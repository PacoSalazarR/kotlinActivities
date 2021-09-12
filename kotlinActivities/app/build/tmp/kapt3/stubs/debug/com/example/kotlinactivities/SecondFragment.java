package com.example.kotlinactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/kotlinactivities/SecondFragment;", "Landroidx/fragment/app/Fragment;", "()V", "PREFS", "", "USER_PREFS", "btnBack", "Landroid/widget/Button;", "element", "Lcom/example/kotlinactivities/Element;", "flag", "", "getFlag", "()Z", "setFlag", "(Z)V", "food", "ivSecondary", "Landroid/widget/ImageView;", "ivStar", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "preferences", "Landroid/content/SharedPreferences;", "txtvSecondary", "Landroid/widget/TextView;", "getFavoriteFood", "initViews", "", "nextActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "saveFavoriteFood", "setMainActivity2Listeners", "app_debug"})
public final class SecondFragment extends androidx.fragment.app.Fragment {
    private com.example.kotlinactivities.Element food;
    private final java.lang.String PREFS = "MY_PREFERENCES";
    private final java.lang.String USER_PREFS = "FAV_FOOD";
    private android.content.SharedPreferences preferences;
    private boolean flag = false;
    private final com.squareup.moshi.Moshi moshi = null;
    private android.widget.ImageView ivSecondary;
    private android.widget.Button btnBack;
    private android.widget.TextView txtvSecondary;
    private com.example.kotlinactivities.Element element;
    private android.widget.ImageView ivStar;
    
    public SecondFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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