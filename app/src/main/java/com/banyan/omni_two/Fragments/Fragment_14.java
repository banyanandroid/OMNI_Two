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


public class Fragment_14 extends Fragment {
    int fragVal;
    ImageView next, prev,gold_img;
    TextView  frag9_pt3;

    public static Fragment_14 init(int val) {
        Fragment_14 frag_14 = new Fragment_14();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_14.setArguments(args);
        return frag_14;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_14, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("14");

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_13 fragment_13 = new Fragment_13();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag14, fragment_13);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_15 fragment_15 = new Fragment_15();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag14, fragment_15);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return layoutView;
    }


}