package com.jakylcove;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager, this));
    }
}

class MyAdapter extends FragmentPagerAdapter
{
    private Context context;
    public MyAdapter(FragmentManager fm, Context c) {
        super(fm);
        context = c;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0)
        {
            return new pragmaticProgrammer();
        }
        else if (i == 1)
        {
            return new essentialScrum();
        }
        else if (i == 2)
        {
            return new kanban();
        }
        else if (i == 3)
        {
            return new mythicalman();
        }
        else if (i == 4)
        {
            return new refactoring();
        }
        else if (i == 5)
        {
            return new sprint();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int i)
    {
        if (i == 0)
        {
            return "Pragmatic Programmer";
        }
        else if (i == 1)
        {
            return context.getResources().getString(R.string.EssentialScrumShortTitle);
        }
        else if (i == 2)
        {
            return context.getResources().getString(R.string.KanBanShortTitle);
        }
        else if (i == 3)
        {
            return context.getResources().getString(R.string.MythicalManShortTitle);
        }
        else if (i == 4)
        {
            return context.getResources().getString(R.string.RefactoringShortTitle);
        }
        else if (i == 5)
        {
            return context.getResources().getString(R.string.SprintShortTitle);
        }
        return null;
    }
}