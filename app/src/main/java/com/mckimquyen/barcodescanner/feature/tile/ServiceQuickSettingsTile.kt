package com.mckimquyen.barcodescanner.feature.tile

import android.content.Intent
import android.os.Build
import android.service.quicksettings.TileService
import androidx.annotation.RequiresApi
import com.mckimquyen.barcodescanner.feature.tabs.ActivityBottomTabs

@RequiresApi(api = Build.VERSION_CODES.N)
class ServiceQuickSettingsTile : TileService() {

    override fun onClick() {
        super.onClick()
        val intent = Intent(applicationContext, ActivityBottomTabs::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
        }
        startActivityAndCollapse(intent)
    }
}
