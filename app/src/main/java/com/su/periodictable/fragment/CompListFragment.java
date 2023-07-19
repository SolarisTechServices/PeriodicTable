package com.su.periodictable.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.su.periodictable.R;
import com.su.periodictable.trend.Trenddata;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CompListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompListFragment extends Fragment implements View.OnClickListener {

    Button but_halides,but_sulphides,but_oxides,but_ferrocynide,but_chromates,
            but_sulphatesandsulphites,but_hydroxides,but_cynides,but_chromiumn,
            but_nickel,but_silver,but_miscellaneous;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CompListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CompListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CompListFragment newInstance(String param1, String param2) {
        CompListFragment fragment = new CompListFragment();
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
        View view =  inflater.inflate(R.layout.fragment_comp_list, container, false);

        but_halides = view.findViewById(R.id.comp_list_halides);
        but_halides.setOnClickListener(this);
        but_sulphides = view.findViewById(R.id.comp_list_sulphides);
        but_sulphides.setOnClickListener(this);
        but_oxides = view.findViewById(R.id.comp_list_oxides);
        but_oxides.setOnClickListener(this);
        but_ferrocynide = view.findViewById(R.id.comp_list_ferrocynide);
        but_ferrocynide.setOnClickListener(this);
        but_chromates = view.findViewById(R.id.comp_list_chromates);
        but_chromates.setOnClickListener(this);
        but_sulphatesandsulphites = view.findViewById(R.id.comp_list_sulphatesandsulphites);
        but_sulphatesandsulphites.setOnClickListener(this);
        but_hydroxides = view.findViewById(R.id.comp_list_hydroxides);
        but_hydroxides.setOnClickListener(this);
        but_cynides = view.findViewById(R.id.comp_list_cynides);
        but_cynides.setOnClickListener(this);
        but_chromiumn = view.findViewById(R.id.comp_list_chromium);
        but_chromiumn.setOnClickListener(this);
        but_nickel = view.findViewById(R.id.comp_list_nickel);
        but_nickel.setOnClickListener(this);;
        but_silver = view.findViewById(R.id.comp_list_silver);
        but_silver.setOnClickListener(this);
        but_miscellaneous = view.findViewById(R.id.comp_list_miscellaneous);
        but_miscellaneous.setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.comp_list_halides:
                Trenddata.compvar = 1;
                break;
            case R.id.comp_list_sulphides:
                Trenddata.compvar = 2;
                break;
            case R.id.comp_list_oxides:
                Trenddata.compvar = 3;
                break;
            case R.id.comp_list_ferrocynide:
                Trenddata.compvar = 4;
                break;
            case R.id.comp_list_chromates:
                Trenddata.compvar = 5;
                break;
            case R.id.comp_list_sulphatesandsulphites:
                Trenddata.compvar = 6;
                break;
            case R.id.comp_list_hydroxides:
                Trenddata.compvar = 7;
                break;
            case R.id.comp_list_cynides:
                Trenddata.compvar = 8;
                break;
            case R.id.comp_list_chromium:
                Trenddata.compvar = 9;
                break;
            case R.id.comp_list_nickel:
                Trenddata.compvar = 10;
                break;
            case R.id.comp_list_silver:
                Trenddata.compvar = 11;
                break;
            case R.id.comp_list_miscellaneous:
                Trenddata.compvar = 12;
                break;
            default :
                Toast.makeText(getActivity(), "Invalid input", Toast.LENGTH_SHORT).show();
                break;
        }
        Fragment fragment3 = new CompColorFragment();
        androidx.fragment.app.FragmentManager fm3 = getActivity().getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction transaction3 = fm3.beginTransaction();
        transaction3.addToBackStack(null);
        transaction3.replace(R.id.fragment_container, fragment3);

        transaction3.commit();
    }
}