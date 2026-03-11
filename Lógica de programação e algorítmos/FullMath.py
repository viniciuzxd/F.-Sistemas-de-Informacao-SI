# Calculos
# Var
Num1 = float(input('Digite o primeiro valor:'))
Num2 = float(input('Digite o segundo valor:'))
# Início
soma = Num1 + Num2
sub = Num1 - Num2
mult = Num1 * Num2
if Num2 != 0:
    div = Num1 / Num2
else:
    div = "Não é possível dividir por 0"
print('O resultados são:\n Soma: {}\n Subtração: {}\n Multiplicação: {}\n Divisão: {}'.format(soma, sub, mult, div))