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


public class Fragment_20 extends Fragment {
    int fragVal;
    ImageView next, prev;
    TextView  pt1,pt2,pt3,pt4;

    public static Fragment_20 init(int val) {
        Fragment_20 frag_20 = new Fragment_20();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        frag_20.setArguments(args);
        return frag_20;
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
        layoutView = inflater.inflate(R.layout.fragment_lay_5, container,
                false);
        next = (ImageView) layoutView.findViewById(R.id.next_img);
        prev = (ImageView) layoutView.findViewById(R.id.prev_img);

        TextView text_no = (TextView) layoutView.findViewById(R.id.text_no);
        text_no.setText("20");

        pt1 = (TextView) layoutView.findViewById(R.id.frag5_pt1);
        pt2 = (TextView) layoutView.findViewById(R.id.frag5_pt2);
        pt3 = (TextView) layoutView.findViewById(R.id.frag5_pt3);
        pt4 = (TextView) layoutView.findViewById(R.id.frag5_pt4);

        String pt1_b = "onverts fat soluble substance to water soluble ";
        String pt1_r = "<font color='#EE0000'>C</font>";
        pt1.setText(Html.fromHtml(pt1_r + pt1_b));

        String pt2_b = "educes particle size at the absorption point";
        String pt2_r = "<font color='#EE0000'>R</font>";
        pt2.setText(Html.fromHtml(pt2_r + pt2_b));

        String pt3_b = "ncreases the stability of sensitive ingredients\n" +
                "by protecting from oxidation";
        String pt3_r = "<font color='#EE0000'>I</font>";
        pt3.setText(Html.fromHtml(pt3_r + pt3_b));

        String pt4_b = "ranslates erratic absorption to smooth";
        String pt4_r = "<font color='#EE0000'>T</font>";
        pt4.setText(Html.fromHtml(pt4_r + pt4_b));

        TextView tv = (TextView) layoutView.findViewById(R.id.frag5_logotxt);
        Typeface face = Typeface.createFromAsset(getContext().getAssets(),"logo_txt.ttf");//(getAssets(), "fonts/logo_txt.ttf");
        tv.setTypeface(face);


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_19 fragment_19 = new Fragment_19();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag5, fragment_19);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_21 fragment_21 = new Fragment_21();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag5, fragment_21);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return layoutView;
    }

}