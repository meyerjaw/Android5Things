package com.jakylcove;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import Helpers.URLLauncher;

/**
 * Created by Jason on 3/22/2016.
 */
public class essentialScrum extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.essentialscrum, container, false);

        ImageView button = (ImageView)view.findViewById(R.id.btnBuy);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                URLLauncher.LaunchURLIntent(essentialScrum.this, getResources().getString(R.string.EssentialScrumURL));
            }
        });
        ImageView gButton = (ImageView)view.findViewById(R.id.btnBuyGoogle);
        gButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                URLLauncher.LaunchURLIntent(essentialScrum.this, getResources().getString(R.string.EssentialScrumGURL));
            }
        });
        return view;
    }

}
