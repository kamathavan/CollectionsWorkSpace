package com.practices.collections

fun main() {
    // set contains the specific
    setFunction()

    // point to remember
    //-------------------------------------
    // - It is store unique element of the object
    // - it stored value based on the hashcode and store value in the collections
    // - it will allow the null object value
    // - it doest not maintain the insertion order
    // - it is not synchronized by default
    //
}

private fun setFunction() {
    val mutableHashSetCollection = mutableSetOf("as", "as", "fg", "fg", "hello", "asd", "hello hockJs")
    println("Hash set collection value -------->$mutableHashSetCollection")

    val hashSetCollections = hashSetOf<Int>(5, 5, 2, 3, 4)
    println("Mutable Hash Set Collection ----->$hashSetCollections")

    val linkedHashSet = linkedSetOf<String?>("Madhavan", null, null, "Kaliyaperumal", "Alex")
    println("Linked Hash set -->$linkedHashSet")

    val linkedHashSet1 = linkedSetOf<String?>("Madhavan", "Kaliyaperumal", "Alex", null)
    println("Linked Hash set with null value -->$linkedHashSet1")

    // iteration process
    println()
    for (item in linkedHashSet1) {
        println("Iterating element-> $item")
    }

    println()
    linkedHashSet1.forEach { name ->
        println("lambda iterating function-->$name")
    }

    println()
    linkedHashSet.iterator().forEachRemaining { name ->
        println("lambda for each remaining function-->$name")
    }


    // HashSet
    // LinkedHashSet
    // mutableHashSetOf
    // SetOf
}
