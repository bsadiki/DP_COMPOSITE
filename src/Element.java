/**
 * Created by X-MART on 7/6/2017.
 */
public class Element extends Composant {

    public Element(String nom) {
        super(nom);
    }

    @Override
    public void operation() {
        String tab="";
        for (int i=0;i<niveau;i++) tab+="------";
        System.out.println(tab + " Element " + nom);
    }
}
