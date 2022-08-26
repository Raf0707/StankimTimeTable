package com.example.stankimtimetable.ui.software_eng;

import static com.example.stankimtimetable.util.UtilFragment.changeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.stankimtimetable.R;
import com.example.stankimtimetable.databinding.FragmentSoftwareEngBinding;
import com.example.stankimtimetable.ui.software_eng.idb.Idb2214Fragment;
import com.example.stankimtimetable.ui.software_eng.idb.Idb2215Fragment;
import com.example.stankimtimetable.ui.software_eng.idb.Idb2216Fragment;


public class SoftwareEngFragment extends Fragment {

    private FragmentSoftwareEngBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSoftwareEngBinding.inflate(inflater, container, false);

        binding.idb2214.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2214Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        binding.idb2215.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2215Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        binding.idb2216.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2216Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        return binding.getRoot();
    }
}