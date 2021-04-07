package ordenacaoefiltrosemjava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UniformesDeFinalDeAno {
    
  private String nome;
  private String tamanhoUniforme;
  private String corUniforme;
  
     public String getCorUniforme() {
        return corUniforme;
    }

    public void setCorUniforme(String corUniforme) {
        this.corUniforme = corUniforme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanhoUniforme() {
        return tamanhoUniforme;
    }

    public void setTamanhoUniforme(String tamanhoUniforme) {
        this.tamanhoUniforme = tamanhoUniforme;
    }


    public UniformesDeFinalDeAno(String nome, String tamanhoUniforme, String corUniforme) {
        this.nome = nome;
        this.tamanhoUniforme = tamanhoUniforme;
        this.corUniforme = corUniforme;
    }
  
  public void imprimirInformacoesEstudantes() {
      System.out.println(this.corUniforme + " " + tamanhoUniforme + " " + nome);
  }
  
  public static void main(String[] args) throws IOException {  
      
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt(); 
    scanner.nextLine();
    ArrayList<UniformesDeFinalDeAno> arrayUniformes= new ArrayList<>(N);
    String corUniforme, tamanhoUniforme, nome, detalhesUniforme;

    for(int i = 0; i < N; i++) {  
      nome = scanner.nextLine(); 
      detalhesUniforme = scanner.nextLine();  
      corUniforme = detalhesUniforme.split(" ")[0];
      tamanhoUniforme= detalhesUniforme.split(" ")[1];
      arrayUniformes.add(new UniformesDeFinalDeAno(nome, corUniforme, tamanhoUniforme));
    }

    scanner.close();
    
    Collections.sort(arrayUniformes, new ComparatorUniforme());

    arrayUniformes.forEach((item) -> {
        item.imprimirInformacoesEstudantes();
      });
  }

  static class ComparatorUniforme implements Comparator<UniformesDeFinalDeAno> {  
    
    @Override
    public int compare(UniformesDeFinalDeAno aluno0, UniformesDeFinalDeAno aluno1) {  
      
      int res = aluno0.corUniforme.compareTo(aluno1.corUniforme);
    
      if(res == 0) {
          res = aluno0.tamanhoUniforme.compareTo(aluno1.tamanhoUniforme);
          
      if(res == 0) {  
          res = aluno0.nome.compareTo(aluno1.nome);
      } else {
          res = -res;
        }
      }
      return res;
    }
  }
}

//import java.io.IOException;
//import java.util.*;
//
//public class UniformesDeFinalDeAno 
//{  
//  private String name;
//  private String uniformSize;
//  private String uniformColor;
//
//  public String getUniformColor() 
//  {  
//    return this.uniformColor;  
//  }
//
//  public void setUniformColor(String uniformColor) 
//  {  
//    this.uniformColor = uniformColor;
//  }
//
//  public String getName() 
//  {  
//    return this.name;
//  }
//
//  public void setName(String name) 
//  {
//    this.name = name;
//  }
//
//  public String getUniformSize() 
//  {
//    return this.uniformSize;
//  }
//
//  public void setUniformSize(String uniformSize) 
//  {
//    this.uniformSize = uniformSize;
//  }
//
//  public UniformesDeFinalDeAno(String name, String uniformColor, String uniformSize) 
//  {
//    this.name = name;
//    this.uniformColor = uniformColor;
//    this.uniformSize = uniformSize;
//  }
//
//  public void printStudentInfos() 
//  {
//      System.out.println(this.uniformColor + " " + uniformSize + " " + name);
//  }
//  
//  public static void main(String[] args) throws IOException 
//  {  
//    Scanner scanner = new Scanner(System.in);
//    int N = scanner.nextInt(); 
//    scanner.nextLine();
//    ArrayList<UniformesDeFinalDeAno> arrayUniforms= new ArrayList<>(N);
//    String name, uniformDetails, uniformColor, uniformSize;
//
//    for(int i = 0; i < N; i++) 
//    {  
//      name = scanner.nextLine(); 
//      uniformDetails = scanner.nextLine();  
//      uniformColor = uniformDetails.split(" ")[0];
//      uniformSize= uniformDetails.split(" ")[1];
//      arrayUniforms.add(new UniformesDeFinalDeAno(name, uniformColor, uniformSize));
//    }
//
//    scanner.close();
//    Collections.sort(arrayUniforms, new UniformComparator());
//
//    for(var item : arrayUniforms) 
//    {  
//      item.printStudentInfos(); 
//    }
//  }
//
//  static class UniformComparator implements Comparator<UniformesDeFinalDeAno> 
//  {  
//    @Override
//    public int compare(UniformesDeFinalDeAno student0, UniformesDeFinalDeAno student1) 
//    {  
//      int res = student0.uniformColor.compareTo(student1.uniformColor);
//    
//      if(res == 0) 
//      {
//        res = student0.uniformSize.compareTo(student1.uniformSize);
//        
//        if(res == 0) 
//        {  
//          res = student0.name.compareTo(student1.name);
//        } else {
//          res = -res;
//        }
//      }
//      return res;
//    }
//  }
//}
//
