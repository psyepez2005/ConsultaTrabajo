// ---------------Funciones con nombre-----------------
def factorialConNombre(n: Int): Int = (1 to n).product
val respuesta1=factorialConNombre(3)


// ---------------Funciones SIN nombre-----------------
val factorialSinNombre = (n:Int) => (1 to n).product
val respuesta2= factorialSinNombre(3)


def f1(n: Int):Int = n*2
val v1 = (n: Int) => n*2


def f2(n: Int):Int = n*n
val v2 = (n: Int) => n*n


def f3(n: Int):Int = (1 to n).sum
val v3 = (n: Int) => (1 to n).sum


val lista = (1 to 10)
lista.filter(_%2==0)