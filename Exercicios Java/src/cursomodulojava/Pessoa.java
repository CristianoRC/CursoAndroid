package cursomodulojava;

public class Pessoa
{

    private String nome;
    private String sobrenome;
    private int idade;

    public void SetNome(String p_nome)
    {
        nome = p_nome;
    }

    public void SetSobrenome(String p_sobrenome)
    {
        sobrenome = p_sobrenome;
    }

    public void SetIdade(int p_idade)
    {
        idade = p_idade;
    }

    public String GetNome()
    {
        return nome;
    }

    public String GetSobrenome()
    {
        return sobrenome;
    }

    public int GetIdade()
    {
        return idade;
    }
    
    public String toString()
    {
        String Saida = "Nome: "+ nome + " " + sobrenome +" / " +idade +" anos";
        
        return Saida;
    }
}
