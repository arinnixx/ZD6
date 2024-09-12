fun main() {
    println("Введите два числа: ")
    var a= readln().toInt()
    var b= readln().toInt()
    if ((a*10+b)%2>0)
        print("Создано нечетное число: "+(a*10+b))
    else
        if ((b*10+a)%2>0)
            print("Создано нечетное число: "+(b*10+a))
    else
            print("Невозможно создать нечетное число")

}