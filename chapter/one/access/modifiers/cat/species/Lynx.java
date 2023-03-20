package OCP.chapter.one.access.modifiers.cat.species;

import OCP.chapter.one.access.modifiers.cat.BigCat;

public class Lynx extends BigCat {


    public static void main(String[] args ) {

        BigCat cat = new BigCat();
        System.out.println(cat.name);

        //can access protected member through inheritance
        Lynx lynxCat = new Lynx();
        System.out.println(lynxCat.name);
        System.out.println(lynxCat.hasFur);

        /*BigCat obj1 = new Lynx();
        System.out.println(obj1.name);*/


    }
}
