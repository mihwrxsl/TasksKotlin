import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    checkEvenOdd(10)
    println("Минимальное из трех чисел: ${findMinOfThree(5, 3, 8)}")
    printMultiplicationTable()
    println("Сумма чисел от 1 до 10: ${sumFromOneToN(10)}")
    printFibonacci(10)
    println("Является ли 7 простым числом? ${isPrime(7)}")
    printReverseOrder(5)
    println("Сумма четных чисел от 1 до 10: ${sumEvenNumbers(1, 10)}")
    println("Реверс строки 'Hello': ${reverseString("Hello")}")
    println("Количество цифр в числе 12345: ${countDigits(12345)}")
    println("Факториал числа 5: ${factorial(5)}")
    println("Сумма цифр числа 123: ${sumOfDigits(123)}")
    println("Является ли 'madam' палиндромом? ${isPalindrome("madam")}")
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Максимальное число в массиве: ${findMaxInArray(array)}")
    println("Сумма всех элементов массива: ${sumOfArray(array)}")
    countPositivesNegatives(intArrayOf(1, -2, 3, -4, 5))
    printPrimesInRange(10, 20)
    countVowelsConsonants("Hello World")
    println("Перестановка слов в строке: ${reverseWords("Hello World")}")
    println("Является ли 153 числом Армстронга? ${isArmstrongNumber(153)}")

    try {
        println("Максимум из 5 и 10: ${maxOfTwo(5, 10)}")
        println("10 / 2 = ${divide(10.0, 2.0)}")
        println("Конвертация строки '123' в число: ${convertStringToInt("123")}")
        checkAge(25)
        println("Корень из 16: ${sqrt(16.0)}")
        val array2 = intArrayOf(1, 2, 3, 4, 5)
        checkArrayForZeros(array2)
        println("2 в степени 3: ${power(2.0, 3.0)}")
        println("Обрезка строки 'Hello World' до 5 символов: ${truncateString("Hello World", 5)}")
        println("Индекс элемента 3 в массиве: ${findElementInArray(array, 3)}")
        println("Число 10 в двоичной системе: ${toBinaryString(10)}")
        println("10 делится на 2? ${isDivisible(10, 2)}")
        val list = listOf("A", "B", "C")
        println("Элемент с индексом 1: ${getElementFromList(list, 1)}")
        checkPasswordStrength("StrongPassword123")
        checkDate("12.12.2023")
        println("Конкатенация строк 'Hello' и 'World': ${concatenateStrings("Hello", "World")}")
        println("Остаток от деления 10 на 3: ${remainder(10, 3)}")
        println("0 градусов Цельсия в Фаренгейтах: ${celsiusToFahrenheit(0.0)}")
        checkStringEmpty("Hello")
    } catch (e: Exception) {
        println("Произошла ошибка: ${e.message}")
    }

    val person = Person("Иван", 30, "Мужской")
    person.printInfo()
    person.increaseAge()
    person.printInfo()
    person.changeName("Петр")
    person.printInfo()

    val worker = Worker("Анна", 25, "Женский", 50000.0)
    worker.printInfo()

    val manager = Manager("Олег", 40, "Мужской", 100000.0)
    manager.subordinates.add(worker)
    manager.printInfo()

    val animals: List<Animal> = listOf(Dog(), Cat(), Cow())
    for (animal in animals) {
        animal.makeSound()
    }

    val car = Car()
    car.move()

    val bike = Bike()
    bike.move()

    val library = Library()
    library.addBook(Book("1984", "Джордж Оруэлл", 1949))
    library.addBook(Book("Мастер и Маргарита", "Михаил Булгаков", 1967))
    println("Книги Михаила Булгакова: ${library.findBooksByAuthor("Михаил Булгаков").size}")

    val account = BankAccount("123456789", 1000.0)
    account.deposit(500.0)
    account.withdraw(200.0)
    println("Баланс счета: ${account.getBalance()}")

    val counter1 = Counter()
    val counter2 = Counter()
    println("Количество созданных объектов Counter: ${Counter.getCount()}")

    val circle = Circle(5.0)
    println("Площадь круга: ${circle.getArea()}")

    val rectangle = Rectangle(4.0, 6.0)
    println("Площадь прямоугольника: ${rectangle.getArea()}")

    val fish = Fish()
    fish.move()

    val bird = Bird()
    bird.move()

    val dog = DogMovement()
    dog.move()

    val university = University()
    university.addStudent(Student("Иван", "Группа 1", 4.5))
    university.addStudent(Student("Анна", "Группа 2", 3.8))
    println("Студенты, отсортированные по имени: ${university.sortByName().size}")

    val store = Store()
    store.addProduct(Product("Яблоко", 50.0, 100))
    store.addProduct(Product("Банан", 30.0, 150))
    println("Найденный продукт: ${store.findProductByName("Яблоко")?.name}")

    val creditCard = CreditCard()
    creditCard.pay(1000.0)

    val payPal = PayPal()
    payPal.pay(500.0)

    val uniqueID1 = UniqueID()
    val uniqueID2 = UniqueID()
    println("Уникальные ID: ${uniqueID1.getId()}, ${uniqueID2.getId()}")

    val topLeft = Point(0, 0)
    val bottomRight = Point(10, 10)
    val rectangleShape = RectangleShape(topLeft, bottomRight)
    println("Площадь прямоугольника: ${rectangleShape.getArea()}")

    val complex1 = ComplexNumber(1.0, 2.0)
    val complex2 = ComplexNumber(3.0, 4.0)
    val sum = complex1.add(complex2)
    println("Сумма комплексных чисел: ${sum.real} + ${sum.imaginary}i")

    val matrixData1 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val matrixData2 = arrayOf(intArrayOf(5, 6), intArrayOf(7, 8))
    val matrix1 = Matrix(matrixData1)
    val matrix2 = Matrix(matrixData2)
    val sumMatrix = matrix1.add(matrix2)
    println("Сумма матриц: ${sumMatrix.data.contentDeepToString()}")

    val player = Player("Игрок", 100, Weapon("Меч", 10))
    val enemy = Enemy("Враг", 50)
    player.attack(enemy)

    val customer = Customer("Петр")
    customer.addOrder(Order(1, customer, listOf(Product("Книга", 500.0, 1))))
    customer.showOrderHistory()

    val smartphone = Smartphone("Samsung")
    smartphone.takePhoto()

    val laptop = Laptop("Lenovo")
    laptop.openBrowser()

    val game = TicTacToe()
    game.makeMove(0, 0)
    game.makeMove(1, 1)
    game.makeMove(0, 1)
    game.makeMove(1, 2)
    game.makeMove(0, 2)
    game.printBoard()
    if (game.checkWin()) {
        println("Игрок ${if (game.currentPlayer == 'X') 'O' else 'X'} выиграл!")
    } else if (game.isBoardFull()) {
        println("Ничья!")
    }
}



fun checkEvenOdd(number: Int) {
    if (number % 2 == 0) {
        println("Число $number четное.")
    } else {
        println("Число $number нечетное.")
    }
}

fun findMinOfThree(a: Int, b: Int, c: Int): Int {
    return minOf(a, b, c)
}

fun printMultiplicationTable() {
    for (i in 1..10) {
        println("5 * $i = ${5 * i}")
    }
}

fun sumFromOneToN(n: Int): Int {
    return n * (n + 1) / 2
}

fun printFibonacci(n: Int) {
    var a = 0
    var b = 1
    for (i in 0 until n) {
        print("$a ")
        val temp = a
        a = b
        b += temp
    }
    println()
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}

fun printReverseOrder(n: Int) {
    for (i in n downTo 1) {
        print("$i ")
    }
    println()
}

fun sumEvenNumbers(a: Int, b: Int): Int {
    return (a..b).filter { it % 2 == 0 }.sum()
}

fun reverseString(str: String): String {
    return str.reversed()
}

fun countDigits(number: Int): Int {
    return number.toString().length
}

fun factorial(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Факториал отрицательного числа не определен.")
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun sumOfDigits(number: Int): Int {
    return number.toString().sumOf { it.toString().toInt() }
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun findMaxInArray(array: IntArray): Int {
    return array.maxOrNull() ?: throw NoSuchElementException()
}

fun sumOfArray(array: IntArray): Int {
    return array.sum()
}

fun countPositivesNegatives(array: IntArray) {
    val positive = array.count { it > 0 }
    val negative = array.count { it < 0 }
    println("Положительных: $positive, Отрицательных: $negative")
}

fun printPrimesInRange(a: Int, b: Int) {
    for (i in a..b) {
        if (isPrime(i)) print("$i ")
    }
    println()
}

fun countVowelsConsonants(str: String) {
    val vowels = str.lowercase().count { it in "aeiou" }
    val consonants = str.lowercase().count { it in 'a'..'z' && it !in "aeiou" }
    println("Гласных: $vowels, Согласных: $consonants")
}

fun reverseWords(str: String): String {
    return str.split(" ").reversed().joinToString(" ")
}

fun isArmstrongNumber(number: Int): Boolean {
    val digits = number.toString().length
    var sum = 0
    var temp = number
    while (temp > 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(digits).toInt()
        temp /= 10
    }
    return sum == number
}

// Дополнительные функции
@Throws(Exception::class)
fun maxOfTwo(a: Int, b: Int): Int {
    if (a == b) throw Exception("Числа равны.")
    return maxOf(a, b)
}

@Throws(ArithmeticException::class)
fun divide(a: Double, b: Double): Double {
    if (b == 0.0) throw ArithmeticException("Деление на ноль недопустимо.")
    return a / b
}

@Throws(NumberFormatException::class)
fun convertStringToInt(str: String): Int {
    return str.toInt()
}

@Throws(IllegalArgumentException::class)
fun checkAge(age: Int) {
    if (age < 0 || age > 150) throw IllegalArgumentException("Недопустимый возраст.")
}

@Throws(IllegalArgumentException::class)
fun sqrt(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Корень из отрицательного числа не определен.")
    return kotlin.math.sqrt(number)
}

@Throws(Exception::class)
fun checkArrayForZeros(array: IntArray) {
    if (array.any { it == 0 }) throw Exception("Массив содержит нули.")
}

@Throws(Exception::class)
fun power(base: Double, exponent: Double): Double {
    if (exponent < 0) throw Exception("Отрицательная степень недопустима.")
    return base.pow(exponent)
}

@Throws(Exception::class)
fun truncateString(str: String, length: Int): String {
    if (length > str.length) throw Exception("Длина обрезки больше длины строки.")
    return str.substring(0, length)
}

@Throws(Exception::class)
fun findElementInArray(array: IntArray, element: Int): Int {
    return array.indexOf(element).takeIf { it != -1 } ?: throw Exception("Элемент не найден.")
}

@Throws(Exception::class)
fun toBinaryString(number: Int): String {
    if (number < 0) throw Exception("Отрицательное число недопустимо.")
    return Integer.toBinaryString(number)
}

@Throws(ArithmeticException::class)
fun isDivisible(a: Int, b: Int): Boolean {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо.")
    return a % b == 0
}

@Throws(IndexOutOfBoundsException::class)
fun <T> getElementFromList(list: List<T>, index: Int): T {
    if (index < 0 || index >= list.size) throw IndexOutOfBoundsException("Индекс выходит за пределы списка.")
    return list[index]
}

@Throws(Exception::class)
fun checkPasswordStrength(password: String) {
    if (password.length < 8) throw Exception("Слабый пароль.")
}

@Throws(DateTimeParseException::class)
fun checkDate(date: String) {
    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    LocalDate.parse(date, formatter)
}

@Throws(NullPointerException::class)
fun concatenateStrings(str1: String, str2: String): String {
    if (str1 == null || str2 == null) throw NullPointerException("Одна из строк равна null.")
    return str1 + str2
}

@Throws(ArithmeticException::class)
fun remainder(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо.")
    return a % b
}

@Throws(Exception::class)
fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) throw Exception("Температура ниже абсолютного нуля.")
    return celsius * 9 / 5 + 32
}

@Throws(Exception::class)
fun checkStringEmpty(str: String) {
    if (str.isNullOrEmpty()) throw Exception("Строка пустая или равна null.")
}



open class Person(var name: String, var age: Int, val gender: String) {
    fun printInfo() {
        println("Имя: $name, Возраст: $age, Пол: $gender")
    }

    fun increaseAge() {
        age++
    }

    fun changeName(newName: String) {
        name = newName
    }
}

open class Worker(name: String, age: Int, gender: String, val salary: Double) : Person(name, age, gender)

class Manager(name: String, age: Int, gender: String, salary: Double) : Worker(name, age, gender, salary) {
    val subordinates = mutableListOf<Worker>()
}

interface Animal {
    fun makeSound()
}

class Dog : Animal {
    override fun makeSound() {
        println("Гав!")
    }
}

class Cat : Animal {
    override fun makeSound() {
        println("Мяу!")
    }
}

class Cow : Animal {
    override fun makeSound() {
        println("Муу!")
    }
}

abstract class Transport {
    abstract fun move()
}

class Car : Transport() {
    override fun move() {
        println("Машина едет.")
    }
}

class Bike : Transport() {
    override fun move() {
        println("Велосипед едет.")
    }
}

class Book(val title: String, val author: String, val year: Int)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun findBooksByAuthor(author: String): List<Book> {
        return books.filter { it.author == author }
    }

    fun findBooksByYear(year: Int): List<Book> {
        return books.filter { it.year == year }
    }
}

class BankAccount(private val accountNumber: String, private var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount > balance) throw IllegalArgumentException("Недостаточно средств.")
        balance -= amount
    }

    fun getBalance(): Double {
        return balance
    }
}

class Counter {
    companion object {
        private var count = 0

        fun getCount(): Int {
            return count
        }
    }

    init {
        count++
    }
}

abstract class Shape {
    abstract fun getArea(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun getArea(): Double {
        return width * height
    }
}

open class AnimalMovement {
    open fun move() {
        println("Животное двигается.")
    }
}

open class Fish : AnimalMovement() {
    override fun move() {
        println("Рыба плавает.")
    }
}

open class Bird : AnimalMovement() {
    override fun move() {
        println("Птица летает.")
    }
}

open class DogMovement : AnimalMovement() {
    override fun move() {
        println("Собака бегает.")
    }
}

class Student(val name: String, val group: String, val grade: Double)

class University {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun sortByName(): List<Student> {
        return students.sortedBy { it.name }
    }

    fun filterByGrade(minGrade: Double): List<Student> {
        return students.filter { it.grade >= minGrade }
    }
}

class Product(val name: String, val price: Double, val quantity: Int)

class Store {
    private val products = mutableListOf<Product>()

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun removeProduct(name: String) {
        products.removeIf { it.name == name }
    }

    fun findProductByName(name: String): Product? {
        return products.find { it.name == name }
    }
}

interface PaymentSystem {
    fun pay(amount: Double)
    fun refund(amount: Double)
}

class CreditCard : PaymentSystem {
    override fun pay(amount: Double) {
        println("Оплачено $amount с помощью кредитной карты.")
    }

    override fun refund(amount: Double) {
        println("Возвращено $amount на кредитную карту.")
    }
}

class PayPal : PaymentSystem {
    override fun pay(amount: Double) {
        println("Оплачено $amount с помощью PayPal.")
    }

    override fun refund(amount: Double) {
        println("Возвращено $amount на PayPal.")
    }
}

class UniqueID {
    companion object {
        private var counter = 0
    }

    private val id: Int

    init {
        counter++
        id = counter
    }

    fun getId(): Int {
        return id
    }
}

class Point(val x: Int, val y: Int)

class RectangleShape(private val topLeft: Point, private val bottomRight: Point) {
    fun getArea(): Int {
        return (bottomRight.x - topLeft.x) * (bottomRight.y - topLeft.y)
    }
}

class ComplexNumber(val real: Double, val imaginary: Double) {
    fun add(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real + other.real, imaginary + other.imaginary)
    }

    fun subtract(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real - other.real, imaginary - other.imaginary)
    }

    fun multiply(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(
            real * other.real - imaginary * other.imaginary,
            real * other.imaginary + imaginary * other.real
        )
    }

    fun divide(other: ComplexNumber): ComplexNumber {
        val denominator = other.real * other.real + other.imaginary * other.imaginary
        return ComplexNumber(
            (real * other.real + imaginary * other.imaginary) / denominator,
            (imaginary * other.real - real * other.imaginary) / denominator
        )
    }
}

class Matrix(val data: Array<IntArray>) {
    fun add(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(data[0].size) }
        for (i in data.indices) {
            for (j in data[0].indices) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    fun multiply(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(other.data[0].size) }
        for (i in data.indices) {
            for (j in other.data[0].indices) {
                for (k in data[0].indices) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result)
    }
}

class Player(val name: String, var health: Int, val weapon: Weapon) {
    fun attack(enemy: Enemy) {
        enemy.takeDamage(weapon.damage)
    }
}

class Enemy(val name: String, var health: Int) {
    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) println("$name побежден.")
    }
}

class Weapon(val name: String, val damage: Int)

class Order(val id: Int, val customer: Customer, val products: List<Product>) {
    fun getTotalCost(): Double {
        return products.sumOf { it.price * it.quantity }
    }
}

class Customer(val name: String) {
    private val orders = mutableListOf<Order>()

    fun addOrder(order: Order) {
        orders.add(order)
    }

    fun showOrderHistory() {
        for (order in orders) {
            println("Заказ #${order.id}, Общая стоимость: ${order.getTotalCost()}")
        }
    }
}

open class Device(val brand: String) {
    fun turnOn() {
        println("$brand включен.")
    }

    fun turnOff() {
        println("$brand выключен.")
    }
}

class Smartphone(brand: String) : Device(brand) {
    fun takePhoto() {
        println("$brand сфотографировал.")
    }
}

class Laptop(brand: String) : Device(brand) {
    fun openBrowser() {
        println("$brand открыл браузер.")
    }
}

class TicTacToe {
    private val board = Array(3) { CharArray(3) { '-' } }
    var currentPlayer = 'X' // Сделаем свойство публичным

    init {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                board[i][j] = '-'
            }
        }
    }

    fun printBoard() {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                print("${board[i][j]} ")
            }
            println()
        }
    }

    fun makeMove(row: Int, col: Int): Boolean {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') return false
        board[row][col] = currentPlayer
        currentPlayer = if (currentPlayer == 'X') 'O' else 'X'
        return true
    }

    fun checkWin(): Boolean {
        for (i in 0 until 3) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true
        }
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true
        return false
    }

    fun isBoardFull(): Boolean {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (board[i][j] == '-') return false
            }
        }
        return true
    }
}