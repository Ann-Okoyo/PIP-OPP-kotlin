fun main() {
   var human =Human("Ann",20,54.00)
    human.eat(3)

    var weight=human.weight
    println(weight)

    human.speak("I am happy.")
    human.birthday()
    var  age =human.age
    println(age)


    var girl=Girl("Ann","female","black",168.0,54)
    girl.rest()
    girl .identity()


    var rectangle= Rectangle(56,71)
    rectangle.area()

    var creature=Creature("Ann",21)
    creature.speak()

    var vehicle=Vehicle("Porsche","Cayenne",2023)
    vehicle.start()


    var animal=Animal("Panthera leo","roar")
    animal.makeSound()

    var man =Man("Ann",20)
    man.Introduce()


    var child=Child("Jeff",16)
    child.school()


    var calculator=Calculator(20,2)

    calculator.addition()
    var x=calculator.numbers
    println(x)

    calculator.subtraction()
    var y =calculator.numbers
    println(y)

    calculator.multiply()
    var z =calculator.numbers
    println(z)

    calculator.division()
    var a =calculator.numbers
    println(a)





}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food.")
        weight+=foodweight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }
}
//create a class called Human with the properties name gender color
//height and weight. i) create two functions one called rest and the other
//one identitiy. function rest prints out "sleep eight hours and  am female and
//my name is Phelisia."
class Girl(var name:String,var gender:String,var color:String,var height:Double,var weight:Int){

fun rest(){
    println("sleep eight hours ")

}
fun identity() {
    print("Im female and my name is Ann Muyale.")
}

}
//Create a class called Person with properties name and age.
//Write a method to print out the person's name and age in Kotlin.
//class Person(var name:String,var age:Int){
//    fun
//}

//Create a class called Rectangle with properties width and height.
//Write a method to calculate the area of the rectangle in Kotlin.

class Rectangle(var width:Int,var height:Int){
    fun area(){
      println(width*height)

    }
}

//Create a class called Person with properties for name and age.
//Write a method called speak that prints "Hello, my name is {name} and I am {age} years old."
class Creature(var name:String,var age: Int){
    fun speak(){
        println("Hello,my name is $name and I am $age years old. ")
    }
}

//Create a class called Vehicle with properties for make, model, and year.
//Write a method called start that prints "The {make} {model} is starting up."
class Vehicle(var make:String, var model:String,var year:Int){
    fun start(){
        println("The $make $model is starting up.")
    }
}

//Create a class called Animal with properties for species and sound.
//Write a method called makeSound that prints "{species} says {sound}."
class Animal(var species:String,var sound:String){

    fun makeSound(){
        println("$species says $sound.")
    }
}
//Create a class called Person with properties for name and age.
//Write a method called introduce that prints "Hi, my name is {name}
//and I am {age} years old."
class Man(var name:String,var age:Int){
    fun Introduce(){
        println("Hi ,my name is $name and I am $age years old.")
    }
}
//Create a class called Farm with a property for a list of Animal objects.
//Write a method called makeSounds that calls the makeSound method on each animal
//in the list.
class Farm(var name1:String,var name2:String,var name3:String,var name4:String){
    fun makeSound(){



    }
}
//Create a class called Person with properties for name and age.
//Write a method called introduce that prints "Hi, my name is {name}
//and I am {age} years old."
class Child(var name:String ,var age:Int){
    fun school(){
        println("My name is $name and I am $age years old.")
    }


}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class Calculator(var numbers:Int,var digit:Int){
    fun addition(){
        numbers+=digit


    }
    fun subtraction(){
        numbers-=digit
    }
    fun division(){
        numbers/=digit
    }
    fun multiply(){
        numbers*=digit
    }
}




















