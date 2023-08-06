// Definindo as permissões
const PERMISSION_READ = 1;
const PERMISSION_WRITE = 2;
const PERMISSION_DELETE = 4;
const PERMISSION_UPDATE = 8;
const PERMISSION_EXPORT = 16;
const PERMISSION_ADMIN = 32;

//Função que simula buscar no banco de dado as permissoes do usuario
function FindOneUser(user, pass) {
    if (user === "admin" && pass === "admin") return { user: "admin", permission: 63 };
    else if (user === "usuario1" && pass === "senha123") return { user: "usuario1", permission: 3 };
    else if (user === "usuario2" && pass === "senha123") return { user: "usuario2", permission: 15 };
    else return false;
};

// Função para verificar se o usuário tem permissão
function hasPermission(userPermissions, requiredPermission) {
    return (userPermissions & requiredPermission) !== 0;
};

// Função para autenticar o usuário e verificar permissões
function authenticateUser(username, pass) {
    // Neste exemplo, estamos apenas verificando se o usuário existe na base de dados
    const userExists = FindOneUser(username, pass);

    if (userExists) {
        // Simulando recuperação das permissões do usuário do banco de dados
        
        const userPermissions = userExists.permission;

        hasPermission(userPermissions, PERMISSION_ADMIN) ? console.log(`${username} é um administrador.`) : console.log(`${username} não é um administrador.`);
        
        hasPermission(userPermissions, PERMISSION_READ) && console.log(`tem permissão de leitura`);
        hasPermission(userPermissions, PERMISSION_WRITE) && console.log(`tem permissão de escrita`);
        hasPermission(userPermissions, PERMISSION_DELETE) && console.log(`tem permissão de deletar`);
        hasPermission(userPermissions, PERMISSION_UPDATE) && console.log(`tem permissão de atualizar`);
        hasPermission(userPermissions, PERMISSION_EXPORT) && console.log(`tem permissão de exportar`);
    } else {
        console.log(`Usuário ${username} não encontrado.`);
    };
};

// Autenticar e verificar permissões para um usuário
authenticateUser("usuario1", "senha123");
console.log('\n');
authenticateUser("usuario2", "senha123");
console.log('\n');
authenticateUser("admin", "admin");