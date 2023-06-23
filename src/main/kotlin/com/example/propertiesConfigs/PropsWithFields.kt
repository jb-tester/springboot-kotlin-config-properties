package org.example

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("app.second.properties")
class PropsWithFields {
    /**
     * app.third.properties.strProp prop doc.
     */
    var strProp: String? = "default"
    /**
     * app.third.properties.boolProp prop doc.
     */
    var boolProp: Boolean = true



}