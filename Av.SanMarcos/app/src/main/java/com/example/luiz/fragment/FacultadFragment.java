package com.example.luiz.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import com.example.luiz.avsanmarcos.R;

/**
 * Created by luiz on 5/12/2016.
 */
public class FacultadFragment extends Fragment implements View.OnClickListener{
    ViewFlipper viewFlipper;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_facultad,container,false);
        viewFlipper = (ViewFlipper)rootView.findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(2000);
    }
}
