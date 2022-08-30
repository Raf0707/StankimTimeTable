package com.example.stankimtimetable.ui.aply_infa;

import static com.example.stankimtimetable.util.UtilFragment.changeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.stankimtimetable.R;
import com.example.stankimtimetable.databinding.FragmentApplyInfaBinding;
import com.example.stankimtimetable.ui.aply_infa.about_dir.MainAIFragment;
import com.example.stankimtimetable.ui.aply_infa.idb.Idb2210Fragment;
import com.example.stankimtimetable.ui.aply_infa.idb.Idb2211Fragment;
import com.example.stankimtimetable.ui.aply_infa.idb.Idb2212Fragment;
import com.example.stankimtimetable.ui.aply_infa.idb.Idb2213Fragment;


public class ApplyInfaFragment extends Fragment {

    private FragmentApplyInfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentApplyInfaBinding.inflate(inflater, container, false);

        binding.applyInfaFirstBanner.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new MainAIFragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);
        });

        binding.idb2210.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2210Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        binding.idb2211.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2211Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        binding.idb2212.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2212Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        binding.idb2213.setOnClickListener(view -> {
            changeFragment(requireActivity(),
                    new Idb2213Fragment(),
                    R.id.kontainerFragment,
                    savedInstanceState);

        });

        return binding.getRoot();
    }
}