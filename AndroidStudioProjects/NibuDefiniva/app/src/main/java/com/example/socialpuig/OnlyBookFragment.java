package com.example.socialpuig;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OnlyBookFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_only_book, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener una referencia al NavController
        final NavController navController = Navigation.findNavController(view);

        // Configurar el clic del botón homeButon
        view.findViewById(R.id.all3Buton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.homeAllFragment);
            }
        });
        view.findViewById(R.id.moviesButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlyMovieFragment);
            }
        });
        view.findViewById(R.id.seriesButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlySeriesFragment);
            }
        });
    }
}