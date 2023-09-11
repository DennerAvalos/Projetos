numero = int(input('entre com um numero: '))
sequencia = input('entre com os caracteres: ')
contador = 0
if 'a' in sequencia and 'b' in sequencia:
    if sequencia[0] == len(sequencia): # Verifiquei se todos os caracteres são iguais.
        contador += 0
    else:
        for indice in range(numero - 1):
            if sequencia[indice] == 'a' and sequencia[indice + 1] == 'a': # verificar se tem duas letras iguais.
                contador += 1
            
            if sequencia[indice - 1] == 'a' and sequencia[indice] == 'a' and sequencia[indice + 1] == 'a':
                contador += 2
            
print (contador)


