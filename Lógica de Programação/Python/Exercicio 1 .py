import time
import os

os.system("clear")

media = 0.0
soma = 0.0

nome = input("Digite o seu nome: ")
idade = input("Digite a sua idade: ")

for i in range(2):
    notas = input(f"Digite a {i + 1}ª Nota: ")

    numeroValidos = None

    try:
        notas = float(notas)
        idade = int(idade)
        soma += notas
        numeroValidos = True
    except ValueError:
        numeroValidos = False
        break
    
media = soma / 2

os.system("clear")

if numeroValidos == True:
    print(f"Nome: {nome}")
    print(f"idade: {idade}")
    for i in range(2):
        print(f"{i + 1}ª Nota: {notas:.2f}")
    print(f"Media: {media:.1f}")

else:
    print("Digite uma idade valida ou uma Nota valida!")