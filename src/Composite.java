import java.util.ArrayList;
import java.util.List;

/**
 * Created by X-MART on 7/6/2017.
 */
public class Composite extends Composant{
    private ArrayList<Composant> composants=new ArrayList<Composant>();

    public Composite(String nom) {
        super(nom);
    }

    @Override
    public void operation() {
        String tab="";
        for (int i=0;i<niveau;i++) tab+="------";
        System.out.println(tab+" Composite "+ nom);
        for (Composant composant:composants){
            composant.operation();
        }
    }
    public void add(Composant composant){
        composant.niveau=this.niveau+1;
        composants.add(composant);
    }
    public void delete(Composant composant){
        composants.remove(composant);
    }
    public List<Composant> getChilds(){
        return composants;
    }
}
