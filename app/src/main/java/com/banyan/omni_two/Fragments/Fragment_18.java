package com.banyan.omni_two.Fragments;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.banyan.omni_two.R;


public class
Fragment_18 extends Fragment {
    int fragVal;
    ImageView next,prev;

    public static Fragment_18 init(int val) {
        Fragment_18 frag_18 = new Fragment_18();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_18.setArguments(args);
        return frag_18;
    }

    View layoutView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layoutView = inflater.inflate(R.layout.fragment_lay_18, container,
                false);

        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);

        TextView tv = (TextView) layoutView.findViewById(R.id.frag36_head);
        Typeface face = Typeface.createFromAsset(getContext().getAssets(),"helvnti.ttf");//(getAssets(), "fonts/logo_txt.ttf");
        tv.setTypeface(face);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("18");

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_17 fragment_17 = new Fragment_17();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag18, fragment_17);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_19 fragment_19 = new Fragment_19();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag18, fragment_19);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return layoutView;
    }

}