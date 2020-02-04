package things.simple.brosco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import things.simple.brosco.adapter.CoffeeGoAdapter;

public class CoffeeGoActivity extends AppCompatActivity
        implements ViewPager.OnPageChangeListener, BottomNavigationView.OnNavigationItemSelectedListener {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_go);

        createView();
        CoffeeGoAdapter adapter = new CoffeeGoAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter); // устанавливаем адаптер
        viewPager.setCurrentItem(0); // выводим первый экран
    }

    private void createView() {
        viewPager = findViewById(R.id.viewpager);
        viewPager.setOnPageChangeListener(this);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                bottomNavigationView.setSelectedItemId(R.id.action_one);
                break;
            case 1:
                bottomNavigationView.setSelectedItemId(R.id.action_two);
                break;
            case 2:
                bottomNavigationView.setSelectedItemId(R.id.action_three);
                break;
            case 3:
                bottomNavigationView.setSelectedItemId(R.id.action_four);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.action_one:
                viewPager.setCurrentItem(0);
                break;
            case R.id.action_two:
                viewPager.setCurrentItem(1);
                break;
            case R.id.action_three:
                viewPager.setCurrentItem(2);
                break;
            case R.id.action_four:
                viewPager.setCurrentItem(3);
                break;
        }
        return true;
    }
}
