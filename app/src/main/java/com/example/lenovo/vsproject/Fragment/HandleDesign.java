package com.example.lenovo.vsproject.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.vsproject.R;

public class HandleDesign extends Fragment {
    public HandleDesign() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.handle_design, container, false);
        return view;

    }
}