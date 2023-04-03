package com.example.jostoimisi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;

public class ImageSpinnerAdapter extends ArrayAdapter<com.example.jostoimisi.ImageItem> {

    public ImageSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<com.example.jostoimisi.ImageItem> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_view, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);

        com.example.jostoimisi.ImageItem currentItem = getItem(position);

        if (currentItem != null) {
            imageView.setImageResource(currentItem.getImageResource());
            textView.setText(currentItem.getImageName());
        }

        return convertView;
    }
}