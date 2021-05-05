package com.example.fragmetchart;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class b extends Fragment {
    private static TextView mTextView;
    ArrayList<String> data;
    OneFragmentListener activityCallback;

    public interface OneFragmentListener {
        public void onButtonClick(String text);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCallback = (OneFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OneFragmentListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list, container, false);
        RecyclerView temp = (RecyclerView) view.findViewById(R.id.recycleview);
        temp.setLayoutManager(new LinearLayoutManager(getContext()));
        data = new ArrayList<String>();
        data.add("Chart1");
        data.add("Chart2");
        data.add("Chart3");
        data.add("Chart4");
        data.add("Chart5");
        temp.setAdapter(new MainRecyclerView (data,activityCallback));
        return view;
    }
    public void changeTextProperties(String text) {
        mTextView = (TextView) getView().findViewById(R.id.textChanged);
        mTextView.setText(text);
    }
}
