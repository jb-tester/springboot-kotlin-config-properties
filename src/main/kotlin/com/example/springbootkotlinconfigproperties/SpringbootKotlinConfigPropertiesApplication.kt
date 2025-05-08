package com.example.springbootkotlinconfigproperties

import com.example.propertiesConfigs.PropsWithConstructorBinding
import com.example.propertiesConfigs.PropsWithVarFields
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.propertiesConfigs")
class SpringbootKotlinConfigPropertiesApplication(
    private val propsWithConstructorBinding: PropsWithConstructorBinding,
    private val propsWithVarFields: PropsWithVarFields
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("== constructorBinding: primary constructor ==")
        println("intProp: "+propsWithConstructorBinding.intProp)
        println("strProp: "+propsWithConstructorBinding.strProp)
        println("enumProp: "+propsWithConstructorBinding.enumProp)
        println("beansList:")
        for (someBean in propsWithConstructorBinding.beansList) {
            println(" - " + someBean.strBeanProp + ", " + someBean.strSetBeanProp)
        }
        println("enumsMap:")
        println(propsWithConstructorBinding.enumsMap)
        println("someBean:")
        println(propsWithConstructorBinding.someBean.strBeanProp+", "+propsWithConstructorBinding.someBean.strSetBeanProp)
        println("== with fields:==")
        println("boolProp: "+propsWithVarFields.boolProp)
        println("strProp: "+propsWithVarFields.strProp)
        println("anotherBean: " + propsWithVarFields.anotherBean.strProp + ", " + propsWithVarFields.anotherBean.boolProp)

    }
}

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinConfigPropertiesApplication>(*args)
}
