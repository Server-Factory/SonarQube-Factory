package net.milosvasic.factory.mail.application

import net.milosvasic.factory.log
import net.milosvasic.factory.proxy.caching.application.BuildInfo

object OSInit : Runnable {

    override fun run() = log.v("Starting: ${BuildInfo.versionName}, ${BuildInfo.version}")
}