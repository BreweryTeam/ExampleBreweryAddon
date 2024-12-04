package dev.jsinco.brewery

import com.dre.brewery.api.addons.AddonConfigFile


class MyConfig : AddonConfigFile() {
    // OR You can use com.dre.brewery.depend.okaeri.configs.annotation.Exclude annotation
    @Transient
    private val someFieldWhichShouldBeIgnored = true


    @JvmField // Instructs the Kotlin compiler not to generate getters/setters for this property and expose it as a field.
    val myString = "Hello, World!"
}
