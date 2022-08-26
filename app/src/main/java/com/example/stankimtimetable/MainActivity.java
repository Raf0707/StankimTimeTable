package com.example.stankimtimetable;

import static com.example.stankimtimetable.util.UtilFragment.changeFragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stankimtimetable.databinding.ActivityMainBinding;
import com.example.stankimtimetable.ui.app_about.AppAboutFragment;
import com.example.stankimtimetable.ui.aply_infa.ApplyInfaFragment;
import com.example.stankimtimetable.ui.software_eng.SoftwareEngFragment;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {

                case R.id.applied_infa:
                    changeFragment(this,
                            new ApplyInfaFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

                case R.id.software_engineering:
                    changeFragment(this,
                            new SoftwareEngFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

                case R.id.about_app:
                    changeFragment(this,
                            new AppAboutFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

            }

            return true;


        });
    }

}