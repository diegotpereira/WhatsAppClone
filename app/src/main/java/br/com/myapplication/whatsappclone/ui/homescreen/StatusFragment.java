package br.com.myapplication.whatsappclone.ui.homescreen;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import br.com.myapplication.whatsappclone.R;


/**
 * Created by vihaan on 21/05/17.
 */

public class StatusFragment extends Fragment {


    public static Fragment newInstance() {

        Bundle args = new Bundle();

        StatusFragment fragment = new StatusFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}