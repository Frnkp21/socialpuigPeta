package com.example.socialpuig;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.socialpuig.databinding.FragmentOnlyBookBinding;
import com.example.socialpuig.databinding.FragmentUsernameBinding;
import com.google.firebase.auth.FirebaseAuth;

public class UsernameFragment extends Fragment {
    private FragmentUsernameBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentUsernameBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener el NavController
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        // Configurar OnClickListener para el botón
        ImageButton nibutohomeButton = view.findViewById(R.id.nibupetToHome);
        nibutohomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.homeAllFragment);
            }
        });

        ImageButton addButton = view.findViewById(R.id.agregar);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.addUsernameFragment);
            }
        });
    }
}

