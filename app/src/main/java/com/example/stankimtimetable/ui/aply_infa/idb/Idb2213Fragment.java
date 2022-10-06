package com.example.stankimtimetable.ui.aply_infa.idb;

import static com.example.stankimtimetable.util.UtilFragment.changeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.stankimtimetable.R;
import com.example.stankimtimetable.databinding.FragmentIdb2213Binding;
import com.example.stankimtimetable.ui.aply_infa.ApplyInfaFragment;
import com.example.stankimtimetable.ui.timetable.idb2213.Cht2213;
import com.example.stankimtimetable.ui.timetable.idb2213.Pn2213;
import com.example.stankimtimetable.ui.timetable.idb2213.Pt2213;
import com.example.stankimtimetable.ui.timetable.idb2213.Sb2213;
import com.example.stankimtimetable.ui.timetable.idb2213.Sr2213;
import com.example.stankimtimetable.ui.timetable.idb2213.Vt2213;


public class Idb2213Fragment extends Fragment {
    FragmentIdb2213Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIdb2213Binding.inflate(inflater, container, false);

        binding.pn2213.setOnClickListener(view -> {
            changeFragment(getActivity(),
                    new Pn2213(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        binding.vt2213.setOnClickListener(view -> {
            changeFragment(getActivity(),
                    new Vt2213(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        binding.sr2213.setOnClickListener(view -> {
            changeFragment(getActivity(),
                    new Sr2213(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        binding.cht2213.setOnClickListener(view -> {
            changeFragment(getActivity(),
                    new Cht2213(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        binding.pt2213.setOnClickListener(view -> {
            changeFragment(getActivity(),
                    new Pt2213(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        binding.sb2213.setOnClickListener(view -> {
            changeFragment(getActivity(),
                    new Sb2213(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        return binding.getRoot();
    }
}