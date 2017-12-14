/**
 * Created by X-MART on 7/6/2017.
 */
public class Application {
    public static void main(String[] args) {
        Composite racine=new Composite("racine");
        Composite composite2=new Composite("Composite 2");
        racine.add(composite2);
        racine.add(new Element("Elément 11"));
        racine.add(new Element("Elément 12"));
        racine.add(new Element("Elément 13"));
        composite2.add(new Element("Elément 21"));
        composite2.add(new Element("Elément 22"));
        racine.operation();
    }}
