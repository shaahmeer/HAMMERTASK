package com.example.hammertaskapp.View.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hammertaskapp.R;
import com.example.hammertaskapp.View.Viewmodel.DataModel2;
import com.example.hammertaskapp.View.Viewmodel.Datamodel3;

import java.util.ArrayList;



public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.myviewholder> {

    ArrayList<Datamodel3> dataholder23;
    Context context;

    public CategoriesAdapter(ArrayList<Datamodel3> dataholder23, Context context) {
        this.dataholder23 = dataholder23;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recviewbuttondesign,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.imageView.setImageResource(dataholder23.get(position).getImage());



    }

    @Override
    public int getItemCount() {
        return dataholder23.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView HEADER,DESC;
        Button button;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.pizzaImage);

        }
    }
}

