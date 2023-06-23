package com.example.springbootkotlinconfigproperties

import com.example.propertiesConfigs.PropsWithConstructorBinding
import com.example.propertiesConfigs.PropsWithFields
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.propertiesConfigs")
class SpringbootKotlinConfigPropertiesApplication(
    private val propsWithConstructorBinding: PropsWithConstructorBinding,
    private val propsWithFields: PropsWithFields,
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("== constructorBinding: primary constructor ==")
        println("test: "+propsWithConstructorBinding.test)
        println("strProp: "+propsWithConstructorBinding.strProp)
        println("beansList:")
        for (someBean in propsWithConstructorBinding.beansList) {
            println(someBean.strBeanProp)
            println(someBean.strSetBeanProp)
            println("--")
        }
        println("enumsMap:")
        println(propsWithConstructorBinding.enumsMap)
        println("someBean:")
        println(propsWithConstructorBinding.someBean.strBeanProp+" "+propsWithConstructorBinding.someBean.strSetBeanProp)
        println("== with fields:==")
        println("boolProp: "+propsWithFields.boolProp)
        println("strProp: "+propsWithFields.strProp)
        println(propsWithFields.anotherBean.strProp + " " + propsWithFields.anotherBean.boolProp)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinConfigPropertiesApplication>(*args)
}
