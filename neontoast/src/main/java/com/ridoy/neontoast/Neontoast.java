package com.ridoy.neontoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.content.res.AppCompatResources;

public class Neontoast {

    public static void success(Context context, String message, int duration) {
        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.success_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        TextView txt = view.findViewById(R.id.textView);
        ImageView img = view.findViewById(R.id.imageView);
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_success));
        txt.setText(message);
        toast.show();
    }
    public static void error(Context context, String message, int duration) {

        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.error_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        TextView txt = view.findViewById(R.id.textView);
        ImageView img = view.findViewById(R.id.imageView);
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_error));
        txt.setText(message);
        toast.show();
    }

    public static void warning(Context context, String message, int duration) {

        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.warning_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        TextView txt = view.findViewById(R.id.textView);
        ImageView img = view.findViewById(R.id.imageView);
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_info));
        txt.setText(message);
        toast.show();
    }

    public static void info(Context context, String message, int duration) {

        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.info_layout,
                null);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        TextView txt = view.findViewById(R.id.textView);
        ImageView img = view.findViewById(R.id.imageView);
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_info));
        txt.setText(message);
        toast.show();
    }

}
