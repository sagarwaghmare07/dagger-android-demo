package com.sagarwaghmare.mydaggerapplication.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sagarwaghmare.mydaggerapplication.R;

public abstract class BaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView textView = view.findViewById(R.id.fragment_text);
        textView.setText("Hello from " + getFragmentTitle());
        return view;
    }

    public String getFragmentTitle() {
        return this.getClass().getSimpleName();
    }
}
