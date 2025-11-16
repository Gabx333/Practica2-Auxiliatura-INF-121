class Calculadora:

    @staticmethod
    def sumar(a, b):
        return a + b

    @staticmethod
    def restar(a, b):
        return a - b

    @staticmethod
    def multiplicar(a, b):
        return a * b

    @staticmethod
    def dividir(a, b):
        try:
            print("División:", a / b)
        except ZeroDivisionError:
            print(f"La division {a} / {b} no se puede dividir.")

    @staticmethod
    def convertirANumero(valor):
        try:
            n = int(valor)
            print("Número convertido:", n)
        except ValueError:
            print(f"Error en conversión: El valor '{valor}' no es un número entero válido.")

print("Suma:", Calculadora.sumar(10, 5))
print("Resta:", Calculadora.restar(10, 5))
print("Multiplicación:", Calculadora.multiplicar(10, 5))

Calculadora.dividir(10, 2)
Calculadora.dividir(10, 0)

Calculadora.convertirANumero("123")
Calculadora.convertirANumero("abc")