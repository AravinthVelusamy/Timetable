package co.bumomo.timetable.thursday;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.bumomo.timetable.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThursdayFragment extends Fragment {


    public ThursdayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thursday, container, false);
    }

}
