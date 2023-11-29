public class Student {
    public String nome;

    public String cognome;

    public int id;

    public Student(String nome, String cognome, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.cognome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return " Nome: " + nome + " Cognome: " + cognome + " id: " + id;
    }
}


