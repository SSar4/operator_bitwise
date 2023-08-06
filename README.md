# operator_bitwise
algoritmo de sistema de permissão utilizando operador de bitwise ( | OR) para verificar as permissões de usuários
o intuito desse repositorio é mostra como se trabalha com bits em js

importante compreender a lógica por trás da representação binária das permissões
1. Cada permissão é representada por um número que é uma potência de 2
2. Cada permissão tem um valor único que é uma potência de 2 (2^0 = `1`, 2^1 = `1`, 2^2 = `4`, 2^3 = `8`, 2^4 = `16`, 2^5 = `32`). Isso permite que as permissões sejam combinadas usando operações bitwise.
3. Ao somar o número de cada permissão, cria-se uma permissão composta
4. Ao subtrair o valor da permissão que se quer excluir cria-se uma nova permissão


# executar no navegador

## navagador
1.  Pressione a tecla `F12` ou `Ctrl + Shift + J` (no Windows/Linux) ou `Cmd + Option + J` (no Mac) ou btn direito e `inspecionar elemnto` para abrir o console do desenvolvedor.
2.  digite o codigo js desse repositorio

# Pre-requisitos
1. ter qualquer runtime que execute script js fora do navagador (node) instalado
## node
1. `Run` node bitWise.js

<br/>
<br/>


## Tabela verdade
![image](https://github.com/SSar4/operator_bitwise/assets/33840492/d9bd78f2-b0c3-4535-8cf0-839ab3abfb82)
![image](https://github.com/SSar4/operator_bitwise/assets/33840492/0e3d4562-44da-4d4f-ab78-49a232d47dd9)

