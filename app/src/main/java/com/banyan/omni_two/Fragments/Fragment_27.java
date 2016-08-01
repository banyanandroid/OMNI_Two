package com.banyan.omni_two.Fragments;


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
Fragment_27 extends Fragment {
    int fragVal;
    ImageView next,prev;

    public static Fragment_27 init(int val) {
        Fragment_27 frag_27 = new Fragment_27();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_27.setArguments(args);
        return frag_27;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_27, container,
                false);

        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("27");

        prev.setVisibility(View.INVISIBLE);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_28 fragment_28 = new Fragment_28();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag27, fragment_28);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return layoutView;
    }



}