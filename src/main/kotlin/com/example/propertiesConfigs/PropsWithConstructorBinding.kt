package com.example.propertiesConfigs

import com.example.data.SomeBean
import org.example.Enum1
import org.example.Enum2
import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("app.first.properties")
class PropsWithDefaultConstructor(
    /**
     *  app.properties.test documentation.
     */
    val test: Int,
    /**
     *  app.properties.strProp documentation.
     */
    val strProp: String,
    /**
     *  app.properties.beansList documentation.
     */
    val beansList: List<SomeBean>,
    /**
     *  app.properties.enumProp documentation.
     */
    val enumProp: Enum2,
    /**
     *  app.properties.enumsMap documentation.
     */
    val enumsMap: Map<Enum1,Enum2>,
    /**
     *  app.properties.someBean documentation.
     */
    val someBean: SomeBean
)
