# modelo de permissões binárias
O intuito desse repositorio é representar o gerenciaento de permissões em sistemas de software usando uma logica binária, para assim poder  combinar várias permissões e usar operações de bits.

### Por exemplo, se um usuário possui as permissões de leitura e escrita, você pode representá-las combinando as constantes:
const userPermissions = PERMISSION_READ | PERMISSION_WRITE; // Equivalente a 3 (valor binário: 00011)


Da mesma forma, para verificar se um usuário possui uma permissão específica, você pode usar a operação AND `&`:
`const hasReadPermission = (userPermissions & PERMISSION_READ) === PERMISSION_READ;`

Essa forma de representação de permissões usando bits é eficiente em termos de espaço de armazenamento e também permite realizar verificações rápidas de permissões com operações simples de bits.


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

