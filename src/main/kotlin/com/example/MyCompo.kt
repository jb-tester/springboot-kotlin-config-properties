package com.example

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
class MyCompo {
    @Value("\${foo.bar}")
    var id: String? = null
}