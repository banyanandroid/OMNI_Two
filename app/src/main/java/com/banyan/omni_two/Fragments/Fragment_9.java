package com.banyan.omni_two.Fragments;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.banyan.omni_two.R;


public class Fragment_9 extends Fragment {
    int fragVal;
    ImageView next, prev,gold_img;
    TextView  frag9_pt3;

    public static Fragment_9 init(int val) {
        Fragment_9 frag_9 = new Fragment_9();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_9.setArguments(args);
        return frag_9;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_9, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);
        gold_img = (ImageView) layoutView.findViewById(R.id.gold_img);

        gold_img.setImageResource(R.drawable.frag9_goldimg);
        TextView tv = (TextView) layoutView.findViewById(R.id.logo_txt);
        Typeface face = Typeface.createFromAsset(getContext().getAssets(),"logo_txt.ttf");//(getAssets(), "fonts/logo_txt.ttf");
        tv.setTypeface(face);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("9");

        //TextView
        frag9_pt3 = (TextView) layoutView.findViewById(R.id.frag9_pt3);

        String pt1_b = "included ginger in its list of acceptable therapies for the treatment of nausea and vomiting during early pregnancy.";
        String pt1_r = "<font color='#EE0000'>The U.K. National Health Service (NHS) through the National Institute for Health and Clinical Excellence [NICE], has </font>";
        frag9_pt3.setText(Html.fromHtml(pt1_r + pt1_b));

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_7 fragment_7 = new Fragment_7();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag9, fragment_7);
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
                fragmentTransaction.replace(R.id.frag9, fragment_10);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return layoutView;
    }


}