package com.builttoroam.devicecalendar

import android.database.ContentObserver
import android.net.Uri
import android.os.Handler
import android.util.Log
import io.flutter.plugin.common.MethodChannel

class CalendarObserver(handler: Handler?, channel: MethodChannel) : ContentObserver(handler) {
    private val channel: MethodChannel = channel

    override fun onChange(selfChange: Boolean, uri: Uri?) {
        super.onChange(selfChange, uri)
        Log.d(DEBUG_LOG_TAG, "Calendar data changed at URI: $uri")

        // Trigger event or method channel call to handle the change
        channel.invokeMethod("onCalendarChanged", null)
    }
}