package com.example.propertiesConfigs

import com.example.data.AnotherBean
import com.example.data.SomeBean
import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("vars.props")
class PropsWithFields {
    /**
     * vars.props.strProp prop doc.
     */
    var strProp: String? = "default"
    /**
     * vars.props.boolProp prop doc.
     */
    var boolProp: Boolean = false

    lateinit var anotherBean: AnotherBean
}