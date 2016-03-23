package com.jakylcove;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import Helpers.URLLauncher;

/**
 * Created by Jason on 3/22/2016.
 */
public class pragmaticProgrammer extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.pragmaticprogrammer, container, false);

        ImageView button = (ImageView)view.findViewById(R.id.btnBuy);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                URLLauncher.LaunchURLIntent(pragmaticProgrammer.this, getResources().getString(R.string.PragmaticProgrammerURL));
            }
        });
        ImageView gButton = (ImageView)view.findViewById(R.id.btnBuyGoogle);
        gButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                URLLauncher.LaunchURLIntent(pragmaticProgrammer.this, getResources().getString(R.string.PragmaticProgrammerGURL));
            }
        });
        return view;
    }
}
