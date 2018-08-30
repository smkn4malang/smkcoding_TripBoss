package com.dycode.edu.tripboss;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new ChartFragment();
        }else if (position == 2) {
            return new AccountFragment();
        }
        throw new IllegalStateException("Position not valid");
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 || position % 3 == 0) {
            return "Home";
        } else if (position % 3 == 1) {
            return "Chart";
        } else if (position % 3 == 2) {
            return "Account";
        }
        throw new IllegalStateException("Position not valid");
    }
}
