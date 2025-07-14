package com.example.propertiesConfigs

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import java.time.Duration

@Component
@Validated
@ConfigurationProperties(prefix = "nested.pojo.props")
class WithNestedClassProperties {

    var thisIsWorking = true

   // @NestedConfigurationProperty
    val pojoOne = NestedPojo() // val or var makes no difference

   // @NestedConfigurationProperty
    var pojoTwo = NestedPojo()

    class NestedPojo {


        var someDuration: Duration = Duration.ofMinutes(1L)


        var someInt: Long = 11L
    }
}