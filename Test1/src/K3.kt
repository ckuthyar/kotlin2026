fun main(){
    val name="Mary";
    val age=20;
    print("$name is $age years old\n");

    val name2: String;
    val age2: Int;
    name2="Mary";
    age2=20;
    print("$name2 is $age2 years old\n");

    val a: Int = 1000
    val b = "log message"
    val c= 3.14
    val d = 100_000_000_000_000
    val e = false
    val f = '\n'

    val list1=listOf(2,4,6,8)
    println(list1)
    val list2: MutableList<Int> = mutableListOf(1,3,5,7)
    println(list2)
    val list2Locked: List<Int> = list2;
    println("List2 cannot be modified now since it has been locked")
    println(list2[0])
    println("${list2[0]}")
    println(list2.first())
    println(list2.last())
    println(list2.count())
    println(3 in list2)
    println(4 in list2)
    list2.add(9)
    println(list2)
    list2.remove(9)
    println(list2)

    val vowels1 = setOf('a','e','i','o','u')
    val vowels2 = mutableSetOf('a','e','i','o','u','a')
    println(vowels1)
    println(vowels2)
    vowels2.remove('a')
    println(vowels2)
    val vowels2Locked:Set<Char> = vowels2
    println(vowels2.count())
    println('a' in vowels2)
    println('e' in vowels2)

    val digits1 = mapOf(1 to "One",2 to "Two",3 to "Three")
    println(digits1)
    val digits2 = mutableMapOf(4 to "Four", 5 to "Five", 6 to "Six")
    println(digits2)
    val digits2Locked: Map<Int,String> =digits2
    println(digits2Locked)
    println(digits2[4])
    println("${digits2[4]}")
    println(digits2[100])
    digits2[7]="Seven"
    digits2[8]="Eight"
    digits2[9]="Nine"
    println(digits2)
    digits2.remove(9)
    println(digits2)
    println(digits2.count())
    println(digits2.contains(8))
    println(digits2.contains(9))
    println(digits2.keys)
    println(digits2.values)
    println(8 in digits2)
    println(8 in digits2.keys)
    println("Eight" in digits2.values)

}