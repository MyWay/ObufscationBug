package net.fr0g.obfuscationbug;

import android.app.Fragment;
import android.app.FragmentManager;

import com.commonsware.cwac.pager.ArrayPagerAdapter;
import com.commonsware.cwac.pager.PageDescriptor;

import java.util.List;

/**
 * Created by anyway on 16/09/16.
 */

public class MyPagerAdapter extends ArrayPagerAdapter {
    public MyPagerAdapter(FragmentManager fragmentManager, List list) {
        super(fragmentManager, list);
    }

    @Override
    protected Fragment createFragment(PageDescriptor pageDescriptor) {
        return null;
    }
}
