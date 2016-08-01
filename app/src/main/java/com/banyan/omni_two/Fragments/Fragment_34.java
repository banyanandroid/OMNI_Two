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


public class Fragment_34 extends Fragment {
    int fragVal;
    ImageView next, prev, gold_img;
    TextView frag9_pt3;

    public static Fragment_34 init(int val) {
        Fragment_34 frag_34 = new Fragment_34();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_34.setArguments(args);
        return frag_34;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_34, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);
        gold_img = (ImageView) layoutView.findViewById(R.id.gold_img);

        gold_img.setImageResource(R.drawable.frag34_goldimg);
        next.setVisibility(View.INVISIBLE);

        //TextView
        TextView tv = (TextView) layoutView.findViewById(R.id.logo_txt);
        Typeface face = Typeface.createFromAsset(getContext().getAssets(), "logo_txt.ttf");//(getAssets(), "fonts/logo_txt.ttf");
        tv.setTypeface(face);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("34");

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_33 fragment_33 = new Fragment_33();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag34, fragment_33);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        /*next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_14 fragment_14 = new Fragment_14();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag13, fragment_14);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });*/


        return layoutView;
    }


}