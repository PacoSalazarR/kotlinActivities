package com.example.kotlinactivities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tH\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Lcom/example/kotlinactivities/Element;", "Landroid/os/Parcelable;", "name", "", "image", "Lcom/example/kotlinactivities/AssignedImage;", "texto", "Lcom/example/kotlinactivities/AssignedText;", "sound", "", "(Ljava/lang/String;Lcom/example/kotlinactivities/AssignedImage;Lcom/example/kotlinactivities/AssignedText;I)V", "getImage", "()Lcom/example/kotlinactivities/AssignedImage;", "setImage", "(Lcom/example/kotlinactivities/AssignedImage;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSound", "()I", "setSound", "(I)V", "getTexto", "()Lcom/example/kotlinactivities/AssignedText;", "setTexto", "(Lcom/example/kotlinactivities/AssignedText;)V", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Element implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private com.example.kotlinactivities.AssignedImage image;
    @org.jetbrains.annotations.Nullable()
    private com.example.kotlinactivities.AssignedText texto;
    private int sound;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlinactivities.Element.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.kotlinactivities.Element[] elements = null;
    public static final android.os.Parcelable.Creator<com.example.kotlinactivities.Element> CREATOR = null;
    
    public Element() {
        super();
    }
    
    public Element(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.example.kotlinactivities.AssignedImage image, @org.jetbrains.annotations.Nullable()
    com.example.kotlinactivities.AssignedText texto, int sound) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kotlinactivities.AssignedImage getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    com.example.kotlinactivities.AssignedImage p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kotlinactivities.AssignedText getTexto() {
        return null;
    }
    
    public final void setTexto(@org.jetbrains.annotations.Nullable()
    com.example.kotlinactivities.AssignedText p0) {
    }
    
    public final int getSound() {
        return 0;
    }
    
    public final void setSound(int p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.kotlinactivities.Element> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kotlinactivities.Element createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kotlinactivities.Element[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlinactivities/Element$Companion;", "", "()V", "elements", "", "Lcom/example/kotlinactivities/Element;", "getElements", "()[Lcom/example/kotlinactivities/Element;", "[Lcom/example/kotlinactivities/Element;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlinactivities.Element[] getElements() {
            return null;
        }
    }
}