package dev.jsinco.brewery

import com.dre.brewery.api.addons.AddonInfo
import com.dre.brewery.api.addons.BreweryAddon

@AddonInfo(name = "MyAddon", version = "1.0", author = "Jonah")
class MyAddon : BreweryAddon() {

    override fun onAddonPreEnable() {
        if (isFolia) { // isPaper() is also available
            addonLogger.info("This addon is running on Folia.")
        } else {
            addonLogger.info("This addon is not running on Folia.")
        }
    }

    override fun onAddonEnable() {
        registerListener(MyListeners())

        val config = addonConfigManager.getConfig(MyConfig::class.java)
        addonLogger.info(config.myString)

        registerCommand("mycommand", MyCommand())
    }

    override fun onAddonDisable() {
        // Code which is run when the addon is disabled
    }

    override fun onBreweryReload() {
        // Code which is run when the `/breweryx reload` command is executed
        val config = addonConfigManager.getConfig(MyConfig::class.java)
        addonLogger.info(config.myString)
    }
}