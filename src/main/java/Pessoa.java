Class Pessoa{
  Private String nome;
  Private Integer idade;
  Private String CPF;
  Private String telefone;
  Private String[] Endereco;
  Private String Profissao; 

  
  Private void  Pessoa (String nome, Int idade, String CPF, String telefone, String[] Endereco, String profissao){
      this.nome = nome;
      this.idade = idade;
      this.telefone = telefone;
      this.Endereco = Endereco;
      this.profissao = Profissao;
      this.CPF = CPF;
  }
  Private static boolean Hashcode(){ 
        return ;
  }
  Private static getString(){
      return "Nome: " + nome + ", Idade: " + idade+ ", CPF: " + CPF + ", endereço(s)" + "" + ", Profissao:" + Profissao +", Telefone" + telefone;
  }
  Private static string getnome(){
      return this.nome;
  }
  Private static integer getidade(){
      return this.nome;
  }

  Private static string gettelefone(){
      return this.telefone;
  }

  Private static string[] getendereco(){
      return this.nome;
  }

  Private static string getcpf(){
      return this.CPF;
  }

  Private static string getprofissao(){
      return this.Profissao;
  }
  Private Static Boolean Updatetelefone(String novotelefone){
    if(novotelefone.isString()){
      this.telefone = telefone;
      return true;
    }
    return false;
  }
  Private Static Boolean UpdateEndereco(String[] novoEndereco){
    if(novonome.isNull()){
      this.Endereco = novoEndereco;
      return true;
    }
    return false;
  }
  Private Static Boolean Updateidade(integer novaidade){
    if(novaidade> this.idade && novaidade<130){
      this.idade = novaidade;
      return true;
    }
    return false;
  }
  Private Static Boolean UpdateProfissao(String novaprofissao){
    if(novaprofissao.isString()){
          this.Profissao = novaprofissao;
          return true;
    }
    return false;
  }
}
