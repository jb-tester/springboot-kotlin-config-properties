package com.example.propertiesConfigs

import com.example.data.AnotherBean
import org.example.Enum1
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty

@ConfigurationProperties("vars.props")
class PropsWithVarFields {
    /**
     * !!!vars.props.strProp prop doc.
     */
    var strProp: String? = "default"
    /**
     * !!!vars.props.boolProp prop doc.
     */
    var boolProp: Boolean = false
    /**
     * !!!vars.props.enumProp prop doc.
     */
    var enumProp: Enum1 = Enum1.EL11
    /**
     * !!!vars.props.pojoMapProp prop doc.
     */
    var pojoMapProp: Map<String, AnotherBean> = mapOf()

   @NestedConfigurationProperty
    lateinit var anotherBean: AnotherBean
}