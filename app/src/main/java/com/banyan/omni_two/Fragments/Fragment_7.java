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


public class Fragment_7 extends Fragment {
    int fragVal;
    ImageView next, prev,gold_img,frag8_redimg,frag9_redimg;
    //TextView  pt1,pt2,pt3,pt4;

    public static Fragment_7 init(int val) {
        Fragment_7 frag_7 = new Fragment_7();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_7.setArguments(args);
        return frag_7;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_7, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);
        gold_img = (ImageView) layoutView.findViewById(R.id.gold_img);
        frag8_redimg = (ImageView) layoutView.findViewById(R.id.frag8_redimg);
        frag9_redimg = (ImageView) layoutView.findViewById(R.id.frag9_redimg);

        TextView tv = (TextView) layoutView.findViewById(R.id.logo_txt);
        Typeface face = Typeface.createFromAsset(getContext().getAssets(),"logo_txt.ttf");//(getAssets(), "fonts/logo_txt.ttf");
        tv.setTypeface(face);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("7");

        gold_img.setImageResource(R.drawable.frag7_goldimg);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_6 fragment_6 = new Fragment_6();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag7, fragment_6);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_10 fragment_10 = new Fragment_10();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag7, fragment_10);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        frag8_redimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_8 fragment_8 = new Fragment_8();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag7, fragment_8);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        frag9_redimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_9 fragment_9 = new Fragment_9();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag7, fragment_9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return layoutView;
    }


}