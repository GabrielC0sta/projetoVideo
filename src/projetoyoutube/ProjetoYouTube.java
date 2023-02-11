
package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
    
        Video v[]= new Video[3];
        v[0]=new Video("como conectar ocontrole de xbox no ps4");
        v[1]=new Video("aula 12 de PHP");
        v[2]=new Video ("aula 10 de html5");
         
        Gafanhoto g[] =new Gafanhoto[2];
        g[0]=new Gafanhoto("julia",9,"M","juju");
        g[1]=new Gafanhoto("gabriel",18,"M","reddy");
        
        /*System.out.println(v[0]);
        System.out.println(g[0]);
    */
    Visualizacao vis[]=new Visualizacao[5];
           vis[0] =new Visualizacao(g[0],v[1]);
        System.out.println(vis[0].toString());
        vis[1]=new Visualizacao(g[0],v[2]);
        
        vis[1].avalir(87.0f);
        System.out.println(vis[1].toString());
    }
    
}
