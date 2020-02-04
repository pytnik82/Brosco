package things.simple.brosco.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import things.simple.brosco.CoffeeGoActivity;
import things.simple.brosco.fragment.FavoritesFragment;
import things.simple.brosco.fragment.MapsFragment;
import things.simple.brosco.fragment.MyOrdersFragment;
import things.simple.brosco.fragment.NewsFragment;

public class CoffeeGoAdapter extends FragmentStatePagerAdapter {

    public CoffeeGoAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NewsFragment();
            case 1:
                return new MapsFragment();
            case 2:
                return new FavoritesFragment();
            case 3:
                return new MyOrdersFragment();

            default:
                return new NewsFragment();
        }
    }
}
