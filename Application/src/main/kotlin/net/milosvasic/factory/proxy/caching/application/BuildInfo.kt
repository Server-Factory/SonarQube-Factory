package net.milosvasic.factory.proxy.caching.application

import net.milosvasic.factory.application.BuildInformation

object BuildInfo : BuildInformation {

    override val version = "1.0.0 Alpha 2"
    override val versionCode = 2
    override val versionName = "Caching Proxy Factory"
    override val productName = "Caching-Proxy-Factory"

    override fun printName() = "$versionName $version"
}
