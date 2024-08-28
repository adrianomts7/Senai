import os
os.system("cls")

soma = 0
media = 0
produto = 1.0

primeiroNumero =  float(input("Digite um número: "))
segundoNumero = float(input("Digite outro número: "))


maiorNumero = max(primeiroNumero, segundoNumero)
menorNumero = min(primeiroNumero, segundoNumero)

soma = primeiroNumero + segundoNumero
produto = primeiroNumero * segundoNumero
media = soma / 2

print(f"Soma: {soma:.2f}")
print(f"Produto: {produto:.2f}")
print(f"Média: {media:.2f}")
print(f"Maior Número: {maiorNumero}")
print(f"Menor Número: {menorNumero}")
