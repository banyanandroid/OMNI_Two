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
Fragment_38 extends Fragment {
    int fragVal;
    ImageView next,prev;

    public static Fragment_38 init(int val) {
        Fragment_38 frag_38 = new Fragment_38();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_38.setArguments(args);
        return frag_38;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_38, container,
                false);

        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);
        ImageView gold_img = (ImageView) layoutView.findViewById(R.id.gold_img);

        gold_img.setImageResource(R.drawable.frag37_goldimg);
        TextView tv = (TextView) layoutView.findViewById(R.id.logo_txt);
        Typeface face = Typeface.createFromAsset(getContext().getAssets(),"logo_txt.ttf");//(getAssets(), "fonts/logo_txt.ttf");
        tv.setTypeface(face);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("38");

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_37 fragment_37 = new Fragment_37();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag38, fragment_37);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_39 fragment_39 = new Fragment_39();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag38, fragment_39);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return layoutView;
    }

}