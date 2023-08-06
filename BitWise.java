// Classe para representar informações de usuário
class Usuario {
    private String username;
    private String pass;
    private int permission;

    // Construtor
    public Usuario(String username, String pass, int permission) {
        this.username = username;
        this.pass = pass;
        this.permission = permission;
    }

    // Getters para obter as informações do usuário
    public String getUser() {
        return username;
    }

    public int getPermission() {
        return permission;
    }

    public String getPass() {
        pass = null;
        return pass;
    }
}

// Classe contendo o método findOneUser() para buscar usuário no banco de dados
public class BitWise {
    public static final int PERMISSION_READ = (int) Math.pow(2, 0);
    public static final int PERMISSION_WRITE = (int) Math.pow(2, 1);
    public static final int PERMISSION_DELETE = (int) Math.pow(2, 2);
    public static final int PERMISSION_UPDATE = (int) Math.pow(2, 3);
    public static final int PERMISSION_EXPORT = (int) Math.pow(2, 4);
    public static final int PERMISSION_ADMIN = (int) Math.pow(2, 5);
    
    public static boolean hasPermission(int userPermissions, int requiredPermission){
        return (userPermissions & requiredPermission) != 0;
    }

    public static Usuario findOneUser(String user, String pass) {
        if (user.equals("admin") && pass.equals("admin")) {
            return new Usuario("admin", "admin", PERMISSION_READ+ PERMISSION_WRITE + PERMISSION_DELETE + PERMISSION_UPDATE + PERMISSION_EXPORT + PERMISSION_ADMIN);
        } else if (user.equals("user1") && pass.equals("user1")) {
            return new Usuario("user1", "user1", PERMISSION_READ+ PERMISSION_WRITE);
        }
        return null;
    }
    public static void main(String[] args) {
      
        Usuario user = findOneUser("admin", "admin");

        if (user == null) {
            System.out.println("Usuário não encontrado:");
        } else {
            String result = hasPermission(user.getPermission(), 32) ? user.getUser()+" é um adm" : user.getUser()+" NÃO é um admin";
            System.out.println(result);

            if (hasPermission(user.getPermission(), PERMISSION_READ))
                System.out.println("tem permissão de leitura");
            if (hasPermission(user.getPermission(), PERMISSION_WRITE))
                System.out.println("tem permissão de escrita");
            if (hasPermission(user.getPermission(), PERMISSION_DELETE))
                System.out.println("tem permissão de deleção");
            if (hasPermission(user.getPermission(), PERMISSION_UPDATE))
                System.out.println("tem permissão de atualização");
            if (hasPermission(user.getPermission(), PERMISSION_EXPORT))
                System.out.println("tem permissão de exportar");
        }

    }
}
