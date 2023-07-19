package com.su.periodictable.fragment;

import static android.graphics.Color.rgb;
import static com.su.periodictable.R.drawable.bg_blue;
import static com.su.periodictable.R.drawable.round_bg;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.provider.CalendarContract;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.su.periodictable.R;
import com.su.periodictable.trend.Trenddata;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CompColorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompColorFragment extends Fragment {

    TextView tittle;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CompColorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CompColorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CompColorFragment newInstance(String param1, String param2) {
        CompColorFragment fragment = new CompColorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comp_color, container, false);
        tittle = view.findViewById(R.id.comp_list_tittle);
        String num = String.valueOf(Trenddata.compvar);



        if (Trenddata.compvar == 1) {
            myMethod("Halides",Trenddata.colorhalides,view);
        }else if (Trenddata.compvar == 2) {
            myMethod("Sulphides",Trenddata.colorsulphides,view);
        }else if (Trenddata.compvar == 3) {
            myMethod("Oxides", Trenddata.coloroxides, view);
        }else if (Trenddata.compvar == 4) {
            myMethod("Ferrocynide", Trenddata.colorferrocynide, view);
        }else if (Trenddata.compvar == 5) {
            myMethod("Chromate", Trenddata.colorchromates, view);
        }else if (Trenddata.compvar == 6) {
            myMethod("Sulphates & Sulphites", Trenddata.colorsulphatesandsulphites, view);
        }else if (Trenddata.compvar == 7) {
            myMethod("Hydroxides", Trenddata.colorhydroxides, view);
        }else if (Trenddata.compvar == 8) {
            myMethod("Cynides", Trenddata.colorcynides, view);
        }else if (Trenddata.compvar == 9) {
            myMethod("Chromium",Trenddata.colorchromium,view);
        }else if (Trenddata.compvar == 10) {
            myMethod("Nickel", Trenddata.colorNickel, view);
        }else if (Trenddata.compvar == 11) {
            myMethod("Silver", Trenddata.colorSilver, view);
        }else if (Trenddata.compvar == 12) {
            myMethod("Miscellaneous", Trenddata.colormiscellaneous, view);
        }




//


        return view;
    }
    void myMethod(String fname, String[][] comp, View view) {
        TableLayout tl = (TableLayout) view.findViewById(R.id.table_n1);
        tittle.setText(fname);
        String num2 = String.valueOf(comp.length);
        int num3 = Integer.parseInt(num2);
        String[] compname = new String[num3];
        String[] compcolor = new String[num3];
        for (int i = 0; i < num3; i++) {
            compname[i] = comp[i][0];
            compcolor[i] = comp[i][1];
        }
        for (int i = 0; i < num3; i++) {
            // Make TR
            TableRow tr = new TableRow(getActivity());
            TableLayout.LayoutParams tableRowParams =
                    new TableLayout.LayoutParams
                            (TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
            tableRowParams.setMargins(0, 0, 0, 10);
            tr.setId(2142 + i);
            //tr.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            Typeface face = Typeface.createFromAsset(getActivity().getAssets(),
                    "fonts/merri.ttf");
            // Make TV to hold the details
            TextView tv = new TextView(getActivity());
            tv.setText(compname[i]);
            tv.setPadding(10, 10, 10, 10);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//                tv.setLayoutParams(tableRowParams);
            tv.setTextSize(14);
//                tv.setBackground(ContextCompat.getDrawable(getContext(), bg_blue));
            /**Setting properties according to color */
            if (compcolor[i] == "White") {
                tv.setBackgroundColor(rgb(255, 255,255));
            } else if (compcolor[i] == "Red") {
                tv.setBackgroundColor(rgb(255, 82, 82));
                tv.setTextColor(rgb(255, 255, 255));
            } else if (compcolor[i] == "Yellow") {
                tv.setBackgroundColor(rgb(233, 233, 12));
                tv.setTextColor(rgb(0,0,0));
            } else if (compcolor[i] == "Green") {
                tv.setBackgroundColor(rgb(122, 245, 167));
                tv.setTextColor(rgb(255, 255, 255));
            } else if (compcolor[i] == "Blue") {
                tv.setBackgroundColor(rgb(122, 130, 245));
                tv.setTextColor(rgb(255, 255, 255));
            } else if (compcolor[i] == "Black") {
                tv.setBackgroundColor(rgb(0, 0, 0));
                tv.setTextColor(rgb(255, 255, 255));
            } else if (compcolor[i] == "Brown") {
                tv.setBackgroundColor(rgb(219, 106, 57));
                tv.setTextColor(rgb(255, 255, 255));
            } else if (compcolor[i] == "Orange") {
                tv.setBackgroundColor(rgb(255, 153, 51));
                tv.setTextColor(rgb(255, 255, 255));
            } else if (compcolor[i] == "Pink") {
                tv.setBackgroundColor(rgb(204, 0, 204));
                tv.setTextColor(rgb(255, 255, 255));
            }
            tv.setTypeface(face);
            tr.addView(tv);

            // Make TV to hold the detailvals

            tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
    }
}
}