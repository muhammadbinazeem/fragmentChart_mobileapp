package com.example.fragmetchart;

import android.app.Activity;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainRecyclerView extends RecyclerView.Adapter{

    private ArrayList<String> data;
    private b.OneFragmentListener activityCallback;



    public MainRecyclerView(ArrayList<String> data,b.OneFragmentListener activityCallback) {
        this.data = data;
        this.activityCallback = (b.OneFragmentListener) activityCallback;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycle,parent,false);
        return new abcViewHolder(view);
    }

    public String getItem(int position){
        return data.get(position);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String tlt = getItem(position);
        ((abcViewHolder) holder).txtTitle.setText(tlt);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class abcViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        ImageButton button;
        public abcViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.textChanged);

            itemView.findViewById(R.id.textChanged).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Log.println(Log.DEBUG, "***D***", ""+pos);
                    activityCallback.onButtonClick(data.get(pos));
                }
            });
        }
    }
}
