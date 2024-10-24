package nasted_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math m = new Math();
        m.getResult();
    }
}

class Math{
    public void getResult(){
        class Delenie{
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }

        }
        Delenie d = new Delenie();
        d.setDelimoe(21);
        d.setDelitel(4);
        System.out.println("Delimoe = " + d.getDelimoe());
        System.out.println("Dekitel = " + d.getDelitel());
        System.out.println("Chastnoe = " + d.getChastnoe());
        System.out.println("Ostatok = " + d.getOstatok());
    }
}
