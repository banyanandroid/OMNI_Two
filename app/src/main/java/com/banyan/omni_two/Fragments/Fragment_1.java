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
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class Fragment_1 extends Fragment {
    int fragVal;
    ImageView next, prev;

    public static Fragment_1 init(int val) {
        Fragment_1 frag_1 = new Fragment_1();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_1.setArguments(args);
        return frag_1;
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
        layoutView = inflater.inflate(R.layout.fragment_1, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("2");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_2 fragment_2 = new Fragment_2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag1, fragment_2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        prev.setVisibility(View.INVISIBLE);

        /*img_frag10.postDelayed(new Runnable() {
            public void run() {
                img_frag10.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.ZoomInLeft)
                        .duration(1000)
                        .playOn(layoutView.findViewById(R.id.img_frag10));
            }
        }, 500);*/

        return layoutView;
    }


}