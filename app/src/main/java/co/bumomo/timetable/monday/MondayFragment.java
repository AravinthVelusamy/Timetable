package co.bumomo.timetable.monday;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.bumomo.timetable.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MondayFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MondayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MondayFragment extends Fragment {


    public MondayFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_monday, container, false);
    }

}
