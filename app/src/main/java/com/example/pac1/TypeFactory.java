package com.example.pac1;

import android.content.Context;
import android.graphics.Typeface;

public class TypeFactory {

    private String A_BOLD= "Amble-Bold.ttf";
    private String A_LIGHT="Amble-Light.ttf";
    private String A_REGULAR= "Amble-Regular.ttf";
    private String O_ITALIC= "OpenSans-Italic.ttf";
    private String O_REGULAR="OpenSans-Regular.ttf";

    public Typeface ambleBold;
    public Typeface ambleLight;
    public Typeface ambleRegular;
    public Typeface openSansItalic;
    public Typeface openSansRegular;

    // Método crear fuentes
    public TypeFactory(Context context){
        ambleBold = Typeface.createFromAsset(context.getAssets(),A_BOLD);
        ambleLight = Typeface.createFromAsset(context.getAssets(),A_LIGHT);
        ambleRegular = Typeface.createFromAsset(context.getAssets(),A_REGULAR);
        openSansItalic = Typeface.createFromAsset(context.getAssets(),O_ITALIC);
        openSansRegular = Typeface.createFromAsset(context.getAssets(),O_REGULAR);
    }
}