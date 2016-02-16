package net.wagner_flo.dualmicdisable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;

public class BootReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
         if(!intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))
             return;
      
        Log.i("DualMicDisable", "BOOT_COMPLETED broadcast received");
        disableDuaMic(context);
    }
    
    public static void disableDuaMic(Context context) {
        Log.i("DualMicDisable", "Disabling dual mic feature");
        AudioManager am = (AudioManager)context.getSystemService(
                context.AUDIO_SERVICE);
        am.setParameters("fluence=none");
    }
}
