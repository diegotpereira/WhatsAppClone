package br.com.myapplication.whatsappclone.ui.homescreen;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import br.com.myapplication.whatsappclone.R;


/**
 * Created by Diego Pereira on 08/05/20.
 */

public class CallsFragment extends Fragment {

    public static CallsFragment newInstance() {

        Bundle args = new Bundle();

        CallsFragment fragment = new CallsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_calls, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
