//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num1=3;
    val num2=20;
    for(j in num1..num2){
        for(i in 1..10) {
            println(j.toString()+"*"+i+"="+(j*i));
        }
        println();
    }

}