package com.example.fragmetchart;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class a extends Fragment {

    private static ImageView image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image, container, false);
        image = (ImageView) view.findViewById(R.id.imagex);
        return view;
    }

    public void changeTextProperties(String text) {
        if (text.equals("Chart1")) {
            image.setImageResource(R.drawable.ic_baseline_child_care_24);
        } else if (text.equals("Chart2")) {
            image.setImageResource(R.drawable.ic_baseline_campaign_24);
        } else if (text.equals("Chart3")) {
            image.setImageResource(R.drawable.ic_baseline_delete_sweep_24);
        } else if (text.equals("Chart4")) {
            image.setImageResource(R.drawable.ic_baseline_linked_camera_24);
        } else if (text.equals("Chart5")) {
            image.setImageResource(R.drawable.ic_baseline_signal_wifi_4_bar_24);
        }
    }
}
