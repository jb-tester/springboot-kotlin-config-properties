package com.example.data

data class SomeBean(
    /**
     * constructor.props.some-bean.str-bean-prop prop doc.
     */
    val strBeanProp: String = "default",
    /**
     * constructor.props.some-bean.str-set-bean-prop prop doc.
     */
    val strSetBeanProp: Set<String>
) {

}
