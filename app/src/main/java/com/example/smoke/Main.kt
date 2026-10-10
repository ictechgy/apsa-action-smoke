package com.example.smoke

import android.app.PendingIntent
import android.content.Intent
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class Client : WebViewClient() {
    override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: android.net.http.SslError) {
        handler.proceed()
    }

    fun alarm(context: android.content.Context) {
        val implicit = Intent("com.example.smoke.ALARM")
        PendingIntent.getBroadcast(context, 0, implicit, PendingIntent.FLAG_UPDATE_CURRENT)
    }
}
