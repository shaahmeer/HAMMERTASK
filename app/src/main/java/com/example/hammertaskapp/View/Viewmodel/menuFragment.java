package com.example.hammertaskapp.View.Viewmodel;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Visibility;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import com.example.hammertaskapp.R;
import com.example.hammertaskapp.View.DataModel;
import com.example.hammertaskapp.View.adapter.CategoriesAdapter;
import com.example.hammertaskapp.View.adapter.MyApadpter;
import com.example.hammertaskapp.View.adapter.MyapadpterHorizontol;

import java.util.ArrayList;


public class menuFragment extends Fragment {


RecyclerView recyclerView,horizontolrecycleview,horizontalbutton;
ArrayList<DataModel> dataholder ;
ArrayList<DataModel2>dataholder2;
ArrayList<Datamodel3>dataholder23;
FragmentManager fragmentManager;
menuFragment fragment;
    public static final int HORIZONTAL = 0;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
         recyclerView=view.findViewById(R.id.recycleView);


         recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
         dataholder= new ArrayList<>();
         DataModel ob1 = new DataModel(R.drawable.pizza22,"Ветчина и грибы ","Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус");
         dataholder.add(ob1);
        DataModel ob2 = new DataModel(R.drawable.pizza22,"Ветчина и грибы ","Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус");
        dataholder.add(ob2);
        DataModel ob3 = new DataModel(R.drawable.pizza22,"Ветчина и грибы ","Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус");
        dataholder.add(ob3);
        DataModel ob4 = new DataModel(R.drawable.pizza22,"Ветчина и грибы ","Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус");
        dataholder.add(ob4);
        DataModel ob5 = new DataModel(R.drawable.pizza22,"Ветчина и грибы ","Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус");
        dataholder.add(ob5);
        DataModel ob6 = new DataModel(R.drawable.pizza22,"Ветчина и грибы ","Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус");
        dataholder.add(ob6);


         recyclerView.setAdapter(new MyApadpter(dataholder,getContext()));


       LinearLayoutManager HorizontalLayout
                = new LinearLayoutManager(
                getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        horizontolrecycleview=view.findViewById(R.id.horizontolrecycleview);
        horizontolrecycleview.setLayoutManager(HorizontalLayout);
        dataholder2= new ArrayList();
        DataModel2 ob99 = new DataModel2(R.drawable.discount);
        dataholder2.add(ob99);
        DataModel2 ob98 = new DataModel2(R.drawable.discount);
        dataholder2.add(ob98);
        DataModel2 ob97 = new DataModel2(R.drawable.discount);
        dataholder2.add(ob97);
        DataModel2 ob96 = new DataModel2(R.drawable.discount);
        dataholder2.add(ob96);

        horizontolrecycleview.setAdapter(new MyapadpterHorizontol(dataholder2,getContext()));


        LinearLayoutManager HorizontalLayout2
                = new LinearLayoutManager(
                getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        horizontalbutton=view.findViewById(R.id.horizontolbutton);
        horizontalbutton.setLayoutManager(HorizontalLayout2);
        dataholder23= new ArrayList();
        Datamodel3 ob100 = new Datamodel3(R.drawable.buttonrecview);
        dataholder23.add(ob100);
        Datamodel3 ob101 = new Datamodel3(R.drawable.buttonrecview);
        dataholder23.add(ob101);
        Datamodel3 ob102 = new Datamodel3(R.drawable.buttonrecview);
        dataholder23.add(ob102);
        Datamodel3 ob103 = new Datamodel3(R.drawable.buttonrecview);
        dataholder23.add(ob103);

        horizontalbutton.setAdapter(new CategoriesAdapter(dataholder23,getContext()));


         final int[] state = new int[1];
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                state[0]=newState;
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if(recyclerView.canScrollVertically(-1)){
                    horizontolrecycleview.setVisibility(View.GONE);
                }
                else
                {

                        horizontolrecycleview.setVisibility(View.VISIBLE);
                }

            }
        });



        return view;
    }




}
