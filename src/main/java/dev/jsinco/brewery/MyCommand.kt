package dev.jsinco.brewery

import com.dre.brewery.BreweryPlugin
import com.dre.brewery.api.addons.AddonCommand
import com.dre.brewery.configuration.files.Lang
import org.bukkit.command.CommandSender

class MyCommand : AddonCommand {
    override fun execute(breweryPlugin: BreweryPlugin, lang: Lang, sender: CommandSender, label: String, args: Array<String>) {
        sender.sendMessage("Hello, world!")
    }

    override fun tabComplete(breweryPlugin: BreweryPlugin, sender: CommandSender, label: String, args: Array<String>): List<String>? {
        return null
    }

    override fun permission(): String {
        return "brewery.command.mycommand"
    }

    override fun playerOnly(): Boolean {
        return false
    }
}
