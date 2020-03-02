package com.example.pac1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView extends AppCompatTextView {

    private int typefaceType;
    private TypeFactory mFontFactory;

    /**
     * Constructor
     * @param context Contenido
     * @param attrs Atributos
     */
    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        InitControles(context, attrs);
    }

    /**
     * Constructor
     * @param context Contenido
     * @param attrs Atributos
     * @param defStyle Estilo
     */
    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        InitControles(context, attrs);
    }

    /**
     * Constructor
     * @param context Contenido
     */
    public CustomTextView(Context context) {
        super(context);
    }

    // Inicializa el control
    private void InitControles(Context context, AttributeSet attrs) {

        TypedArray array = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomTextView,
                0, 0);
        try {
            typefaceType = array.getInteger(R.styleable.CustomTextView_font_name, 0);
        } finally {
            array.recycle();
        }
        if (!isInEditMode()) {
            setTypeface(getTypeFace(typefaceType));
        }
    }

    /**
     * Método que nos permite obtener un estilo de fuente
     * @param type Tipo de fuente
     * @return Devuelve estilo fontFactory
     */
    public Typeface getTypeFace(int type) {
        if (mFontFactory == null)
            mFontFactory = new TypeFactory(getContext());

        switch (type) {
            case Constants.A_BOLD:
                return mFontFactory.ambleBold;

            case Constants.A_LIGHT:
                return mFontFactory.ambleLight;

            case Constants.A_REGULAR:
                return mFontFactory.ambleRegular;

            case Constants.O_LIGHT:
                return mFontFactory.openSansItalic;

            case Constants.O_REGULAR:
                return mFontFactory.openSansRegular;

            default:
                return mFontFactory.ambleBold;
        }
    }

    /**
     * Constantes para los tipos de fuente
     */
    public interface Constants {
        int A_BOLD = 1,
            A_LIGHT = 2,
            A_REGULAR = 3,
            O_LIGHT = 4,
            O_REGULAR=5;
    }
}
