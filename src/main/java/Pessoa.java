class Pessoa{
  Private String nome;
  Private Integer idade;
  Private String CPF;
  Private String telefone;
  Private String[] Endereco;
  Private String Profissao; 

  
  private void  Pessoa (String nome, Int idade, String CPF, String telefone, String[] Endereco, String profissao){
      this.nome = nome;
      this.idade = idade;
      this.telefone = telefone;
      this.Endereco = Endereco;
      this.profissao = Profissao;
      this.CPF = CPF;
  }
  private static boolean Hashcode(){ 
        return ;
  }
  private static getString(){
      return "Nome: " + nome + ", Idade: " + idade+ ", CPF: " + CPF + ", endereço(s)" + "" + ", Profissao:" + Profissao +", Telefone" + telefone;
  }
  private static string getnome(){
      return this.nome;
  }
  private static integer getidade(){
      return this.nome;
  }

  private static string gettelefone(){
      return this.telefone;
  }

  private static string[] getendereco(){
      return this.nome;
  }

  private static string getcpf(){
      return this.CPF;
  }

  private static string getprofissao(){
      return this.Profissao;
  }
  private Static Boolean Updatetelefone(String novotelefone){
    if(novotelefone.isString()){
      this.telefone = telefone;
      return true;
    }
    return false;
  }
  private Static Boolean UpdateEndereco(String[] novoEndereco){
    if(novonome.isNull()){
      this.Endereco = novoEndereco;
      return true;
    }
    return false;
  }
  private Static Boolean Updateidade(integer novaidade){
    if(novaidade> this.idade && novaidade<130){
      this.idade = novaidade;
      return true;
    }
    return false;
  }
  private Static Boolean UpdateProfissao(String novaprofissao){
    if(novaprofissao.isString()){
          this.Profissao = novaprofissao;
          return true;
    }
    return false;
  }
}
