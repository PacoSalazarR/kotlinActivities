package com.example.kotlinactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u001a\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u00020%2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010/\u001a\u00020%2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u00100\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/kotlinactivities/SecondFragment;", "Landroidx/fragment/app/Fragment;", "()V", "KEY_PARSE_DATA", "", "PREFS", "SOUND_PREFS", "USER_PREFS", "bundle", "Landroid/os/Bundle;", "element", "Lcom/example/kotlinactivities/Element;", "favSound", "flag", "", "getFlag", "()Z", "setFlag", "(Z)V", "flagSound", "getFlagSound", "setFlagSound", "food", "ivHeart", "Landroid/widget/ImageView;", "ivSecondary", "ivStar", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "preferences", "Landroid/content/SharedPreferences;", "txtvSecondary", "Landroid/widget/TextView;", "getFavoriteFood", "getFavoriteSound", "initViews", "", "nextActivity", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "playSound", "sound", "", "saveFavoriteFood", "saveFavoriteSound", "setMainActivity2Listeners", "app_debug"})
public final class SecondFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String KEY_PARSE_DATA = "SAVED_FOOD";
    private android.os.Bundle bundle;
    private com.example.kotlinactivities.Element element;
    private com.example.kotlinactivities.Element food;
    private com.example.kotlinactivities.Element favSound;
    private final java.lang.String PREFS = "MY_PREFERENCES";
    private final java.lang.String USER_PREFS = "FAV_FOOD";
    private final java.lang.String SOUND_PREFS = "FAV_SOUND";
    private android.content.SharedPreferences preferences;
    private boolean flag = false;
    private boolean flagSound = false;
    private final com.squareup.moshi.Moshi moshi = null;
    private android.widget.ImageView ivSecondary;
    private android.widget.TextView txtvSecondary;
    private android.widget.ImageView ivHeart;
    private android.widget.ImageView ivStar;
    
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
    
    public final boolean getFlagSound() {
        return false;
    }
    
    public final void setFlagSound(boolean p0) {
    }
    
    private final void initViews() {
    }
    
    private final void setMainActivity2Listeners() {
    }
    
    private final com.example.kotlinactivities.Element getFavoriteFood() {
        return null;
    }
    
    private final com.example.kotlinactivities.Element getFavoriteSound() {
        return null;
    }
    
    private final void saveFavoriteSound(com.example.kotlinactivities.Element element) {
    }
    
    private final void saveFavoriteFood(com.example.kotlinactivities.Element element) {
    }
    
    private final void playSound(int sound) {
    }
    
    private final void nextActivity() {
    }
}