public class Website {
    private int index;
    private String[] usernames;
    private String[] passwords;

    public Website(){
        this.index = 0;
        this.usernames = new String[99];
        this.passwords = new String[99];
    }
    public Account makeAccount(String username, String password) {
        for (int i = 0; i < this.index; i++) {
            if (this.usernames[i].equals(username)) {
                System.out.println("Mohon maaf username telah digunakan!");
                return null;
            }
        }
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(encrypt(password));
        this.usernames[this.index] = username;
        this.passwords[this.index] = encrypt(password);
        this.index++;
        System.out.println("Akun berhasil ditambahkan!");
        return account;
    }

    public void login(String username, String passwords) {
        for (int i = 0; i < this.index; i++) {
            if (this.usernames[i].equals(username) && this.passwords[i].equals(encrypt(passwords))) {
                System.out.println("Login berhasil!");
                return;
            }
        }
        System.out.println("Akun tidak ditemukan!");
    }

    private String encrypt(String password) {
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + 6);
        }
        return new String(chars);
    }
}
