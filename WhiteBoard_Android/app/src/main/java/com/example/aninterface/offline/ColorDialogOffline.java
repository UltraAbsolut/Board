package com.example.aninterface.offline;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aninterface.R;

public class ColorDialogOffline extends Dialog {
    Button buttonConfirm;
    Button buttonRed;
    Button buttonYellow;
    Button buttonGreen;
    Button buttonBlue;
    Button buttonBlack;
    EditText editTextColor;

    public ColorDialogOffline(Context context, DrawingOffline drawingOffline) {
        super(context, R.style.RoundedDialog);

        setContentView(R.layout.color_dialog_offline);

        GradientDrawable background = new GradientDrawable();
        background.setColor(getContext().getResources().getColor(android.R.color.background_dark)); // Цвет фона
        background.setCornerRadius(30f);

        View rootView = findViewById(android.R.id.content);
        rootView.setBackground(background);

        editTextColor = findViewById(R.id.editTextColorOffline);
        buttonConfirm = findViewById(R.id.button_confirm_own_color_offline);
        buttonRed = findViewById(R.id.button_set_color_red_offline);
        buttonYellow = findViewById(R.id.button_set_color_yellow_offline);
        buttonGreen = findViewById(R.id.button_set_color_green_offline);
        buttonBlue = findViewById(R.id.button_set_color_blue_offline);
        buttonBlack = findViewById(R.id.button_set_color_black_offline);

        buttonRed.setOnClickListener(view -> {
            drawingOffline.getDrawingThread().setCurrentColor(Color.RED);
            dismiss();
        });

        buttonYellow.setOnClickListener(view -> {
            drawingOffline.getDrawingThread().setCurrentColor(Color.YELLOW);
            dismiss();
        });

        buttonGreen.setOnClickListener(view -> {
            drawingOffline.getDrawingThread().setCurrentColor(Color.GREEN);
            dismiss();
        });

        buttonBlue.setOnClickListener(view -> {
            drawingOffline.getDrawingThread().setCurrentColor(Color.BLUE);
            dismiss();
        });

        buttonBlack.setOnClickListener(view -> {
            drawingOffline.getDrawingThread().setCurrentColor(Color.BLACK);
            dismiss();
        });

        buttonConfirm.setOnClickListener(view -> {
            String myColor = editTextColor.getText().toString();
            if (!myColor.isEmpty()) {
                try {
                    if (!myColor.startsWith("#")) {
                        myColor = "#" + myColor;
                    }
                    int color = Color.parseColor(myColor);
                    drawingOffline.getDrawingThread().setCurrentColor(color);
                    dismiss();
                } catch (IllegalArgumentException e) {
                    Toast.makeText(context, "Неверный формат цвета. Используйте формат #RRGGBB", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(context, "Введите цвет", Toast.LENGTH_SHORT).show();
            }
        });
    }
}