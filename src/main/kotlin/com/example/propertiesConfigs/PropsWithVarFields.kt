package com.example.propertiesConfigs

import com.example.data.AnotherBean
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty

@ConfigurationProperties("vars.props")
class PropsWithVarFields {
    /**
     * vars.props.strProp prop doc.
     */
    var strProp: String? = "default"
    /**
     * vars.props.boolProp prop doc.
     */
    var boolProp: Boolean = false

   @NestedConfigurationProperty
    lateinit var anotherBean: AnotherBean
}