import os
os.system("clear")

idade = int(input("Digite a sua idade: "))

if idade < 18:
    print("Menor idade")
else:
    print("Maior de idade")