package co.bumomo.timetable;

import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import co.bumomo.timetable.friday.FridayFragment;
import co.bumomo.timetable.monday.MondayFragment;
import co.bumomo.timetable.thursday.ThursdayFragment;
import co.bumomo.timetable.tuesday.TuesdayFragment;
import co.bumomo.timetable.wednesday.WednesdayFragment;


public class MainActivity extends AppCompatActivity {

    View menu;
    View mondayMenu;
    View tuesdayMenu;
    View wednesdayMenu;
    View thursdayMenu;
    View fridayMenu;
    boolean isVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = findViewById(R.id.cv);
        mondayMenu = findViewById(R.id.cl1);
        tuesdayMenu = findViewById(R.id.cl2);
        wednesdayMenu = findViewById(R.id.cl3);
        thursdayMenu = findViewById(R.id.cl4);
        fridayMenu = findViewById(R.id.cl5);
        mondayMenu.setOnClickListener(menuListener);
        tuesdayMenu.setOnClickListener(menuListener);
        wednesdayMenu.setOnClickListener(menuListener);
        thursdayMenu.setOnClickListener(menuListener);
        fridayMenu.setOnClickListener(menuListener);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    public void onSlideViewButtonClick(View view) {
        if (isVisible == false) {
            menu.setVisibility(View.VISIBLE);
        } else {
            menu.setVisibility(View.INVISIBLE);
        }
        isVisible = !isVisible;
    }

    void displaySchedule(int id) {
        Fragment fragment = null;
        if (id == R.id.cl1) {
            menu.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            fragment = new MondayFragment();
        } else if (id == R.id.cl2) {
            menu.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            fragment = new TuesdayFragment();
        } else if (id == R.id.cl3) {
            menu.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            fragment = new WednesdayFragment();
        } else if (id == R.id.cl4) {
            menu.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            fragment = new ThursdayFragment();
        } else if (id == R.id.cl5) {
            menu.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            fragment = new FridayFragment();
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    private View.OnClickListener menuListener = new View.OnClickListener() {
        public void onClick(View v) {
            displaySchedule(v.getId());
        }
    };
}
