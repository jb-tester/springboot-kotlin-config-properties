package com.example.propertiesConfigs

import com.example.data.SomeBean
import org.example.Enum1
import org.example.Enum2
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty

@ConfigurationProperties("constructor.props")
class PropsWithConstructorBinding(
    /**
     *  constructor.props.test documentation.
     */
    val test: Int,
    /**
     *  constructor.props.strProp documentation.
     */
    val strProp: String,
    /**
     *  constructor.props.beansList documentation.
     */
    val beansList: List<SomeBean>,
    /**
     *  constructor.props.enumProp documentation.
     */
    val enumProp: Enum2,
    /**
     *  constructor.props.enumsMap documentation.
     */
    val enumsMap: Map<Enum1,Enum2>,
    /**
     *  constructor.props.someBean documentation.
     */
  //  @NestedConfigurationProperty
    val someBean: SomeBean
)
