package com.su.periodictable.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.su.periodictable.R;
import com.su.periodictable.trend.Trenddata;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrendFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrendFragment extends Fragment implements View.OnClickListener {

    TextView bar_tittle;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public TrendFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrendFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TrendFragment newInstance(String param1, String param2) {
        TrendFragment fragment = new TrendFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public void fragmentopener() {

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
        View view = inflater.inflate(R.layout.fragment_trend, container, false);



        /** setting button ids for group size, period, ie group, priod **/
        Button but_pt = (Button) view.findViewById(R.id.trend_pt);
        but_pt.setOnClickListener(this);
        Button but_ic = (Button) view.findViewById(R.id.trend_ic);
        but_ic.setOnClickListener(this);
        Button but_ot = (Button) view.findViewById(R.id.trend_ot);
        but_ot.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View view) {

        int size=0;
        switch (view.getId()) {
            case R.id.trend_pt:
                /** trendx being 1=size, 2=inonization enthalpy
                 * trendy being 1=group, 2= period
                 */
                Fragment fragment3 = new PeriodicTrendFragment();
                androidx.fragment.app.FragmentManager fm3 = getActivity().getSupportFragmentManager();
                androidx.fragment.app.FragmentTransaction transaction3 = fm3.beginTransaction();
                transaction3.replace(R.id.fragment_container, fragment3);
                transaction3.addToBackStack(null);
                transaction3.commit();
                break;
            case R.id.trend_ic:
                Fragment fragment4 = new CompListFragment();
                androidx.fragment.app.FragmentManager fm4 = getActivity().getSupportFragmentManager();
                androidx.fragment.app.FragmentTransaction transaction4 = fm4.beginTransaction();
                transaction4.replace(R.id.fragment_container, fragment4);
                transaction4.addToBackStack(null);
                transaction4.commit();
                break;
            case R.id.trend_ot:
                Trenddata.trendx=2;
                Trenddata.trendy=1;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}