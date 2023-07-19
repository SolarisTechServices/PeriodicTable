package com.su.periodictable.fragment;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.su.periodictable.R;
import com.su.periodictable.trend.Trenddata;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PeriodicTrendFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PeriodicTrendFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PeriodicTrendFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PeriodicTrendFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PeriodicTrendFragment newInstance(String param1, String param2) {
        PeriodicTrendFragment fragment = new PeriodicTrendFragment();
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
        View view= inflater.inflate(R.layout.fragment_periodic_trend, container, false);

        /** setting button ids for group size, period, ie group, priod **/
        Button size_grp = (Button) view.findViewById(R.id.size_grp);
        size_grp.setOnClickListener(this);
        Button size_prd = (Button) view.findViewById(R.id.size_prd);
        size_prd.setOnClickListener(this);
        Button ie_grp = (Button) view.findViewById(R.id.ie_grp);
        ie_grp.setOnClickListener(this);
        Button ie_prd = (Button) view.findViewById(R.id.ie_prd);
        ie_prd.setOnClickListener(this);
        Button mp_grp = (Button) view.findViewById(R.id.mp_grp);
        mp_grp.setOnClickListener(this);
        Button mp_prd = (Button) view.findViewById(R.id.mp_prd);
        mp_prd.setOnClickListener(this);
        Button bp_grp = (Button) view.findViewById(R.id.bp_grp);
        bp_grp.setOnClickListener(this);
        Button bp_prd = (Button) view.findViewById(R.id.bp_prd);
        bp_prd.setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View view) {
        int size=0;
        switch (view.getId()) {
            case R.id.size_grp:
                /** trendx being 1=size, 2=inonization enthalpy
                 * trendy being 1=group, 2= period
                 */
                Trenddata.trendx=1;
                Trenddata.trendy=1;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.size_prd:
                Trenddata.trendx=1;
                Trenddata.trendy=2;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.ie_grp:
                Trenddata.trendx=2;
                Trenddata.trendy=1;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.ie_prd:
                Trenddata.trendx=2;
                Trenddata.trendy=2;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.mp_grp:
                Trenddata.trendx=3;
                Trenddata.trendy=1;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.mp_prd:
                Trenddata.trendx=3;
                Trenddata.trendy=2;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.bp_grp:
                Trenddata.trendx=4;
                Trenddata.trendy=1;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            case R.id.bp_prd:
                Trenddata.trendx=4;
                Trenddata.trendy=2;
                Toast.makeText(getContext(), "Trendx"+Trenddata.trendx, Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Trendy"+Trenddata.trendy, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        GraphlistFragment nextFrag = new GraphlistFragment();
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;

        fragmentManager = ((AppCompatActivity) getContext()).getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, nextFrag).addToBackStack(null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}