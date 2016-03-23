package Helpers;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

/**
 * Created by Jason on 3/23/2016.
 */
public class URLLauncher
{
    public static void LaunchURLIntent(Fragment fragment, String url)
    {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        fragment.startActivity(intent);
    }
}
